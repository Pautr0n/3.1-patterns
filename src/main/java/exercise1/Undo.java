package exercise1;

public class Undo {

    private static Undo undoInstance;

    private Undo() {
    }

    public static Undo getInstance() {
        if (undoInstance == null) undoInstance = new Undo();
        return undoInstance;
    }

    public void addCommand() {
    }

    public void rmLastCommand() {
    }

    public void rmCommandByPos(int position) {
    }

    public void printCommandsHistory() {
    }

}
