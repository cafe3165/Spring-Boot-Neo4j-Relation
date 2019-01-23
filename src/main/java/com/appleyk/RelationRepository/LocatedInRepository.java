package com.appleyk.RelationRepository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.appleyk.node.Location;
import com.appleyk.relation.LocatedIn;



public interface LocatedInRepository extends GraphRepository<LocatedIn>{

	
	
	@Query("MATCH(d:Device),(l:Location) WHERE d.lName=l.lName"
			+ " CREATE p = (d)-[r:LocatedIn]->(s) return p ")
	List<LocatedIn> createProvide();
}
