package fr.smartcameras.cadot.smartcamerams.controller;

import fr.smartcameras.cadot.smartcamerams.model.Camera;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CameraController {
    private final ArrayList<Camera> cameras = new ArrayList<>();

    @GetMapping("/cameras")
    public ArrayList<Camera> getCameras() {
        //Simulate DB
        if (cameras.isEmpty()) {
            cameras.add(new Camera(1, "15/01/22 - 12:24", 3, 12.4f));
            cameras.add(new Camera(2, "7/11/21 - 16:00", 7, 0.4f));
        }
        return cameras;
    }

    @DeleteMapping("/counter/{id}")
    public void resetCounter(@PathVariable("id") int id) {
        if (!cameras.isEmpty()) {
            int index = -1;
            Camera c = null;
            for (int i = 0; i < cameras.size(); i++) {
                c = cameras.get(i);
                if (c.getId() == id) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                cameras.set(index, new Camera(c.getId(), c.getTimestamp(), 0, c.getTemperature()));
            }
        }
    }
}
