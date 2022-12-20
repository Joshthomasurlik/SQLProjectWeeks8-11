package projects.entity;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Project {

	 private Integer projectId;
	  private String projectName;
	  private BigDecimal estimatedHours;
	  private BigDecimal actualHours;
	  private Integer difficulty;
	  private String notes;

	  private List<Material> materials = new LinkedList<>();
	  private List<Step> steps = new LinkedList<>();
	  private List<Category> categories = new LinkedList<>();
	
	public String getProjectName() {
		// TODO Auto-generated method stub
		return projectName;
	}
	
	public void setProjectName (String projectName) {
		this.projectName = projectName;
	}

	public BigDecimal getEstimatedHours() {
		// TODO Auto-generated method stub
		return this.estimatedHours;
	}
	
	public void setEstimatedHours (BigDecimal estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public BigDecimal getActualHours() {
		// TODO Auto-generated method stub
		return actualHours;
	}
	
	public void setActualHours(BigDecimal getActualHours, BigDecimal actualHours) {
		this.actualHours = actualHours;
	}

	public Integer getDifficulty() {
		// TODO Auto-generated method stub
		return difficulty;
	}
	
	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}

	public String getNotes() {
		// TODO Auto-generated method stub
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public Integer getProjectId() {
		// TODO Auto-generated method stub
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		// TODO Auto-generated method stub
		this.projectId = projectId;
	}
	
	public List <Material> getMaterials() {
		return materials;
	}
	
	public List <Step> getSteps() {
		return steps;
	}
	

	public List<Category> getCategories() {
		return categories;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += "\n    ID=" + projectId;
		result += "\n    name" + projectName;
		result += "\n    estimatedHours=" + estimatedHours;
		result += "\n    actualHours=" + actualHours;
		result += "\n    difficulty=" + difficulty;
		result += "\n    notes=" + notes;
		result += "\n    Materials:";
		
		for (Material material : materials) {
			result += "\n     " + material;
		}
		result += "\n   Steps:";
		
		for(Step step : steps) {
			result += "\n      " + step;
		}
	
		result += "\n   Categories:";
		
		for (Category category : categories) {
			result += "\n     " + category;
		}
		
		return result;
	}
	
	
	}


