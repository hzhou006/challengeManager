package com.domain;

import com.domain.GeneratedValue;
import com.domain.id;

public class Ranks {
	@id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int userId;
    int rank;
    double avgStat;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getAvgStat() {
		return avgStat;
	}
	public void setAvgStat(double avgStat) {
		this.avgStat = avgStat;
	}
	
 	public int getRank() {
 		return rank;
 	}
 	public void setRank(int rank) {
 		this.rank = rank;
 	}
}
