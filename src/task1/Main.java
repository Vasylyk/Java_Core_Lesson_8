/**
 *Logos IT Academy
 *Author: Vadym
 */
package task1;
/**
 * @author Vadym
 * @version 1.2
 * @since 1
 * @exceptions WrongInputConsoleParametersException
 */
public class Main {
    public static void main(String[] args) {
        //this is main method
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
