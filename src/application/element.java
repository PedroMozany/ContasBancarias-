package application;

public class element<T, Z> {
	T next;
	Z value;
	
	
	public element(Z value) {
		this.next = null;
		this.value = value;
	}
	public void setElement(T no, Z value) {
		this.next = no;
		this.value = value;
	}
	public void setNext(T next) {
		this.next = next;
	}
	public T getNext() {
		return this.next;
	}
	public Z getValue() {
		return value;
	}

	@Override
	public String toString() {
		String result = "";
		if(this.value == null) result = "";
		else result = this.value.toString();
		return result;
	}
}
