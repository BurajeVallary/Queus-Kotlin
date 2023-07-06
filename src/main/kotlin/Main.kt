fun main() {
var a = Queue(5)
    a.enqueue(1)
    a.enqueue(2)
    a.enqueue(3)
    a.dequeue()
    a.display()   //will display 2 3 because it uses FIFO data structure
      //will print is empty because there is nothing
    a.enqueue(45)
    a.enqueue(32)
    a.enqueue(64)
    a.enqueue(32)
a.display()//queue is full because it has passed the capacity

}


//uses FIFO    First In First Out
// enque adds an element to the queue
// deque deletes ana element form the queue
//peek see what is in front
//display lists out items currently in queue
//arrays are fixed size collections
//the front will always be index [0]
//rear is the first element
//Enqueue: Adds an element to the end of the queue.
//Dequeue: Removes the first element from the queue.
//Peek: Returns the first element in the queue without removing it.
//IsEmpty: Returns true if the queue is empty.
//Queues are a versatile data structure that can be used in a variety of applications.
// For example, they can be used to implement a message queue, a priority queue, or a task queue.


class Queue(var capacity: Int) {
    var data = IntArray(capacity)
    var front = 0
    var rear = 0    //0 is pointer to the index


    fun enqueue(value: Int) {
        if (isFull()){
            println("Queue is full")
            return
        }
        data[rear] = value
        rear ++


    }

    fun dequeue():Int? {
        if (isEmpty()){
            println("Queue is empty")
            return null
        }
        val removed = data[front]
        for (i in front until rear -1){
            data[i] = data [i + 1]
        }
        rear --
        return removed


    }

    fun peek(): Int? {
        if (isEmpty()) {
            return null
        }
        return data[front]

    }

    fun isFull(): Boolean {
        return rear == capacity  //rear is not equal to capacity

    }

    fun isEmpty(): Boolean {
        return front == rear   // front will only be equal to rear when the queue is empty


    }

    fun display() {
        if (isEmpty()){
            return
        }

        for (i in front until rear){
            println(data[i])
        }


    }


}


