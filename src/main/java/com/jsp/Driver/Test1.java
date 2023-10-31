package com.jsp.Driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

import com.jsp.Entities.Students;
import com.jsp.Entities.Subjects;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Subjects> sub = new ArrayList<Subjects>();
		Subjects ss = new Subjects();
		ss.setName("Core Java");
		ss.setTrainerName("Ravi");
		
		Subjects ss2 = new Subjects();
		ss2.setName("WebTech");
		ss2.setTrainerName("Utsav");
		
		Subjects ss3 = new Subjects();
		ss3.setName("SQL");
		ss3.setTrainerName("Jyotsna");
		
		sub.add(ss);
		sub.add(ss2);
		sub.add(ss3);
		
		Students s = new Students();
		s.setName("Raj");
		s.setLoc("Bangalore");
		s.setSubList(sub);
		
		Students s2 = new Students();
		s.setName("Rahul");
		s.setLoc("Mysore");
		s.setSubList(sub);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(s);
		em.persist(s2);
		em.persist(ss);
		em.persist(ss2);
		em.persist(ss3);
		et.commit();
		
		
		
		
		

	}

}
