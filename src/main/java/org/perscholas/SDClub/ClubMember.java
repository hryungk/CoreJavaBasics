package org.perscholas.SDClub;

public class ClubMember {

	private String name;
	private String city;
	private String state;
	private String favLang;
	
	public ClubMember(String name, String city, String state, String favLang) {
		this.name = name;
		this.city = city;
		this.state = state;
		this.favLang = favLang;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += String.format("Member Name: %s%nLocation: %s, %s%nFavorite Language: %s", name, city, state, favLang);
		return result;
	}
	
	@Override
	public boolean equals(Object ob) {
		ClubMember obj = (ClubMember) ob;
		return name.equalsIgnoreCase(obj.getName()) && 
				city.equalsIgnoreCase(obj.getCity()) &&
				state.equalsIgnoreCase(obj.getState()) && 
				favLang.equalsIgnoreCase(obj.getFavLang());
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getFavLang() {
		return favLang;
	}
	
}
