package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String TASKLISTNAME = "DONE";
    @Test
    void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList(TASKLISTNAME, "yay");
        //When
        taskListDao.save(taskList);
        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListDao.findById(id);
        Assertions.assertTrue(readTask.isPresent());
        //CleanUp
        taskListDao.deleteById(id);
    }
    @Test
    void testTaskListDaoFindByTaskListName() {
        //GIVEN
        TaskList taskList = new TaskList(TASKLISTNAME,"yay");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //WHEN
        List<TaskList> readTasksList = taskListDao.findByListName(listName);
        //THEN
        Assertions.assertEquals(1,readTasksList.size());
        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);

    }
}
