package com.hahachiu.ssPanel.service;

import com.hahachiu.ssPanel.dao.EntityDao;

public class ServiceSupport<TEntity> {

	private EntityDao<TEntity> dao;

	protected EntityDao<TEntity> getDao() {
		return dao;
	}

	public void setDao(EntityDao<TEntity> dao) {
		this.dao = dao;
	}
	
}
