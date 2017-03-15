package com.service;

/**
 * A interface to define the method for impl.
 *
 * @author Kenny
 */

public interface IChallengeManager {
	void addUserRound(int userId, int roundId, double primaryStat, double secondaryStat);
    void removeUserRound(int userId, int roundId);
    int getUserRank(int userId);
    int[] getUsers();
    int[] getUserRounds(int userId);
}
