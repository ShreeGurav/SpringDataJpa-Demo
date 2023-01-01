package com.shreecodinng.springdatajpademo.repository;

import com.shreecodinng.springdatajpademo.entity.Course;
import com.shreecodinng.springdatajpademo.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TeacherRepositoryTest {


    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course courseKannada=
                Course.builder()
                        .title("Kannada")
                        .credit(9)
                        .build();
        Course courseMaths=
                Course.builder()
                        .title("Maths")
                        .credit(7)
                        .build();

        Teacher teacher=
                Teacher.builder()
                        .firstName("Bhagyashree")
                        .lastName("Hatti")
                        .courses(List.of(courseKannada,courseMaths))
                        .build();
        teacherRepository.save(teacher);
    }
}