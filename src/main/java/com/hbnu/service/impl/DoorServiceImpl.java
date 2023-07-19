package com.hbnu.service.impl;

import com.hbnu.dao.DoorDao;
import com.hbnu.pojo.Door;
import com.hbnu.service.DoorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DoorServiceImpl implements DoorService {

    @Resource
    private DoorDao doorDao;

    @Override
    public List<Door> findAllDoor() {
        return doorDao.findAllDoor();
    }

    @Override
    public boolean addDoor(Door door) {
        return doorDao.addDoor(door);
    }

    @Override
    public void deleteDoor(int id) {
        doorDao.deleteDoor(id);
    }

    @Override
    public Door findDoorById(int id) {
        return doorDao.findDoorById(id);
    }

    @Override
    public void updateDoor(Door door) {
        doorDao.updateDoor(door);
    }
}
