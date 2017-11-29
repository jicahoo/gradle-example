# gradle-example
Gradle examples.

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
