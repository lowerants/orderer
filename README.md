# The Orderer Machine

In this assignment you will provide two implementations of a data structure termed the `Orderer`. It can be throught of a
as machine for ordering generic items. The machine operates in two states: the Add state and the Rm (remove state).

Here's a rough conceptual level view/illustration of this abstract data type in action:

[todo: pic goes here]

## Part 1: Implementing the `Orderer` interface

The work we do in M06 on singly linked lists will be helpful here on how to handle generic typed interfaces and implementing classes. 

You will provide two implementations of the `Orderer`. I'll make only two stipulations. The first implementation must use an `ArrayList` to 
store the contents of the machine, while the second implementation will use a (java util) `LinkedList`.

Where you decide to do the sorting will have an outsized role as to the performance of your implementation.

## Part 2:

Write unit tests for the `Orderer` and its two implementations. 
