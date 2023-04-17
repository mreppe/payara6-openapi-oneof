package com.anexia.microprofile.openapi;

import jakarta.json.JsonObject;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

@Path("/test")
public class TestResource {

    @PATCH
    @RequestBody(
            content = @Content(mediaType = MediaType.APPLICATION_JSON_PATCH_JSON,
                    schema = @Schema(oneOf = {TestEntityA.class, TestEntityB.class}))
    )
    public void testUpdate(JsonObject jsonObject) {

    }

}
