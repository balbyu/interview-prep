/**
 * Given an image represented by an N x N matrix, where each pixel in the image is represented
 * by an integer, write a method to rotate the image 90 degrees.
 */

/**
 *  1 2 3 4  == > 5 1
 *  5 6 7 8  == > 6 2
 *                7 3
 *                8 4
 *
 *  R(2) x C(4) Matrix becomes a R(4) x C(2) matrix
 *
 * (0,0) -> (0,1)
 * (0,1) -> (1, 1)
 * (0,2) -> (2,1)
 * (0,3) -> (3,1)
 *
 * (1,0) -> (0,0)
 * (1,1) -> (1,0)
 * (1,2) -> (2,0)
 * (1,3) -> (3,0)
 */

function rotateMatrix90(matrix) {
  console.log(args);
  let rowCount = matrix.length;
  let colCount = matrix[0].length;

  let rotatedMatrix = [];

  let counter = 0;

  for (let col = 0; col < colCount; col++) {
    for (let row = rowCount - 1; row >= 0; row--) {
      rotatedMatrix[col[counter]] = matrix[row[col]];
      counter++;
    }
    counter = 0;
  }
  return rotatedMatrix;
}

let args = [
  [0, 1, 2],
  [3, 4, 5],
  [6, 7, 8],
];

console.log(rotateMatrix90(args));
