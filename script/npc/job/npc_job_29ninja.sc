//====================================================================
//Ragnarok Online Ninja Jobchange Script
//　■ CHANGE_NJ -> 0〜4
//====================================================================

//==========================================
// ショップ
//------------------------------------------
que_ng.gat,73,26,5	shop	ブンレイ	83,2117,2171,15053,7521,7522,7523,7524,6512,6513,6514,6515
que_ng.gat,72,31,3	shop	ブンジ		83,13250,13251,13252,13253,13254,6493
prontera.gat,178,244,3	shop	アマツ貿易商人	83,13250,13251,13252,13253,13254,6493,2117,2171,15053,7521,7522,7523,7524,6512,6513,6514,6515

//==========================================
// 案内員
//------------------------------------------
alberta.gat,30,65,3	script	アカギ	730,{
	if(Job == Job_Ninja) {
		mes "[アカギ]";
		mes "元気にしているか？";
		mes "任務はいつ、どこで";
		mes "与えられるかわからない。";
		mes "修練を怠るな。";
		close;
	}
	if(Job != Job_Novice || Upper != UPPER_NORMAL) {
		mes "[アカギ]";
		mes "私は貴様に興味がない。";
		mes "去れ。";
		close;
	}
	if(JobLevel < 10) {
		mes "[アカギ]";
		mes "ここは貴様のような";
		mes "力の無いものが";
		mes "来る所ではない。";
		close;
	}
	mes "[アカギ]";
	mes "ぬ……";
	mes "このような暗き路地に来るとは……";
	mes "恐らく、貴様の持つ";
	mes "何かがここへ導いたのだ。";
	mes "貴様……";
	mes "忍の道に進む気はあるか？";
	next;
	if(select("いやです","はい、行きます")==1) {
		mes "[アカギ]";
		mes "そうか……";
		mes "…………";
		mes "ならば他に言うことは無い。";
		close;
	}
	mes "[アカギ]";
	mes "良かろう。";
	mes "では、貴様を送ってやろう。";
	close2;
	switch(rand(3)) {
	case 0:
		warp "amatsu.gat",170,229;
		end;
	case 1:
		warp "amatsu.gat",216,188;
		end;
	case 2:
		warp "amatsu.gat",178,164;
		end;
	}
}

alberta.gat,168,138,3	script	船長	99,{
	if(Job != Job_Novice || Upper != UPPER_NORMAL || JobLevel < 10) {
		mes "[船長]";
		mes "……うむ！";
		mes "今日も快晴！";
		mes "船旅日和であるな！";
		close;
	}
	mes "[船長]";
	mes "……うむ！";
	mes "今日も快晴！";
	mes "船旅日和であるな！";
	next;
	menu "何をしてるのですか？",-;
	mes "[船長]";
	mes "忍者になる為に海を渡り、";
	mes "アマツに行きたいと言う";
	mes "ノービスを待っているのである！";
	next;
	mes "[船長]";
	mes "ん？";
	mes "よく見るとお主も";
	mes "ノービスであるな？";
	next;
	mes "[船長]";
	mes "忍者に興味はないかね？";
	mes "今なら、たったの200Zenyで";
	mes "アマツまで送ろうではないか！";
	next;
	if(select("興味ありません","お願いします") == 1) {
		mes "[船長]";
		mes "ふむ……";
		mes "では、気が変わったら";
		mes "いつでも来てくれ！";
		close;
	}
	if(Zeny < 200) {
		mes "[船長]";
		mes "……？";
		mes "残念だが、お金が足りないようだ。";
		mes "お金を用意して出直してくれ！";
		close;
	}
	mes "[船長]";
	mes "そうこなくては！";
	mes "では、今すぐ出航である！";
	close2;
	set Zeny,Zeny-200;
	warp "amatsu.gat",113,127;
	end;
}

