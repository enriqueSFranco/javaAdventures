package org.desing;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class TodoList {
    private Map<Integer, List<Task>> userTasks;

    public TodoList() {
        this.userTasks = new HashMap<>();
    }

    private class Task {
        private int id;
        private String description;
        private Set<String> tags;
        private int dueDate;
        private boolean isComplete;

        public Task(String description, int dueDate, Set<String> tags) {
            this.id++;
            this.description = description;
            this.tags = tags;
            this.dueDate = dueDate;
            this.isComplete = false;
        }

        public Set<String> getTags () { return this.tags; }

        public  void setIsComplete (boolean isComplete) { this.isComplete = isComplete; }

        public boolean getIsComplete () { return this.isComplete; }

        public int getId () { return this.id; }

        public int getDueDate() { return this.dueDate; }

        public String getDescription () { return this.description; }
    }

    public int addTask(int userId, String taskDescription, int dueDate, Set<String> tags) {
        if (!this.userTasks.containsKey(userId)) {
            this.userTasks.put(userId, new ArrayList<>());
        }

        Task newTask = new Task(taskDescription, dueDate, tags);
        List<Task> tasks = this.userTasks.get(userId);
        tasks.add(newTask);

        return newTask.getId();
    }

    private List<Task> getUncompletedTasks (int userId) {
        List<Task> tasks = this.userTasks.getOrDefault(userId, new ArrayList<>());
        List<Task> uncompletedTasks = new ArrayList<>();

        if (this.userTasks.containsKey(userId)) {
            for (Task task : tasks) {
                if (!task.getIsComplete()) {
                    uncompletedTasks.add(task);
                }
            }
        }

        return uncompletedTasks;
    }

    public List<String> getAllTasks(int userId) {
        List<Task> tasks = this.userTasks.getOrDefault(userId, new ArrayList<>());

        List<Task> uncompletedTasks = getUncompletedTasks(userId);

        Collections.sort(uncompletedTasks, (t1, t2) -> Integer.compare(t1.getDueDate(), t2.getDueDate()));

        List<String> tasksDescription = new ArrayList<>();

        for (Task uncompletedTask : uncompletedTasks) {
            tasksDescription.add(uncompletedTask.getDescription());
        }

        return tasksDescription;
    }

    public List<String> getTasksForTag(int userId, String tag) {
        List<Task> uncompletedTasks = getUncompletedTasks(userId);
        List<String> tasksDescription = new ArrayList<>();

        for (Task task : uncompletedTasks) {
            if (!task.getIsComplete() && task.getTags().contains(tag)) {
                tasksDescription.add(task.getDescription());
            }
        }

        return tasksDescription;
    }

    public void completeTask(int userId, int taskId) {
        List<Task> uncompletedTasks = getUncompletedTasks(userId);

        for (Task task : uncompletedTasks) {
            if (!task.getIsComplete() && task.getId() == taskId) {
                task.setIsComplete(true);
                return;
            }
        }
    }
}
