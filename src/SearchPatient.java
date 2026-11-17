import java.util.Scanner;

public class SearchPatient {

    public static void searchPatient(Scanner sc, double[] results) {

        System.out.println("Enter Patient ID to Search:");
        String searchId = sc.next();

        if (results == null || PatientDetails.patientId == null) {

            System.out.println("No patient records available.");

        } else if (PatientDetails.patientId.equalsIgnoreCase(searchId)) {

            System.out.println("\nPatient Found!");
            System.out.println("--------------------------");

            PatientReport.generateReport(results);

        } else {

            System.out.println("Patient Not Found!");

        }
    }
}