package com.hongzhang.da.service;


import com.hongzhang.da.model.SysUser;

import java.util.List;

/**
 * @author Xiang Hongzhang
 * @date 2021/05/13
 */
public interface SysUserService {
    /**
     * 查询全部用户信息
     * @return 用户信息集合
     */
    List<SysUser> findAll();
}
