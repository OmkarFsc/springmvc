package com.spring.mvc.Dao;

import java.util.List;

import com.spring.mvc.entity.Emp;

public interface Empdao {

       public int saveEmp(Emp emp);
	   public Emp getEmpById(int id);
	   
	   public List<Emp> getAllEmp();
	   
	   public void update(Emp emp);
	   
	   public void deleteEmp(int id);
}
