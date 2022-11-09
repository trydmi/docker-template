package ua.trydmi.personapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.trydmi.personapp.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
