// mathUtils.js

// 1. Named Export: 여러 개를 내보낼 때 사용
export const PI = 3.141592;

export function add(a, b) {
  return a + b;
}

// 2. Default Export: 이 파일의 핵심 기능을 하나만 내보낼 때 사용
// 변수 선언과 동시에 할 수 없으므로 아래와 같이 작성합니다.
const calculatorName = "My Simple Calculator";

export default calculatorName;