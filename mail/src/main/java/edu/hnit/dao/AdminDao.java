package edu.hnit.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import edu.hnit.domain.Admin;

@Repository
public class AdminDao extends BaseRepository<Admin> {
	
	public boolean isAdmin(String name,String password) {
		String hql = "from Admin where NAME=?";
		Admin admin = (Admin) getSession().createQuery(hql)
					  .setParameter(0, name)
					  .getSingleResult();
		if(admin!=null&&admin.getPassword().equals(password)) 
			return true;
		else 
			return false;
	}
	@SuppressWarnings("unchecked")
	public List<Admin> getAdmins(){
		String hql = "select from Admin";
		return (List<Admin>)getSession().createQuery(hql).list();
	}

}
