package practice5.data;

import practice5.Student;

public interface StudentDao {
    void addStudent(Student student);
    Student getStudentByIdFromDb(int i);
}
