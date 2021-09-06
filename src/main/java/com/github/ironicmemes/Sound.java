package com.github.ironicmemes;

public enum Sound {
    LEVEL_UP("/Trailblazer_League_task_completion_jingle.wav"),
    QUEST("/Trailblazer_League_task_completion_jingle.wav"),
    COLLECTION_LOG_SLOT("/Trailblazer_League_task_completion_jingle.wav"),
    COMBAT_TASK("/Trailblazer_League_task_completion_jingle.wav"),
    ACHIEVEMENT_DIARY("/Trailblazer_League_task_completion_jingle.wav"),
    DEATH("/Trailblazer_League_task_completion_jingle.wav");

    private final String resourceName;

    Sound(String resNam) {
        resourceName = resNam;
    }

    String getResourceName() {
        return resourceName;
    }
}
