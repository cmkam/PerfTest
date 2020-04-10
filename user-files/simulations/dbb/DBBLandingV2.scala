package dbb

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import com.typesafe.config._

class DBBLandingV2 extends Simulation {

	val conf=ConfigFactory.load()
	val baseUrl = conf.getString("baseUrl")
	println("baseUrl="+baseUrl)	

	val httpProtocol = http
		.baseUrl(baseUrl)
		//.inferHtmlResources(WhiteList("""https://.*.hsbc.com..*/.*"""), BlackList())
		.acceptHeader("application/x-es-module, */*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("zh-TW,zh;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,ja;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "*/*",
		"Origin" -> baseUrl,
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_2 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_3 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Origin" -> baseUrl,
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		//"X-BBXSRF" -> "c9bbbdf6-2709-43c7-b286-8e97670d213f")
		"X-BBXSRF" -> "${DBBHK_BBXSRF}")

	val headers_7 = Map(
		"Accept" -> "application/json",
		"Origin" -> baseUrl,
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		//"X-BBXSRF" -> "c9bbbdf6-2709-43c7-b286-8e97670d213f",
		"X-BBXSRF" -> "${DBBHK_BBXSRF}",
		"fromRoute" -> "wechat")

	val headers_9 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_10 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> baseUrl,
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		//"X-BBXSRF" -> "c9bbbdf6-2709-43c7-b286-8e97670d213f")
		"X-BBXSRF" -> "${DBBHK_BBXSRF}")

	val headers_13 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_22 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Origin" -> "null",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_23 = Map(
		"Accept" -> "*/*",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_26 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Sec-Fetch-Dest" -> "style",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_71 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "text/html, */*; q=0.01",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_73 = Map(
		"Accept" -> "*/*",
		"Origin" -> baseUrl,
		"Sec-Fetch-Dest" -> "font",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_75 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "*/*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_76 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "*/*",
		"Content-Type" -> "application/xml",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_78 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "*/*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_83 = Map(
		"ADRUM" -> "isAjax:true",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_120 = Map(
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_259 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> baseUrl,
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		//"X-BBXSRF" -> "61207e84-1b72-4e83-b638-b5cba9444e5c")
		"X-BBXSRF" -> "${DBBHK_BBXSRF}")

	val headers_260 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		//"X-BBXSRF" -> "61207e84-1b72-4e83-b638-b5cba9444e5c")
		"X-BBXSRF" -> "${DBBHK_BBXSRF}")

	val headers_268 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> baseUrl,
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		//"X-BBXSRF" -> "61207e84-1b72-4e83-b638-b5cba9444e5c")
		"X-BBXSRF" -> "${DBBHK_BBXSRF}")

	val headers_271 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_284 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Origin" -> baseUrl,
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		//"X-BBXSRF" -> "985d330d-0036-41f8-b889-c51d5b480e8c")
		"X-BBXSRF" -> "${DBBHK_BBXSRF}")



	val start = exec{ session =>
		  //println(session)
		  session}
		.exec(http("request_0")
			.get("/portalserver/logon").check( header("X-BBXSRF").saveAs("DBBHK_BBXSRF"))
			.headers(headers_0)
			.resources(http("request_1")
			.post("/portalserver/services/rest/logon/config")
			.headers(headers_1)))
		//.pause(1)
		.exec(http("request_2")
			.get("/portalserver%2Fstatic%2Ffeatures%2F%5BBBHOST%5D%2Fhsbc-config%2Fversion.json?ver=1586432337956")
			.headers(headers_2)
			.resources(http("request_3")
			.post("/portalserver/services/rest/logon/config")
			.headers(headers_3),
            http("request_4")
			.get("/portalserver/services/rest/locale/update?lang=en_US")
			.headers(headers_2),
            http("request_5")
			.get("/portalserver/logon?lang=en_US")
			.headers(headers_2),
            http("request_6")
			.get("/portalserver/services/rest/publicResource?fileName=iphone-mapping.json&ver=1584584688759")
			.headers(headers_2),
            //http("request_7")
			//.post("/portalserver/j_spring_security_logout?portalName=gbbportal")
			//.headers(headers_7),
            http("request_8")
			.get("/portalserver/services/rest/publicResource?fileName=username-rPanel-en-US.html&ver=1584584688759")
			.headers(headers_2),
            http("request_9")
			.get("/portalserver/static/idv-logon/assets/hsbc.png?ver=1579169225104")
			.headers(headers_9)))
		//.pause(53)
		// username
	val next = exec(http("request_10")
			.post("/portalserver/services/rest/auth/namecheck")
			.headers(headers_10)
			.body(RawFileBody("dbb/id/username.json"))
			.resources(http("request_11")
			.get("/portalserver/services/rest/publicResource?fileName=auth-rPanel-en-US.html&ver=1584584688759")
			.headers(headers_2),
            http("request_12")
			.get("/portalserver/services/rest/publicResource?fileName=express-info-en-US.html&ver=1584584688759")
			.headers(headers_2),
            http("request_13")
			.get("/portalserver/services/image?filePath=002_btn.jpg&nasPath=/nas/app/teamsite_content/application_resources/content/gbb/token")
			.headers(headers_13),
            http("request_14")
			.get("/portalserver/services/rest/publicResource?fileName=express-count-en-US.html&ver=1584584688759")
			.headers(headers_2),
            http("request_15")
			.get("/portalserver/services/rest/publicResource?fileName=express-badge-en-US.html&ver=1584584688759")
			.headers(headers_2),
            http("request_16")
			.get("/portalserver/services/image?filePath=modal-auth-landscape.jpg&nasPath=/nas/app/teamsite_content/application_resources/content/gbb/public/pre-logon")
			.headers(headers_13),
            http("request_17")
			.get("/portalserver/services/image?filePath=003.jpg&nasPath=/nas/app/teamsite_content/application_resources/content/gbb/token")
			.headers(headers_13),
            http("request_18")
			.get("/portalserver/hsbc/content/commercial/TxnBank/PWSRedesign/images/logon_qrcode.jpg")
			.headers(headers_13),
            http("request_19")
			.get("/portalserver/hsbc/content/commercial/TxnBank/PWSRedesign/images/logon_appstore.jpg")
			.headers(headers_13),
            http("request_20")
			.get("/portalserver/hsbc/content/commercial/TxnBank/PWSRedesign/images/logon_googleplay.jpg")
			.headers(headers_13)))
		//.pause(23)
		// password
	val logon=exec(http("request_21")
			.post("/portalserver/services/rest/auth/authenticate")//.check( header("X-BBXSRF").saveAs("DBBHK_BBXSRF_2"))
			.headers(headers_10)
			.body(RawFileBody("dbb/id/password.json"))
			.resources(http("request_22")
			.post("/portalserver/j_spring_security_check")
			.headers(headers_22)
			.formParam("businessType", "dbb")
			.formParam("redirectTarget", "/services/rest/user/profile/defaultSwitch")
			.formParam("locale", "en_US")
			//.formParam("BBXSRF", "61207e84-1b72-4e83-b638-b5cba9444e5c"),
			.formParam("BBXSRF", "${DBBHK_BBXSRF}"),
            http("request_23")
			.get("/portalserver/static/templates/%5BBBHOST%5D/HsbcDemoTemplate/scripts/EUM/LL/adrum.js?v=1585554196")
			.headers(headers_23),
            http("request_24")
			.get("/portalserver/static/ext-lib/jquery.min.js?v=1585554196")
			.headers(headers_23),
            http("request_25")
			.get("/portalserver/static/templates/%5BBBHOST%5D/HsbcDemoTemplate/scripts/appDTesting.js?v=1585554196")
			.headers(headers_23),
            http("request_26")
			.get("/portalserver/static/portalclient/css/normalize.min.css?v=1585554196")
			.headers(headers_26),
            http("request_27")
			.get("/portalserver/static/containers/%5BBBHOST%5D/container-hsbc-navigation-banking/styles/navbar.css")
			.headers(headers_26),
            http("request_28")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/CXPNavigationWidget/css/navigation.css")
			.headers(headers_26),
            http("request_29")
			.get("/portalserver/static/containers/%5BBBHOST%5D/process-container-tabs/styles/tabs.css")
			.headers(headers_26),
            http("request_30")
			.get("/portalserver/static/backbase.com.2012.aurora/css/shared.css?v=1585554196")
			.headers(headers_26),
            http("request_31")
			.get("/portalserver/static/backbase.com.2013.aurora/containers/ManageableArea/css/ManageableArea.css")
			.headers(headers_26),
            http("request_32")
			.get("/portalserver/static/containers/%5BBBHOST%5D/column-layout/styles/column.css")
			.headers(headers_26),
            http("request_33")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/CXPContentWidget/css/content.css")
			.headers(headers_26),
            http("request_34")
			.get("/portalserver/static/containers/%5BBBHOST%5D/container-deck/styles/deck.css?v=1585554196")
			.headers(headers_26),
            http("request_35")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/CXPContentWidget/css/templates.css")
			.headers(headers_26),
            http("request_36")
			.get("/portalserver/static/portalclient/css/backbase-portal.css?v=1585554196")
			.headers(headers_26),
            http("request_37")
			.get("/portalserver/static/portalclient/controllers/ctrl.portal.js?v=1585554196")
			.headers(headers_23),
            http("request_38")
			.get("/portalserver/static/portalclient/controllers/ctrl.preferences.js?v=1585554196")
			.headers(headers_23),
            http("request_39")
			.get("/portalserver/static/portalclient/portal_view.js?v=1585554196")
			.headers(headers_23),
            http("request_40")
			.get("/portalserver/static/portalclient/compatibility.js?v=1585554196")
			.headers(headers_23),
            http("request_41")
			.get("/portalserver/static/features/%5BBBHOST%5D/theme-hk-whitelabel/styles/theme-hk-whitelabel.css?v=1585554196")
			.headers(headers_26),
            http("request_42")
			.get("/portalserver/static/portalclient/xml-lang/backbase.com.2012.view/js/all.js?v=1585554196")
			.headers(headers_23),
            http("request_43")
			.get("/portalserver/static/portalclient/xml-lang/www.w3.org.1999.xhtml/xhtml.js")
			.headers(headers_23),
            http("request_44")
			.get("/portalserver/static/portalclient/xml-lang/backbase.com.2013/backbase.com.2013.js?v=1585554196")
			.headers(headers_23),
            http("request_45")
			.get("/portalserver/static/features/%5BBBHOST%5D/feature-hsbc-utils-ng/scripts/feature-hsbc-utils-ng.js?v=1585554196")
			.headers(headers_23),
            http("request_46")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-core-js/scripts/vendor-bb-core-js.js?v=1585554196")
			.headers(headers_23),
            http("request_47")
			.get("/portalserver/static/backbase.com.2012.aurora/js/aurora-lib.min.js?v=1585554196")
			.headers(headers_23),
            http("request_48")
			.get("/portalserver/static/templates/%5BBBHOST%5D/HsbcDemoTemplate/scripts/main.js?v=1585554196")
			.headers(headers_23),
            http("request_49")
			.get("/portalserver/static/templates/%5BBBHOST%5D/HsbcDemoTemplate/scripts/sideNavigation.js?v=1585554196")
			.headers(headers_23),
            http("request_50")
			.get("/portalserver/static/templates/%5BBBHOST%5D/HsbcDemoTemplate/scripts/devTag.js?v=1585554196")
			.headers(headers_23),
            http("request_51")
			.get("/portalserver/templates/HsbcNavigationBankingLayout/template.js?v=1585554196")
			.headers(headers_23),
            http("request_52")
			.get("/portalserver/static/containers/%5BBBHOST%5D/container-hsbc-navigation-banking/scripts/navbar.js?v=1585554196")
			.headers(headers_23),
            http("request_53")
			.get("/portalserver/static/containers/%5BBBHOST%5D/container-hsbc-navigation-banking/scripts/vendors/bootstrap.min.js")
			.headers(headers_23),
            http("request_54")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/CXPNavigationWidget/js/navigation.js")
			.headers(headers_23),
            http("request_55")
			.get("/portalserver/static/backbase.com.2013.aurora/containers/ManageableArea/js/ManageableArea.js")
			.headers(headers_23),
            http("request_56")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-start/scripts/lib-bb-start.js")
			.headers(headers_23),
            http("request_57")
			.get("/portalserver/static/features/%5BBBHOST%5D/config-bb-module-loader/scripts/config-bb-module-loader.js")
			.headers(headers_23),
            http("request_58")
			.get("/portalserver/templates/ManageableArea/template.js")
			.headers(headers_23),
            http("request_59")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-systemjs/scripts/vendor-bb-systemjs.js")
			.headers(headers_23),
            http("request_60")
			.get("/portalserver/templates/ColumnsWebContainer/template.js")
			.headers(headers_23),
            http("request_61")
			.get("/portalserver/templates/ProcessTabs/template.js?v=1585554196")
			.headers(headers_23),
            http("request_62")
			.get("/portalserver/static/containers/%5BBBHOST%5D/column-layout/scripts/column.js")
			.headers(headers_23),
            http("request_63")
			.get("/portalserver/static/containers/%5BBBHOST%5D/container-deck/scripts/deck.js?v=1585554196")
			.headers(headers_23),
            http("request_64")
			.get("/portalserver/templates/DeckContainer/template.js?v=1585554196")
			.headers(headers_23),
            http("request_65")
			.get("/portalserver/static/containers/%5BBBHOST%5D/process-container-tabs/scripts/tabs.js")
			.headers(headers_23),
            http("request_66")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/CXPContentWidget/js/content.js")
			.headers(headers_23),
            http("request_67")
			.get("/portalserver/static/ext-lib/jquery-migrate.js?v=1585554196")
			.headers(headers_23),
            http("request_68")
			.get("/portalserver/static/ext-lib/soyutils.js?v=1585554196")
			.headers(headers_23),
            http("request_69")
			.get("/portalserver/content/api/contentstream-id/contentRepository/ed513145-bf4b-4081-97d6-6e3843176ff3/HSBC-logo-en-us-new-wc2.svg")
			.headers(headers_13),
            http("request_70")
			.get("/portalserver/static/portalclient/client.js?v=1585554196")
			.headers(headers_23),
            http("request_71")
			.get("/portalserver/configuration/url2state/identifier")
			.headers(headers_71)
			.check(status.in(403,200)),
            http("request_72")
			.get("/portalserver/static/backbase.com.2012.aurora/css/shared.css")
			.headers(headers_26),
            http("request_73")
			.get("/portalserver/static/features/%5BBBHOST%5D/theme-hk-whitelabel/styles/0a7dff91e34a70924e71ba8f65883664.woff")
			.headers(headers_73),
            http("request_74")
			.get("/portalserver/static/features/%5BBBHOST%5D/theme-hk-whitelabel/styles/e617cade1dd294d99fd9706d1cb43fae.woff2")
			.headers(headers_73),
            http("request_75")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-translation-files-ng.json?v=1585554196")
			.headers(headers_75),
            http("request_76")
			.get("/portalserver/static/containers/%5BBBHOST%5D/container-panel/config.xml")
			.headers(headers_76),
            http("request_77")
			.get("/portalserver/static/containers/%5BBBHOST%5D/container-panel/styles/panel.css")
			.headers(headers_26),
            http("request_78")
			.get("/portalserver/templates/PanelContainer/template.js?v=1585554196")
			.headers(headers_78),
            http("request_79")
			.get("/portalserver/static/containers/%5BBBHOST%5D/container-panel/scripts/panel.js?v=1585554196")
			.headers(headers_78),
            http("request_80")
			.get("/portalserver/static/backbase.com.2012.aurora/html/chromes/widget_none.html")
			.headers(headers_71),
            http("request_81")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-bb-direct-debit-ng/index.html?ver=1.3.1")
			.headers(headers_78),
            http("request_82")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-standing-payment-orders-ng/index.html?ver=1.107.20")
			.headers(headers_78),
            http("request_83")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-start-ng/scripts/lib-bb-start-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_84")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-direct-debit-ng/templates/template.ng.html?v=1585554196")
			.headers(headers_78),
            http("request_85")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-standing-payment-orders-list-upgrade-ng/templates/template.ng.html?v=1585554196")
			.headers(headers_78),
            http("request_86")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-event-bus/scripts/lib-bb-event-bus.js?v=1585554196")
			.headers(headers_83),
            http("request_87")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-event-bus-ng/scripts/lib-bb-event-bus-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_88")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-widget-ng/scripts/lib-bb-widget-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_89")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-angular/scripts/vendor-bb-angular.js?v=1585554196")
			.headers(headers_83),
            http("request_90")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-i18n-ng/scripts/lib-bb-i18n-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_91")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-widget/scripts/lib-bb-widget.js?v=1585554196")
			.headers(headers_83),
            http("request_92")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-state-container-ng/scripts/lib-bb-state-container-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_93")
			.get("/portalserver/static/features/%5BBBHOST%5D/config-bb-locale/scripts/config-bb-locale.js?v=1585554196")
			.headers(headers_83),
            http("request_94")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-widget-extension-ng/scripts/lib-bb-widget-extension-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_95")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-extension-helpers-ng/scripts/lib-bb-extension-helpers-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_96")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-extension-events-ng/scripts/lib-bb-extension-events-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_97")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-storage-ng/scripts/lib-bb-storage-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_98")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-storage/scripts/lib-bb-storage.js?v=1585554196")
			.headers(headers_83),
            http("request_99")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-state-container/scripts/lib-bb-state-container.js?v=1585554196")
			.headers(headers_83),
            http("request_100")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-notifications-ng/scripts/lib-bb-notifications-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_101")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-extension-intents-ng/scripts/lib-bb-extension-intents-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_102")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-view-model-ng/scripts/lib-bb-view-model-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_103")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-compose-selectors/scripts/lib-bb-compose-selectors.js?v=1585554196")
			.headers(headers_83),
            http("request_104")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-intent-ng/scripts/lib-bb-intent-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_105")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-bb-user-menu-ng/scripts/widget-bb-user-menu-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_106")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-user-menu-ng.json?v=1585554196")
			.headers(headers_83),
            http("request_107")
			.get("/portalserver/static/features/%5BBBHOST%5D/config-hsbc-providers-ng/scripts/config-hsbc-providers-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_108")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-user-menu-ng/scripts/ext-hsbc-user-menu-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_109")
			.get("/portalserver/static/features/%5BBBHOST%5D/config-bb-locale/assets/angular-locale_en-us.js?v=1585554196")
			.headers(headers_83),
            http("request_110")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-payme-overlay-ng/scripts/widget-hsbc-payme-overlay-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_111")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-payme-overlay-ng.json?v=1585554196")
			.headers(headers_83),
            http("request_112")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-payme-overlay-ng/scripts/ext-hsbc-payme-overlay-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_113")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-overlay-high-risk-ng/scripts/ext-hsbc-overlay-high-risk-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_114")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-overlay-high-risk-ng.json?v=1585554196")
			.headers(headers_83),
            http("request_115")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-onboarding-overlay-ng/scripts/widget-hsbc-onboarding-overlay-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_116")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-quick-tour-ng/scripts/widget-hsbc-quick-tour-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_117")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-quick-tour-ng.json?v=1585554196")
			.headers(headers_83),
            http("request_118")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-quick-tour-ng/scripts/ext-hsbc-quick-tour-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_119")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-notification-popups-ng.json?v=1585554196")
			.headers(headers_83),
            http("request_120")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-pending-authorisation-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_121")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-notification-popups-ng/scripts/widget-hsbc-notification-popups-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_122")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-notification-popups-ng/scripts/ext-hsbc-notification-popups-ng.js?v=1585554196")
			.headers(headers_83),
            http("request_123")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-pending-authorisation-ng/scripts/widget-hsbc-pending-authorisation-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_124")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-pending-authorisation-ng/scripts/ext-hsbc-pending-authorisation-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_125")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-account-overview-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_126")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-account-overview-ng/scripts/ext-hsbc-account-overview-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_127")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-banner-ng/scripts/widget-hsbc-banner-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_128")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-banner-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_129")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-product-summary-ng/scripts/widget-hsbc-product-summary-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_130")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-banner-ng/scripts/ext-hsbc-banner-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_131")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-insights-box-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_132")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-context-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_133")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-insights-box-ng/scripts/widget-hsbc-insights-box-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_134")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-context-ng/scripts/widget-hsbc-context-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_135")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-insights-box-ng/scripts/ext-hsbc-insights-box-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_136")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-context-ng/scripts/ext-hsbc-context-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_137")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-contact-us-ng/scripts/widget-hsbc-contact-us-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_138")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-contact-us-ng/scripts/ext-hsbc-contact-us-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_139")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-contact-us-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_140")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-trading-quote-ng/scripts/ext-hsbc-trading-quote-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_141")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-trading-quote-ng/scripts/widget-hsbc-trading-quote-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_142")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-session-ng/scripts/ext-hsbc-session-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_143")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-trading-quote-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_144")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-session-ng/scripts/widget-hsbc-session-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_145")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-session-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_146")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-analytics-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_147")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-analytics-ng/scripts/widget-hsbc-analytics-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_148")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-analytics-ng/scripts/ext-hsbc-analytics-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_149")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-switching-profile-ng/scripts/widget-hsbc-switching-profile-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_150")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-switching-profile-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_151")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-notification-badge-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_152")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-switching-profile-ng/scripts/ext-hsbc-switching-profile-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_153")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-notification-badge-ng/scripts/widget-hsbc-notification-badge-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_154")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-notification-badge-ng/scripts/ext-hsbc-notification-badge-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_155")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-language-switching-ng/scripts/widget-hsbc-language-switching-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_156")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-language-switching-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_157")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-direct-debit-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_158")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-language-switching-ng/scripts/ext-hsbc-language-switching-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_159")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-bb-direct-debit-ng/scripts/widget-bb-direct-debit-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_160")
			.get("/portalserver/static/widgets/%5BBBHOST%5D/widget-hsbc-standing-payment-orders-ng/scripts/widget-hsbc-standing-payment-orders-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_161")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-direct-debit-ng/scripts/ext-hsbc-direct-debit-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_162")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-standing-payment-orders-list-upgrade-ng.json?v=1585554196")
			.headers(headers_120),
            http("request_163")
			.get("/portalserver/static/features/%5BBBHOST%5D/ext-hsbc-standing-payment-orders-list-upgrade-ng/scripts/ext-hsbc-standing-payment-orders-list-upgrade-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_164")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-login-logout-notifier-ng/scripts/lib-bb-login-logout-notifier-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_165")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-bb-login-ng/scripts/model-bb-login-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_166")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-angular-ng-aria/scripts/vendor-bb-angular-ng-aria.js?v=1585554196")
			.headers(headers_120),
            http("request_167")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-user-data-ng/scripts/lib-bb-user-data-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_168")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-i18n-ng/scripts/ui-bb-i18n-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_169")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-avatar-ng/scripts/ui-bb-avatar-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_170")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-dropdown-select-ng/scripts/ui-bb-dropdown-select-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_171")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-modal/scripts/vendor-bb-uib-modal.js?v=1585554196")
			.headers(headers_120),
            http("request_172")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-trust-html-ng/scripts/ui-hsbc-trust-html-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_173")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-popover/scripts/vendor-bb-uib-popover.js?v=1585554196")
			.headers(headers_120),
            http("request_174")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-date-label-filter-ng/scripts/ui-bb-date-label-filter-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_175")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-alert/scripts/vendor-bb-uib-alert.js?v=1585554196")
			.headers(headers_120),
            http("request_176")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-message-ng/scripts/ui-hsbc-message-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_177")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-onboarding-overlay-ng/scripts/ui-hsbc-onboarding-overlay-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_178")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-hrt-overlay-ng/scripts/model-hsbc-hrt-overlay-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_179")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-notification-ng/scripts/model-hsbc-notification-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_180")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-hsbc-intro/scripts/vendor-hsbc-intro.js?v=1585554196")
			.headers(headers_120),
            http("request_181")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-angular-sanitize/scripts/vendor-bb-angular-sanitize.js?v=1585554196")
			.headers(headers_120),
            http("request_182")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-substitute-error-ng/scripts/ui-hsbc-substitute-error-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_183")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-pending-authorisation-ng/scripts/model-hsbc-pending-authorisation-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_184")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-banner-ng/scripts/model-hsbc-banner-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_185")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-accordion/scripts/vendor-bb-uib-accordion.js?v=1585554196")
			.headers(headers_120),
            http("request_186")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-element-dimensions-ng/scripts/ui-bb-element-dimensions-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_187")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-dropdown/scripts/vendor-bb-uib-dropdown.js?v=1585554196")
			.headers(headers_120),
            http("request_188")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-account-number-ng/scripts/ui-hsbc-account-number-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_189")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-account-balance-ng/scripts/ui-hsbc-account-balance-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_190")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-i18n-ng/scripts/ui-hsbc-i18n-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_191")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-hsbc-moment/scripts/vendor-hsbc-moment.js?v=1585554196")
			.headers(headers_120),
            http("request_192")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-product-summary-ng/scripts/model-hsbc-product-summary-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_193")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-bb-product-summary-ng/scripts/model-bb-product-summary-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_194")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-carousel-indicator-ng/scripts/ui-hsbc-carousel-indicator-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_195")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-model-errors/scripts/lib-bb-model-errors.js?v=1585554196")
			.headers(headers_120),
            http("request_196")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-banner-video/scripts/ui-hsbc-banner-video.js?v=1585554196")
			.headers(headers_120),
            http("request_197")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-insights-ng/scripts/model-hsbc-insights-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_198")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-lodash/scripts/vendor-lodash.js?v=1585554196")
			.headers(headers_120),
            http("request_199")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-tfx-survey-ng/scripts/ui-hsbc-tfx-survey-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_200")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-hsbc-angular-animation/scripts/vendor-hsbc-angular-animation.js?v=1585554196")
			.headers(headers_120),
            http("request_201")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-insights-ng/scripts/ui-hsbc-insights-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_202")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-contact-us-ng/scripts/model-hsbc-contact-us-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_203")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-hsbc-utils-date/scripts/lib-hsbc-utils-date.js?v=1585554196")
			.headers(headers_120),
            http("request_204")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-loading-indicator-ng/scripts/ui-bb-loading-indicator-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_205")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-paginator-ng/scripts/ui-bb-paginator-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_206")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-format-amount-ng/scripts/ui-bb-format-amount-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_207")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-notification-stripe-ng/scripts/ui-bb-notification-stripe-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_208")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-empty-state-ng/scripts/ui-bb-empty-state-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_209")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-dropdown-select-trading-ng/scripts/ui-hsbc-dropdown-select-trading-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_210")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-button-with-icon-ng/scripts/ui-hsbc-button-with-icon-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_211")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-trading-quote-ng/scripts/model-hsbc-trading-quote-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_212")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-bind-html-compile-ng/scripts/ui-hsbc-bind-html-compile-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_213")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-timer-ng/scripts/ui-hsbc-timer-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_214")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-modal-ng/scripts/ui-bb-modal-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_215")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-session-ng/scripts/model-hsbc-session-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_216")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-hsbc-user-activity-ng/scripts/lib-hsbc-user-activity-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_217")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-switch-profile-ng/scripts/model-hsbc-switch-profile-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_218")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-hsbc-hide-menu-ng/scripts/ui-hsbc-hide-menu-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_219")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-bb-notifications-ng/scripts/model-bb-notifications-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_220")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-hsbc-launchpad-ng/scripts/model-hsbc-launchpad-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_221")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-load-more-ng/scripts/ui-bb-load-more-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_222")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-confirm-ng/scripts/ui-bb-confirm-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_223")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-message-ng/scripts/ui-bb-message-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_224")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-substitute-error-ng/scripts/ui-bb-substitute-error-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_225")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-loading-overlay-ng/scripts/ui-bb-loading-overlay-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_226")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-bb-payment-ng/scripts/model-bb-payment-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_227")
			.get("/portalserver/static/features/%5BBBHOST%5D/model-bb-payment-orders-ng/scripts/model-bb-payment-orders-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_228")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-tooltip/scripts/vendor-bb-uib-tooltip.js?v=1585554196")
			.headers(headers_120),
            http("request_229")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-inline-status-ng/scripts/ui-bb-inline-status-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_230")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-sortable-column-ng/scripts/ui-bb-sortable-column-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_231")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bb-ellipsis-tooltip-ng/scripts/ui-bb-ellipsis-tooltip-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_232")
			.get("/portalserver/static/features/%5BBBHOST%5D/ui-bus-payment-order-details-ng/scripts/ui-bus-payment-order-details-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_233")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-bb-cxp-authentication-http-ng/scripts/data-bb-cxp-authentication-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_234")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-position/scripts/vendor-bb-uib-position.js?v=1585554196")
			.headers(headers_120),
            http("request_235")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-stacked-map/scripts/vendor-bb-uib-stacked-map.js?v=1585554196")
			.headers(headers_120),
            http("request_236")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-notifications-http-ng/scripts/data-hsbc-notifications-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_237")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-hrt-overlay-http-ng/scripts/data-hsbc-hrt-overlay-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_238")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-authorisation-http-ng/scripts/data-hsbc-authorisation-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_239")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-banner-http-ng/scripts/data-hsbc-banner-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_240")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-collapse/scripts/vendor-bb-uib-collapse.js?v=1585554196")
			.headers(headers_120),
            http("request_241")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-bb-arrangements-http-ng/scripts/data-bb-arrangements-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_242")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-bb-product-summary-http-ng/scripts/data-bb-product-summary-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_243")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-insights-http-ng/scripts/data-hsbc-insights-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_244")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-survey-http-ng/scripts/data-hsbc-survey-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_245")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-contact-http-ng/scripts/data-hsbc-contact-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_246")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-pagination/scripts/vendor-bb-uib-pagination.js?v=1585554196")
			.headers(headers_120),
            http("request_247")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-currency-ng/scripts/lib-bb-currency-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_248")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-trading-http-ng/scripts/data-hsbc-trading-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_249")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-auth-http-ng/scripts/data-hsbc-auth-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_250")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-switch-profile-http-ng/scripts/data-hsbc-switch-profile-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_251")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-bb-notifications-http-ng/scripts/data-bb-notifications-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_252")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-hsbc-launchpad-http-ng/scripts/data-hsbc-launchpad-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_253")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-bb-contact-http-ng/scripts/data-bb-contact-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_254")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-bb-payments-http-ng/scripts/data-bb-payments-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_255")
			.get("/portalserver/static/features/%5BBBHOST%5D/data-bb-payment-orders-http-ng/scripts/data-bb-payment-orders-http-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_256")
			.get("/portalserver/static/features/%5BBBHOST%5D/lib-bb-challenge-ng/scripts/lib-bb-challenge-ng.js?v=1585554196")
			.headers(headers_120),
            http("request_257")
			.get("/portalserver/static/features/%5BBBHOST%5D/theme-hk-whitelabel/styles/825cf394d755963de052cb8dd5f02ebd.png")
			.headers(headers_13),
            http("request_258")
			.get("/portalserver/static/features/%5BBBHOST%5D/vendor-bb-uib-paging/scripts/vendor-bb-uib-paging.js?v=1585554196")
			.headers(headers_120),
            http("request_259")
			.post("/portalserver/services/rest/user/profile/list")
			.headers(headers_259)
			.body(RawFileBody("dbb/dbblandingv2/0259_request.json"))
			.check(status.in(200, 302, 400)),//TODO            
            http("request_260")
			.get("/portalserver/services/rest/api/v2/users/userId1")
			.headers(headers_260),
            http("request_261")
			.get("/portalserver/static/features/%5BBBHOST%5D/theme-hk-whitelabel/styles/e1e080887a14a587dbd1f56a36b6fad1.woff2")
			.headers(headers_73),
            http("request_262")
			.get("/portalserver/services/rest/api/v2/productsummary")
			.headers(headers_2),
            http("request_263")
			.get("/portalserver/static/features/%5BBBHOST%5D/theme-hk-whitelabel/styles/70b7f60d52bd9d8776e117cf4a359d54.woff2")
			.headers(headers_73),
            http("request_264")
			.post("/portalserver/services/rest/messageBox/PropertiesReader?fileName=TFXRateExplainedFile&subPath=wc2%2FTFXRateExplainedPath&language=en-US")
			.headers(headers_259)
			.body(RawFileBody("dbb/dbblandingv2/0264_request.json"))
			.check(status.in(200, 302, 400)),//TODO
            http("request_265")
			.get("/portalserver/services/rest/api/v2/insights")
			.headers(headers_2),
            http("request_266")
			.get("/portalserver/services/rest/api/v2/authorisation?accountId=all&authorizationRequestFlag=N&transactionSubType=AUTH&type=briefness")
			.headers(headers_2),
            http("request_267")
			.get("/portalserver/services/rest/api/v2/trading/currencies")
			.headers(headers_2),
            http("request_268")
			.post("/portalserver/services/rest/messageBox/PropertiesReader?fileName=permissionLeftMenuConfig&subPath=leftmenu")
			.headers(headers_268)
			.body(RawFileBody("dbb/dbblandingv2/0268_request.json"))
			.check(status.in(200, 302, 400)),//TODO
            http("request_269")
			.post("/portalserver/services/rest/email/list")
			.headers(headers_259)
			.body(RawFileBody("dbb/dbblandingv2/0269_request.json"))
			.check(status.in(200, 302, 400)),//TODO
            http("request_270")
			.get("/portalserver/services/rest/api/v2/banner/campaign")
			.headers(headers_2),
            http("request_271")
			.get("/portalserver/portals/gbbportal.xml?pc=false")
			.headers(headers_271)
			.check(status.in(200, 302, 403)),//TODO
            http("request_272")
			.get("/portalserver/services/rest/api/v2/notifications/stream")
			.headers(headers_2),
            http("request_273")
			.get("/portalserver/static/features/%5BBBHOST%5D/theme-hk-whitelabel/styles/904a7923d1688b54e3f95215125d2c33.svg")
			.headers(headers_13),
            http("request_274")
			.get("/portalserver/static/features/%5BBBHOST%5D/theme-hk-whitelabel/styles/224cb788b55023559085a29783803bc5.svg")
			.headers(headers_13),
            http("request_275")
			.get("/portalserver/services/rest/api/v2/contact/rm")
			.headers(headers_2),
            http("request_276")
			.post("/portalserver/services/rest/api/v2/insight/retrieve")
			.headers(headers_268)
			.body(RawFileBody("dbb/dbblandingv2/0276_request.json"))
			.check(status.in(200, 302, 400)),//TODO
            http("request_277")
			.get("/portalserver/services/rest/resource/campaign/image/payNoti_collapse_en.jpg")
			.headers(headers_13),
            http("request_278")
			.get("/portalserver/services/rest/resource/campaign/image/cmbcard_collapse.jpg")
			.headers(headers_13),
            http("request_279")
			.get("/portalserver/services/rest/resource/ask-amy/img_AskAmy_mobileandweb.jpg")
			.headers(headers_13),
            http("request_280")
			.get("/portalserver/services/rest/resource/rmPhoto/43377131.jpg")
			.headers(headers_13)
			.check(status.in(498, 200)),
            http("request_281")
			.get("/portalserver/services/rest/api/v2/payments/direct-debits?currentPage=1&direction=DESC&from=0&maxNavPages=3&orderBy=date&paginationType=pagination&size=50&totalItems=0")
			.headers(headers_2)))
		//.pause(120)
		// logoff
		val logout=exec(http("request_282")
			.post("/portalserver/j_spring_security_logout?portalName=gbbportal")//.check( header("X-BBXSRF").saveAs("DBBHK_BBXSRF_3"))
			.headers(headers_22)
			.formParam("delegate", "true")
			.resources(http("request_283")
			.get("/portalserver/services/image?filePath=banner_logout_1.jpg&nasPath=/nas/app/teamsite_content/application_resources/content/gbb/public/pre-logon")
			.headers(headers_13),
            http("request_284")
			.post("/portalserver/services/rest/logon/config")
			.headers(headers_284),
            http("request_285")
			.get("/portalserver/services/image?filePath=banner_logout_2.jpg&nasPath=/nas/app/teamsite_content/application_resources/content/gbb/public/pre-logon")
			.headers(headers_13),
            http("request_286")
			.get("/portalserver/services/image?filePath=banner_logout_3.jpg&nasPath=/nas/app/teamsite_content/application_resources/content/gbb/public/pre-logon")
			.headers(headers_13),
            http("request_287")
			.get("/portalserver%2Fstatic%2Ffeatures%2F%5BBBHOST%5D%2Fhsbc-config%2Fversion.json?ver=1586432476358")
			.headers(headers_2),
            http("request_288")
			.post("/portalserver/services/rest/logon/config")
			.headers(headers_284),
            http("request_289")
			.get("/portalserver/services/rest/locale/update?lang=en_US")
			.headers(headers_2)))

	
	val scn = scenario("DBBLandingV2").repeat(1){exec(
		group("start"){start}, 
		group("next"){next}, 
		group("logon"){logon.pause(5)}, 
		group("refresh"){repeat(3){dbb.DBBLandingRefresh.refresh.pause(60)}},
		group("logout"){logout})}
	//setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
	//val scn = scenario("DbbR6V1WC2V2").repeat(1){exec(start,next,logon)}
//rampUsers(1280) during(10 minutes)


//atOnceUsers(1)
	//setUp(scn.inject(rampUsers(50) during(2 minutes))).protocols(httpProtocol)
	setUp(scn.inject(rampUsers(5) during(30 seconds))).protocols(httpProtocol)


}