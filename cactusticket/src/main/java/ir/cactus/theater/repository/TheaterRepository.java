package ir.cactus.theater.repository;

import ir.cactus.theater.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends JpaRepository<Theater,Long> {
}
