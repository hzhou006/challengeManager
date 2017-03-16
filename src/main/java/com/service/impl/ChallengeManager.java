package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.dao.UserRoundDao;
import com.service.IChallengeManager;

/**
 * implement the interface IChallengeManager all of methods
 * 
 * @author Kenny
 */

@Service
public class ChallengeManager implements IChallengeManager {
   
	@Autowired
	private UserDao userDao = null;
	
	@Autowired
	private UserRoundDao userRoundDao = null;
	@Override
	public void addUserRound(int userId, int roundId, double primaryStat, double secondaryStat) {
		
		userRoundDao.addUserRounds(userId, roundId, primaryStat, secondaryStat);
		userRoundDao.updateAllByUserId(userId);
	}

	@Override
	public void removeUserRound(int userId, int roundId) {
		userRoundDao.deleteById(userId, roundId);
		userRoundDao.updateAllByUserId(userId);
	}

	@Override
	public int getUserRank(int userId) {
		return userRoundDao.findUserRankByUserId(userId);
		
	}

	@Override
	public int[] getUsers() {
		return userDao.findAllUserId();
	}

	@Override
	public int[] getUserRounds(int userId) {
		
		return userRoundDao.findRoundIdByUserID(userId);
	}
     
}
