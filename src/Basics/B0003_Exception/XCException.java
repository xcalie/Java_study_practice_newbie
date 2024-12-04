package Basics.B0003_Exception;

public class XCException extends Exception{

    // 无参构造,用于创建一个XCException对象
    public XCException() {
    }

    // 有参构造,用于创建一个XCException对象,并指定错误信息
    public XCException(String message) {
        super(message);
    }

    // 有参构造,用于创建一个XCException对象,并指定错误信息和原因
    public XCException(String message, Throwable cause) {
        super(message, cause);
    }

    // 有参构造,用于创建一个XCException对象,并指定原因
    public XCException(Throwable cause) {
        super(cause);
    }

    // 有参构造,用于创建一个XCException对象,并指定错误信息和原因,是否启用错误堆栈跟踪等
    public XCException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "XCException{" + "message=" + getMessage() + '}';
    }


}
