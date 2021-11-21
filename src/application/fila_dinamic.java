package application;

public class fila_dinamic<T> {
	@SuppressWarnings("rawtypes")
	private element<element, T> first;
	@SuppressWarnings("rawtypes")
	private element<element, T> last;
	
	@SuppressWarnings("rawtypes")
	public fila_dinamic() {
		this.first = new element<element, T>(null);
		this.last = this.first;
	}
	
	// verify empty's
	public boolean isEmpty() {
		return (this.first == this.last);
	}
	public boolean isEmptyFirst() {
		return first == null;
	}
	public boolean isEmptyNextLast() {
		return last == null;
	}
	
	// add element
	@SuppressWarnings("rawtypes")
	public void addElement(T elementInsert) {
		//Criando elemento novo
		element<element, T> no = new element<element, T>(elementInsert);
		this.last.setNext(no);
		this.last = no;

	}
	@SuppressWarnings("unchecked")
	public void invert(){
		@SuppressWarnings("rawtypes")
		element<element, T> next = null;
		@SuppressWarnings("rawtypes")
		element<element, T> last = null;
		@SuppressWarnings("rawtypes")
		element<element, T> current = this.first;
		while(current != null) {
	        next = current.getNext();
	        current.setNext(last);
	        last = current;
	        current = next;
		}
		this.first = last;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public element removeElement() {
		if(isEmpty())
			return null;
		element<element, T> no = this.first.getNext();
		this.first.setNext(no.getNext());
		no.setNext(null);
		if(no == this.last)
			this.last = this.first;
		return no;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String displayFila() {
		if(isEmpty())
			return "Fila empty";
		
		String str = "";
		str += "\nFila Encadeada: ";
		for(element<element, T> i = first.getNext(); i !=null; 
				i = i.getNext()) {
			str += "\n" + i.toString();
		}
		return str;
	}
	
	
}
