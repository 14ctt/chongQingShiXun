<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户首页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="360-site-verification"
	content="e51821f6fb255ccd23b0e6e03e345b1d" />
<%@ include file="/WEB-INF/jsp/header.jsp"%>
<script type="text/javascript">  
        <%--JS gloable varilible--%>  
        var contextPath =${jsonList};
</script>
<script type="text/javascript" src="${webtxc}/js/jquery.x_down.js"></script>
<script type="text/javascript" src="${webtxc}/myjs/home/home.js?v=2016052702"></script>
</head>
<body>
	<div class="x_scxtop">
		<div class="x_sctopf">
			<div class="x_sctop cl">
				<div class="x_sctop1 fl">
					<span class="x_scfh"><a href="#"><img
							src="${webtxc}/images/x_cgfanh_03.png" /></a></span><a href="#">注册</a> | <a
						href="#">登陆</a>
				</div>
				<div class="x_sctop1 fr">
					<a href="#">首页</a> | <a href="#">购物车</a> | <a href="#">商家入驻</a> | <a
						href="#">网站导航</a>
				</div>
			</div>
		</div>
	</div>
	<div class="x_scctop">
		<div class="x_sctopf cl">
			<div class="x_scsctop1 cl">
				<a href="#"><img src="${webtxc}/images/x_logo_03.png" width="137"
					height="45" /></a>
			</div>
			<div class="x_scsctopa2 fl">
				<div class="x_scsouk cl">
					<form method="get" name="" action="" target="_blank">
						<div id="searchTxt" class="searchTxt"
							onMouseOver="this.className='searchTxt searchTxtHover';"
							onMouseOut="this.className='searchTxt';">
							<div class="radius"></div>
							<div class="radius"></div>
							<div class="searchMenu">
								<div class="searchSelected" id="searchSelected">商品</div>
								<div style="display: none;" class="searchTab" id="searchTab">
									<div class="radius"></div>
									<div class="radius"></div>
									<ul>
										<li class="">商品</li>
										<li>摩托</li>
										<li>零件</li>
										<li>头盔</li>
									</ul>
								</div>
							</div>
							<input name="w" type="text" />
						</div>
						<div class="searchBtn">
							<a href="#"><img src="${webtxc}/images/x_sousuo1_03.png" /></a>
						</div>
					</form>
				</div>
				<div class="x_scsous fl">
					热门搜索：<a href="#">宗申</a><a href="#">摩托车</a><a href="#">发动机</a>
				</div>
			</div>
			<div class="x_saomapp fr">
				<a href="#"><img src="${webtxc}/images/x_caigou_03.png" /><br />
					扫描下载APP</a>
			</div>
		</div>
	</div>
	<!--商城头部-->

	<div class="x_banner">
		<div class="x_bananer1">
			<div id="x_bantop">
				<ul class="x_down cl">
					<li><a href="#">首页</a>
						<ul>
							<li><a href="#">首页介绍</a></li>
						</ul></li>
					<li><a href="#">摩托车商城</a>
						<ul>
							<li><a href="#">摩托车信息</a></li>
						</ul></li>
					<li><a href="#">智力研发</a>
						<ul>
							<li><a href="#">智力</a></li>
						</ul></li>
					<li class="x_xish"><a href="#">采购招标</a>
						<ul>
							<li><a href="#">采购流程</a></li>
						</ul></li>
					<li><a href="#">物流服务</a>
						<ul>
							<li><a href="#">物流管理</a></li>
						</ul></li>
					<li><a href="#">商家服务</a>
						<ul>
							<li><a href="#">商家管理</a></li>
						</ul></li>
					<li><a href="#">摩旅生活</a>
						<ul>
							<li><a href="#">生活</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</div>
	<!--/商城banner与后台banner公用-->

	<div class="M-wrap cl">
		<div class="M-fina cl">
			<div class="M-categorie fl cl">
				<div class="M-Clist fl">
					<a class="M-curt" href=""><em><img
							src="${webtxc}/images/m-c01.png" width="20" height="20" /></em><i>全部分类</i></a>
				</div>
				<div class="M-Clist fl">
					<a href=""><em><img src="${webtxc}/images/m-c02.png" width="20"
							height="20" /></em><i>值得购买</i></a>
				</div>
				<div class="M-Clist fl">
					<a href=""><em><img src="${webtxc}/images/m-c03.png" width="20"
							height="20" /></em><i>摩托整车</i></a>
				</div>
				<div class="M-Clist fl">
					<a href=""><em><img src="${webtxc}/images/m-c04.png" width="20"
							height="20" /></em><i>电动摩托</i></a>
				</div>
				<div class="M-Clist fl">
					<a href=""><em><img src="${webtxc}/images/m-c05.png" width="20"
							height="20" /></em><i>骑行装备</i></a>
				</div>
				<div class="M-Clist fl">
					<a href=""><em><img src="${webtxc}/images/m-c06.png" width="20"
							height="20" /></em><i>装饰养护</i></a>
				</div>
				<div class="M-Clist fl">
					<a href=""><em><img src="${webtxc}/images/m-c07.png" width="20"
							height="20" /></em><i>摩托车百科</i></a>
				</div>
				<div class="M-Clist fl">
					<a href=""><em><img src="${webtxc}/images/m-c08.png" width="20"
							height="20" /></em><i>有奖调查</i></a>
				</div>
				<div class="M-Clist fl">
					<a href=""><em><img src="${webtxc}/images/m-c09.png" width="20"
							height="20" /></em><i>摩托车百科</i></a>
				</div>
				<div class="M-Clist fl">
					<a href=""><em><img src="${webtxc}/images/m-c10.png" width="20"
							height="20" /></em><i>有奖调查</i></a>
				</div>
			</div>
			<!--/分类-->

			<div class="M-banner slideBox" id="focus"
				style="float: left; width: 60%; height: 350px; margin-left: 10px; overflow: hidden;">
				<div class="hd">
					<ul>
						<li>1</li>
						<li>2</li>
						<li>3</li>
						<li>4</li>
						<li>5</li>
					</ul>
				</div>
				<div class="bd">
					<ul>
						<li><img src="${webtxc}/images/m-banner.jpg" alt="" height="360" /></li>
						<li><img src="${webtxc}/images/m-banner.jpg" alt="" height="360" /></li>
						<li><img src="${webtxc}/images/m-banner.jpg" alt="" height="360" /></li>
						<li><img src="${webtxc}/images/m-banner.jpg" alt="" height="360" /></li>
						<li><img src="${webtxc}/images/m-banner.jpg" alt="" height="360" /></li>

					</ul>
				</div>
			</div>

			<script type="text/javascript">
				TouchSlide({
					slideCell : "#focus",
					titCell : ".hd ul",
					mainCell : ".bd ul",
					effect : "left",
					autoPlay : true,
					autoPage : true,
					switchLoad : "_src"
				});
			</script>
			<!--/banner-->

			<div class="M-indexL fr">
				<div class="M-aut cl">
					<dl class="cl">
						<dt>
							<img src="${webtxc}/images/m-img20.jpg" width="56" height="56" />
						</dt>
						<dd>
							<p style="color: #8c0000; font-size: 18px; padding-bottom: 5px;">yx42051</p>
							<p>普通会员</p>
							<p>
								等级：<em><img src="${webtxc}/images/m-img18.png" width="15"
									height="15"> <img src="${webtxc}/images/m-img18.png" width="15"
									height="15"> <img src="${webtxc}/images/m-img18.png" width="15"
									height="15"> <img src="${webtxc}/images/m-img18.png" width="15"
									height="15"> <img src="${webtxc}/images/m-img19.png" width="15"
									height="15"> </em>
							</p>
						</dd>
					</dl>
					<div class="M-exit">
						<a href="">注册</a> <a href="">退出登录</a>
					</div>
				</div>

				<div class="M-annou cl">
					<h2 class="cl">
						<span>平台公告</span><a class="fr" href="">更多></a>
					</h2>
					<div class="M-anntxt">
						<p>
							<img src="${webtxc}/images/m-img21.jpg" width="195" height="126" />
						</p>
						<h3>宗申摩托，新品上市，全新速度 体验，敬请关注...</h3>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!--/M-wrap end-->
	<div class="M-wp cl">
		<div class="M-contain cl">
			<div class="M-recom fl cl">
				<h1 class="M-h1 fl cl">
					<span><strong>今日推荐</strong></span><em>大家都在买~</em><a class="fr"
						href="">全部车型></a>
				</h1>
				<div class="M-nav fl" id="homemotoDiv">
					<a class="M-DQ" href="#">越野车</a> <a href="#">商务车</a> <a href="#">外贸车</a>
					<a href="#">太子车</a> <a href="#">踏板车</a> <a href="#">弯梁车</a>
				</div>

				<ul class="M-UL01 fl cl" id="homemoto">
				<!--  
					<input type="hidden" id="hiddenlist" value="${list}"/>
					<c:forEach items="${list}" var="goods">
						${list}
						<li class="cl">
						<a href=""><img src="${webtxc}/images/m-img22.jpg" width="155" height="115" /></a>
							<p>大狗摩托 越野车</p>
							<p style="color: #999;">${goods.enterpriseUser.enterpriseName}</p>
							<div class="M-price cl">
								<span><img
									style="vertical-align: middle; margin-top: -2px;"
									src="${webtxc}/images/m-img23.jpg" width="20" height="20" />8454</span>
								<em class="fr">销量：152辆</em>
							</div>
						</li>
					</c:forEach>
				-->	
				</ul>
			</div>

			<div class="M-indexR fr cl">
				<div class="M-annou cl">
					<h2 class="cl">
						<span>发现好货</span><a class="fr" href="">更多></a>
					</h2>
					<dl class="M-DL01 cl">
						<dt>
							<a href=""><img src="${webtxc}/images/m-img12.jpg" width="93"
								height="66" /></a>
						</dt>
						<dd>
							<p>
								<em>春风 125</em><i>越野车</i>
							</p>
							<p>已销售125辆</p>
						</dd>
					</dl>

					<dl class="M-DL01 cl">
						<dt>
							<a href=""><img src="${webtxc}/images/m-img12.jpg" width="93"
								height="66" /></a>
						</dt>
						<dd>
							<p>
								<em>春风 125</em><i>越野车</i>
							</p>
							<p>已销售125辆</p>
						</dd>
					</dl>

					<dl class="M-DL01 cl">
						<dt>
							<a href=""><img src="${webtxc}/images/m-img12.jpg" width="93"
								height="66" /></a>
						</dt>
						<dd>
							<p>
								<em>春风 125</em><i>越野车</i>
							</p>
							<p>已销售125辆</p>
						</dd>
					</dl>

					<dl class="M-DL01 cl">
						<dt>
							<a href=""><img src="${webtxc}/images/m-img12.jpg" width="93"
								height="66" /></a>
						</dt>
						<dd>
							<p>
								<em>春风 125</em><i>越野车</i>
							</p>
							<p>已销售125辆</p>
						</dd>
					</dl>

				</div>
			</div>
			<!--/发现好货-->

		</div>
	</div>
	<!--/今日推荐-->

	<div class="M-wper cl">
		<div class="M-contain cl">
			<div class="M-recom fl cl">
				<h1 class="M-h1 fl cl">
					<span><strong>骑行装备</strong></span><em>用着更放心~</em><a class="fr"
						href="">全部装备></a>
				</h1>
				<div class="M-nav fl">
					<a class="M-DQ" href="">头盔</a> <a href="">护膝</a> <a href="">手套</a>
					<a href="">护具</a> <a href="">油箱包</a> <a href="">护具</a>
				</div>

				<ul class="M-UL01 fl cl">
					<li class="cl"><a href=""><img src="${webtxc}/images/m-img24.jpg"
							width="155" height="115" /></a>
						<p>头盔 125 越野车</p>
						<p style="color: #999;">大狗摩托店铺</p>
						<div class="M-price cl">
							<span><img
								style="vertical-align: middle; margin-top: -2px;"
								src="${webtxc}/images/m-img23.jpg" width="20" height="20" />8454</span> <em
								class="fr">销量：152辆</em>
						</div></li>

					<li class="cl"><a href=""><img src="${webtxc}/images/m-img24.jpg"
							width="155" height="115" /></a>
						<p>头盔 125 越野车</p>
						<p style="color: #999;">大狗摩托店铺</p>
						<div class="M-price cl">
							<span><img
								style="vertical-align: middle; margin-top: -2px;"
								src="${webtxc}/images/m-img23.jpg" width="20" height="20" />8454</span> <em
								class="fr">销量：152辆</em>
						</div></li>

					<li class="cl"><a href=""><img src="${webtxc}/images/m-img24.jpg"
							width="155" height="115" /></a>
						<p>头盔 125 越野车</p>
						<p style="color: #999;">大狗摩托店铺</p>
						<div class="M-price cl">
							<span><img
								style="vertical-align: middle; margin-top: -2px;"
								src="${webtxc}/images/m-img23.jpg" width="20" height="20" />8454</span> <em
								class="fr">销量：152辆</em>
						</div></li>

					<li class="cl"><a href=""><img src="${webtxc}/images/m-img24.jpg"
							width="155" height="115" /></a>
						<p>头盔 125 越野车</p>
						<p style="color: #999;">大狗摩托店铺</p>
						<div class="M-price cl">
							<span><img
								style="vertical-align: middle; margin-top: -2px;"
								src="${webtxc}/images/m-img23.jpg" width="20" height="20" />8454</span> <em
								class="fr">销量：152辆</em>
						</div></li>

					<li class="cl"><a href=""><img src="${webtxc}/images/m-img24.jpg"
							width="155" height="115" /></a>
						<p>头盔 125 越野车</p>
						<p style="color: #999;">大狗摩托店铺</p>
						<div class="M-price cl">
							<span><img
								style="vertical-align: middle; margin-top: -2px;"
								src="${webtxc}/images/m-img23.jpg" width="20" height="20" />8454</span> <em
								class="fr">销量：152辆</em>
						</div></li>

					<li class="cl"><a href=""><img src="${webtxc}/images/m-img24.jpg"
							width="155" height="115" /></a>
						<p>头盔 125 越野车</p>
						<p style="color: #999;">大狗摩托店铺</p>
						<div class="M-price cl">
							<span><img
								style="vertical-align: middle; margin-top: -2px;"
								src="${webtxc}/images/m-img23.jpg" width="20" height="20" />8454</span> <em
								class="fr">销量：152辆</em>
						</div></li>

					<li class="cl"><a href=""><img src="${webtxc}/images/m-img24.jpg"
							width="155" height="115" /></a>
						<p>头盔 125 越野车</p>
						<p style="color: #999;">大狗摩托店铺</p>
						<div class="M-price cl">
							<span><img
								style="vertical-align: middle; margin-top: -2px;"
								src="${webtxc}/images/m-img23.jpg" width="20" height="20" />8454</span> <em
								class="fr">销量：152辆</em>
						</div></li>

					<li class="cl"><a href=""><img src="${webtxc}/images/m-img24.jpg"
							width="155" height="115" /></a>
						<p>头盔 125 越野车</p>
						<p style="color: #999;">大狗摩托店铺</p>
						<div class="M-price cl">
							<span><img
								style="vertical-align: middle; margin-top: -2px;"
								src="${webtxc}/images/m-img23.jpg" width="20" height="20" />8454</span> <em
								class="fr">销量：152辆</em>
						</div></li>
				</ul>
			</div>

			<div class="M-indexR fr cl">
				<div class="M-annou cl">
					<h2 class="cl">
						<span>发现好店</span><a class="fr" href="">更多></a>
					</h2>
					<div class="M-shop">
						<a href=""><img src="${webtxc}/images/m-img25.jpg" width="175"
							height="70" /></a>
						<p>九加一官方店</p>
					</div>

					<div class="M-shop">
						<a href=""><img src="${webtxc}/images/m-img26.jpg" width="175"
							height="70" /></a>
						<p>东雁车品专营店</p>
					</div>

					<div class="M-shop">
						<a href=""><img src="${webtxc}/images/m-img25.jpg" width="175"
							height="70" /></a>
						<p>九加一官方店</p>
					</div>

				</div>
			</div>
			<!--/发现好店-->

		</div>
	</div>
	<!--/骑行装备-->

	<div class="M-wp cl">
		<div class="M-contain cl">
			<div class="M-recom fl cl" style="width: 100%;">
				<h1 class="M-h1 fl cl">
					<span><strong>个性定制</strong></span><em>彰显个人品味~</em> <a class="fr"
						href=""
						style="background: #a40000; color: #fff; text-align: center; display: block; padding: 0 10px; border-radius: 5px;">我要定制</a>
				</h1>
				<div class="M-custom fl">
					<a href=""><img src="${webtxc}/images/m-img27.jpg" width="500"
						height="342" /></a> <span>这是一种 情怀，给不一样的 你 ...——大狗摩托</span>
				</div>
				<ul class="M-UL02 fl cl">
					<li><a href=""><img src="${webtxc}/images/m-img28.jpg"
							width="235" height="165" /></a>
						<p>复古同样引领潮流——新大洲本田</p></li>

					<li><a href=""><img src="${webtxc}/images/m-img29.jpg"
							width="235" height="165" /></a>
						<p>复古同样引领潮流——新大洲本田</p></li>

					<li><a href=""><img src="${webtxc}/images/m-img30.jpg"
							width="235" height="165" /></a>
						<p>复古同样引领潮流——新大洲本田</p></li>

					<li><a href=""><img src="${webtxc}/images/m-img31.jpg"
							width="235" height="165" /></a>
						<p>复古同样引领潮流——新大洲本田</p></li>

				</ul>
			</div>
		</div>
	</div>
	<!--/个性定制-->

	<div class="M-wper cl">
		<div class="M-contain cl">
			<div class="M-voice fl cl">
				<h1 class="M-h1 fl cl">
					<span><strong>行业声音</strong></span><em>专业的报道~</em><a class="fr"
						href="">更多></a>
				</h1>
				<div class="M-V fl">
					<img src="${webtxc}/images/m-img32.jpg" width="224" height="152" />
				</div>
				<ul class="M-UL03 fr cl">
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5" /></em><a href="">央视：都是复古摩托车，中外有啥不同？</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5" /></em><a href="">央视：都是复古摩托车，中外有啥不同？</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5" /></em><a href="">央视：都是复古摩托车，中外有啥不同？</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5" /></em><a href="">央视：都是复古摩托车，中外有啥不同？</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5" /></em><a href="">央视：都是复古摩托车，中外有啥不同？</a></li>
				</ul>
			</div>

			<div class="M-voice fr cl">
				<h1 class="M-h1 fl cl">
					<span><strong>金融政策</strong></span><a class="fr" href="">更多></a>
				</h1>
				<ul class="M-UL04 cl">
					<li class="cl"><a href="">银行首推摩托车贷款 刷建行信用卡买高端摩托 </a><em
						class="fr">2016.3.28</em></li>
					<li class="cl"><a href="">银行首推摩托车贷款 刷建行信用卡买高端摩托 </a><em
						class="fr">2016.3.28</em></li>
					<li class="cl"><a href="">银行首推摩托车贷款 刷建行信用卡买高端摩托 </a><em
						class="fr">2016.3.28</em></li>
					<li class="cl"><a href="">银行首推摩托车贷款 刷建行信用卡买高端摩托 </a><em
						class="fr">2016.3.28</em></li>
					<li class="cl"><a href="">银行首推摩托车贷款 刷建行信用卡买高端摩托 </a><em
						class="fr">2016.3.28</em></li>
				</ul>

			</div>
		</div>
	</div>
	<!--/行业声音、金融政策-->

	<div class="M-wp cl">
		<div class="M-contain cl">
			<div class="M-voice fl cl">
				<h1 class="M-h1 fl cl">
					<span><strong>行业声音</strong></span><em>专业的报道~</em><a class="fr"
						href="">更多></a>
				</h1>
				<div class="M-theme fl">
					<a href=""><img src="${webtxc}/images/m-img33.png" width="324"
						height="350" /></a>
				</div>
				<div class="M-theimg fr">
					<a href=""><img src="${webtxc}/images/m-img34.jpg" width="158"
						height="110" /></a> <a href=""><img src="${webtxc}/images/m-img34.jpg"
						width="158" height="110" /></a> <a href=""><img
						src="${webtxc}/images/m-img34.jpg" width="158" height="110" /></a>
				</div>

			</div>

			<div class="M-voice fr cl">
				<h1 class="M-h1 fl cl">
					<span><strong>新品上市</strong></span><em>前进路上，总有一款车与你同行~</em><a
						class="fr" href="">更多></a>
				</h1>
				<ul class="M-UL05 fl cl">
					<li><a href=""><img src="${webtxc}/images/m-img28.jpg"
							width="235" height="165" /></a>
						<p>复古同样引领潮流——新大洲本田</p></li>

					<li><a href=""><img src="${webtxc}/images/m-img29.jpg"
							width="235" height="165" /></a>
						<p>复古同样引领潮流——新大洲本田</p></li>

					<li><a href=""><img src="${webtxc}/images/m-img30.jpg"
							width="235" height="165" /></a>
						<p>复古同样引领潮流——新大洲本田</p></li>

					<li><a href=""><img src="${webtxc}/images/m-img31.jpg"
							width="235" height="165" /></a>
						<p>复古同样引领潮流——新大洲本田</p></li>

				</ul>
			</div>
		</div>
	</div>
	<!--/主题活动、新品上市-->

	<div class="M-wper cl">
		<div class="M-contain cl">
			<h1 class="M-h1 fl cl">
				<span><strong>未来源流</strong></span>
			</h1>
			<div class="M-recom fl cl" style="width: 495px;">
				<div class="M-custom fl" style="height: 300px;">
					<a href=""><img src="${webtxc}/images/m-img27.jpg" width="495"
						height="300" /></a> <span>飘逸，灵动，迅捷，这就是中国造---力帆NH125</span>
				</div>
				<ul class="M-UL03 fl cl" style="width: 100%;">
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5" /></em><a href="">一部中国制造的好摩托 豪爵TR150开箱报告</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5" /></em><a href="">广州个体商家自发参加清风行动 擦亮“中国制造”</a></li>
				</ul>
			</div>

			<div class="M-recom fr cl" style="width: 495px;">
				<div class="M-custom fl" style="height: 300px;">
					<a href=""><img src="${webtxc}/images/m-img27.jpg" width="495"
						height="300" /></a> <span>飘逸，灵动，迅捷，这就是中国造---力帆NH125</span>
				</div>
				<ul class="M-UL03 fl cl" style="width: 100%;">
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5" /></em><a href="">一部中国制造的好摩托 豪爵TR150开箱报告</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5" /></em><a href="">广州个体商家自发参加清风行动 擦亮“中国制造”</a></li>
				</ul>
			</div>

		</div>
	</div>
	<!--/未来源流-->

	<div class="M-wp cl">
		<div class="M-contain cl">
			<div class="M-voice fl cl">
				<h1 class="M-h1 fl cl">
					<span><strong>专题报道</strong></span><em>在这里发现更多~</em><a class="fr"
						href="">更多></a>
				</h1>
				<dl class="M-DL02 fl cl">
					<dt>
						<a href=""><img src="${webtxc}/images/m-img35.jpg" width="140"
							height="90" /></a>
					</dt>
					<dd>
						<a href="">七夕特辑 | 哈雷女神邀你七夕一起Hish !</a>
						<p>摩托车越野赛的场地主要是选择在自然地形上进行，而超级越野 摩托车赛主要是选择人工修筑的场地进行，超级障碍赛的场地较
							小。</p>
					</dd>
				</dl>

				<dl class="M-DL02 fl cl">
					<dt>
						<a href=""><img src="${webtxc}/images/m-img35.jpg" width="140"
							height="90" /></a>
					</dt>
					<dd>
						<a href="">七夕特辑 | 哈雷女神邀你七夕一起Hish !</a>
						<p>摩托车越野赛的场地主要是选择在自然地形上进行，而超级越野 摩托车赛主要是选择人工修筑的场地进行，超级障碍赛的场地较
							小。</p>
					</dd>
				</dl>

			</div>

			<div class="M-voice fr cl">
				<h1 class="M-h1 fl cl">
					<span><strong>摩旅生活</strong></span><a class="fr" href="">进入论坛></a>
				</h1>
				<ul class="M-UL03 fl cl" style="width: 100%;">
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5"></em><a href="">情人节“净”喜不断，五羊-本田净原V2约惠团本田净原V2本田净原V2</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5"></em><a href="">广州个体商家自发参加清风行动 擦亮“中国制造”</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5"></em><a href="">情人节“净”喜不断，五羊-本田净原V2约惠团本田净原V2</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5"></em><a href="">广州个体商家自发参加清风行动 擦亮“中国制造”</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5"></em><a href="">情人节“净”喜不断，五羊-本田净原V2约惠团本田净原V2</a></li>
					<li><em><img src="${webtxc}/images/point.png" width="6"
							height="5"></em><a href="">广州个体商家自发参加清风行动
							擦亮“中国制造”本田净原V2本田净原V2本田净原V2</a></li>
				</ul>

			</div>
		</div>
	</div>
	<!--/专题报道、摩旅生活-->

</body>
</html>