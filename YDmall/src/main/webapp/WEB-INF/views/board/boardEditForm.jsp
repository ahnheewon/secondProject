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

		<div><h1>게시글 수정</h1></div>
			
		<div>
		<form id="frm" action="boardEdit.yd" method="post" enctype="multipart/form-data">
		<div>
		<table border="1">
			<tr>
				<th width="100">작성자</th>
				<td width="100" align="center">${vo.boardWriter }</td>			
				<th width="100">작성일자</th>
				<td width="100" align="center">
					<input type="date" id="boardDate" name="boardDate" value="${vo.boardDate }">
				</td>
				<th width="100">조회수</th>
				<td width="100" align="center">${vo.boardHit }</td>	
			</tr>
			
			<tr>
				<th>제목</th>
				<td colspan="5" id="boardTitle">${vo.boardTitle }
				</td>
				</tr>
				
				<tr>
				<th>내용</th>	
					<td colspan="5">
						<textarea rows="10" cols="80" id="boardSubject" name="boardSubject">${vo.boardSubject }</textarea> 
					</td>
				</tr>
				
				<tr>
					<th>첨부파일</th>
					<td colspan="5">
					<input type="file" id="file" name="file" value="${vo.boardAttach}">
					</td>
				</tr>
		</table>
	</div><br>
	
	<div>
		<input type="hidden" id="boardId" name="boardId" value="${vo.boardId }">
		<input type="submit" value="수정">&nbsp;&nbsp;
		<input type="button" onclick="location.href='boardSelectList.yd'" value="목록">
		</div>
		</form>
	</div>
	
</div>
</body>
</html>