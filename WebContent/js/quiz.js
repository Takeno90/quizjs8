/**
 *問題文、選択肢表示、正誤判定、結果表示
 */
let question = 'StringBuilserの文字列連結はどれ？'
let answers = [
	'add',
	'concat',
	'insert',
	'append'
];
const correct = 'append';
const $button = document.getElementsByTagName('button');
//表示
const setupQuiz = () => {
	document.getElementById('js_question').textContent = question;
	for (let i = 0; i < $button.length; i++) {
		$button[i].textContent = answers[i];
	}
};
setupQuiz();

//正誤判定ロジック
const clickHandler = (e) => {
	if (correct === e.target.textContent) {
		window.alert('正解');
	} else {
		window.alert('不正解');
	}
};

//正誤判定実行
for (let i = 0; i < $button.length; i++) {
	$button[i].addEventListener('click', (e) => {
		clickHandler(e);
	});
}



