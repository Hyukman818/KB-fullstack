let likePizza = true;

const pizza = new Promise((resolve, reject) => {
  if (likePizza == true) {
    resolve('피자를 주문합니다'); // 성공시 resolve 에서 호출, then에서 값을 받음
  } else {
    reject('주문 안한다...'); // 실패시 reject 에서 호출, catch에서  값을 받음
  }
});

pizza.then((result) => console.log(result)).catch((err) => console.log(err));
