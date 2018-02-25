package practice5.worker;

import org.springframework.beans.factory.annotation.Autowired;
import practice5.Student;
import practice5.data.StudentDao;

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
