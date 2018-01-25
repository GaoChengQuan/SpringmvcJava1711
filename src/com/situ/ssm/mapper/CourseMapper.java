package com.situ.ssm.mapper;

import java.util.List;

import com.situ.ssm.entity.Banji;
import com.situ.ssm.entity.Student;

public interface CourseMapper {
	public Banji findBanjiInfoById(Integer id);
	
	public List<Student> findStudentsByName(String banjiName);
}
