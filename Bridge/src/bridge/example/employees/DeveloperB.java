package bridge.example.employees;

import bridge.example.tasks.Task;

public class DeveloperB implements Employee{

    private Task task;

    public DeveloperB(Task task){
        this.task = task;
    }

    @Override
    public void CreateCode() {
        System.out.println("DeveloperB is working");
        task.Do();
    }
}
