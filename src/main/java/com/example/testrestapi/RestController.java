package com.example.testrestapi;

import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class RestController {

    @PostMapping("/postBody")
    public String post(@RequestBody String fullName)
    {
        return "Hello " + fullName;
    }


}
