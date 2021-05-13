package com.hongzhang.da.controller.system;

import com.hongzhang.da.model.SysUser;
import com.hongzhang.da.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xiang Hongzhang
 * @date 2021/05/13
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/findAll")
    public List<SysUser> findAll(){
        return sysUserService.findAll();
    }
}
