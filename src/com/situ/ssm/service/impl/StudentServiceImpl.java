package com.situ.ssm.service.impl;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;

import com.situ.ssm.entity.Student;
import com.situ.ssm.mapper.StudentMapper;
import com.situ.ssm.service.IStudentService;
import com.situ.ssm.util.MyBatisUtil;

public class StudentServiceImpl implements IStudentService {
	private StudentMapper studentMapper;
	private SqlSession session;
	
	public StudentServiceImpl() {
		session = MyBatisUtil.getSqlSession();
		studentMapper = session.getMapper(StudentMapper.class);
	}
	
	@Override
	public void add(Student student) {
		studentMapper.add(student);
		session.commit();
	}

}
