package co.knowledgehut.bootcamp.devops.level1.project.peopleservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@CrossOrigin(origins = "*")
@RestController
public class PeopleService {
    private final List<Person> people = asList(
            new Person("1", "Bryan", "Dollery", "Chief Engineer", 54),
            new Person("2", "Linus", "Torvalds", "Genius", 51),
            new Person("3", "Richard", "Stallman", "Hippy", 63)
    );

    @GetMapping
    public List<Person> getPeople() {
        return people;
    }
}
