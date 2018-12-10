/*
 * Copyright (c) 2018. Anthony Guillier
 */

package com.anthony.Dao;

import com.anthony.Entity.Student;

import java.util.Collection;

public interface IStudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int studentId);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
