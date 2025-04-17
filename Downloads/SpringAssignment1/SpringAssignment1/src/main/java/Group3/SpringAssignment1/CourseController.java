package Group3.SpringAssignment1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/courses")
@Validated
public class CourseController {

    private final Map<Long, Course> courseRepo = new HashMap<>();
    private Long currentId = 1L;

    // CREATE
    @PostMapping
    public ResponseEntity<Course> createCourse(@Valid @RequestBody Course course) {
        course.setId(currentId++);
        courseRepo.put(course.getId(), course);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return ResponseEntity.ok(new ArrayList<>(courseRepo.values()));
    }

    // READ ONE
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        Course course = courseRepo.get(id);
        if (course == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(course);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable Long id, @Valid @RequestBody Course courseDetails) {
        Course course = courseRepo.get(id);
        if (course == null) {
            return ResponseEntity.notFound().build();
        }

        course.setName(courseDetails.getName());
        course.setType(courseDetails.getType());
        //course.setDuration(courseDetails.getDuration());

        courseRepo.put(id, course);
        return ResponseEntity.ok(course);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseRepo.remove(id);
        return ResponseEntity.noContent().build();
    }
}

