package ru.kolivim.myproject.task.management.system.impl.repository.account;

import org.springframework.stereotype.Repository;
import ru.kolivim.myproject.task.management.system.domain.account.Account;
import ru.kolivim.myproject.task.management.system.impl.repository.base.BaseRepository;

import java.util.Optional;

@Repository
public interface AccountRepository extends BaseRepository<Account> {

    Optional<Account> findFirstByEmail(String email);
}
