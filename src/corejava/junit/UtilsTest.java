package corejava.junit;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * JUnit test for static methods in Utils class.
 * @author m
 */

public class UtilsTest {
	/**
	 * verifies operation of Utils.calmString
	 */
	@Test
	public void testCalmString() {
		assertThat(Utils.calmString("abc"), is(equalTo("abc")));
		assertThat(Utils.calmString("!a!b!c"), is(equalTo("abc")));
		assertThat(Utils.calmString("!!a!!b!!c!!"), is(equalTo("abc")));
		assertThat(Utils.calmString("a!!b!c!!"), is(equalTo("abc")));
		assertThat(Utils.calmString(null), is(nullValue()));	// is(nullValue())
	}
	
	/**
	 * verifies operation of Utils.calmAttendees
	 */
	@Test
	public void testCalmAttendees() {
		List<String> attendees = new ArrayList<>(
						Arrays.asList("Republican", "Democrat", "RINO Party", "Brocialists"));	// shortcut
		Utils.calmAttendees(attendees);	// removes either "Republican" or "Democrat" at random.
		assertThat(attendees, not(allOf(hasItem("Republican"), hasItem("Democrat"))));	// asserts that attendees does not have all items in the set {"Republican", "Democrat"}, evaluates true since we removed one of them.
		assertThat(attendees, anyOf(hasItem("Republican"), hasItem("Democrat")));	// asserts that attendees has at least one item in the set {"Republican", "Democrat"}, evaluates true since we only removed one of the two.
		assertThat(attendees, allOf(hasItem("RINO Party"), hasItem("Brocialists")));	// self-explanatory. evaluates to true.
		//assertThat(attendees, not(allOf(hasItem("RINO Party"), hasItem("Brocialists"))));	// evaluates to false since we didn't remove either.
	}
}
