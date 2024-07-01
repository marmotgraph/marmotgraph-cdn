package org.marmotgraph.cdn.generic.api;

import io.swagger.v3.oas.annotations.Operation;
import org.marmotgraph.cdn.generic.utils.Constants;
import org.marmotgraph.cdn.generic.utils.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/" + Constants.API_VERSION + "/images")
public class Images {

    @GetMapping(value = "/favicon", produces = Constants.IMAGE_ICO)
    @Operation(description = "This is the favicon to be used by all UIs")
    public @ResponseBody byte[] favicon() {
        return Utils.getStaticResource("generic/favicon.ico");
    }


}
