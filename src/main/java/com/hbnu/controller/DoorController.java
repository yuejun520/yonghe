package com.hbnu.controller;

import com.hbnu.pojo.Door;
import com.hbnu.service.DoorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping
public class DoorController {

    @Resource
    private DoorService doorService;

    @RequestMapping("/doorList")
    public String doorList(Model model) {
        List<Door> doorList = doorService.findAllDoor();

        model.addAttribute("list", doorList);

        return "door_list";
    }

    @RequestMapping("/doorAdd")
    public String doorAdd(Door door) {
        doorService.addDoor(door);

        return "redirect:/doorList";
    }

    @RequestMapping("/doorDelete")
    public String doorDelete(int id) {
        doorService.deleteDoor(id);

        return "redirect:/doorList";
    }

    @RequestMapping("/doorInfo")
    public String doorInfo(int id, Model model) {
        Door door = doorService.findDoorById(id);

        model.addAttribute("door", door);

        return "door_update";
    }

    @RequestMapping("/doorUpdate")
    public String doorUpdate(Door door) {
        doorService.updateDoor(door);

        return "redirect:/doorList";
    }
}
