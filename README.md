# Words Counter

User-facing form that counts the number of words in a block of text

## Feature development process

### Intro

This project follows [BDD](https://www.agilealliance.org/glossary/bdd/) practice with usage
of [Serenity](https://serenity-bdd.github.io/) and [Cucumber](https://cucumber.io).
If you are not familiar with this approach of software development you can learn about them on the above link and to
have an operational knowledge from this [tutorial](https://serenity-bdd.github.io/docs/tutorials/cucumber-screenplay)
which should help you with the onboarding for this project.

### Tips for launch e2e tests

In order to launch the e2e suite you have at least two different approaches:

- within you IDE
- from terminal

#### IDE e2e suite

For launch test within IntelliJ you can
use [Cucumber for Java](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java) or maven running verify steps from
GUI

#### Terminal

in order to run the suite from terminal you should install Java 17 and Maven 3.8.8
then you should open the terminal and go within the **./word-counter/e2e-test-suite** folder and from there launch

```bash
mvn clean install
```

