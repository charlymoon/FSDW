package com.beisbolicos.playerStats.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="people")
public class People implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name = "playerid", nullable = false, unique = true)
		private String playerId;
		
		@Column(name="namefirst" )
		private String nameFirst;
		
		@Column(name="namelast")
		private String nameLast;
		
		@Column(name="birthcity")
		private String birthCity;
		
		@Column(name="birthcountry")
		private String birthContry;
		
		@Column(name="birthday")
		private String birthDay;
		
		@Column(name="birthmonth")
		private String birthMonth;
		
		@Column(name="birthyear")
		private String birthYear;

		
		
		public String getPlayerId() {
			return playerId;
		}



		public void setPlayerId(String playerId) {
			this.playerId = playerId;
		}



		public String getNameFirst() {
			return nameFirst;
		}



		public void setNameFirst(String nameFirst) {
			this.nameFirst = nameFirst;
		}



		public String getNameLast() {
			return nameLast;
		}



		public void setNameLast(String nameLast) {
			this.nameLast = nameLast;
		}



		public String getBirthCity() {
			return birthCity;
		}



		public void setBirthCity(String birthCity) {
			this.birthCity = birthCity;
		}



		public String getBirthContry() {
			return birthContry;
		}



		public void setBirthContry(String birthContry) {
			this.birthContry = birthContry;
		}



		public String getBirthDay() {
			return birthDay;
		}



		public void setBirthDay(String birthDay) {
			this.birthDay = birthDay;
		}



		public String getBirthMonth() {
			return birthMonth;
		}



		public void setBirthMonth(String birthMonth) {
			this.birthMonth = birthMonth;
		}



		public String getBirthYear() {
			return birthYear;
		}



		public void setBirthYear(String birthYear) {
			this.birthYear = birthYear;
		}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}



		@Override
		public String toString() {
			return "player [id=" + playerId + ", firstName=" + nameFirst + ", lastName=" + nameLast + ", birthCity="
					+ birthCity + ", birthCountry=" + birthContry + ", birthDate=" + birthDay + "/"+birthMonth+"/"+birthYear+"]";
		}
}
