# Words Counter

User-facing form that counts the number of words in a block of text

## Feature development process

### Intro

This project follows [BDD](https://www.agilealliance.org/glossary/bdd/) practice with usage
of [Serenity](https://serenity-bdd.github.io/) and [Cucumber](https://cucumber.io).
If you are not familiar with this approach of software development you can learn about them on the above link and to
have an operational knowledge from this [tutorial](https://serenity-bdd.github.io/docs/tutorials/cucumber-screenplay)
which should help you with the onboarding for this project.

For this reason this repo contains

- e2e test suite ```cd /e2e-test-suite``` where e2e test code is versioned
- fe application ```cd /fe/skeleton-app``` where the fe application is versioned

### Tips for launch the fe app

This project it's based on [skeleton](https://www.skeleton.dev/) and it's was generated following
this [quickstart](https://www.skeleton.dev/docs/quickstart)

#### Developing

Once you've download the repo and installed dependencies with `npm install` (or `pnpm install` or `yarn`), start a
development server:

```bash
cd /fe/skeleton-app

npm run dev

# or start the server and open the app in a new browser tab
npm run dev -- --open
```

The project following [TDD](https://www.agilealliance.org/glossary/tdd/) with usage of [vitest](https://vitest.dev/) and
it's following [vertical slice](https://www.milanjovanovic.tech/blog/vertical-slice-architecture) architectural approach
for files organization. So for the new feature must be added within features folder

#### Building

To create a production version of your app:

```bash
cd /fe/skeleton-app

npm run build
```

You can preview the production build with `npm run preview`.

> To deploy your app, you may need to install an [adapter](https://kit.svelte.dev/docs/adapters) for your target
> environment.

### Tips for launch e2e tests

In order to launch the e2e suite you have at least two different approaches:

- within you IDE
- from terminal

#### Setup

Before launching test suite with one of below options it's mandatory launch the application and change the url where the
application is running
updating the ```it.phil.words.serenity.steps.Steps.iSeeAWordCountingForm``` method which currently has the following line
```openUrl("http://localhost:5173/");``` which must be updated reflect your setup so something like this "
```openUrl("url-where-the-application-is-deployed");```"

#### IDE e2e suite

For launch test within IntelliJ you can
use [Cucumber for Java](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java) or maven running verify steps from
GUI

#### Terminal

in order to run the suite from terminal you should install Java 17 and Maven 3.8.8
then you should open the terminal and go within the **./word-counter/e2e-test-suite** folder and from there launch

```bash
mvn clean verify
```

