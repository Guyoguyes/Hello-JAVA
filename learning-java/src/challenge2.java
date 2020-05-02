public class challenge2 {

    public static double grossSalary(double hoursPerWeek, double amountPerHour, int vacationDays){
        double weeklyPayCheck = hoursPerWeek * amountPerHour;
        double unpaidDays = vacationDays * amountPerHour * 8;
        double result = (weeklyPayCheck * 52) - unpaidDays;
        return result;

    }

    public static void main(String[] args) {
        double salary = grossSalary(40,15, 20);
        System.out.println(salary);
    }
}
