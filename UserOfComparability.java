/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");

        System.out.println( System.lineSeparator()
                          + "Date comparisons");
        Date d = new Date(6, 6, 6);
        reportRelationship( "Date vs. itself", d, d, "0");
        reportRelationship( "Date vs. later date", d
                          , new Date(2019, 2, 2), "negative int");
        reportRelationship( "Date vs. earlier date", d
                          , new Date(1, 12, 30), "positive int");
        System.out.println("");
        //reportRelationship( "two dogs", new IncomparableDog(), new IncomparableDog(), "n/a");
        // cannot find symbol
        //    + a.compareTo( b)
        //       ^
        // symbol:   method compareTo(IncomparableDog)
        // location: variable a of type IncomparableDog
        // 1 error
        // reportRelationship( "Date vs point", new Date(1, 2, 3), new Point (4.5, 6.7), "n/a");
        // Exception in thread "main" java.lang.ClassCastException: Point cannot be cast to Date
        // at Date.compareTo(Date.java:17)
        // at UserOfComparability.reportRelationship(UserOfComparability.java:105)
        // at UserOfComparability.main(UserOfComparability.java:44)
    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship
      ( String description
      , Point a
      , Point b
      , String expect
      ) {
        System.out.println( description);

        // check
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning:
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */

          + " ...expecting " + expect
          + System.lineSeparator());
     }
     private static void reportRelationship
       ( String description
       , Date a
       , Date b
       , String expect
       ) {
         System.out.println( description);

         // check
         System.out.println(
             a + " compareTo " + b + ": "
           + a.compareTo( b)
             /* eventually expecting a compiler warning:
               warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
               where T is a type-variable:
                 T extends Object declared in interface Comparable
              */

           + " ...expecting " + expect
           + System.lineSeparator());
      }

      private static void reportRelationship
        ( String description
        , Date a
        , Point b
        , String expect
        ) {
          System.out.println( description);

          // check
          System.out.println(
              a + " compareTo " + b + ": "
            + a.compareTo( b)
              /* eventually expecting a compiler warning:
                warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
                where T is a type-variable:
                  T extends Object declared in interface Comparable
               */

            + " ...expecting " + expect
            + System.lineSeparator());
       }
}
