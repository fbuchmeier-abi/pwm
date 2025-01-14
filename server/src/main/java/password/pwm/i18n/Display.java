/*
 * Password Management Servlets (PWM)
 * http://www.pwm-project.org
 *
 * Copyright (c) 2006-2009 Novell, Inc.
 * Copyright (c) 2009-2021 The PWM Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package password.pwm.i18n;

import password.pwm.config.SettingReader;
import password.pwm.util.i18n.LocaleHelper;

import java.util.Locale;

/**
 * Empty class to facilitate easy resource bundle loading of "Display" resource bundle.
 */
public enum Display implements PwmDisplayBundle
{

    Button_Activate,
    Button_Agree,
    Button_Cancel,
    Button_ChangePassword,
    Button_ChangeResponses,
    Button_CheckCode,
    Button_ClearOtpReEnroll,
    Button_HelpdeskClearOtpSecret,
    Button_ClearResponses,
    Button_CloseWindow,
    Button_Confirm,
    Button_ConfirmResponses,
    Button_Continue,
    Button_Create,
    Button_Delete,
    Button_Email,
    Button_GoBack,
    Button_Hide,
    Button_Hide_Responses,
    Button_Home,
    Button_Login,
    Button_Logout,
    Button_More,
    Button_OrgChart,
    Button_OTP,
    Button_RecoverPassword,
    Button_Reset,
    Button_Search,
    Button_SetResponses,
    Button_Show,
    Button_Show_Responses,
    Button_Select,
    Button_Skip,
    Button_SMS,
    Button_Unlock,
    Button_UnlockPassword,
    Button_Update,
    Button_Verify,
    Button_OK,
    Display_ActivateUser,
    Display_AutoGeneratedPassword,
    Display_CapsLockIsOn,
    Display_Captcha,
    Display_CaptchaInputWords,
    Display_CaptchaInputNumbers,
    Display_CaptchaGetAudio,
    Display_CaptchaGetImage,
    Display_CaptchaHelp,
    Display_CaptchaRefresh,
    Display_ChangePassword,
    Display_ChangePasswordForm,
    Display_CheckingData,
    Display_CheckingPassword,
    Display_CheckingResponses,
    Display_CommunicationError,
    Display_ConfirmResponses,
    Display_Day,
    Display_Days,
    Display_ErrorBody,
    Display_ErrorReference,
    Display_ExpirationDate,
    Display_FooterInfoText,
    Display_ForgottenPassword,
    Display_ForgottenUsername,
    Display_GuestRegistration,
    Display_GuestUpdate,
    Display_Helpdesk,
    Display_HelpdeskNoData,
    Display_Hour,
    Display_Hours,
    Display_IdleTimeout,
    Display_IdleWarningMessage,
    Display_IdleWarningTitle,
    Display_InvalidVerification,
    Display_JavascriptRequired,
    Display_LeaveDirtyPasswordPage,
    Display_Login,
    Display_LoginPasswordOnly,
    Display_Logout,
    Display_MatchCondition,
    Display_Minute,
    Display_Minutes,
    Display_NewUser,
    Display_NewUserProfile,
    Display_NoResponses,
    Display_PasswordExpired,
    Display_PasswordGeneration,
    Display_PasswordNoExpire,
    Display_PasswordPrompt,
    Display_PasswordStrengthVeryHigh,
    Display_PasswordStrengthHigh,
    Display_PasswordStrengthMedium,
    Display_PasswordStrengthLow,
    Display_PasswordStrengthVeryLow,
    Display_PasswordReplicationStatus,
    Display_PasswordWarn,
    Display_PeopleSearch,
    Display_PleaseWait,
    Display_PleaseWaitNewUser,
    Display_PleaseWaitPassword,
    Display_Random,
    Display_RecoverVerificationChoice,
    Display_RecoverTokenSendChoices,
    Display_RecoverTokenSendChoiceEmail,
    Display_RecoverTokenSendChoiceSMS,
    Display_RecoverChoiceReset,
    Display_RecoverChoiceUnlock,
    Display_RecoverEnterCode,
    Display_RecoverEnterCodeSMS,
    Display_RecoverPassword,
    Display_RecoverPasswordChoices,
    Display_RecoverRandomResponses,
    Display_RecoverRequiredResponses,
    Display_RecoverOTP,
    Display_RecoverOTPIdentified,
    Display_ResponsesPrompt,
    Display_SelectionIndicator,
    Display_SearchCompleted,
    Display_SearchResultsInfo,
    Display_SearchResultsExceeded,
    Display_SearchAttrsUnique,
    Display_SetRandomPasswordPrompt,
    Display_SearchResultsNone,
    Display_Second,
    Display_Seconds,
    Display_SetupHelpdeskResponses,
    Display_SetupRandomResponses,
    Display_SetupRequiredResponses,
    Display_SetupResponses,
    Display_SetupOtpSecret,
    Display_SetupOtp_Android_Title,
    Display_SetupOtp_Android_Steps,
    Display_SetupOtp_iPhone_Title,
    Display_SetupOtp_iPhone_Steps,
    Display_SetupOtp_Other_Title,
    Display_SetupOtp_Other_Steps,
    Display_SetupOtp_VerificationCodeFormat,
    Display_WarnExistingOtpSecretTime,
    Display_WarnExistingOtpSecret,
    Display_WarnExistingResponseTime,
    Display_WarnExistingResponse,
    Display_WarnJavaScriptNotEnabledTitle,
    Display_WarnJavaScriptNotEnabledMessage,
    Display_PleaseVerifyOtp,
    Display_OtpRecoveryInfo,
    Display_OtpClearWarning,
    Display_ResponsesClearWarning,
    Display_Shortcuts,
    Display_ShowPasswordGuide,
    Display_StrengthMeter,
    Display_UpdateProfile,
    Display_UpdateProfileConfirm,
    Display_UpdateProfileEnterCode,
    Display_UpdateProfileEnterCodeSMS,
    Display_UserEventHistory,
    Display_ViewDetails,
    Display_TypingWait,
    Field_AccountEnabled,
    Field_AccountExpired,
    Field_AccountExpirationTime,
    Field_Code,
    Field_OneTimePassword,
    Field_Confirm_Prefix,
    Field_ConfirmPassword,
    Field_CurrentPassword,
    Field_Display,
    Field_ForwardURL,
    Field_LastLoginTime,
    Field_LastLoginTimeDelta,
    Field_LdapProfile,
    Field_Location,
    Field_LogoutURL,
    Field_NetworkAddress,
    Field_NetworkHost,
    Field_NewPassword,
    Field_Option_Select,
    Field_Password,
    Field_PasswordExpirationTime,
    Field_PasswordExpired,
    Field_PasswordLocked,
    Field_PasswordPreExpired,
    Field_PasswordSetTime,
    Field_PasswordSetTimeDelta,
    Field_PasswordViolatesPolicy,
    Field_PasswordWithinWarningPeriod,
    Field_Policy,
    Field_Profile,
    Field_ResponsesNeeded,
    Field_ResponsesStored,
    Field_ResponsesTimestamp,
    Field_User_Supplied_Question,
    Field_UserDN,
    Field_UserGUID,
    Field_Username,
    Field_UserEmail,
    Field_UserSMS,
    Field_OTP_Identifier,
    Field_OTP_Secret,
    Field_OTP_Type,
    Field_OTP_RecoveryCodes,
    Field_OTP_Stored,
    Field_OTP_Timestamp,
    Field_VerificationMethodPreviousAuth,
    Field_VerificationMethodToken,
    Field_VerificationMethodOTP,
    Field_VerificationMethodChallengeResponses,
    Field_VerificationMethodAttributes,
    Field_VerificationMethodRemoteResponses,
    Field_VerificationMethodOAuth,
    Field_VerificationMethod,
    Description_VerificationMethodPreviousAuth,
    Description_VerificationMethodToken,
    Description_VerificationMethodOTP,
    Description_VerificationMethodChallengeResponses,
    Description_VerificationMethodAttributes,
    Description_VerificationMethodRemoteResponses,
    Description_VerificationMethodOAuth,
    Description_VerificationMethod,
    Long_Title_ActivateUser,
    Long_Title_Admin,
    Long_Title_ChangePassword,
    Long_Title_ForgottenPassword,
    Long_Title_ForgottenUsername,
    Long_Title_GuestRegistration,
    Long_Title_GuestUpdate,
    Long_Title_Helpdesk,
    Long_Title_Logout,
    Long_Title_Main_Menu,
    Long_Title_NewUser,
    Long_Title_PeopleSearch,
    Long_Title_SetupResponses,
    Long_Title_SetupOtpSecret,
    Long_Title_Shortcuts,
    Long_Title_UpdateProfile,
    Long_Title_UserEventHistory,
    Long_Title_UserInformation,
    Title_AnsweredQuestions,
    Title_ActivateUser,
    Title_Admin,
    Title_Application,
    Title_Captcha,
    Title_ChangePassword,
    Title_ConfirmResponses,
    Title_Error,
    Title_ForgottenPassword,
    Title_ForgottenUsername,
    Title_GuestRegistration,
    Title_GuestUpdate,
    Title_Helpdesk,
    Title_HelpDeskCard,
    Title_HelpDeskTable,
    Title_LocaleSelect,
    Title_Login,
    Title_Logout,
    Title_MainPage,
    Title_NewUser,
    Title_OrgChart,
    Title_Settings,
    Title_PasswordGuide,
    Title_PasswordPolicy,
    Title_PasswordStrength,
    Title_PasswordWarning,
    Title_PeopleSearch,
    Title_PleaseWait,
    Title_RandomPasswords,
    Title_RecoverPassword,
    Title_RecoverRandomResponses,
    Title_RecoverRequiredResponses,
    Title_SecurityResponses,
    Title_SetupRandomResponses,
    Title_SetupRequiredResponses,
    Title_SetupResponses,
    Title_SetupOtpSecret,
    Title_Shortcuts,
    Title_Status,
    Title_Success,
    Title_TitleBar,
    Title_UpdateProfile,
    Title_UpdateProfileConfirm,
    Title_UserData,
    Title_UserEventHistory,
    Title_UserInformation,
    Tooltip_PasswordStrength,
    Confirm_DeleteUser,
    Value_False,
    Value_True,
    Value_NotApplicable,
    Value_Default,
    Placeholder_Search,;

    public static String getLocalizedMessage( final Locale locale, final Display key, final SettingReader config )
    {
        return LocaleHelper.getLocalizedMessage( locale, key.toString(), config, Display.class );
    }

    @Override
    public String getKey( )
    {
        return this.toString();

    }
}

