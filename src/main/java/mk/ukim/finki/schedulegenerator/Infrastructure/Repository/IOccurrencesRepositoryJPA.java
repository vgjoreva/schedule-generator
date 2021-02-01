package mk.ukim.finki.schedulegenerator.Infrastructure.Repository;

import mk.ukim.finki.schedulegenerator.Domain.Models.Components.Occurrences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOccurrencesRepositoryJPA extends JpaRepository<Occurrences, Integer>{
}
