package com.hahachiu.ssPanel.service;

import java.util.List;
import com.hahachiu.ssPanel.entity.Node;

public interface NodeService {

	/**
	 * 返回指定id的节点
	 * @param id 节点Id
	 * @return 指定的节点对象
	 */
	public Node getNode(long id);
	
	/**
	 * 返回所有
	 * @return 所有节点的列表
	 */
	public List<Node> getAllNodes();
	
	
}