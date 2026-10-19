package cs1302.p3;

import cs1302.gen.UrgencyQueue;

public abstract class BaseLinkedUrgencyQueue<ItemType> implements UrgencyQueue<ItemType> {

    /**
     * Construct a {@code BaseLinkedUrgencyQueue}. This constructor is never
     * intended to be called directly via {@code new}; instead, it should only
     * be called in child class constructors using {@code super()}.
     */
    public BaseLinkedUrgencyQueue() {
        throw new UnsupportedOperationException("constructor: not yet implemented");
    } // BaseLinkedUrgencyQueue

} // BaseLinkedUrgencyQueue<ItemType>
