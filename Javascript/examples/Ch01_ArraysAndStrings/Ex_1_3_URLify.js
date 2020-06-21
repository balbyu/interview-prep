function hardURLify(word) {
  const arrayWord = word.split("");
  for (let index = 0; index < arrayWord.length; index++) {
    if (arrayWord[index] === " ") {
      arrayWord[index] = "%20";
    }
  }
  return arrayWord.join("");
}

function easyURLify(word) {
  return word.replace(/\s/g, "%20");
}
