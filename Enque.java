class Queue {
	int front, rear, size;
	int capacity;
	int array[];

	public Queue(int capacity)
	{
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	boolean isFull(Queue queue)
	{
		return (queue.size == queue.capacity);
	}

	boolean isEmpty(Queue queue)
	{
		return (queue.size == 0);
	}
	void enqueue(int item)
	{
		if (isFull(this))
			return;
		this.rear = (this.rear + 1)
					% this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item
						+ " enqueued to queue");
	}
}

public class Enque{
	public static void main(String[] args)
	{
		Queue queue = new Queue(1000);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

	}
}

