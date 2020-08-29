# Java-Stack-Queue

1. Consider a stack of books - or plates or some such things. If you were to pick one book from the stack, from which portion of it would you pick it? From the top? From the bottom? Or from somewhere in between? Of course, any sane person would pick it up from the top. Trying to pull out a book from anywhere else in the stack would be possible, but would lead to difficulties, and untoward results. In the same manner, if you were to add a book to this stack, where would you prefer to add it? Again, at the top, of course. 
2. In a stack, what goes in last is the first to come out. This property of the above structure is called last in first out (or LIFO) order.


There is a Stack class in Java which implements stack data structure. The class provides the following functions.
* push(object element) - inserts the element onto the top of the stack
* pop() - removes an element on top of the stack
* isEmpty() - returns true if the stack is empty otherwise returns false
* peek() - returns the element on the top of the stack
* search(object element) - searches for the element in the stack and returns its location in the stack, If the element is not present then it returns ‘-1’


There are two kinds of exceptions you could encounter in stacks:
* Underflow: Trying to pop/peek an element from an empty stack 
* Overflow: Trying to push an element into a stack that is already at its max capacity 
