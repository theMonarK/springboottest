/*
 * Copyright (c) 2018. Anthony Guillier
 */

package com.anthony.Service;

import com.anthony.Dao.IStudentDao;
import com.anthony.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Qualifier("fakeData")
public class StudentService {

    @Autowired
    private IStudentDao IStudentDao;

    public Collection<Student> getAllStudents(){
        return this.IStudentDao.getAllStudents();
    }

    public Student getStudentById(int studentId){
        return this.IStudentDao.getStudentById(studentId);
    }

    public void removeStudentById(int id) {
        this.IStudentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.IStudentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.IStudentDao.insertStudent(student);
    }
}
