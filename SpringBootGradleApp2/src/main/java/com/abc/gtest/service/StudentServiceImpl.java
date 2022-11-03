package com.abc.gtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.gtest.dao.StudentDAO;
import com.abc.gtest.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDAO stuDao;
	
	@Override
	public List<Student> getAllStudents() throws Exception {
		
		// may contains other code like security , loggging , validation 
		
		return stuDao.getAllStudents();
	}

	@Override
	public List<Student> getStudentByStream(String stream) throws Exception {
	
		return stuDao.getStudentByStream(stream);
	}

	@Override
	public List<Student> getStudentByMarks(int r1,int r2) throws Exception {
		
		return stuDao.getStudentByMarks(r1, r2);
	}

	@Override
	public Student getStudentByName(String studentName) throws Exception {
	
		return stuDao.getStudentByName(studentName);
	}
	
	@Override
	public Student getStudentByRollNumber(int rollNumber) throws Exception {
		
		return stuDao.getStudentByRollNumber(rollNumber);
	}

	@Override
	public Student getStudentByStreamAndLocation(String stream, String location) throws Exception {
	
		return stuDao.getStudentByStreamAndLocation(stream, location);
	}

	@Override
	public String insertStudent(Student stu) throws Exception {
		
		return stuDao.insertStudent(stu);
	}

}
