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
import com.tools20022.repository.codeset.CardTransactionRiskReasonCode;
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
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#ApproveDeclinePattern
 * CardTransactionRiskReason1Code.ApproveDeclinePattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#ApproveDeclineSequence
 * CardTransactionRiskReason1Code.ApproveDeclineSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#AuthorizationActivity
 * CardTransactionRiskReason1Code.AuthorizationActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#CompromisedCard
 * CardTransactionRiskReason1Code.CompromisedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#EcommerceActivity
 * CardTransactionRiskReason1Code.EcommerceActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#ExpiryDateMismatch
 * CardTransactionRiskReason1Code.ExpiryDateMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#ForeignActivity
 * CardTransactionRiskReason1Code.ForeignActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#GeographicActivity
 * CardTransactionRiskReason1Code.GeographicActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#HighRiskMCC
 * CardTransactionRiskReason1Code.HighRiskMCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#ManualEntryActivity
 * CardTransactionRiskReason1Code.ManualEntryActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#MerchantCategoryActivity
 * CardTransactionRiskReason1Code.MerchantCategoryActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#SuspiciousAmount
 * CardTransactionRiskReason1Code.SuspiciousAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#SuspiciousFraudulentCardholder
 * CardTransactionRiskReason1Code.SuspiciousFraudulentCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#SuspiciousFraudulentMerchant
 * CardTransactionRiskReason1Code.SuspiciousFraudulentMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#TransactionCumulativeAmount
 * CardTransactionRiskReason1Code.TransactionCumulativeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#TransactionNumber
 * CardTransactionRiskReason1Code.TransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#TransactionTime
 * CardTransactionRiskReason1Code.TransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#TransactionTimeIinterval
 * CardTransactionRiskReason1Code.TransactionTimeIinterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#TransactionType
 * CardTransactionRiskReason1Code.TransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardTransactionRiskReason1Code#UnattendedActivity
 * CardTransactionRiskReason1Code.UnattendedActivity}</li>
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
	public static final MMCode ApproveDeclinePattern = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ApproveDeclineSequence = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode AuthorizationActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CompromisedCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode EcommerceActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ExpiryDateMismatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ForeignActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode GeographicActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode HighRiskMCC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ManualEntryActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MerchantCategoryActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode SuspiciousAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode SuspiciousFraudulentCardholder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode SuspiciousFraudulentMerchant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode TransactionCumulativeAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode TransactionNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode TransactionTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode TransactionTimeIinterval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode TransactionType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode UnattendedActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnattendedActivity";
			owner_lazy = () -> CardTransactionRiskReason1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardTransactionRiskReason1Code";
				definition = "Reason to indicate a certain level of risk for the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardTransactionRiskReason1Code.ApproveDeclinePattern, com.tools20022.repository.codeset.CardTransactionRiskReason1Code.ApproveDeclineSequence,
						com.tools20022.repository.codeset.CardTransactionRiskReason1Code.AuthorizationActivity, com.tools20022.repository.codeset.CardTransactionRiskReason1Code.CompromisedCard,
						com.tools20022.repository.codeset.CardTransactionRiskReason1Code.EcommerceActivity, com.tools20022.repository.codeset.CardTransactionRiskReason1Code.ExpiryDateMismatch,
						com.tools20022.repository.codeset.CardTransactionRiskReason1Code.ForeignActivity, com.tools20022.repository.codeset.CardTransactionRiskReason1Code.GeographicActivity,
						com.tools20022.repository.codeset.CardTransactionRiskReason1Code.HighRiskMCC, com.tools20022.repository.codeset.CardTransactionRiskReason1Code.ManualEntryActivity,
						com.tools20022.repository.codeset.CardTransactionRiskReason1Code.MerchantCategoryActivity, com.tools20022.repository.codeset.CardTransactionRiskReason1Code.SuspiciousAmount,
						com.tools20022.repository.codeset.CardTransactionRiskReason1Code.SuspiciousFraudulentCardholder, com.tools20022.repository.codeset.CardTransactionRiskReason1Code.SuspiciousFraudulentMerchant,
						com.tools20022.repository.codeset.CardTransactionRiskReason1Code.TransactionCumulativeAmount, com.tools20022.repository.codeset.CardTransactionRiskReason1Code.TransactionNumber,
						com.tools20022.repository.codeset.CardTransactionRiskReason1Code.TransactionTime, com.tools20022.repository.codeset.CardTransactionRiskReason1Code.TransactionTimeIinterval,
						com.tools20022.repository.codeset.CardTransactionRiskReason1Code.TransactionType, com.tools20022.repository.codeset.CardTransactionRiskReason1Code.UnattendedActivity);
				trace_lazy = () -> CardTransactionRiskReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}