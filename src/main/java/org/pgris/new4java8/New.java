package org.pgris.new4java8;

import java.util.*;

/**
 * <h2><a id="unmodifiable">Unmodifiable Lists</a></h2>
 * <p>
 * The {@link New#listOf(Object...) New.listOf} methods provide a convenient way to create
 * unmodifiable lists. The {@code List} instances created by these methods have the
 * following characteristics:
 *
 * <ul>
 * <li>They are <a href="Collection.html#unmodifiable"><i>unmodifiable</i></a>. Elements
 * cannot be added, removed, or replaced. Calling any mutator method on the List will
 * always cause {@code UnsupportedOperationException} to be thrown. However, if the
 * contained elements are themselves mutable, this may cause the List's contents to appear
 * to change.
 * <li>They disallow {@code null} elements. Attempts to create them with {@code null}
 * elements result in {@code NullPointerException}.
 * <li>They are serializable if all elements are serializable.
 * <li>The order of elements in the list is the same as the order of the provided
 * arguments, or of the elements in the provided array.
 * <li>The lists and their {@link List#subList(int, int) subList} views implement the
 * {@link RandomAccess} interface.
 * <li>They are <a href="../lang/doc-files/ValueBased.html">value-based</a>. Callers
 * should make no assumptions about the identity of the returned instances. Factories are
 * free to create new instances or reuse existing ones. Therefore, identity-sensitive
 * operations on these instances (reference equality ({@code ==}), identity hash code, and
 * synchronization) are unreliable and should be avoided.
 * </ul>
 *
 * <h2><a id="unmodifiableSets">Unmodifiable Sets</a></h2>
 * <p>
 * The {@link New#setOf(Object...) New.setOf} static factory methods provide a convenient
 * way to create unmodifiable sets. The {@code Set} instances created by these methods
 * have the following characteristics:
 *
 * <ul>
 * <li>They are <a href="Collection.html#unmodifiable"><i>unmodifiable</i></a>. Elements
 * cannot be added or removed. Calling any mutator method on the Set will always cause
 * {@code UnsupportedOperationException} to be thrown. However, if the contained elements
 * are themselves mutable, this may cause the Set to behave inconsistently or its contents
 * to appear to change.
 * <li>They disallow {@code null} elements. Attempts to create them with {@code null}
 * elements result in {@code NullPointerException}.
 * <li>They are serializable if all elements are serializable.
 * <li>They reject duplicate elements at creation time. Duplicate elements passed to a
 * static factory method result in {@code IllegalArgumentException}.
 * <li>The iteration order of set elements is unspecified and is subject to change.
 * <li>They are <a href="../lang/doc-files/ValueBased.html">value-based</a>. Callers
 * should make no assumptions about the identity of the returned instances. Factories are
 * free to create new instances or reuse existing ones. Therefore, identity-sensitive
 * operations on these instances (reference equality ({@code ==}), identity hash code, and
 * synchronization) are unreliable and should be avoided.
 * </ul>
 *
 * <h2><a id="unmodifiableMaps">Unmodifiable Maps</a></h2>
 * <p>
 * The {@link New#mapOf() New.map}, {@link New#mapOfEntries(Map.Entry...)
 * New.mapOfEntries} static factory methods provide a convenient way to create
 * unmodifiable maps. The {@code Map} instances created by these methods have the
 * following characteristics:
 *
 * <ul>
 * <li>They are <a href="Collection.html#unmodifiable"><i>unmodifiable</i></a>. Keys and
 * values cannot be added, removed, or updated. Calling any mutator method on the Map will
 * always cause {@code UnsupportedOperationException} to be thrown. However, if the
 * contained keys or values are themselves mutable, this may cause the Map to behave
 * inconsistently or its contents to appear to change.
 * <li>They disallow {@code null} keys and values. Attempts to create them with
 * {@code null} keys or values result in {@code NullPointerException}.
 * <li>They are serializable if all keys and values are serializable.
 * <li>They reject duplicate keys at creation time. Duplicate keys passed to a static
 * factory method result in {@code IllegalArgumentException}.
 * <li>The iteration order of mappings is unspecified and is subject to change.
 * <li>They are <a href="../lang/doc-files/ValueBased.html">value-based</a>. Callers
 * should make no assumptions about the identity of the returned instances. Factories are
 * free to create new instances or reuse existing ones. Therefore, identity-sensitive
 * operations on these instances (reference equality ({@code ==}), identity hash code, and
 * synchronization) are unreliable and should be avoided.
 * </ul>
 *
 */
