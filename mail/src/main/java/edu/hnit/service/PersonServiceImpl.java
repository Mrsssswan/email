package edu.hnit.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.hnit.dao.PersonDao;
import edu.hnit.domain.Person;

@Service
public class PersonServiceImpl extends BaseService<Person> implements CRUDService<Person> {
	@Autowired
	private PersonDao personDao;

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void add(Person t) {
		// TODO Auto-generated method stub
		personDao.addPerson(t);
	}


	@Override
	public void update(Person person) {
		personDao.updatePerson(person);
	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return personDao.getPersons();
	}

	@Override
	public Person getByUsername(String username) {
		// TODO Auto-generated method stub
		return personDao.getPerson(username);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		personDao.deletePerson(id);
		
	}

}
