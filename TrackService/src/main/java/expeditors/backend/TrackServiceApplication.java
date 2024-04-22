package expeditors.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class TrackServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrackServiceApplication.class, args);
    }

}

@Component
class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Here we go with Spring Boot");
    }

}