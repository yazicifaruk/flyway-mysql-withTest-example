package com.athens.h2app.repository;

import com.athens.h2app.HomeWork;
import org.springframework.data.repository.CrudRepository;

public interface homeworkrepo extends CrudRepository<HomeWork, Integer>{
HomeWork findById(int id);




}
