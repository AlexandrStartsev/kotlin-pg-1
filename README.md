# kotlin-pg-1

Fix for "same root source can't be assigned to multiple modules" issue when kotlin multiplatform feature is used with intellij.<br>

Jvm build: <code>mvn clean install; java -jar target/kotlin-pg-1-1.0-SNAPSHOT-jar-with-dependencies.jar</code><br>
Js build: <code>mvn clean compile -Djs=true; open index.html</code> (useful js output is available in target/js)
