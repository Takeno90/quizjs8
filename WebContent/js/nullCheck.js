/**
 * 選択されていないときにアラート
 */
<!--
function check() {
	let flag = 0;
	//check
	for (let i = 0; i < document.form.choice.length; i++) {
		if (document.form.choice[i].checked) {
			flag = 1;
			break;
		}
	}

	if (flag == 0) {
		window.alert('選択されていません');
		return false;//送信中止
	} else {
		return true;
	}

}
//-->