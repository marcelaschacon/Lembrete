package br.com.db1.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.db1.dao.DAO;
import br.com.db1.model.Lembrete;

public class LembreteDao{
	
		private EntityManager manager;
		
		@Inject
		
		public LembreteDao(EntityManager manager) {
			this.manager = manager;
	}
		
		public void Inserir(String descricao){
			 
		}

		public List<Lembrete> findAll() {
			return manager.createQuery("From lembrete").getResultList();
		}
}
