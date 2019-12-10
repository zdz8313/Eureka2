package com.oracle.hrb.firstekprovider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstEkProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FirstEkProviderApplication.class).properties("server.port=8082").run(args);
    }

}
