package w3l8;

public class MyPersonList {
	private final int INITIAL_LENGTH = 3;
	private Person[] personArray;
	private int size;

	// Default Constructor
	public MyPersonList() {
		personArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	// 1. Implement method to Add as last element, make sure you have enough room else call resize()
	public void add(Person p) {
		if (size == personArray.length) {
			resize();
		}
		personArray[size] = p;
		size++;
	}

	// 2. Get person information by passing index
	public Person get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return personArray[i];
	}

	// 3. Find the Person object using lastname
	public boolean find(String lastName) {
		for (int i = 0; i < size; i++) {
			if (personArray[i].getLast().equals(lastName)) {
				return true;
			}
		}
		return false;
	}

	// 4. Remove the person object by passing its lastname
	public boolean remove(String lastName) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (personArray[i].getLast().equals(lastName)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			return false;
		}
		for (int i = index; i < size - 1; i++) {
			personArray[i] = personArray[i + 1];
		}
		personArray[size - 1] = null;
		size--;
		return true;
	}

	// 5. Resizing the list
	private void resize() {
		int newLength = 2 * personArray.length;
		Person[] newArray = new Person[newLength];
		System.arraycopy(personArray, 0, newArray, 0, personArray.length);
		personArray = newArray;
	}

	// To display all the persons list
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(personArray[i] + ", \n");
		}
		if(size > 0) {
			sb.append(personArray[size - 1]);
		}
		sb.append("]");
		return sb.toString();
	}

	// Return the size
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyPersonList list = new MyPersonList();
		list.add(new Person("Tom", "Bruce", 36));
		list.add(new Person("Corozza", "Paul", 51));
		list.add(new Person("Lermon", "Joe", 53));
		list.add(new Person("Dow", "Anne", 55));
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		list.remove("Tom");
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		System.out.println("\nSearching of Lermon: " + list.find("Lermon"));
		System.out.println(list.get(2));
	}
}
