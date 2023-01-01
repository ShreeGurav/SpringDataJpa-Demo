package com.shreecodinng.springdatajpademo.repository;

import com.shreecodinng.springdatajpademo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
