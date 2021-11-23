package cinema.shop.spring.util;

import cinema.shop.spring.model.Role;
import cinema.shop.spring.model.User;
import cinema.shop.spring.service.RoleService;
import cinema.shop.spring.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRole(Role.Authority.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRole(Role.Authority.USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("admin123");
        admin.setRoles(Set.of(adminRole));
        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("user123");
        user.setRoles(Set.of(userRole));
        userService.add(admin);
        userService.add(user);
    }
}