public final class New {

	/**
	 * Never create an instance
	 */
	private New() {
		// do not instantiate
	}

	/* LIST */

	/**
	 * Returns an unmodifiable list containing zero elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @return an empty {@code List}
	 */
	public static <E> List<E> listOf() {
		return Collections.emptyList();
	}

	/**
	 * Returns an unmodifiable list containing one element.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the single element
	 * @return a {@code List} containing the specified element
	 * @throws NullPointerException if the element is {@code null}
	 */
	public static <E> List<E> listOf(E e1) {
		Objects.requireNonNull(e1);
		return Collections.singletonList(e1);
	}

	/**
	 * Returns an unmodifiable list containing two elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> listOf(E e1, E e2) {
		Objects.requireNonNull(e1);
		Objects.requireNonNull(e2);
		return Collections.unmodifiableList(Arrays.asList(e1, e2));
	}

	/**
	 * Returns an unmodifiable list containing three elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> listOf(E e1, E e2, E e3) {
		Objects.requireNonNull(e1);
		Objects.requireNonNull(e2);
		Objects.requireNonNull(e3);
		return Collections.unmodifiableList(Arrays.asList(e1, e2, e3));
	}

	/**
	 * Returns an unmodifiable list containing an arbitrary number of elements. See
	 * <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 *
	 * @apiNote This method also accepts a single array as an argument. The element type
	 * of the resulting list will be the component type of the array, and the size of the
	 * list will be equal to the length of the array. To create a list with a single
	 * element that is an array, do the following:
	 *
	 * <pre>{@code
	 *     String[] array = ... ;
	 *     List<String[]> list = New.<String[]>listOf(array);
	 * }</pre>
	 *
	 * This will cause the {@link New#listOf(Object) New.listOf(E)} method to be invoked
	 * instead.
	 * @param <E> the {@code List}'s element type
	 * @param elements the elements to be contained in the list
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null} or if the array is
	 * {@code null}
	 */
	@SafeVarargs
	@SuppressWarnings("varargs")
	public static <E> List<E> listOf(E... elements) {
		for (E element : elements) {
			Objects.requireNonNull(element);
		}
		List<E> list = new LinkedList<>();
		Collections.addAll(list, elements);
		return Collections.unmodifiableList(list);
	}

	/* SET */

	/**
	 * Returns an unmodifiable set containing zero elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @return an empty {@code Set}
	 */
	public static <E> Set<E> setOf() {
		return Collections.emptySet();
	}

	/**
	 * Returns an unmodifiable set containing one element. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the single element
	 * @return a {@code Set} containing the specified element
	 * @throws NullPointerException if the element is {@code null}
	 */
	public static <E> Set<E> setOf(E e1) {
		Objects.requireNonNull(e1);
		return Collections.singleton(e1);
	}

