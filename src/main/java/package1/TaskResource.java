package package1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/tasks")
public class TaskResource {
    private final TaskDAO taskDAO;

    public TaskResource(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @GET
    public List<Task> getAllTasks() {
        return taskDAO.getAllTasks();
    }
}
