package com.dhlk.subcontract.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dhlk.entity.sub.SubpackageMessage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 消息(SubpackageMessage)表数据库访问层
 *
 * @author xkliu
 * @since 2021-03-12 09:23:56
 */
@Repository
public interface SubpackageMessageDao extends BaseMapper<SubpackageMessage> {


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SubpackageMessage queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SubpackageMessage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param subpackageMessage 实例对象
     * @return 对象列表
     */
    List<SubpackageMessage> queryAll(SubpackageMessage subpackageMessage);

    /**
     * 新增数据
     *
     * @param subpackageMessage 实例对象
     * @return 影响行数
     */
    int insert(SubpackageMessage subpackageMessage);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SubpackageMessage> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SubpackageMessage> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SubpackageMessage> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<SubpackageMessage> entities);

    /**
     * 修改数据
     *
     * @param subpackageMessage 实例对象
     * @return 影响行数
     */
    int update(SubpackageMessage subpackageMessage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 查看所有消息
     * @return
     */
    List<SubpackageMessage> checkAll();
}

