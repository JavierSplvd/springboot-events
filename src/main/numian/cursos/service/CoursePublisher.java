package main.numian.cursos.service;

import main.numian.cursos.domain.Course;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.nio.charset.StandardCharsets;
import java.util.Random;

@Component
public class CoursePublisher {
    private final ApplicationEventPublisher publisher;

    public CoursePublisher(ApplicationEventPublisher publisher){
        this.publisher = publisher;
    }

    public void publish() throws InterruptedException {
        System.out.println("PUBLISHER: Producing course");
        Thread.sleep(10000);
        publisher.publishEvent(new Course(generateRandomString()));
    }

    private String generateRandomString(){
        return RandomStringUtils.randomNumeric(5);
    }
}
