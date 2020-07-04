package co.knowledgehut.bootcamp.devops.level1.project.peopleservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleServiceTest {
    @Test
    public void returnAll3people() {
        PeopleService peopleService = new PeopleService();
        assertEquals(3, peopleService.getPeople().size());
    }
}