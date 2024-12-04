package Basics.B0003_Exception;

public enum XCCodeEunm implements ErrorCode {
    NOT_FOUND_PAGE("404", "页面不存在"),
    NOT_FOUND_RESOURCE("888", "资源不存在"),
    SYSTEM_ERROR("999", "系统错误"),
    PARAM_ERROR("100", "参数错误"),
    USER_NOT_LOGIN("101", "用户未登录"),
    USER_NOT_EXIST("102", "用户不存在"),
    ;

    private final String errorCode;
    private final String errorMessage;

    XCCodeEunm(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }


    @Override
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
