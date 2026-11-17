🧪 LabInsight – Laboratory Test Result Management System

📌 About the Project

LabInsight is a Java-based Laboratory Test Result Management System developed to manage patient details and laboratory test results.

The system uses predefined reference ranges to classify laboratory test results into LOW, NORMAL, or HIGH categories. It also generates laboratory reports, compares previous and current test results, and allows users to search for patients using their Patient ID.

🎯 Objectives

- To manage patient information.
- To enter and manage laboratory test results.
- To maintain predefined reference ranges.
- To classify test results as LOW, NORMAL, or HIGH.
- To generate laboratory test reports.
- To compare previous and current reports.
- To search for patients using their Patient ID.

🛠️ Technologies Used

- Programming Language: Java
- JDK Version: Java 17
- IDE: IntelliJ IDEA

✨ Key Features

1. Manage Reference Ranges: Displays predefined reference ranges for laboratory tests.

2. Enter Patient Details: Accepts patient ID, name, gender, and age.

3. Enter Test Results: Allows users to enter laboratory test values.

4. Result Classification: Identifies test results as LOW, NORMAL, or HIGH based on predefined reference ranges.

5. Generate Report: Generates a laboratory test report containing patient details, test results, reference ranges, and result status.

6. Compare Previous Reports: Compares previous and current laboratory test results and identifies whether values have increased, decreased, or remained unchanged. It checks patient IDs before comparison.

7. Search Patient by ID: Allows users to search for a patient using their Patient ID. If the currently available patient's ID matches, the system displays the patient's report. Otherwise, it displays a Patient Not Found message.

🧬 Laboratory Tests Included

The system currently supports five laboratory tests:

Test Name| Reference Range| Unit
Haemoglobin| 12.0 – 16.0| g/dL
Blood Glucose| 70.0 – 99.0| mg/dL
Total Cholesterol| 0.0 – 200.0| mg/dL
HDL Cholesterol| 40.0 – 60.0| mg/dL
Triglycerides| 0.0 – 150.0| mg/dL

🔐 Input Validation

The application includes input validation to reduce invalid data entry.

- Validates patient ID format.
- Accepts alphabetic patient names.
- Validates gender input.
- Accepts patient age between 1 and 120.
- Rejects negative test results.
- Rejects test results above 1000.
- Rejects non-numeric inputs for age and test results.

💻 How to Run the Project

1. Install JDK 17 on your computer.
2. Open IntelliJ IDEA.
3. Clone or download this repository.
4. Open the project in IntelliJ IDEA.
5. Locate the "Main.java" file inside the "src" folder.
6. Run the "Main" class.
7. Select the required option from the menu displayed in the console.

📋 Application Menu

The application provides the following options:

1. Manage Reference Ranges
2. Enter Patient Details and Results
3. View Result Status
4. Generate Report
5. Compare Previous Reports
6. Save Patient Report (if implemented)
7. Search Patient by ID
8. Exit

📊 Expected Output

The application displays patient details, laboratory test values, reference ranges, and result classifications.

It generates laboratory test reports, compares previous and current test results, and allows users to search for the currently available patient's report using their Patient ID.

🎓 Project Information

- Project Name: LabInsight
- Project ID: CP-028
- Project Domain: Healthcare / Laboratory Management
- Project Type: Java Console Application
- Development Environment: IntelliJ IDEA

⚠️ Disclaimer

This project is developed for educational purposes. The predefined reference ranges are simplified values used for demonstration and should not be considered a substitute for professional medical advice or laboratory interpretation. Actual laboratory reference ranges may vary.

---

Developed as part of the Capstone Project.
