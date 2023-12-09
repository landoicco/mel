
// import org.apache.commons.lang3.StringUtils;
import picocli.CommandLine;
import static picocli.CommandLine.Command;
import static picocli.CommandLine.Option;
import static picocli.CommandLine.Parameters;

public class Main {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new HelloCommand()).execute(args);
        System.exit(exitCode);
    }

    @Command(name = "Mel", description = "General data and vaccine records manager for domestic animals", mixinStandardHelpOptions = true, version = "Mel 0.1")
    static class HelloCommand implements Runnable {
        @Parameters(index = "0", defaultValue = "stranger", description = "The name for greeting")
        private String name;

        @Option(names = { "-c", "--create" }, defaultValue = "false", description = "Create a new Animal entry")
        private boolean isCapitalizeEnabled;

        @Override
        public void run() {
            System.out.println("Hello, " + (isCapitalizeEnabled ? name + "<- This should be mayus" : name));
        }
    }
}