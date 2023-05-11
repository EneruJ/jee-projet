package com.hitema.jee.mvc.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MapController {

    //Logger
    private static final Logger log = LoggerFactory.getLogger(MapController.class);

    public static Point convertToPoint(String pointString) {
        String[] pointParts = pointString.replace("POINT(", "").replace(")", "").split(" ");
        double longitude = Double.parseDouble(pointParts[0]);
        double latitude = Double.parseDouble(pointParts[1]);
        return new Point(latitude, longitude);
    }

    @GetMapping("/details")
    public String map() {
        log.trace("call map ...");

      return "customerdetail";
    }


}
