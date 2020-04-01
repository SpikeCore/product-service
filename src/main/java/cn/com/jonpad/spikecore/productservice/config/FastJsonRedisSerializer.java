package cn.com.jonpad.spikecore.productservice.config;

/**
 * @author Jon Chan
 * @date 2020/4/2 00:05
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.nio.charset.Charset;

/**
 * 若要实现对象的缓存，最好定义自己的序列化和反序列化器。这里使用阿里的fastjson来实现。
 * @param <T>
 */
@Deprecated
public class FastJsonRedisSerializer<T> implements RedisSerializer<T> {
  private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
  private Class<T> clazz;
  @Override
  public byte[] serialize(T t) throws SerializationException {
    if (null == t) {
      return new byte[0];
    }
    String jsonString = JSON.toJSONString(t, SerializerFeature.WriteClassName);
    return jsonString.getBytes(DEFAULT_CHARSET);
  }

  @Override
  public T deserialize(byte[] bytes) throws SerializationException {
    if (null == bytes || bytes.length <= 0) {
      return null;
    }
    String str = new String(bytes, DEFAULT_CHARSET);
    return (T) JSON.parseObject(str, clazz);
  }

  public FastJsonRedisSerializer(Class<T> clazz) {
    this.clazz = clazz;
  }
}
