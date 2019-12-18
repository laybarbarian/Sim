package com.hp.daily.dao;


import java.util.List;

import com.hp.daily.entity.HpUser;
import com.hp.daily.entity.HpUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface HpUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    int countByExample(HpUserExample example);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    int deleteByExample(HpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    int insert(HpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    int insertSelective(HpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    List<HpUser> selectByExample(HpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    HpUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") HpUser record, @Param("example") HpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    int updateByExample(@Param("record") HpUser record, @Param("example") HpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    int updateByPrimaryKeySelective(HpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_user
     *
     * @mbggenerated Mon Oct 28 08:31:04 CST 2019
     */
    int updateByPrimaryKey(HpUser record);
}