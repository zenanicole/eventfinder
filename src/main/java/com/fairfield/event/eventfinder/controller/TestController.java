package com.fairfield.event.eventfinder.controller;

import com.fairfield.event.eventfinder.config.ApplicationConfiguration;
import com.fairfield.event.eventfinder.proxy.IEventFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private ApplicationConfiguration applicationConfiguration;
    @GetMapping(value = "/hello")
    public String getTest(){
        System.out.println(">>>>>>> "+
                applicationConfiguration.getEventFInder().getUrl()+" - "+
                applicationConfiguration.getEventFInder().getAppId());
        return "";
    }
}
