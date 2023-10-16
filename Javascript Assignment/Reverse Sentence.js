// Function to reverse every word in a sentence
function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');
  
    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
      return word.split('').reverse().join('');
    });
  
    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  // Get user input
  const userInput = prompt('Enter a sentence:');
  
  // Reverse the words in the user's input
  const reversedInput = reverseWordsInSentence(userInput);
  
  // Display the reversed sentence
  console.log('Reversed sentence: ' + reversedInput);
  