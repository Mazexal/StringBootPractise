package stringbootpractise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.PortUnreachableException;
import java.util.Map;

/**
 * Created by 10235 on 2017/8/2.
 */
@Controller
public class TemplateController {
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String, Object> map) {
        return "/helloHtml";
    }

}
