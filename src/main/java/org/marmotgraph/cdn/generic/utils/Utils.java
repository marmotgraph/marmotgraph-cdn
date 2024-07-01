package org.marmotgraph.cdn.generic.utils;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Utils {

    public static byte[] getStaticResource(String relativePath){
        try(InputStream in = Utils.class.getResourceAsStream(String.format("/org/marmotgraph/cdn/%s", relativePath))) {
            if(in==null){
                return null;
            }
            return IOUtils.toByteArray(in);
        } catch (IOException e) {
            return null;
        }
    }

}
