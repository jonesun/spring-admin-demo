package io.github.jonesun.clientserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jone.sun
 * @date 2021/1/19 18:03
 */
@RestController
public class HelloController {

    @GetMapping
    public String index() {
        return "Hello World";
    }

}
