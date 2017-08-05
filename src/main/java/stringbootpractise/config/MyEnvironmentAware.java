package stringbootpractise.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * Created by 10235 on 2017/8/4.
 */
public class MyEnvironmentAware implements EnvironmentAware {
    @Value("${spring.datasource.url}")
    private String myUrl;

    @Override
    public void setEnvironment(Environment environment) {
        //打印注入的属性信息.
        System.out.println("myUrl="+myUrl);

        //通过 environment 获取到系统属性.
        System.out.println(environment.getProperty("JAVA_HOME"));

        //通过 environment 同样能获取到application.properties配置的属性.
        System.out.println(environment.getProperty("spring.datasource.url"));

        RelaxedPropertyResolver relaxedPropertyResolver = new RelaxedPropertyResolver(environment,
                "spring.datasource.");
        System.out.println("spring.datasource.url="+relaxedPropertyResolver.getProperty("url"));
    }
}
