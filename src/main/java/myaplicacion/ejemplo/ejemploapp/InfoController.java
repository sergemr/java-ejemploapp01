package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack; // Import Stack

@RestController
@RequestMapping("/getinfo")
public class InfoController {
    classInfo infoClassS = new classInfo();
    classStack<String> infoStack = new classStack<>();

    // Constructor
    public InfoController() {
        // Initialize infoClassS with an instance of classInfo
        infoClassS = new classInfo();
    }

    // Get a list of information
    @GetMapping("/list")
    public List<String> getListInfo() {
        // Create an instance of classInfo
        classInfo infoClass = new classInfo();
        // Populate the list
        infoClass.createList();
        // Update infoClassS with the current instance
        infoClassS = infoClass;
        // Return the list
        return infoClass.getList();
    }

    // Show the current list of information
    @GetMapping("/showlist")
    public List<String> getCurrentListInfo() {
        // Return the list from infoClassS
        return infoClassS.getList();
    }

    // Add a member to the list
    @PostMapping("/list/add")
    public List<String> addMemberToList(String member) {
        System.out.println("list" + member);
        // Create an instance of classInfo
        classInfo infoClass = new classInfo();
        // Populate the list
        infoClass.createList();
        // Add the member to the list
        infoClass.addMemberToList(member);
        // Add the member to infoClassS as well
        infoClassS.addMemberToList(member);
        System.out.println("list" + infoClassS.getList());
        return infoClassS.getList();
    }

    // Remove a member from the list
    @PostMapping("/list/remove")
    public void removeMemberFromList(String member) {
        // Create an instance of classInfo
        classInfo infoClass = new classInfo();
        // Populate the list
        infoClass.createList();
        // Remove the member from the list
        infoClass.removeMemberFromList(member);
    }

    // Get a queue of information
    @GetMapping("/queue")
    public Queue<String> getQueueInfo() {
        System.out.println("getQueueInfo");
        // Create an instance of classInfo
        classInfo infoClass = new classInfo();
        // Populate the queue
        infoClass.createQueue();
        // Return the queue
        return infoClass.getQueue();
    }

    // Add a member to the queue
    @PostMapping("/queue/add")
    public void addMemberToQueue(String member) {
        // Create an instance of classInfo
        classInfo infoClass = new classInfo();
        // Populate the queue
        infoClass.createQueue();
        // Add the member to the queue
        infoClass.addMemberToQueue(member);
    }

    // Remove a member from the queue
    @PostMapping("/queue/remove")
    public void removeMemberFromQueue() {
        // Create an instance of classInfo
        classInfo infoClass = new classInfo();
        // Populate the queue
        infoClass.createQueue();
        // Remove a member from the queue
        infoClass.removeMemberFromQueue();
    }

    // Pop a member from the stack
    @GetMapping("/stack/add")
    public int pushManMemberFromStack() {
        infoStack.push("member");
        System.out.println("pushManMemberFromStack");
        System.out.println(infoStack);
        return infoStack.size();
    }

    // Push a member onto the stack
    @PostMapping("/stack/add")
    public void pushMemberToStack(String member) {

        infoStack.push(member);
    }

    // Pop a member from the stack
    @GetMapping("/stack/pop")
    public String popMemberFromStack() {
        return infoStack.pop();
    }

    // Get the size of the stack
    @GetMapping("/stack/size")
    public int getStackSize() {
        return infoStack.size();
    }

    // Check if the stack is empty
    @GetMapping("/stack/isEmpty")
    public boolean isStackEmpty() {
        return infoStack.isEmpty();
    }

    // List the elements in the stack
    @GetMapping("/stack/list")
    public List<String> listStackElements() {
        List<String> stackElements = new ArrayList<>(infoStack.getStack());
        return stackElements;
    }
}

// Class to manage information
class classInfo {
    private List<String> infoList;
    private Queue<String> infoQueue;

    // Constructor
    public classInfo() {
        this.infoList = new ArrayList<>();
        this.infoQueue = new LinkedList<>();
    }

    // Getters and setters
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

    // Initialize the list with some default values
    public void createList() {
        infoList.clear();
        infoList.add("1 Bob Jones");
        infoList.add("2 Ann Harrick");
        infoList.add("3 Dylan Mathews");
    }

    // Initialize the queue with some default values
    public void createQueue() {
        infoQueue.clear();
        infoQueue.add("1 Bob Jones");
        infoQueue.add("2 Ann Harrick");
        infoQueue.add("3 Dylan Mathews");
    }

    // Add a member to the list
    public void addMemberToList(String member) {
        infoList.add(member);
    }

    // Remove a member from the list
    public void removeMemberFromList(String member) {
        infoList.remove(member);
    }

    // Add a member to the queue
    public void addMemberToQueue(String member) {
        infoQueue.add(member);
    }

    // Remove a member from the queue
    public void removeMemberFromQueue() {
        infoQueue.poll();
    }
}

// Implementation of a Stack class
class classStack<T> {
    private Stack<T> stack;

    // Constructor
    public classStack() {
        this.stack = new Stack<>();
    }

    // Getters and setters
    public Stack<T> getStack() {
        return stack;
    }

    public void setStack(Stack<T> stack) {
        this.stack = stack;
    }

    // Push an element onto the stack
    public void push(T element) {
        stack.push(element);
    }

    // Pop an element from the stack
    public T pop() {
        return stack.pop();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return stack.size();
    }
}
