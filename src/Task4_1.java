public class Task4_1 {
    public static void main(String[] args) {
        int result;
        Vote vote;
        vote = new Vote(13, 0);
        result = getVoteCount(vote);
        System.out.println(result);
        result = getVoteCount(new Vote(2, 33));
        System.out.println(result);
        result = getVoteCount(new Vote(132, 32));
        System.out.println(result);

    }

    public static class Vote {
        public int upvotes;
        public int downvotes;

// Конструктор класу Vote, який приймає та зберігає два значення.
        public Vote(int upvotes, int downvotes) {
            this.upvotes = upvotes;
            this.downvotes = downvotes;
        }


    }

    private static int getVoteCount(Vote vote) {
        return vote.upvotes - vote.downvotes;
    }

}
