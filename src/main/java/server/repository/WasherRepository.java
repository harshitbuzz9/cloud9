package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.model.WasherModel;

import java.util.List;
import java.util.Optional;

@Repository
public interface WasherRepository extends JpaRepository<WasherModel, Integer> {
    Optional<List<WasherModel>> findAllByType(String type);
}
