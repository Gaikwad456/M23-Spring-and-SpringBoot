package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//JPA repository is exist in spring data JPA dependencies and it contain
//all crude operation of spring JPA
public interface StudentRepository extends JpaRepository<Student,Integer> 
{

}
