var obj = { result: 0 };
obj.add = function (x, y) {
  const inner = () => {
    this.result = x + y;
  }; // 화살표 함수 쓰라는거구나~
  inner();
};
obj.add(3, 4);

console.log(obj); // { result: 7 }
