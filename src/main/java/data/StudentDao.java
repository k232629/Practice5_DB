package main.java.data;

import main.java.Student;

public interface StudentDao {
    void addStudent(Student student);
    Student getStudentByIdFromDb(int i);
}