	/**
	 * Returns an unmodifiable set containing two elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if the elements are duplicates
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> setOf(E e1, E e2) {
		Objects.requireNonNull(e1);
		Objects.requireNonNull(e2);

		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		addCheckingRepetition(set, e2);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing three elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> setOf(E e1, E e2, E e3) {
		Objects.requireNonNull(e1);
		Objects.requireNonNull(e2);
		Objects.requireNonNull(e3);

		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		addCheckingRepetition(set, e2);
		addCheckingRepetition(set, e3);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing an arbitrary number of elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 *
	 * @apiNote This method also accepts a single array as an argument. The element type
	 * of the resulting set will be the component type of the array, and the size of the
	 * set will be equal to the length of the array. To create a set with a single element
	 * that is an array, do the following:
	 *
	 * <pre>{@code
	 *     String[] array = ... ;
	 *     Set<String[]> list = New.<String[]>set(array);
	 * }</pre>
	 *
	 * This will cause the {@link New#setOf(Object) New.set(E)} method to be invoked
	 * instead.
	 * @param <E> the {@code Set}'s element type
	 * @param elements the elements to be contained in the set
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null} or if the array is
	 * {@code null}
	 */
	@SafeVarargs
	@SuppressWarnings("varargs")
	public static <E> Set<E> setOf(E... elements) {
		for (E element : elements) {
			Objects.requireNonNull(element);
		}
		Set<E> set = new LinkedHashSet<>();
		for (E element : elements) {
			addCheckingRepetition(set, element);
		}
		return Collections.unmodifiableSet(set);
	}

	private static <E> void addCheckingRepetition(Set<E> set, E element) {
		if (!set.add(element)) {
			throw new IllegalArgumentException("duplicate element: " + element);
		}
	}

	/**
	 * Returns an unmodifiable map containing zero mappings. See
	 * <a href="#unmodifiableMaps">Unmodifiable Maps</a> for details.
	 * @param <K> the {@code Map}'s key type
	 * @param <V> the {@code Map}'s value type
	 * @return an empty {@code Map}
	 */
	public static <K, V> Map<K, V> mapOf() {
		return Collections.emptyMap();
	}

