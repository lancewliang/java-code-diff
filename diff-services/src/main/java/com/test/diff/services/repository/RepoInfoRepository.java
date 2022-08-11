package com.test.diff.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.diff.services.entity.RepoInfo;

@Repository
public interface RepoInfoRepository extends JpaRepository<RepoInfo, Long> {
}
