package com.github.cbm.clickhouse.domain;

import java.util.Date;

import lombok.Data;

@Data
public abstract class BaseDomain {

	private String id;
	
	private String globalUuid;
	
	private Date createTime;
	
	private String factoryName;
	
	private Long factoryId;
	
	private Long scheduleId;
	
	private Long lineId;
	
	private String lineName;
	
	private String collectTime;
	
	private Long device;
}
