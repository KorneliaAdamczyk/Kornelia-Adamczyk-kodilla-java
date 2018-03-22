package strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){

        //Given
        User user1 = new Millenials("Ania");
        User user2 = new YGeneration("Karol");
        User user3 = new ZGeneration("Piotrek");

        //When
        String result1 = user1.share();
        String result2 = user2.share();
        String result3 = user3.share();

        //Then
        Assert.assertEquals("Facebook",result1);
        Assert.assertEquals("Twitter",result2);
        Assert.assertEquals("Snapchat",result3);


    }

    @Test
    public void testIndividualSharingStrategy(){

        //Given
        User user1 = new Millenials("Ania");

        //When
        user1.sharePost(new TwitterPublisher());
        String result1 = user1.share();

        //Then
        Assert.assertEquals("Twitter",result1);



    }
}
