package com.hjn123.myandroidcodeback.dao;

import com.hjn123.myandroidcodeback.pojo.ExpressCompany;
import java.util.List;

public interface ExpressCompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express_company
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express_company
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    int insert(ExpressCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express_company
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    ExpressCompany selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express_company
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    List<ExpressCompany> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express_company
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    int updateByPrimaryKey(ExpressCompany record);
}