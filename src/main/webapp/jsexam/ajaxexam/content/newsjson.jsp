<%@ page language="java" contentType="application/json; charset=UTF-8"%>
<% String news[] = { "낮 최고 36도 '찜통더위' 계속…제주도는 비 소식",
		"33년만에 전반기 가장 높은 곳에 오른 독수리",
		"650마력 '악동' 전기차....현대차 '아이오닉 6N' 베일 벗었다",
  	    "일론 머스크 xAI, 차세대 AI 모델 '그록4' 공개",
		"독하게 더운 여름, 우크라-가자 전쟁 탓에 지구 더 뜨거워졌다",
		"삼성전자 “두 번 접는 폰 연내 출시… 갤럭시 4억대에 AI 탑재”",
		"해수부 부산 이전 청사로 ‘동구 소재 IM빌딩’ 확정"};%>
<% response.setHeader("Cache-Control", "no-cache"); %>
<% int num = (int)(Math.random() * 7);%>
{ 
	"news" : "<%= news[num] %>"
}