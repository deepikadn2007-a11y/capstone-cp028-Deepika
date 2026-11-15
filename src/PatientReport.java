public class PatientReport {

    public static void generateReport(double[] results) {

        System.out.println("==============================================================================");
        System.out.println("                              LAB INSIGHT");
        System.out.println("                         DIAGNOSTIC TEST REPORT");
        System.out.println("==============================================================================");

        System.out.println("\nPatient Details");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Patient ID: " + PatientDetails.patientId);
        System.out.println("Patient Name: " + PatientDetails.patientName);
        System.out.println("Gender: " + PatientDetails.gender);
        System.out.println("Age: " + PatientDetails.age);
        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println("\nTest Results");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < results.length; i++) {

            System.out.println("Test Name: " + ReferenceRangesPractice.testNames[i]);

            System.out.println("Result: " + results[i]);

            System.out.println("Reference Range: "
                    + ReferenceRangesPractice.minimumRange[i]
                    + " - "
                    + ReferenceRangesPractice.maximumRange[i]);

            System.out.println("Unit: " + ReferenceRangesPractice.units[i]);

            if (results[i] < ReferenceRangesPractice.minimumRange[i]) {
                System.out.println("Status: LOW");
            }
            else if (results[i] > ReferenceRangesPractice.maximumRange[i]) {
                System.out.println("Status: HIGH");
            }
            else {
                System.out.println("Status: NORMAL");
            }

            System.out.println("-----------------------------------------------------------------------------------");
        }

        System.out.println("\n                         END OF REPORT");
        System.out.println("==============================================================================");
    }
}