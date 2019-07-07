package sda.spring.springbootstart2.DAO;

import sda.spring.springbootstart2.Entity.Student;

import java.util.Collection;

public interface StudentDaoImpl {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    Student addStudent(Student student);

    void updateStudentById(Student student);
}
