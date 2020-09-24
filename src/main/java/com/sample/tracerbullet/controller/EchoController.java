package com.sample.tracerbullet.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/echo")
public class EchoController {

    @PostMapping
    public String echo(@RequestBody String message) {
        return message;
    }

}
