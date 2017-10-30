package com.dingtalk.isv.access.biz.suite.dao;

import com.dingtalk.isv.access.biz.suite.model.AppDO;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("appDao")
public class AppDao {

    /**
     * 使用内存map模拟的数据库，正式项目中需要修改成访问数据库
     */
    private Map<Long, AppDO> db = new HashMap<Long, AppDO>();


    /**
     * 创建一个套件
     *
     * @param appDO
     */
    public void addApp(AppDO appDO) {
        db.put(appDO.getAppId(), appDO);
    }

    /**
     * 根据suiteKey查询为应用
     *
     * @param suiteKey
     * @return
     */
    public List<AppDO> getAppBySuiteKey(@Param("suiteKey") String suiteKey) {

        List<AppDO> data = new ArrayList<AppDO>();
        for (AppDO app : db.values()) {
            if (StringUtils.equals(suiteKey, app.getSuiteKey())) {
                data.add(app);
            }
        }
        return data;
    }


}

