package com.example.eureka_client.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
//注意要导入这个包
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chengjiapeng on 2017/3/24.
 */
@RestController
public class ClientController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/server-instance/{applicationName}")
    public List<ServiceInstance> serverInstanceByApplicationName(@PathVariable("applicationName")String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}
