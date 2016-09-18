package com.hahachiu.ssPanel.action;

import java.util.List;

import com.hahachiu.ssPanel.entity.Plan;
import com.hahachiu.ssPanel.service.PlanService;

public class PlanAction extends GenericActionSupport<Plan, PlanService> {

	private static final long serialVersionUID = 1L;
		
	public List<Plan> getPlans()
	{
		return this.getService().getAllPlans();
	}
	
}
