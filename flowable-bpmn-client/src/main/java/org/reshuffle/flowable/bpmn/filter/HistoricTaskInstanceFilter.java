package org.reshuffle.flowable.bpmn.filter;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/22.
 */
public class HistoricTaskInstanceFilter extends AbstractParamsFilter {
    private String taskId;
    private String processInstanceId;
    private String processBusinessKey;
    private String processBusinessKeyLike;
    private String processDefinitionId;
    private String processDefinitionKey;
    private String processDefinitionKeyLike;
    private String processDefinitionName;
    private String processDefinitionNameLike;
    private String executionId;
    private String taskName;
    private String taskNameLike;
    private String taskDescription;
    private String taskDescriptionLike;
    private String taskDefinitionKey;
    private String taskDefinitionKeyLike;
    private String taskCategory;
    private String taskDeleteReason;
    private String taskDeleteReasonLike;
    private String taskAssignee;
    private String taskAssigneeLike;
    private String taskOwner;
    private String taskOwnerLike;
    private String taskInvolvedUser;
    private Integer taskPriority;
    private Integer taskMinPriority;
    private Integer taskMaxPriority;
    private Boolean finished;
    private Boolean processFinished;
    private String parentTaskId;
    private Date dueDate;
    private Date dueDateAfter;
    private Date dueDateBefore;
    private Boolean withoutDueDate;
    private Date taskCreatedOn;
    private Date taskCreatedBefore;
    private Date taskCreatedAfter;
    private Date taskCompletedOn;
    private Date taskCompletedBefore;
    private Date taskCompletedAfter;
    private Boolean includeTaskLocalVariables;
    private Boolean includeProcessVariables;
    private String tenantId;
    private String tenantIdLike;
    private Boolean withoutTenantId;
    private String taskCandidateGroup;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessBusinessKey() {
        return processBusinessKey;
    }

    public void setProcessBusinessKey(String processBusinessKey) {
        this.processBusinessKey = processBusinessKey;
    }

    public String getProcessBusinessKeyLike() {
        return processBusinessKeyLike;
    }

