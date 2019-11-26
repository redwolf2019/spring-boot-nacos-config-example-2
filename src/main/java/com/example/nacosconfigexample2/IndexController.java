package com.example.nacosconfigexample2;

import com.example.nacosconfigexample2.dao.UserDao;
import com.example.nacosconfigexample2.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class IndexController {

    private final UserDao userDao;

    @Value(value = "${example:example}")
    private String example;


    @GetMapping("/example")
    public String example() {
        return example;
    }

    @PostMapping("/user")
    public UserModel add(@RequestBody Map<String, String> map) {
        UserModel model = new UserModel();
        model.setUsername(map.get("username"));
        model.setPassword(map.get("password"));
        model.setNick(map.get("nickname"));
        userDao.save(model);
        return model;
    }

    @GetMapping("/user")
    public List<UserModel> getUserList(){
        return userDao.findAll();
    }

}
