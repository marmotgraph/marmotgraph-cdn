package org.marmotgraph.cdn.generic.api;

import io.swagger.v3.oas.annotations.Operation;
import org.marmotgraph.cdn.generic.utils.Constants;
import org.marmotgraph.cdn.generic.utils.Utils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/"+Constants.API_VERSION+"/css", produces = Constants.TEXT_CSS)
public class CSS {

    @GetMapping(value = "/{type}")
    @Operation(description = "This is the CSS to be used by all UIs")
    public @ResponseBody byte[] cssResource(@PathVariable("type") String type) {
        return Utils.getStaticResource(type + "/" + type + ".css");
    }


}
