package com.hahachiu.ssPanel.service.impl;

import java.util.List;

import com.hahachiu.ssPanel.entity.Log;
import com.hahachiu.ssPanel.service.*;

public class LogServiceImpl extends ServiceSupport<Log> implements
LogService {

	public Log getLog(long id) {
		return this.getDao().get(id);
	}

	public List<Log> getAllLogs() {
		return this.getDao().findAll();
	}

}