package Basics.B0003_Exception;

/**
 * @author XC
 * @date 2019/12/3
 * @implNote
 *   错误码接口
 *
 *   错误码由业务方定义，建议使用4位数字，如：0001、0002、0003等。
 *   错误码和错误信息应该对应，错误码应该唯一，错误信息应该描述清楚错误原因，
 *   并且尽可能详细，便于排查问题。
 *   错误码和错误信息应该在项目启动时加载到内存中，避免在运行时动态获取。
 *
 */
public interface ErrorCode {

    /**
     * 获取错误码
     * @return
     */
    String getErrorCode();

    /**
     * 获取错误信息
     * @return
     */
    String getErrorMessage();
}
