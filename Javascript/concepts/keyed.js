/**
 * Use maps over objects when keys are unknown until run time, and when all keys are the same type and all values are the same
 * type.
 *
 * Use maps if there is a need to store primitive values as keys because object treats each key as a string whether it's a
 * number value, boolean value or any other primitive value.
 *
 * Use objects when there is logic that operates on individual elements.
 */
let sayings = new Map();
sayings.set("dog", "woof");
sayings.set("cat", "meow");
sayings.set("elephant", "toot");
sayings.size; // 3
sayings.get("dog"); // woof
sayings.get("fox"); // undefined
sayings.has("bird"); // false
sayings.delete("dog");
sayings.has("dog"); // false

for (let [key, value] of sayings) {
  console.log(key + " goes " + value);
}
// "cat goes meow"
// "elephant goes toot"

sayings.clear();
sayings.size; // 0

/**
 * Set objects are collections of values. You can iterate its elements in insertion order. A value in a Set may only occur once;
 * it is unique in the Set's collection.ß
 */
