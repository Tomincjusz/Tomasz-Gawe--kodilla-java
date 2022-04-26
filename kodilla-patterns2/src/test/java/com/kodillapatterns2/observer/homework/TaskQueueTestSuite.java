package com.kodillapatterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {

        // Given
        TasksQueue student1 = new Student("Tomek");
        TasksQueue student2 = new Student("Karolina");

        Teacher adrian = new Teacher("Adrian");
        Teacher kasia= new Teacher("Kasia");

        student1.registerObserver(adrian);
        student2.registerObserver(kasia);

        // When
        student1.addTask("Task 1");
        student1.addTask("Task 2");

        student2.addTask("Task 1");
        student2.addTask("Task 2");
        student2.addTask("Task 2");

        // Then
        assertEquals(2, adrian.getUpdateCount());
        assertEquals(3, kasia.getUpdateCount());
    }
}
