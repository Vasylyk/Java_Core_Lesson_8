package task1;

public enum Month {
    JANUARY(31,Seasons.WINTER.name()),
    FEBRUARY(29,Seasons.WINTER.name()),
    MARCH(31,Seasons.SPRING.name()),
    APRIL(30,Seasons.SPRING.name()),
    MAY(31,Seasons.SPRING.name()),
    JUNE(30,Seasons.SUMER.name()),
    JULY(31,Seasons.SUMER.name()),
    AUGUST(31,Seasons.SUMER.name()),
    SEPTEMBER(30,Seasons.AUTUMN.name()),
    OCTOBER(31,Seasons.AUTUMN.name()),
    NOVEMBER(30,Seasons.AUTUMN.name()),
    DECEMBER(31,Seasons.WINTER.name());
    int days;
    String season;

    Month(int days, String season) {
        this.days = days;
        this.season = season;
    }

    public int getDays() {
        return days;
    }

    public String getSeason() {
        return season;
    }
}
