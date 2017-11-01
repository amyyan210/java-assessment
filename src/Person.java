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

    //removed static keyword after submitting, added this keyword
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    //removed static keyword after submitting, added this keyword
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String sayHello(){
        return "Hello from " + firstName + lastName;
    }

}
