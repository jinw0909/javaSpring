<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX연습</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>회원 정보 추가</h1>
		<!-- <form method="post" id="userForm" action="/lesson06/add_user"> -->
			<!-- 이름, 자기소개, 생년월일, 이메일주소 -->
			<input type="text" class="form-control" id="nameInput" name="name" placeholder="이름을 입력하세요">
			<button class="btn btn-info" id="nameCheck">중복체크</button>
			<div class="text-danger" id="duplicateDiv"><small>중복되었습니다.</small></div>
			<div class="text-danger" id="availableDiv"><small>사용 가능한 id입니다.</small></div>
			<input type="text" class="form-control" id="yyyymmddInput" name="yyyymmdd" placeholder="생년월일을 입력하세요">
			<textarea class="form-control" rows="10" id="introduceInput" name="introduce"></textarea>
			<input type="text" class="form-control" id="emailInput" name="email" placeholder="이메일을 입력하세요">
			<button type="submit" class="btn btn-info" id="addBtn">추가</button>
			
		<!-- </form> -->
	</div>
	<script>
		$(document).ready(function(){
			/* $("#addBtn").on("click", function(){ */
			/* $("#userForm").on("submit", function(){
				var name = $("#nameInput").val().trim();
				var yyyymmdd = $("#yyyymmddInput").val().trim();
				var introduce = $("#introduceInput").val().trim();
				
				if (name == 'null' || name == '') {
					alert('이름을 입력하세요');
					return false;
				}
				if (yyyymmdd == 'null' || name == '') {
					alert('생년월일을 입력하세요');
					return false;
				}
				if (introduce == 'null' || name == '') {
					alert('자기소개를 입력하세요');
					return false;
				}
			}); */
			$('#addBtn').on('click', function(){
				var name = $("#nameInput").val().trim();
				var yyyymmdd = $("#yyyymmddInput").val().trim();
				var introduce = $("#introduceInput").val().trim();
				var email = $("#emailInput").val.trim();
				
				if (name == 'null' || name == '') {
					alert('이름을 입력하세요');
					return false;
				}
				if (yyyymmdd == 'null' || name == '') {
					alert('생년월일을 입력하세요');
					return false;
				}
				if (introduce == 'null' || name == '') {
					alert('자기소개를 입력하세요');
					return false;
				}
				
				$.ajax({
					type: "POST",
					url: "/lesson06/add_user",
					data: {"name": name, "yyyymmdd": yyyymmdd, "introduce": introduce, "email": email},
					success: function(data) {
						alert(data)
					},
					error: function(e) {
						alert("error" + e);
					}
				})
			});
			
			$("#nameCheck").on("click", function(){
				var name = $("#nameInput").val().trim();
				if (name == null || name == "") {
					alert("이름을 입력하세요");
					return;
				}
				
				
				$.ajax({
					type: "get",
					data: {"name": name},
					url: "/lesson06/is_duplication",
					success: function(data) {
						alert(data.isDuplication);
						if (data.isDuplication == "true") {
							$(".duplictaionDiv").addClass("d-block");
						} else {
							#(".isAvailable").addClass("d-block");
						}
					},
					error: function(e) {
						alert("error");
					}
				})
				
			}
		});
	</script>
</body>
</html>