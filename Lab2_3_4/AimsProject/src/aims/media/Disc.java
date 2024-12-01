//Mai Minh Quân - 20225661 
//Class "Disc" extends "Media"
package Lab2_3_4.AimsProject.src.aims.media;
public class Disc extends Media{
    //Mai Minh Quân - 20225661 - Attribute
    private String director;
    private float length;

    //Mai Minh Quân - 20225661 - Constructor
    public Disc(int id, String title, String category, float cost, String director, float length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    public Disc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }


    

    //Mai Minh Quân - 20225661 - Getters and Setters
    public String getDirector() { return director; }

    public float getLength() { return length; }

    public void setLength(float length) {
        this.length = length;
    }
    public String toString() {
        return "DVD: " +
                " [id = "  + getId() +
                ", title = '" + getTitle() + '\'' +
                ", category = '" + getCategory() + '\'' +
                ", director: " + getDirector() +
                ", length = " + getLength() + ", cost= " + getCost() + "$]";
    }
}
