package edu.hnit.action;

import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.hnit.domain.Person;
import edu.hnit.service.CRUDService;

@Controller("personAction")
@Scope("prototype")
public class PersonAction extends ActionSupport implements RequestAware, ModelDriven<Person>, Preparable {

	private static final long serialVersionUID = 1L;
	private Person person;
	@Autowired
	private CRUDService<Person> personServiceImpl;

	public void setPersonServiceImpl(CRUDService<Person> personServiceImpl) {
		this.personServiceImpl = personServiceImpl;
	}

	public String execute() {

		return SUCCESS;
	}

	// 查看所有person
	public String list() {
		request.put("persons", personServiceImpl.getAll());
		return "list";
	}

	// 查
	public String login() {
		Person p = personServiceImpl.getByUsername(person.getUsername());
		if (p != null && p.getPassword().equals(person.getPassword()))
			return "login";
		else
			return "error";

	}

	// 增
	public String register() {
		personServiceImpl.add(person);
		return "register";
	}

	// 删
	public String delete() {
		personServiceImpl.delete(person.getID());
		return "delete";
	}

	// 改
	public String update() {
		Person p = personServiceImpl.getByUsername(person.getUsername());
		p.setUsername(person.getUsername());
		p.setEmail(person.getEmail());
		personServiceImpl.update(p);
		return "update";
	}

	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}

	@Override
	public Person getModel() {
		if (person == null) {
			person = new Person();
		}
		return person;
	}

	@Override
	public void prepare() throws Exception {

	}

}
