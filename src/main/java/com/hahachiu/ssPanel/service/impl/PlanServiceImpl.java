package com.hahachiu.ssPanel.service.impl;

import java.util.List;

import com.hahachiu.ssPanel.entity.Plan;
import com.hahachiu.ssPanel.service.*;

public class PlanServiceImpl extends ServiceSupport<Plan> implements
		PlanService {

	public Plan getPlan(long id) {
		return this.getDao().get(id);
	}

	public List<Plan> getAllPlans() {
		return this.getDao().findAll();
	}

}
