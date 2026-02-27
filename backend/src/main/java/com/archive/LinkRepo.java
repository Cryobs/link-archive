/* GENERATED  BY CHAT GPT */
package com.archive;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkRepo extends CrudRepository<Link, Long> {
    List<Link> findByStatus(String status);
}
