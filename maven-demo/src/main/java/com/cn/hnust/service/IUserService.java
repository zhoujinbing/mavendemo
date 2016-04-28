package com.cn.hnust.service;

import com.cn.hnust.pojo.User;

public interface IUserService
{
    /**
     * 根据用户编号获取用户信息
     * <功能详细描述>
     * @param userId
     * @return [参数说明]
     * 
     * @return User [返回类型说明]
     * @exception throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public User getUserById(int userId);
}
