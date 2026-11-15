public class ReportComparison {
    public static void compareReports(double[] previousResults,double[] currentResults){
        System.out.println("\nREPORT COMPARISON");
        System.out.println("================================================");

        for (int i = 0; i < currentResults.length; i++) {

            double difference = currentResults[i] - previousResults[i];

            System.out.println("Test Name: " + ReferenceRangesPractice.testNames[i]);

            System.out.println("Previous Result: " + previousResults[i]);

            System.out.println("Current Result: " + currentResults[i]);

            System.out.println("Difference: " + difference);

            if (difference > 0) {
                System.out.println("Change: Increased");
            }
            else if (difference < 0) {
                System.out.println("Change: Decreased");
            }
            else {
                System.out.println("Change: No Change");
            }

            System.out.println("-----------------------------------------------");
        }
    }
}
