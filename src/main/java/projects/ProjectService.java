package projects;

import java.util.List;

import projects.entity.Project;

class ProjectService {

	private ProjectDao projectDao = new ProjectDao();
	
	// adds a new project to the DB
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

	// gets the list of all projects in the db
	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}

}
