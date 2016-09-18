package com.hahachiu.ssPanel.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hahachiu.ssPanel.entity.Log;
import com.hahachiu.ssPanel.service.LogService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class LogServiceImplTest {

	private static final Logger LOGGER = Logger
			.getLogger(ChargeOrderServiceImplTest.class);
	
	@Autowired
	private LogService logService;
	
	@Test
	@Ignore
	public void testGetLog() {
		
	}

	@Test
	public void testGetAllLogs() {
		List<Log> logs;
		logs = logService.getAllLogs();
		System.out.println("tset");
		LOGGER.info(logs);
	}

}
