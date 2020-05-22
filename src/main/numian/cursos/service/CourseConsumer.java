package main.numian.cursos.service;

import main.numian.cursos.domain.Course;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CourseConsumer {

    @EventListener
    public void createCourse(Course course) throws InterruptedException {
        System.out.println("CONSUMER: A course has been created with title: " + course.getTitle());
    }

}
