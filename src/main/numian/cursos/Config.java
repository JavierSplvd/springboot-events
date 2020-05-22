package main.numian.cursos;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mail")
public class Config {
    private String hostName;
    private int port;
    private String from;

}
