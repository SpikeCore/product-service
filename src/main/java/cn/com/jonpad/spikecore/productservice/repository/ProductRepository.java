package cn.com.jonpad.spikecore.productservice.repository;

import cn.com.jonpad.spikecore.productservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Jon Chan
 * @date 2020/3/31 23:38
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
