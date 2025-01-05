package classTwentyFirst.Class;



// Person class which contains the address information
public class Person {
    // Instance variable of Address type
    private Address address;

    // Constructor of Person class takes city and state as parameters
    public Person(String city, String state) {
        // Create an Address object using the provided city and state
        address = new Address(city, state);
    }

    // Method to print the person's address
    public void printAddress() {
        System.out.println("Person's Address:");
        address.displayAddress();
    }

    private class Address {
        public Address(String city, String state) {

        }

        public void displayAddress() {
        }
    }
}

// Main class to test the functionality
class Main {
    public static void main(String[] args) {
        // Create a Person object with city and state
        Person person = new Person("New York", "New York");

        // Print the person's address
        person.printAddress();
    }
}

//public class Initializer {
//    public static void main(String[] args) {
//        private static  int initialValue = 1000;
//        System.out.println("the initialValue"+initialValue);
//    }
//}