package basictest.testingbeforeandaftertest;

import junittestproblems.basic.testingbeforandafter.Database;
import org.junit.Assert;
import org.junit.jupiter.api.*;

public class JavaTest {

    @BeforeEach
    void setUp() {
        Database.connect();
    }

    @AfterEach
    void tearDown() {
        Database.disconnect();
    }

    @Test
    void testConnectionEstablished() {
        Assert.assertTrue("Database should be connected.", Database.isConnected());
    }

    @Test
    void testConnectionClosedAfterEachTest() {
        Database.disconnect();
        Assert.assertFalse("Database should be disconnected.", Database.isConnected());
    }
}
