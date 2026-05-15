// default는 중괄호 없이, named는 중괄호 { } 안에 가져옵니다.
import calcName from './mathUtils.js'; 
import { PI, add } from './mathUtils.js';

const result = add(10, 20);

// HTML 화면에 결과 출력
const app = document.getElementById('app');
app.innerHTML = `
  <h1>${calcName}</h1>
  <p>원주율: ${PI}</p>
  <p>10 + 20 = ${result}</p>
`;