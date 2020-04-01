package cn.com.jonpad.spikecore.productservice;

import cn.com.jonpad.spikecore.productservice.businessService.ProductBusiness;
import cn.com.jonpad.spikecore.productservice.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class SpikeCoreProductServiceApplicationTests {

  @Autowired
  private ProductBusiness business;

  @Test
  void contextLoads() {
  }

  @Test
  void testCacheable() {
    ProductDto one = business.getOne(1L);
    log.info("1 - {}", one);
    one = business.getOne(1L);
    log.info("2 - {}", one);
    one = business.getOne(1L);
    log.info("3 - {}", one);
    one = business.getOne(1L);
    log.info("4 - {}", one);
    one = business.getOne(1L);
    log.info("5 - {}", one);
  }

}
