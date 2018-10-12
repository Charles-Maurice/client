package me.zeroeightsix.kami.setting.builder.primitive;

import me.zeroeightsix.kami.setting.boxed.BoxedBooleanSavableListeningNamedSettingRestrictable;
import me.zeroeightsix.kami.setting.builder.SettingBuilder;

/**
 * Created by 086 on 13/10/2018.
 */
public class BooleanSettingBuilder extends SettingBuilder<Boolean> {
    @Override
    public BoxedBooleanSavableListeningNamedSettingRestrictable build() {
        return new BoxedBooleanSavableListeningNamedSettingRestrictable(initialValue, predicate(), consumer(), name);
    }

    @Override
    public BooleanSettingBuilder withName(String name) {
        return (BooleanSettingBuilder) super.withName(name);
    }
}
