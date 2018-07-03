package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudentTask studentTask){
        System.out.println(username + ": New task " + studentTask.getName() + "\n " +
                " (total: " + studentTask.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}