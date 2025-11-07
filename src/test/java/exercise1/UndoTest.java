package exercise1;

import static org.junit.jupiter.api.Assertions.*;

class UndoTest {
    Undo undo;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        undo = Undo.getInstance();
        undo.addCommand("First command");
        undo.addCommand("Second command");
        undo.addCommand("Third command");
    }

    @org.junit.jupiter.api.AfterEach
    void setDown() {
        undo.rmAllCommands();
    }

    @org.junit.jupiter.api.Test
    void getInstance() {
        Undo undo2 = Undo.getInstance();
        assertEquals(undo, undo2);

    }

    @org.junit.jupiter.api.Test
    void addCommand() {
        undo.addCommand("Fourth command");
    }

    @org.junit.jupiter.api.Test
    void rmLastCommand() {
        undo.rmLastCommand();
    }

    @org.junit.jupiter.api.Test
    void rmCommandByPos() {
        undo.rmCommandByPos(3);
    }

    @org.junit.jupiter.api.Test
    void printCommandsHistory() {
        undo.printCommandsHistory();
    }
}