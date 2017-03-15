package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.response.ChallengeManagerResponse;
import com.service.IChallengeManager;

/**
 * web service with restful api support front end side
 * 
 * @author Kenny
 */
@RestController
@RequestMapping("/challengeManager")
public class ChallengeManagerController {
	
	@Autowired
	private IChallengeManager challengeManagerService = null;

	@RequestMapping(value = "/fetchRankByUserId", method = RequestMethod.POST)
	public  ChallengeManagerResponse fetchRankByUserId(@RequestParam("userId") Integer userId) {
		ChallengeManagerResponse response;
		if (userId == null) {
			response.setInfo("300 error ! Id is null");
			return response;
		}
		int rank = challengeManagerService.getUserRank(userId);
		response.setInfo("200 success!");
		response.setRank(rank);
		return response;
	}
}
