package net.runelite.client.plugins.testplugin;

// Mandatory imports
import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;

@Slf4j
@PluginDescriptor(
        name = "Test Plugin",
        description = "An example test plugin",
        tags = {"test", "config"},
        loadWhenOutdated = true
)

public class TestPlugin extends Plugin {
    @Inject
    private TestPluginConfig config;

    //adds config to config list
    @Provides
    TestPluginConfig getConfig(ConfigManager configManager)
    {
        return configManager.getConfig(TestPluginConfig.class);
    }

    @Override
    protected void startUp() throws Exception
    {
        if(config.booleanExample())
        {
            log.debug("Test boolean true");
        } else {
            log.debug("Test boolean false");
        }
    }


}
