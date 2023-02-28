package com.id.flightcheckin.integration.dto;

public class ReservationUpdateRequest {
	

	private long id;
	
	
	private int NumberOfBags;
	boolean checkedIn;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumberOfBags() {
		return NumberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		 this.NumberOfBags = numberOfBags;
	}

	public boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckIn(boolean checkedIn) {
		this.checkedIn=checkedIn;
	}

}
