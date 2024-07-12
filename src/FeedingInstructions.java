
public class FeedingInstructions {
    private int feedingInstructionsId;
    private String details;

    // Constructors, getters, setters, and other methods
    public FeedingInstructions(int feedingInstructionsId, String details) {
        this.feedingInstructionsId = feedingInstructionsId;
        this.details = details;
    }

    public int getFeedingInstructionsId() {
        return feedingInstructionsId;
    }

    public void setFeedingInstructionsId(int feedingInstructionsId) {
        this.feedingInstructionsId = feedingInstructionsId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
