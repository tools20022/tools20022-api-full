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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CardTransactionRiskReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Reason to indicate a certain level of risk for the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#ApproveDeclineSequence
 * CardTransactionRiskReasonCode.ApproveDeclineSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#AuthorizationActivity
 * CardTransactionRiskReasonCode.AuthorizationActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#ApproveDeclinePattern
 * CardTransactionRiskReasonCode.ApproveDeclinePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#CompromisedCard
 * CardTransactionRiskReasonCode.CompromisedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#EcommerceActivity
 * CardTransactionRiskReasonCode.EcommerceActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#ExpiryDateMismatch
 * CardTransactionRiskReasonCode.ExpiryDateMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#ForeignActivity
 * CardTransactionRiskReasonCode.ForeignActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#GeographicActivity
 * CardTransactionRiskReasonCode.GeographicActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#HighRiskMCC
 * CardTransactionRiskReasonCode.HighRiskMCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#ManualEntryActivity
 * CardTransactionRiskReasonCode.ManualEntryActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#MerchantCategoryActivity
 * CardTransactionRiskReasonCode.MerchantCategoryActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#SuspiciousAmount
 * CardTransactionRiskReasonCode.SuspiciousAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#SuspiciousFraudulentCardholder
 * CardTransactionRiskReasonCode.SuspiciousFraudulentCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#SuspiciousFraudulentMerchant
 * CardTransactionRiskReasonCode.SuspiciousFraudulentMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#TransactionCumulativeAmount
 * CardTransactionRiskReasonCode.TransactionCumulativeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#TransactionNumber
 * CardTransactionRiskReasonCode.TransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#TransactionTimeIinterval
 * CardTransactionRiskReasonCode.TransactionTimeIinterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#TransactionTime
 * CardTransactionRiskReasonCode.TransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#TransactionType
 * CardTransactionRiskReasonCode.TransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode#UnattendedActivity
 * CardTransactionRiskReasonCode.UnattendedActivity}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardTransactionRiskReasonCode extends MMCode {

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
	public static final CardTransactionRiskReasonCode ApproveDeclineSequence = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproveDeclineSequence";
			definition = "Suspicious sequence of approve and decline messages.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode AuthorizationActivity = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorizationActivity";
			definition = "Suspicious authorization activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode ApproveDeclinePattern = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproveDeclinePattern";
			definition = "Suspicious approve or decline pattern.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode CompromisedCard = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompromisedCard";
			definition = "Compromised card.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode EcommerceActivity = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EcommerceActivity";
			definition = "Suspicious electronic commerce activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode ExpiryDateMismatch = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateMismatch";
			definition = "Expiry date mismatch.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode ForeignActivity = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignActivity";
			definition = "Suspicious foreign activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode GeographicActivity = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeographicActivity";
			definition = "Suspicious geographic activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode HighRiskMCC = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighRiskMCC";
			definition = "High Risk MCC (Merchant Category Code).";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode ManualEntryActivity = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualEntryActivity";
			definition = "Suspicious manual card data entry mode.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode MerchantCategoryActivity = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryActivity";
			definition = "Suspicious MCC (Merchant Category Code) activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode SuspiciousAmount = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousAmount";
			definition = "Suspicious amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode SuspiciousFraudulentCardholder = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousFraudulentCardholder";
			definition = "Suspicious fraudulent cardholder.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode SuspiciousFraudulentMerchant = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousFraudulentMerchant";
			definition = "Suspicious fraudulent merchant.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode TransactionCumulativeAmount = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCumulativeAmount";
			definition = "Suspicious transaction cumulated amount at merchant.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode TransactionNumber = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNumber";
			definition = "Suspicious transaction number at merchant.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode TransactionTimeIinterval = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTimeIinterval";
			definition = "Suspicious transaction time interval.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode TransactionTime = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTime";
			definition = "Suspicious transaction time.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode TransactionType = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Suspicious transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
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
	public static final CardTransactionRiskReasonCode UnattendedActivity = new CardTransactionRiskReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnattendedActivity";
			definition = "Suspicious unattended terminal activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardTransactionRiskReasonCode.mmObject();
			codeName = "UATA";
		}
	};
	final static private LinkedHashMap<String, CardTransactionRiskReasonCode> codesByName = new LinkedHashMap<>();

	protected CardTransactionRiskReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionRiskReasonCode";
				definition = "Reason to indicate a certain level of risk for the transaction.";
				derivation_lazy = () -> Arrays.asList(CardTransactionRiskReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardTransactionRiskReasonCode.ApproveDeclineSequence, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.AuthorizationActivity,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.ApproveDeclinePattern, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.CompromisedCard,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.EcommerceActivity, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.ExpiryDateMismatch,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.ForeignActivity, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.GeographicActivity,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.HighRiskMCC, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.ManualEntryActivity,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.MerchantCategoryActivity, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.SuspiciousAmount,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.SuspiciousFraudulentCardholder, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.SuspiciousFraudulentMerchant,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.TransactionCumulativeAmount, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.TransactionNumber,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.TransactionTimeIinterval, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.TransactionTime,
						com.tools20022.repository.codeset.CardTransactionRiskReasonCode.TransactionType, com.tools20022.repository.codeset.CardTransactionRiskReasonCode.UnattendedActivity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ApproveDeclineSequence.getCodeName().get(), ApproveDeclineSequence);
		codesByName.put(AuthorizationActivity.getCodeName().get(), AuthorizationActivity);
		codesByName.put(ApproveDeclinePattern.getCodeName().get(), ApproveDeclinePattern);
		codesByName.put(CompromisedCard.getCodeName().get(), CompromisedCard);
		codesByName.put(EcommerceActivity.getCodeName().get(), EcommerceActivity);
		codesByName.put(ExpiryDateMismatch.getCodeName().get(), ExpiryDateMismatch);
		codesByName.put(ForeignActivity.getCodeName().get(), ForeignActivity);
		codesByName.put(GeographicActivity.getCodeName().get(), GeographicActivity);
		codesByName.put(HighRiskMCC.getCodeName().get(), HighRiskMCC);
		codesByName.put(ManualEntryActivity.getCodeName().get(), ManualEntryActivity);
		codesByName.put(MerchantCategoryActivity.getCodeName().get(), MerchantCategoryActivity);
		codesByName.put(SuspiciousAmount.getCodeName().get(), SuspiciousAmount);
		codesByName.put(SuspiciousFraudulentCardholder.getCodeName().get(), SuspiciousFraudulentCardholder);
		codesByName.put(SuspiciousFraudulentMerchant.getCodeName().get(), SuspiciousFraudulentMerchant);
		codesByName.put(TransactionCumulativeAmount.getCodeName().get(), TransactionCumulativeAmount);
		codesByName.put(TransactionNumber.getCodeName().get(), TransactionNumber);
		codesByName.put(TransactionTimeIinterval.getCodeName().get(), TransactionTimeIinterval);
		codesByName.put(TransactionTime.getCodeName().get(), TransactionTime);
		codesByName.put(TransactionType.getCodeName().get(), TransactionType);
		codesByName.put(UnattendedActivity.getCodeName().get(), UnattendedActivity);
	}

	public static CardTransactionRiskReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardTransactionRiskReasonCode[] values() {
		CardTransactionRiskReasonCode[] values = new CardTransactionRiskReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardTransactionRiskReasonCode> {
		@Override
		public CardTransactionRiskReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardTransactionRiskReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}