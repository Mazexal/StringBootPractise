package stringbootpractise.controller;

import org.springframework.web.bind.annotation.*;
import stringbootpractise.models.UserModel;

/**
 * Created by Mazexal on 2017/7/26.
 */
@RestController
public class HelloWordController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/getUser")
    public UserModel getUser(){
        UserModel userModel=new UserModel();
        userModel.setUserId(1000);
        userModel.setUserName("nick");
        return userModel;
    }

}
