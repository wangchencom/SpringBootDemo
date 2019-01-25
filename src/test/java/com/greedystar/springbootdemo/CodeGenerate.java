package com.greedystar.springbootdemo;

import com.greedystar.generator.invoker.SingleInvoker;
import com.greedystar.generator.invoker.base.Invoker;

/**
 * Author GreedyStar
 * Date   2019/1/25
 */
public class CodeGenerate {

    public static void main(String[] args) throws Exception {
        Invoker invoker = new SingleInvoker.Builder()
                .setTableName("role")
                .setClassName("Role")
                .build();
        invoker.execute();
    }

}
