function myFirstClosure(he) {
  return function haw(haw) {
    return `${he} ${haw}`;
  };
}
let funnyMan = myFirstClosure("he");

let mySalary = (function () {
  var salary = 60000;
  function changeBy(amount) {
    salary += amount;
  }
  return {
    raise: function () {
      changeBy(5000);
    },
    lower: function () {
      changeBy(-5000);
    },
    currentAmount: function () {
      return salary;
    },
  };
})();

console.log(mySalary.currentAmount());
