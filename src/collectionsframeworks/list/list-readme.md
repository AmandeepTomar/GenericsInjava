##List

`Iterable`<----`Collection`<-----`List, Queue and set` All are interface.
###List (Interface)

- ArrayList
- LinkedList
- Vector
    - Stack

###List Interface

- it extends `Collection interface` and `Collection interface` extends `Iterable` Interface
- it is ordered collection
- it can include duplicates
- it provides full visibility and control over the ordering of elements.
- ArrayList using 1-D Arrays under the hood.
- `ArrayList implements Serializable,cloneable, Iterable, Collection,List,RandomAccess`
- Initial capacity is 10.
- Resizing the array is really heavy operation O(N) so if we know that we need more that 10 or like 10000 items to be added in list them we need to create a list with initial capacity of 10000.
- Random Indexing get(0)->`O(1)`
- Insert item at given index , Remove at given index -> `O(N)` 
- ArrayList are fast if we manipulate at last item.coz Java don't need to perform any shifting or operation.
- If we check list is `list.contains(item)` it will take `O(N)`

