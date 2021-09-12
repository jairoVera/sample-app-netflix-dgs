package pl.piomin.samples.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.piomin.samples.spring.graphql.domain.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer>,
    JpaSpecificationExecutor<Department> {

}