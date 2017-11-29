# gradle-example
Gradle examples.

# How to manage Java projects?
* First step, you have to choose one Java project manage tool: Gradle or Maven.
* I have some knowledge about Gradle. So provide one gradle example here.

## Sub-projects dependencies
* `app` depends on `common` and `api`
* `api` depends on 'common'
* How to configure the dependency. For example, you will find below code in app/build.grdle
```java
compile project(':common')
```
which set up the `app`'s dependency on `common`.

## How to build
* On Unix-like platform, just run below command:
`gradlew collectJars`

* On Windows platform, just run below command:
`gradlew.bat collectJars`

* Then, you will get three jars `common.jar`,`api.jar`, `app.jar` in folder `.jars`.

# References
## Use Gradle to manage multiple projects
* https://rominirani.com/gradle-tutorial-part-3-multiple-java-projects-5b1c4d1fbd8d

## Gradle Wrapper:
* https://medium.com/@bherbst/understanding-the-gradle-wrapper-a62f35662ab7
* https://stackoverflow.com/questions/25769536/how-when-to-generate-gradle-wrapper-files
* https://www.mkyong.com/gradle/how-to-use-gradle-wrapper/
