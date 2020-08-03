package com.manh.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.manh.entity.LPN;

@Repository
@Transactional
public class LPNDAOServiceImpl {

	
	@PersistenceContext
	EntityManager entityManager;
	
	public Long insert(LPN lpn){			
		entityManager.persist(lpn);
		return lpn.getLpnId();		
	}
	
	
}
