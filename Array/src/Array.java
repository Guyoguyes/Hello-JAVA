public class Array {
    public static void main(String[] args) {
        System.out.println("Arrays made of strings");
        String[] pLanguages = {"Java", "c#", "Python", "Html"};

        for (int i = 0; i < pLanguages.length; i++){
            System.out.println(pLanguages[i]);
        }

//        System.out.println(pLanguages);

        System.out.println("Arrays of interger");
        int number[] = {3, 5, 3, 5};



        //or
        // int[] number

        int sum = 0;

        for (int i = 0; i < number.length; i++){
            sum = sum + number[i];
            System.out.println(number[i]);
        }

        double average = sum / number.length;
        System.out.println(average);
    }
}
