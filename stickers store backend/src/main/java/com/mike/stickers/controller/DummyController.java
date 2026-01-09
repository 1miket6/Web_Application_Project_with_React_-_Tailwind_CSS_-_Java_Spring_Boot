package com.mike.stickers.controller;
import com.mike.stickers.dto.UserDto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.RequestEntity;
import org.springframework.http.HttpHeaders;
import java.util.List;
import java.util.Map;

@RestController
@Validated
@RequestMapping("api/v1/dummy")
public class DummyController {

    @PostMapping("/request-entity")
    public String createUserWithEntity(RequestEntity <UserDto> requestEntity)
    {
        HttpHeaders header = requestEntity.getHeaders();
        UserDto userDto = requestEntity.getBody();
        String queryString = requestEntity.getUrl().getPath();
        return queryString;
    }

//    @PostMapping("/create-user")
//    public String createUser(@RequestBody UserDto userDto)
//    {
//        System.out.println(userDto);
//        return "User created successfully";
//    }
//
    @GetMapping("/search")
    public String searchUser(@Size(min = 5, max = 30) @RequestParam (required = false, defaultValue = "Guest", name="name") String Username)
    {
        return "User Name is " + Username;
    }
//
//    @GetMapping("/multiple-search")
//    public String multipleSearch(@RequestParam String firstName, @RequestParam String lastName)
//    {
//        return "User Name is " + firstName + lastName;
//    }
//
//    @GetMapping("/multipleSearch2")
//    public String multipleSearch2(@RequestParam Map<String, String> params)
//    {
//        return "User Name is " + params.get("firstName") + params.get("lastName");
//    }
//    @GetMapping({"/user/{userId}/posts/{postId}", "/user/{userId}"})
//    public String getUser(@PathVariable(name="userId") String Id, @PathVariable(required = false) String postId )
//    {
//        return "User Name is " + Id + postId;
//    }
//
//    @GetMapping({"/user/map/{userId}/posts/{postId}","/user/map/{userId}"})
//    public String getUsers(@PathVariable Map<String, String> pathVariables)
//    {
//        return "" + pathVariables.get("userId") + pathVariables.get("postId");
//    }
//    @GetMapping("/headers")
//    public String readHeaders(@RequestHeader(name="User-Agent", required = false) String userAgent, @RequestHeader(name="User-Location") String userLocation)
//    {
//        return "Receive headers with value: " + userAgent + userLocation;
//    }
//    @GetMapping("/headers2")
//    public String readHeaders2(@RequestHeader Map<String, String> headers)
//    {
//        return "Receive headers with value: " + headers.toString();
//    }
    @GetMapping("/httpheaders")
    public String readHTTPHeaders(@RequestHeader HttpHeaders headers) {
        List<String> location = headers.get("User-location");
        return "Received headers with value : " + headers.toString();
    }

}
