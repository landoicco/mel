#! /usr/bin/bash

echo -e \
    " \
_  _ ____ _       ___  _  _ _ _    ___  ____ ____    ____ ____ ____ _ ___  ___ \
|\/| |___ |       |__] |  | | |    |  \ |___ |__/    [__  |    |__/ | |__]  |  \
|  | |___ |___    |__] |__| | |___ |__/ |___ |  \    ___] |___ |  \ | |     | \
"

#############################
#   Clean existing modules
#############################
rm \
    mods/lando.mel.database.jar \
    mods/lando.mel.cli.jar \
    mods/lando.mel.envreader.jar \
    mods/lando.mel.models.jar \
    mods/picocli.jar

######################################
#   Clean existing target directories
######################################

rm -rf \
    database/target cli/target picocli/target envreader/target models/target

#############################
#   Compile and JAR picocli
#############################

# javac \
#     --module-path mods -d picocli/target \
#     picocli/picocli/CommandLine.java picocli/module-info.java \

# jar -cvf mods/picocli.jar -C picocli/target .

##################################
#   Compile and JAR lando.mel.cli
##################################

# javac \
#     --module-path mods -d cli/target cli/lando/mel/cli/creators/**.java \
#     cli/lando/mel/cli/MelCLI.java cli/module-info.java \

# jar -cvf mods/lando.mel.cli.jar -C cli/target .

######################################
#   Compile and JAR the lando.mel.envreader
######################################

javac \
    --module-path mods -d envreader/target \
    envreader/lando/mel/envreader/api/**.java \
    envreader/lando/mel/envreader/impl/**.java \
    envreader/lando/mel/envreader/lookup/**.java \
    envreader/module-info.java

jar -cvf mods/lando.mel.envreader.jar -C envreader/target .

######################################
#   Compile and JAR the lando.mel.models
######################################

javac \
    --module-path mods -d models/target \
    models/lando/mel/models/animal/**.java \
    models/module-info.java

jar -cvf mods/lando.mel.models.jar -C models/target .

######################################
#   Compile and JAR the lando.mel.database
######################################

javac \
    --module-path mods -d database/target \
    database/lando/mel/database/helpers/**.java \
    database/lando/mel/database/dao/**.java \
    database/lando/mel/database/jdbc/**.java \
    database/lando/mel/database/**.java \
    database/lando/mel/database/Main.java \
    database/module-info.java

jar -cvf mods/lando.mel.database.jar -C database/target .

# This line run the app
# java --module-path mods --module lando.mel.app/lando.mel.app.Main
