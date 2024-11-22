//Mai Minh Quân
//20225661
//Class "DigitalVideoDisc" source code
package Lab2_3.AimsProject.src.aims.disc;
public class DigitalVideoDisc {
    //Mai Minh Quân - 20225661 -Khai báo thuộc tính
    private static int nbDigitalVideoDiscs = 0; //Mai Minh Quân - 20225661 - Class attribute 
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id; //Mai Minh Quân - 20225661 - Instance attribute ID

    //Phương thức khởi dựng các thông tin của đĩa DVD
    //Các phương thức khởi dựng trên nạp chồng
    //Mai Minh Quân - 20225661 -Constructor by title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    }
    //Mai Minh Quân - 20225661 - Constructor by category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    }
    //Mai Minh Quân - 20225661 - Constructor by title, category , director, cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    }
    //Mai Minh Quân - 20225661 - Constructor by all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    }

    //Mai Minh Quân - 20225661 - Các phương thức lấy dữ liệu của đĩa DVD

    //Mai Minh Quân - 20225661 - Getter for title
    public String getTitle() { return title; }
    //Mai Minh Quân - 20225661 - Getter for category
    public String getCategory() { return category; }
    //Mai Minh Quân - 20225661 - Getter for director
    public String getDirector() { return director; }
    //Mai Minh Quân - 20225661 - Getter for length
    public int getLength() { return length; }
    //Mai Minh Quân - 20225661 - Getter for cost
    public float getCost() { return cost; }
    public int getId() { return id; } // Ham lay id

    //Mai Minh Quân - 20225661 - Cac phuong thuc chinh sua thuoc tinh cua du lieu
    //Mai Minh Quân - 20225661 - Setting for title
    public void setTitle(String titleSet){ title = titleSet; }
    public void setCategory(String categorySet){ category = categorySet; }
    public void setDirector(String directorSet){ director = directorSet; }
    public void setLength(int lengthSet){ length = lengthSet; }
    public void setCost(float costSet){ cost = costSet; }
}
