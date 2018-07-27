package com.weidai.data.mapper;

import com.weidai.data.model.TbMobileCity;
import com.weidai.data.model.TbMobileCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMobileCityMapper {
    int countByExample(TbMobileCityExample example);

    int deleteByExample(TbMobileCityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbMobileCity record);

    int insertSelective(TbMobileCity record);

    List<TbMobileCity> selectByExample(TbMobileCityExample example);

    TbMobileCity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbMobileCity record, @Param("example") TbMobileCityExample example);

    int updateByExample(@Param("record") TbMobileCity record, @Param("example") TbMobileCityExample example);

    int updateByPrimaryKeySelective(TbMobileCity record);

    int updateByPrimaryKey(TbMobileCity record);
}