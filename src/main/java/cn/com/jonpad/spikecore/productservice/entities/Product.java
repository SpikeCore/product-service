package cn.com.jonpad.spikecore.productservice.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 产品
 * @author Jon Chan
 * @date 2020/3/31 23:27
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * UUID
   * 唯一约束
   */
  @Column(unique = true, length = 36)
  @NonNull
  private String uuid;

  private String title;

  private BigDecimal price;

  /**
   * 库存
   */
  private BigDecimal amount;
}
