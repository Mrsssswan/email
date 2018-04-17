package edu.hnit.action;

import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import edu.hnit.domain.Admin;
import edu.hnit.service.AdminService;

@Controller("adminAction")
public class AdminAction extends ActionSupport implements ModelDriven<Admin>, RequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Admin admin;
	@Autowired
	private AdminService adminService;

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}

	public String login() {

		if (adminService.isAdmin(admin.getName(), admin.getPassword()))
			return "login";
		else
			return "error";
	}

	public String list() {
		request.put("admins", adminService.getAdmins());
		return "list";
	}

	@Override
	public Admin getModel() {
		if (admin == null) {
			admin = new Admin();
		}
		return admin;
	}

	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		request = arg0;
	}

}
