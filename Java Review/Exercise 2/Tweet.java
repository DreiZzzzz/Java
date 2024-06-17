/**
 * Tweet class that holds the attributes and methods of a tweet post
 */
public class Tweet {
    /**
     * Attributes of the class
     */
    private String userHandle, caption;
    private int likes, imageId;
    private int createdAtYear, createdAtMonth, createdAtDay;

    /** 
     * The sole constructor of a Tweet class 
     * 
     * @param userHandle  String value that represents the user's handle
     * @param caption  String value that contains the caption of a tweet
     * @param likes  integer value indicating the number of likes of a tweet
     * @param imageId  integer value indicating the unique id of the image
     * @param createdAtYear  integer value indicating the year a tweet was created
     * @param createdAtMonth  integer value indicating the month a tweet was created
     * @param createdAtDay  integer value indicating the day a tweet was created
     */ 
    public Tweet(String userHandle, String caption, int likes, int imageId, int createdAtYear, int createdAtMonth, int createdAtDay) {
        this.userHandle = userHandle;
        this.caption = caption;
        this.likes = likes;
        this.imageId = imageId;
        this.createdAtYear = createdAtYear;
        this.createdAtMonth = createdAtMonth;
        this.createdAtDay = createdAtDay;
    }

    /**
     * getUserHandle method that returns the userHandle in String
     * 
     * @return String representing the user's handle
     */
    public String getUserHandle() {
        return userHandle;
    }

    /**
     * getCaption method that returns the caption in String
     * 
     * @return String representing the caption of the tweet
     */
    public String getCaption() {
        return caption;
    }

    /**
     * getLikes method that returns the number of likes of a tweet in int
     * 
     * @return int representing the number of likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * getImageId method that returns the unique id of an image in int
     * 
     * @return int representing the unique id of the image
     */
    public int getImageId() {
        return imageId;
    }

    /**
     * getCreatedAt method that returns the day, month, and year the tweet was created in String format
     * 
     * @return String representing the creation date of the tweet in "day/month/year" format
     */
    public String getCreatedAt() {
        return createdAtDay + "/" + createdAtMonth + "/" + createdAtYear;
    }

    /**
     * setLikes method that sets the number of likes of a tweet
     * 
     * @param newLikes  new integer value indicating the newd number of likes
     */
    public void setLikes(int newLikes) {
        this.likes = newLikes;
    }
}

