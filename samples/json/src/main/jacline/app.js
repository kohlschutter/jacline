goog.module('jacline.samples.helloworld');

const HelloWorld = goog.require('com.kohlschutter.jacline.samples.helloworld.HelloWorld');

var hw = new HelloWorld();
document.body.innerText = `${hw.getMessage()}`;

var json = hw.encode();

console.log("HelloWorld", hw);
console.log("HelloWorld, encoded as JSON", json);

var hw1 = HelloWorld.decode(json);
console.log("HelloWorld, decoded from JSON", hw1);

document.body.innerText = `${hw1.getMessage()}`;

// try changing "pi" value to 4, then also try setting "indiana" to true
var json2 = JSON.parse(`
{
    "javaClass": "com.kohlschutter.jacline.samples.helloworld.HelloWorld",
    "message": "Greetings, jacline user!",
    "stringArray": ["one", "two", "mississippi"],
    "obj": {
        "javaClass": "SomeObjectType",
        "pi": 3.14,
        "indiana": false
    }
}
`);

console.log("HelloWorld, take two, native JSON", json2);
var hw2;
try {
    hw2 = HelloWorld.decode(json2);
    console.log("HelloWorld, take two, decoded from JSON", hw2);
} catch (e) {
    console.error("Decoding HelloWorld failed", e);
}

document.body.innerText = `${hw2.getMessage()}`;
