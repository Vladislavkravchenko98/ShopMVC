package root.repository;

import root.models.News;
import root.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends CrudRepository<News, Long> {
   List<News> findByHader(String hader);
   List<News> findByProduct(Product product);
}
