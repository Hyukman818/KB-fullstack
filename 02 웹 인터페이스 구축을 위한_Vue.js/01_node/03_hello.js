
// 매개변수에 기본값을 설정한 경우
// => hello 함수 호출할때 인자에 아무것도 없으면 '이름없음'을 출력함
function hello(name='이름없음') {
    return name + '님, 안녕하세요?';
  }
  
  const name1 = hello();
  console.log(name1);
  