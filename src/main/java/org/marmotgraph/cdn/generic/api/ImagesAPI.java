package org.marmotgraph.cdn.generic.api;

import io.swagger.v3.oas.annotations.Operation;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class ImagesAPI {

    @GetMapping(value = "/favicon", produces = "image/x-icon")
    @Operation(description = "This is the favicon to be used by all UIs")

    public @ResponseBody byte[] favicon() throws IOException {
        try(InputStream in = getClass().getResourceAsStream("/org/marmotgraph/cdn/generic/favicon.ico")) {
            if(in==null){
                return null;
            }
            return IOUtils.toByteArray(in);
        }
    }


}
