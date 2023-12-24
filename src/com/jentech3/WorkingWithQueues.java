package com.jentech3;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Jeannick",29));
        linkedList.add(new Person("Jean",20));
        linkedList.add(new Person("John",22));
        linkedList.addFirst(new Person("Palmer",17));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

       // workingWithQueues();
    }

    private static void workingWithQueues() {
        Queue<Person> supermarketQueue = new LinkedList<>();
        supermarketQueue.add(new Person("Jeannick",29));
        supermarketQueue.add(new Person("Rajae",25));
        supermarketQueue.offer(new Person("John",22));

        System.out.println(supermarketQueue.size());
        System.out.println(supermarketQueue.peek());
        System.out.println(supermarketQueue.poll());
        System.out.println(supermarketQueue.size());
        System.out.println(supermarketQueue.peek());
    }

    static record Person (String name, int age){

    }
}
