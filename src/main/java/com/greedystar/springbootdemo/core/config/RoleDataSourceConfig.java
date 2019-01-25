package com.greedystar.springbootdemo.core.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Author GreedyStar
 * Date   2019/1/25
 */
@Configuration
@MapperScan(basePackages = "com.greedystar.springbootdemo.modules.role.dao", sqlSessionTemplateRef = "roleSqlSessionTemplate")
public class RoleDataSourceConfig {

    @Bean(name = "roleDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.role")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

    @Bean(name = "roleSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("roleDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/role/*Mapper.xml"));
        return bean.getObject();
    }

    @Bean(name = "roleTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("roleDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "roleSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("roleSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
