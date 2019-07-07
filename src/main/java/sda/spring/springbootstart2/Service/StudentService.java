package sda.spring.springbootstart2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.spring.springbootstart2.DAO.StudentDao;
import sda.spring.springbootstart2.Entity.Student;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }
    public void deleteStudentById(int id) {
        this.studentDao.deleteStudentById(id);
    }

    public Student addStudent(Student student) {
        return this.studentDao.addStudent(student);
    }

    public void updateStudentById(Student student) {
        this.studentDao.updateStudentById(student);
    }
}
