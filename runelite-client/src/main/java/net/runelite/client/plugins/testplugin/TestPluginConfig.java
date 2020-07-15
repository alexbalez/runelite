package net.runelite.client.plugins.testplugin;

// Mandatory imports
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("testplugin")
public interface TestPluginConfig extends Config{

    @ConfigItem(
            position = 1,
            keyName = "booleanExample",
            name = "Checkbox",
            description = "Example checkbox description"
    )
    default boolean booleanExample(){
        return false;
    }

    @ConfigItem(
            position = 2,
            keyName = "spinnerExample",
            name = "Spinner",
            description = "Example integer spinner"
    )
    default int spinnerExample(){
        return 5;
    }

    @ConfigItem(
            position = 3,
            keyName = "textExample",
            name = "Text",
            description = "String example"
    )
    default String textExample(){
        return "";
    }

    @ConfigItem(
            position = 4,
            keyName = "colorExample",
            name = "Color",
            description = "Example color selector"
    )
    default Color colorExample(){
        return Color.BLUE;
    }

    enum OptionEnum{
        Example,
        Item,
        List
    }
    @ConfigItem(
            position = 5,
            keyName = "comboboxExample",
            name = "Combobox",
            description = "Example combobox"
    )
    default OptionEnum comboboxExample(){
        return OptionEnum.List;
    }
}
