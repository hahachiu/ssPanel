package com.hahachiu.ssPanel.service;

import java.util.List;
import com.hahachiu.ssPanel.entity.Log;

public interface LogService {

	/**
	 * 返回指定id的日志
	 * @param id 日志Id
	 * @return 指定的日志对象
	 */
	public Log getLog(long id);
	
	/**
	 * 返回所有
	 * @return 所有日志的列表
	 */
	public List<Log> getAllLogs();
	
	
}