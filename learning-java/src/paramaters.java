public class paramaters {
    public static double calculatedTip(double listedMealRate, double tipRate, double taxRate){
        double tip = tipRate * listedMealRate;
        double tax = taxRate * listedMealRate;
        double result = tip + tax + listedMealRate;

        return  result;
    }

    public static void main(String[] args) {
       double groupTotalMealPrice = calculatedTip(15, .2, .06);
        System.out.println(groupTotalMealPrice);

        double individualPayment = groupTotalMealPrice/3;
        System.out.println(individualPayment);
    }
}
