// package data_structures.queues;
//
// import static org.junit.jupiter.api.Assertions.assertEquals;
//
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
//
// class QueueFromArrayTest {
//
//    private QueueFromArray queue;
//
//    @BeforeEach
//    void setUp() {
//        queue = new QueueFromArray(5);
//    }
//
//    @Test
//    void enqueue() {
//        assertEquals(0, queue.size());
//
//        queue.enqueue(0);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        assertEquals(5, queue.size());
//    }
//
//    @Test
//    void dequeue() {
//        queue.enqueue(0);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        assertEquals(0, queue.dequeue());
//        assertEquals(4, queue.size());
//        assertEquals(1, queue.dequeue());
//    }
//
//    @Test
//    void isEmpty() {}
//
//    @Test
//    void isFull() {}
//
//    @Test
//    void size() {}
// }
