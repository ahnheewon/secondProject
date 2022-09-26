<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">

		<div>
			<h1>게시판목록 원본</h1>
		</div>
		<div>
			<table border="1">

				<thead>
					<tr>
						<th width="70">글번호</th>
						<th width="250">제목</th>
						<th width="150">작성자</th>
						<th width="150">작성일자</th>
						<th width="150">첨부파일</th>
						<th width="70">조회수</th>
					</tr>
				</thead>

				<tbody>
					<c:if test="${empty list}">
						<tr>
							<td colspan="6" align="center">게시글이 존재하지 않습니다.</td>
						</tr>
					</c:if>
					<c:if test="${not empty list }">
						<c:forEach items="${list }" var="n">
							<tr onMouseover="this.style.backgroundColor='yellow';"
								onMouseout="this.style.backgroundColor='white';"
								onclick="selectBoard('${n.boardId }')">
								<td align="center">${n.boardId }</td>
								<td>${n.boardTitle }</td>
								<td align="center">${n.memberId }</td>
								<td align="center">${n.boardDate }</td>
								<td>${n.boardAttach }</td>
								<td align="center">${n.boardHit }</td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</div>
		<br>

		<div>
			<form id="frm" action="boardSelect.yd" method="post">
				<input type="hidden" id="id" name="id">
				<c:if test="${not empty id}">
					<!-- id가 존재하면(not empty) 버튼이 보이도록 한거임.  -->
					<button type="button" onclick="location.href='boardWriteForm.yd'">글쓰기</button>
				</c:if>
				<li><a class="menuLink" href="main.yd">홈</a></li>
			</form>
		</div>
	</div>


	<script type="text/javascript">
	
	function selectBoard(id) {
		document.getElementById("id").value=id;
		frm.submit();
	}
	</script>

</body>
</html>