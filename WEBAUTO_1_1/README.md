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
                                
    Application Hooks         : Cucumber Hooks with before and after
                                /src/test/java/AppHooks/ApplicationHooks.java
                                
    Test Runner               : Test Runners in JUnit
                                /src/test/java/TestRunner/MyTestRunner.java
