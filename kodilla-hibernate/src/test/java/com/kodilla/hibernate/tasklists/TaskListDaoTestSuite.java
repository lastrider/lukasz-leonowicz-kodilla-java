package com.kodilla.hibernate.tasklists;

import com.kodilla.hibernate.task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("name", "description");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(name);

        //Then
        String nameFromDB = readTasksList.get(0).getListName();
        Assert.assertEquals(name, nameFromDB);

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);
    }
}