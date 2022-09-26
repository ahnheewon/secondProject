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
			<h3>공지사항</h3>
		</div>
		<div>
			<table border="1">
				<tr>
					<th width="100">작성자</th>
					<td width="100" align="center">${vo.memberId }</td>
					<th width="100">작성일</th>
					<td width="100" align="center">${vo.boardDate }</td>
					<th width="100">조회수</th>
					<td width="100" align="center">${vo.boardHit }</td>
				</tr>

				<tr>
					<th>제목</th>
					<td colspan="5">${vo.boardTitle }</td>
				</tr>

				<tr>
					<th>내용</th>

					<td colspan="5" height="150">${vo.boardContent }</td>
				</tr>

			</table>
		</div>
		<br>

		<div>
				<button type="button" onclick="subCall('E')">수정</button>&nbsp;&nbsp;
				<button type="button" onclick="subCall('D')">삭제</button>&nbsp;&nbsp;
	
			<button type="button" onclick="location.href='noticeSelectList.yd'">목록</button>
		</div>
	</div>
	<div>
		<form id="frm" method="post">
			<input type="hidden" id="id" name="id" value="${vo.boardId }">
		</form>
	</div>

	<script type="text/javascript">
		function subCall(str) {
			if (str == 'E') {
				frm.action = "boardEditForm.yd"; //수정
			} else if (str == 'D'){
				frm.action = "boardDelete.yd"; //삭제
			}
			frm.submit();
		}
	</script>

</body>
</html>