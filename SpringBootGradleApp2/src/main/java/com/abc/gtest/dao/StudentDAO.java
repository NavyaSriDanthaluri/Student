package com.abc.gtest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.abc.gtest.entity.Student;

@Repository
public interface StudentDAO {
	
	public List<Student> getAllStudents() throws Exception;
	public List<Student> getStudentByStream(String searchStream) throws Exception;
	public List<Student> getStudentByMarks(int range1, int range2) throws Exception;
	public Student getStudentByName(String searchStudentName) throws Exception;
	public Student getStudentByRollNumber(int searchRollNumber) throws Exception;
	public Student getStudentByStreamAndLocation(String searchStream, String searchLocation) throws Exception;
	
	
	public String insertStudent(Student stu) throws Exception;

}
