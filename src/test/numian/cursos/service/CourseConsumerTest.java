package test.numian.cursos.service;

import main.numian.cursos.App;
import main.numian.cursos.service.CourseConsumer;
import main.numian.cursos.service.CoursePublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CourseConsumerTest {
    @Autowired
    private CourseConsumer courseConsumer;
    @Autowired
    private CoursePublisher courseProducer;

    @Test
    public void testConsumerProducer() throws InterruptedException {
        courseProducer.publish();
        courseProducer.publish();
        courseProducer.publish();
        Thread.sleep(11000);
    }
}