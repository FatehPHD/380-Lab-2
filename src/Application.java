import java.util.Arrays;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        // Creating client
        Client client = new Client(1, "Fateh", "25 Taradale", "(403)-625-4322");

        // Creating pet
        Pet pet = new Pet(1, "tom", "German Shepherd", 3);

        // Creating medical profile
        MedicalProfile medicalProfile = new MedicalProfile(1, "Has Bent Jaw");

        // Creating feeding instructions
        FeedingInstructions feedingInstructions1 = new FeedingInstructions(1, "Feed 15 times a day");
        FeedingInstructions feedingInstructions2 = new FeedingInstructions(2, "hates biscuits");

        // Creating medications
        Medication medication1 = new Medication(1, "benzole", "10mg");
        Medication medication2 = new Medication(2, "rendene", "5mg");

        // Creating register
        Register register = new Register("(403)-625-4322", "FatehAli@gmail.com", "25 Taradale");

        // Creating appointment
        Appointment appointment = new Appointment(1, new Date(), "twice a monrth");

        // Creating payment
        Payment payment = new Payment(1, 200.00, "Credit Card", "needs to pay half more");

        // Print out pet's feeding instructions
        System.out.println("Feeding Instructions for " + pet.getName() + ":");
        for (FeedingInstructions instructions : Arrays.asList(feedingInstructions1, feedingInstructions2)) {
            System.out.println(instructions.getDetails());
        }

        // Print out register information
        System.out.println("Client's Reg Info :");
        System.out.println("Phone Number: " + register.getPhoneNumber());
        System.out.println("Email: " + register.getEmail());
        System.out.println("Address: " + register.getAddress());
    }
}
