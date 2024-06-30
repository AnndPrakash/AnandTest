package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Student;
import com.crud.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	@Autowired
	private StudentService service;

	@GetMapping("/all")
	public List<Student> getAllStundent() {
		return service.getAllStudent();
	}

	@PostMapping("/create")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		return new ResponseEntity<>(service.createStudent(student), HttpStatus.CREATED);
	}
	//http://localhost:8080/studnet/ap/1

	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id) {
		Student student = service.getStudentById(id);
		if (student != null) {
			return new ResponseEntity<>(student, HttpStatus.OK);
		}
		return new ResponseEntity<>(student, HttpStatus.NOT_FOUND);

	}

}
