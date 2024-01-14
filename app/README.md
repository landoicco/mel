# Mel App

This module is the main app, this module takes care of creating, manipulate and story Animal entries to the system.

## How to compile this module

This module requires some other modules to work. Make sure that the following modules exist in `mods/` directory:

* org.json.simple.jar
* 

Then, run the following command to compile this code into a `app/target` directory: (This command will be updated to include all the classes in this module)

```
javac --module-path mods -d app/target app/lando/mel/app/animals/*.java app/lando/mel/app/helpers/AnimalFactory.java app/lando/mel/app/Main.java app/module-info.java
```

Then, you can test this code running the following command in `app/target` directory:

```
java -p ../../mods lando.mel.app.Main
```