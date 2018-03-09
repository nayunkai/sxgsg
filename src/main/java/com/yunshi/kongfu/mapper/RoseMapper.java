package com.yunshi.kongfu.mapper;

import com.yunshi.kongfu.entity.Rose;
import com.yunshi.kongfu.entity.RoseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    int countByExample(RoseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    int deleteByExample(RoseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    int insert(Rose record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    int insertSelective(Rose record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    List<Rose> selectByExample(RoseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    Rose selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") Rose record, @Param("example") RoseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    int updateByExample(@Param("record") Rose record, @Param("example") RoseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    int updateByPrimaryKeySelective(Rose record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kongfu_rose
     *
     * @mbggenerated Mon Jan 29 10:26:27 CST 2018
     */
    int updateByPrimaryKey(Rose record);
}