package pl.piomin.samples.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.piomin.samples.spring.graphql.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>,
    JpaSpecificationExecutor<Employee> {
}