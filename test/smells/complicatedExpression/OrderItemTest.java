package smells.complicatedExpression;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Iterator;

import org.junit.Test;

import com.ericsson.problem7.OrderItem;

public class OrderItemTest {

	@Test
	public void testCalculatePrice() {
		OrderItem item = new OrderItem(10, 100);
        assertEquals(1100, item.calculatePrice(), 0);		
	}
	
	@Test
	public void testMockitoStuff() {
		@SuppressWarnings("unchecked")
		Iterator<String> itr = mock(Iterator.class);
		when(itr.next()).thenReturn("Hello", "World");
		assertThat(itr.next(), is("Hello"));
		assertThat(itr.next(), is("World"));
		verify(itr, times(2)).next();
	}
}
