package com.microservice.carthistoryservice.Repository;


import com.microservice.carthistoryservice.Model.Cart;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    @Modifying
    @Transactional
    @Query("DELETE  FROM Cart c where c.name=:name AND c.userId=:userId ")
   void deleteCartByName(@Param("name") String name , @Param("userId") Long userId);


    @Query("select c from Cart c where c.userId=:userId AND c.name=:name")
    Cart findCartByName(@Param("name") String name , @Param("userId") Long userId);

    @Query("select c from Cart c where c.userId=:userId")
    List<Cart> showAllCart( @Param("userId") Long userId);

    @Modifying
    @Transactional
    @Query("DELETE  FROM Cart c where c.userId=:userId ")
    void deleteAllById( @Param("userId") Long userId);


}
