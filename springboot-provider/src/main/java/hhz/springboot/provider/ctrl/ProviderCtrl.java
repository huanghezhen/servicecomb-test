package hhz.springboot.provider.ctrl;

import hhz.springboot.common.entity.BaseResponse;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: ProviderCtrl
 * @Description:
 * @Author: huanghz
 * @Date: 2020/5/8 13:35
 */
@RestSchema(schemaId = "ProviderCtrl")
@RequestMapping(path = "/")
public class ProviderCtrl {
    @GetMapping("/testException1")
    public BaseResponse testException1() throws Exception {
        if (true) {
            throw new Exception();
        }
        return BaseResponse.newInstance();
    }
}
