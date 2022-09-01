package ch.course;

import ch.course.quote.Quote;

public class PrivatePublicPackageVisible {
    public static void main(String[] args) {
        Line.longLine();
        Quote.quote();
    }
}

class Line {
    static void line() {
        System.out.println("---");
    }

    public static void longLine() {
        line();
    }
}
