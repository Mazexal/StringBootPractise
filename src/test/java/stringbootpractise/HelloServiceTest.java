package stringbootpractise;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;
import stringbootpractise.junit.HelloService;

import javax.annotation.Resource;

/**
 * Created by 10235 on 2017/8/6.
 */
@WebAppConfiguration
public class HelloServiceTest {
    @Resource
    private HelloService helloService;

    @Test
    public void testGetName() {
        Assert.assertEquals("hello", helloService.getName());
    }

}
