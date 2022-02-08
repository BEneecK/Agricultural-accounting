package by.bsuir.web.entity.repository;

import by.bsuir.web.entity.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
    UserRole findByRole(String str);
}
