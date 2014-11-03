import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by deep on 11/3/14.
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class helloWorldConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(helloWorldConfiguration.class, args);
    }

}
