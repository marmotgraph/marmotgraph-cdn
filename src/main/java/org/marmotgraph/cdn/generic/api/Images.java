package org.marmotgraph.cdn.generic.api;

import io.swagger.v3.oas.annotations.Operation;
import org.marmotgraph.cdn.generic.utils.Constants;
import org.marmotgraph.cdn.generic.utils.Utils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/" + Constants.API_VERSION + "/images")
public class Images {

    @GetMapping(value = "/{profile}/logo.svg", produces = Constants.IMAGE_SVG)
    @Operation(description = "This is the favicon to be used by all UIs")
    public @ResponseBody byte[] logoSVGResource(@PathVariable("profile") String profile) {
        return Utils.getStaticResource(profile + "/logo.svg");
    }

    @GetMapping(value = "/{profile}/logo.png", produces = Constants.IMAGE_PNG)
    @Operation(description = "This is the favicon to be used by all UIs")
    public @ResponseBody byte[] logoPNGResource(@PathVariable("profile") String profile) {
        return Utils.getStaticResource(profile + "/logo.png");
    }
    @GetMapping(value = "/{profile}/favicon", produces = Constants.IMAGE_ICO)
    @Operation(description = "This is the favicon to be used by all UIs")
    public @ResponseBody byte[] favIconResource(@PathVariable("type") String profile) {
        return Utils.getStaticResource(profile + "/favicon.ico");
    }

}
