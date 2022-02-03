package edu.escuelaing.ieti.apiRest.service;

import edu.escuelaing.ieti.apiRest.data.Task;
import edu.escuelaing.ieti.apiRest.dto.TaskDto;

import java.util.List;

public interface TaskService {
    Task create(Task task );

    Task findById( String id );

    List<Task> getAll();

    boolean deleteById( String id );

    Task update(Task taskDto, String id );
}
