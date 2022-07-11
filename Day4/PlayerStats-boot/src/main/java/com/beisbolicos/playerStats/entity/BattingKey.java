package com.beisbolicos.playerStats.entity;

import java.io.Serializable;

public class BattingKey implements Serializable{
	
		private String playerId;
		private int yearId;
		private String stint;
		private String teamId;

		public String getPlayerId() {
			return playerId;
		}

		public void setPlayerId(String playerId) {
			this.playerId = playerId;
		}

		public int getYearId() {
			return yearId;
		}

		public void setYearId(int yearId) {
			this.yearId = yearId;
		}

		public String getStint() {
			return stint;
		}

		public void setStint(String stint) {
			this.stint = stint;
		}

		public String getTeamId() {
			return teamId;
		}

		public void setTeamId(String teamId) {
			this.teamId = teamId;
		}
		
}
