package com.hp.daily.dao;





import com.hp.daily.entity.HpImg;
import com.hp.daily.entity.HpImgExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HpImgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    int countByExample(HpImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    int deleteByExample(HpImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    int insert(HpImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    int insertSelective(HpImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    List<HpImg> selectByExample(HpImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    HpImg selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    int updateByExampleSelective(@Param("record") HpImg record, @Param("example") HpImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    int updateByExample(@Param("record") HpImg record, @Param("example") HpImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    int updateByPrimaryKeySelective(HpImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hp_img
     *
     * @mbggenerated Sat Nov 09 10:21:52 CST 2019
     */
    int updateByPrimaryKey(HpImg record);
}