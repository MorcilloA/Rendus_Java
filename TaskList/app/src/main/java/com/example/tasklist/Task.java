package com.example.tasklist;

import androidx.annotation.NonNull;

import java.util.Date;

public class Task {

    private String taskName, taskDescription, taskDuration;
    private Date taskDate;

    public Task(String taskName, String taskDescription, String taskDuration, Date taskDate){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDuration = taskDuration;
        this.taskDate = taskDate;
    }

    public Task(String taskName, String taskDescription){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDuration = null;
        this.taskDate = null;
    }

    public void setTaskName(String taskName) {

        this.taskName = taskName;
    }

    public String getTaskName() {

        return taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {

        return taskDescription;
    }

    public void setTaskDuration(String taskDuration) {
        this.taskDuration = taskDuration;
    }

    public String getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    @Override
    public String toString() {
        return "Nom: "+this.taskName+"\n description:"+this.taskDescription;
    }
}
