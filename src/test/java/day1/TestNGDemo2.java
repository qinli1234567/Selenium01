package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo2 {
    //校验a==a；
    @Test
    public void assertEqualTest(){ //相似的 还有assertNotEqualTest
        String a = "Li";
        String b = "L";
        Assert.assertEquals(a,b,"a不等于b");// 后面不要跟任何操作 不会执行的 重新再写一个case
    }
    //
    @Test
    public void asserNullTest(){ //相似的 还有asserNotNullTest
        String a = "nu";
        Assert.assertNull(a);
    }
}
