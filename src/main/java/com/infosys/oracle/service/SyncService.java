package com.infosys.oracle.service;

import com.infosys.oracle.dao.SqlDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
public class SyncService {

    @Resource
    private SqlDao sqlDao;

    @Transactional(rollbackFor = Exception.class)
    public int clear(String table, String syncId) throws Exception {
        return sqlDao.clear(table, syncId);
    }

}
