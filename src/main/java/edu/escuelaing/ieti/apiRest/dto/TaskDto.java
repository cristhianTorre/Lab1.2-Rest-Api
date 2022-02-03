package edu.escuelaing.ieti.apiRest.dto;

import edu.escuelaing.ieti.apiRest.data.Status;

import java.util.Date;

public class TaskDto {
    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private Date dueDate;

    public TaskDto(String name, String description, String status, String assignedTo, Date dueDate) {
        this.name = name;
        this.description = description;
        this.status = Status.valueOf(status);
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
