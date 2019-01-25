package com.greedystar.springbootdemo.modules.role.web;

import com.greedystar.springbootdemo.modules.role.entity.Role;
import com.greedystar.springbootdemo.modules.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Author GreedyStar
 * Date  2019-01-25
 */
@RestController
@RequestMapping(value = "/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
    public Object list() {
        List<Role> roles = roleService.findAllList();
        return roles;
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Role role = roleService.get(id);
        return role;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody Role role) {
        if (roleService.insert(role) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Role> roles) {
        if (roleService.insertBatch(roles) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestBody Role role) {
        if (roleService.update(role) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody Role role) {
        if (roleService.delete(role) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

}
