package mike.promotion.repository;

import mike.promotion.domain.Promotion;
import org.springframework.data.repository.CrudRepository;

public interface PromoRepository extends CrudRepository<Promotion, String> {
}
