package com.dingtalk.isv.access.biz.corp.dao;

import com.dingtalk.isv.access.biz.corp.model.CorpChannelTokenDO;
import com.dingtalk.isv.access.biz.corp.model.CorpDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("corpChannelTokenDao")
public class CorpChannelTokenDao {

    List<CorpChannelTokenDao> db = new ArrayList<CorpChannelTokenDao>();

	/**
	 * 创建或更新一个企业的corpChTokenDO
	 * @param corpChTokenDO
	 */
	public void saveOrUpdateCorpChannelToken(CorpChannelTokenDO corpChTokenDO){

    }

	/**
	 *
	 * @param suiteKey
	 * @return
	 */
	public CorpChannelTokenDO getCorpChannelToken(@Param("suiteKey") String suiteKey, @Param("corpId") String corpId){
	    return null;
    }

	/**
	 * 删除企业token
	 * @param suiteKey
	 * @param corpId
     */
	public void deleteCorpChannelToken(@Param("suiteKey") String suiteKey, @Param("corpId") String corpId){

    }

}

