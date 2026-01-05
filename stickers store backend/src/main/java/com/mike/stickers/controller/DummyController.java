package com.mike.stickers.controller;
import com.mike.stickers.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/dummy")
public class DummyController {

    @PostMapping("/create-user")
    public String createUser(@RequestBody UserDto userDto)
    {
        System.out.println(userDto);
        return "User created successfully";
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam (required = false, defaultValue = "Guest", name="name") String Username)
    {
        return "User Name is " + Username;
    }

    @GetMapping("/multiple-search")
    public String multipleSearch(@RequestParam String firstName, @RequestParam String lastName)
    {
        return "User Name is " + firstName + lastName;
    }

    @GetMapping("/multipleSearch2")
    public String multipleSearch2(@RequestParam Map<String, String> params)
    {
        return "User Name is " + params.get("firstName") + params.get("lastName");
    }
    @GetMapping({"/user/{userId}/posts/{postId}", "/user/{userId}"})
    public String getUser(@PathVariable(name="userId") String Id, @PathVariable(required = false) String postId )
    {
        return "User Name is " + Id + postId;
    }

    @GetMapping({"/user/map/{userId}/posts/{postId}","/user/map/{userId}"})
    public String getUsers(@PathVariable Map<String, String> pathVariables)
    {
        return "" + pathVariables.get("userId") + pathVariables.get("postId");
    }
}
