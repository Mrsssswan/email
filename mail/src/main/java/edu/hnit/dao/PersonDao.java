package edu.hnit.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import edu.hnit.domain.Person;

@Repository
public class PersonDao extends BaseRepository<Person>{
	
	//添加person
	public void addPerson(Person person) {
		getSession().save(person);
	}
	//删除person
	public void deletePerson(int id) {
		getSession().delete(getSession().createQuery("from Person where ID=?")
		 			.setParameter(0, id).getSingleResult());
	}
	//修改person信息
	public void updatePerson(Person person) {
		getSession().update(person);
	}
	//获得一个person
	public Person getPerson(String username) {
		return (Person) getSession()
				.createQuery("from Person where USERNAME=?")
				.setParameter(0,username)
				.getSingleResult();
	}
	//获得所有的person
	@SuppressWarnings("unchecked")
	public List<Person> getPersons(){
		String hql = "from Person";
		return getSession().createQuery(hql).list();
	}
}
