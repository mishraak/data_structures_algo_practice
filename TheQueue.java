import java.util.Arrays;
class TheQueue {
	private String[] QueueArray;
	private int front, rear, size=0;

	TheQueue(int s) {
		QueueArray = new String[s];
		front=0;
		rear=0;
		size=s;

		Arrays.fill(QueueArray, "-1");
	}

	public void insert(String s) {
		if (rear+1 <= size) {
			QueueArray[rear] = s;
			System.out.println(s + " inserted at position " + rear);
			rear++;
		}
		else {
			System.out.println("Queue is full");
		}
	}

	public void remove() {
		if (front>=0 && front <rear) {
			String s = QueueArray[front];
			System.out.println(s + " removed from position " + front);
			front++;
		}
		else {
			System.out.println("Queue is empty");
		}

	}

	public static void main(String[] args) {
		TheQueue q = new TheQueue(5);
		q.insert("A");
		q.insert("B");
		q.insert("C");
		q.insert("D");
		q.insert("E");
		q.insert("F");
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
	}


}
