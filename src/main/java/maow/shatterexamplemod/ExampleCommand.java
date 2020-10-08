package maow.shatterexamplemod;

import maow.shatter.api.Command;

import java.util.Arrays;

public class ExampleCommand implements Command {
    @Override
    public String getName() {
        return "example";
    }

    @Override
    public void run(String[] args) {
        System.out.println("Example Command - Args: " + Arrays.toString(args));
    }
}
