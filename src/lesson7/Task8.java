package lesson7;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("January days: " + getDaysInMonth(Month.JANUARY));
        System.out.println("February days: " + getDaysInMonth(Month.FEBRUARY));
        System.out.println("June days: " + getDaysInMonth(Month.JUNE));
    }

    public static int getDaysInMonth(Month month) {
        switch (month) {
            case JANUARY:
                return month.getDays();
            case FEBRUARY:
                return month.getDays();
            case MARCH:
                return month.getDays();
            case APRIL:
                return month.getDays();
            case MAY:
                return month.getDays();
            case JUNE:
                return month.getDays();
            case JULY:
                return month.getDays();
            case AUGUST:
                return month.getDays();
            case SEPTEMBER:
                return month.getDays();
            case OCTOBER:
                return month.getDays();
            case NOVEMBER:
                return month.getDays();
            case DECEMBER:
                return month.getDays();
        }
        throw new IllegalArgumentException();
    }
}

enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int days;

    Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return this.days;
    }
}

