package com.infosys.oracle.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SqlDao {
   int clear(@Param("table") String table,@Param("syncId") String syncId);
}
