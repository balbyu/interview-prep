/**
 * Nesting Functions (for more FUN).
 *
 * Nesting a function does the following:
 *
 * It also forms a closure. A closure is an expression (most commonly, a function) that can have free variables together with an
 * environment that binds those variables (that "closes" the expression).
 *
 * Since a nested function is a closure, this means that a nested function can "inherit" the arguments and variables of its
 * containing function. In other words, the inner function contains the scope of the outer functio
 */

function addSquares(a, b) {
  function square(x) {
    return x * x;
  }
  return square(a) + square(b);
}
let a = addSquares(2, 3); // returns 13
let b = addSquares(3, 4); // returns 25
let c = addSquares(4, 5); // returns 41

console.log(a, b, c);

/**
 * Closures. CLOSURES!!!
 *
 * Closures are one of the most powerful features of JavaScript. JavaScript allows for the nesting of functions and grants the
 * inner function full access to all the variables and functions defined inside the outer function (and all other variables and
 * functions that the outer function has access to).
 *
 * However, the outer function does not have access to the variables and functions defined inside the inner function. This
 * provides a sort of encapsulation for the variables of the inner function.
 */
function test() {
  let a = 1,
    b = 2;

  return function () {
    console.log(a + b);
  };
}
let testFN = test();
testFN();

/**
 * Remember, JavaScript still doesn’t have the concept of a private scope for attributes or methods on your classes, so simulating
 * this might help you protect your code and allow others to use your libraries properly. So, the main goal we’re trying to
 * achieve here is to allow others to set values on your variables without actually accessing them, providing some form of
 * pre-validation, as well as getting compounded values, based on several different variables, again, without accessing them
 * directly.å
 */
let fns = [];

for (var i = 0; i < 5; i++) {
  ((_) => {
    var c = i * 2;
    fns.push((__) => console.log(c));
  })();
}

fns.forEach((f) => f());
