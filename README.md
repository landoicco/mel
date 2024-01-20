# Mel Management App

This app is made to store domestic animals information, in order to track vaccines, records and general data.

## How to run

### Docker compose

The easiest way to run this entire app is using Docker compose, this project when run with docker compose will compile and run the app along with a MariaDB and Adminer.

Just run:

```
docker compose up
```

add Docker will do the rest.

## Current version 0.1
### Features
* Picocli added as source module
* `lando.mel.cli` module added and working, this module makes use of `picocli`
* `lando.mel.app` module added and working, this module makes use of `lando.mel.cli` (to offer a interface to manage the system), MariaDB Driver, `java.sql` and WaffleJNA (MariaDB dependency). `lando.mel.app` is able to create a connection with MariaDB
* `builder.sh` script added to simplify compilation
* All the project works with Docker Compose

### Issues
* Consider get rid of `org.json.simple` dependency, we really don't need it
* Stabilize `lando.mel.app`, make it functional
* Add more functionality to `lando.mel.cli`
* Stabilize connection between `lando.mel.app` and `lando.mel.cli`

### Release v0.1
This is not a real release, since this app is still in development. We add this new changes and functionality to `master` branch.

#### Git branch merged to master
* [feature/add_mel_cli_module](https://github.com/landoicco/mel/pull/1)