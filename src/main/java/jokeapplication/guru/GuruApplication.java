package jokeapplication.guru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:chuckconfig.xml")
public class GuruApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuruApplication.class, args);
    }

}
