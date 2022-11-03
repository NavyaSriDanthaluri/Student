package com.abc.gtest.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.abc.gtest.entity.Student;

@Service
public interface StudentService {
	
	public List<Student> getAllStudents() throws Exception;
	public List<Student> getStudentByStream(String searchStream) throws Exception;
	public List<Student> getStudentByMarks(int range1, int range2) throws Exception;
	public Student getStudentByName(String searchStudentName) throws Exception;
	public Student getStudentByRollNumber(int searchRollNumber) throws Exception;
	public Student getStudentByStreamAndLocation(String searchStream, String searchLocation) throws Exception;

	
	public String insertStudent(Student stu)throws Exception;
}
