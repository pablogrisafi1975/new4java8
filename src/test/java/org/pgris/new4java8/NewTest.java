package org.pgris.new4java8;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NewTest {

	/* LIST */

	@Test
	void testListOf0() {
		List<String> result = New.listOf();
		assertTrue(result.isEmpty());
		assertThrows(UnsupportedOperationException.class, () -> result.add("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(0, "a"));
	}

	@Test
	void testListOf1() {
		List<String> result = New.listOf("a");
		assertEquals(1, result.size());
		assertEquals("a", result.get(0));
		assertThrows(UnsupportedOperationException.class, () -> result.add("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(0, "b"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove(0));

		assertThrows(NullPointerException.class, () -> New.listOf((Object) null));
	}

	@Test
	void testListOf2() {
		List<String> result = New.listOf("a", "b");
		assertEquals(2, result.size());
		assertEquals("a", result.get(0));
		assertEquals("b", result.get(1));
		assertThrows(UnsupportedOperationException.class, () -> result.add("z"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(0, "z"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(2, "z"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove(0));
		assertThrows(UnsupportedOperationException.class, () -> result.remove(1));

		assertThrows(NullPointerException.class, () -> New.listOf(null, "b"));
		assertThrows(NullPointerException.class, () -> New.listOf("a", null));

	}

	@Test
	void testListOf3() {
		List<String> result = New.listOf("a", "b", "c");
		assertEquals(3, result.size());
		assertEquals("a", result.get(0));
		assertEquals("b", result.get(1));
		assertEquals("c", result.get(2));
		assertThrows(UnsupportedOperationException.class, () -> result.add("z"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(0, "z"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(1, "z"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(2, "z"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("c"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove(0));
		assertThrows(UnsupportedOperationException.class, () -> result.remove(1));
		assertThrows(UnsupportedOperationException.class, () -> result.remove(2));

		assertThrows(NullPointerException.class, () -> New.listOf(null, "b", "c"));
		assertThrows(NullPointerException.class, () -> New.listOf("a", null, "c"));
		assertThrows(NullPointerException.class, () -> New.listOf("a", "b", null));

	}

	@Test
	void testListOf4() {
		List<String> result = New.listOf("a", "b", "c", "d");
		assertEquals(4, result.size());
		assertEquals("a", result.get(0));
		assertEquals("b", result.get(1));
		assertEquals("c", result.get(2));
		assertEquals("d", result.get(3));
		assertThrows(UnsupportedOperationException.class, () -> result.add("z"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(0, "z"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(1, "z"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(2, "z"));
		assertThrows(UnsupportedOperationException.class, () -> result.set(3, "z"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("c"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("d"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove(0));
		assertThrows(UnsupportedOperationException.class, () -> result.remove(1));
		assertThrows(UnsupportedOperationException.class, () -> result.remove(2));
		assertThrows(UnsupportedOperationException.class, () -> result.remove(3));

		assertThrows(NullPointerException.class, () -> New.listOf(null, "b", "c", "d"));
		assertThrows(NullPointerException.class, () -> New.listOf("a", null, "c", "d"));
		assertThrows(NullPointerException.class, () -> New.listOf("a", "b", null, "d"));
		assertThrows(NullPointerException.class, () -> New.listOf("a", "b", "c", null));

	}

	/* SET */

	@Test
	void testSetOf0() {
		Set<String> result = New.setOf();
		assertTrue(result.isEmpty());
		assertThrows(UnsupportedOperationException.class, () -> result.add("a"));
	}

	@Test
	void testSetOf1() {
		Set<String> result = New.setOf("a");
		assertEquals(1, result.size());
		assertTrue(result.contains("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.add("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(NullPointerException.class, () -> New.setOf((Object) null));
	}

	@Test
	void testSetOf2() {
		Set<String> result = New.setOf("a", "b");
		assertEquals(2, result.size());
		assertTrue(result.contains("a"));
		assertTrue(result.contains("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.add("z"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("b"));

		assertThrows(IllegalArgumentException.class, () -> New.setOf("a", "a"));

		assertThrows(NullPointerException.class, () -> New.setOf(null, "b"));
		assertThrows(NullPointerException.class, () -> New.setOf("a", null));

	}

	@Test
	void testSetOf3() {
		Set<String> result = New.setOf("a", "b", "c");
		assertEquals(3, result.size());
		assertTrue(result.contains("a"));
		assertTrue(result.contains("b"));
		assertTrue(result.contains("c"));

		assertThrows(UnsupportedOperationException.class, () -> result.add("z"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("c"));

		assertThrows(IllegalArgumentException.class, () -> New.setOf("a", "a", "c"));
		assertThrows(IllegalArgumentException.class, () -> New.setOf("a", "b", "b"));
		assertThrows(IllegalArgumentException.class, () -> New.setOf("a", "b", "a"));

		assertThrows(NullPointerException.class, () -> New.setOf(null, "b", "c"));
		assertThrows(NullPointerException.class, () -> New.setOf("a", null, "c"));
		assertThrows(NullPointerException.class, () -> New.setOf("a", "b", null));

	}

	@Test
	void testSetOf4() {
		Set<String> result = New.setOf("a", "b", "c", "d");
		assertEquals(4, result.size());
		assertTrue(result.contains("a"));
		assertTrue(result.contains("b"));
		assertTrue(result.contains("c"));
		assertTrue(result.contains("d"));

		assertThrows(UnsupportedOperationException.class, () -> result.add("z"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("c"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("d"));

		assertThrows(IllegalArgumentException.class, () -> New.setOf("a", "a", "c", "d"));
		assertThrows(IllegalArgumentException.class, () -> New.setOf("a", "b", "b", "d"));
		assertThrows(IllegalArgumentException.class, () -> New.setOf("a", "b", "a", "d"));
		assertThrows(IllegalArgumentException.class, () -> New.setOf("a", "b", "c", "a"));
		assertThrows(IllegalArgumentException.class, () -> New.setOf("a", "b", "c", "b"));
		assertThrows(IllegalArgumentException.class, () -> New.setOf("a", "b", "c", "c"));

		assertThrows(NullPointerException.class, () -> New.setOf(null, "b", "c", "d"));
		assertThrows(NullPointerException.class, () -> New.setOf("a", null, "c", "d"));
		assertThrows(NullPointerException.class, () -> New.setOf("a", "b", null, "d"));
		assertThrows(NullPointerException.class, () -> New.setOf("a", "b", "c", null));

	}

	/* MAP */
	@Test
	void testMapOf0() {
		Map<String, Integer> result = New.mapOf();
		assertTrue(result.isEmpty());
		assertThrows(UnsupportedOperationException.class, () -> result.put("a", 1));
	}

	@Test
	void testMapOf1() {
		Map<String, Integer> result = New.mapOf("a", 1);
		assertEquals(1, result.size());
		assertEquals(1, result.get("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.put("b", 2));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));

		assertThrows(NullPointerException.class, () -> New.mapOf(null, 1));
		assertThrows(NullPointerException.class, () -> New.mapOf("a", null));
	}

	@Test
	void testMapOf2() {
		Map<String, Integer> result = New.mapOf("a", 1, "b", 2);
		assertEquals(2, result.size());
		assertEquals(1, result.get("a"));
		assertEquals(2, result.get("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.put("z", 2));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("b"));

		assertThrows(NullPointerException.class, () -> New.mapOf(null, 1, "b", 2));
		assertThrows(NullPointerException.class, () -> New.mapOf("a", null, "b", 2));
		assertThrows(NullPointerException.class, () -> New.mapOf("a", 1, null, 2));
		assertThrows(NullPointerException.class, () -> New.mapOf("a", 1, "b", null));

		assertThrows(IllegalArgumentException.class, () -> New.mapOf("a", 1, "a", 2));
	}

	@Test
	void testMapOf3() {
		Map<String, Integer> result = New.mapOf("a", 1, "b", 2, "c", 3);
		assertEquals(3, result.size());
		assertEquals(1, result.get("a"));
		assertEquals(2, result.get("b"));
		assertEquals(3, result.get("c"));
		assertThrows(UnsupportedOperationException.class, () -> result.put("z", 2));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("c"));

		assertThrows(NullPointerException.class, () -> New.mapOf(null, 1, "b", 2, "c", 3));
		assertThrows(NullPointerException.class, () -> New.mapOf("a", null, "b", 2, "c", 3));
		assertThrows(NullPointerException.class, () -> New.mapOf("a", 1, null, 2, "c", 3));
		assertThrows(NullPointerException.class, () -> New.mapOf("a", 1, "b", null, "c", 3));
		assertThrows(NullPointerException.class, () -> New.mapOf("a", 1, "b", 2, null, 3));
		assertThrows(NullPointerException.class, () -> New.mapOf("a", 1, "b", 2, "c", null));

		assertThrows(IllegalArgumentException.class, () -> New.mapOf("a", 1, "a", 2, "c", 3));
		assertThrows(IllegalArgumentException.class, () -> New.mapOf("a", 1, "b", 2, "b", 3));
		assertThrows(IllegalArgumentException.class, () -> New.mapOf("a", 1, "b", 2, "a", 3));
	}

	@Test
	void testMapEntry() {
		Map.Entry<String, Integer> result = New.mapEntry("a", 1);
		assertEquals("a", result.getKey());
		assertEquals(1, result.getValue());
		assertThrows(UnsupportedOperationException.class, () -> result.setValue(2));

		assertThrows(NullPointerException.class, () -> New.mapEntry("a", null));
		assertThrows(NullPointerException.class, () -> New.mapEntry(null, 1));
	}

	@Test
	void testMapOfEntries() {
		Map<String, Integer> result = New.mapOfEntries(New.mapEntry("a", 1), New.mapEntry("b", 2));
		assertEquals(2, result.size());
		assertEquals(1, result.get("a"));
		assertEquals(2, result.get("b"));
		assertThrows(UnsupportedOperationException.class, () -> result.put("z", 2));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("a"));
		assertThrows(UnsupportedOperationException.class, () -> result.remove("b"));

		assertThrows(NullPointerException.class,
				() -> New.mapOfEntries(New.mapEntry("a", 1), null, New.mapEntry("a", 1)));

		assertThrows(NullPointerException.class, () -> {
			AbstractMap.SimpleImmutableEntry<String, Integer> nullValueEntry = new AbstractMap.SimpleImmutableEntry<>(
					"a", null);
			New.mapOfEntries(nullValueEntry, New.mapEntry("b", 2));
		});
		assertThrows(NullPointerException.class, () -> {
			AbstractMap.SimpleImmutableEntry<String, Integer> nullKeyEntry = new AbstractMap.SimpleImmutableEntry<>(
					null, 1);
			New.mapOfEntries(nullKeyEntry, New.mapEntry("b", 2));
		});

		assertThrows(IllegalArgumentException.class,
				() -> New.mapOfEntries(New.mapEntry("a", 1), New.mapEntry("a", 2)));

		assertThrows(IllegalArgumentException.class, () -> New.mapOf("a", 1, "b", 2, "a", 3));

	}

}
