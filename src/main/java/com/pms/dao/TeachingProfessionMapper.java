package com.pms.dao;

import com.pms.entity.TeachingProfession;

import java.util.List;

public interface TeachingProfessionMapper {

	public TeachingProfession findTeachingProfessionByName(String teachingProfession_name);

	public List<TeachingProfession> getAllTeachingProfession();

}
