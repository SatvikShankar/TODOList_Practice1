package package1;

import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;

public class TaskDAO extends AbstractDAO<Task> {
    public TaskDAO(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<Task> getAllTasks() {
        return list(namedQuery("Task.getAll"));
    }
}
