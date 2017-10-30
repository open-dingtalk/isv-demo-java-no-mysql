package com.dingtalk.isv.access.biz.suite.dao;

import com.dingtalk.isv.access.biz.suite.model.SuiteDO;
import com.google.common.collect.Lists;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("suiteDao")
public class SuiteDao {

    private Map<String, SuiteDO> db = new HashMap<String, SuiteDO>();

    @Value("#{config['suite.token']}")
    private String token;
    @Value("#{config['suite.aes']}")
    private String aesKey;
    @Value("#{config['suite.key']}")
    String suiteKey;
    @Value("#{config['suite.secrect']}")
    String suiteSecrect;

    /**
     * 因为作为一个正常的isv来说,套件的格式不会太多
     * 所以这个接口不需要加分页
     *
     * @return
     */
    public List<SuiteDO> getAllSuite() {
        return Lists.newArrayList(db.values());
    }


    /**
     * 创建一个套件
     *
     * @param suiteDO
     */
    public void addSuite(SuiteDO suiteDO) {
        db.put(suiteDO.getSuiteKey(), suiteDO);
    }

    /**
     * 根据suiteKey查询套件
     *
     * @param suiteKey
     * @return
     */
    public SuiteDO getSuiteByKey(@Param("suiteKey") String suiteKey) {

        SuiteDO suiteDO = new SuiteDO();
        suiteDO.setSuiteKey(suiteKey);
        suiteDO.setSuiteSecret(suiteSecrect);
        suiteDO.setEncodingAesKey(aesKey);
        suiteDO.setToken(token);
        return suiteDO;
    }


}

