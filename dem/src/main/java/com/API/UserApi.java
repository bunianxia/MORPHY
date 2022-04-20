package com.API;

import com.Entity.User;
import com.Repository.UserRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 夏凯
 * @Description
 * @since 2021/4/1 16:29
 */
@Api
@RestController
@RequestMapping("/morphy")
public class UserApi {

    @Autowired(required = false)
    UserRepository userRepository;

    @GetMapping(value = "/first")
    public List<User> say(){
        List<User> user;
        user= userRepository.findByName("name");
        return user;
    }

    @GetMapping(value = "/second")
    public String talk(){
        String s = new String();
        s="red edsfaodgkjioangakjhgauijnevgah";
        return s;
    }

    @GetMapping(value = "/third")
    public List<User> userList(){
        return userRepository.findAll();
    }
}
