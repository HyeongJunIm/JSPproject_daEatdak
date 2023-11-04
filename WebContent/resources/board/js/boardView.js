//게시판 댓글


//댓글 등록
$('.comment-write').on('click', '.comment-write-btn', function() {
	let content = $('.replyBox').val();
	let userNum = $('.userNum').val();
	let boardNum = $('.boardNum').val();

	console.log("유저넘버:" + userNum);
	console.log("게시넘버:" + boardNum);
	console.log("댓글내용: " + content);

	if (!(content)) {
		alert('내용을 입력해주세요');
		return;
	};

		$.ajax({

			url: '/board/boardReplyOk.bo',
			type: 'get',
			data: {
				userNum: userNum,
				boardNum: boardNum,
				commentContent: content

			},
			success: function(result) {

			}, error: function(a, b, c) {
				console.error(c);
			}


		})
	
	$('.replyBox').val('');



})
//댓글 리스트 불러오기
function getListReply(replyList.boardNum, callback) {
	$.ajax({

		url: '/board/getBoardReply.bo',
		type: 'get',
		dataType: 'Json',
		success: function(result) {
			console.log(result.replyList);


			if (callback) {
				callback(result);
			}

		}, error: function(a, b, c) {
			console.error(c);
		}

	});
}


function showReply(result) {
	let text = '';

	result.replyList.forEach(r => {

		text += `
        
        		<div class="admin-name">관리자1</div>
                  <div class="admin-comment">답변내용이 들어갑니다</div>
                  <div class="comment-btn-container">
                    <a href="#" class="comment-fix-btn">수정</a>
                    <a href="#" class="comment-del-btn">삭제</a>
                </div>
          
            `;
	})

	let replyLoca = $('.comment-write');
	replyLoca.text(text);

}















