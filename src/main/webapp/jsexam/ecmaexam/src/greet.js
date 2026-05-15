// 함수 선언과 동시에 default export 하기(이름이 있어도 되고, 없어도 상관없음)
export default function sayHello(user) {
  return `안녕하세요, ${user}님! 오늘도 즐거운 코딩 하세요! 🚀`;
}

// 참고: 만약 별도의 유틸 함수가 더 필요하다면 Named export도 섞어 쓸 수 있음
export const getCurrentTime = () => new Date().toLocaleTimeString();