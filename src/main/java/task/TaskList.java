package task;

import java.util.ArrayList;

/**
 * The task list that holds all the tasks.
 */
public class TaskList {
    /**
     * The task list which contains all the tasks.
     */
    private ArrayList<Task> taskList;

    /**
     * TaskList class constructor.
     */
    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    /**
     * TaskList class constructor.
     * @param taskArray The task list that is loaded into the TaskList constructor.
     */
    public TaskList(ArrayList<Task> taskArray) {
        this.taskList = taskArray;
    }

    /**
     * Outputs the length of the task list as an integer.
     * @return The length of the task list.
     */
    public int length() {
        return this.taskList.size();
    }

    /**
     * Returns the task list as an array list.
     */
    public ArrayList<Task> getList() {
        return this.taskList;
    }

    /**
     * Retrieves the task from the task list at the specified index.
     * @param index The task index for which task is to be retrived.
     * @return The task at the specified index.
     */
    public Task getTask(int index) {
        return this.taskList.get(index);
    }

    /**
     * Checks if the task list is empty.
     * @return A boolean value representing whether the task list is empty or not.
     */
    public boolean isEmpty() {
        return this.taskList.isEmpty();
    }

    /**
     * Adds a new task to the task list.
     * @param newTask The new task that is to be added.
     */
    public void addTask(Task newTask) {
        this.taskList.add(newTask);
        System.out.println("Got it. I've added this task:");
        System.out.println(newTask.toString());
    }

    /**
     * Marks the task in the task list at the specified index.
     * @param taskIndex The task index of the task that is to be marked.
     * @param isMarked A variable that determines whether a task is to be marked or unmarked.
     * @return A task that is marked or unmarked depending on the isMarked variable.
     */
    public Task markTask(int taskIndex, boolean isMarked) {
        Task taskToMark = this.taskList.get(taskIndex);
        taskToMark.setDone(isMarked);
        return taskToMark;
    }

    /**
     * Deletes the task in the task list at the specified index.
     * @param taskIndex The task index of the task that is to be deleted.
     * @return The task that has been deleted.
     */
    public Task deleteTask(int taskIndex) {
        return this.taskList.remove(taskIndex);
    }

    /**
     * Returns a task list of all tasks with the matching keyword.
     * @param keyword The keyword that the user is filtering.
     * @return The task list with matching keywords.
     */
    public TaskList find(String keyword) {
        ArrayList<Task> arr = new ArrayList<>();
        for (Task task : this.taskList) {
            if (task.contains(keyword)) {
                arr.add(task);
            }
        }
        TaskList foundTasks = new TaskList(arr);
        return foundTasks;
    }
}