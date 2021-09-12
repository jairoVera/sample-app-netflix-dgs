package pl.piomin.samples.spring.graphql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.piomin.samples.spring.graphql.domain.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Integer> {
}