import java.util.Scanner;
public class PatientTestResults {
public static double[] enterTestResults(Scanner sc) {
    double[] results = new double[5];
    for (int i = 0; i < 5; i++) {
        while(true){
        System.out.println("Enter result for" + ReferenceRangesPractice.testNames[i]);
        if (sc.hasNextDouble()) {
            double value = sc.nextDouble();
            if (value >= 0 && value <= 1000) {
                results[i] = value;
                break;
            }
        }
        else {
            System.out.println("Invalid input! Please enter a numeric value");
            sc.next();
        }
    }
}

    System.out.println("\n Patient Test Results");
    for(int i=0;i<5;i++){
        System.out.println(ReferenceRangesPractice.testNames[i]+":"+results[i]);
    }
    return results;
}
}
