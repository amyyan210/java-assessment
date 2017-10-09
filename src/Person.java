public class Person implements Greeter {
    protected String firstName;
    protected String lastName;

    public Person () {}

    public Person (String firstName, String lastName) {
        try {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName () {
        return this.lastName;
    }

    public static void setFirstName (String firstName) {
        firstName = firstName;
    }

    public static void setLastName (String lastName) {
        lastName = lastName;
    }

    public String sayHello(){
        return "Hello from " + firstName + lastName;
    }

}
