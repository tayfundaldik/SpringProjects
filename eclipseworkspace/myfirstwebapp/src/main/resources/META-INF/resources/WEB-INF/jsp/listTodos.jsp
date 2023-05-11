
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div>Welcome ${name}!</div>
	<hr>
	<h1>
		Your Todos
		<h1>

			<table class="table">
				<thead>
					<tr>
						<th>Description</th>
						<th>Target Date</th>
						<th>is the Job Done?</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>

							<td><a href="update-todo?id=${todo.id}">
									<button class="button-74" role="button">Update</button>
									<style>
.button-74 {
	background-color: #fbeee0;
	border: 2px solid #422800;
	border-radius: 30px;
	box-shadow: #422800 4px 4px 0 0;
	color: #422800;
	cursor: pointer;
	display: inline-block;
	font-weight: 600;
	font-size: 16px;
	padding: 0 16px;
	line-height: 50px;
	text-align: center;
	text-decoration: none;
	user-select: none;
	-webkit-user-select: none;
	touch-action: manipulation;
}

.button-74:hover {
	background-color: #fff;
}

.button-74:active {
	box-shadow: #422800 2px 2px 0 0;
	transform: translate(2px, 2px);
}

@media ( min-width : 768px) {
	.button-74 {
		min-width: 120px;
		padding: 0 25px;
	}
}
</style>
							</a></td>
							<td><a href="delete-todo?id=${todo.id}">
									<button class="button-24" role="button">Delete</button>
									<style>
.button-24 {
	background: #FF4742;
	border: 1px solid #FF4742;
	border-radius: 6px;
	box-shadow: rgba(0, 0, 0, 0.1) 1px 2px 4px;
	box-sizing: border-box;
	color: #FFFFFF;
	cursor: pointer;
	display: inline-block;
	font-family: nunito, roboto, proxima-nova, "proxima nova", sans-serif;
	font-size: 16px;
	font-weight: 800;
	line-height: 16px;
	min-height: 40px;
	outline: 0;
	padding: 16px 18px;
	text-align: center;
	text-rendering: geometricprecision;
	text-transform: none;
	user-select: none;
	-webkit-user-select: none;
	touch-action: manipulation;
	vertical-align: middle;
}

.button-24:hover, .button-24:active {
	background-color: initial;
	background-position: 0 0;
	color: #FF4742;
}

.button-24:active {
	opacity: .5;
}
</style>
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-todo">
				<button class="button-32" role="button">Add New Task</button>
				<style>
.button-32 {
	background-color: #fff000;
	border-radius: 12px;
	color: #000;
	cursor: pointer;
	font-weight: bold;
	padding: 10px 15px;
	text-align: center;
	transition: 200ms;
	width: 30%;
	box-sizing: border-box;
	border: 0;
	font-size: 16px;
	user-select: none;
	-webkit-user-select: none;
	touch-action: manipulation;
}

.button-32:not(:disabled):hover, .button-32:not(:disabled):focus {
	outline: 0;
	background: #f4e603;
	box-shadow: 0 0 0 2px rgba(0, 0, 0, .2), 0 3px 8px 0 rgba(0, 0, 0, .15);
}

.button-32:disabled {
	filter: saturate(0.2) opacity(0.5);
	-webkit-filter: saturate(0.2) opacity(0.5);
	cursor: not-allowed;
}
</style>
			</a>
</div>
<%@ include file="common/footer.jspf"%>