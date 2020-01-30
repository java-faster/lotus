package com.coder520.mamabuyschedulerservice.stock.dao;

import com.coder520.mamabuyschedulerservice.stock.entity.StockFlow;
import com.coder520.mamabuyschedulerservice.stock.entity.StockFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockFlowMapper {
    int countByExample(StockFlowExample example);

    int deleteByExample(StockFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StockFlow record);

    int insertSelective(StockFlow record);

    List<StockFlow> selectByExample(StockFlowExample example);

    StockFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StockFlow record, @Param("example") StockFlowExample example);

    int updateByExample(@Param("record") StockFlow record, @Param("example") StockFlowExample example);

    int updateByPrimaryKeySelective(StockFlow record);

    int updateByPrimaryKey(StockFlow record);
}