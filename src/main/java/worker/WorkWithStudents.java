package main.java.worker;

import main.java.Student;
import main.java.data.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithStudents {

    @Autowired
    private StudentDao studentDao;

    public void saveStudentToDb(Student student){
        if((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
            studentDao.addStudent(student);
            System.out.println("Student have been saved " + student.toString());
        }
    }

    public Student getStudentByIdFromDb(int i){
        return studentDao.getStudentByIdFromDb(i);
    }
}
