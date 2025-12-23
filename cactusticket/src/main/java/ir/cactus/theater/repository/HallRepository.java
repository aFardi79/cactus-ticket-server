package ir.cactus.theater.repository;


import ir.cactus.theater.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends JpaRepository<Hall,Long> {
}
