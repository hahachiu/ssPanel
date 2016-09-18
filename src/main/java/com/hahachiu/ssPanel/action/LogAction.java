package com.hahachiu.ssPanel.action;

import java.util.List;
import com.hahachiu.ssPanel.entity.Log;
import com.hahachiu.ssPanel.service.LogService;

public class LogAction extends
		GenericActionSupport<Log, LogService> {

	private static final long serialVersionUID = 1L;
	
	public List<Log> getLogs(){
		return this.getService().getAllLogs();
	}

}