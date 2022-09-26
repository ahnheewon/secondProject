<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>공지사항 등록</h1>
		</div>
		<div>
									<!-- 파일 업로드 하니까 어떤 라이브러리를 쓰든 무조건 enctype="multipart/form-data" 써야합니다. -->
			<form id="frm" action="boardInsert.yd" method="post" enctype="multipart/form-data">
				<li><a class="menuLink" href="main.yd">홈</a></li> 
				
				<div>
					<table border="1">
						<tr>
							<th width="150">작성자</th>
							<td width="150"><input type="text" id="memberId"
								name="memberId" value="${name }" readonly="readonly"></td>
								
							<th width="150">작성일자</th>
							<td width="150"><input type="date" id="boardDate"
								name="boardDate" required="required" ></td>
						</tr>

						<tr>
							<th>제목</th>
							<td colspan="3"><input type="text" id="boardTitle"
								name="boardTitle" required="required"></td>
						</tr>

						<tr>
							<th>내용</th>
							<td colspan="3"><textarea rows="10" cols="80"
									id="boardContent" name="boardContent"></textarea></td>
						</tr>

						<tr>
							<th>첨부파일</th>
							<td><input type="file" id="file" name="file"></td>
						</tr>
					</table>
				</div>
				<br>
				<div>
					<input type="submit" value="등록">&nbsp;&nbsp;&nbsp; <input
						type="reset" value="취소">&nbsp;&nbsp;&nbsp; <input
						type="button" value="목록"
						onclick="location.href='boardSelectList.yd'">&nbsp;&nbsp;&nbsp;
				</div>
			</form>

		</div>
	</div>

</body>
</html>