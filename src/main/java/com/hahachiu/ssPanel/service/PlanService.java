package com.hahachiu.ssPanel.service;

import java.util.List;

import com.hahachiu.ssPanel.entity.Plan;

public interface PlanService {

	/**
	 * ����ָ��id���ײ�
	 * @param id �ײ�Id
	 * @return ָ�����ײͶ���
	 */
	public Plan getPlan(long id);
	
	/**
	 * ��������
	 * @return �����ײ͵��б�
	 */
	public List<Plan> getAllPlans();
	
	
}
