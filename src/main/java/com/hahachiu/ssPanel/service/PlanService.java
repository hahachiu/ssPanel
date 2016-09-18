package com.hahachiu.ssPanel.service;

import java.util.List;

import com.hahachiu.ssPanel.entity.Plan;

public interface PlanService {

	/**
	 * 返回指定id的套餐
	 * @param id 套餐Id
	 * @return 指定的套餐对象
	 */
	public Plan getPlan(long id);
	
	/**
	 * 返回所有
	 * @return 所有套餐的列表
	 */
	public List<Plan> getAllPlans();
	
	
}
