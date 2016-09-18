package com.hahachiu.ssPanel.service.impl;

import java.util.List;
import com.hahachiu.ssPanel.entity.Node;
import com.hahachiu.ssPanel.service.*;

public class NodeServiceImpl extends ServiceSupport<Node> implements
NodeService {

	public Node getNode(long id) {
		return this.getDao().get(id);
	}

	public List<Node> getAllNodes() {
		return this.getDao().findAll();
	}

}