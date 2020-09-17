package ouc.isclab.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ouc.isclab.microservice.entity.User;
import ouc.isclab.microservice.repository.UserRepository;

import java.util.List;

/**
 * @ Classname  ：UserController
 * @ Description：用户实体类控制器
 * @ Date       ：Created in 2020/4/3 13:51
 * @ Author     ：vimer
 */

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable Long id){
        return userRepository.findOne(id);
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
}
