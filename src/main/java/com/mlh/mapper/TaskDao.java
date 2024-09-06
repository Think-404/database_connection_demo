package com.mlh.mapper;

import com.mlh.pojo.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 缪林辉
 * @date 2024/9/5 18:27
 * @DESCRIPTION
 */
@Mapper
public interface TaskDao {
    void save(@Param("task") Task task);
}
