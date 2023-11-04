package springjdbcbean;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {
    public static void main( String[] args ) {
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        List<Student> st = studentDao.getAllStudents();
        for(Student s: st) {
        	System.out.println(s);
        }
    }
}
