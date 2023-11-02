package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import home_shoping.dto;

public class sinupdao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("srikanth");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public dto insert(dto dto)
{
entityTransaction.begin();
entityManager.persist(dto);
entityTransaction.commit();
return dto;
}

public dto feachbyemail(String email)
{
	Query query=entityManager.createQuery("select p from dto p where p.UserEmail=?1");
	query.setParameter(1,email);
	dto dto=(dto)query.getSingleResult();
	return dto;
	
}
public List<dto> feachall()
{
	Query query=entityManager.createQuery("select p from dto p");
	double dto=query.getFirstResult();
	return null;
}
}
