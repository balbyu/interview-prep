/*
 * Complete the simpleArraySum function below.
 */
function simpleArraySum(ar) {
  let sum = 0;
  ar.forEach((element) => (sum += element));
  console.log(sum);
}

// simpleArraySum([1, 2, 3]);

// Complete the sockMerchant function below.
function sockMerchant(n, ar) {
  let sockMap = new Map();
  let pairs = 0;
  ar.forEach((element) => {
    if (sockMap.has(element)) {
      sockMap.set(element, sockMap.get(element) + 1);
    } else {
      sockMap.set(element, 1);
    }
  });
  sockMap.forEach((sock) => {
    pairs = pairs + Math.floor(sock / 2);
  });
  return pairs;
}
console.log(sockMerchant(9, [10, 20, 20, 10, 10, 30, 50, 10, 20]));
