package ua.lviv.team4.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.team4.library.model.Order;

@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {
}
