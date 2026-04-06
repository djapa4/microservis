package com.example.matchservice.repository;

import com.example.matchservice.model.MatchInfo;
import feign.Param;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface MatchInfoRepository extends JpaRepository<MatchInfo, Long> {
    List<MatchInfo> findByRefereeId(Long refereeId);
    List<MatchInfo> findBySeasonId(Long seasonId);

    @Query("SELECT m FROM MatchInfo m WHERE m.match_date BETWEEN :start AND :end")
    List<MatchInfo> findMatchesBetweenDates(@Param("start") LocalDate start, @Param("end") LocalDate end);
}
