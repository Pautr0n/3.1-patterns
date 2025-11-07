package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo undoInstance;
    private List<String> history;

    private Undo() {
        history = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (undoInstance == null) undoInstance = new Undo();
        return undoInstance;
    }

    public void addCommand(String command) {
        history.add(command);
    }

    public void rmLastCommand() {
        if (!history.isEmpty()) {
            history.removeLast();
        }
    }

    public void rmCommandByPos(int position) throws IndexOutOfBoundsException {
        if (!history.isEmpty()) {
            history.remove(position - 1);
        }
    }

    public void rmAllCommands(){
        if(!history.isEmpty()){
            history.clear();
        }
    }

    public void printCommandsHistory() {
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + " " + history.get(i));
        }
    }
}
