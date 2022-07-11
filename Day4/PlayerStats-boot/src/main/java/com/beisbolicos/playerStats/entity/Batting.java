package com.beisbolicos.playerStats.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@IdClass(BattingKey.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="batting")
public class Batting implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "playerid", nullable = false)
	private String playerId;
	@Id
	@Column(name = "yearid", nullable = false)
	private int yearId;
	@Id
	@Column(name = "stint")
	private String stint;
	@Id
	@Column(name = "teamid", nullable = false)
	private String teamId;
	@Column(name="lgid")
	private String lgId;
	@Column(name="G")
	private int games;
	@Column(name="ab")
	private int atBat;
	@Column(name="r")
	private int runs;
	@Column(name="h")
	private int hits;
	@Column(name="2b")
	private int doubleHits;
	@Column(name="3b")
	private int tripeHits;
	@Column(name = "hr")
	private int homeRuns;
	@Column(name = "rbi")
	private int runsBattedIn;
	@Column(name = "sb")
	private int stolenBases;
	@Column(name = "cs")
	private int caughtStealing;
	@Column(name = "bb")
	private int baseOnBalls;
	@Column(name = "so")
	private int strikedut;
	@Column(name = "ibb")
	private int intentionalBaseOnBalls;
	@Column(name="hbp")
	private int hitByPitch;
	@Column(name="sh")
	private int sacrificeHit;
	@Column(name="sf")
	private int sacrificeFly;
	@Column(name="gidp")
	private int groundInDoublePlay;
	
	
	
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



	public String getLgId() {
		return lgId;
	}



	public void setLgId(String lgId) {
		this.lgId = lgId;
	}



	public int getGames() {
		return games;
	}



	public void setGames(int games) {
		this.games = games;
	}



	public int getAtBat() {
		return atBat;
	}



	public void setAtBat(int atBat) {
		this.atBat = atBat;
	}



	public int getRuns() {
		return runs;
	}



	public void setRuns(int runs) {
		this.runs = runs;
	}



	public int getHits() {
		return hits;
	}



	public void setHits(int hits) {
		this.hits = hits;
	}



	public int getDoubleHits() {
		return doubleHits;
	}



	public void setDoubleHits(int doubleHits) {
		this.doubleHits = doubleHits;
	}



	public int getTripeHits() {
		return tripeHits;
	}



	public void setTripeHits(int tripeHits) {
		this.tripeHits = tripeHits;
	}



	public int getHomeRuns() {
		return homeRuns;
	}



	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}



	public int getRunsBattedIn() {
		return runsBattedIn;
	}



	public void setRunsBattedIn(int runsBattedIn) {
		this.runsBattedIn = runsBattedIn;
	}



	public int getStolenBases() {
		return stolenBases;
	}



	public void setStolenBases(int stolenBases) {
		this.stolenBases = stolenBases;
	}



	public int getCaughtStealing() {
		return caughtStealing;
	}



	public void setCaughtStealing(int caughtStealing) {
		this.caughtStealing = caughtStealing;
	}



	public int getBaseOnBalls() {
		return baseOnBalls;
	}



	public void setBaseOnBalls(int baseOnBalls) {
		this.baseOnBalls = baseOnBalls;
	}



	public int getStrikedut() {
		return strikedut;
	}



	public void setStrikedut(int strikedut) {
		this.strikedut = strikedut;
	}



	public int getIntentionalBaseOnBalls() {
		return intentionalBaseOnBalls;
	}



	public void setIntentionalBaseOnBalls(int intentionalBaseOnBalls) {
		this.intentionalBaseOnBalls = intentionalBaseOnBalls;
	}



	public int getHitByPitch() {
		return hitByPitch;
	}



	public void setHitByPitch(int hitByPitch) {
		this.hitByPitch = hitByPitch;
	}



	public int getSacrificeHit() {
		return sacrificeHit;
	}



	public void setSacrificeHit(int sacrificeHit) {
		this.sacrificeHit = sacrificeHit;
	}



	public int getSacrificeFly() {
		return sacrificeFly;
	}



	public void setSacrificeFly(int sacrificeFly) {
		this.sacrificeFly = sacrificeFly;
	}



	public int getGroundInDoublePlay() {
		return groundInDoublePlay;
	}



	public void setGroundInDoublePlay(int groundInDoublePlay) {
		this.groundInDoublePlay = groundInDoublePlay;
	}



	@Override
	public String toString() {
		return "Batting [id=" + playerId + ", team=" + teamId + ", Year=" + yearId + ", at Bat="
				+ atBat + ", Hits=" + hits +"]";
	}
}
