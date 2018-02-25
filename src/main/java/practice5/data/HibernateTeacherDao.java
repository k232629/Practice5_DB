package practice5.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import practice5.Teacher;

@Repository
public class HibernateTeacherDao implements TeachersDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }
    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class, id);
    }
    public void saveTacher(Teacher teacher) {
        currentSession().update(teacher);
    }


}
