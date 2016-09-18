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

import com.hahachiu.ssPanel.entity.ChargeOrder;
import com.hahachiu.ssPanel.service.ChargeOrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class ChargeOrderServiceImplTest {

	private static final Logger LOGGER = Logger
			.getLogger(ChargeOrderServiceImplTest.class);
	
	@Autowired
	private ChargeOrderService chargeOrderService;
	
	@Test
	@Ignore
	public void testGetChargeOrder() {
		fail("ипн╢й╣ож");
	}

	@Test
	public void testGetAllChargeOrders() {
		List<ChargeOrder> chargeOrders;
		chargeOrders = chargeOrderService.getAllChargeOrders();
		System.out.println(chargeOrders);
		LOGGER.info(chargeOrders);
	}

}
