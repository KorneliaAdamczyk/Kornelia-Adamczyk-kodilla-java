package singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void lastLog() {
        Logger.getInstance().log("ABC@123");
    }

    @Test
    public void getLastLog(){

        //Given
        //When
        String lastLog=Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("ABC@123",lastLog);

    }
}
