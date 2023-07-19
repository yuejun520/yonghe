package com.hbnu.controller;

import com.hbnu.pojo.Door;
import com.hbnu.pojo.Order;
import com.hbnu.service.DoorService;
import com.hbnu.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {

    @Resource
    private OrderService orderService;

    @Resource
    private DoorService doorService;

    @RequestMapping("/orderList")
    public String orderList(Model model) {
        List<Order> orderList = orderService.findAllOrders();

        List<Door> doorList = doorService.findAllDoor();

        model.addAttribute("orderList", orderList);
        model.addAttribute("doorList", doorList);

        return "order_list";
    }

    @RequestMapping("/findAllDoorToOrderAdd")
    public String findAllDoorToOrderAdd(Model model) {
        List<Door> doorList = doorService.findAllDoor();

        model.addAttribute("doorList", doorList);

        return "order_add";
    }

    @RequestMapping("/orderAdd")
    public String orderAdd(Order order) {
        orderService.addOrder(order);

        return "redirect:orderList";
    }

    @RequestMapping("orderDelete")
    public String orderDelete(int id) {
        orderService.deleteOrder(id);

        return "redirect:orderList";
    }

    @RequestMapping("orderInfo")
    public String orderInfo(int id, Model model) {
        Order order = orderService.findOrderById(id);
        List<Door> doorList = doorService.findAllDoor();

        model.addAttribute("order", order);
        model.addAttribute("doorList", doorList);

        return "order_update";
    }

    @RequestMapping("orderUpdate")
    public String orderUpdate(Order order) {
        orderService.updateOrder(order);

        return "redirect:orderList";
    }
}
