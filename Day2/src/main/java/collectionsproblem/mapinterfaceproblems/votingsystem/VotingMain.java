package collectionsproblem.mapinterfaceproblems.votingsystem;

public class VotingMain {
    public static void main(String[] args) {
        VotingSystemCode votingSystem = new VotingSystemCode();

        // Casting votes
        votingSystem.castVote("Aditya");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Aditya");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Dev");

        votingSystem.displayResults();
    }
}
