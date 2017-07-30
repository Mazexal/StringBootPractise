package stringbootpractise;

import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.stream.StreamSupport;

/**
 * Created by 10235 on 2017/7/30.
 */
public class GolbalDefultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public  void defultExceptionHandler(HttpServletRequest req,Exception ex){
        ex.printStackTrace();
        System.out.println("GlobalDefultExceptionHandler.defultExceptionHandler()");
    }

}
