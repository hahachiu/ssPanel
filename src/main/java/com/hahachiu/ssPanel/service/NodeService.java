package com.hahachiu.ssPanel.service;

import java.util.List;
import com.hahachiu.ssPanel.entity.Node;

public interface NodeService {

	/**
	 * ����ָ��id�Ľڵ�
	 * @param id �ڵ�Id
	 * @return ָ���Ľڵ����
	 */
	public Node getNode(long id);
	
	/**
	 * ��������
	 * @return ���нڵ���б�
	 */
	public List<Node> getAllNodes();
	
	
}