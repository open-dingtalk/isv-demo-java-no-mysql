package com.dingtalk.isv.access.biz.suite.dao;

import com.dingtalk.isv.access.biz.suite.model.CorpSuiteAuthDO;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lifeng.zlf on 2016/1/19.
 */
@Repository("corpSuiteAuthDao")
public class CorpSuiteAuthDao {

    private List<CorpSuiteAuthDO> db = new ArrayList<CorpSuiteAuthDO>();

    /**
     * 创建一个企业对套件授权对象
     *
     * @param corpSuiteAuthDO
     */
    public void addOrUpdateCorpSuiteAuth(CorpSuiteAuthDO corpSuiteAuthDO){
        db.add(corpSuiteAuthDO);
    }

    /**
     * 根据suiteKey,corpId查询授权信息
     *
     * @param corpId
     * @param suiteKey
     * @return
     */
    public CorpSuiteAuthDO getCorpSuiteAuth(@Param("corpId") String corpId, @Param("suiteKey") String suiteKey){
        for(CorpSuiteAuthDO authDO :db){
            if(StringUtils.equals(corpId, authDO.getCorpId())&&StringUtils.equals(suiteKey,authDO.getSuiteKey())){
                return authDO;
            }
        }
        return null;
    }


    /**
     * 根据suiteKey,corpId解除企业对套件的授权
     *
     * @param corpId
     * @param suiteKey
     * @return
     */
    public void deleteCorpSuiteAuth(@Param("corpId") String corpId, @Param("suiteKey") String suiteKey){

        CorpSuiteAuthDO del = null;
        for(CorpSuiteAuthDO authDO :db){
            if(StringUtils.equals(corpId, authDO.getCorpId())&&StringUtils.equals(suiteKey,authDO.getSuiteKey())){
                del = authDO;
            }
        }
        if(del != null){
            db.remove(del);
        }
    }

    /**
     * 分页查询被授权的企业
     *
     * @param suiteKey
     * @param startRow
     * @param pageSize
     * @return
     */
  public   List<CorpSuiteAuthDO> getCorpSuiteAuthByPage(@Param("suiteKey") String suiteKey, //
                                                 @Param("startRow") int startRow, //
                                                 @Param("pageSize") int pageSize){

      List<CorpSuiteAuthDO> data = new ArrayList<CorpSuiteAuthDO>();
      for(CorpSuiteAuthDO authDO:db){
          if(StringUtils.equals(suiteKey, authDO.getSuiteKey())){
               data.add(authDO);
          }
      }

      return data.subList(startRow, Math.min(data.size(), startRow+pageSize));

    }
}
