package Basics.B0003_Exception;

import org.junit.Test;

public class ExceptionTest {
    public int sum(int a, int b) throws XCException2 {
        if (a < 0 || b < 0) {
            throw new XCException2(XCCodeEunm.PARAM_ERROR);
        }
        return a + b;
    }

    @Test
    public void testSum() {
        try {
            System.out.println(sum(-1, 2));
        } catch (XCException2 e) {
            System.out.println(e.getErrorCode() + ":" + e.getErrorMessage());
        }
    }
}
