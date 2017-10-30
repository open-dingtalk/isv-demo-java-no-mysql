package com.dingtalk.isv.access.biz.suite.dao;

import com.dingtalk.isv.access.biz.suite.model.CorpSuiteAuthFaileDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mint on 16-1-26.
 */
@Repository("corpSuiteAuthFaileDao")
public class CorpSuiteAuthFaileDao {

    private List<CorpSuiteAuthFaileDO> db = new ArrayList<CorpSuiteAuthFaileDO>();

    /**
     * 创建一个授权失败的对象
     * @param corpSuiteAuthFaileDO
     */
    public void addOrUpdateCorpSuiteAuthFaileDO(CorpSuiteAuthFaileDO corpSuiteAuthFaileDO){
         db.add(corpSuiteAuthFaileDO);
    }



    public List<CorpSuiteAuthFaileDO> getCorpSuiteAuthFaileList(@Param("offset")Integer offset, @Param("limit")Integer limit){
        return db.subList(offset, Math.min(offset+limit, db.size()));
    }


    public void deleteById(@Param("id")Long id){
        //TODO
    }
}
