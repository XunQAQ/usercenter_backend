package com.watson.usercenter.service;

import com.watson.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
 *
 * @author Watson
 */
public interface UserService extends IService<User> {

    /**
     * User registration
     *
     * @param userAccount user account
     * @param userPassword User password
     * @param checkPassword checkPassword
     * @param planetCode planet number
     * @return new user id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * User Login
     *
     * @param userAccount user account
     * @param userPassword user password
     * @param request
     * @return desensitized user information
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * User desensitization
     *
     *@param originUser
     *@return
     */
    User getSafetyUser(User originUser);

    /**
     * User logout
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
