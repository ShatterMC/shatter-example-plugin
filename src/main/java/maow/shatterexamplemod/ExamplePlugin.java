package maow.shatterexamplemod;

import maow.shatter.api.CommandRegistry;
import net.fabricmc.api.ModInitializer;

public class ExamplePlugin implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleCommand example = new ExampleCommand();
        CommandRegistry.getInstance().register(example.getName(), example);
    }
}
