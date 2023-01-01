package com.shreecodinng.springdatajpademo.repository;

import com.shreecodinng.springdatajpademo.entity.Guardian;
import com.shreecodinng.springdatajpademo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student=Student.builder()
                .emailId("shrishail@gmail.com")
                .firstName("Shrishail")
                .lastName("Hugar")
               //.gaurdianName("Shree")
              //  .gaurdianEmail("shree@gmail.com")
              //  .gaurdianMobile("9880795453")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian=Guardian.builder()
                .email("shrishail@gmail.com")
                .name("Shreeram")
                .mobile("793484353")
                .build();
        Student student=Student.builder()
                .firstName("Ravana")
                .emailId("ravana@gmail.com")
                .lastName("Omnamaha")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }
    
    @Test
    public void printAllStudent(){
        List<Student> studentList=
                studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }
    
    @Test
    public void printStudentByFirstName(){
        List<Student> students=
                studentRepository.findByFirstName("Shiva");
        System.out.println("students = " + students);
    }


    @Test
    public void printStudentByFirstNameContaining(){
        List<Student> students=
                studentRepository.findByFirstNameContaining("Sh");
        System.out.println("students = " + students);
    }
    @Test
    public void  printStudentBasedOnGuardianName(){
        List<Student> students=
                studentRepository.findByGuardianName("Shree");
        System.out.println("students = " + students);
    }

    @Test
    public void printgetStudentByEmailAddress(){
        Student student=
                studentRepository.getStudentByEmailAddress(
                        "shrishail@gmail.com"
                );
        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentFirstNameByEmailAddress(){
        String firstName=
                studentRepository.getStudentFirstNameByEmailAddress(
                        "shiva@gmail.com"
                );
        System.out.println("firstName = " + firstName);
    }
    @Test
    public void printgetStudentByEmailAddressNative(){
        Student student=
                studentRepository.getStudentByEmailAddressNative(
                        "ram@gmail.com"
                );
        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentByEmailAddressNativeNameParam(){

        Student student=
                studentRepository.getStudentByEmailAddressNativeNameParam(
                        "ravana@gmail.com"
                );
        System.out.println("student = " + student);
    }

    @Test
    public void updateStudentByEmailIdTest(){
        studentRepository.updateStudentByEmailId(
                "ShrishailHugar",
                "shrishail@gmail.com"
        );
    }

}