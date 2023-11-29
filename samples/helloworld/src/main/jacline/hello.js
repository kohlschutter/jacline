goog.module('jacline.samples.helloworld.hello');

const HelloWorld = goog.require('com.kohlschutter.jacline.samples.helloworld.HelloWorld');

/**
 * Says hello to the world
 *
 * @return {void}
 */
function sayHello() {
    document.body.innerText = `${HelloWorld.getHelloWorld()} and JS!`;
}

// Export our method so it could be used outside of the module.
exports = { sayHello };
