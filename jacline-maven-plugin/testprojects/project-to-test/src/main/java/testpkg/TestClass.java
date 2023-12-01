package testpkg;

import com.kohlschutter.jacline.annotations.JsEntryPoint;

@JsEntryPoint
public class TestClass {
  static {
    System.out.println("Hello world");
  }
}
