package Stack_Queue;

public class FixedCapacityStack extends Stack {
	protected int capacity;
	public FixedCapacityStack(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public void push(Node n) throws Exception{
		if(size == capacity) {
			throw new Exception("Capacity is fulled");
		}
		else {
			super.push(n);
		}
	}
}
