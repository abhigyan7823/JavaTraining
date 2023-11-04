package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImp implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		String q1 = "insert into student(id,name,city) values(?,?,?)";
		int res = this.jdbcTemplate.update(q1,student.getId(),student.getName(),student.getCity());
		return res;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int update(Student student) {
		String q2 = "update student set name=?,city=? where id=?";
		int res = this.jdbcTemplate.update(q2,student.getName(),student.getCity(),student.getId());
		return res;
	}
	
	@Override
	public int delete(int studentID) {
		String q3 = "delete from student where id =?";
		int res = this.jdbcTemplate.update(q3,studentID);
		return res;
	}
	
	@Override
	public Student getStudent(int StudentId) {
		String q4 = "select * from student where id =?";
		RowMapper<Student> rowMapper = new RowMapperImp1();
		Student st = this.jdbcTemplate.queryForObject(q4, rowMapper,StudentId);
		return st;
	}

	@Override
	public List<Student> getAllStudents() {
		String q5 = "select * from student";
		List<Student> st = this.jdbcTemplate.query(q5,new RowMapperImp1());
		return st;
	}
	
}
