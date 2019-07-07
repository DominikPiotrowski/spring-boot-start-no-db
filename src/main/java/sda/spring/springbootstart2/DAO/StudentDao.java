package sda.spring.springbootstart2.DAO;

import org.springframework.stereotype.Repository;
import sda.spring.springbootstart2.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao implements StudentDaoImpl {

    //jakaś kolekcja tworząca obiekty klasy student:
    private static Map<Integer, Student> students;
    static {
        students = new HashMap<Integer,Student>() {
            {
                put(1, new Student(1,"Jacek","Placek", "Math"));
                put(2, new Student(2,"Marian","Buracki", "Science"));
                put(3, new Student(3,"Krystyna","Durna", "Chemistry"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void deleteStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public Student addStudent(Student student) {
        return this.students.put(student.getId(), student);
    }

    @Override
    public void updateStudentById(Student student) {
        Student s = students.get(student.getId());
        s.setFirstName(student.getFirstName());
        s.setLastName(student.getLastName());
        s.setCourse(student.getCourse());
        students.put(student.getId(), student);
    }
}
