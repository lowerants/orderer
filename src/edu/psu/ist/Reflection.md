Middle of the project right now, currently need to figure out how to use exceptions and how to create conditions for them
I've also skipped comparator, essentially wrote all the easy stuff first, ie adding and removing

ArrayList is O(1) access and O(n) insert

LinkedList is better for shifting elements

Ugh I'm so confused
I got this tho, I'll figure it out

Comparator wasn't too hard, once I found Integer::compare it was all good

Linked list is better for adding and removing
Therefore I made the add an addFirst() to give add O(1) and made the remove O(2n) by doing a linear search and then calling remove afterwards
Crank is O(1) and only changes isAccepting
This makes LinkedListImpl better for constant switching

ArrayList is better for access
Therefore I gave the ArrayList implementation O(1) add by adding to the front and O(1) remove by sorting during crank to make remove also O(1)
ArrayList's sort is O(nlogn) and only happens during crank
This makes ArrayImpl better for longer periods of add and remove with fewer cranks

I gotta figure out how to do that single test for both implementations
    Spoiler alert: I did not figure out how to do the single test

I figured out the throws, I was gonna try something like assertThrows but I couldn't figure that out, so I just did try catch blocks and that works

Generics were a little confusing, but I figured out where to put the Us and Ts eventually
Everything else with generics was fine

I think the hardest parts were figuring out how to do comparator in the constructors and figuring out the Big-O optimization
I finished this on Saturday I just forgot to push origin and finish up this reflection