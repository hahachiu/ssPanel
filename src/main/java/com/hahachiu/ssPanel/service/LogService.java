package com.hahachiu.ssPanel.service;

import java.util.List;
import com.hahachiu.ssPanel.entity.Log;

public interface LogService {

	/**
	 * ����ָ��id����־
	 * @param id ��־Id
	 * @return ָ������־����
	 */
	public Log getLog(long id);
	
	/**
	 * ��������
	 * @return ������־���б�
	 */
	public List<Log> getAllLogs();
	
	
}