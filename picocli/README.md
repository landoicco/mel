# Picocli module - https://picocli.info/

This project uses Picocli to provide a CLI to make operations on Mel system.

## How to compile this module

To compile this single module and get all class files in a target directory, run:

```
javac --module-path mods -d picocli/target picocli/picocli/CommandLine.java picocli/module-info.java
```

Now, we move this classes to a JAR file:

```
jar -cvf mods/picocli.jar -C picocli/target .
```
