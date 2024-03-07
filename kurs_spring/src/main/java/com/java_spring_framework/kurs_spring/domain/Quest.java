package com.java_spring_framework.kurs_spring.domain;

/**
 * Created by Adam Seweryn
 */
public class Quest {

    private String description;

    private int reward = 100;

    private int time = 30000;

    private boolean started = false;
    private boolean completed = false;

    public Quest(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public boolean isFinished() {
        return completed;
    }

    public void setFinished(boolean finished) {
        this.completed = finished;
    }
}
