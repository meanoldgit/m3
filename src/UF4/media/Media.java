package UF4.media;

public class Media {
    private String name;
    private int length;

    public Media(String name, int length) {
        this.name = name;
        this.length = length;
    }

    // Getters & Setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void main(String[] args) {
        Music nirvana = new Music("", 300, "Nirvana", "Grunge");
        System.out.println(nirvana.getName());
    }
}
