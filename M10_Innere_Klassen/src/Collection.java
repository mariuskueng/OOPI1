public interface Collection {
	/* Testet, ob der Stack leer ist */
	public boolean isEmpty();

	/* Testet, ob der Stack voll ist */
	public boolean isFull();

	/* Gibt die Anzahl der aktuell im Stack enthaltenen Elemente zur�ck. */
	public int size();

	/* L�scht alle Elemente vom Stack */
	public void clear();

	/*
	 * Gibt das oberste Element vom Stack zur�ck ohne dieses zu entfernen. Diese
	 * Methode kann nur aufgerufen werden falls der Stack nicht leer ist. Falls
	 * der Stack leer ist, dann wird null zur�ckgegeben.
	 */
	public Object peek();

	/*
	 * Entfernt das oberste Element vom Stack und gibt dieses zur�ck. Diese
	 * Methode kann nur aufgerufen werden falls der Stack nicht leer ist. Falls
	 * der Stack leer ist, dann ist das Verhalten dieser Methode nicht
	 * definiert.
	 */
	public Object pop();

	/*
	 * Legt ein Element auf dem Stack ab. Diese Methode kann nur aufgerufen
	 * werden falls der Stack nicht voll ist. Falls der Stack voll ist, dann ist
	 * das Verhalten dieser Methode nicht definiert.
	 */
	public void push(Object elem);

	/*
	 * Vergleicht das Argument x mit dem Stack, auf dem die Methode aufgerufen
	 * wird. Diese Methode gibt true zur�ck, falls das Argument ebenfalls ein
	 * Stack ist und falls die Gr�sse gleich ist und falls die Elemente auf dem
	 * Stack gleich sind, d.h. falls f�r zwei Elemente e1 und e2 an
	 * entsprechender Position auf dem Stack gilt, dass falls e1==null ist, dass
	 * dann auch e2==null ist, oder falls e1 != null ist, dass dann
	 * e1.equals(e2) gilt.
	 */
	public boolean equals(Object x);
}
