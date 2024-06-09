//Program to demonstrate Undo/Redo Functionality using ArrayDeque
package ProgramPackage22;
import java.util.ArrayDeque;
import java.util.Deque;

public class UndoRedoFunctionality {
    public static void main(String[] args) {
        Deque<String> actionHistory = new ArrayDeque<>();

        // Perform actions and add them to the history
        performAction("Action 1", actionHistory);
        performAction("Action 2", actionHistory);
        performAction("Action 3", actionHistory);

        // Undo the last action
        if (!actionHistory.isEmpty()) {
            String lastAction = actionHistory.removeLast();
            System.out.println("Undo: " + lastAction);
        }

        // Redo the previously undone action
        if (!actionHistory.isEmpty()) {
            String undoneAction = actionHistory.removeLast();
            System.out.println("Redo: " + undoneAction);
        }
    }

    private static void performAction(String action, Deque<String> actionHistory) {
        System.out.println("Performing action: " + action);
        // Perform the action

        // Add the action to the history
        actionHistory.addLast(action);
    }
}
