//Mai Minh Quan - 20225661

package Lab2;
public class DigitalVideoDisc {
    //Mai Minh Quan - 20225661 - Khai báo thuộc tính
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    //Mai Minh Quan - 20225661 - Constructor by title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }
    //Mai Minh Quan - 20225661 - Constructor by category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    //Mai Minh Quan - 20225661 - Constructor by title, category , director, cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    //Mai Minh Quan - 20225661 - Constructor by all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    //Mai Minh Quan - 20225661 - Getter của các thuộc tính
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; } 
}
