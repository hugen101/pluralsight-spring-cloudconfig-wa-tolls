package pluralsight.pluralsightspringcloudm1startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.*;

@SpringBootApplication
@EnableConfigServer
public class PluralsightSpringcloudM1StartupApplication {

    public static void main(String[] args) {
        SpringApplication.run(PluralsightSpringcloudM1StartupApplication.class, args);
    }
}
