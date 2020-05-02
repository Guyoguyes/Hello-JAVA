public class challenge3 {
    public static void main(String[] args) {
        student studentOne = new student("John", "Doe", 2020, 46.5);
        student studentTwo = new student("Hillary", "Wilton", 2021, 42.7);

         studentOne.ExpectationYear();
         studentTwo.ExpectationYear();
         System.out.println(studentOne.graduationYear);
         System.out.println(studentTwo.firstName);
         System.out.println(studentTwo.graduationYear);

    }
}
