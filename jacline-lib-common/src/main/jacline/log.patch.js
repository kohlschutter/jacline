goog.module("kohlschutter.log.Log$impl$patched");

var CommonLog = goog.require("kohlschutter.log.Log$impl");

function logTo(target, message, args) {
    message = message.replaceAll("%", "%%"); // disallow JavaScript console escapes
    if (args.length == 0) {
        target(message);
        return;
    }
    message = message.replaceAll("{}", function(match, offset, string) {
        if (offset > 0 && string.charAt(offset - 1) == '\\') {
            return match;
        }
        var arg = args.shift();
        if (arg == null) {
            return "null";
        } else {
            return arg.toString();
        }
    });

    switch (args.length) {
        case 0:
            target(message);
            return;
        case 1:
            target(message, args[0]);
            return;
        case 2:
            target(message, args[0], args[1]);
            return;
        case 3:
            target(message, args[0], args[1], args[2]);
            return;
        case 4:
            target(message, args[0], args[1], args[2], args[3]);
            return;
        case 5:
            target(message, args[0], args[1], args[2], args[3], args[4]);
            return;
        default:
            target(message, args);
    }
};

CommonLog.log = function(message, ...args) {
    logTo(console.log, message, args);
};

CommonLog.debug = function(message, ...args) {
    logTo(console.debug, message, args);
};

CommonLog.info = function(message, ...args) {
    logTo(console.debug, message, args);
};

CommonLog.warn = function(message, ...args) {
    logTo(console.warn, message, args);
};

CommonLog.error = function(message, ...args) {
    logTo(console.error, message, args);
};

exports = CommonLog;
