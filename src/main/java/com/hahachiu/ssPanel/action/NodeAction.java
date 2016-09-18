package com.hahachiu.ssPanel.action;

import java.util.List;
import com.hahachiu.ssPanel.entity.Node;
import com.hahachiu.ssPanel.service.NodeService;

public class NodeAction extends
		GenericActionSupport<Node, NodeService> {

	private static final long serialVersionUID = 1L;
	
	public List<Node> getNodes(){
		return this.getService().getAllNodes();
	}

}
