package com.hahachiu.ssPanel.dao.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hahachiu.ssPanel.service.impl.ChargeOrderServiceImplTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class LogDaoHibernateImplTest {

	private static final Logger LOGGER = Logger
			.getLogger(ChargeOrderServiceImplTest.class);
	
	@Resource
    private LogDaoHibernateImpl logDao;
	
	@Test
	public void test() {
		LOGGER.info("test");
		LOGGER.info(logDao.findAll());
	}

}
