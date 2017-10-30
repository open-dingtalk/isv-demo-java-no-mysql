package com.dingtalk.isv.access.biz.corp.dao;

import com.dingtalk.isv.access.biz.corp.model.CorpDO;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("corpDao")
public class CorpDao {

    List<CorpDO> db = new ArrayList<CorpDO>();


    /**
     * 创建一个企业信息
     *
     * @param corpDO
     */
    public void saveOrUpdateCorp(CorpDO corpDO) {
        db.add(corpDO);
    }

    /**
     * 根据corpId查询企业
     *
     * @param corpId
     * @return
     */
    public CorpDO getCorpByCorpId(@Param("corpId") String corpId){
        for(CorpDO corpDO : db){
            if(StringUtils.equals(corpId, corpDO.getCorpId())){
                return corpDO;
            }
        }
        return null;
    }


}

