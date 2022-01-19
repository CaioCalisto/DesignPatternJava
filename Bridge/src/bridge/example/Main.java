package bridge.example;

import bridge.example.employees.DeveloperA;
import bridge.example.employees.DeveloperB;
import bridge.example.tasks.Task;
import bridge.example.tasks.UIAlert;
import bridge.example.tasks.UIGrid;

public class Main {

    public static void main(String[] args) {
        Task alert = new UIAlert();
        Task grid = new UIGrid();

        DeveloperA developerA = new DeveloperA(alert);
        DeveloperB developerB = new DeveloperB(grid);

        developerA.CreateCode();
        developerB.CreateCode();

        developerA = new DeveloperA(grid);
        developerA.CreateCode();
    }
}
