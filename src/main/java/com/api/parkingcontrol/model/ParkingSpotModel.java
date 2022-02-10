package com.api.parkingcontrol.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
		private static final long serialVersionUID = 1l;
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private UUID id;
		
		@Column(nullable = false, unique = true, length = 10)
		private String parkingSpotNumber;
		
		@Column(nullable = false, unique = true, length =  7)
		private String licensePlatecar;
		
		@Column(nullable = false, length = 70)
		private String brandCar;
		
		@Column(nullable = false, length = 70)
		private String modelCar;
		
		@Column(nullable = false, length = 70)
		private String colorCar;
		
		@Column(nullable = false)
		private LocalDateTime registrationDate;
		
		@Column(nullable = false, length = 130)
		private String responsibleName;

		public UUID getId() {
			return id;
		}

		public void setId(UUID id) {
			this.id = id;
		}

		public String getParkingSpotNumber() {
			return parkingSpotNumber;
		}

		public void setParkingSpotNumber(String parkingSpotNumber) {
			this.parkingSpotNumber = parkingSpotNumber;
		}

		public String getLicensePlatecar() {
			return licensePlatecar;
		}

		public void setLicensePlatecar(String licensePlatecar) {
			this.licensePlatecar = licensePlatecar;
		}

		public String getBrandCar() {
			return brandCar;
		}

		public void setBrandCar(String brandCar) {
			this.brandCar = brandCar;
		}

		public String getModelCar() {
			return modelCar;
		}

		public void setModelCar(String modelCar) {
			this.modelCar = modelCar;
		}

		public String getColorCar() {
			return colorCar;
		}

		public void setColorCar(String colorCar) {
			this.colorCar = colorCar;
		}

		public LocalDateTime getRegistrationDate() {
			return registrationDate;
		}

		public void setRegistrationDate(LocalDateTime registrationDate) {
			this.registrationDate = registrationDate;
		}

		public String getResponsibleName() {
			return responsibleName;
		}

		public void setResponsibleName(String responsibleName) {
			this.responsibleName = responsibleName;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
		
}
