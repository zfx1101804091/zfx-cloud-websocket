package com.zfx.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class WebsocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebsocketApplication.class,args);
    }
}
