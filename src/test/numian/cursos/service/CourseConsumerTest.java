package test.numian.cursos.service;

import main.numian.cursos.App;
import main.numian.cursos.service.CourseConsumer;
import main.numian.cursos.service.CoursePublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class CourseConsumerTest {
    @Autowired
    private CourseConsumer courseConsumer;
    @Autowired
    private CoursePublisher courseProducer;

    @Test
    public void testConsumerProducer(){
        courseProducer.produce();
        courseProducer.produce();
        courseProducer.produce();
    }
}