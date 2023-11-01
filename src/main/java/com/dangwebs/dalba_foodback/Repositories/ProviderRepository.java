package com.dangwebs.dalba_foodback.Repositories;

import com.dangwebs.dalba_foodback.Entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Integer> {
}
