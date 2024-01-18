public class CD implements Packable {

    private String artist;
    private String nameOfCD;
    private int publicationYear;

    public CD(String artist, String nameOfCD, int publicationYear) {
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.nameOfCD + " (" + this.publicationYear + ")";
    }

    @Override
    public double weight() {
        return 0.1;
    }
}
