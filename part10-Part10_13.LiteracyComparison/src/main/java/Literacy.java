public class Literacy {

    private String topic;
    private String whoIsSurveyed;
    private String sex;
    private String country;
    private int year;
    private double literacyPercentage;

    public Literacy(String topic, String whoIsSurveyed, String sex, String country, int year,
            double literacyPercentage) {
        this.topic = topic;
        this.whoIsSurveyed = whoIsSurveyed;
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.literacyPercentage = literacyPercentage;
    }

    public String getTopic() {
        return topic;
    }

    public String getWhoIsSurveyed() {
        return whoIsSurveyed;
    }

    public String getSex() {
        String[] theSex = this.sex.split(" ");
        return theSex[1];
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getLiteracyPercentage() {
        return literacyPercentage;
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + getSex() + ", " + getLiteracyPercentage();
    }

}
