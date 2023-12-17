package ru.skillbox.diplom.group40.social.network.impl.repository.task;

import org.springframework.stereotype.Repository;
import ru.skillbox.diplom.group40.social.network.domain.task.Task;
import ru.skillbox.diplom.group40.social.network.impl.repository.base.BaseRepository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TaskRepository extends BaseRepository<Task> {

    Optional<Task> findByIdAndIsDeletedFalse(UUID id);

}
