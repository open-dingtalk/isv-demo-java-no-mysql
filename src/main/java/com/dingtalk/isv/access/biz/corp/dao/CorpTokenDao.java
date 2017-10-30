package com.dingtalk.isv.access.biz.corp.dao;

import com.dingtalk.isv.access.biz.corp.model.CorpTokenDO;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Repository("corpTokenDao")
public class CorpTokenDao {

    private List<CorpTokenDO> db = new ArrayList<CorpTokenDO>();


	/**
	 * 创建或更新一个企业的corpTokenDO
	 * @param corpTokenDO
	 */
	public void saveOrUpdateCorpToken(CorpTokenDO corpTokenDO){
	    db.add(corpTokenDO);
    }

	/**
	 *
	 * @param suiteKey
	 * @return
	 */
	public CorpTokenDO getCorpToken(@Param("suiteKey") String suiteKey,@Param("corpId") String corpId){
        for(CorpTokenDO appDO : db){
            if(StringUtils.equals(corpId, appDO.getCorpId())&&suiteKey.equals(appDO.getSuiteKey())){
                return appDO;
            }
        }
        return null;
    }

	/**
	 * 删除企业token
	 * @param suiteKey
	 * @param corpId
     */
	public void deleteCorpToken(@Param("suiteKey") String suiteKey,@Param("corpId") String corpId){

    }

}

