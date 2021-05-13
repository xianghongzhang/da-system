package com.hongzhang.da.dao;

import com.hongzhang.da.model.SysUser;

import java.math.BigInteger;
import java.util.List;

/**
 * @author Xiang Hongzhang
 * @date 2021/05/13
 */
public interface SysUserMapper {
    /**
     * 创建用户信息
     * @param record 用户
     * @return int
     */
    int insert(SysUser record);

    /**
     * 根据主键ID查询用户信息
     * @param userId 主键ID
     * @return 用户信息
     */
    SysUser selectByPrimaryKey(Long userId);

    void deleteByPrimaryKey(Long userId);


    /**
     * 查询全部用户信息
     * @return 用户信息集合
     */
    List<SysUser> findAll();

}