public class Book
{
    private String title;
    private String author;
    private String genre;
    private String status;
    private double rating;
    
    public Book(String title, String author, String genre, String status, double rating)
    {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.status = status;
        this.rating = rating;
    }
    public String getTitle() {return title;}
    public void setTitle(String newTitle) { this.title = newTitle;}

    public String getAuthor() { return author; }
    public void setAuthor(String newAuthor) { this.author = newAuthor; }

    public String getGenre() { return genre; }
    public void setGenre(String newGenre) { genre = newGenre; }

    public String getStatus() { return status; }
    public void setStatus(String newStatus) { status = newStatus; }

    public double getRating() { return this.rating; }
    public void setRating(double rating) { this.rating = rating; }

    public String getStars() 
    {
        StringBuilder stars = new StringBuilder();

        int fullStars = (int) rating;
        boolean hasHalfStar = (rating - fullStars) >= 0.5;
        int emptyStars = 5 - fullStars - (hasHalfStar ? 1 : 0);

        for (int i = 0; i < fullStars; i++) {
            stars.append("★");
        }

        if (hasHalfStar) {
            stars.append("⯪");
        }
   
        for (int i = 0; i < emptyStars; i++) {
            stars.append("☆");
        }

        return stars.toString();
    }

    public String toString()
    {
        return title + " by " + author + ", " + genre + ", " + this.getStars();
    }
}
