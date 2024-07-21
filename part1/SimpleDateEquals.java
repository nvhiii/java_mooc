
public class SimpleDateEquals {

    private int day;
    private int month;
    private int year;

    public SimpleDateEquals(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDateEquals other) {
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

    public int differenceInYears(SimpleDateEquals other) {
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

    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (!(object instanceof SimpleDateEquals)) {
            return false;
        }

        SimpleDateEquals date = (SimpleDateEquals) object;

        if (this.day == date.day && this.month == date.month && this.year == date.year) {
            return true;
        }

        return false;

    }

}
