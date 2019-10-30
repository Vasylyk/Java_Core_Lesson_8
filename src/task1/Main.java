package task1;

public class Main {
    public static void main(String[] args) {
        IsExist ie = new IsExist();
        ie.isExist();
        ie.sameSeason();
        ie.sameDays();
        ie.lessDays();
        ie.moreDays();
        ie.nextSeason();
        ie.previousSeason();
        Parity p = new Parity();
        p.evenNumberOfDays();
        p.oddNumberOfDays();
        p.parity();
    }
}
