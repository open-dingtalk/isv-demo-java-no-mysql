package com.dingtalk.isv.access.biz.corp.dao;

import com.dingtalk.isv.access.biz.corp.model.CorpChannelJSAPITicketDO;
import com.dingtalk.isv.access.biz.corp.model.CorpJSAPITicketDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("corpChannelJSAPITicketDao")
public class CorpChannelJSAPITicketDao {


    List<CorpChannelJSAPITicketDO> db = new ArrayList<CorpChannelJSAPITicketDO>();
	/**
	 * 创建或更新一个企业的corpChannelJSAPITicketDO
	 * @param corpChannelJSAPITicketDO
	 */
	public void saveOrUpdateCorpChannelJSAPITicket(CorpChannelJSAPITicketDO corpChannelJSAPITicketDO){

    }

	/**
	 * 获取企业的JSTicket
	 * @param suiteKey
	 * @return
	 */
	public CorpChannelJSAPITicketDO getCorpChannelJSAPITicket(@Param("suiteKey") String suiteKey, @Param("corpId") String corpId){
	    return null;
    }

	/**
	 * 删除企业JSTicket
	 * @param suiteKey
	 * @param corpId
     */
	public void deleteCorpChannelJSAPITicket(@Param("suiteKey") String suiteKey, @Param("corpId") String corpId){

    }

}

