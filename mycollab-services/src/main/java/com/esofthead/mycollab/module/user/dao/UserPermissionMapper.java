package com.esofthead.mycollab.module.user.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.user.domain.UserPermission;
import com.esofthead.mycollab.module.user.domain.UserPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPermissionMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    int countByExample(UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    int deleteByExample(UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    int insert(UserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    int insertSelective(UserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    List<UserPermission> selectByExample(UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    UserPermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    int updateByExampleSelective(@Param("record") UserPermission record, @Param("example") UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    int updateByExample(@Param("record") UserPermission record, @Param("example") UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    int updateByPrimaryKeySelective(UserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    int updateByPrimaryKey(UserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    Integer insertAndReturnKey(UserPermission value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_permission
     *
     * @mbggenerated Tue Apr 29 13:31:24 ICT 2014
     */
    void massUpdateWithSession(@Param("record") UserPermission record, @Param("primaryKeys") List primaryKeys);
}