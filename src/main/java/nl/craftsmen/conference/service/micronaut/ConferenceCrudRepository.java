package nl.craftsmen.conference.service.micronaut;

import javax.transaction.Transactional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.transaction.annotation.ReadOnly;

@Repository
public interface ConferenceCrudRepository extends CrudRepository<Conference, Long> {

    @Transactional
    @ReadOnly
    Iterable<Conference> findByName(String name);
}
