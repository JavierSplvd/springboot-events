package test.numian.cursos.controller;

import main.numian.cursos.App;
import main.numian.cursos.domain.Course;
import main.numian.cursos.domain.CourseHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class CourseControllerTests {

    private Course course;
    private List<Course> courses;

    @MockBean
    private CourseHandler handler;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        course = new Course("Something");
        courses = new ArrayList<>();
        courses.add(course);
        Mockito.when(handler.save(course)).thenReturn(course);
        Mockito.when(handler.findAll()).thenReturn(courses);
    }
    @Test
    public void testAltaCurso() {
        ResponseEntity<Course> r1 = template.postForEntity("/course", course, Course.class);
        assertThat(r1.getStatusCode(), is(equalTo(HttpStatus.OK)));
    }

    @Test
    public void testGetAllAltaOrdenados() {
        ResponseEntity<Course[]> r1 = template.getForEntity("/course", Course[].class);
        assertThat(r1.getStatusCode(), is(equalTo(HttpStatus.OK)));
    }

}
