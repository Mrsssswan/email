package edu.hnit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hnit.dao.AdminDao;
import edu.hnit.domain.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

	@Override
	public boolean isAdmin(String name, String password) {
		// TODO Auto-generated method stub
		return adminDao.isAdmin(name, password);
	}

	@Override
	public List<Admin> getAdmins() {
		// TODO Auto-generated method stub
		return adminDao.getAdmins();
	}

}
