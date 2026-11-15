public class ReferenceRangesPractice {
    static String[] testNames = {
            "Haemoglobin",
            "Blood Glucose",
            "Total Cholesterol",
            "HDL Cholesterol",
            "Triglycerides"
    };

    static double[] minimumRange = {
            12.0, 70.0, 0.0, 40.0, 0.0
    };

    static double[] maximumRange = {
            16.0, 99.0, 200.0, 60.0, 150.0
    };

   static String[] units = {
            "g/dL",
            "mg/dL",
            "mg/dL",
            "mg/dL",
            "mg/dL"
    };
    public static void showReferenceRanges() {
        System.out.println("==============================================");
        System.out.println("       LABINSIGHT - REFERENCE RANGES");
        System.out.println("==============================================");

        System.out.printf("%-22s %-12s %-12s %-10s%n",
                "Test Name", "Minimum", "Maximum", "Unit");

        for (int i = 0; i < testNames.length; i++) {

            System.out.printf("%-22s %-12.2f %-12.2f %-10s%n",
                    testNames[i],
                    minimumRange[i],
                    maximumRange[i],
                    units[i]);
        }

        System.out.println("==============================================");
    }
    public static void main(String[] args) {
        showReferenceRanges();
    }
}
