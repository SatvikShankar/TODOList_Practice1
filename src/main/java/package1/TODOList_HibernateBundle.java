package package1;

import io.dropwizard.hibernate.HibernateBundle;

public class TODOList_HibernateBundle extends HibernateBundle<TODOList_Configuration> {
    public TODOList_HibernateBundle() {
        super(Task.class); // Add other entity classes here if needed
    }
}

