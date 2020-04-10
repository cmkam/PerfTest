package dbb

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import com.typesafe.config._

package object DBBLandingRefresh  {

	val conf=ConfigFactory.load()
	val baseUrl = conf.getString("baseUrl")
	println("baseUrlRefresh="+baseUrl)	

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "*/*",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_5 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_7 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "text/html, */*; q=0.01",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_8 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "*/*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_9 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "*/*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_10 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_11 = Map(
		"ADRUM" -> "isAjax:true",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_16 = Map(
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_30 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_31 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> baseUrl,
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		//"X-BBXSRF" -> "dabc5a41-6bb2-4e93-90ec-3e9f831d7493")
		"X-BBXSRF" -> "${DBBHK_BBXSRF}")

	val headers_32 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		//"X-BBXSRF" -> "dabc5a41-6bb2-4e93-90ec-3e9f831d7493")
		"X-BBXSRF" -> "${DBBHK_BBXSRF}")

	val headers_40 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> baseUrl,
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		//"X-BBXSRF" -> "dabc5a41-6bb2-4e93-90ec-3e9f831d7493")
		"X-BBXSRF" -> "${DBBHK_BBXSRF}")

	val headers_42 = Map(
		"ADRUM" -> "isAjax:true",
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")



	//val scn = scenario("DBBLandingRefresh")
	val refresh = exec(http("LandingRefresh_0")
			.get("/portalserver/gbbportal/en-us/home-wc2").check( header("X-BBXSRF").saveAs("DBBHK_BBXSRF"))
			.headers(headers_0)
			.resources(http("LandingRefresh_1")
			.get("/portalserver/templates/HsbcNavigationBankingLayout/template.js?v=1585554196")
			.headers(headers_1),
            http("LandingRefresh_2")
			.get("/portalserver/templates/ManageableArea/template.js")
			.headers(headers_1),
            http("LandingRefresh_3")
			.get("/portalserver/templates/ColumnsWebContainer/template.js")
			.headers(headers_1),
            http("LandingRefresh_4")
			.get("/portalserver/templates/DeckContainer/template.js?v=1585554196")
			.headers(headers_1),
            http("LandingRefresh_5")
			.get("/portalserver/content/api/contentstream-id/contentRepository/ed513145-bf4b-4081-97d6-6e3843176ff3/HSBC-logo-en-us-new-wc2.svg")
			.headers(headers_5),
            http("LandingRefresh_6")
			.get("/portalserver/templates/ProcessTabs/template.js?v=1585554196")
			.headers(headers_1),
            http("LandingRefresh_7")
			.get("/portalserver/configuration/url2state/identifier")
			.headers(headers_7)
			.check(status.in(403,200)),
            http("LandingRefresh_8")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-translation-files-ng.json?v=1585554196")
			.headers(headers_8),
            http("LandingRefresh_9")
			.get("/portalserver/templates/PanelContainer/template.js?v=1585554196")
			.headers(headers_9),
            http("LandingRefresh_10")
			.get("/portalserver/static/features/%5BBBHOST%5D/theme-hk-whitelabel/assets/images/hsbc.png?1585554196")
			.headers(headers_10),
            http("LandingRefresh_11")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-user-menu-ng.json?v=1585554196")
			.headers(headers_11),
            http("LandingRefresh_12")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-payme-overlay-ng.json?v=1585554196")
			.headers(headers_11),
            http("LandingRefresh_13")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-overlay-high-risk-ng.json?v=1585554196")
			.headers(headers_11),
            http("LandingRefresh_14")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-quick-tour-ng.json?v=1585554196")
			.headers(headers_11),
            http("LandingRefresh_15")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-notification-popups-ng.json?v=1585554196")
			.headers(headers_11),
            http("LandingRefresh_16")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-pending-authorisation-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_17")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-account-overview-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_18")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-banner-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_19")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-insights-box-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_20")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-context-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_21")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-contact-us-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_22")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-trading-quote-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_23")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-session-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_24")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-switching-profile-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_25")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-analytics-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_26")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-notification-badge-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_27")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-language-switching-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_28")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-direct-debit-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_29")
			.get("/portalserver/hsbc/wc2/resource/NLS/ext-hsbc-standing-payment-orders-list-upgrade-ng.json?v=1585554196")
			.headers(headers_16),
            http("LandingRefresh_30")
			.get("/portalserver/services/rest/api/v2/notifications/stream")
			.headers(headers_30),
            http("LandingRefresh_31")
			.post("/portalserver/services/rest/user/profile/list")
			.headers(headers_31)
			.body(RawFileBody("dbb/dbblandingrefresh/0031_request.json")),
            http("LandingRefresh_32")
			.get("/portalserver/services/rest/api/v2/users/userId1")
			.headers(headers_32),
            http("LandingRefresh_33")
			.get("/portalserver/services/rest/api/v2/productsummary")
			.headers(headers_30),
            http("LandingRefresh_34")
			.post("/portalserver/services/rest/messageBox/PropertiesReader?fileName=TFXRateExplainedFile&subPath=wc2%2FTFXRateExplainedPath&language=en-US")
			.headers(headers_31)
			.body(RawFileBody("dbb/dbblandingrefresh/0034_request.json")),
            http("LandingRefresh_35")
			.get("/portalserver/services/rest/api/v2/insights")
			.headers(headers_30),
            http("LandingRefresh_36")
			.get("/portalserver/services/rest/api/v2/trading/currencies")
			.headers(headers_30),
            http("LandingRefresh_37")
			.get("/portalserver/services/rest/api/v2/authorisation?accountId=all&authorizationRequestFlag=N&transactionSubType=AUTH&type=briefness")
			.headers(headers_30),
            http("LandingRefresh_38")
			.post("/portalserver/services/rest/email/list")
			.headers(headers_31)
			.body(RawFileBody("dbb/dbblandingrefresh/0038_request.json")),
            http("LandingRefresh_39")
			.get("/portalserver/services/rest/api/v2/banner/campaign")
			.headers(headers_30),
            http("LandingRefresh_40")
			.post("/portalserver/services/rest/messageBox/PropertiesReader?fileName=permissionLeftMenuConfig&subPath=leftmenu")
			.headers(headers_40)
			.body(RawFileBody("dbb/dbblandingrefresh/0040_request.json")),
            http("LandingRefresh_41")
			.get("/portalserver/services/rest/resource/campaign/image/payNoti_collapse_en.jpg")
			.headers(headers_5),
            http("LandingRefresh_42")
			.get("/portalserver/portals/gbbportal.xml?pc=false")
			.headers(headers_42)
			.check(status.in(200, 302, 403)),//TODO,
            http("LandingRefresh_43")
			.get("/portalserver/services/rest/resource/campaign/image/cmbcard_collapse.jpg")
			.headers(headers_5),
            http("LandingRefresh_44")
			.get("/portalserver/services/rest/api/v2/contact/rm")
			.headers(headers_30),
            http("LandingRefresh_45")
			.post("/portalserver/services/rest/api/v2/insight/retrieve")
			.headers(headers_40)
			.body(RawFileBody("dbb/dbblandingrefresh/0045_request.json")),
            http("LandingRefresh_46")
			.get("/portalserver/services/rest/resource/ask-amy/img_AskAmy_mobileandweb.jpg")
			.headers(headers_5),
            http("LandingRefresh_47")
			.get("/portalserver/services/rest/resource/rmPhoto/43377131.jpg")
			.headers(headers_5)
			.check(status.in(498, 200)),
            http("LandingRefresh_48")
			.get("/portalserver/services/rest/api/v2/payments/direct-debits?currentPage=1&direction=DESC&from=0&maxNavPages=3&orderBy=date&paginationType=pagination&size=50&totalItems=0")
			.headers(headers_30)))

	//setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}