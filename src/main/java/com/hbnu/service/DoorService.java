package com.hbnu.service;

import com.hbnu.pojo.Door;

import java.util.List;

public interface DoorService {
    List<Door> findAllDoor();

    boolean addDoor(Door door);

    void deleteDoor(int id);

    Door findDoorById(int id);

    void updateDoor(Door door);
}
