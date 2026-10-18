package cs1302.test;

import cs1302.gen.UrgencyQueue;
import cs1302.oracle.OracleCustomLinkedUrgencyQueue;
import cs1302.oracle.OracleLinkedUrgencyQueue;
import cs1302.p3.CustomLinkedUrgencyQueue;
import cs1302.p3.LinkedUrgencyQueue;
import java.util.Comparator;

/**
 * Provides reusable test scenarios for urgency queue implementations.
 * Add substantive test scenarios and call them from {@link #testAll()}.
 */
public class QueueTester {

    private final String implementation;

    /**
     * Construct a tester for the selected implementation.
     *
     * @param implementation {@code oracle}, {@code custom-oracle},
     *     {@code linked}, or {@code custom}
     * @throws IllegalArgumentException if the implementation name is unknown
     */
    public QueueTester(String implementation) {
        switch (implementation) {
        case "oracle", "custom-oracle", "linked", "custom":
            this.implementation = implementation;
            break;
        default:
            throw new IllegalArgumentException("Unknown implementation: " + implementation);
        } // switch
    } // QueueTester

    /**
     * Construct a queue for a shared test scenario.
     * Natural-order modes use {@code compareTo}; custom-order modes use the
     * supplied comparator. Use {@link Comparator#naturalOrder()} for scenarios
     * shared by all four modes. Add separate custom-order scenarios as needed.
     *
     * @param <T> the item type for the scenario
     * @param comparator the ordering to use in custom-order modes
     * @return a reference to a new queue of the selected implementation
     */
    protected <T extends Comparable<T>> UrgencyQueue<T> newQueue(Comparator<T> comparator) {
        switch (this.implementation) {
        case "oracle":
            return new OracleLinkedUrgencyQueue<T>();
        case "custom-oracle":
            return new OracleCustomLinkedUrgencyQueue<T>(comparator);
        case "linked":
            return new LinkedUrgencyQueue<T>();
        default:
            return new CustomLinkedUrgencyQueue<T>(comparator);
        } // switch
    } // newQueue

    /**
     * Check that a new queue has size zero.
     *
     * @throws AssertionError if the size is incorrect
     */
    public void testNewQueue() {
        UrgencyQueue<String> queue = this.<String>newQueue(Comparator.naturalOrder());
        int actualSize = queue.size();
        if (actualSize != 0) {
            throw new AssertionError("new queue size: expected 0, received " + actualSize);
        } // if
        System.out.println("PASS: new queue size is 0");
    } // testNewQueue

    /**
     * Run every test scenario. Add calls here when adding new scenarios.
     */
    public void testAll() {
        this.testNewQueue();
    } // testAll

    /**
     * Run the tester for the requested implementation.
     *
     * @param args an optional implementation name; defaults to {@code oracle}
     * @throws IllegalArgumentException if more than one argument is supplied
     */
    public static void main(String[] args) {
        if (args.length > 1) {
            throw new IllegalArgumentException("Supply at most one implementation name");
        } // if
        String implementation = args.length == 0 ? "oracle" : args[0];
        QueueTester tester = new QueueTester(implementation);
        try {
            tester.testAll();
        } catch (UnsupportedOperationException exception) {
            if (implementation.equals("linked") || implementation.equals("custom")) {
                System.err.println("A student stub threw UnsupportedOperationException. "
                    + "This is expected until that constructor or method is implemented; "
                    + "the test run still fails.");
            } // if
            throw exception;
        } // try
        System.out.println("All enabled scenarios passed for " + implementation
            + ". Add substantive tests beyond the initial size check.");
    } // main
} // QueueTester
