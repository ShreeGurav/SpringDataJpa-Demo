package com.shreecodinng.springdatajpademo.repository;

import com.shreecodinng.springdatajpademo.entity.Course;
import com.shreecodinng.springdatajpademo.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository repository;


    @Test
    public void saveCourseMaterial(){
        Course course=
                Course.builder()
                        .title("AWS")
                        .credit(7)
                        .build();
        CourseMaterial courseMaterial=
                CourseMaterial.builder()
                        .url("www.google.com")
                        .course(course)
                        .build();
        repository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterial(){
        List<CourseMaterial> courseMaterials=
                repository.findAll();

        System.out.println("courseMaterials = " + courseMaterials);
    }


}