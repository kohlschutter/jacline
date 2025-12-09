goog.module('jacline.samples.helloworld');

const HelloWorld = goog.require('com.kohlschutter.jacline.samples.json.HelloWorld');

var hw = new HelloWorld();
document.body.innerText = `${hw.getMessage()}`;

console.log("HelloWorld", hw);

var json = hw.encodeDefault();

console.log("HelloWorld, encoded as JSON", json);

var hw1 = HelloWorld.decodeDefault(json);
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
//try {
    hw2 = HelloWorld.decodeDefault(json2);
    console.log("HelloWorld, take two, decoded from JSON", hw2);
//} catch (e) {
    //console.error("Decoding HelloWorld failed", e);
//}

document.body.innerText = `${hw2.getMessage()}`;