//==========================================
// 試験申請
//------------------------------------------
que_ng.gat,30,65,3	script	クウガ・カイ	730,{
	if(Job == Job_Ninja || Job == Job_Kagerou || Job == Job_Oboro) {
		mes "[クウガ・カイ]";
		mes "元気にしているか？";
		mes "任務はいつ、どこで";
		mes "与えられるかわからない。";
		mes "修練を怠るな。";
		next;
		mes "[クウガ・カイ]";
		mes "――そうだな、修練を行うのに";
		mes "いい場所を知っている。";
		mes "忍者になったあと、";
		mes "冒険者アカデミーと";
		mes "呼ばれる場所へ";
		mes "行ったことはあるか？";
		next;
		mes "[クウガ・カイ]";
		mes "忍者になった後に、行ったことが";
		mes "無いなら、この建物を出た所に";
		mes "冒険者アカデミーのサポートを";
		mes "行っている者がいるはずだ。";
		mes "送ってもらうとよい。";
		close;
	}
	if(Upper == Upper_BABY) {
		mes "[クウガ・カイ]";
		mes "な！";
		mes "こんな所に子供が……";
		mes "バカな……";
		mes "我が技術は、子供に見つかる程度の";
		mes "レベルだったのか……";
		close;
	}
	if(Job != Job_Novice || Upper == Upper_HIGH) {
		mes "[クウガ・カイ]";
		mes "何だ貴様！";
		mes "どこから来たか知らんが、";
		mes "貴様に用はない。";
		mes "はやく俺の前から消えろ。";
		close;
	}
	if(JobLevel < 10) {
		mes "[クウガ・カイ]";
		mes "まだまだ修練が足りん！";
		mes "出直してこい！";
		mes "まずはJobレベルを10にしてくるのだ！";
		mes "しかるのち、^0000FF「基本スキル」の";
		mes "レベルを9　^000000にする！";
		next;
		mes "[クウガ・カイ]";
		mes "^0000FF「基本スキル」^000000のレベルは";
		mes "^0000FF「スキルリスト」^000000ウィンドウで";
		mes "上げることができるぞ。";
		mes "^0000FF「スキルリスト」^000000ウィンドウは";
		mes "^0000FF「基本情報」^000000ウィンドウ内の";
		mes "^0000FF「Skill」^000000ボタンで表示される。";
		next;
		mes "[クウガ・カイ]";
		mes "スキルのレベルを上げるには、";
		mes "スキルポイントを割り振った後、";
		mes "^FF0000「確定」^000000ボタンが必要となる。";
		mes "注意が必要だ。";
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	switch(CHANGE_NJ) {
	case 0:
		mes "[" +strcharinfo(0)+ "]";
		mes "もしもし？";
		next;
		mes "[クウガ・カイ]";
		mes "……む？";
		mes "ナ、ナニイィッ！";
		mes "貴様、いつのまに！";
		next;
		mes "[クウガ・カイ]";
		mes "トリヤャ！";
		next;
		mes "‐男はいきなり何かを投げつけてきた‐";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "わ！";
		mes "あ、あぶない！";
		mes "何するんですか！";
		next;
		mes "[クウガ・カイ]";
		mes "ぬ……？";
		mes "どうやら俺を殺しに来た";
		mes "刺客ではないようだな。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "何ですかそれ！";
		mes "勘違いで攻撃されちゃ";
		mes "たまったもんじゃありませんよ！";
		next;
		mes "[クウガ・カイ]";
		mes "くそ！";
		mes "俺の永遠のライバル、";
		mes "野羊の奴め！";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "………………";
		next;
		mes "[クウガ・カイ]";
		mes "うぉぉぉぉぉ！";
		mes "ハッ！　サイヤ！";
		mes "タリャァー！";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "‐何も聞いていないようだ‐";
		next;
		mes "[クウガ・カイ]";
		mes "む……？";
		mes "ぬぁ！";
		mes "貴様、まだいたのか！";
		mes "テイッ！　ハッハッ！　ヤ！";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "わわわわわわ！";
		mes "もうやめてください！";
		mes "それに、今の技は……";
		next;
		mes "[クウガ・カイ]";
		mes "ぬぬぬぬぬ……";
		mes "なかなかやるな。";
		mes "我が術を全てよけるとは……";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "‐何なんだこの人……‐";
		next;
		mes "[クウガ・カイ]";
		mes "む……そうだ。";
		mes "そういえば貴様、";
		mes "俺に何か用でもあるのか？";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "………………";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "え……あ……";
		mes "はい。";
		mes "忍者に転職したくて";
		mes "ここに来ました。";
		next;
		mes "[クウガ・カイ]";
		mes "ほほぅ……";
		mes "よい心がけではないか。";
		mes "だが！　しかし！";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "…………";
		next;
		mes "[クウガ・カイ]";
		mes "貴様はまだ忍者になれん。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "……なぜですか？";
		next;
		mes "[クウガ・カイ]";
		mes "俺は貴様の事を何一つ知らん。";
		mes "だから信用できん。";
		mes "さらに、俺の目によると";
		mes "忍者として生きるには";
		mes "貴様は経験不足だ！";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "………………";
		next;
		mes "[クウガ・カイ]";
		mes "……だが……";
		mes "忍者になれんこともない。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "………………";
		next;
		mes "[クウガ・カイ]";
		mes "見ての通り、俺は";
		mes "とても忙しい身だ。";
		next;
		mes "[クウガ・カイ]";
		mes "それに、俺の周りには";
		mes "敵が多い。";
		mes "そう簡単には動けん。";
		next;
		mes "[クウガ・カイ]";
		mes "そして、俺は奴との決闘のために";
		mes "修練を積まなければならない。";
		mes "タァリャァー！";
		next;
		mes "[クウガ・カイ]";
		mes "次は必ず勝つ！";
		mes "待ってろよ、野羊！";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "野羊？";
		mes "羊と戦うんですか？";
		next;
		mes "[クウガ・カイ]";
		mes "え？";
		mes "あぁ、ハッハッハッハ。";
		mes "野羊はニックネームだ。";
		mes "相手は人間だよ。";
		next;
		mes "[クウガ・カイ]";
		mes "抜け目が無い奴だ。";
		mes "勝つためには手段を";
		mes "選ばない。";
		mes "しかも、奴が使う";
		mes "忍術は妙に強い。";
		next;
		mes "[クウガ・カイ]";
		mes "だが、奴も俺も";
		mes "ちょうど手裏剣とクナイが";
		mes "切れていてな。";
		mes "まともに戦えない状態だ。";
		mes "ハハハ。";
		next;
		mes "[クウガ・カイ]";
		mes "そういえば貴様。";
		mes "本当に忍者になりたいのなら";
		mes "任務を一つくれてやろう。";
		mes "もし任務が成功したら";
		mes "俺が忍者の技術を教えてやる。";
		mes "どうだ？";
		next;
		if(select("承諾する","断る")==2) {
			mes "[" +strcharinfo(0)+ "]";
			mes "技術だけいくら学んでも";
			mes "しょうがないです。";
			mes "すみませんが、";
			mes "他の人に頼んでください。";
			next;
			mes "[クウガ・カイ]";
			mes "ぬ……そうか。";
			mes "わかった。";
			mes "俺の無駄骨だったようだな。";
			mes "さぁ、用がないなら";
			mes "早く出て行くんだ。";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "うーん……";
		mes "わかりました。";
		next;
		mes "[クウガ・カイ]";
		mes "そうか。";
		mes "では、この手紙を";
		mes "野羊という奴に";
		mes "届けてくるんだ。";
		next;
		mes "[クウガ・カイ]";
		mes "内容を大まかに言うと、";
		mes "お互いに用意が整うまで、";
		mes "一時休戦しようというものだ。";
		mes "必ず返事をもらって来るように。";
		next;
		mes "[クウガ・カイ]";
		mes "俺の情報によると、";
		mes "奴はアインブロックへ";
		mes "行ったらしい。";
		mes "何故そこに行ったのかは";
		mes "わからんが……";
		next;
		mes "[クウガ・カイ]";
		mes "奴は変装も上手い。";
		mes "探し出すのは困難だろう。";
		next;
		mes "[クウガ・カイ]";
		mes "だが、一つ心当たりがある。";
		mes "奴は高い所が好きなんだ。";
		mes "そういった場所を";
		mes "よく探してみるといいだろう。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "了解です。";
		mes "では、行ってきます！";
		set CHANGE_NJ,1;
		setquest 6015;
		close;
	case 1:
		mes "[クウガ・カイ]";
		mes "ぬ……";
		mes "そう急な任務ではないが、";
		mes "貴様にとっては";
		mes "急いだほうがいいだろう。";
		next;
		mes "[クウガ・カイ]";
		mes "野羊がいつまで";
		mes "アインブロックにいるかは";
		mes "わからないからな。";
		close;
	case 2:
		mes "[クウガ・カイ]";
		mes "返事を忘れずに";
		mes "受け取ってくるんだぞ。";
		close;
	case 3:
		mes "[クウガ・カイ]";
		mes "返事はもらってきたか？";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "はい、ここに。";
		next;
		mes "[クウガ・カイ]";
		mes "よし、さっそく読むとしよう。";
		mes "‐ゴソゴソ……‐";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "‐私が持ってきた手紙を";
		mes "読んでいる‐";
		next;
		mes "[クウガ・カイ]";
		mes "な、なんだと！";
		mes "休戦はしないだと!?";
		mes "まさか……";
		mes "もうクナイを作ったのか！";
		mes "くそ……こうしてはいられん。";
		next;
		mes "[クウガ・カイ]";
		mes "悪いがもう一つ任務だ。";
		mes "奴との決闘に必要な";
		mes "武器を作らなければならない。";
		mes "材料が不足しているんだ。";
		next;
		mes "[クウガ・カイ]";
		mes "もし材料を集めてきたら、";
		mes "貴様の能力を認めて";
		mes "忍者にしてやる！";
		next;
		mes "[クウガ・カイ]";
		mes "集めてくる材料は、";
		mes "プラコン1個、鉄鉱石30個。";
		mes "時間が無いから";
		mes "急いでくれ。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "……あッ！";
		mes "それって！";
		next;
		mes "[クウガ・カイ]";
		mes "どうした？";
		mes "何の問題でもあるのか？";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "その材料は、";
		mes "私がヒョウさんに渡して……";
		next;
		mes "[クウガ・カイ]";
		mes "なにぃ!?";
		mes "では、貴様はあいつの手伝いを";
		mes "したというのか！";
		mes "こ、ここここここ";
		mes "このうっかり者！";
		mes "あほ！　まぬけ！";
		next;
		mes "[クウガ・カイ]";
		mes "……いや……";
		mes "これはいいキッカケか……";
		next;
		mes "[クウガ・カイ]";
		mes "とにかく、奴を手伝った以上、";
		mes "お前には絶対に俺の手伝いも";
		mes "してもらうからな！";
		mes "さぁ、はやく行くんだ！";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "え……あ……はい！";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "‐プラコン1個と鉄鉱石30個を";
		mes "探してこよう‐";
		set CHANGE_NJ,4;
		chgquest 6017,6018;
		close;
	case 4:
		if(countitem(1010) < 1 || countitem(1002) < 30) {
			mes "[クウガ・カイ]";
			mes "プラコン1個と鉄鉱石30個を";
			mes "持ってくるように。";
			mes "急いでくれ。";
			close;
		}
		if(getskilllv(1) < 9) {
			mes "[クウガ・カイ]";
			mes "基本となるスキルを";
			mes "全て覚えてこい。";
			mes "^0000FF「基本スキル」のレベルを9　^000000に";
			mes "する必要があるのだ。";
			next;
			mes "[クウガ・カイ]";
			mes "^0000FF「基本スキル」^000000のレベルは";
			mes "^0000FF「スキルリスト」^000000ウィンドウで";
			mes "上げることができるぞ。";
			mes "^0000FF「スキルリスト」^000000ウィンドウは";
			mes "^0000FF「基本情報」^000000ウィンドウ内の";
			mes "^0000FF「Skill」^000000ボタンで表示される。";
			next;
			mes "[クウガ・カイ]";
			mes "スキルのレベルを上げるには、";
			mes "スキルポイントを割り振った後、";
			mes "^FF0000「確定」^000000ボタンが必要となる。";
			mes "注意が必要だ。";
			close2;
			cutin "start_020_jp.bmp",4;
			end;
		}
		mes "[クウガ・カイ]";
		mes "手に入れてきたか！";
		mes "意外と早かったな。";
		next;
		mes "[クウガ・カイ]";
		mes "……よし。";
		mes "どうやら決闘には間に合いそうだ。";
		mes "思ったより貴様は有能だな。";
		next;
		mes "[クウガ・カイ]";
		mes "良いだろう。";
		mes "約束通り、貴様を正式に";
		mes "忍者へ転職させてやる。";
		next;
		mes "[クウガ・カイ]";
		mes "まずは、正式に名乗ろう。";
		mes "俺の名はカイ。";
		mes "抜け忍となった元頭領、";
		mes "カズマ様を探す捜索部隊長の";
		mes "任を与えられている。";
		next;
		mes "[クウガ・カイ]";
		mes "実は今、我ら忍者の";
		mes "内部事情は複雑になっている。";
		mes "そのため、新人の貴様は、";
		mes "どの部隊にも配属されない。";
		next;
		mes "[クウガ・カイ]";
		mes "だが、野羊の手紙には、";
		mes "貴様を高く評価している文がある。";
		mes "俺からの任務もよくこなしたと思う。";
		mes "俺は貴様に期待しているのだ。";
		next;
		mes "[クウガ・カイ]";
		mes "忍者は孤独な職業だ。";
		mes "任務を一番と重要視するが、";
		mes "決して感情を失ってはいけない。";
		next;
		mes "[クウガ・カイ]";
		mes "そんなお前に、";
		mes "これからは多くの困難が襲うだろう。";
		mes "だが、我ら忍者は多くの者に";
		mes "自分の正体を隠して行動している。";
		mes "人に頼ってはならない。";
		next;
		mes "[クウガ・カイ]";
		mes "そして、忍者の武器は";
		mes "非常に危険だ。";
		mes "扱いは気を付けるように。";
		next;
		mes "[クウガ・カイ]";
		mes "では、貴様を正式に";
		mes "我ら忍者の一員と認める。";
		next;
		mes "[クウガ・カイ]";
		mes "風のように早く！";
		mes "風のように舞う！";
		mes "その身は軽く、飛翔する！";
		next;
		mes "[クウガ・カイ]";
		mes "トゥアッ！";
		next;
		getitem 13010,1;
		delitem 1010,1;
		delitem 1002,30;
		unequip;
		jobchange Job_Ninja;
		set CHANGE_NJ,0;
		chgquest 6018,50495;
		getitem 11046,1;
		mes "[クウガ・カイ]";
		mes "そして、これを受け取るがいい。";
		mes "阿修羅という刀と忍者の書だ。";
		mes "忍者の書は";
		mes "忍者の修行方法について";
		mes "書かれた指南書だ。";
		mes "これを読んで修行するのだ。";
		close;
	}
OnInit:
	waitingroom "転職",0;
	end;
}

//==========================================
// 転職試験
//------------------------------------------
einbroch.gat,184,194,3	script	青年	881,{
	if(Job == Job_Ninja || Job == Job_Kagerou || Job == Job_Oboro) {
		mes "[ヒョウ]";
		mes "忍者になれましたね。";
		mes "これから、多くの困難が";
		mes "あなたに襲い掛かります。";
		mes "修練を怠らないでください。";
		close;
	}
	switch(CHANGE_NJ) {
	case 0:
		mes "[青年]";
		mes "わぁ……";
		mes "ここはとても高いですね。";
		mes "色んな国を見てきましたが、";
		mes "こんなに高い所は初めてです。";
		next;
		mes "[青年]";
		mes "でも、こんなに高くても、";
		mes "見れる景色は美しい自然";
		mes "じゃないというのが";
		mes "本当に残念です。";
		close;
	case 1:
		mes "[青年]";
		mes "ふぅ〜ここは本当に高いですね。";
		mes "私は色々な国を旅行して来ましたが、";
		mes "こんなに高い建物は初めてです。";
		mes "……でも、美しさは";
		mes "私の故郷の方がダントツです。";
		next;
		mes "[青年]";
		mes "私が住んだ所は、";
		mes "静かで、空気がきれいで、";
		mes "海がとても白かったです。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "もしかして、アマツ？";
		next;
		mes "[青年]";
		mes "……いえ。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "あれ？";
		mes "……じゃあ……";
		mes "イズルードですか？";
		next;
		mes "[青年]";
		mes "そうです。";
		mes "私はイズルード出身です。";
		next;
		mes "[青年]";
		mes "少し事情があって、";
		mes "鉱物がたくさん取れるという";
		mes "この国に来たんです。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "そうなんですか……";
		mes "あ、野羊という人を";
		mes "知りませんか？";
		mes "アマツから来た忍者で、";
		mes "探しているんです。";
		next;
		mes "[青年]";
		mes "いえ、そんな名前は初耳です。";
		mes "でも、どうしても";
		mes "その人に会わなければならない";
		mes "理由があるみたいですね。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "はい。";
		mes "その人にこの手紙を渡して、";
		mes "返事を受け取ってくる。";
		mes "それが、私が忍者に";
		mes "なれる第一歩になるんです。";
		next;
		mes "[青年]";
		mes "うーん……";
		mes "……そういえば……";
		mes "旅行客みたいな服装をした人を";
		mes "ここで見た気がします。";
		next;
		mes "[青年]";
		mes "よかったらお手伝いしましょうか？";
		mes "ただ、私もここには仕事で";
		mes "来ているので、まずは";
		mes "そちらが先決ですが。";
		next;
		mes "[青年]";
		mes "もし私の仕事を";
		mes "手伝ってくれたら、";
		mes "あなたの人探しを";
		mes "お手伝いしますが？";
		next;
		if(select("いえ、一人で探してみます","はい、お手伝いさせてください")==1) {
			mes "[青年]";
			mes "そうですか。";
			mes "がんばってください。";
			mes "もし、私の助けが必要になったら";
			mes "いつでも声をかけてください。";
			close;
		}
		mes "[青年]";
		mes "ありがとうございます。";
		mes "では、まず私の仕事から";
		mes "お願いします。";
		next;
		mes "[青年]";
		mes "私はある鉱物を探しに";
		mes "ここに来ました。";
		mes "鉄鉱石30個、プラコン1個。";
		mes "これらが見つかると";
		mes "ありがたいです。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "‐プラコン1個と";
		mes "鉄鉱石30個を探してこよう‐";
		set CHANGE_NJ,2;
		chgquest 6015,6016;
		close;
	case 2:
		if(countitem(1010) < 1 || countitem(1002) < 30) {
			mes "[青年]";
			mes "プラコン1個と鉄鉱石30個です。";
			mes "急いでいませんから、";
			mes "正確な数を持ってきてください。";
			close;
		}
		mes "[青年]";
		mes "持ってきてくださいましたか。";
		mes "ありがとうございます。";
		mes "今度は私があなたの";
		mes "お手伝いをする番ですね。";
		next;
		mes "[青年]";
		mes "では、その手紙を私にください。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "？";
		next;
		mes "[青年]";
		mes "どうしました？";
		mes "カイから渡すように";
		mes "言われているのでしょう？";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "……あ！";
		mes "もしかして、あなたが";
		mes "野羊さん!?";
		next;
		mes "[青年]";
		mes "……いえ。";
		mes "私は野羊ではなく、ヒョウ。";
		mes "野羊とは、カイが勝手に";
		mes "呼んでいるだけです。";
		mes "ハハハ。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "………………";
		next;
		mes "[ヒョウ]";
		mes "ダメですよ。";
		mes "忍者になりたいなら、";
		mes "目に見えることだけを";
		mes "信じていてはいけません。";
		next;
		mes "[ヒョウ]";
		mes "本に載っているような服装をしている";
		mes "忍者はそうそういません。";
		next;
		mes "[ヒョウ]";
		mes "忘れないでください。";
		mes "忍者は自分の正体を";
		mes "相手に知られた瞬間、";
		mes "自分の命を失ってしまうんです。";
		next;
		mes "[ヒョウ]";
		mes "今の私の姿や故郷、";
		mes "教えてあげた名前。";
		mes "その全てが";
		mes "嘘かも知れないのです。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "……はい。";
		mes "………………";
		next;
		mes "[ヒョウ]";
		mes "わかったようですね。";
		mes "では、手紙を頂きましょうか？";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "あ、はい。";
		mes "これです。";
		next;
		mes "[ヒョウ]";
		mes "どれどれ……";
		mes "……カイのやつ。";
		mes "挑戦状かと思ったら";
		mes "武器がないから";
		mes "一時休戦しようって";
		mes "書いてあります。";
		next;
		mes "[ヒョウ]";
		mes "ハハハ。";
		mes "残念ながら、";
		mes "私はクナイの材料を";
		mes "全て集めてありますよ。";
		next;
		mes "[ヒョウ]";
		mes "一応、返事を書きますね。";
		mes "私の手伝いをできるぐらいなら、";
		mes "もうちょっと感覚を鍛えるだけで";
		mes "あなたは立派な";
		mes "忍者になれるでしょう。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "………………";
		next;
		mes "[ヒョウ]";
		mes "少々お待ちください、";
		mes "今、返事を書いていますから……";
		mes "‐サラサラサラサラ‐";
		next;
		mes "[ヒョウ]";
		mes "はい、どうぞ。";
		mes "これをカイに渡せば";
		mes "いいですよ。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "‐手紙を受け取った‐";
		next;
		mes "[ヒョウ]";
		mes "では、すぐに行って下さい。";
		mes "忍者はいかなる時も";
		mes "時間を惜しまなければなりません。";
		next;
		mes "[ヒョウ]";
		mes "あなたが忍者になれれば、";
		mes "私と会う機会も増えるでしょう。";
		mes "期待していますよ。";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "はい……";
		mes "では、私はこれで……";
		next;
		mes "[ヒョウ]";
		mes "あ……";
		mes "アマツに行くなら";
		mes "送ってあげますよ。";
		mes "では、行ってらっしゃい。";
		set CHANGE_NJ,3;
		chgquest 6016,6017;
		delitem 1010,1;
		delitem 1002,30;
		close2;
		warp "amatsu.gat",113,127;
		end;
	case 3:
		mes "[ヒョウ]";
		mes "ん？　どうしましたか？";
		mes "まだカイに会っていないようですね。";
		next;
		mes "[ヒョウ]";
		mes "お望みでしたら、";
		mes "アマツに送ってあげますが？";
		next;
		if(select("いえ、結構です","はい、お願いします")==1) {
			mes "[ヒョウ]";
			mes "わかりました。";
			mes "では、がんばってください。";
			close;
		}
		mes "[ヒョウ]";
		mes "わかりました。";
		mes "では、行ってらっしゃい。";
		close2;
		warp "amatsu.gat",113,127;
		end;
	case 4:
		mes "[ヒョウ]";
		mes "カイが厄介な事を";
		mes "言い出したみたいですね。";
		mes "がんばってください。";
		close;
	}
}

//==========================================
// 苦無製作
//------------------------------------------
-	script	カシン#ng	83,{
	if(strnpcinfo(2) == "que") {
		mes "[カシン]";
		mes "私はカシン。";
		mes "苦無が必要なら";
		mes "いつでもきてください。";
	}
	else {
		mes "[カシン]";
		mes "最近あっちこっちで";
		mes "苦無を求める人が多くて";
		mes "とても忙しいですね。";
	}
	next;
	mes "[カシン]";
	mes "何が必要ですか？";
	mes "選んでみてください。";
	next;
	switch(select("爆裂の苦無：20個","猛毒の苦無：10個","氷柱の苦無：10個","狂風の苦無：10個","黒土の苦無：10個","烈火の苦無：10個","取り消し")) {
	case 1:	//爆裂の苦無 - 鋭刃の手裏剣20,黒色火薬1
		mes "鋭刃の手裏剣20個と黒色火薬1個で、";
		mes "爆裂の苦無20個を1束として";
		mes "交換しています。";
		next;
		mes "[カシン]";
		mes "一度に100束まで交換できます。";
		mes "交換を止めるなら";
		mes "0を入力してください。";
		next;
		input '@num;
		if('@num <= 0 || '@num > 100) {
			mes "[カシン]";
			mes "交換中止です。";
			mes "今度また来てください。";
			close;
		}
		if(countitem(13253) < 20*'@num || countitem(6213) < '@num) {
			mes "[カシン]";
			mes "交換するアイテムが";
			mes "足りないみたいですよ？";
			close;
		}
		delitem 13253,20*'@num;
		delitem 6213,'@num;
		getitem 13294,20*'@num;
		mes "[カシン]";
		mes "確認しました。";
		mes "では、どうぞ。";
		close;
	case 2:	//猛毒の苦無 - 手裏剣20,影宝珠1
		set '@itemid,13259;
		setarray '@need,13250,7524;
		setarray '@amount,20,1;
		break;
	case 3:	//氷柱の苦無 - 雨雲の手裏剣8,氷閃石2
		set '@itemid,13255;
		setarray '@need,13251,7522;
		setarray '@amount,8,2;
		break;
	case 4:	//狂風の苦無 - 閃光の手裏剣4,風鈴石2
		set '@itemid,13257;
		setarray '@need,13252,7523;
		setarray '@amount,4,2;
		break;
	case 5:	//黒土の苦無 - 鋭刃の手裏剣2,影宝珠1
		set '@itemid,13256;
		setarray '@need,13253,7524;
		setarray '@amount,2,1;
		break;
	case 6:	//烈火の苦無 - 刺針の手裏剣1,烈火石2
		set '@itemid,13258;
		setarray '@need,13254,7521;
		setarray '@amount,1,2;
		break;
	case 7:
		mes "[カシン]";
		mes "わかりました。";
		mes "またいつでも来てください。";
		close;
	}
	mes "[カシン]";
	mes getitemname('@need[0])+'@amount[0]+"個と" +getitemname('@need[1])+'@amount[1]+ "個で、";
	mes getitemname('@itemid)+ "10個を1束として";
	mes "交換しています。";
	next;
	mes "[カシン]";
	mes "一度に500束まで交換できます。";
	mes "交換を止めるなら";
	mes "0を入力してください。";
	next;
	input '@num;
	if('@num <= 0 || '@num > 500) {
		mes "[カシン]";
		mes "交換中止です。";
		mes "今度また来てください。";
		close;
	}
	if(countitem('@need[0]) < '@amount[0]*'@num || countitem('@need[1]) < '@amount[1]*'@num) {
		mes "[カシン]";
		mes "交換するアイテムが";
		mes "足りないみたいですよ？";
		close;
	}
	delitem '@need[0],'@amount[0]*'@num;
	delitem '@need[1],'@amount[1]*'@num;
	getitem '@itemid,10*'@num;
	mes "[カシン]";
	mes "確認しました。";
	mes "では、どうぞ。";
	close;
}

prontera.gat,178,240,3	duplicate(カシン#ng)	カシン#prt	83
que_ng.gat,72,29,3		duplicate(カシン#ng)	カシン#que	83

//==========================================
// 忍者刀製作
//------------------------------------------
-	script	カイバラ#ng	847,{
	if(strnpcinfo(2) == "que") {
		mes "[カイバラ]";
		mes "ワシは忍者の武器を";
		mes "作る事ができるカイバラという。";
		mes "何か欲しい物があるか？";
	}
	else {
		mes "[カイバラ]";
		mes "ワシを訪ねてくる人が増えてきて";
		mes "最近こことアマツを往復することが";
		mes "多くなったのじゃ。";
		mes "何か欲しい物があるか？";
	}
	next;
	switch(select("黒鱗","十手","阿修羅[3]","村雨","白刃","やめる")) {
	case 1:	//黒鱗 - ドラゴンの鱗400,オリデオコン5,ドラゴンの皮30,20万z
		mes "[カイバラ]";
		mes "ふむ、^FF0000黒鱗^000000を選んだか。";
		mes "黒鱗はそのほとんどが";
		mes "ドラゴンの鱗で出来ておる。";
		next;
		mes "[カイバラ]";
		mes "材料はドラゴンの鱗400個、";
		mes "オリデオコン5個、";
		mes "ドラゴンの鱗30個、";
		mes "20万Zenyが必要じゃ。";
		mes "ワシに製作を依頼するか？";
		set '@itemid,13006;
		setarray '@need,1036,984,7123;
		setarray '@amount,400,5,30;
		set '@zeny,200000;
		break;
	case 2:	//十手 - 鋼鉄30,古い柄1,2万z
		mes "[カイバラ]";
		mes "ふむ、^FF0000十手^000000を選んだか。";
		mes "十手には、使えば使うほど";
		mes "強くなるという伝説がある。";
		next;
		mes "[カイバラ]";
		mes "材料は";
		mes "鋼鉄30個、古い柄1個、";
		mes "2万Zenyが必要じゃ。";
		mes "ワシに製作を依頼するか？";
		set '@itemid,13007;
		setarray '@need,999,7022;
		setarray '@amount,30,1;
		set '@zeny,20000;
		break;
	case 3:	//阿修羅[3] - 鋼鉄25,古い魔方陣5,3万2千z
		mes "[カイバラ]";
		mes "ふむ、^FF0000阿修羅[3]^000000を選んだか。";
		mes "阿修羅[3]を作るためには";
		mes "鋼鉄25個、古い魔方陣5個、";
		mes "3万2千Zenyが必要じゃ。";
		mes "ワシに製作を依頼するか？";
		set '@itemid,13011;
		setarray '@need,999,7099;
		setarray '@amount,25,5;
		set '@zeny,32000;
		break;
	case 4:	//村雨 - 鋼鉄30,アクアマリン10,4万8千z
		mes "[カイバラ]";
		mes "ふむ、^FF0000村雨^000000を選んだか。";
		mes "村雨を作るには";
		mes "鋼鉄30個、アクアマリン10個、";
		mes "4万8千Zenyが必要じゃ。";
		mes "ワシに製作を依頼するか？";
		set '@itemid,13012;
		setarray '@need,999,720;
		setarray '@amount,30,10;
		set '@zeny,48000;
		break;
	case 5:	//白刃 - スケルボーン500,真珠5,ヒールLv3 10,12万z
		mes "[カイバラ]";
		mes "ふむ、^FF0000白刃^000000を選んだか。";
		mes "白刃を作るには";
		mes "スケルボーン500個、真珠5個、";
		mes "ヒールLv3を10個、";
		mes "12万Zenyが必要じゃ。";
		mes "ワシに製作を依頼するか？";
		set '@itemid,13014;
		setarray '@need,932,722,12001;
		setarray '@amount,500,5,10;
		set '@zeny,120000;
		break;
	case 6:
		mes "[カイバラ]";
		mes "うむ。";
		mes "気が向いたら";
		mes "また来るがよい。";
		close;
	}
	next;
	if(select("やめておきます","はい！")==1) {
		mes "[カイバラ]";
		mes "うむ……";
		mes "そう簡単には集められない";
		mes "材料じゃしのぅ……";
		mes "もし材料が集まるようなら";
		mes "いつでもまたきなされ。";
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[カイバラ]";
			mes "ワシが" +getitemname('@itemid)+('@itemid ==13011? "[3]": "")+ "を作るには";
			mes "材料が足りないようじゃぞ。";
			next;
			break;
		}
	}
	if('@i == getarraysize('@need) && Zeny < '@zeny) {
		mes "[カイバラ]";
		mes "うーむ……";
		mes "材料は十分じゃが、";
		mes "お金が足りないのぅ。";
		next;
	}
	if('@i < getarraysize('@need) || Zeny < '@zeny) {
		mes "[カイバラ]";
		mes getitemname('@itemid)+('@itemid ==13011? "[3]": "")+ "の材料は、";
		switch('@itemid) {
		case 13006:
			mes "^FF0000ドラゴンの鱗400個^000000、";
			mes "^FF0000オリデオコン5個^000000、";
			mes "^FF0000ドラゴンの鱗30個^000000、";
			mes "^FF000020万Zeny^000000が必要じゃ。";
			break;
		case 13007:
			mes "^FF0000鋼鉄30個^000000、^FF0000古い柄1個^000000、";
			mes "^FF00002万Zeny^000000が必要じゃ。";
			break;
		case 13011:
			mes "^FF0000鋼鉄25個^000000、^FF0000古い魔方陣5個^000000、";
			mes "^FF00003万2千Zeny^000000が必要じゃ。";
			break;
		case 13012:
			mes "^FF0000鋼鉄30個^000000、^FF0000アクアマリン10個^000000、";
			mes "^FF00004万8千Zeny^000000が必要じゃ。";
			break;
		case 13014:
			mes "^FF0000スケルボーン500個^000000、^FF0000真珠5個^000000、";
			mes "^FF0000ヒールLv3を10個^000000、";
			mes "^FF000012万Zeny^000000が必要じゃ。";
			break;
		}
		mes "ちゃんと確認してくるんじゃぞ。";
		close;
	}
	if(checkweight('@itemid,1) == 0) {
		mes "[カイバラ]";
		mes "どうやら荷物でいっぱいのようじゃぞ。";
		mes "少し余裕をもたせてくるとよい。";
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	set Zeny,Zeny-'@zeny;
	getitem '@itemid,1;
	mes "[カイバラ]";
	mes "うむ。";
	mes "材料とお金がそろったのぅ。";
	mes "では、" +getitemname('@itemid)+('@itemid ==13011? "[3]": "")+ "を";
	mes "受け取るがよい。";
	close;
}

payon.gat,210,44,3	duplicate(カイバラ#ng)	カイバラ#pay	847
que_ng.gat,72,34,3	duplicate(カイバラ#ng)	カイバラ#que	847

//==========================================
// 風魔手裏剣製作
//------------------------------------------
-	script	テツ#ng	709,{
	mes "[テツ]";
	mes "俺の名はテツ。";
	mes "風魔手裏剣を扱っている。";
	next;
	mes "[テツ]";
	mes "趣味のギャンブルで";
	mes "貯金が無くなってな……";
	mes "辞めていた武器製造を";
	mes "再開したんだ。";
	next;
	mes "[テツ]";
	mes "こう見えても風魔関連の武器は";
	mes "俺が世界一だ！";
	mes "安心して製造を任せな！";
	next;
	switch(select("風魔手裏剣・風鳥","風魔手裏剣・大車輪[3]","風魔手裏剣・大車輪[4]","風魔手裏剣・烈火","やめる")) {
	case 1:	//風魔手裏剣・風鳥 - 鋼鉄50,ハーピーの羽20,オリデオコン5,9万z
		mes "[テツ]";
		mes "^FF0000風魔手裏剣・風鳥^000000を選んだか。";
		mes "風魔手裏剣・風鳥を作るには";
		mes "鋼鉄50個、ハーピーの羽20個、";
		mes "オリデオコン5個、";
		mes "9万Zenyが必要だ。";
		mes "製作を依頼するか？";
		set '@itemid,13300;
		setarray '@need,999,7115,984;
		setarray '@amount,50,20,5;
		set '@zeny,90000;
		break;
	case 2:	//風魔手裏剣・大車輪[3] - 鋼鉄30,柄の紐100,オリデオコン2,4万z
		mes "[テツ]";
		mes "^FF0000風魔手裏剣・大車輪[3]^000000を選んだか。";
		mes "風魔手裏剣・風鳥[3]を作るには";
		mes "鋼鉄30個、柄の紐100個、";
		mes "オリデオコン2個、";
		mes "4万Zenyが必要だ。";
		mes "製作を依頼するか？";
		set '@itemid,13301;
		setarray '@need,999,7301,984;
		setarray '@amount,30,100,2;
		set '@zeny,40000;
		break;
	case 3:	//風魔手裏剣・大車輪[4] - 損傷したダイヤモンド20,風魔手裏剣・大車輪[3],オリデオコン3,4万z
		mes "[テツ]";
		mes "^FF0000風魔手裏剣・大車輪[4]^000000を選んだか。";
		mes "風魔手裏剣・大車輪[4]を作るには、";
		mes "損傷したダイヤモンド20個、";
		mes "風魔手裏剣・大車輪[3]1個、";
		mes "オリデオコン3個、4万Zenyが必要だ。";
		mes "製作を依頼するか？";
		next;
		mes "[テツ]";
		mes "言っておくが、";
		mes "風魔手裏剣・大車輪[3]のカードや";
		mes "精錬値は無くなるからな。";
		mes "慎重に考えて、決めてくれ。";
		set '@itemid,13302;
		setarray '@need,733,13301,984;
		setarray '@amount,20,1,3;
		set '@zeny,40000;
		break;
	case 4:	//風魔手裏剣・烈火 - 鋼鉄50,火種100,燃えている心臓100,烈火石50,7万8千z
		mes "[テツ]";
		mes "^FF0000風魔手裏剣・烈火^000000を選んだか。";
		mes "風魔手裏剣・烈火を作るには、";
		mes "鋼鉄50個、火種100個、";
		mes "燃えている心臓100個、烈火石50個、";
		mes "7万8千Zenyが必要だ。";
		mes "製作を依頼するか？";
		set '@itemid,13303;
		setarray '@need,999,7098,7097,7521;
		setarray '@amount,50,100,100,50;
		set '@zeny,78000;
		break;
	case 5:
		mes "[カイバラ]";
		mes "残念だ。";
		mes "俺が心血注いで作った武器を";
		mes "見せてやりたかったんだが……";
		mes "気が変わったらまた来てくれ。";
		close;
	}
	next;
	if(select("やめておきます","はい！")==1) {
		mes "[テツ]";
		mes "うーん……";
		mes "ま、安い材料じゃないよな。";
		mes "でも材料が揃ったら";
		mes "いつでも来てくれよ。";
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[テツ]";
			mes getitemname('@itemid)+('@itemid ==13301? "[3]": ('@itemid ==13302? "[4]": ""))+ "を作る";
			mes "材料が足りないようだぜ。";
			next;
			break;
		}
	}
	if('@i == getarraysize('@need) && Zeny < '@zeny) {
		mes "[テツ]";
		mes "材料は十分だけど、";
		mes "金が足りないぜ。";
		next;
	}
	if('@i < getarraysize('@need) || Zeny < '@zeny) {
		mes "[テツ]";
		mes getitemname('@itemid)+('@itemid ==13301? "[3]": ('@itemid ==13302? "[4]": ""))+ "を作るには、";
		switch('@itemid) {
		case 13300:
			mes "^FF0000鋼鉄50個^000000、^FF0000ハーピーの羽20個^000000、";
			mes "^FF0000オリデオコン5個^000000、";
			mes "^FF00009万Zeny^000000が必要だ。";
			break;
		case 13301:
			mes "^FF0000鋼鉄30個^000000、^FF0000柄の紐100個^000000、";
			mes "^FF0000オリデオコン2個^000000、";
			mes "^FF00004万Zeny^000000が必要だ。";
			break;
		case 13302:
			mes "^FF0000損傷したダイヤモンド20個^000000、";
			mes "^FF0000風魔手裏剣・大車輪[3]1個^000000、";
			mes "^FF0000オリデオコン3個^000000、^FF00004万Zeny^000000が必要だ。";
			break;
		case 13303:
			mes "^FF0000鋼鉄50個^000000、^FF0000火種100個^000000、";
			mes "^FF0000燃えている心臓100個^000000、^FF0000烈火石50個^000000、";
			mes "^FF00007万8千Zeny^000000が必要だ。";
			break;
		}
		mes "ちゃんと確認してくれよ。";
		close;
	}
	if(checkweight('@itemid,1) == 0) {
		mes "[テツ]";
		mes "お前、持てそうにないじゃないか。";
		mes "もう少し余裕をもってから";
		mes "来てくれよ。";
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	set Zeny,Zeny-'@zeny;
	getitem '@itemid,1;
	mes "[テツ]";
	mes "よし、材料も金もあるな。";
	mes "ほら、これが" +getitemname('@itemid)+('@itemid ==13301? "[3]": ('@itemid ==13302? "[4]": ""))+ "だ。";
	close;
}

geffen.gat,63,70,3	duplicate(テツ#ng)	テツ#gef	709
que_ng.gat,22,62,3	duplicate(テツ#ng)	テツ#que	709

//==========================================
// 手甲[1]製作
//------------------------------------------
que_ng.gat,28,50,3	script	ボシュ	709,{
	if(BaseLevel < 20) {
		mes "[ボシュ]";
		mes "私は忍者の若者達に";
		mes "最高の防具を作ってあげている。";
		next;
		mes "[ボシュ]";
		mes "だが、君は私の作った";
		mes "防具を装備するには、まだまだ";
		mes "レベルが低いようだね。";
		close;
	}
	if(countitem(2102) < 1 && ARMGARD_1QUE < 3) {
		mes "[ボシュ]";
		mes "私はボシュ。";
		mes "3人いる忍者の防具職人で";
		mes "一番と言われている。";
		next;
		mes "[ボシュ]";
		mes "3人と言っても、";
		mes "残りの2人は詐欺同然！";
		mes "私よりいい防具を作れるのは";
		mes "この世に存在しない。";
		next;
		mes "[ボシュ]";
		mes "なぜなら、私は";
		mes "東方の全ての鎧をはじめ、";
		mes "あらゆる防具の製法を";
		mes "知っているからだ。";
		next;
		mes "[ボシュ]";
		mes "しかし、私が作った鎧は";
		mes "防御力が高すぎて、";
		mes "その鎧を着たもの同士が争っても";
		mes "決着がつかないのが問題だった。";
		next;
		mes "[ボシュ]";
		mes "忍者が防具に頼る余り、";
		mes "技術を低下させないために、";
		mes "私は防具を作るのを止めている。";
		mes "今は主に、防具の";
		mes "収集活動をしている。";
		next;
		mes "[ボシュ]";
		mes "だが、聞く所によると、";
		mes "この広い世界にはまだ、";
		mes "私の知らない防具が";
		mes "あるみたいなんだ。";
		mes "なんだったかな……";
		next;
		mes "[ボシュ]";
		mes "^FF0000ガード[1]^000000だったかな？";
		mes "確かそんなんだった。";
		mes "ぜひ一度、実物を見てみたい。";
		next;
		mes "[ボシュ]";
		mes "どうせ私が作った鎧に比べると";
		mes "貧弱な物だとは思うが……";
		next;
		mes "[ボシュ]";
		mes "もし私の頼みを聞いてくれたら、";
		mes "君に特別な物を作ってあげよう。";
		mes "どうだ？";
		next;
		if(select("あまり気がのらないです","いいですよ")==1) {
			mes "[ボシュ]";
			mes "おや、残念だ。";
			mes "私の作った防具が手に入る";
			mes "またとないチャンスなのにな。";
			close;
		}
		mes "[ボシュ]";
		mes "商談成立ってやつだな。";
		mes "じゃあ、^FF0000ガード[1]^000000と呼ばれる";
		mes "防具を手に入れてきてくれ。";
		set ARMGARD_1QUE,1;
		close;
	}
	if(ARMGARD_1QUE == 1) {
		mes "[ボシュ]";
		mes "お、持ってきてくれたのか？";
		mes "一度見せてくれ……";
		mes "ふむふむ……";
		next;
		mes "[ボシュ]";
		mes "そう！　これだ！";
		mes "すべての防具にスロットを付ければ";
		mes "より良い性能を引き出す事ができる！";
		next;
		mes "[ボシュ]";
		mes "よし、これを応用して";
		mes "私の防具にスロットを";
		mes "付けよう。";
		next;
		mes "[ボシュ]";
		mes "もしよかったら、";
		mes "手甲1個、ガード[1]1個、";
		mes "そして1万Zenyで";
		mes "手甲[1]を作ってあげよう。";
		mes "どうする？";
		next;
		if(select("いえ","はい")==1) {
			mes "[ボシュ]";
			mes "うーん、そうか。";
			mes "とにかく、珍しい防具を";
			mes "見せてくれたことだけでも";
			mes "感謝しているよ。";
			mes "わざわざありがとう。";
			set ARMGARD_1QUE,0;
			close;
		}
		mes "[ボシュ]";
		mes "わかった。";
		mes "もう一度いうが、材料は";
		mes "手甲1個、ガード[1]1個、";
		mes "そして1万Zenyだ。";
		mes "準備ができたらまた来てくれ。";
		set ARMGARD_1QUE,2;
		close;
	}
	if(ARMGARD_1QUE == 2) {
		callsub L_Routine;
		close;
	}
	if(ARMGARD_1QUE == 3) {
		mes "[ボシュ]";
		mes "やぁ。";
		mes "また手甲[1]が";
		mes "必要になったのか？";
		next;
		if(select("いえ","はい")==1) {
			mes "[ボシュ]";
			mes "そうか。";
			mes "必要になったら";
			mes "また来てくれよ。";
			close;
		}
		callsub L_Routine;
		close;
	}
	mes "[ボシュ]";
	mes "ぁ、君！";
	mes "もしかして、それは";
	mes "ガードという防具じゃないか？";
	mes "ちょっと見せてくれ！";
	next;
	mes "[ボシュ]";
	mes "そう！　これだ！";
	mes "すべての防具にスロットを付ければ";
	mes "より良い性能を引き出す事ができる！";
	mes "なんだこんな簡単なことに";
	mes "気づかなかったんだ！";
	next;
	mes "[ボシュ]";
	mes "あ、私の名はボシュ。";
	mes "東方にいる三人の";
	mes "忍者用防具職人の中で";
	mes "一番と言われている。";
	mes "私は東方の全ての防具の製法を";
	mes "知っているんだ。";
	next;
	mes "[ボシュ]";
	mes "しかし、私が作った鎧は";
	mes "あまりにも硬いため、";
	mes "それを装備した者同士が争ったら";
	mes "決着がつかないんだ。";
	next;
	mes "[ボシュ]";
	mes "私は忍者が防具に頼り、";
	mes "技術が失われていくのを防ぐため、";
	mes "防具を作るのをやめた。";
	mes "今は防具の収集家をしている。";
	next;
	mes "[ボシュ]";
	mes "だが、君が持っている";
	mes "その防具を見て、";
	mes "私の魂に火がついた！";
	next;
	mes "[ボシュ]";
	mes "もしよかったら、";
	mes "手甲1個、ガード[1]1個、";
	mes "そして1万Zenyで";
	mes "手甲[1]を作ってあげよう。";
	mes "どうする？";
	next;
	if(select("いいえ、結構です","はい！　お願いします！")==1) {
		mes "[ボシュ]";
		mes "そうか……";
		mes "うーん、残念だ。";
		mes "もし気が変わったら";
		mes "いつでも来てくれ。";
		close;
	}
	callsub L_Routine;
	close;
L_Routine:
	if(countitem(2102) < 1 || countitem(2117) < 1) {
		mes "[ボシュ]";
		mes "材料がちょっと";
		mes "足りないようだな。";
		next;
		mes "[ボシュ]";
		mes "手甲[1]を作るには";
		mes "手甲1個、ガード[1]1個、";
		mes "そして1万Zenyが必要だ。";
		mes "ちゃんと確認してから";
		mes "また来てくれ。";
		close;
	}
	if(Zeny < 10000) {
		mes "[ボシュ]";
		mes "材料は足りているが、";
		mes "金は足りないようだな。";
		next;
		mes "[ボシュ]";
		mes "手甲[1]を作るには";
		mes "手甲1個、ガード[1]1個、";
		mes "そして1万Zenyが必要だ。";
		mes "ちゃんと確認してから";
		mes "また来てくれ。";
		close;
	}
	mes "[ボシュ]";
	mes "材料の準備は";
	mes "できているみたいだな。";
	mes "最後にもう一度聞くが、";
	mes "手甲[1]を作ってもいいのか？";
	next;
	if(select("いえ","はい")==1) {
		mes "[ボシュ]";
		mes "わかった。";
		mes "もし気が変わったら";
		mes "いつでも来てくれ。";
		close;
	}
	mes "[ボシュ]";
	mes "よし！";
	mes "ちょっと待ってくれ。";
	mes "-カンカンカン-";
	next;
	mes "[ボシュ]";
	mes "よし、できた！";
	mes "これが手甲[1]だ。";
	mes "また欲しくなったら";
	mes "いつでも来てくれ。";
	delitem 2102,1;
	delitem 2117,1;
	set Zeny,Zeny-10000;
	set ARMGARD_1QUE,3;
	getitem 2118,1;
	return;
}

//==========================================
// 手甲改製作
//------------------------------------------
que_ng.gat,28,45,3	script	バッシュ	86,{
	if(BaseLevel < 50) {
		mes "[バッシュ]";
		mes "私は忍者用防具を作っている";
		mes "バッシュと言います。";
		next;
		mes "[バッシュ]";
		mes "しかし、私の製作した防具を";
		mes "装備するには条件があるのです。";
		mes "もう少し成長してから、";
		mes "また来てください。";
		close;
	}
	if(countitem(2107) < 1 && ARMGARD_2QUE < 3) {
		mes "[バッシュ]";
		mes "私は3人の忍者用防具職人の一人、";
		mes "バッシュといいます。";
		mes "ちなみに、残りの二人は";
		mes "私の兄さんたちです。";
		next;
		mes "[バッシュ]";
		mes "私は兄さんたちの肩書きで";
		mes "防具職人として";
		mes "あまり活動できませんが、";
		mes "多くの方が私の防具を";
		mes "評価してくれています。";
		next;
		mes "[バッシュ]";
		mes "今は防具と魔法について";
		mes "研究しています。";
		next;
		mes "[バッシュ]";
		mes "そこでですが、海の彼方の国には";
		mes "ミラーシールドという防具が";
		mes "あるらしいですね？";
		mes "それを手に入れることは";
		mes "できませんか？";
		next;
		mes "[バッシュ]";
		mes "もしミラーシールドを";
		mes "調べることができれば、";
		mes "研究がとても進みます。";
		mes "私の願いを聞いてもらえますか？";
		next;
		if(select("断る","いいですよ")==1) {
			mes "[バッシュ]";
			mes "ん〜";
			mes "やっぱり無理な頼みでしたか。";
			mes "申し訳ありません。";
			mes "もしミラーシールドが手に入って、";
			mes "処分にでも困った時は、";
			mes "いつでも私の所にきてください。";
			close;
		}
		mes "[バッシュ]";
		mes "ありがとうございます。";
		mes "ぁ、スロットは無いもので";
		mes "お願いしますね。";
		mes "それではお待ちしています。";
		set ARMGARD_2QUE,1;
		close;
	}
	if(ARMGARD_2QUE == 1) {
		mes "[バッシュ]";
		mes "え、手に入れてきたんですか？";
		mes "一度見せてください……";
		mes "……ふむふむ……";
		next;
		mes "[バッシュ]";
		mes "やっぱり！";
		mes "この防具みたいに";
		mes "魔法に対する防御力を";
		mes "付け加えれば！";
		next;
		mes "[バッシュ]";
		mes "ありがとうございます。";
		mes "あなたが見せてくれた";
		mes "そのミラーシールドのおかげで";
		mes "眠っていた創作意欲に";
		mes "魂が入りました。";
		next;
		mes "[バッシュ]";
		mes "もしよかったら";
		mes "手甲1個、ミラーシールド1個。";
		mes "そして2万Zenyで手甲改を";
		mes "作って差し上げますが。";
		mes "どうしますか？";
		next;
		if(select("遠慮しておきます","お願いします")==1) {
			mes "[バッシュ]";
			mes "うーん、そうですか。";
			mes "残念です。";
			mes "もし気が変わったら";
			mes "いつでも来てください。";
			set ARMGARD_2QUE,0;
			close;
		}
		mes "[バッシュ]";
		mes "わかりました。";
		mes "胸がドキドキします……";
		next;
		mes "[バッシュ]";
		mes "では、用意ができたら";
		mes "また来てください。";
		set ARMGARD_2QUE,2;
		close;
	}
	if(ARMGARD_2QUE == 2) {
		callsub L_Routine;
		close;
	}
	if(ARMGARD_2QUE == 3) {
		mes "[バッシュ]";
		mes "いらっしゃいませ。";
		mes "手甲改が必要で";
		mes "いらっしゃったんですか？";
		next;
		if(select("いえ","はい")==1) {
			mes "[バッシュ]";
			mes "うーん、そうですか。";
			mes "残念です。";
			mes "もし気が変わったら";
			mes "いつでも来てください。";
			close;
		}
		callsub L_Routine;
		close;
	}
	mes "[バッシュ]";
	mes "あ、もしかしたら";
	mes "それはミラーシールドという";
	mes "防具じゃありませんか？";
	next;
	mes "[バッシュ]";
	mes "申し訳ありませんが、";
	mes "一度見せてください……";
	next;
	mes "[バッシュ]";
	mes "やっぱり！";
	mes "この防具みたいに";
	mes "魔法に対する防御力を";
	mes "付け加えれば！";
	next;
	mes "[バッシュ]";
	mes "そう……";
	mes "より一層、良い性能を";
	mes "引き出せそうです！";
	mes "どうしてこんな簡単な事に";
	mes "気づかなかったんでしょう！";
	next;
	mes "[バッシュ]";
	mes "実は、私は3人の";
	mes "忍者用防具職人の一人、";
	mes "バッシュといいます。";
	mes "ちなみに、残りの二人は";
	mes "私の兄さんたちです。";
	next;
	mes "[バッシュ]";
	mes "私は兄さんたちの肩書きで";
	mes "防具職人として";
	mes "あまり活動できませんが、";
	mes "多くの方が私の防具を";
	mes "評価してくれています。";
	next;
	mes "[バッシュ]";
	mes "今は防具と魔法について";
	mes "研究しています。";
	next;
	mes "[バッシュ]";
	mes "そこで、海の彼方の国にある";
	mes "ミラーシールドという防具から";
	mes "アイデアを出そうとしていましたが、";
	mes "なかなか手に入らなくて";
	mes "困り果てていました。";
	next;
	mes "[バッシュ]";
	mes "しかし、運良く";
	mes "あなたが見せてくれた";
	mes "そのミラーシールドのおかげで";
	mes "眠っていた創作意欲に";
	mes "魂が入りました。";
	next;
	mes "[バッシュ]";
	mes "もしよかったら";
	mes "手甲1個、ミラーシールド1個。";
	mes "そして2万Zenyで手甲改を";
	mes "作って差し上げますが。";
	mes "どうしますか？";
	next;
	if(select("遠慮しておきます","お願いします")==1) {
		mes "[バッシュ]";
		mes "うーん、そうですか。";
		mes "残念です。";
		mes "もし気が変わったら";
		mes "いつでも来てください。";
		close;
	}
	callsub L_Routine;
	close;
L_Routine:
	if(countitem(2107) < 1 || countitem(2117) < 1) {
		mes "[バッシュ]";
		mes "材料がちょっと";
		mes "足りないようですね。";
		mes "手甲改を作るなら、";
		mes "手甲1個、ミラーシールド1個。";
		mes "そして2万Zenyが必要です。";
		mes "確認後、また来てください。";
		close;
	}
	if(Zeny < 20000) {
		mes "[バッシュ]";
		mes "材料は十分ですが、";
		mes "お金が足りないようです。";
		mes "手甲改を作るなら、";
		mes "手甲1個、ミラーシールド1個。";
		mes "そして2万Zenyが必要です。";
		mes "確認後、また来てください。";
		close;
	}
	mes "[バッシュ]";
	mes "材料はもう";
	mes "そろってるみたいですね。";
	mes "では、最後にもう一度聞きます。";
	next;
	mes "[バッシュ]";
	mes "手甲改は魔法に対する";
	mes "防御力が上がる代わりに、";
	mes "物理的な防御力は多少";
	mes "落ちてしまいます。";
	next;
	mes "[バッシュ]";
	mes "それでも、持って来た材料で";
	mes "手甲改を作りますか？";
	next;
	if(select("いいえ","はい")==1) {
		mes "[バッシュ]";
		mes "わかりました。";
		mes "では、考えが変わったら";
		mes "また来てください。";
		close;
	}
	mes "[バッシュ]";
	mes "はい、では";
	mes "始めましょうか。";
	mes "-トントントン-";
	mes "-カンカンカンカン-";
	next;
	mes "[バッシュ]";
	mes "どうぞ、これが手甲改です。";
	mes "またこれが必要になったら";
	mes "いつでも来てください。";
	delitem 2107,1;
	delitem 2117,1;
	set Zeny,Zeny-20000;
	set ARMGARD_2QUE,3;
	getitem 2119,1;
	return;
}

//==========================================
// 手甲改[1]製作
//------------------------------------------
que_ng.gat,27,18,3	script	トシュ	709,{
	mes "[トシュ]";
	mes "お元気かな？";
	mes "若き友よ。";
	mes "私は忍者用防具を";
	mes "作っている3兄弟の一人。";
	mes "トシュと言う。";
	next;
	mes "[トシュ]";
	mes "海の向こうで";
	mes "防具にスロットを付ける";
	mes "技術を学んできたので、";
	mes "今はその技術を最大限に";
	mes "生かしたい。";
	next;
	mes "[トシュ]";
	mes "もし希望するなら、";
	mes "手甲改1個、バックラー[1]を1個。";
	mes "そして4万Zenyを持ってくれば、";
	mes "手甲改にスロットを";
	mes "付けてあげよう。";
	next;
	mes "[トシュ]";
	mes "だが、この技術は非常に繊細。";
	mes "失敗する可能性も多少ある。";
	mes "その事をよく考えて欲しい。";
	mes "それでもスロットを付けてみるか？";
	next;
	if(select("いいえ","はい")==1) {
		mes "[トシュ]";
		mes "そうだな。";
		mes "慎重なほうがいい。";
		mes "もし決心がついたら";
		mes "また来るといい。";
		close;
	}
	if(countitem(2104) < 1 || countitem(2119) < 1) {
		mes "[トシュ]";
		mes "材料が足りないようだ。";
		mes "材料はバックラー[1]を1個、";
		mes "手甲改1個、そして";
		mes "4万Zenyだ。";
		mes "数量と金額は正確に。";
		close;
	}
	if(Zeny < 40000) {
		mes "[トシュ]";
		mes "材料は十分だが、";
		mes "お金が足りないな。";
		next;
		mes "[トシュ]";
		mes "材料はバックラー[1]を1個、";
		mes "手甲改1個、そして";
		mes "4万Zenyだ。";
		mes "数量と金額は正確に。";
		close;
	}
	mes "[トシュ]";
	mes "うん。";
	mes "全部揃っている。";
	mes "では、製作に入る。";
	next;
	mes "[トシュ]";
	mes "もう一度言うが、";
	mes "失敗する可能性がある。";
	mes "それでもするか？";
	next;
	if(select("やっぱりやめておきます","それでも挑戦します")==1) {
		mes "[トシュ]";
		mes "そうだな。";
		mes "慎重なほうがいい。";
		mes "もし決心がついたら";
		mes "また来るといい。";
		close;
	}
	mes "[トシュ]";
	mes "よし、わかった。";
	mes "少し待ってくれ。";
	mes "-トントントトントン-";
	mes "-ガゴンガゴン-";
	next;
	delitem 2104,1;
	delitem 2119,1;
	set Zeny,Zeny-40000;
	if(rand(5) < 2) {
		mes "[トシュ]";
		mes "く……";
		mes "だめだ……失敗した。";
		mes "……すまない。";
		mes "お詫びといってはなんだが、";
		mes "これでも食べて";
		mes "元気を出してくれ。";
		getitem 12043,1;
		close;
	}
	mes "[トシュ]";
	mes "よし、完成した。";
	mes "失敗するか心配だったが、";
	mes "大丈夫だったな。";
	mes "では、また必要になったら";
	mes "いつでも来てくれ。";
	getitem 2120,1;
	close;
}
