/**
 * @fileoverview Externs for the Barcode Detection API
 * @see https://developer.mozilla.org/en-US/docs/Web/API/BarcodeDetector
 * @externs
 */

/**
 * @typedef {{
 *   formats: (!Array<string>|undefined)
 * }}
 */
var BarcodeDetectorOptions;

/**
 * @constructor
 * @param {BarcodeDetectorOptions=} options
 */
function BarcodeDetector(options) {}

/**
 * Detect barcodes in the given image source.
 *
 * @param {!ImageBitmapSource} image
 * @return {!Promise<!Array<!DetectedBarcode>>}
 */
BarcodeDetector.prototype.detect = function(image) {};

/**
 * Returns the list of supported barcode formats.
 *
 * @return {!Promise<!Array<string>>}
 */
BarcodeDetector.getSupportedFormats = function() {};

/**
 * @constructor
 * @struct
 */
function DetectedBarcode() {}

/**
 * The raw decoded value.
 * @type {string}
 */
DetectedBarcode.prototype.rawValue;

/**
 * The barcode format (e.g. "qr_code", "ean_13").
 * @type {string}
 */
DetectedBarcode.prototype.format;

/**
 * Bounding box of the detected barcode.
 * @type {!DOMRectReadOnly}
 */
DetectedBarcode.prototype.boundingBox;

/**
 * Corner points of the barcode, if available.
 * @type {(!Array<!DOMPointReadOnly>|undefined)}
 */
DetectedBarcode.prototype.cornerPoints;
