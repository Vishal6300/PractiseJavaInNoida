package com.todo.tasks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Tasks {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer taskId;
		private String taskFolderName;
		private String taskName;
		private String taskDescription;
		private Boolean taskStatus;
		@ManyToOne
		private TaskFolder taskfolder;
		
		
				
		public Integer getTaskId() {
			return taskId;
		}



		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}



		public String getTaskFolderName() {
			return taskFolderName;
		}



		public void setTaskFolderName(String taskFolderName) {
			this.taskFolderName = taskFolderName;
		}



		public String getTaskName() {
			return taskName;
		}



		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}



		public String getTaskDescription() {
			return taskDescription;
		}



		public void setTaskDescription(String taskDescription) {
			this.taskDescription = taskDescription;
		}



		public Boolean getTaskStatus() {
			return taskStatus;
		}



		public void setTaskStatus(Boolean taskStatus) {
			this.taskStatus = taskStatus;
		}



		public TaskFolder getTaskfolder() {
			return taskfolder;
		}



		public void setTaskfolder(TaskFolder taskfolder) {
			this.taskfolder = taskfolder;
		}



		public Tasks(Integer taskId, String taskFolderName, String taskName, String taskDescription, Boolean taskStatus,
				TaskFolder taskfolder) {
			super();
			this.taskId = taskId;
			this.taskFolderName = taskFolderName;
			this.taskName = taskName;
			this.taskDescription = taskDescription;
			this.taskStatus = taskStatus;
			this.taskfolder = taskfolder;
		}



		public Tasks() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
