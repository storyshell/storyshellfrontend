package com.storyshell.dao;

import java.util.Map;

import com.storyshell.model.Student;

public interface StudentDao {
   public void saveStudent(Student student);
   public void updateStudent(Student student);
   public Student findStudent(String id);
   public Map<Object,Object> findAllStudents();
   public void deleteStudent(String id);
   
}
