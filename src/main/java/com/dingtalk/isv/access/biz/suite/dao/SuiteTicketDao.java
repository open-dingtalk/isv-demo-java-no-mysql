package com.dingtalk.isv.access.biz.suite.dao;

import com.dingtalk.isv.access.biz.suite.model.SuiteDO;
import com.dingtalk.isv.access.biz.suite.model.SuiteTicketDO;
import com.google.common.collect.Lists;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("suiteTicketDao")
public class SuiteTicketDao {

    private Map<String , SuiteTicketDO> db = new HashMap<String, SuiteTicketDO>();



	/**
	 * 创建或更新一个套件SuiteTicket
	 * @param suiteTicketDO
	 */
	public void saveOrUpdateSuiteTicket(SuiteTicketDO suiteTicketDO){
	    db.put(suiteTicketDO.getSuiteKey(), suiteTicketDO);
    }

	/**
	 * 根据suiteKey查询套件SuiteTicket
	 * @param suiteKey
	 * @return
	 */
	public SuiteTicketDO getSuiteTicketByKey(@Param("suiteKey") String suiteKey){
	    return db.get(suiteKey);
    }

	/**
	 * 查询套件SuiteTicket,无需分页
	 * @return
     */
	public List<SuiteTicketDO> getAllSuiteTicket(){
	    return Lists.newArrayList(db.values());
    }


}

