package com.kodillapatterns2.observer.homework;

public class Teacher implements Observer {
    private final String name;
    private int updateCount;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(
                name + ": you have a new task from " + tasksQueue.getStudent() +
                        ", (total: " + tasksQueue.getTasks().size() + " tasks)"
        );

        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

