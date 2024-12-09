package com.spring.mvc.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.entity.Emp;

@Repository
public class EmpDaoImpl implements Empdao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveEmp(Emp emp) {
		int i=(Integer)hibernateTemplate.save(emp);
		
		return (int) hibernateTemplate.save(emp);
	}

	@Override
	public Emp getEmpById(int id) {
		Emp emp=hibernateTemplate.get(Emp.class, id);
		return emp;
	}

	@Override
	public List<Emp> getAllEmp() {
		List<Emp> list=hibernateTemplate.loadAll(Emp.class);
		return list;
	}

	@Override
	@Transactional
	public void update(Emp emp) {
		hibernateTemplate.update(emp);
	}

	@Override
	@Transactional
	public void deleteEmp(int id) {
		Emp emp=hibernateTemplate.get(Emp.class,id);
		hibernateTemplate.delete(emp);
	}		
}
