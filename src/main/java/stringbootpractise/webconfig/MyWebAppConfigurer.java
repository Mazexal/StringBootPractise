package stringbootpractise.webconfig;

import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by 10235 on 2017/7/31.
 */
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");

        //registry.addResourceHandler("/api_files/**").addResourceLocations("file:D:/data/api_files");
        super.addResourceHandlers(registry);
    }

}
