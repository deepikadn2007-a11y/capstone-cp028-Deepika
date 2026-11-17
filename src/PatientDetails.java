import java.util.Scanner;
public class PatientDetails {
    public static String patientId;
    public static String patientName;
    public static String gender;
    public static int age;
    public static void enterPatientDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Patient ID");
        patientId=sc.nextLine();
        System.out.println("Enter Patient Name");
         patientName=sc.nextLine();
         while(!patientName.matches("[a-zA-Z ]+")){
             System.out.println("Invalid name .Please Enter alphabets only.");
             patientName=sc.nextLine();
         }
        System.out.println("Enter Gender");
         gender=sc.nextLine();
        while(!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other"))
        {
            System.out.println("InValid Gender. Enter Again");
            gender=sc.nextLine();
        }
        System.out.println("Enter Age");
        while(true ) {
            if(sc.hasNextInt()) {
                age = sc.nextInt();
                if (age >= 1 && age <= 150) {
                    break;
                } else {
                    System.out.println("Invalid input! Enter age between 1 and 150 ");
                }
            }
            else{
                    System.out.println("Invalid age. Enter numbers only");
                    sc.next();
                }
            }
            System.out.println("Patient ID:"+ patientId);
            System.out.println("Patient Name:"+patientName);
            System.out.println("Age:" + age );
            System.out.println( "Gender:" + gender);
    }
public static void main(String[] args){
        enterPatientDetails();
    }
    }

