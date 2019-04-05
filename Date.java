/**
  Represent a date
 */
public class Date{
    private int y,m,d; // implicit bounds on m and d


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public int compareTo(Object otherObj) {
      return 10000 * (y - ((Date)otherObj).y) + 100 * (m - ((Date)otherObj).m) + d - ((Date)otherObj).d;
    }
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}
