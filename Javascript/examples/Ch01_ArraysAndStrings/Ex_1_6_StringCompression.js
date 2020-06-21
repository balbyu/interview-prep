/**
 * Implement a method to perform basic string compression.
 *
 * aabcccccaa -> a2b1c5a3
 *
 * If the compressed string is not smaller than original string, just return
 * the original string. This only has upper and lower case numbers.
 *
 */

/**
 * Brute force -> Loop through the string and count every time we have a matching letter. Add
 * this to a key/value paid (key: letter, value: count). Check the map to see if we have the letter
 * next before continuing to add to hashmap. Then build a string with the letters and values.
 *
 * NOTE: This implementation didn't work because JS and Maps only contain unique keys. So it
 * breaks when we want to use a twice.
 */

function stringCompress(str) {
  const chars = str.split("");
  const map = {};
  let counter = 1;
  for (let index = 0; index < chars.length; index++) {
    if (chars[index] === chars[index + 1]) {
      counter++;
    } else {
      const letter = chars[index];
      map[letter] = new Number(counter);
      counter = 1;
    }
  }
  console.log(map);
}

/**
 * Takes an input string and counts contiguous sequences of the same character
 * and replaces them with XC (X = count, C = character).
 *
 * N = |str|
 * Time: O(N)
 * Additional space: O(N)
 *
 * @param  {string} str [description]
 * @return {[type]}     [description]
 */
export function compressString(str) {
  if (!str) {
    return str;
  }

  let cStr = "";
  for (let i = 0; i < str.length; ++i) {
    let char = str[i],
      start = i;
    while (i + 1 < str.length && char === str[i + 1]) {
      ++i;
    }
    // JS does not have a StringBuilder/StringBuffer style class for creating strings
    // string concatenation has been heavily optimised in JS implementations and
    // is faster than creating a string via an array then using a .join('') at the end
    cStr += i - start + 1 + char;
  }

  return cStr.length < str.length ? cStr : str;
}
