//Mai Minh Quân - 20225661 
//Abstract Class "Media"
package Lab2_3_4.AimsProject.src.aims.media;
import java.util.*;
public abstract class Media {
    //Mai Minh Quân - 20225661 - Attribute
    private int id;
    private String title;
    private String category;
    private float cost;

    //Mai Minh Quân - 20225661 - Attribute
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    


    
    //Mai Minh Quân - 20225661 - Constructor
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }



    //Mai Minh Quân - 20225661 - Getters
    public int getId() { return id; }

    public String getTitle() { return title; }

    public String getCategory() { return category; }

    public float getCost() { return cost; }

    //Mai Minh Quân - 20225661 - override equals
    boolean equals(Media o2) { 
        return title.equals(o2.getTitle()); 
    }



    //Mai Minh Quân - 20225661 - Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    //Mai Minh Quân - 20225661 - override toString()
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " [id= " + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost= " + cost + " $]";
    }

    
}



