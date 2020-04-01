package cn.com.jonpad.spikecore.productservice.mapper;

import cn.com.jonpad.spikecore.productservice.dto.ProductDto;
import cn.com.jonpad.spikecore.productservice.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author Jon Chan
 * @date 2020/4/1 23:44
 */
@Mapper()
public interface ProductMapper {
  ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

  @Mappings({})
  Product getEntity(ProductDto dto);

  @Mappings({})
  ProductDto toDto(Product product);
}