	/**
	 * Returns an unmodifiable map containing a single mapping. See
	 * <a href="#unmodifiableMaps">Unmodifiable Maps</a> for details.
	 * @param <K> the {@code Map}'s key type
	 * @param <V> the {@code Map}'s value type
	 * @param k1 the mapping's key
	 * @param v1 the mapping's value
	 * @return a {@code Map} containing the specified mapping
	 * @throws NullPointerException if the key or the value is {@code null}
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1) {
		Objects.requireNonNull(k1);
		Objects.requireNonNull(v1);
		return Collections.singletonMap(k1, v1);
	}

	/**
	 * Returns an unmodifiable map containing two mappings. See
	 * <a href="#unmodifiable">Unmodifiable Maps</a> for details.
	 * @param <K> the {@code Map}'s key type
	 * @param <V> the {@code Map}'s value type
	 * @param k1 the first mapping's key
	 * @param v1 the first mapping's value
	 * @param k2 the second mapping's key
	 * @param v2 the second mapping's value
	 * @return a {@code Map} containing the specified mappings
	 * @throws IllegalArgumentException if the keys are duplicates
	 * @throws NullPointerException if any key or value is {@code null}
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2) {
		Objects.requireNonNull(k1);
		Objects.requireNonNull(v1);
		Objects.requireNonNull(k2);
		Objects.requireNonNull(v2);

		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		addCheckingRepeatedKey(map, k2, v2);
		return Collections.unmodifiableMap(map);
	}

	/**
	 * Returns an unmodifiable map containing three mappings. See
	 * <a href="#unmodifiableMaps">Unmodifiable Maps</a> for details.
	 * @param <K> the {@code Map}'s key type
	 * @param <V> the {@code Map}'s value type
	 * @param k1 the first mapping's key
	 * @param v1 the first mapping's value
	 * @param k2 the second mapping's key
	 * @param v2 the second mapping's value
	 * @param k3 the third mapping's key
	 * @param v3 the third mapping's value
	 * @return a {@code Map} containing the specified mappings
	 * @throws IllegalArgumentException if there are any duplicate keys
	 * @throws NullPointerException if any key or value is {@code null}
	 */
	public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3) {
		Objects.requireNonNull(k1);
		Objects.requireNonNull(v1);
		Objects.requireNonNull(k2);
		Objects.requireNonNull(v2);
		Objects.requireNonNull(k3);
		Objects.requireNonNull(v3);
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		addCheckingRepeatedKey(map, k2, v2);
		addCheckingRepeatedKey(map, k3, v3);
		return Collections.unmodifiableMap(map);
	}

	/**
	 * Returns an unmodifiable {@link Map.Entry} containing the given key and value. These
	 * entries are suitable for populating {@code Map} instances using the
	 * {@link New#mapOfEntries New.mapOfEntries()} method. The {@code Entry} instances
	 * created by this method have the following characteristics:
	 *
	 * <ul>
	 * <li>They disallow {@code null} keys and values. Attempts to create them using a
	 * {@code null} key or value result in {@code NullPointerException}.
	 * <li>They are unmodifiable. Calls to {@link Map.Entry#setValue Entry.setValue()} on
	 * a returned {@code Entry} result in {@code UnsupportedOperationException}.
	 * <li>They are serializable.
	 * <li>They are <a href="../lang/doc-files/ValueBased.html">value-based</a>. Callers
	 * should make no assumptions about the identity of the returned instances. This
	 * method is free to create new instances or reuse existing ones. Therefore,
	 * identity-sensitive operations on these instances (reference equality ({@code ==}),
	 * identity hash code, and synchronization) are unreliable and should be avoided.
	 * </ul>
	 * @param <K> the key's type
	 * @param <V> the value's type
	 * @param k the key
	 * @param v the value
	 * @return an {@code Entry} containing the specified key and value
	 * @throws NullPointerException if the key or value is {@code null}
	 *
	 * @see New#mapOfEntries New.mapOfEntries()
	 */
	public static <K, V> Map.Entry<K, V> mapEntry(K k, V v) {
		Objects.requireNonNull(k);
		Objects.requireNonNull(v);
		return new AbstractMap.SimpleImmutableEntry<>(k, v);
	}

	/**
	 * Returns an unmodifiable map containing keys and values extracted from the given
	 * entries. The entries themselves are not stored in the map. See
	 * <a href="#unmodifiableMaps">Unmodifiable Maps</a> for details.
	 *
	 * @apiNote It is convenient to create the map entries using the {@link New#mapEntry
	 * New.mapEntry()} method. For example,
	 *
	 * <pre>{@code
	 *     import static org.pgris.New.mapEntry;
	 *
	 *     Map<Integer,String> map = New.mapOfEntries(
	 *         mapEntry(1, "a"),
	 *         mapEntry(2, "b"),
	 *         mapEntry(3, "c"),
	 *         ...
	 *         mapEntry(26, "z"));
	 * }</pre>
	 * @param <K> the {@code Map}'s key type
	 * @param <V> the {@code Map}'s value type
	 * @param entries {@code Map.Entry}s containing the keys and values from which the map
	 * is populated
	 * @return a {@code Map} containing the specified mappings
	 * @throws IllegalArgumentException if there are any duplicate keys
	 * @throws NullPointerException if any entry, key, or value is {@code null}, or if the
	 * {@code entries} array is {@code null}
	 *
	 * @see Map#entry Map.entry()
	 */
	@SafeVarargs
	public static <K, V> Map<K, V> mapOfEntries(Map.Entry<? extends K, ? extends V>... entries) {
		Map<K, V> map = new HashMap<>();
		for (Map.Entry<? extends K, ? extends V> e : entries) {
			Objects.requireNonNull(e);
			Objects.requireNonNull(e.getKey());
			Objects.requireNonNull(e.getValue());
			addCheckingRepeatedKey(map, e.getKey(), e.getValue());
		}
		return Collections.unmodifiableMap(map);
	}

	private static <K, V> void addCheckingRepeatedKey(Map<K, V> map, K key, V value) {
		if (map.containsKey(key)) {
			throw new IllegalArgumentException("duplicated key:" + key);
		}
		map.put(key, value);
	}

}
