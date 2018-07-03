package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testStudent(){

        StudentTask booleanTask = new TaskForTheStudent();
        StudentTask conditionalsTask = new StudentTaskConditionals();
        Mentor robertKowalski= new Mentor("Robert Kowalski");
        Mentor tomaszGajewski = new Mentor("Tomasz Gajewski");
        Mentor erwinMuzyczuk = new Mentor("Erwin Muzyczuk");
        booleanTask.registerObserver(robertKowalski);
        conditionalsTask.registerObserver(tomaszGajewski);
        booleanTask.registerObserver(erwinMuzyczuk);
        conditionalsTask.registerObserver(robertKowalski);

        booleanTask.addTask("Abc");
        booleanTask.addTask("Def");
        booleanTask.addTask("Wrr abc");
        conditionalsTask.addTask("Work");
        conditionalsTask.addTask("How are you?");

        assertEquals(3, erwinMuzyczuk.getUpdateCount());
        assertEquals(2,tomaszGajewski.getUpdateCount());
        assertEquals(5, robertKowalski.getUpdateCount());
    }

}
