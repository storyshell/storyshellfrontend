package com.storyshell.dao;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.storyshell.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentDao {

	private static final String KEY = "Student";

	@Inject
	private RedisTemplate<String, Object> redisTemplate;
	@SuppressWarnings("rawtypes")
	private HashOperations hashOps;

	@PostConstruct
	public void init() {
		hashOps = redisTemplate.opsForHash();
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		//write the content
		hashOps.put(KEY, student.getId(), student);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		hashOps.put(KEY, student.getId(), student);
	}

	@Override
	public Student findStudent(String id) {
		// TODO Auto-generated method stub
		return (Student) hashOps.get(KEY, id);
	}

	@Override
	public Map<Object, Object> findAllStudents() {
		// TODO Auto-generated method stub
		return hashOps.entries(KEY);
	}

	@Override
	public void deleteStudent(String id) {
		// TODO Auto-generated method stub
		hashOps.delete(KEY, id);
	}

}
