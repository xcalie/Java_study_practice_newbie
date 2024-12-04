package Basics.B0001_UnitTestAndMainFunction;

import org.junit.Assert;
import org.junit.Test;
import Newbie.N0007_lombok.Person;

public class JunitTest {

    @Test
    public void CalcTest()
    {
        Person person = new Person(1, "张三");
        person.print();


        //Asset断言
        Assert.assertEquals(1, person.getId());

    }
}
