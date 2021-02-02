package com.github.cbm.clickhouse.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.github.cbm.clickhouse.domain.Oee;

@Mapper
public interface OeeMapper {

	void save(Oee oee);
	
	Oee selectByDeviceId(Long deviceId);
}
