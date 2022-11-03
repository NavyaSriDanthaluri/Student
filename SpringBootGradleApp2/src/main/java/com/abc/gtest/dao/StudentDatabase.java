package com.abc.gtest.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.abc.gtest.entity.Student;

@Component
public class StudentDatabase {
	
	public List<Student> allStudents = new ArrayList<>();
	
	StudentDatabase() {
		
		System.out.println("inside student database");
		
		Student s1 = new Student("Navya", 1, 80, "Technical","Bangalore");
		Student s2 = new Student("Neelima", 2, 85, "Technical","Hyderabad");
		Student s3 = new Student("Madhan", 3, 80, "Non-Technical","Bangalore");
		Student s4 = new Student("Madhu", 4, 82, "Non-Technical","Hyderabad");
		
		allStudents.add(s1);
		allStudents.add(s2);
		allStudents.add(s3);
		allStudents.add(s4);
		
	}
	
	public List<Student> getAllStudents(){
		return allStudents;
	}
	
	public void setAllStudents(List<Student> allStudents) {
		this.allStudents = allStudents;
	}
}
