package practice5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import practice5.worker.WorkWithStudents;
import practice5.worker.WorkWithTeacher;

import java.util.Date;

public class App {

    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        WorkWithStudents worker = (WorkWithStudents)context.getBean("worker");
        Student testStudent = new Student("Olha Karaiman",5);
        worker.saveStudentToDb(testStudent);
        System.out.println(worker.getStudentByIdFromDb(1));

        WorkWithTeacher workWithTeacher =
                (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        teacher.setBirthDate(new Date());
        workWithTeacher.saveTacher(teacher);

    }
}
