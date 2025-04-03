let base = 100;
const add = (x) => base + x;
const multiply = (x) => base * x;
const getBase = () => base;

export { add, multiply };
export default getBase; // 얘가 꼭 있어야 코드가 돌아가네...
