package main.numian.cursos.controller;

import main.numian.cursos.domain.Course;
import main.numian.cursos.domain.CourseHandler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseResource {

    private final CourseHandler handler;

    public CourseResource(CourseHandler handler) {
        this.handler = handler;
    }

    @GetMapping("/course")
    public List<Course> courses() {
        return (List<Course>) handler.findAll();
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable int id) {
        return handler.findById((long) id).orElse(null);
    }

    @PostMapping("/course")
    public void postCourse(@RequestBody Course course) {
        handler.save(course);
    }
}
