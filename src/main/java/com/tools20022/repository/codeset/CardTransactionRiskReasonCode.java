/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reason to indicate a certain level of risk for the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmApproveDeclineSequence
 * CardTransactionRiskReasonCode.mmApproveDeclineSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmAuthorizationActivity
 * CardTransactionRiskReasonCode.mmAuthorizationActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmApproveDeclinePattern
 * CardTransactionRiskReasonCode.mmApproveDeclinePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmCompromisedCard
 * CardTransactionRiskReasonCode.mmCompromisedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmEcommerceActivity
 * CardTransactionRiskReasonCode.mmEcommerceActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmExpiryDateMismatch
 * CardTransactionRiskReasonCode.mmExpiryDateMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmForeignActivity
 * CardTransactionRiskReasonCode.mmForeignActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmGeographicActivity
 * CardTransactionRiskReasonCode.mmGeographicActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmHighRiskMCC
 * CardTransactionRiskReasonCode.mmHighRiskMCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmManualEntryActivity
 * CardTransactionRiskReasonCode.mmManualEntryActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmMerchantCategoryActivity
 * CardTransactionRiskReasonCode.mmMerchantCategoryActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmSuspiciousAmount
 * CardTransactionRiskReasonCode.mmSuspiciousAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmSuspiciousFraudulentCardholder
 * CardTransactionRiskReasonCode.mmSuspiciousFraudulentCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmSuspiciousFraudulentMerchant
 * CardTransactionRiskReasonCode.mmSuspiciousFraudulentMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmTransactionCumulativeAmount
 * CardTransactionRiskReasonCode.mmTransactionCumulativeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmTransactionNumber
 * CardTransactionRiskReasonCode.mmTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmTransactionTimeIinterval
 * CardTransactionRiskReasonCode.mmTransactionTimeIinterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmTransactionTime
 * CardTransactionRiskReasonCode.mmTransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmTransactionType
 * CardTransactionRiskReasonCode.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#mmUnattendedActivity
 * CardTransactionRiskReasonCode.mmUnattendedActivity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
 * CardTransactionRiskReason1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTransactionRiskReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reason to indicate a certain level of risk for the transaction."</li>
 * </ul>
 */
