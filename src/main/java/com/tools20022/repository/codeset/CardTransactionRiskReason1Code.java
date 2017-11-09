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
import com.tools20022.repository.codeset.CardTransactionRiskReasonCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reason to indicate a certain level of risk for the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReasonCode
 * CardTransactionRiskReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmApproveDeclinePattern
 * CardTransactionRiskReason1Code.mmApproveDeclinePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmApproveDeclineSequence
 * CardTransactionRiskReason1Code.mmApproveDeclineSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmAuthorizationActivity
 * CardTransactionRiskReason1Code.mmAuthorizationActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmCompromisedCard
 * CardTransactionRiskReason1Code.mmCompromisedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmEcommerceActivity
 * CardTransactionRiskReason1Code.mmEcommerceActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmExpiryDateMismatch
 * CardTransactionRiskReason1Code.mmExpiryDateMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmForeignActivity
 * CardTransactionRiskReason1Code.mmForeignActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmGeographicActivity
 * CardTransactionRiskReason1Code.mmGeographicActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmHighRiskMCC
 * CardTransactionRiskReason1Code.mmHighRiskMCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmManualEntryActivity
 * CardTransactionRiskReason1Code.mmManualEntryActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmMerchantCategoryActivity
 * CardTransactionRiskReason1Code.mmMerchantCategoryActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmSuspiciousAmount
 * CardTransactionRiskReason1Code.mmSuspiciousAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmSuspiciousFraudulentCardholder
 * CardTransactionRiskReason1Code.mmSuspiciousFraudulentCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmSuspiciousFraudulentMerchant
 * CardTransactionRiskReason1Code.mmSuspiciousFraudulentMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmTransactionCumulativeAmount
 * CardTransactionRiskReason1Code.mmTransactionCumulativeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmTransactionNumber
 * CardTransactionRiskReason1Code.mmTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmTransactionTime
 * CardTransactionRiskReason1Code.mmTransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmTransactionTimeIinterval
 * CardTransactionRiskReason1Code.mmTransactionTimeIinterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmTransactionType
 * CardTransactionRiskReason1Code.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#mmUnattendedActivity
 * CardTransactionRiskReason1Code.mmUnattendedActivity}</li>
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
 * "CardTransactionRiskReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reason to indicate a certain level of risk for the transaction."</li>
 * </ul>
 */
public class CardTransactionRiskReason1Code extends CardTransactionRiskReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproveDeclinePattern"</li>
	 * </ul>
	 */
	public static final MMCode mmApproveDeclinePattern = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproveDeclinePattern";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproveDeclineSequence"</li>
	 * </ul>
	 */
	public static final MMCode mmApproveDeclineSequence = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproveDeclineSequence";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorizationActivity"</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorizationActivity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorizationActivity";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompromisedCard"</li>
	 * </ul>
	 */
	public static final MMCode mmCompromisedCard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompromisedCard";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EcommerceActivity"</li>
	 * </ul>
	 */
	public static final MMCode mmEcommerceActivity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EcommerceActivity";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateMismatch"</li>
	 * </ul>
	 */
	public static final MMCode mmExpiryDateMismatch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateMismatch";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignActivity"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignActivity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignActivity";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeographicActivity"</li>
	 * </ul>
	 */
	public static final MMCode mmGeographicActivity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeographicActivity";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighRiskMCC"</li>
	 * </ul>
	 */
	public static final MMCode mmHighRiskMCC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighRiskMCC";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualEntryActivity"</li>
	 * </ul>
	 */
	public static final MMCode mmManualEntryActivity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualEntryActivity";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantCategoryActivity"</li>
	 * </ul>
	 */
	public static final MMCode mmMerchantCategoryActivity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryActivity";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspiciousAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmSuspiciousAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousAmount";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspiciousFraudulentCardholder"</li>
	 * </ul>
	 */
	public static final MMCode mmSuspiciousFraudulentCardholder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousFraudulentCardholder";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspiciousFraudulentMerchant"</li>
	 * </ul>
	 */
	public static final MMCode mmSuspiciousFraudulentMerchant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousFraudulentMerchant";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCumulativeAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionCumulativeAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCumulativeAmount";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNumber";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTime"</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTime";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTimeIinterval"</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionTimeIinterval = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTimeIinterval";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code
	 * CardTransactionRiskReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnattendedActivity"</li>
	 * </ul>
	 */
	public static final MMCode mmUnattendedActivity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnattendedActivity";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionRiskReason1Code";
				definition = "Reason to indicate a certain level of risk for the transaction.";
				code_lazy = () -> Arrays.asList(CardTransactionRiskReason1Code.mmApproveDeclinePattern, CardTransactionRiskReason1Code.mmApproveDeclineSequence, CardTransactionRiskReason1Code.mmAuthorizationActivity,
						CardTransactionRiskReason1Code.mmCompromisedCard, CardTransactionRiskReason1Code.mmEcommerceActivity, CardTransactionRiskReason1Code.mmExpiryDateMismatch, CardTransactionRiskReason1Code.mmForeignActivity,
						CardTransactionRiskReason1Code.mmGeographicActivity, CardTransactionRiskReason1Code.mmHighRiskMCC, CardTransactionRiskReason1Code.mmManualEntryActivity, CardTransactionRiskReason1Code.mmMerchantCategoryActivity,
						CardTransactionRiskReason1Code.mmSuspiciousAmount, CardTransactionRiskReason1Code.mmSuspiciousFraudulentCardholder, CardTransactionRiskReason1Code.mmSuspiciousFraudulentMerchant,
						CardTransactionRiskReason1Code.mmTransactionCumulativeAmount, CardTransactionRiskReason1Code.mmTransactionNumber, CardTransactionRiskReason1Code.mmTransactionTime,
						CardTransactionRiskReason1Code.mmTransactionTimeIinterval, CardTransactionRiskReason1Code.mmTransactionType, CardTransactionRiskReason1Code.mmUnattendedActivity);
				trace_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}