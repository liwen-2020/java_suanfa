import org.jetbrains.annotations.NotNull;

public class Date implements Comparable<Date>{
    private final int day;
    private final int month;
    private final int year;

    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int day() {return day;}
    public int month() {return month;}
    public int year() {return year;}

    @Override
    public String toString(){
        return year() + "/" + month() + "/" + day();
    }

    @Override
    public boolean equals(Object other){
        if(this == other) return true;
        if(other == null) return false;
        if(this.getClass() != other.getClass())
            return false;
        Date that = (Date) other;
        if(this.day != that.day)
            return false;
        if(this.month != that.month)
            return false;
        if(this.year != that.year)
            return false;
        return true;
    }

    @Override
    public int compareTo(@NotNull Date other) {
        if(this.year > other.year)
            return +1;
        if(this.year < other.year)
            return -1;
        if(this.month > other.month)
            return +1;
        if(this.month < other.month)
            return -1;
        if(this.day > other.day)
            return +1;
        if(this.day < other.day)
            return -1;

        return 0;
    }
}
