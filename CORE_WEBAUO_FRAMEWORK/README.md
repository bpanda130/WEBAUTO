# Core Automation Frameworks for web
Core Web Automation Library which holds all Utility Package to build Framework.

Project Description:
  - Project have implemented to built a Core Web Automation Librabry which can be used accross different child project.
  - It holds required Driver Initialization, Different Component Utility, Common Element Utility, Excel Utility, Report Utility, DataBase Utility and Wait Utility etc.
  - All these Utilities can be used to achive required functionality in the Child Automation project.
  - Required URL, file Path, Element locator will consume from Implemeted class.
  
Project Component: 
(Only content main java utility under src/main/java)

  - DriverFactory Utility         : Initialize and provide required Thredlocal WebDriver object based on required Browser.
                                    com/qa/Factory/Factory/DriverFactory.java
  - Component Utility             : Holds all required Elements actions method which can be used to perform a Test step.
                                    com/qa/Component/ButtonUtil.java, com/qa/Component/TextBoxUtil.java etc.
                                    ElementUtility class holds all common utility like getPresence, getSize etc. of an Element.
                                    com/qa/Component/ElementUtil.java
                                    
  - ConfigReader Utility          : Config File Reader
                                    com/qa/Utility/ConfigReader.java
  - Excel Utility                 : Contains all required library to read from required Excel Data Sheet.
                                    com/qa/Utility/ExcelUtility.java
  - Wait Utility                  : Contains all wrapper wait utility.
                                    com/qa/Utility/WaitUtility.java
  - Report Utility                : All required Report Utilities like capturing screen shot.
                                    com/qa/Utility/ReportUtility.java
  - Database Utility              : Hold all required DB utilities that required to access required table.

Technologies Used:
  1. Selenium WebDriver with Java Language binding
  2. WebDriverManager
  3. JDK 1.8
  4. Maven (Build tool)
  5. Maven Compiler Plugins
  6. Maven assembly Plugins
  7. Apache POI api
  8. JUnit 4.x library

Building Jar:
  - Maven Assembly plugin used to build required Jar file.
  Command : mvn clean package
