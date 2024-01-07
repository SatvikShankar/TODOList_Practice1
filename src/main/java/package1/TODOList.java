package package1;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TODOList extends Application<TODOList_Configuration> {
    public static void main(String[] args) throws Exception {
        new TODOList().run(args);
    }

    @Override
    public void initialize(Bootstrap<TODOList_Configuration> bootstrap) {
        bootstrap.addBundle(new TODOList_HibernateBundle());
    }

    @Override
    public void run(TODOList_Configuration configuration, Environment environment) {
        final TaskDAO taskDAO = new TaskDAO(hibernate.getSessionFactory());
        environment.jersey().register(new TaskResource(taskDAO));
    }
}
