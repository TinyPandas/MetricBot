package panda.metricbot.exceptions;

public class InvalidTokenException extends RuntimeException {

    /**
     * Empty InvalidTokenException.
     */
    public InvalidTokenException() {
        super();
    }

    /**
     * InvalidTokenException with message.
     * @param message - The message to display with exception.
     */
    public InvalidTokenException(String message) {
        super(message);
    }

    /**
     * InvalidTokenException with message and cause.
     * @param message - The message to display with exception.
     * @param cause - The cause to append to the stacktrace.
     */
    public InvalidTokenException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * InvalidTokenException with cause.
     * @param cause - The cause to append to the stacktrace.
     */
    public InvalidTokenException(Throwable cause) {
        super(cause);
    }
}
