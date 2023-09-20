package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@RestController
@RequestMapping("/getinfo")
public class InfoController {
    classInfo infoClassS = new classInfo();

    @GetMapping("/list")
    public List<String> getListInfo() {
        classInfo infoClass = new classInfo();
        infoClass.createList();
        infoClassS = infoClass;
        return infoClass.getList();
    }

    @GetMapping("/showlist")
    public List<String> getCurrentListInfo() {

        return infoClassS.getList();
    }

    @PostMapping("/list/add")
    public void addMemberToList(String member) {
        System.out.println("list" + member);
        classInfo infoClass = new classInfo();
        infoClass.createList();
        infoClass.addMemberToList(member);
        infoClassS.addMemberToList(member);
    }

    @PostMapping("/list/remove")
    public void removeMemberFromList(String member) {
        classInfo infoClass = new classInfo();
        infoClass.createList();
        infoClass.removeMemberFromList(member);
    }

    @GetMapping("/queue")
    public Queue<String> getQueueInfo() {
        System.out.println("getQueueInfo");
        classInfo infoClass = new classInfo();
        infoClass.createQueue();
        return infoClass.getQueue();
    }

    @PostMapping("/queue/add")
    public void addMemberToQueue(String member) {
        classInfo infoClass = new classInfo();
        infoClass.createQueue();
        infoClass.addMemberToQueue(member);
    }

    @PostMapping("/queue/remove")
    public void removeMemberFromQueue() {
        classInfo infoClass = new classInfo();
        infoClass.createQueue();
        infoClass.removeMemberFromQueue();
    }
}

class classInfo {
    private List<String> infoList;
    private Queue<String> infoQueue;

    public classInfo() {
        this.infoList = new ArrayList<>();
        this.infoQueue = new LinkedList<>();
    }

    public List<String> getList() {
        return infoList;
    }

    public void setList(List<String> infoList) {
        this.infoList = infoList;
    }

    public Queue<String> getQueue() {
        return infoQueue;
    }

    public void setQueue(Queue<String> infoQueue) {
        this.infoQueue = infoQueue;
    }

    public void createList() {
        infoList.clear();
        infoList.add("1 Bob Jones");
        infoList.add("2 Ann Harrick");
        infoList.add("3 Dylan Mathews");
    }

    public void createQueue() {
        infoQueue.clear();
        infoQueue.add("1 Bob Jones");
        infoQueue.add("2 Ann Harrick");
        infoQueue.add("3 Dylan Mathews");
    }

    public void addMemberToList(String member) {
        infoList.add(member);
    }

    public void removeMemberFromList(String member) {
        infoList.remove(member);
    }

    public void addMemberToQueue(String member) {
        infoQueue.add(member);
    }

    public void removeMemberFromQueue() {
        infoQueue.poll();
    }
}
