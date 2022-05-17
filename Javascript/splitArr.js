//question no 17
//Split the array and add the first part to the end of the array
//link :-  https://www.geeksforgeeks.org/split-array-add-first-part-end/

function rotateByOne(arr, n) {
  var temp = arr[0];
  for (var i = 0; i < n - 1; i++) {
    arr[i] = arr[i + 1];
  }
  arr[n - 1] = temp;

  return arr;
}

function split(arr, n, k) {
  var tempArray;

  for (var i = 0; i < k; i++) {
    arr = rotateByOne(arr, n);
  }

  return arr;
}

var arr = [12, 10, 5, 6, 52, 36];
var abc = split(arr, arr.length, 2);

for (var i = 0; i < abc.length; i++) {
  console.log(arr[i]);
}
