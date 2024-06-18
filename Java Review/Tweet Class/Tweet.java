public class Tweet {
    private String userHandle, caption;
    private int likes, imageId;
    private int createdAtYear, createdAtMonth, createdAtDay;

    public Tweet(String userHandle, String caption, int likes, int imageId, int createdAtYear, int createdAtMonth, int createdAtDay) {
        this.userHandle = userHandle;
        this.caption = caption;
        this.likes = likes;
        this.imageId = imageId;
        this.createdAtYear = createdAtYear;
        this.createdAtMonth = createdAtMonth;
        this.createdAtDay = createdAtDay;
    }

    public String getUserHandle() {
        return userHandle;
    }

    public String getCaption() {
        return caption;
    }

    public int getLikes() {
        return likes;
    }

    public int getImageId() {
        return imageId;
    }

    public String getCreatedAt() {
        return createdAtDay + "/" + createdAtMonth + "/" + createdAtYear;
    }

    public void setLikes(int newLikes) {
    	this.likes = newLikes;
    }
}
