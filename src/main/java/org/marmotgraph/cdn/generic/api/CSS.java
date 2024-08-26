package org.marmotgraph.cdn.generic.api;

import io.swagger.v3.oas.annotations.Operation;
import org.apache.commons.io.IOUtils;
import org.marmotgraph.cdn.generic.utils.Constants;
import org.marmotgraph.cdn.generic.utils.Utils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping(value = "/"+Constants.API_VERSION+"/css", produces = Constants.TEXT_CSS)
public class CSS {

    @GetMapping(value = "/generic")
    @Operation(description = "This is the favicon to be used by all UIs")
    public @ResponseBody byte[] generic() {
        This is a compile error to test the pipeline
        return Utils.getStaticResource("generic/generic.css");
    }


}
