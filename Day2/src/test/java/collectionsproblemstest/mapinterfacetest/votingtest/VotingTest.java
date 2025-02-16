package collectionsproblemstest.mapinterfacetest.votingtest;

import collectionsproblem.mapinterfaceproblems.votingsystem.VotingSystemCode;
import org.junit.Assert;
import org.junit.Test;

public class VotingTest {
    @Test
    public void Tester(){
        VotingSystemCode votingSystem = new VotingSystemCode();

        // Casting votes
        votingSystem.castVote("Aditya");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Aditya");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Dev");
        Assert.assertEquals("Aditya",votingSystem.firstKey());
    }
}
