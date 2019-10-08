package com.itspace.develop;

import com.itspace.deepthought.DeepThought;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("deep-thought")
public interface DeepThoughtFeign  extends DeepThought {
}
