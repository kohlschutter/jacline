import com.kohlschutter.jacline.samples.helloworld.HelloWorld;

/**
 * The module descriptor for the "json" project.
 * <p>
 * Note how the {@code provides} statement ensures that the static initializer of {@link HelloWorld}
 * is being called by {@link Decodables}, at least for vanilla JVM environments.
 * 
 * @provides com.kohlschutter.jacline.lib.coding.Codable
 */
@SuppressWarnings("module") module jacline.samples.json {
  requires static jacline.annotations;
  requires static jsinterop.annotations;
  requires static com.kohlschutter.annotations.compiletime;

  requires jacline.lib.common;

  provides com.kohlschutter.jacline.lib.coding.Codable with HelloWorld;
}
