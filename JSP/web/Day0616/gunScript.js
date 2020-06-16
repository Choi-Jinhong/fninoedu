$(function () {
    //음악파일 생성
    var jang = new Audio("../img/game/jang.wav");
    var fire = new Audio("../img/game/fire.wav");

    $('.gun').click(function () {
        fire.play();
        var idx=parseInt((Math.random() * 12));

        if($(".sunban li img").eq(idx).is(":hidden"))
            $('#msg').html('못맞췄습니다.');
        else{
            $('.sunban li img').eq(idx).fadeOut('slow');
            $('#msg').html((idx+1) + '번째 인형을 얻었습니다.' + "(" + remain1() + "개 남음)");
        }

        if(remain1() == -1)
            $('#msg').html('Game Over');
    });

    $('.money li img').click(function () {
        $('.sunban li img').fadeIn();
        $('#msg').html("셋팅 완료 게임 시작");
        $(this).hide();
    });
});

function remain1() {
    var n = -1;
    $('.sunban li img').each(function (index, item) {
        if($(this).is(":visible")){
            n++;
        }
    });
    return n;
}

