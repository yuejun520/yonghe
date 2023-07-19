package com.hbnu.dao;

import com.hbnu.pojo.Door;

import java.util.List;

public interface DoorDao {
    List<Door> findAllDoor();

    boolean addDoor(Door door);

    void deleteDoor(int id);

    Door findDoorById(int id);

    void updateDoor(Door door);
}
