package com.example._ChuMinhKhai_A6.repository;

import com.example._ChuMinhKhai_A6.entity.Role;
import com.example._ChuMinhKhai_A6.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
    @Query("SELECT r FROM Role r WHERE r.name = ?1")
    User getRoleIdByName(String roleName);


}
