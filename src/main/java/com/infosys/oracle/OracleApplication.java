package com.infosys.oracle;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OracleApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(OracleApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
