$(function(){
 	homemoto();
//	console.log(contextPath);
	$('#homemotoDiv a').click(function(){
		var value = $(this).text();
		homemotoDiv(value);
	})
})
function homemoto(){
	$.each(contextPath.rows,function(i,item){
    	console.log(item);
    	$('#homemoto').append(
        		'<li class="cl">'
        		+'<a href=""><img src="'+path+'/images/m-img22.jpg" width="155" height="115" /></a>'
    			+'<p>大狗摩托 '+item.goodsClass.className+'</p>'
    			+'<p style="color: #999;">'+item.enterpriseUser.enterpriseName+'</p>'
    			+'<div class="M-price cl">'
    			+'<span><img style="vertical-align: middle; margin-top: -2px;"'
    			+'src="'+path+'/images/m-img23.jpg" width="20" height="20" />8454</span>'
    			+'	<em class="fr">销量：152辆</em>'
    			+'</div></li>'
    			);
    })
}
function homemotoDiv(value){
	//$('#homemoto').remove();
//	$.ajax({aaa
//		type : "post",
//		url : path+'/home/goods/showGoods.do',
//		dataType:'json',
//		data:{'className':value},
//		success:function(res){
//			
//		}
//	});
}
