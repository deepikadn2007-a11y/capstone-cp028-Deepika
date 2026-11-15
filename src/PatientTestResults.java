import java.util.Scanner;
public class PatientTestResults {
public static double[] enterTestResults(Scanner sc){
    double[] results=new double[5];
    for(int i=0;i<5;i++){
        System.out.println("Enter result for" + ReferenceRangesPractice.testNames[i]);
        results[i]=sc.nextDouble();
    }
    System.out.println("\n Patient Test Results");
    for(int i=0;i<5;i++){
        System.out.println(ReferenceRangesPractice.testNames[i]+":"+results[i]);
    }
    return results;
}
}
