package com.dingtalk.isv.access.biz.suite.dao;

import com.dingtalk.isv.access.biz.suite.model.ChannelDO;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.PipedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("channelDao")
public class ChannelDao {

    private Map<Long, ChannelDO> db = new HashMap<Long, ChannelDO>();

	/**
	 * 增加一个服务窗应用
	 * @param channelDO
	 */
	public void addChannel(ChannelDO channelDO){
	    db.put(channelDO.getAppId(), channelDO);
    }

	/**
	 * 根据suiteKey查询服务窗应用
	 * @param suiteKey
	 * @return
	 */
	public List<ChannelDO> getAppBySuiteKey(@Param("suiteKey") String suiteKey){
        List<ChannelDO> data = new ArrayList<ChannelDO>();
	    for(ChannelDO channelDO : db.values()){
	        if(StringUtils.equals(suiteKey, channelDO.getSuiteKey())){
	            data.add(channelDO);
            }
        }
        return data;
    }

	/**
	 * 删除服务窗应用
	 * @param corpId
	 * @param appId
     */
	public void deleteCorpApp(@Param("corpId")String corpId,@Param("appId")Long appId){
	    db.remove(appId);
    }


}

