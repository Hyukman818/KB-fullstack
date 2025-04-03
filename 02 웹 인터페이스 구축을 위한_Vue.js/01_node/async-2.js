function displayA() {
  console.log('A');
}
function displayB(callback) {
  // 콜백함수 이용할거임
  setTimeout(() => {
    // 2초 후에 위에서부터 차례대로 실행하는 함수 -> 2000ms
    console.log('B');
    callback();
  }, 2000);
}
function displayC() {
  console.log('C');
}
displayA();
displayB(displayC); // displayB 함수의 인자는 콜백이니까 안에 들어가서 콜백하면됨
