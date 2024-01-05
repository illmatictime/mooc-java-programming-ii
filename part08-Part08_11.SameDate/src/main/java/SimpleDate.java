
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if(!(object instanceof SimpleDate)){
            return false;
        }

        SimpleDate comparedObject = (SimpleDate) object;

        if(this.day == comparedObject.day && this.month == comparedObject.month && this.year == comparedObject.year){
            return true;
        }

        return false;
        // Other possible solution
        // if (obj == null) {
        //     return false;
        // }
        // if (getClass() != obj.getClass()) {
        //     return false;
        // }
        // final SimpleDate other = (SimpleDate) obj;
        // if (this.day != other.day) {
        //     return false;
        // }
        // if (this.month != other.month) {
        //     return false;
        // }
        // if (this.year != other.year) {
        //     return false;
        // }
        // return true;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

}
