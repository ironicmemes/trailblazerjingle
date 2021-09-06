package com.github.ironicmemes;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(JingleConfig.GROUP)
public interface JingleConfig extends Config {
    String GROUP = "trailblazerjingle";

    @ConfigItem(
            keyName = "announceLevelUp",
            name = "Level ups",
            description = "Should the jingle play when you gain a level in a skill?",
            position = 0
    )
    default boolean announceLevelUp() {
        return false;
    }

    @ConfigItem(
            keyName = "announceLevelUpIncludesVirtual",
            name = "Include virtual level ups",
            description = "Should the jingle play when you gain a virtual (>99) level in a skill?",
            position = 1
    )
    default boolean announceLevelUpIncludesVirtual() {
        return false;
    }

    @ConfigItem(
            keyName = "announceQuestCompletion",
            name = "Quest completions",
            description = "Should the jingle play when you complete a quest?",
            position = 2
    )
    default boolean announceQuestCompletion() {
        return false;
    }

    @ConfigItem(
            keyName = "announceCollectionLog",
            name = "New collection log entry",
            description = "Should the jingle play when you fill in a new slot in your collection log? This one relies on you having chat messages (included with the popup option) enabled in game settings!",
            position = 3
    )
    default boolean announceCollectionLog() {
        return true;
    }

    @ConfigItem(
            keyName = "announceAchievementDiary",
            name = "Completed achievement diaries",
            description = "Should the jingle play when you complete a new achievement diary?",
            position = 4
    )
    default boolean announceAchievementDiary() {
        return true;
    }

    @ConfigItem(
            keyName = "announceCombatAchievement",
            name = "Completed combat achievement tasks",
            description = "Should the jingle play when you complete a new combat achievement task?",
            position = 5
    )
    default boolean announceCombatAchievement() {
        return true;
    }

    @ConfigItem(
            keyName = "announceDeath",
            name = "When you die",
            description = "Should the jingle play when you die?",
            position = 6
    )
    default boolean announceDeath() {
        return false;
    }

}
