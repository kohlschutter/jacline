package java.util.concurrent;

public class CompletionException extends RuntimeException {
  public CompletionException(String message, Throwable cause) {
    super(message, cause);
  }

  public CompletionException(Throwable cause) {
    super(cause);
  }
}
