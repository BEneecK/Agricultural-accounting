package by.bsuir.web.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user_roles")
public class UserRole {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "role")
    private String role;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_roles_id")
    private List<User> users = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
