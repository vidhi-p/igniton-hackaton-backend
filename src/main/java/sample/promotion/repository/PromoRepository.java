package sample.promotion.repository;

import sample.promotion.domain.Promotion;
import org.springframework.data.repository.CrudRepository;

public interface PromoRepository extends CrudRepository<Promotion, String> {
}
