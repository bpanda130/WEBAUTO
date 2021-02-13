WEBAUTO_1.1 [Selenium WebDriver]+[JDK 1.8]+[Cucumber]+[JUnit]+[Maven]+[Extent Spark Report]

    - This project illustrate design of Hybrid Framework with Page Object Model (POM) with Cucumber BDD & Selenium.
    - Integrated Core WEB Automation External Library to get all required wrapper Utilities.
  
Project Component:

    External Library: [CORE WEB AUTO]
    
      - Driver Factory Library - Initalize required ThreadLocal WebDriver depends on browser.
      - Component Library      - Provide all required element wrapper methods.
      - Wait Library           - Provide all required Wait wrapper utility.
      - ConfigReader           - Library that read properties from property file.
      - Report Utility         - Hold all report Utilities which used to generate Report.
      - Excel Utility          - All Excel Utilities to access Test Data file.
      - Database Utility       - DB Utility to access DB Data (In-Progress)
      
    AppFeatures               : Cucumber Feature file holds all required Cucumber feature file.
                                 /src/test/resources/Appfeatures
                 
    Step Defination           : Holds respective step definations class.
                                /src/test/java/stepDefination
                                
    Page Library              : Page Classes for POM
                                /src/main/java/pages
                                
    Constant Library           : All input data  to be tried out by various test methods woulbe be going into this directory
                                 /src/main/java/Utility/Constant.java
                                
    Application Hooks         : Cucumber Hooks with before and after
                                /src/test/java/AppHooks/ApplicationHooks.java
                                
    Config                    : Holds input data that needs to be pass to Test Method.
                                /src/test/resources/com/Config/config.properties
                                
    Test Runner               : Test Runners in JUnit
                                /src/test/java/TestRunner/MyTestRunner.java
                                
    Reporting Property        : All required input to generate HTML Extent Spark and PDF Report with Test Method results.
                                /src/test/resources/extent.properties
                                /src/test/resources/extent-config.xml
                                /src/test/resources/cucumber.properties
                                
Technologies Used:
     1. Selenium WebDriver with Java Language binding
     2. Cucumber 6.x JVM library
     3. WebDriverManager
     4. JDK 1.8
     5. Maven (Build tool)
     6. Maven Plugins
     7. Cucumber extent report 6 adapter
     8. JUnit 4.x library
     9. Eclipse (IDE)
     
Execution:

  - To Execute All the Feature file navigate to src/test/java/TestRunner/MyTestRunner.java class and execute with help of JUnit 4.
  - To execute specific Feature file, mention the required feature file in MyTestRunner.java class and run with JUnit 4.
     
