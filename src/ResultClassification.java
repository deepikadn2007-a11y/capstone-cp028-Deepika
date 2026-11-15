public class ResultClassification {

    public static void classifyResults(double[] results) {

        for (int i = 0; i < results.length; i++) {

            String status;

            if (results[i] < ReferenceRangesPractice.minimumRange[i]) {
                status = "LOW";
            }
            else if (results[i] > ReferenceRangesPractice.maximumRange[i]) {
                status = "HIGH";
            }
            else {
                status = "NORMAL";
            }

            System.out.println(
                    ReferenceRangesPractice.testNames[i] + ": " + status
            );
        }
    }
}