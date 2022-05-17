package com.traidable.app.repositories;

import java.util.List;

import com.traidable.app.entity.TopTierAgency;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface TopTierAgencyRepository extends Neo4jRepository<TopTierAgency, Long> {

}