package stack;

public abstract class SuperComponent {
	static public String stackEmptyErrorDescription = "Stack is empty";

	private String top;

	public abstract boolean isEmpty();

	public abstract NonEmptyComponent push(String val);

	public abstract void tryPop();

	public abstract void tryTop();

	public void setTop(String t) {
		top = t;
	}

	public String getTop() {
		return top;
	}
}