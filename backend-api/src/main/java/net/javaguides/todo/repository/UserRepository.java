package net.javaguides.todo.repository;

import net.javaguides.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.StyledEditorKit;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUsername(String username);

    Boolean existByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);
}
