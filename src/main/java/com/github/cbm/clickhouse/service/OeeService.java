package com.github.cbm.clickhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.cbm.clickhouse.domain.Oee;
import com.github.cbm.clickhouse.mapper.OeeMapper;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class OeeService {

	@Autowired
	private OeeMapper oeeMapper;
	
	@Transactional(rollbackFor = Exception.class)
	public void save(Oee oee) {
		oeeMapper.save(oee);
	}
	
	public Oee findByDeviceId(Long deviceId) {
		return oeeMapper.selectByDeviceId(deviceId);
	}
}
