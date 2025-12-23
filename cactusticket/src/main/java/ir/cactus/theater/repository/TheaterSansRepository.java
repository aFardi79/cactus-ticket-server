package ir.cactus.theater.repository;

import ir.cactus.theater.model.TheaterSans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TheaterSansRepository extends JpaRepository<TheaterSans,Long> {
}
