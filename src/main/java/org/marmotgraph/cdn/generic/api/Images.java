package org.marmotgraph.cdn.generic.api;

import io.swagger.v3.oas.annotations.Operation;
import org.marmotgraph.cdn.generic.utils.Constants;
import org.marmotgraph.cdn.generic.utils.Utils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/" + Constants.API_VERSION + "/images")
public class Images {

    @GetMapping(value = "/{type}/favicon", produces = Constants.IMAGE_ICO)
    @Operation(description = "This is the favicon to be used by all UIs")
    public @ResponseBody byte[] favIconResource(@PathVariable("type") String type) {
        return Utils.getStaticResource(type + "/favicon.ico");
    }

}
