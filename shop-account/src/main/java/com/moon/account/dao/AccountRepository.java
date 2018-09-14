package com.moon.account.dao;

import com.moon.account.model.AccountDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountDO, Long> {

}
