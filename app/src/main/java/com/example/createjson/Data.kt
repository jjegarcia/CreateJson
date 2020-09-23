package com.example.createjson

data class Flag(
    val flagName: String,
    val defaultValue: Boolean
)

data class Country(
    val countryName: String,
    val flags: Flag
)

data class CountryList(
    val countryData: List<CountryData>
)

data class countriesJson(
    val countryData: List<CountryData>
)

data class CountryData(
    val CountyName: String,
    val areOilLifePrognosticsEnabled: Boolean,
    val isAarEnabled: Boolean,
    val isAddressLineOneRequired: Boolean,
    val isAddressLineTwoRequired: Boolean,
    val isAdvertisingIdAnalyticsEnabled: Boolean,
    val isCOVID19InfoEnabled: Boolean,
    val isCVServicesForMarketPlaceEnabled: Boolean,
    val isChangeEmailEnabled: Boolean,
    val isChargingStationSearchEnabled: Boolean,
    val isCityRequired: Boolean,
    val isDealerDetailsV2Enabled: Boolean,
    val isDrsaEnabled: Boolean,
    val isFb4Enabled: Boolean,
    val isFleetHealthEnabled: Boolean,
    val isGuardModeEnabled: Boolean,
    val isHomeScreenCoachMarksEnabled: Boolean,
    val isLockStatusEnabled: Boolean,
    val isMaintenanceScheduleEnabled: Boolean,
    val isOsbEnabled: Boolean,
    val isOsbPhoneNumberEnabled: Boolean,
    val isPostalCodeIncluded: Boolean,
    val isPostcodeRequired: Boolean,
    val isPreferredDealerEnabled: Boolean,
    val isSmartLinkEnabled: Boolean,
    val isStateRequired: Boolean,
    val isSyncGenerationV2Enable: Boolean,
    val isTyrePressureHealthDetailsEnabled: Boolean,
    val isWiFiHotspotEnabled: Boolean,
    val isZonalUnlockEnabled: Boolean,
    val openEmailForContactGuide: Boolean,
    val shouldHideContactGuideInForgotAndResetPassword: Boolean,
    val shouldShowMessageCenterMessageBody: Boolean,
    val showAddressLineTwo: Boolean,
    val showCityOrTown: Boolean,
    val showFordCreditConfirmationDialog: Boolean,
    val showStateOrCounty: Boolean,
    val showSuffix: Boolean
)

enum class Flags(
    val flagName: String,
    val defaultValue: Boolean
) {
    IS_ADDRESS_LINE_ONE_REQUIRED("isAddressLineOneRequired", true),
    IS_CITY_REQUIRED("isCityRequired", true),
    IS_ADDRESS_LINE_TWO_REQUIRED("isAddressLineTwoRequired", false),
    IS_ADVERTISING_ID_ANALYTICS_ENABLED("isAdvertisingIdAnalyticsEnabled", false),
    IS_SMART_LINK_ENABLED("isSmartLinkEnabled", false),
    IS_FB4_ENABLED("isFb4Enabled", false),//buildConfigWrapper.isBuildTypeDebug),
    IS_SYNC_GENERATION_V2_ENABLE("isSyncGenerationV2Enable", false),
    IS_POSTAL_CODE_INCLUDED("isPostalCodeIncluded", true),
    IS_HOME_SCREEN_COACH_MARKS_ENABLED("isHomeScreenCoachMarksEnabled", true),
    IS_PREFERRED_DEALER_ENABLED("isPreferredDealerEnabled", true),
    IS_WI_FI_HOT_SPOT_ENABLED("isWiFiHotspotEnabled", true),
    IS_LOCK_STATUS_ENABLED("isLockStatusEnabled", true),
    IS_CHANGE_EMAIL_ENABLED("isChangeEmailEnabled", true),
    IS_FLEET_HEALTH_ENABLED("isFleetHealthEnabled", true),
    ARE_OILLIFE_PROGNOSTICS_ENABLED("areOilLifePrognosticsEnabled", false),
    IS_DRSA_ENABLED("isDrsaEnabled", false),
    IS_ZONAL_UNLOCK_ENABLED("isZonalUnlockEnabled", false),
    IS_AAR_ENABLED("isAarEnabled", false),
    IS_DEALER_DETAILS_V2_ENABLED("isDealerDetailsV2Enabled", true),
    SHOW_ADDRESS_LINE_TWO("showAddressLineTwo", true),
    SHOW_STATE_OR_COUNTY("showStateOrCounty", true),
    OPEN_EMAIL_FOR_CONTACT_GUIDE("openEmailForContactGuide", false),
    SHOULD_HIDE_CONTACT_GUIDE_IN_FORGOT_AND_RESET_PASSWORD("shouldHideContactGuideInForgotAndResetPassword", false),
    IS_STATE_REQUIRED("isStateRequired", true),
    IS_OSB_ENABLED("isOsbEnabled", false),
    IS_MAINTENANCE_SCHEDULE_ENABLED("isMaintenanceScheduleEnabled", false),
    IS_CHARGING_STATION_SEARCH_ENABLED("isChargingStationSearchEnabled", false),
    IS_POSTCODE_REQUIRED("isPostcodeRequired", true),
    SHOW_CITY_OR_TOWN("showCityOrTown", true),
    SHOW_SUFFIX("showSuffix", true),
    SHOULD_SHOW_MESSAGE_CENTER_MESSAGE_BODY("shouldShowMessageCenterMessageBody", false),
    SHOW_FORD_CREDIT_CONFIRMATION_DIALOG("showFordCreditConfirmationDialog", false),
    IS_TYRE_PRESSURE_HEALTH_DETAILS_ENABLED("isTyrePressureHealthDetailsEnabled", true),
    IS_COVID19_INFO_ENABLED("isCOVID19InfoEnabled", false),
    IS_CV_SERVICES_FOR_MARKET_PLACE_ENABLED("isCVServicesForMarketPlaceEnabled", false),
}
//35 fields

enum class Countries(countryName: String) {
    AUSTRIA("Austria"),
    BELGIUM("Belgium"),
    CZECHREPUBLIC("CzechRepublic"),
    DENMARK("Denmark"),
    FINLAND("Finland"),
    FRANCE("France"),
    GERMANY("Germany"),
    GREECE("Greece"),
    HUNGARY("Hungary"),
    IRELAND("Ireland"),
    ITALY("Italy"),
    LUXEMBOURG("Luxembourg"),
    NETHERLAND("Netherland"),
    NORWAY("Norway"),
    POLAND("Poland"),
    PORTUGAL("Portugal"),
    ROMANIA("Romania"),
    SPAIN("Spain"),
    SWEDEN("Sweden"),
    SWITZERLAND("Switzerland"),
    UNITEDKINGDOM("UnitedKingdom"),
}
//21 fields