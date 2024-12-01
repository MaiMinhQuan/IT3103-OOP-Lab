//Mai Minh Quân - 20225661
//Class "Track"
package Lab2_3_4.AimsProject.src.aims.media;

public class Track {
    //Mai Minh Quân - 20225661 - Attribute
    private String title;
    private int length;
    //Mai Minh Quân - 20225661 - Getters
    public int getLength() { return length; }
    public String getTitle() { return title; }

    //Mai Minh Quân - 20225661 - Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    //Mai Minh Quân - 20225661 - override equals
    public boolean equals(Track tmp) {
        return (title == tmp.getTitle()) && (length == tmp.getLength());
    }
}
