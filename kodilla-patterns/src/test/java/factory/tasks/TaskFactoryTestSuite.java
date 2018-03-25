package factory.tasks;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public final class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        boolean result = shoppingTask.isTaskExecuted();

        //Then
        Assert.assertEquals("To buy fruits", shoppingTask.getTaskName());
        Assert.assertEquals(true, result);
    }

    @Test
    public void testFactoryPaintingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        boolean result = paintingTask.isTaskExecuted();

        //Then
        Assert.assertEquals("Painting kitchen", paintingTask.getTaskName());
        Assert.assertEquals(false, result);
    }

    @Test
    public void testFactoryDrivingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        boolean result = drivingTask.isTaskExecuted();

        //Then
        Assert.assertEquals("To drive Grandpa", drivingTask.getTaskName());
        Assert.assertEquals(true,result);
    }


}
