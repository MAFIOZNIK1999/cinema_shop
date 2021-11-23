package cinema.shop.spring.dao.impl;

import cinema.shop.spring.dao.AbstractDao;
import cinema.shop.spring.dao.RoleDao;
import cinema.shop.spring.exception.DataProcessingException;
import cinema.shop.spring.model.Role;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(String roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> query = session.createQuery("FROM Role WHERE role =:role", Role.class);
            query.setParameter("role", Role.Authority.getEnumByName(roleName));
            return query.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Role with name " + roleName + " not found", e);
        }
    }
}
