function reverseWords(sentence) {
  // Split the sentence into words using a space as the delimiter
  const words = sentence.split(" ");

  // Iterate through each word and reverse it
  const reversedWords = words.map((word) => reverseWord(word));

  // Join the reversed words back together to form the reversed sentence
  const reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

function reverseWord(word) {
  // Convert the word into an array of characters, reverse it, and join it back
  return word.split("").reverse().join("");
}

// Example usage
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);
