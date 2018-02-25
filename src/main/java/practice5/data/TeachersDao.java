package practice5.data;
import practice5.Teacher;

public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);

}
