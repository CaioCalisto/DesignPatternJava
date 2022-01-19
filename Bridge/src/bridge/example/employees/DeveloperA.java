package bridge.example.employees;

import bridge.example.tasks.Task;

public class DeveloperA implements Employee{
    private Task task;

    public  DeveloperA(Task task){

        this.task = task;
    }
    @Override
    public void CreateCode() {
        System.out.println("DeveloperA is working");
        task.Do();
    }
}
