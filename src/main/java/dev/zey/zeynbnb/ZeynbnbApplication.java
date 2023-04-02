package dev.zey.zeynbnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class ZeynbnbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeynbnbApplication.class, args);
    }

}
