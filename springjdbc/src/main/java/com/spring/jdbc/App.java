package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;

import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App  {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDao studentdao = context.getBean("studentDao",StudentDao.class);
        List<Student> st = studentdao.getAllStudents();
        for(Student s: st) {
        	System.out.println(s);
        }
        
        
//        Student s4 = studentdao.getStudent(2);
//        System.out.println(s4);
        
//			Delete        
//        Student s3 = new Student();
//        int res = studentdao.delete(3);
//        System.out.println(res);
//        Student s2 = new Student();
        
//			Insert
//        s2.setId(1);
//        s2.setName("Luffy");
//        s2.setCity("Foosha Village");
//        int res = studentdao.update(s2);
//        System.out.println(res);
//        Student s1 = new Student();
//        s1.setId(3);
//        s1.setName("Sanji");
//        s1.setCity("Germa Kingdom");
//        int res = studentdao.insert(s1);
//        System.out.println(res);
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        String q1 = "insert into student(id,name,city) values(?,?,?)";
//        int result = template.update(q1,1,"Luffy","Foosha");
//        System.out.println("Rows Affected "+result);
         
        
    }
}
