package org.ckr.msdemov2.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplicationBuilder(GatewayApplication.class)
                .properties("spring.config.name=msdemov2_gateway")
                .build();

        app.addListeners(new ApplicationPidFileWriter());
        app.run(args);
    }
}
