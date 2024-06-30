package com.crud.service.iml;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.crud.repository.StudentRepository;

@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {
	@InjectMocks
	private StudentServiceImpl serviceImpl;
	
	@Mock
	@Autowired
	private StudentRepository repository;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}


}
