//question no 4
//Program to cyclically rotate an array by one

//link :- https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/

// public class rightRotate {

function rotateByOne(arr, n) {
  var temp = arr[n - 1];
  for (var i = n - 1; i > 0; i--) {
    var tempvar = arr[n - 1];
    arr[i] = arr[i - 1];
  }
  arr[0] = temp;

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
var abc = rotate(arr, 2, arr.length);

for (var i = 0; i < abc.length; i++) {
  console.log(arr[i]);
}
// }
// }
