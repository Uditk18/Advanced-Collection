//MovieDetails with all the setters and getters and toString method 
package com.capgemini.AdvancedCollection2;

public class MovieDetails {

	String mov_Name;
	String lead_actor;
	String lead_actress;
	String genre;

	public MovieDetails(String mov_Name, String lead_actor, String lead_actress, String genre) {

		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}

	// getters and setters methods

	public String getMov_Name() {
		return mov_Name;
	}

	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getLead_actress() {
		return lead_actress;
	}

	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "--------Movie Detail-------- \n Movie_Name=" + mov_Name + ", Lead_actor=" + lead_actor
				+ ", Lead_actress=" + lead_actress + ", Genre=" + genre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((lead_actor == null) ? 0 : lead_actor.hashCode());
		result = prime * result + ((lead_actress == null) ? 0 : lead_actress.hashCode());
		result = prime * result + ((mov_Name == null) ? 0 : mov_Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDetails other = (MovieDetails) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (lead_actor == null) {
			if (other.lead_actor != null)
				return false;
		} else if (!lead_actor.equals(other.lead_actor))
			return false;
		if (lead_actress == null) {
			if (other.lead_actress != null)
				return false;
		} else if (!lead_actress.equals(other.lead_actress))
			return false;
		if (mov_Name == null) {
			if (other.mov_Name != null)
				return false;
		} else if (!mov_Name.equals(other.mov_Name))
			return false;
		return true;
	}

}
