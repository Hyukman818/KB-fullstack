function hello(name) {
  if (name === undefined) {
    return '이름을 입력하세요';
  } else return name + '님, 안녕하세요?';
}

const name1 = hello();
console.log(name1);
