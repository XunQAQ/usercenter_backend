package com.watson.usercenter.common;

/**
 * Error code
 *
 * @author Watson
 */
public enum ErrorCode {

    SUCCESS(0, "ok", ""),
    PARAMS_ERROR(40000, "Request parameter error", ""),
    NULL_ERROR(40001, "Request data is empty", ""),
    NOT_LOGIN(40100, "Not logged in", ""),
    NO_AUTH(40101, "No permission", ""),
    SYSTEM_ERROR(50000,  "System internal exception", "");

    private final int code;

    /**
     * Status code information
     */
    private final String message;

    /**
     * Status code description (details)
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
