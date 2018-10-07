package my.aeonmanmc.origin.model;

public class GamePojo {

	private String name;
	private String releaseDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String toString() {
		return String.format("GamePojo [name: %s, releaseDate: %s]", this.name, this.releaseDate);
	}

}
