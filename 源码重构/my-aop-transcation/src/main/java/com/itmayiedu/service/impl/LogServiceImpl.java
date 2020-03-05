package com.itmayiedu.service.impl;

import com.itmayiedu.dao.LogDao;
import com.itmayiedu.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImpl implements LogService {
	@Autowired
	private LogDao logDao;

	@Transactional(propagation = Propagation.SUPPORTS)
	public void addLog() {
		logDao.add("addLog" + System.currentTimeMillis());
		 int i = 1 / 0;
	}
}
