package level1;

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

    public void rmCommandByPos(int position) {
        if (position >= 0 && position < history.size()) {
            history.remove(position - 1);
        }else{
            System.out.println("This position does not exists, please choose option 5 'Show command's history' to verify the correct position");
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
