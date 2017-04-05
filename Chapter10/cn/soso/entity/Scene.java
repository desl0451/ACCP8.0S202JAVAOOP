package cn.soso.entity;

public class Scene {
	/**
	 * 
	 */
	public String type;
	public int data;
	public String description;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Scene(String type, int data, String description) {
		this.type = type;
		this.data = data;
		this.description = description;
	}
}
