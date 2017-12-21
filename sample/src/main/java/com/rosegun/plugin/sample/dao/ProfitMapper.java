package com.rosegun.plugin.sample.dao;

import com.rosegun.plugin.sample.dto.Profit;
import com.rosegun.plugin.sample.dto.ProfitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    long countByExample(ProfitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    int deleteByExample(ProfitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    int insert(Profit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    int insertSelective(Profit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    List<Profit> selectByExample(ProfitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    Profit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    int updateByExampleSelective(@Param("record") Profit record, @Param("example") ProfitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    int updateByExample(@Param("record") Profit record, @Param("example") ProfitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    int updateByPrimaryKeySelective(Profit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profit
     *
     * @mbg.generated Wed Jul 05 12:05:47 CST 2017
     */
    int updateByPrimaryKey(Profit record);
}