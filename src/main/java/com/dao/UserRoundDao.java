package com.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.domain.UserRounds;

/**
 * A DAO for the entity UserRound is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 * 
 * @author Kenny
 */
@Transactional
public interface UserRoundDao extends CrudRepository<UserRounds, Integer>{
	@Query("select c.roundId from UserRounds c WHERE c.userId = :userId")
	public int[] findRoundIdByUserID(@Param("userId") int userId);
	
	@Query("insert into UserRound c (userId, roundI, primaryStat, secondaryStat) VALUES (?1, ?2, ?3, ?4)")
	public void addUserRounds(@Param("userId") int userId, @Param("roundId") int roundId,
			                  @Param("primaryStat") double primaryStat, @Param("secondaryStat") double secondaryStat);
	@Modifying
	@Query("delete from UserRounds c WHERE c.userId = :userId AND c.roundId = :roundId" )
	public void deleteById(@Param("userId") int userId, @Param("roundId") int roundId);
	
	@Query("select c.userId from UserRounds c group by c.UserId order by avg(c.primaryStat), avg(c.secondaryStat)")
	public int findUserRankByUserId(@Param("userId") int userId);
}
