package edu.hnit.service;

import org.springframework.beans.factory.annotation.Autowired;
import edu.hnit.dao.BaseRepository;

public abstract class BaseService <T>{
	
	@Autowired
	protected BaseRepository<T> repository;

}
