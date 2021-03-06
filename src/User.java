public class User extends Person {
    protected boolean isAdmin;

    public User (String firstName, String lastName, boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin () {
        if (isAdmin) {
            return true;
        } else {
            return false;
        }
    }

    //HAS TO BE CALLED toString()
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
