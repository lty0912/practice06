package prob4;

public interface Stack {	
	
	public void push(String item);
	public String pop() throws MyStackEmptyException;
	public boolean isEmpty();
	public int size();
}