public class CardTransactionRiskReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Suspicious sequence of approve and decline messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APDL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproveDeclineSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious sequence of approve and decline messages."</li>
	 * </ul>
	 */
	public static final MMCode mmApproveDeclineSequence = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproveDeclineSequence";
			definition = "Suspicious sequence of approve and decline messages.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "APDL";
		}
	};
	/**
	 * Suspicious authorization activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATHA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorizationActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious authorization activity."</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorizationActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorizationActivity";
			definition = "Suspicious authorization activity.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "ATHA";
		}
	};
	/**
	 * Suspicious approve or decline pattern.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproveDeclinePattern"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious approve or decline pattern."</li>
	 * </ul>
	 */
	public static final MMCode mmApproveDeclinePattern = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproveDeclinePattern";
			definition = "Suspicious approve or decline pattern.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "APDP";
		}
	};
	/**
	 * Compromised card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompromisedCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Compromised card."</li>
	 * </ul>
	 */
	public static final MMCode mmCompromisedCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompromisedCard";
			definition = "Compromised card.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "CRDC";
		}
	};
	/**
	 * Suspicious electronic commerce activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EcommerceActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious electronic commerce activity."</li>
	 * </ul>
	 */
	public static final MMCode mmEcommerceActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EcommerceActivity";
			definition = "Suspicious electronic commerce activity.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "ECMA";
		}
	};
	/**
	 * Expiry date mismatch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateMismatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expiry date mismatch."</li>
	 * </ul>
	 */
	public static final MMCode mmExpiryDateMismatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateMismatch";
			definition = "Expiry date mismatch.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "EXCD";
		}
	};
	/**
	 * Suspicious foreign activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FGNA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious foreign activity."</li>
	 * </ul>
	 */
	public static final MMCode mmForeignActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignActivity";
			definition = "Suspicious foreign activity.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "FGNA";
		}
	};
	/**
	 * Suspicious geographic activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GEOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeographicActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious geographic activity."</li>
	 * </ul>
	 */
	public static final MMCode mmGeographicActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeographicActivity";
			definition = "Suspicious geographic activity.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "GEOA";
		}
	};
	/**
	 * High Risk MCC (Merchant Category Code).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighRiskMCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "High Risk MCC (Merchant Category Code)."</li>
	 * </ul>
	 */
	public static final MMCode mmHighRiskMCC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighRiskMCC";
			definition = "High Risk MCC (Merchant Category Code).";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "MCCH";
		}
	};
	/**
	 * Suspicious manual card data entry mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualEntryActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious manual card data entry mode."</li>
	 * </ul>
	 */
	public static final MMCode mmManualEntryActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualEntryActivity";
			definition = "Suspicious manual card data entry mode.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "KEYA";
		}
	};
	/**
	 * Suspicious MCC (Merchant Category Code) activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantCategoryActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious MCC (Merchant Category Code) activity."</li>
	 * </ul>
	 */
	public static final MMCode mmMerchantCategoryActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryActivity";
			definition = "Suspicious MCC (Merchant Category Code) activity.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "MCCA";
		}
	};
	/**
	 * Suspicious amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspiciousAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious amount."</li>
	 * </ul>
	 */
	public static final MMCode mmSuspiciousAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousAmount";
			definition = "Suspicious amount.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "AMNT";
		}
	};
	/**
	 * Suspicious fraudulent cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspiciousFraudulentCardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious fraudulent cardholder."</li>
	 * </ul>
	 */
	public static final MMCode mmSuspiciousFraudulentCardholder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousFraudulentCardholder";
			definition = "Suspicious fraudulent cardholder.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "CRDF";
		}
	};
	/**
	 * Suspicious fraudulent merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspiciousFraudulentMerchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious fraudulent merchant."</li>
	 * </ul>
	 */
	public static final MMCode mmSuspiciousFraudulentMerchant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousFraudulentMerchant";
			definition = "Suspicious fraudulent merchant.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "MRCF";
		}
	};
	/**
	 * Suspicious transaction cumulated amount at merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCumulativeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious transaction cumulated amount at merchant."</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionCumulativeAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCumulativeAmount";
			definition = "Suspicious transaction cumulated amount at merchant.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "TXCA";
		}
	};
	/**
	 * Suspicious transaction number at merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXNB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious transaction number at merchant."</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNumber";
			definition = "Suspicious transaction number at merchant.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "TXNB";
		}
	};
	/**
	 * Suspicious transaction time interval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTimeIinterval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious transaction time interval."</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionTimeIinterval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTimeIinterval";
			definition = "Suspicious transaction time interval.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "TMIN";
		}
	};
	/**
	 * Suspicious transaction time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious transaction time."</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTime";
			definition = "Suspicious transaction time.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "TXTM";
		}
	};
	/**
	 * Suspicious transaction type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious transaction type."</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Suspicious transaction type.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "TXTP";
		}
	};
	/**
	 * Suspicious unattended terminal activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
	 * CardTransactionRiskReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UATA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnattendedActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspicious unattended terminal activity."</li>
	 * </ul>
	 */
	public static final MMCode mmUnattendedActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnattendedActivity";
			definition = "Suspicious unattended terminal activity.";
			owner_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			codeName = "UATA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardTransactionRiskReasonCode";
				definition = "Reason to indicate a certain level of risk for the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmApproveDeclineSequence, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmAuthorizationActivity,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmApproveDeclinePattern, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmCompromisedCard,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmEcommerceActivity, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmExpiryDateMismatch,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmForeignActivity, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmGeographicActivity,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmHighRiskMCC, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmManualEntryActivity,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmMerchantCategoryActivity, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmSuspiciousAmount,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmSuspiciousFraudulentCardholder, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmSuspiciousFraudulentMerchant,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmTransactionCumulativeAmount, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmTransactionNumber,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmTransactionTimeIinterval, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmTransactionTime,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmTransactionType, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmUnattendedActivity);
				derivation_lazy = () -> Arrays.asList(CardTransactionRiskReason1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}