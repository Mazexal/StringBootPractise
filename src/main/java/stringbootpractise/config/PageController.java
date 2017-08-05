package stringbootpractise.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

/**
 * Created by 10235 on 2017/8/4.
 */
@Controller
public class PageController implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
        String s = environment.getProperty("JAVA_HOME");
        System.out.println(s);
    }
}
