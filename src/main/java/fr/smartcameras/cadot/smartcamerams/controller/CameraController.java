package fr.smartcameras.cadot.smartcamerams.controller;

import fr.smartcameras.cadot.smartcamerams.model.Camera;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CameraController {
    private final ArrayList<Camera> cameras = new ArrayList<>();

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/cameras")
    public ArrayList<Camera> getCameras() {
        //Simulate DB
        if (cameras.isEmpty()) {
            cameras.add(new Camera(1, "15/01/22 - 12:24", 3, 12.4f));
            cameras.add(new Camera(2, "7/11/21 - 16:00", 7, 0.4f));
        }
        return cameras;
    }
}
