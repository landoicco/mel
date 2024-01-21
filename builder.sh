#! /usr/bin/bash

echo -e \
    " \
_  _ ____ _       ___  _  _ _ _    ___  ____ ____    ____ ____ ____ _ ___  ___ \
|\/| |___ |       |__] |  | | |    |  \ |___ |__/    [__  |    |__/ | |__]  |  \
|  | |___ |___    |__] |__| | |___ |__/ |___ |  \    ___] |___ |  \ | |     | \
"

# Compile and JAR picocli

javac \
    --module-path mods -d picocli/target \
    picocli/picocli/CommandLine.java picocli/module-info.java

jar -cvf mods/picocli.jar -C picocli/target .

# Compile and JAR lando.mel.cli

javac \
    --module-path mods -d cli/target cli/lando/mel/cli/creators/**.java \
    cli/lando/mel/cli/MelCLI.java cli/module-info.java

jar -cvf mods/lando.mel.cli.jar -C cli/target .

# Compile and JAR the lando.mel.app

javac \
    --module-path mods -d app/target app/lando/mel/app/animals/*.java \
    app/lando/mel/app/database/ConnectionHandler.java \
    app/lando/mel/app/Main.java app/module-info.java

jar -cvf mods/lando.mel.app.jar -C app/target .

# This line run the app
# java --module-path mods --module lando.mel.app/lando.mel.app.Main
