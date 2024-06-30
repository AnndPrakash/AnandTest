package com.crud.service;

import java.util.List;

import com.crud.model.Student;

public interface StudentService {

	List<Student> getAllStudent();

	Student getStudentById(int id);

	Student createStudent(Student student);

	Student updateStudent(int id, Student student);

	void deleteStudent(int id);

}
