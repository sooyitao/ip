package hana.command;

import hana.HanaException;
import hana.storage.Storage;
import hana.tasklist.TaskList;
import hana.ui.Ui;

/**
 * Represents a command to print list of all tasks.
 * When executed, this command will print all tasks.
 */
public class ListCommand extends Command {

    /**
     * Executes the command to print all tasks.
     *
     * @param taskList The list of tasks.
     * @param ui The UI object used to interact with the user.
     * @param storage The storage object to handle reading/writing of tasks.
     * @throws HanaException If an error occurs during command execution.
     */
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws HanaException {
        if (taskList.isEmpty()) {
            ui.printMessage("No Task in list.\nAdd Task using todo, deadline or event");
        }
        ui.printTasks(taskList.getTasks());
    }
}
