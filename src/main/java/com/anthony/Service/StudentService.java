/*
 * Copyright (c) 2018. Anthony Guillier
 */

package com.anthony.Service;

import com.anthony.Dao.StudentDao;
import com.anthony.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int studentId){
        return this.studentDao.getStudentById(studentId);
    }

}
