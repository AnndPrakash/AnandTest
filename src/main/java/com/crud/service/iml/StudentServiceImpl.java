package com.crud.service.iml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Student;
import com.crud.repository.StudentRepository;
import com.crud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> getAllStudent() {
		 return repository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		
		return repository.findById(id).orElse(null);
	}

	@Override
	public Student createStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public Student updateStudent(int id, Student student) {
		  if(repository.existsById(id)) {
			  student.setId(id);
			  student.setAge(student.getAge());
			  student.setAddress(student.getAddress());
			  student.setGender(student.getGender());
			  student.setName(student.getName());
			 return repository.save(student);
		  }
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		repository.deleteById(id);
		
	}
	


}
