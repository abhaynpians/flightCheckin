package com.id.flightcheckin.integration;

import com.id.flightcheckin.integration.dto.Reservation;
import com.id.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long Id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);

}
