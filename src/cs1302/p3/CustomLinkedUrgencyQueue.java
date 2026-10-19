package cs1302.p3;

import cs1302.gen.UrgencyQueue;
import java.util.Comparator;

public class CustomLinkedUrgencyQueue<ItemType> extends BaseLinkedUrgencyQueue<ItemType> {

    /**
     * Construct a {@code CustomLinkedUrgencyQueue}.
     *
     * @param cmp a function that lets you determine the urgency order
     *     between two items
     * @throws NullPointerException if {@code cmp} is {@code null}
     */
    public CustomLinkedUrgencyQueue(Comparator<ItemType> cmp) {
        super();
        throw new UnsupportedOperationException("constructor: not yet implemented");
    } // CustomLinkedUrgencyQueue

} // CustomLinkedUrgencyQueue<ItemType>
