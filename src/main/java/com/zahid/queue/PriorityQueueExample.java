package com.zahid.queue;

import java.util.PriorityQueue;
import java.util.Queue;

import com.zahid.human.Person;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Person> personQueue = new PriorityQueue<>();
        personQueue.offer(new Person("Alex", 19));
        personQueue.offer(new Person("Lee", 29));
        personQueue.offer(new Person("Cooper", 31));
        personQueue.offer(new Person("John", 25));
        personQueue.offer(new Person("Jane", 32));
        personQueue.offer(new Person("David", 30));

        System.out.println(personQueue);
        System.out.println();

        while (!personQueue.isEmpty()) {
            System.out.println(personQueue.peek());
            personQueue.poll();
        }
    }
}
