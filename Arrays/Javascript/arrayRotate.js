//question no 1
//Program for array rotation
//link :- https://www.geeksforgeeks.org/array-rotation/

function rotateByOne(arr, n) {
  var temp = arr[0];
  for (var i = 0; i < n - 1; i++) {
    arr[i] = arr[i + 1];
  }
  arr[n - 1] = temp;

  return arr;
}

function rotate(arr, k, n) {
  var tempArray;

  for (var i = 0; i < k; i++) {
    arr = rotateByOne(arr, n);
  }

  return arr;
}

// public static void main(String args) {
var arr = [1, 2, 3, 4, 5, 6, 7];
var abc = rotate(arr, 7, arr.length);

for (var i = 0; i < abc.length; i++) {
  console.log(arr[i]);
}
// }
