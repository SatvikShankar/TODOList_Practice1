package package1;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class Task {
    private String ID;
    private String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date start_date;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date end_date;
    private String status;

    // Constructors, getters, and setters
}