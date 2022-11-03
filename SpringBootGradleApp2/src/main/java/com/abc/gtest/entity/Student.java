package com.abc.gtest.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String studentName;
	private int rollNumber;
	private int marks;
	private String stream;
	private String location;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String studentName, int rollNumber, int marks, String stream,String location) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.marks = marks;
		this.stream = stream;
		this.location = location;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + ", marks=" + marks + ", stream="
				+ stream + ", location=" + location + "]";
	}

}
