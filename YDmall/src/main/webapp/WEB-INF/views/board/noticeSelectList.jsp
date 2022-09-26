<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Tables</title>

<style type="text/css">
#content-wrapper {
	margin-left: auto;
	margin-right: auto;
}
</style>

</head>

<body id="page-top">

	<!-- Page Wrapper -->




	<!-- Content Wrapper -->
	<div id="content-wrapper" class="d-flex flex-column"
		style="width: 1200px">

		<!-- Main Content -->
		<div id="content">

			<!-- Topbar -->
			<nav
				class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

				<!-- Sidebar Toggle (Topbar) -->
				<form class="form-inline">
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>
				</form>

				<!-- Topbar Search -->


				<!-- Topbar Navbar -->
				<ul class="navbar-nav ml-auto">

					<!-- Nav Item - Search Dropdown (Visible Only XS) -->
					<li class="nav-item dropdown no-arrow d-sm-none"><a
						class="nav-link dropdown-toggle" href="#" id="searchDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
					</a> <!-- Dropdown - Messages -->
						<div
							class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
							aria-labelledby="searchDropdown"></div></li>

					<!-- Nav Item - Alerts -->

					<!-- Nav Item - Messages -->




					<!-- Nav Item - User Information -->

				</ul>

			</nav>
			<!-- End of Topbar -->

			<!-- Begin Page Content -->
			<div class="container-fluid">

				<!-- Page Heading -->
				<h1 class="h3 mb-2 text-gray-800">공지사항</h1>
				<p class="mb-4">
					<a target="_blank" href="https://google.com"> [누르면 링크]</a>
				</p>

				<!-- DataTales Example -->
				<div class="card shadow mb-4">
					<div class="card-header py-3">
						<h6 class="m-0 font-weight-bold text-primary">공지일지도</h6>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-bordered" id="dataTable" width="100%"
								cellspacing="0">
								<thead>
									<tr>
										<th>번호</th>
										<th>제목</th>
										<th>작성자</th>
										<th>작성일</th>
										<th>조회수</th>

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
												onclick="selectNotice('${n.boardId }')">
												<td align="center" id="id">${n.boardId }</td>
												<td>${n.boardTitle }</td>
												<td align="center">${n.memberId }</td>
												<td align="center">${n.boardDate }</td>
												<td align="center">${n.boardHit }</td>
												<td align="center" type="hidden">${n.boardRole }</td> <!-- 게시판 타입 -->
											</tr>
										</c:forEach>
									</c:if>
								</tbody>
			<div>
			<form id="frm" action="noticeSelect.yd" method="post">
				<button type="button" onclick="location.href='noticeWriteForm.yd'" style="float: right">글쓰기</button>
			</form>
		</div>
							</table>
						</div>
					</div>
				</div>


			</div>
			<!-- /.container-fluid -->

		</div>
		<!-- End of Main Content -->

		<!-- Footer -->

		<!-- End of Footer -->

	</div>
	<!-- End of Content Wrapper -->


	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
		
		<script type="text/javascript">
	
	function selectNotice(id) {
		document.getElementById("id").value=id;
		frm.submit();
	}
	</script>
		
		
</body>
</html>