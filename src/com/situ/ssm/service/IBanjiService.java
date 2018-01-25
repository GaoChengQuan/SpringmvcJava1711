package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.entity.Banji;
import com.situ.ssm.entity.Student;

public interface IBanjiService {

	List<Banji> findAll();

	void add(Student student);

}
