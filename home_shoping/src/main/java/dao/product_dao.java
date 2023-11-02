package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import home_shoping.products_dto;

public class product_dao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("srikanth");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();


public void insetvalues(products_dto dto)
{
	entityTransaction.begin();
	entityManager.persist(dto);
	entityTransaction.commit();
}

}
