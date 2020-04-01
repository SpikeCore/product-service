package cn.com.jonpad.spikecore.productservice.controller;

import cn.com.jonpad.spikecore.productservice.businessService.ProductBusiness;
import cn.com.jonpad.spikecore.productservice.dto.ProductDto;
import cn.com.jonpad.spikecore.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Jon Chan
 * @date 2020/4/1 23:32
 */
@RestController
@RequestMapping("product")
@AllArgsConstructor
public class ProductCtrl {

  private ProductBusiness business;

  @PostMapping()
  public ResponseEntity<Void> create(@RequestBody @Valid ProductDto dto){
    business.create(dto);
    return ResponseEntity.status(HttpStatus.OK).build();
  }

  @GetMapping("{productId}")
  public ResponseEntity<ProductDto> getOne(@PathVariable("productId")Long id){
    ProductDto dto = business.getOne(id);
    return ResponseEntity.ok(dto);
  }


}
