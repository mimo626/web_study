// default export는 이름을 'greet'으로 바꿔서 가져와 봅니다.
// named export인 getCurrentTime은 중괄호 안에 가져옵니다.
import greet, { getCurrentTime } from './greet.js';

const user = "개발자";

// HTML에 결과 출력
const display = document.getElementById('display');

if (display) {
  display.innerHTML = `
    <h2>${greet(user)}</h2>
    <p>현재 접속 시간: ${getCurrentTime()}</p>
  `;
}