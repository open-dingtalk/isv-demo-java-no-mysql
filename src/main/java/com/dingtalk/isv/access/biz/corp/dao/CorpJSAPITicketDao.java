package com.dingtalk.isv.access.biz.corp.dao;

import com.dingtalk.isv.access.biz.corp.model.CorpJSAPITicketDO;
import com.dingtalk.isv.access.biz.corp.model.CorpTokenDO;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("corpJSAPITicketDao")
public class CorpJSAPITicketDao {

    List<CorpJSAPITicketDO> db = new ArrayList<CorpJSAPITicketDO>();


	/**
	 * 创建或更新一个企业的corpJSTicketDO
	 * @param corpJSTicketDO
	 */
	public void saveOrUpdateCorpJSAPITicket(CorpJSAPITicketDO corpJSTicketDO){
	    db.add(corpJSTicketDO);
    }

	/**
	 * 获取企业的JSTicket
	 * @param suiteKey
	 * @return
	 */
	public CorpJSAPITicketDO getCorpJSAPITicket(@Param("suiteKey") String suiteKey, @Param("corpId") String corpId){
        for(CorpJSAPITicketDO appDO : db){
            if(StringUtils.equals(corpId, appDO.getCorpId())&&suiteKey.equals(appDO.getSuiteKey())){
                return appDO;
            }
        }
        return null;
    }

	/**
	 * 删除企业JSTicket
	 * @param suiteKey
	 * @param corpId
     */
	public void deleteCorpJSAPITicket(@Param("suiteKey") String suiteKey, @Param("corpId") String corpId){

    }

}

