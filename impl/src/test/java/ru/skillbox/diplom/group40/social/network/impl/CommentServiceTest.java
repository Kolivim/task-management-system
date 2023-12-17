package ru.skillbox.diplom.group40.social.network.impl;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import ru.skillbox.diplom.group40.social.network.api.dto.comment.CommentDto;
import ru.skillbox.diplom.group40.social.network.api.dto.task.PriorityType;
import ru.skillbox.diplom.group40.social.network.api.dto.task.StatusType;
import ru.skillbox.diplom.group40.social.network.domain.comment.Comment;
import ru.skillbox.diplom.group40.social.network.domain.task.Task;
import ru.skillbox.diplom.group40.social.network.impl.mapper.comment.CommentMapper;
import ru.skillbox.diplom.group40.social.network.impl.repository.comment.CommentRepository;
import ru.skillbox.diplom.group40.social.network.impl.repository.task.TaskRepository;
import ru.skillbox.diplom.group40.social.network.impl.service.comment.CommentService;
import ru.skillbox.diplom.group40.social.network.impl.service.task.TaskService;
import ru.skillbox.diplom.group40.social.network.impl.utils.technikalUser.TechnicalUserConfig;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Testcontainers
@SpringBootTest
@AutoConfigureMockMvc
@RequiredArgsConstructor
public class CommentServiceTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    CommentService commentService;
    @Autowired
    TaskService taskService;
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    JwtEncoder jwtEncoder;
    @Autowired
    TechnicalUserConfig technicalUser;
    @Autowired
    JwtEncoder accessTokenEncoder;
    @Autowired
    CommentMapper commentMapper;

    @Container
    @ServiceConnection
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:15")
            .withInitScript("ru/skillbox/diplom/group40/social/network/impl/schema.sql");

    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
        dynamicPropertyRegistry.add("spring.datasource.url", postgres::getJdbcUrl);
        dynamicPropertyRegistry.add("spring.datasource.username", postgres::getUsername);
        dynamicPropertyRegistry.add("spring.datasource.password", postgres::getPassword);
    }

    @BeforeAll
    static void beforeAll() {
        postgres.start();
    }

    @Test
    @Transactional
    @DisplayName("Test create Comment")
    public void create() {

        technicalUser.executeByTechnicalUser(() -> 1);

        UUID authorId = UUID.randomUUID();
        UUID executorId = UUID.randomUUID();
        UUID taskId = UUID.randomUUID();
        String commentText = "Тест коммент";
        String title = "Тест заголовок";
        String description = "Тест описание";

        Comment comment = new Comment();
        comment.setCommentText(commentText);
        comment.setAuthorId(authorId);

        Task task = new Task();
        task.setIsDeleted(false);
        task.setAuthorId(authorId);
        task.setExecutorId(executorId);
        task.setPriority(PriorityType.HIGH);
        task.setStatus(StatusType.PENDING);
        task.setDescription(description);
        task.setTitle(title);

        Task afterSaveTask = taskRepository.save(task);

        CommentDto commentDto = new CommentDto();
        commentDto.setCommentText(commentText);
        commentDto.setTaskId(afterSaveTask.getId());

        assertDoesNotThrow(() -> commentService.create(commentDto));

    }

    @Test
    @Transactional
    @DisplayName("Test create Comment with Exception")
    public void createException() {

        technicalUser.executeByTechnicalUser(() -> 1);

        UUID authorId = UUID.randomUUID();
        UUID executorId = UUID.randomUUID();
        UUID taskId = UUID.randomUUID();
        String commentText = "Тест коммент";
        String title = "Тест заголовок";
        String description = "Тест описание";

        Comment comment = new Comment();
        comment.setCommentText(commentText);
        comment.setAuthorId(authorId);

        Task task = new Task();
        task.setIsDeleted(false);
        task.setAuthorId(authorId);
        task.setExecutorId(executorId);
        task.setPriority(PriorityType.HIGH);
        task.setStatus(StatusType.PENDING);
        task.setDescription(description);
        task.setTitle(title);

        Task afterSaveTask = taskRepository.save(task);

        CommentDto commentDto = new CommentDto();
        commentDto.setCommentText(commentText);
        commentDto.setTaskId(taskId);

        assertThrows(Exception.class, () -> commentService.create(commentDto));

    }

    @Test
    @Transactional
    void test() {
        technicalUser.executeByTechnicalUser(() -> 2);
        Assertions.assertEquals(1, 1);
    }


}
