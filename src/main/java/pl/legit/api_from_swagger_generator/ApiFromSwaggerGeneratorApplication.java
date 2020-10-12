package pl.legit.api_from_swagger_generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiFromSwaggerGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiFromSwaggerGeneratorApplication.class, args);
    }

}
