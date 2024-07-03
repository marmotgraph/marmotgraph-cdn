package org.marmotgraph.cdn.generic.api;

import io.swagger.v3.oas.annotations.Operation;
import org.apache.commons.io.IOUtils;
import org.marmotgraph.cdn.generic.utils.Constants;
import org.marmotgraph.cdn.generic.utils.Utils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping(value = "/"+Constants.API_VERSION+"/css", produces = Constants.TEXT_CSS)
public class CSS {

    @GetMapping(value = "/{type}")
    @Operation(description = "This is the favicon to be used by all UIs")
    public @ResponseBody byte[] cssResource(@PathVariable("type") String type) {
        return Utils.getStaticResource(type + "/" + type + ".css");
    }


}
