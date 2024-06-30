package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
