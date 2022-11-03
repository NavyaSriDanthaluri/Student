package com.abc.gtest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abc.gtest.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	StudentDatabase db;

	@Override
	public List<Student> getAllStudents() throws Exception {
	
		return db.getAllStudents();
	}


	@Override
	public List<Student> getStudentByStream(String stream) throws Exception {
		List<Student> allStudents = getAllStudents();
		
		Student stu = allStudents.stream().filter((s)->{
		
			if(s.getStream().equals(stream))
			{
				return true;
			}
			else return false;
		}).findFirst().get();
		
		
		return (List<Student>) stu;
	}

	@Override
	public List<Student> getStudentByMarks(int r1 , int r2) throws Exception {
	
		List<Student> allStudents = getAllStudents();
		
		Student stu = allStudents.stream().filter((s)->{
		
			if(s.getMarks() <= r1 && s.getMarks() >= r2)
			{
				return true;
			}
			else return false;
		}).findFirst().get();
	
		return (List<Student>) stu;
	}
	

	@Override
	public Student getStudentByStreamAndLocation(String stream, String location) throws Exception {
		List<Student> allStudents = getAllStudents();
		
		 Student stu = allStudents.stream().filter((s)->{
			if(s.getStream().equals(stream) && s.getLocation().equals(location))
			{
				return true;
			}
			else return false;
		}).findFirst().get();
		 
		return stu;
	}

	@Override
	public Student getStudentByName(String studentName) throws Exception {
		List<Student> allStudents = getAllStudents();
		
		Student stu = allStudents.stream().filter((s)->{
		
			if(s.getStudentName().equals(studentName))
			{
				return true;
			}
			else return false;
		}).findFirst().get();
		
		
		return stu;
	}

	@Override
	public Student getStudentByRollNumber(int rollNumber) throws Exception {
		List<Student> allStudents = getAllStudents();
		
		Student stu = allStudents.stream().filter((s)->{
		
			if(s.getRollNumber() == rollNumber)
			{
				return true;
			}
			else return false;
		}).findFirst().get();
		
		
		return stu;
	}


	@Override
	public String insertStudent(Student stu) throws Exception {
		 List<Student> list =   db.getAllStudents();
		 list.add(stu);
		 db.setAllStudents(list); // adding the new user in the previous list
		 return "done";
	}
	
}
