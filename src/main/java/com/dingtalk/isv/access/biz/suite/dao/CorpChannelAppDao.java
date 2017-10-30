package com.dingtalk.isv.access.biz.suite.dao;

import com.dingtalk.isv.access.biz.suite.model.CorpAppDO;
import com.dingtalk.isv.access.biz.suite.model.CorpChannelAppDO;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 企业使用微应用关联DAO
 * Created by lifeng.zlf on 2016/1/19.
 */
@Repository("corpChannelAppDao")
public class CorpChannelAppDao {

    private List<CorpChannelAppDO> db = new ArrayList<CorpChannelAppDO>();

    /**
     * 创建一个企业使用微应用记录
     * @param corpChannelAppDO
     */
    public void saveOrUpdateCorpChannelApp(CorpChannelAppDO corpChannelAppDO){
        db.add(corpChannelAppDO);
    }

    /**
     * 获取一个企业使用微应用记录
     * @param corpId
     * @param appId
     */
    public CorpChannelAppDO getCorpChannelApp(@Param("corpId") String corpId, @Param("appId") Long appId){

        for(CorpChannelAppDO appDO : db){
            if(StringUtils.equals(corpId, appDO.getCorpId())&&appId.equals(appDO.getAppId())){
                return appDO;
            }
        }
        return null;
    }

    /**
     * 删除一个企业使用微应用记录
     * @param corpId
     * @param appId
     */
    public void deleteCorpChannelApp(@Param("corpId") String corpId, @Param("appId") Long appId){

    }

}

