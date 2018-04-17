package edu.hnit.service;

import java.util.List;

import edu.hnit.domain.Admin;

public interface AdminService {
	public boolean isAdmin(String name,String password);
	public List<Admin> getAdmins();

}
