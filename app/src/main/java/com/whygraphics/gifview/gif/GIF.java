package com.whygraphics.gifview.gif;

/**
 * Interface of a GIF.
 * <p>
 * A GIF instance should be able to start itself, stop itself and
 * provides information whether it is showing or not.
 */
public interface GIF {

    /**
     * Returns the gif duration.
     *
     * @return the gif duration
     */
    double getDuration();

    /**
     * returns true if the gif is currently showing, false otherwise.
     *
     * @return true if the gif is currently showing, false otherwise
     */
    boolean isShowing();

    /**
     * Returns the current second in the gif.
     *
     * @return the current second in the gif
     */
    double getCurrentSecond();

    /**
     * Sets the time in the gif.
     *
     * @param seconds the time in the gif
     */
    void setTime(double seconds);

    /**
     * Starts the gif.
     * If the gif is running should do nothing.
     */
    void start();

    /**
     * Restarts the gif.
     */
    void restart();

    /**
     * Stops the gif.
     * If the gif is not running should do nothing.
     */
    void stop();
}
