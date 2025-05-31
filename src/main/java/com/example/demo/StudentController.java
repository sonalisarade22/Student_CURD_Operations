package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentController {
	@Autowired 
	
	private StudentService service;
	
	@GetMapping 
	public List<Student>getAll()
	{
		return service.getAllStudents();
	}
	
	@GetMapping("/{id}")
	
		public Student getById(@PathVariable Long id)
		{
			return service.getStudentById(id);
		}
	@PostMapping
	public Student create(@RequestBody Student student)
	{
		return service.saveStudent(student);
		
	}
	@PutMapping("/{id}")
	public Student update(@PathVariable Long id, @RequestBody Student student)
	{
		student.setId(id);
		return service.saveStudent(student);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id)
	{
		service.deleteStudent(id);
	}
}

