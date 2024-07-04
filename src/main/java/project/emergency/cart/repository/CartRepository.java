package project.emergency.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Repository;
import project.emergency.cart.entity.Cart;

import java.util.Optional;


@Repository
//@EnableJpaAuditing
public interface CartRepository  extends JpaRepository<Cart, Integer> {
    Optional<Cart> findByShop_ProdNoAndMember_MemId(int prodNo, String memberId);
}