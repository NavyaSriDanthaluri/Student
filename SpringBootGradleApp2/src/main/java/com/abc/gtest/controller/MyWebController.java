package com.abc.gtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.abc.gtest.entity.Student;
import com.abc.gtest.service.StudentService;

@RestController
@RequestMapping("/student")
public class MyWebController {
	
	@Autowired
	StudentService stuService;

	public MyWebController() {
		System.out.println("\n\n\n=========>>Inside Constructor"+this);
	}
	
	@PostMapping("/student")
	public String addUser(@RequestBody Student stu) 
	{
		try {
			return stuService.insertStudent(stu);
		} catch (Exception e) {
			return "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
		}
	}
	
	
	@GetMapping("/welcome")
	public String abc()
	{
		return "Hello Student";
	}
	
	@GetMapping("/studentname/{searchStudentName}")
	public Student abc2(@PathVariable String searchStudentName)throws Exception
	{
		return stuService.getStudentByName(searchStudentName);
	}
	
	@GetMapping("/rollnumber/{searchRollNumber}")
	public Student abc3(@PathVariable int searchRollNumber) throws Exception
	{
		return stuService.getStudentByRollNumber(searchRollNumber);
	}
	
	@GetMapping("/marks/{range1}/{range2}")
	public List<Student> getStudentByMarks(int range1, int range2) throws Exception
	{
		return stuService.getStudentByMarks(range1,range2);
	}
	
	@GetMapping("/stream/{searchStream}")
	public List<Student> getStudentByStream(String searchStream) throws Exception
	{
		return stuService.getStudentByStream(searchStream);
	}
	
	@GetMapping("/streamandlocation/{searchStream}")
	public Student abc3(@PathVariable String stream,@RequestParam String location)throws Exception
	{
		if(location != null)
		{
			return stuService.getStudentByStreamAndLocation(stream,location);
		}
		else return null;
		
	}

	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		try {
			List<Student> allExtractedStudents = stuService.getAllStudents();
			return allExtractedStudents;
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
