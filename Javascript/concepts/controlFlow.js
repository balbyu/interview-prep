// Can I block anything I want?
{
  const x = 5;
  console.log(x);
}

/**
 * Practicing with the "Throw" statement
 */
try {
  throw new Error("Whoops!");
} catch (e) {
  console.error(e.name + ": " + e.message);
}

try {
  throw "myException"; // generates an exception
} catch (err) {
  // statements to handle any exceptions
  console.error(err);
}

/**
 * The following function outlines how we use the "Finally" keyword in a try/catch.
 */
function f() {
  try {
    console.log(0);
    throw "bogus";
  } catch (e) {
    console.log(1);
    return true; // this return statement is suspended
    // until finally block has completed
    console.log(2); // not reachable
  } finally {
    console.log(3);
    return false; // overwrites the previous "return"
    console.log(4); // not reachable
  }
  // "return false" is executed now
  console.log(5); // not reachable
}
console.log(f()); // 0, 1, 3, false
