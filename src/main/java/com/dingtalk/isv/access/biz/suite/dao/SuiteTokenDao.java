package com.dingtalk.isv.access.biz.suite.dao;

import com.dingtalk.isv.access.biz.suite.model.SuiteTicketDO;
import com.dingtalk.isv.access.biz.suite.model.SuiteTokenDO;
import com.google.common.collect.Lists;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("suiteTokenDao")
public class SuiteTokenDao {

    private Map<String , SuiteTokenDO> db = new HashMap<String, SuiteTokenDO>();

	/**
	 * 创建或更新一个套件SuiteToken
	 * @param suiteTokenDO
	 */
	public void saveOrUpdateSuiteToken(SuiteTokenDO suiteTokenDO){
	    db.put(suiteTokenDO.getSuiteKey(), suiteTokenDO);
    }

	/**
	 * 根据suiteKey查询套件SuiteToken
	 * @param suiteKey
	 * @return
	 */
	public SuiteTokenDO getSuiteTokenByKey(@Param("suiteKey") String suiteKey){
	    return db.get(suiteKey);
    }


	/**
	 * 查询套件SuiteToken.因为套件不多,无需分页
	 * @return
	 */
	public List<SuiteTokenDO> getAllSuiteToken(){
	    return Lists.newArrayList(db.values());
    }


}

