package io.github.jonesun.clientserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jone.sun
 * @date 2021/1/19 18:03
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping
    public String index() {
        logger.info("这是一个样例");
        logger.error("这是一个样例");
        System.out.println("这是一个样例");
        return "Hello World";
    }

}
