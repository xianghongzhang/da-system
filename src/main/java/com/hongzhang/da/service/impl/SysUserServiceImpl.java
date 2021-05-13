package com.hongzhang.da.service.impl;

import com.hongzhang.da.dao.SysUserMapper;
import com.hongzhang.da.model.SysUser;
import com.hongzhang.da.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Xiang Hongzhang
 * @date 2021/05/13
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
