package Group3.SpringAssignment1;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Course {

    private Long id;

    @NotBlank(message = "Course name is required")
    private String name;

    @NotBlank(message = "Course type is required")
    private String type;

    /*@NotNull(message = "Duration is required")
    private Integer duration;*/

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   /* public Integer getDuration() {
        return duration;
    }*/

    /*public void setDuration(Integer duration) {
        this.duration = duration;
    }*/
}
