package com.example.jjugdemo.resilient;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
@Path("/resilience")
@ApplicationScoped
public class ResilienceController {
    @Fallback(fallbackMethod = "fallback")
    @Timeout(500)
    @GET
    public String checkTimeout() {
        try {
            Thread.sleep(700L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Never from normal processing";
    }
    public String fallback() {
        return "Fallback answer due to timeout";
    }
}

