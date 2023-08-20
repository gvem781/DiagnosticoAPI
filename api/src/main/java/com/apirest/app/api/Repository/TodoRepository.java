package com.apirest.app.api.Repository;

import com.apirest.app.api.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
