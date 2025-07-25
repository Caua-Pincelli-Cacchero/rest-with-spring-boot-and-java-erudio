package Caua_PIncelli_Cacchero.controllers;

import Caua_PIncelli_Cacchero.services.PersonServices;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestLogController {

    private Logger logger = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping("/test")
    public String testLog(){
        logger.debug("This is an DEBUG Log");
        logger.info("This is an INFO Log");
        logger.warn("This is an WARN Log");
        logger.error("This is an ERROR Log");
        return "Logs generated successfuly!";
    }
}