    public void setProcessBusinessKeyLike(String processBusinessKeyLike) {
        this.processBusinessKeyLike = processBusinessKeyLike;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public String getProcessDefinitionKeyLike() {
        return processDefinitionKeyLike;
    }

    public void setProcessDefinitionKeyLike(String processDefinitionKeyLike) {
        this.processDefinitionKeyLike = processDefinitionKeyLike;
    }

    public String getProcessDefinitionName() {
        return processDefinitionName;
    }

    public void setProcessDefinitionName(String processDefinitionName) {
        this.processDefinitionName = processDefinitionName;
    }

    public String getProcessDefinitionNameLike() {
        return processDefinitionNameLike;
    }

    public void setProcessDefinitionNameLike(String processDefinitionNameLike) {
        this.processDefinitionNameLike = processDefinitionNameLike;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskNameLike() {
        return taskNameLike;
    }

    public void setTaskNameLike(String taskNameLike) {
        this.taskNameLike = taskNameLike;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescriptionLike() {
        return taskDescriptionLike;
    }

    public void setTaskDescriptionLike(String taskDescriptionLike) {
        this.taskDescriptionLike = taskDescriptionLike;
    }

    public String getTaskDefinitionKey() {
        return taskDefinitionKey;
    }

    public void setTaskDefinitionKey(String taskDefinitionKey) {
        this.taskDefinitionKey = taskDefinitionKey;
    }

    public String getTaskDefinitionKeyLike() {
        return taskDefinitionKeyLike;
    }

    public void setTaskDefinitionKeyLike(String taskDefinitionKeyLike) {
        this.taskDefinitionKeyLike = taskDefinitionKeyLike;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    public String getTaskDeleteReason() {
        return taskDeleteReason;
    }

    public void setTaskDeleteReason(String taskDeleteReason) {
        this.taskDeleteReason = taskDeleteReason;
    }

    public String getTaskDeleteReasonLike() {
        return taskDeleteReasonLike;
    }

    public void setTaskDeleteReasonLike(String taskDeleteReasonLike) {
        this.taskDeleteReasonLike = taskDeleteReasonLike;
    }

    public String getTaskAssignee() {
        return taskAssignee;
    }

    public void setTaskAssignee(String taskAssignee) {
        this.taskAssignee = taskAssignee;
    }

    public String getTaskAssigneeLike() {
        return taskAssigneeLike;
    }

    public void setTaskAssigneeLike(String taskAssigneeLike) {
        this.taskAssigneeLike = taskAssigneeLike;
    }

    public String getTaskOwner() {
        return taskOwner;
    }

    public void setTaskOwner(String taskOwner) {
        this.taskOwner = taskOwner;
    }

    public String getTaskOwnerLike() {
        return taskOwnerLike;
    }

    public void setTaskOwnerLike(String taskOwnerLike) {
        this.taskOwnerLike = taskOwnerLike;
    }

    public String getTaskInvolvedUser() {
        return taskInvolvedUser;
    }

    public void setTaskInvolvedUser(String taskInvolvedUser) {
        this.taskInvolvedUser = taskInvolvedUser;
    }

    public Integer getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Integer taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Integer getTaskMinPriority() {
        return taskMinPriority;
    }

    public void setTaskMinPriority(Integer taskMinPriority) {
        this.taskMinPriority = taskMinPriority;
    }

    public Integer getTaskMaxPriority() {
        return taskMaxPriority;
    }

    public void setTaskMaxPriority(Integer taskMaxPriority) {
        this.taskMaxPriority = taskMaxPriority;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Boolean getProcessFinished() {
        return processFinished;
    }

    public void setProcessFinished(Boolean processFinished) {
        this.processFinished = processFinished;
    }

    public String getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDateAfter() {
        return dueDateAfter;
    }

    public void setDueDateAfter(Date dueDateAfter) {
        this.dueDateAfter = dueDateAfter;
    }

    public Date getDueDateBefore() {
        return dueDateBefore;
    }

    public void setDueDateBefore(Date dueDateBefore) {
        this.dueDateBefore = dueDateBefore;
    }

    public Boolean getWithoutDueDate() {
        return withoutDueDate;
    }

    public void setWithoutDueDate(Boolean withoutDueDate) {
        this.withoutDueDate = withoutDueDate;
    }

    public Date getTaskCreatedOn() {
        return taskCreatedOn;
    }

    public void setTaskCreatedOn(Date taskCreatedOn) {
        this.taskCreatedOn = taskCreatedOn;
    }

    public Date getTaskCreatedBefore() {
        return taskCreatedBefore;
    }

    public void setTaskCreatedBefore(Date taskCreatedBefore) {
        this.taskCreatedBefore = taskCreatedBefore;
    }

    public Date getTaskCreatedAfter() {
        return taskCreatedAfter;
    }

    public void setTaskCreatedAfter(Date taskCreatedAfter) {
        this.taskCreatedAfter = taskCreatedAfter;
    }

    public Date getTaskCompletedOn() {
        return taskCompletedOn;
    }

    public void setTaskCompletedOn(Date taskCompletedOn) {
        this.taskCompletedOn = taskCompletedOn;
    }

    public Date getTaskCompletedBefore() {
        return taskCompletedBefore;
    }

    public void setTaskCompletedBefore(Date taskCompletedBefore) {
        this.taskCompletedBefore = taskCompletedBefore;
    }

    public Date getTaskCompletedAfter() {
        return taskCompletedAfter;
    }

    public void setTaskCompletedAfter(Date taskCompletedAfter) {
        this.taskCompletedAfter = taskCompletedAfter;
    }

    public Boolean getIncludeTaskLocalVariables() {
        return includeTaskLocalVariables;
    }

    public void setIncludeTaskLocalVariables(Boolean includeTaskLocalVariables) {
        this.includeTaskLocalVariables = includeTaskLocalVariables;
    }

    public Boolean getIncludeProcessVariables() {
        return includeProcessVariables;
    }

    public void setIncludeProcessVariables(Boolean includeProcessVariables) {
        this.includeProcessVariables = includeProcessVariables;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantIdLike() {
        return tenantIdLike;
    }

    public void setTenantIdLike(String tenantIdLike) {
        this.tenantIdLike = tenantIdLike;
    }

    public Boolean getWithoutTenantId() {
        return withoutTenantId;
    }

    public void setWithoutTenantId(Boolean withoutTenantId) {
        this.withoutTenantId = withoutTenantId;
    }

    public String getTaskCandidateGroup() {
        return taskCandidateGroup;
    }

    public void setTaskCandidateGroup(String taskCandidateGroup) {
        this.taskCandidateGroup = taskCandidateGroup;
    }
}
