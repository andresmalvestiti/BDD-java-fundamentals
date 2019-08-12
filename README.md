# BDD-java-fundamentals
Java BDD example

Java example project to understand the basis of BDD with Gherkin, Cucumber and Serenity.

## What is BDD?
•	Collaboration and conversation
•	Concrete examples and business rules
•	A common language and a shared understanding
•	Faster feedback through early and effective automation
BDD always starts with a conversation about the customer’s needs. It gives us techniques to structure and facilitate these conversations. The team talks about examples and counter examples about how the user interact with the application. At the end of the conversation the whole team have a clear picture of what they need to build. They build this picture bit by bit, clarifying the details by asking questions. 

## BDD Benefits
•	Be agile, don’t just “do” agile.
•	Bridge the communication gap
•	A deep shared understanding of business needs
•	A more engaged and creative team
•	Faster feedback
•	Fewer defects

## BDD Challenges
•	Requires strong collaboration and engagement
•	Difficult in isolated teams

## Differences between TDD and BDD
### TDD main aspects:
•	Focus on a single unit
•	Safety net
•	Isolation 
•	Iterative way
### BDD main aspects:
•	Extension of TDD
•	Focus on what to test and what not to test
•	Test cases in natural language
•	Understanding of the system
•	Focus on the real needs
•	Delivering software that really matters

### TDD vs BDD
With TDD the code is clean, it does what it needs to do. In case of adding new functionality, the place for the changes is easy to locate. We have a well-ordered and methodical way of working. With BDD, we are making a step further. It helps you not only doing the things right but doing the right things, arriving to the software goal and delivering business value.

## Phases
•	Discovery (Illustrate): Generates business rules and acceptance criteria.
•	Formulate: Usually a BA and a Tester turn this rules and examples into format that can’t act both as specifications that a business person can read and as automated acceptance tests as part of our test suite. Generates executable specifications.
•	Automate: Turn these executable specifications into automated acceptance tests. This usually happens before or during development.
•	Validate: Once these tests pass, we can show to the business concrete evidence that the feature does what it was expected to do. Then the business can give the team feedback about the feature.
Acceptance criteria: Represents what will satisfy stakeholders in order to agree that the application is working the way it’s supposed to do. 

## Tools
### What is Gherkin?
A business-readable notation for executable specifications.
Gherkin defines a simple set of grammar rules that makes plain text structured enough for Cucumber to understand. The scenarios will be written in Gherkin. It provides an unambiguous executable specification. Because they’re automatically tested by Cucumber, your specifications are always up to date. It helps building automated testing. It documents how the system behaves.

### What is Cucumber?
It’s a software you use to run executable specifications written in Gherkin.
Cucumber is a behavior-driven development testing tool framework. It describes the application behavior by using plain English text you find by the language called Gherkin. Cucumber allows automation function validation, easy to read and understand by both developers and business analysts. It reads executable specification written in plain English text and validates that the software does what those specifications say.

### Gherkin: Executable Business Language
•	Written in plain English
•	Business readable
•	Executable
Components:
•	Feature: Description about the desire behave.
•	Scenario: Each scenario illustrates a business rule. Sometimes you can have several scenarios to describe different variations or edge cases.
o	Given: The sate of the system at the star of the scenario.
o	When: Where the action happens.
o	Then: The outcomes we expect.

## BDD Requirements Discovery Practices
•	Tables and whiteboards
•	Example mapping: Structured conversation about rules, examples and counterexamples.
•	Feature Mapping: Useful to break down examples into more detail. We break examples into steps and consequences and try to understand the inputs and outputs of each example. Useful for complex and larger requirements.

### Features and Scenarios
A scenario doesn’t exist in isolation. It’s always part of a feature. A feature is a piece of useful functionality that can be delivered to users. We describe these features using business rules and examples that we write as scenarios. When we build these features, we group the scenarios together to form user stories.

### Feature file
Each feature file has a title and at least one scenario. It can also have a description. It’s a great place to put an executive summary of your feature and to give some context and background.
We can also add a ‘Background’ section to let these scenarios a little bit more concise. This section will be executed at the start of each scenario. It’s a great way to avoid duplication.

### Data tables
When we have many ‘And’ or repetitive conditions in the Given or Then sections, we should use Data tables to simplify these conditions and make them easier to read. A more specific table are ‘Embedded Tables’ which allows us to structure different items in the ‘When’ condition.

## Layers of Test Automation Code
1.	Executable specifications (Gherkin): Describes each scenario with the given structure (Given-When-Then).
2.	Glue code (Cucumber Step Definitions): Coordinate and orchestrate how we will interact with the application. The Glue code shouldn’t manipulate the application itself because this will make the code very hard to maintain.
3.	Test domain layer: Models how we interact with the application.

To run a scenario with Cucumber with Java, we write a class called a Test runner class. This is a special kind of Junit class which reads your feature files and finds the glue code that it needs to execute them. You can also configure a Test runner class to run one or many feature files.
A Test Runner class looks like an empty class with a few annotations.

## Others BDD Frameworks
### JBehave
•	Write stories: JBehaves allows us to write stories in plain text to be understood by all persons involved into the project. 
•	Map steps: Through the stories we’ll define scenarios that express the desired behavior. JBehaves maps textual steps to Java methods via candidate steps. The scenario writer needs to provide annotated methods that match by regex patterns the textual steps. 
•	Run stories: The JBehave core module contains support for running stories as Junit test.

### Terminology
•	Story: Represents an automatically executable increment of business functionality, a slice through a feature which is functional, and on which we can get feedback. It covers on or more scenarios.
•	Scenarios: Represents a real-life situation of behavior of the application.
•	Step: Is defined using the classic BDD keywords, Given, When and Then.
