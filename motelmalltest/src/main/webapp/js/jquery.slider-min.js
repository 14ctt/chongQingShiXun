$(function(){
	var ak,tk;
	$('.flexslider').flexslider({

		directionNav: true,
		pauseOnAction: true,
		start: function(){

			ak=1;
			$("#fvl").html($(".slides").children("li").find("a").eq(ak-1).attr("title"));
		},
		after: function(e){
			if(ak>=5){ak=0;}

			$("#fvl").html($(".slides").children("li").find("a").eq(ak).attr("title"));
			ak++;
			//console.log(ak);
		}
	});
	$(".flex-prev").click(function(){
	
console.log(ak);
			if(ak-2<=-1){
				
			ak=4;
				}else{
					ak-=2;
					}
});
});