package Basics.B0003_Exception;

public class XCException2 extends Exception {

    private ErrorCode errorCode;

    public XCException2(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode.getErrorCode();
    }

    public String getErrorMessage() {
        return errorCode.getErrorMessage();
    }
}
