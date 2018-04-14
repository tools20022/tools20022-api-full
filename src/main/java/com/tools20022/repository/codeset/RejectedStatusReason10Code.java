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
import com.tools20022.repository.codeset.RejectedStatusReason10Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a rejected status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#AfterDeadline
 * RejectedStatusReason10Code.AfterDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#AccountBlockedForTransfer
 * RejectedStatusReason10Code.AccountBlockedForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#CutOffTime
 * RejectedStatusReason10Code.CutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#SettlementDate
 * RejectedStatusReason10Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#AccountBlockedMissingDocuments
 * RejectedStatusReason10Code.AccountBlockedMissingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#FinancialInstrumentQuantity
 * RejectedStatusReason10Code.FinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#FinancialInstrumentIdentification
 * RejectedStatusReason10Code.FinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#TradeDate
 * RejectedStatusReason10Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#FinancialInstrumentIdentificationAndName
 * RejectedStatusReason10Code.FinancialInstrumentIdentificationAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#SubscriberOrRedeemer
 * RejectedStatusReason10Code.SubscriberOrRedeemer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#Intermediary
 * RejectedStatusReason10Code.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#InvalidOrderType
 * RejectedStatusReason10Code.InvalidOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#InstructingPartyNotAllowedForAccount
 * RejectedStatusReason10Code.InstructingPartyNotAllowedForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#TooLate
 * RejectedStatusReason10Code.TooLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#NotEnoughCash
 * RejectedStatusReason10Code.NotEnoughCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#NoCancellationMatch
 * RejectedStatusReason10Code.NoCancellationMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#NotCompliantWithSLA
 * RejectedStatusReason10Code.NotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#DuplicateOrderReference
 * RejectedStatusReason10Code.DuplicateOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#InvestmentAccount
 * RejectedStatusReason10Code.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#NotEnoughFinancialInstrument
 * RejectedStatusReason10Code.NotEnoughFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#TooHighUnitsOrAmountToSubscribe
 * RejectedStatusReason10Code.TooHighUnitsOrAmountToSubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#TooLowUnitsOrAmountToSubscribe
 * RejectedStatusReason10Code.TooLowUnitsOrAmountToSubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#UnacceptedDealCurrency
 * RejectedStatusReason10Code.UnacceptedDealCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#UnknownLinkagesReference
 * RejectedStatusReason10Code.UnknownLinkagesReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#UnacceptedRequestedSettlementCurrency
 * RejectedStatusReason10Code.UnacceptedRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#InvalidOrderedAmount
 * RejectedStatusReason10Code.InvalidOrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#BelowMinimumInitialInvestmentAmount
 * RejectedStatusReason10Code.BelowMinimumInitialInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#BelowMinimumTopUpAmount
 * RejectedStatusReason10Code.BelowMinimumTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#InsufficientCapacity
 * RejectedStatusReason10Code.InsufficientCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#PercentageHoldingBreach
 * RejectedStatusReason10Code.PercentageHoldingBreach}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#BelowMinimumRedemptionAmount
 * RejectedStatusReason10Code.BelowMinimumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#BelowMinimumRetainedAmount
 * RejectedStatusReason10Code.BelowMinimumRetainedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#LockUp
 * RejectedStatusReason10Code.LockUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#AssetsIlliquid
 * RejectedStatusReason10Code.AssetsIlliquid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#DataInvalid
 * RejectedStatusReason10Code.DataInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#FundClosed
 * RejectedStatusReason10Code.FundClosed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
 * RejectedStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectedStatusReason10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a rejected status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectedStatusReason10Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code AfterDeadline = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterDeadline";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.AfterDeadline.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedForTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code AccountBlockedForTransfer = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedForTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.AccountBlockedForTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code CutOffTime = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffTime";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.CutOffTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code SettlementDate = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedMissingDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code AccountBlockedMissingDocuments = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedMissingDocuments";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.AccountBlockedMissingDocuments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code FinancialInstrumentQuantity = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code FinancialInstrumentIdentification = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code TradeDate = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code FinancialInstrumentIdentificationAndName = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationAndName";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentIdentificationAndName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriberOrRedeemer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code SubscriberOrRedeemer = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriberOrRedeemer";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.SubscriberOrRedeemer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code Intermediary = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.Intermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code InvalidOrderType = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOrderType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidOrderType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingPartyNotAllowedForAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code InstructingPartyNotAllowedForAccount = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingPartyNotAllowedForAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.InstructingPartyNotAllowedForAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code TooLate = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.TooLate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEnoughCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code NotEnoughCash = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEnoughCash";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.NotEnoughCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCancellationMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code NoCancellationMatch = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCancellationMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.NoCancellationMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCompliantWithSLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code NotCompliantWithSLA = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.NotCompliantWithSLA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateOrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code DuplicateOrderReference = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateOrderReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.DuplicateOrderReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code InvestmentAccount = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.InvestmentAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEnoughFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code NotEnoughFinancialInstrument = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEnoughFinancialInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.NotEnoughFinancialInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooHighUnitsOrAmountToSubscribe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code TooHighUnitsOrAmountToSubscribe = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooHighUnitsOrAmountToSubscribe";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.TooHighUnitsOrAmountToSubscribe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLowUnitsOrAmountToSubscribe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code TooLowUnitsOrAmountToSubscribe = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLowUnitsOrAmountToSubscribe";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.TooLowUnitsOrAmountToSubscribe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedDealCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code UnacceptedDealCurrency = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedDealCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.UnacceptedDealCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownLinkagesReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code UnknownLinkagesReference = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownLinkagesReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.UnknownLinkagesReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedRequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code UnacceptedRequestedSettlementCurrency = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedRequestedSettlementCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.UnacceptedRequestedSettlementCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOrderedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code InvalidOrderedAmount = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOrderedAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidOrderedAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumInitialInvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code BelowMinimumInitialInvestmentAmount = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInitialInvestmentAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.BelowMinimumInitialInvestmentAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumTopUpAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code BelowMinimumTopUpAmount = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumTopUpAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.BelowMinimumTopUpAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code InsufficientCapacity = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCapacity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.InsufficientCapacity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageHoldingBreach"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code PercentageHoldingBreach = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageHoldingBreach";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.PercentageHoldingBreach.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code BelowMinimumRedemptionAmount = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRedemptionAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.BelowMinimumRedemptionAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRetainedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code BelowMinimumRetainedAmount = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRetainedAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.BelowMinimumRetainedAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LockUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code LockUp = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockUp";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.LockUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetsIlliquid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code AssetsIlliquid = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsIlliquid";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.AssetsIlliquid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code DataInvalid = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.DataInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundClosed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RejectedStatusReason10Code FundClosed = new RejectedStatusReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundClosed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason10Code.mmObject();
			codeName = RejectedStatusReasonCode.FundClosed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectedStatusReason10Code> codesByName = new LinkedHashMap<>();

	protected RejectedStatusReason10Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedStatusReason10Code";
				definition = "Specifies the reason for a rejected status.";
				trace_lazy = () -> RejectedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectedStatusReason10Code.AfterDeadline, com.tools20022.repository.codeset.RejectedStatusReason10Code.AccountBlockedForTransfer,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.CutOffTime, com.tools20022.repository.codeset.RejectedStatusReason10Code.SettlementDate,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.AccountBlockedMissingDocuments, com.tools20022.repository.codeset.RejectedStatusReason10Code.FinancialInstrumentQuantity,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.FinancialInstrumentIdentification, com.tools20022.repository.codeset.RejectedStatusReason10Code.TradeDate,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.FinancialInstrumentIdentificationAndName, com.tools20022.repository.codeset.RejectedStatusReason10Code.SubscriberOrRedeemer,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.Intermediary, com.tools20022.repository.codeset.RejectedStatusReason10Code.InvalidOrderType,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.InstructingPartyNotAllowedForAccount, com.tools20022.repository.codeset.RejectedStatusReason10Code.TooLate,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.NotEnoughCash, com.tools20022.repository.codeset.RejectedStatusReason10Code.NoCancellationMatch,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.NotCompliantWithSLA, com.tools20022.repository.codeset.RejectedStatusReason10Code.DuplicateOrderReference,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.InvestmentAccount, com.tools20022.repository.codeset.RejectedStatusReason10Code.NotEnoughFinancialInstrument,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.TooHighUnitsOrAmountToSubscribe, com.tools20022.repository.codeset.RejectedStatusReason10Code.TooLowUnitsOrAmountToSubscribe,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.UnacceptedDealCurrency, com.tools20022.repository.codeset.RejectedStatusReason10Code.UnknownLinkagesReference,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.UnacceptedRequestedSettlementCurrency, com.tools20022.repository.codeset.RejectedStatusReason10Code.InvalidOrderedAmount,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.BelowMinimumInitialInvestmentAmount, com.tools20022.repository.codeset.RejectedStatusReason10Code.BelowMinimumTopUpAmount,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.InsufficientCapacity, com.tools20022.repository.codeset.RejectedStatusReason10Code.PercentageHoldingBreach,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.BelowMinimumRedemptionAmount, com.tools20022.repository.codeset.RejectedStatusReason10Code.BelowMinimumRetainedAmount,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.LockUp, com.tools20022.repository.codeset.RejectedStatusReason10Code.AssetsIlliquid,
						com.tools20022.repository.codeset.RejectedStatusReason10Code.DataInvalid, com.tools20022.repository.codeset.RejectedStatusReason10Code.FundClosed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AfterDeadline.getCodeName().get(), AfterDeadline);
		codesByName.put(AccountBlockedForTransfer.getCodeName().get(), AccountBlockedForTransfer);
		codesByName.put(CutOffTime.getCodeName().get(), CutOffTime);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(AccountBlockedMissingDocuments.getCodeName().get(), AccountBlockedMissingDocuments);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
		codesByName.put(FinancialInstrumentIdentification.getCodeName().get(), FinancialInstrumentIdentification);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(FinancialInstrumentIdentificationAndName.getCodeName().get(), FinancialInstrumentIdentificationAndName);
		codesByName.put(SubscriberOrRedeemer.getCodeName().get(), SubscriberOrRedeemer);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(InvalidOrderType.getCodeName().get(), InvalidOrderType);
		codesByName.put(InstructingPartyNotAllowedForAccount.getCodeName().get(), InstructingPartyNotAllowedForAccount);
		codesByName.put(TooLate.getCodeName().get(), TooLate);
		codesByName.put(NotEnoughCash.getCodeName().get(), NotEnoughCash);
		codesByName.put(NoCancellationMatch.getCodeName().get(), NoCancellationMatch);
		codesByName.put(NotCompliantWithSLA.getCodeName().get(), NotCompliantWithSLA);
		codesByName.put(DuplicateOrderReference.getCodeName().get(), DuplicateOrderReference);
		codesByName.put(InvestmentAccount.getCodeName().get(), InvestmentAccount);
		codesByName.put(NotEnoughFinancialInstrument.getCodeName().get(), NotEnoughFinancialInstrument);
		codesByName.put(TooHighUnitsOrAmountToSubscribe.getCodeName().get(), TooHighUnitsOrAmountToSubscribe);
		codesByName.put(TooLowUnitsOrAmountToSubscribe.getCodeName().get(), TooLowUnitsOrAmountToSubscribe);
		codesByName.put(UnacceptedDealCurrency.getCodeName().get(), UnacceptedDealCurrency);
		codesByName.put(UnknownLinkagesReference.getCodeName().get(), UnknownLinkagesReference);
		codesByName.put(UnacceptedRequestedSettlementCurrency.getCodeName().get(), UnacceptedRequestedSettlementCurrency);
		codesByName.put(InvalidOrderedAmount.getCodeName().get(), InvalidOrderedAmount);
		codesByName.put(BelowMinimumInitialInvestmentAmount.getCodeName().get(), BelowMinimumInitialInvestmentAmount);
		codesByName.put(BelowMinimumTopUpAmount.getCodeName().get(), BelowMinimumTopUpAmount);
		codesByName.put(InsufficientCapacity.getCodeName().get(), InsufficientCapacity);
		codesByName.put(PercentageHoldingBreach.getCodeName().get(), PercentageHoldingBreach);
		codesByName.put(BelowMinimumRedemptionAmount.getCodeName().get(), BelowMinimumRedemptionAmount);
		codesByName.put(BelowMinimumRetainedAmount.getCodeName().get(), BelowMinimumRetainedAmount);
		codesByName.put(LockUp.getCodeName().get(), LockUp);
		codesByName.put(AssetsIlliquid.getCodeName().get(), AssetsIlliquid);
		codesByName.put(DataInvalid.getCodeName().get(), DataInvalid);
		codesByName.put(FundClosed.getCodeName().get(), FundClosed);
	}

	public static RejectedStatusReason10Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectedStatusReason10Code[] values() {
		RejectedStatusReason10Code[] values = new RejectedStatusReason10Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectedStatusReason10Code> {
		@Override
		public RejectedStatusReason10Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectedStatusReason10Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}