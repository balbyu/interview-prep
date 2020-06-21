/**
 * There are three types of edits that can be performed on a string:
 *
 * - Insert a Character
 * - Remove a Character
 * - Replace a Character
 *
 * Given two strings, check to see if they are one edit (or zero) away
 *
 * ex: Stewart & Stewert (replace) -> same length
 * ex: Robert & Obert (remove) -> 1 character shorter
 * ex: Drew & sDrew (Insert) -> 1 character longer
 *
 * Easy conditions to check:
 *
 * 1. Length difference is <= 1
 * 2. All letters the same
 * 3. Remove common letters that occur in both words. We should have a single character left over.
 */

function oneAway(strOne, strTwo) {
  strOne = strOne.split("");
  strTwo = strTwo.split("");
  if (Math.abs(strOne.length - strTwo.length) > 1) return false; // 2 or more edits
  if (strOne === strTwo) return true; //Zero Edits

  let singleSet = new Set();
  singleSet.add(strOne);
  singleSet.add(strTwo);

  if (singleSet.length > 1) {
    return false;
  } else {
    return true;
  }
}
