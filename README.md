Zoo Animals Listing iterator pattern
====================================

An implementation of the iterator pattern as applied to collections of zoo animals.  The Animal class is extended to two subclasses: 
the Otters and the Kangaroos classes.  These classes handle the creation of new Animal objects which are then stored in a collection
The Kangaroos class uses an array, the Otters class uses a LinkedList.  The java.util.Iterator interface is implemented by the 
KangarooIterator and OtterIterator classes.  This provides the necessary common interface for iteration over the respective classes
collections.  Each iterator class implements the necessary steps for iterating over the collections.  The AnimalListing class handles
creation of the Kangaroos and Otters classes, adds the necessary animals and then lists the animals using the iterator classes.  This is 
basic practice with the iterator pattern.

![UML diagram of project](https://github.com/cugamer/dp_iterator_zoo_animals/blob/master/dp_iterator_zoo_animals/dp_iterator_zoo_animals.png)
