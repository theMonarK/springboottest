/*
 * Copyright (c) 2018. Anthony Guillier
 */

package com.anthony.Dao;

import com.anthony.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static{
        students=new HashMap<Integer, Student>(){
            {
                put(1,new Student(1,"Anthony","Computer science"));
                put(2,new Student(2,"Sylvain","Finance"));
                put(3,new Student(3,"Lisa","Maths"));
            }
        };

    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int studentId){
        return this.students.get(studentId);
    }
}