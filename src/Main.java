
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double[] results =null;
        double[] previousResults=null;

        do {
            System.out.println("\n===============================================================");
            System.out.println("                         Lab Insight");
            System.out.println("               Diagnostic Report Analysis System");
            System.out.println("===============================================================");
            System.out.println("1. Manage Reference Ranges");
            System.out.println("2. Enter Patient Details");
            System.out.println("3. View Result Status");
            System.out.println("4. Generate Report");
            System.out.println("5. Compare Previous Reports");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                       ReferenceRangesPractice.showReferenceRanges();
                        break;

                    case 2:
                       PatientDetails.enterPatientDetails();
                       if(results!=null){
                           previousResults=results;
                       }
                        results=PatientTestResults.enterTestResults(sc);
                        break;

                    case 3:
                        if (results != null) {
                            ResultClassification.classifyResults(results);
                        }
                        else{
                            System.out.println("Please enter patient test results first.");
                        }
                        break;

                    case 4:
                        if (results != null) {
                            PatientReport.generateReport(results);
                        } else {
                            System.out.println("Please enter patient test results first.");
                        }
                        break;

                    case 5:
                        if (previousResults != null && results != null) {
                            ReportComparison.compareReports(previousResults, results);
                        } else {
                            System.out.println("Please enter two reports before comparing.");
                        }
                        break;

                    case 6:
                        System.out.println("Thank you for Using Lab Insight!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } else {
                System.out.println("Please enter a valid number.");
                sc.next();
                choice = 0;
            }

        } while (choice != 6);

        sc.close();
    }
}
