package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//je suis un fich de config
@ComponentScan("org.example")
public class Appconfig {
@Bean
    public Personne personne(){
    return new Personne();
          }
@Bean
public LoggingAspect loggingAspect(){
    return new LoggingAspect();
}
}

