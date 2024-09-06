package com.mlh.service.impl;
import com.mlh.mapper.TaskDao;
import com.mlh.pojo.Task;
import com.mlh.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author 缪林辉
 * @date 2024/9/5 17:01
 * @DESCRIPTION
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskMapper;

    @Override
    public void save(Task task) {
        taskMapper.save(task);
    }
}
