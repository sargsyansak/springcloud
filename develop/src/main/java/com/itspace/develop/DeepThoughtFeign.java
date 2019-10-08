package com.itspace.develop;

import com.itspace.deepthought.DeepThought;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("deep-thought")
public interface DeepThoughtFeign  extends DeepThought {
}
