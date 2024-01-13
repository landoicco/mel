# Mel CLI tool

This module is a CLI tool for handling requests and user inputs for operatinf Mel system.

## How to compile this module

This module use picocli as dependency. Once the `mods/picocli.jar` file exist, run the following command:

```
javac --module-path mods -d cli/target cli/lando/mel/cli/MelCLI.java cli/module-info.java
```

This will create a directory `cli/target` with all the compiled classes.

Now we move this classes to a JAR file:

```
jar -cvf mods/cli.jar -C cli/target .
```