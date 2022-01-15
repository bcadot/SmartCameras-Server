package fr.smartcameras.cadot.smartcamerams.model;

import java.util.ArrayList;

public class Camera {
    private int id;
    private String timestamp;
    private int count;
    private float temperature;

    public Camera(int id, String timestamp, int count, float temperature) {
        this.id = id;
        this.timestamp = timestamp;
        this.count = count;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public int getCount() {
        return count;
    }

    public float getTemperature() {
        return temperature;
    }
}
