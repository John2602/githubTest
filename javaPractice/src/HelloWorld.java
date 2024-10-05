public class HelloWorld {
    String fistName;
    String lastName;

    public  HelloWorld(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        return fistName + " " + lastName;
    }


}
