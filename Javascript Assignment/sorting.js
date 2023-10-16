// Get user input as a comma-separated list of numbers
const userInput = prompt('Enter a list of numbers separated by commas:');

// Split the input into an array of numbers
const numbers = userInput.split(',').map(Number);

// Sort the array in descending order
numbers.sort(function(a, b) {
  return b - a;
});

// Display the sorted array
console.log('Sorted array in descending order: ' + numbers);
