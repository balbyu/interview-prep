/**
 * Using Var, we can see the special behaviour of "Hoisting".
 *
 * Variables in JavaScript are, in a sense, "hoisted" (or "lifted") to the top of the function or statement. However, variables
 * that are hoisted return a value of undefined. So even if you declare and initialize after you use or refer to this variable, it
 * still returns undefined.
 *
 */
function variableHoisting() {
  var a; //Value undefined
  console.log(`The value of a is: ${a}`);
  console.log(`The value of b should be hoisted, but is still: ${b}`);
  var b; //Value undefined
}

// hoistMe();
// cantHoistMe();

function hoistMe() {
  console.log("We are being hoisted, SIR!");
}

const cantHoistMe = () => {
  console.log("There is no possible way that we can be hoisted, sir ");
};

/**
 * When you declare a variable outside of any function, it is called a global variable, because it is available to any other code
 * in the current document. When you declare a variable within a function, it is called a local variable, because it is available
 * only within that function.
 */
function variableScope() {
  // Vars are always globally scoped, meaning we can call for access from anywhere.
  if (true) {
    var x = 5;
  }
  console.log(x);

  //   Let & const on the other hand is not globally scoped, but block scoped. Y is out of scope and will throw and error
  if (true) {
    let y = 4;
  }
  console.log(y);

  //   Now we are in local scope and this will work.
  if (true) {
    let y = 4;
    console.log(y);
  }
}

/**
 * Data Types.
 *
 * JavaScript is a dynamically typed language. This means you don't have to specify the data type of a variable when you declare
 * it. It also means that data types are automatically converted as-needed during script execution.
 */
function dataTypeConversions() {
  let y = "10";
  console.log(y + 15); //1015
  console.log(15 - y); //5
  console.log(y + " is a really cool number.");

  let z = "11";
  z = parseInt(z, 2); //Convert into an Integer base 2

  // Is it a number?
  if (typeof z == "number") {
    console.log("This is a number.");
  }
}

// variableHoisting();
// variableScope();
dataTypeConversions();
