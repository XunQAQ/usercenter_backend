package com.watson.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * User registration request body
 *
 * @author Watson
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}
