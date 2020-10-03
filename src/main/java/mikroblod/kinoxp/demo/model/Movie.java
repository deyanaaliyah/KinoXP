package mikroblod.kinoxp.demo.model;

public class Movie {
    private String title;
    private String genre;
    private String runningTime;
    private String releaseDate;
    private int seatings;
    private String bio;
    private int ageLimit;
    private String imageLink;

    public Movie(String title, String genre, String runningTime, String releaseDate, int seatings, String bio, int ageLimit, String imageLink) {
        this.title = title;
        this.genre = genre;
        this.runningTime = runningTime;
        this.releaseDate = releaseDate;
        this.seatings = seatings;
        this.bio = bio;
        this.ageLimit = ageLimit;
        this.imageLink = imageLink;
    }

    public Movie(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getSeatings() {
        return seatings;
    }

    public void setSeatings(int seatings) {
        this.seatings = seatings;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @Override
    public String toString() {
        return "\nMovie:" + "\n---------------" +
                "\nTitle: " + title +
                "\nGenre: " + genre +
                "\nRunningTime " + runningTime +
                "\nReleaseDate " + releaseDate +
                "\nSeatings left" + seatings +
                "\nBio: " + bio +
                "\nAge limit:" + ageLimit +
                "\nImage link" + imageLink;
    }
}