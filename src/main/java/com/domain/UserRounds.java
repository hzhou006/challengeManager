package com.domain;
@Entity
@Table(name = "userrounds")
public class UserRounds {
    int userId;
    int roundId;
    double primaryStat;
    double secondaryStat;
    int id;
	public int getId() {
		return id;
	}
	public void setRank(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRoundId() {
		return roundId;
	}
	public void setRoundId(int roundId) {
		this.roundId = roundId;
	}
	public double getPrimaryStat() {
		return primaryStat;
	}
	public void setPrimaryStat(double primaryStat) {
		this.primaryStat = primaryStat;
	}
	public double getSecondaryStat() {
		return secondaryStat;
	}
	public void setSecondaryStat(double secondaryStat) {
		this.secondaryStat = secondaryStat;
	}
    
}
