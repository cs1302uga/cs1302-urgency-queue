package cs1302.test;

import cs1302.gen.UrgencyQueue;
import cs1302.oracle.OracleCustomLinkedUrgencyQueue;
import cs1302.oracle.OracleLinkedUrgencyQueue;
import cs1302.oracle.model.Movie;
import cs1302.oracle.model.Person;
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
     * Determine whether the selected implementation accepts a comparator.
     *
     * @return whether the selected mode is custom
     */
    private boolean isCustomMode() {
        return this.implementation.equals("custom-oracle") || this.implementation.equals("custom");
    } // isCustomMode

    /**
     * Construct a person queue using natural ordering in every implementation mode.
     * Person natural ordering compares age first, then name.
     *
     * @return a reference to a new person queue
     */
    protected UrgencyQueue<Person> newPersonQueue() {
        switch (this.implementation) {
        case "oracle":
            return new OracleLinkedUrgencyQueue<Person>();
        case "linked":
            return new LinkedUrgencyQueue<Person>();
        default:
            return this.newPersonQueue(Comparator.naturalOrder());
        } // switch
    } // newPersonQueue

    /**
     * Construct a person queue using the supplied comparator in a custom mode.
     *
     * @param comparator the ordering to use
     * @return a reference to a new person queue
     * @throws IllegalStateException if a natural-order mode is selected
     * @throws NullPointerException if comparator is null
     */
    protected UrgencyQueue<Person> newPersonQueue(Comparator<Person> comparator) {
        switch (this.implementation) {
        case "custom-oracle":
            return new OracleCustomLinkedUrgencyQueue<Person>(comparator);
        case "custom":
            return new CustomLinkedUrgencyQueue<Person>(comparator);
        default:
            throw new IllegalStateException("A person comparator requires custom-oracle or custom");
        } // switch
    } // newPersonQueue

    /**
     * Construct a movie queue using the supplied comparator in a custom mode.
     * Movie does not implement Comparable and requires a comparator.
     *
     * @param comparator the ordering to use
     * @return a reference to a new movie queue
     * @throws IllegalStateException if a natural-order mode is selected
     * @throws NullPointerException if comparator is null
     */
    protected UrgencyQueue<Movie> newMovieQueue(Comparator<Movie> comparator) {
        switch (this.implementation) {
        case "custom-oracle":
            return new OracleCustomLinkedUrgencyQueue<Movie>(comparator);
        case "custom":
            return new CustomLinkedUrgencyQueue<Movie>(comparator);
        default:
            throw new IllegalStateException("A movie queue requires custom-oracle or custom");
        } // switch
    } // newMovieQueue

    /**
     * Check that a new person queue has size zero.
     * Use this naming pattern for tests such as testPersonQueuePeek and testPersonQueueEnqueue.
     *
     * @throws AssertionError if the size is incorrect
     */
    public void testPersonQueueSize() {
        UrgencyQueue<Person> queue = this.newPersonQueue();
        int actualSize = queue.size();
        if (actualSize != 0) {
            throw new AssertionError("new person queue size: expected 0, received " + actualSize);
        } // if
        System.out.println("PASS: new person queue size is 0");
    } // testPersonQueueSize

    /**
     * Check that a new movie queue has size zero.
     * Use this naming pattern for tests such as testMovieQueuePeek and testMovieQueueEnqueue.
     *
     * @throws AssertionError if the size is incorrect
     * @throws IllegalStateException if a natural-order mode is selected
     */
    public void testMovieQueueSize() {
        UrgencyQueue<Movie> queue = this.newMovieQueue(Movie.Order.byRating());
        int actualSize = queue.size();
        if (actualSize != 0) {
            throw new AssertionError("new movie queue size: expected 0, received " + actualSize);
        } // if
        System.out.println("PASS: new movie queue size is 0");
    } // testMovieQueueSize

    /**
     * Run each test applicable to the selected implementation.
     * Add calls here when adding new instance test methods.
     */
    public void testAll() {
        this.testPersonQueueSize();
        // Add person tests that use newPersonQueue() here.
        if (this.isCustomMode()) {
            this.testMovieQueueSize();
            // Add movie tests and person tests with custom comparators here.
        } else {
            System.out.println("SKIP: movie tests and custom-comparator person tests "
                + "require custom-oracle or custom.");
        } // if
    } // testAll

    /**
     * Run the tester for the requested implementation.
     *
     * @param args exactly one implementation name
     * @throws IllegalArgumentException if exactly one argument is not supplied
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Supply exactly one implementation name");
        } // if
        String implementation = args[0];
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
