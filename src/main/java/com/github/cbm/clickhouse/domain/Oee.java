package com.github.cbm.clickhouse.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Oee extends BaseDomain {

	/**
	 * 良品率
	 */
	private Double oee;
	/**
	 * 稼动率
	 */
	private Double availability;
	/**
	 * 表现率
	 */
	private Double performance;
	/**
	 * 良品率
	 */
	private Double quality;
	/**
	 * 设备ID
	 */
	private String deviceId;
}
