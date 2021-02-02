package com.github.cbm.clickhouse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.cbm.clickhouse.domain.Oee;
import com.github.cbm.clickhouse.service.OeeService;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.IdUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ClickHouseApplication.class)
public class OeeServiceTest {

	@Autowired
	private OeeService oeeService;
	
	@Test
	public void testSave() {
		Oee oee = new Oee();
		oee.setAvailability(0.98);
		oee.setPerformance(0.99);
		oee.setQuality(0.987);
		oee.setOee(0.78);
		oee.setDeviceId("a8647db7ea3c43189152191115e09a69");
		
		oee.setId(IdUtil.simpleUUID());
		oee.setCreateTime(DateUtil.date());
		oee.setGlobalUuid(UUID.fastUUID().toString());
		oee.setFactoryId(1l);
		oee.setFactoryName("存储");
		oee.setLineId(2l);
		oee.setLineName("cc");
		oee.setScheduleId(2l);
		
		oee.setDevice(1l);
		
		oeeService.save(oee);
	}
}
