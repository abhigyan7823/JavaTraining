package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entites.CartItem;
import com.app.entites.Product;

public interface CartItemRepo extends JpaRepository<CartItem, Long>{
	
	@Query("SELECT ci.product FROM CartItem ci WHERE ci.product.id = ?1")
	Product findProductById(Long productId);
	
	@Query("SELECT ci FROM CartItem ci WHERE ci.cart.id = ?1 AND ci.product.id = ?2")
	CartItem findCartItemByProductIdAndCartId(Long cartId, Long productId);
	
	@Modifying
    @Query("DELETE FROM CartItem ci WHERE ci.cart.id = ?1 AND ci.product.id = ?2")
    void deleteCartItemByProductIdAndCartId(Long productId, Long cartId);
}
