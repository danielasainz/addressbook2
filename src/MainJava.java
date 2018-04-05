import java.util.ArrayList;
import java.util.Scanner;


public class MainJava {
    public static void main(String[] args) {

        boolean done = false;
        Scanner scan = new Scanner(System.in);
        Person newPerson;
        String answer;

        ArrayList<Person> persons = new ArrayList();

        do {

            newPerson = new Person();
            System.out.println("This is an address book");
            System.out.println("Enter this person's first name:");
            newPerson.setFirstName(scan.nextLine());
            System.out.println("Enter this person's last name:");
            newPerson.setLastName(scan.nextLine());
            System.out.println("Enter this person's home address:");
            newPerson.setHomeAddress(scan.nextLine());
            System.out.println("Enter this person's phone number:");
            newPerson.setPhoneNumber(scan.nextLine());
            System.out.println("Enter this person's email address:");
            newPerson.setEmailAddress(scan.nextLine());

            persons.add(newPerson);

            System.out.println("Do you want to put in information for another person?");
            answer = (scan.nextLine());
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                done = true;
            } else {
                done = false;
            }

        }while (done) ;

        for (Person eachPerson : persons)

        {
            System.out.println("=========");
            System.out.println("Contact information:" + " " + eachPerson.toString());
        }

    }
}

