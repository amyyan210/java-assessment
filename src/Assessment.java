import java.util.ArrayList;

public class Assessment {
    public static int square (int number) {
        return number * number;
    }

    public static int sum (int number1, int number2) {
        return number1 + number2;
    }

    public static double sum (double number1, double number2) {
        return number1 + number2;
    }

    public static double average(double[] numbers) {
        double sumOfNumbers = 0;
        for (double number : numbers) {
            sumOfNumbers += number;
        }
        return sumOfNumbers / numbers.length;
    }

    public static ArrayList<User> capitalizeRecords(ArrayList<User> users) {

        for (User user : users)
        if (Character.isUpperCase(user.firstName.charAt(0)) || Character.isUpperCase(user.lastName.charAt(0))) { //each object's first and last names are capitalized
            System.out.println(user.firstName + " " + user.lastName);
        } else { // use setter to capitalize first letter of each first and last name and return copy of the arrayList
            user.setFirstName(
                    Character.toUpperCase(
                            user.firstName.charAt(0)) +
                            user.firstName.substring(1)
            );
            user.setLastName(
                    Character.toUpperCase(
                            user.lastName.charAt(0)) +
                            user.lastName.substring(1)
            );
            System.out.println(user.firstName + " " + user.lastName);
        }

        return users;
    }

    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(sum(1, 2));
        System.out.println(sum(1.0, 2.0));

        double[] numbers = {10, 10, 10};
        System.out.println(average(numbers));

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Amy", "Yanaway", false));
        users.add(new User("Fer", "Mendoza", true));
        users.add(new User("luis", "montealegre", true));
        System.out.println(capitalizeRecords(users));
    }

}
