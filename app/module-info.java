@SuppressWarnings({ "requires-automatic", "requires-transitive-automatic" })
module lando.mel.app {
    exports lando.mel.app;

    opens lando.mel.app.helpers to org.json.simple;

    requires org.json.simple;
}
