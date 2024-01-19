# Mel App

This module is the main app, this module takes care of creating, manipulate and store Animal entries to the system.

## How to compile this module

This module requires some other modules to work. Make sure that the following modules exist in `mods/` directory:

* JSON Simple (org.json.simple.jar)
* MariaDB JConnector (mariadb-java-client-3.3.2.jar)
* MariaDB Waffle JNA (waffle-jna-3.2.0.jar)

Then, run the following command to compile this code into a `app/target` directory: (This command will be updated to include all the classes in this module)

```
javac --module-path mods -d app/target app/lando/mel/app/animals/*.java app/lando/mel/app/helpers/AnimalFactory.java app/lando/mel/app/database/ConnectionHandler.java  app/lando/mel/app/Main.java app/module-info.java
```

Then, you can test this code running the following command in `app/target` directory:

```
java -p ../../mods lando.mel.app.Main
```

or, creating the JAR file:

```
jar -cvf mods/app.jar -C app/target .
```

then run it!

```
java --module-path mods --module lando.mel.app/lando.mel.app.Main
```