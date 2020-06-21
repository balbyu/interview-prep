/**
 *
 * @param {*} str1
 * @param {*} str2
 */
function isPermutation(str1, str2) {
  const word1 = str1.split("");
  const word2 = str2.split("");

  word1.sort();
  word2.sort();

  if (word1.length == word2.length) {
    for (let index = 0; index < word1.length; index++) {
      if (word1[index] != word2[index]) {
        return false;
      }
    }
    return true;
  }
  return false;
}

/**
 * Sort both strings and check if they are equal afterwards. Permutations will
 * be identical sorted strings.
 *
 * N = |str1| && M = |str2|
 * Time: O(N lg N + M lg M)
 * Additional space: O(1) if able to modify original strings, O(N + M) otherwise
 *
 * @param  {string[]} str2 First string, passed in as a character array
 * @param  {string[]} str1 Second string, passed in as a character array
 * @return {boolean}       True if first and second strings are permutations otherwise false
 */
function isPermutationSorted(str1, str2) {
  if (str1.length === 0 || str1.length !== str2.length) {
    return false;
  }
  // sort string using quicksort
  str1.sort();
  str2.sort();

  return str1.every((v, i) => v === str2[i]);
}

console.log(isPermutation("bobbc", "ybbob"));
