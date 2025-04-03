// function displayA() {
//   console.log('A');
// }
// function displayB() {
//   setTimeout(() => {
//     // 2초 뒤에 B출력하면 되니까 뭐 따질거없이 timeout 안에 콘솔만 써주면 됨
//     console.log('B');
//   }, 2000);
// }
// function displayC() {
//   console.log('C');
// }
// displayA();
// displayB();
// displayC();





// 2초 경과 후 문제
// function displayA() {
//   console.log('A');
// }
// function displayB(callback) {
//   setTimeout(() => {
//     console.log('B');
//     callback();
//   }, 2000);
// }
// function displayC() {
//   console.log('C');
// }
// displayA();
// displayB(displayC);
