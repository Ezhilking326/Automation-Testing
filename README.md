# Mainproject

## Overview
This project is an automated testing framework for the Bikewala website, built using Java, Selenium WebDriver, and Cucumber (BDD). It is designed to automate browser interactions and validate features such as price, mileage, specs, and other functionalities of the Hero Passion Plus bike on the Bikewala platform.

## Project Structure

```
Mainproject/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   │   └── Hook.java
│       │   ├── Bikewala/
│       │   │   ├── Basepage.java
│       │   │   ├── Bikewala1.java
│       │   │   ├── Bikewala2.java
│       │   │   └── Bikewala3.java
│       │   ├── feature/
│       │   │   └── bikewala.feature
│       │   ├── Stepdefinition/
│       │   │   ├── Stepdefinition1.java
│       │   │   ├── Stepdefinition2.java
│       │   │   └── Stepdefinition3.java
│       │   └── TestRunner/
│       │       └── Testrunner.java
│       └── resources/
├── target/
│   ├── classes/
│   └── test-classes/
└── test-output/
```

## Key Components
- **Bikewala1.java, Bikewala2.java, Bikewala3.java**: Page Object Model classes for automating and validating different features of the Bikewala website.
- **Basepage.java**: Contains common WebDriver setup and utility methods.
- **Stepdefinition/**: Step definitions for Cucumber feature files.
- **feature/bikewala.feature**: Cucumber feature file describing test scenarios in Gherkin syntax.
- **TestRunner/Testrunner.java**: JUnit runner for executing Cucumber tests.
- **base/Hook.java**: Hooks for test setup and teardown.

## Technologies Used
- Java
- Selenium WebDriver
- Cucumber (BDD)
- JUnit
- Maven

## Getting Started

### Prerequisites
- Java JDK 8 or above
- Maven
- ChromeDriver or appropriate WebDriver for your browser

### Setup
1. Clone the repository or copy the project files.
2. Install dependencies:
   ```
   mvn clean install
   ```
3. Update the WebDriver path in the `Basepage.java` or configuration if necessary.

### Running Tests
You can run the tests using Maven:
```sh
mvn test
```
Or run the `Testrunner.java` class directly from your IDE.

### Test Reports
Test reports are generated in the `test-output` directory after execution.

## Customization
- Update locators in the Page Object classes if the Bikewala website changes.
- Add new feature files and step definitions to expand test coverage.

## Notes
- The framework uses retry logic to handle dynamic web elements (e.g., stale element exceptions).
- All test scenarios are described in the `bikewala.feature` file using Gherkin syntax.

## License
This project is for educational and demonstration purposes.
