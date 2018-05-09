package patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User facebookGuy = new Millenials("john");
        User twitterGuy = new YGeneration("sam");
        User snapGuy = new ZGeneration("paul");
        //When
        String faceGuyUses = facebookGuy.sharePost();
        String twitterGuyUses = twitterGuy.sharePost();
        String snapGuyUses = snapGuy.sharePost();
        //Then
        Assert.assertEquals("Fejss", faceGuyUses);
        Assert.assertEquals("Twitter", twitterGuyUses);
        Assert.assertEquals("Snapchat", snapGuyUses);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User facebookGuy = new Millenials("john");
        //When
        facebookGuy.setSocialPublisher(new TwitterPublisher());
        //Then
        Assert.assertEquals("Twitter", facebookGuy.sharePost());
    }
}