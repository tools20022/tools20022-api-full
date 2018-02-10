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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RejectedStatusReason11Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#AccountBlockedForCorporateAction
 * RejectedStatusReason11Code.AccountBlockedForCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#AccountBlockedForTransfer
 * RejectedStatusReason11Code.AccountBlockedForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#AccountBlockedMissingDocuments
 * RejectedStatusReason11Code.AccountBlockedMissingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#AfterDeadline
 * RejectedStatusReason11Code.AfterDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#AssetsIlliquid
 * RejectedStatusReason11Code.AssetsIlliquid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#BelowMinimumInitialInvestmentAmount
 * RejectedStatusReason11Code.BelowMinimumInitialInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#BelowMinimumRedemptionAmount
 * RejectedStatusReason11Code.BelowMinimumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#BelowMinimumRetainedAmount
 * RejectedStatusReason11Code.BelowMinimumRetainedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#CutOffTime
 * RejectedStatusReason11Code.CutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#DeliveringAgent
 * RejectedStatusReason11Code.DeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#DirectDebit
 * RejectedStatusReason11Code.DirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#DuplicateOrderReference
 * RejectedStatusReason11Code.DuplicateOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#FeeOrCommission
 * RejectedStatusReason11Code.FeeOrCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#FinancialInstrumentIdentification
 * RejectedStatusReason11Code.FinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#FinancialInstrumentIdentificationAndName
 * RejectedStatusReason11Code.FinancialInstrumentIdentificationAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#FinancialInstrumentQuantity
 * RejectedStatusReason11Code.FinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#FundClosed
 * RejectedStatusReason11Code.FundClosed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#InstructingPartyNotAllowedForAccount
 * RejectedStatusReason11Code.InstructingPartyNotAllowedForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#InsufficientCapacity
 * RejectedStatusReason11Code.InsufficientCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#Intermediary
 * RejectedStatusReason11Code.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#InvalidCashAccount
 * RejectedStatusReason11Code.InvalidCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#InvalidCreditTransfer
 * RejectedStatusReason11Code.InvalidCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#InvalidOrderType
 * RejectedStatusReason11Code.InvalidOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#InvalidSecurityForm
 * RejectedStatusReason11Code.InvalidSecurityForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#InvalidSettlementAmount
 * RejectedStatusReason11Code.InvalidSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#InvestmentAccount
 * RejectedStatusReason11Code.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#LockUp
 * RejectedStatusReason11Code.LockUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#NoCancellationMatch
 * RejectedStatusReason11Code.NoCancellationMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#NotCompliantWithSLA
 * RejectedStatusReason11Code.NotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#NotEnoughCash
 * RejectedStatusReason11Code.NotEnoughCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#NotEnoughFinancialInstrument
 * RejectedStatusReason11Code.NotEnoughFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#PaymentCard
 * RejectedStatusReason11Code.PaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#PercentageHoldingBreach
 * RejectedStatusReason11Code.PercentageHoldingBreach}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#PhysicalDeliveryImpossible
 * RejectedStatusReason11Code.PhysicalDeliveryImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#PhysicalSettlement
 * RejectedStatusReason11Code.PhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#PlaceOfTrade
 * RejectedStatusReason11Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#ReceivingAgent
 * RejectedStatusReason11Code.ReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#RTGSSystem
 * RejectedStatusReason11Code.RTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#SafekeepingPlace
 * RejectedStatusReason11Code.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#SettlementAmountCurrency
 * RejectedStatusReason11Code.SettlementAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#SettlementDate
 * RejectedStatusReason11Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#SettlementPlace
 * RejectedStatusReason11Code.SettlementPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#SettlementTransaction
 * RejectedStatusReason11Code.SettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#SubscriberOrRedeemer
 * RejectedStatusReason11Code.SubscriberOrRedeemer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#TooHighUnitsOrAmountToSubscribe
 * RejectedStatusReason11Code.TooHighUnitsOrAmountToSubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#TooLate
 * RejectedStatusReason11Code.TooLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#TooLowUnitsOrAmountToSubscribe
 * RejectedStatusReason11Code.TooLowUnitsOrAmountToSubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#TradeDate
 * RejectedStatusReason11Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#UnacceptedCommissionWaiving
 * RejectedStatusReason11Code.UnacceptedCommissionWaiving}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#UnacceptedDealCurrency
 * RejectedStatusReason11Code.UnacceptedDealCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#UnacceptedNAVCurrency
 * RejectedStatusReason11Code.UnacceptedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#UnacceptedPaymentMethod
 * RejectedStatusReason11Code.UnacceptedPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#UnacceptedRequestedSettlementCurrency
 * RejectedStatusReason11Code.UnacceptedRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#UnknownLinkagesReference
 * RejectedStatusReason11Code.UnknownLinkagesReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#UnacceptableSwitchCombination
 * RejectedStatusReason11Code.UnacceptableSwitchCombination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code#DifferentValuationPoints
 * RejectedStatusReason11Code.DifferentValuationPoints}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectedStatusReason11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a rejected status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectedStatusReason11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedForCorporateAction"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code AccountBlockedForCorporateAction = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedForCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.AccountBlockedForCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedForTransfer"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code AccountBlockedForTransfer = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedForTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.AccountBlockedForTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedMissingDocuments"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code AccountBlockedMissingDocuments = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedMissingDocuments";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.AccountBlockedMissingDocuments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterDeadline"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code AfterDeadline = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterDeadline";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.AfterDeadline.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetsIlliquid"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code AssetsIlliquid = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsIlliquid";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.AssetsIlliquid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumInitialInvestmentAmount"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code BelowMinimumInitialInvestmentAmount = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInitialInvestmentAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.BelowMinimumInitialInvestmentAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRedemptionAmount"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code BelowMinimumRedemptionAmount = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRedemptionAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.BelowMinimumRedemptionAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRetainedAmount"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code BelowMinimumRetainedAmount = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRetainedAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.BelowMinimumRetainedAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffTime"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code CutOffTime = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffTime";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.CutOffTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgent"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code DeliveringAgent = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.DeliveringAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebit"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code DirectDebit = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.DirectDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateOrderReference"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code DuplicateOrderReference = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateOrderReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.DuplicateOrderReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeOrCommission"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code FeeOrCommission = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeOrCommission";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.FeeOrCommission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code FinancialInstrumentIdentification = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationAndName"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code FinancialInstrumentIdentificationAndName = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationAndName";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentIdentificationAndName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::REJT//DQUA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code FinancialInstrumentQuantity = new RejectedStatusReason11Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::REJT//DQUA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundClosed"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code FundClosed = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundClosed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.FundClosed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingPartyNotAllowedForAccount"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code InstructingPartyNotAllowedForAccount = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingPartyNotAllowedForAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.InstructingPartyNotAllowedForAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCapacity"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code InsufficientCapacity = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCapacity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.InsufficientCapacity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code Intermediary = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.Intermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCashAccount"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code InvalidCashAccount = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCashAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidCashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCreditTransfer"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code InvalidCreditTransfer = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCreditTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidCreditTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOrderType"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code InvalidOrderType = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOrderType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidOrderType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurityForm"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code InvalidSecurityForm = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurityForm";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidSecurityForm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSettlementAmount"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code InvalidSettlementAmount = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code InvestmentAccount = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.InvestmentAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LockUp"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code LockUp = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockUp";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.LockUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCancellationMatch"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code NoCancellationMatch = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCancellationMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.NoCancellationMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCompliantWithSLA"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code NotCompliantWithSLA = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.NotCompliantWithSLA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEnoughCash"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code NotEnoughCash = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEnoughCash";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.NotEnoughCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEnoughFinancialInstrument"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code NotEnoughFinancialInstrument = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEnoughFinancialInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.NotEnoughFinancialInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCard"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code PaymentCard = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCard";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.PaymentCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageHoldingBreach"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code PercentageHoldingBreach = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageHoldingBreach";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.PercentageHoldingBreach.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryImpossible"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code PhysicalDeliveryImpossible = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryImpossible";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.PhysicalDeliveryImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlement"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code PhysicalSettlement = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.PhysicalSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code PlaceOfTrade = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code ReceivingAgent = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.ReceivingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGSSystem"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code RTGSSystem = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGSSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.RTGSSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code SafekeepingPlace = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.SafekeepingPlace.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrency"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code SettlementAmountCurrency = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementAmountCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::REJT//DDAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code SettlementDate = new RejectedStatusReason11Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::REJT//DDAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlace"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code SettlementPlace = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPlace";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementPlace.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code SettlementTransaction = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriberOrRedeemer"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code SubscriberOrRedeemer = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriberOrRedeemer";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.SubscriberOrRedeemer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooHighUnitsOrAmountToSubscribe"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code TooHighUnitsOrAmountToSubscribe = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooHighUnitsOrAmountToSubscribe";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.TooHighUnitsOrAmountToSubscribe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLate"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code TooLate = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.TooLate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLowUnitsOrAmountToSubscribe"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code TooLowUnitsOrAmountToSubscribe = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLowUnitsOrAmountToSubscribe";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.TooLowUnitsOrAmountToSubscribe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code TradeDate = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedCommissionWaiving"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code UnacceptedCommissionWaiving = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedCommissionWaiving";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.UnacceptedCommissionWaiving.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedDealCurrency"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code UnacceptedDealCurrency = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedDealCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.UnacceptedDealCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedNAVCurrency"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code UnacceptedNAVCurrency = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedNAVCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.UnacceptedNAVCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedPaymentMethod"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code UnacceptedPaymentMethod = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedPaymentMethod";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.UnacceptedPaymentMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedRequestedSettlementCurrency"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code UnacceptedRequestedSettlementCurrency = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedRequestedSettlementCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.UnacceptedRequestedSettlementCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownLinkagesReference"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code UnknownLinkagesReference = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownLinkagesReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.UnknownLinkagesReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptableSwitchCombination"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code UnacceptableSwitchCombination = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableSwitchCombination";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.UnacceptableSwitchCombination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason11Code
	 * RejectedStatusReason11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentValuationPoints"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason11Code DifferentValuationPoints = new RejectedStatusReason11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentValuationPoints";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason11Code.mmObject();
			codeName = RejectedStatusReasonCode.DifferentValuationPoints.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectedStatusReason11Code> codesByName = new LinkedHashMap<>();

	protected RejectedStatusReason11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedStatusReason11Code";
				definition = "Specifies the reason for a rejected status.";
				trace_lazy = () -> RejectedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectedStatusReason11Code.AccountBlockedForCorporateAction, com.tools20022.repository.codeset.RejectedStatusReason11Code.AccountBlockedForTransfer,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.AccountBlockedMissingDocuments, com.tools20022.repository.codeset.RejectedStatusReason11Code.AfterDeadline,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.AssetsIlliquid, com.tools20022.repository.codeset.RejectedStatusReason11Code.BelowMinimumInitialInvestmentAmount,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.BelowMinimumRedemptionAmount, com.tools20022.repository.codeset.RejectedStatusReason11Code.BelowMinimumRetainedAmount,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.CutOffTime, com.tools20022.repository.codeset.RejectedStatusReason11Code.DeliveringAgent,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.DirectDebit, com.tools20022.repository.codeset.RejectedStatusReason11Code.DuplicateOrderReference,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.FeeOrCommission, com.tools20022.repository.codeset.RejectedStatusReason11Code.FinancialInstrumentIdentification,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.FinancialInstrumentIdentificationAndName, com.tools20022.repository.codeset.RejectedStatusReason11Code.FinancialInstrumentQuantity,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.FundClosed, com.tools20022.repository.codeset.RejectedStatusReason11Code.InstructingPartyNotAllowedForAccount,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.InsufficientCapacity, com.tools20022.repository.codeset.RejectedStatusReason11Code.Intermediary,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.InvalidCashAccount, com.tools20022.repository.codeset.RejectedStatusReason11Code.InvalidCreditTransfer,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.InvalidOrderType, com.tools20022.repository.codeset.RejectedStatusReason11Code.InvalidSecurityForm,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.InvalidSettlementAmount, com.tools20022.repository.codeset.RejectedStatusReason11Code.InvestmentAccount,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.LockUp, com.tools20022.repository.codeset.RejectedStatusReason11Code.NoCancellationMatch,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.NotCompliantWithSLA, com.tools20022.repository.codeset.RejectedStatusReason11Code.NotEnoughCash,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.NotEnoughFinancialInstrument, com.tools20022.repository.codeset.RejectedStatusReason11Code.PaymentCard,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.PercentageHoldingBreach, com.tools20022.repository.codeset.RejectedStatusReason11Code.PhysicalDeliveryImpossible,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.PhysicalSettlement, com.tools20022.repository.codeset.RejectedStatusReason11Code.PlaceOfTrade,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.ReceivingAgent, com.tools20022.repository.codeset.RejectedStatusReason11Code.RTGSSystem,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.SafekeepingPlace, com.tools20022.repository.codeset.RejectedStatusReason11Code.SettlementAmountCurrency,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.SettlementDate, com.tools20022.repository.codeset.RejectedStatusReason11Code.SettlementPlace,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.SettlementTransaction, com.tools20022.repository.codeset.RejectedStatusReason11Code.SubscriberOrRedeemer,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.TooHighUnitsOrAmountToSubscribe, com.tools20022.repository.codeset.RejectedStatusReason11Code.TooLate,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.TooLowUnitsOrAmountToSubscribe, com.tools20022.repository.codeset.RejectedStatusReason11Code.TradeDate,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.UnacceptedCommissionWaiving, com.tools20022.repository.codeset.RejectedStatusReason11Code.UnacceptedDealCurrency,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.UnacceptedNAVCurrency, com.tools20022.repository.codeset.RejectedStatusReason11Code.UnacceptedPaymentMethod,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.UnacceptedRequestedSettlementCurrency, com.tools20022.repository.codeset.RejectedStatusReason11Code.UnknownLinkagesReference,
						com.tools20022.repository.codeset.RejectedStatusReason11Code.UnacceptableSwitchCombination, com.tools20022.repository.codeset.RejectedStatusReason11Code.DifferentValuationPoints);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountBlockedForCorporateAction.getCodeName().get(), AccountBlockedForCorporateAction);
		codesByName.put(AccountBlockedForTransfer.getCodeName().get(), AccountBlockedForTransfer);
		codesByName.put(AccountBlockedMissingDocuments.getCodeName().get(), AccountBlockedMissingDocuments);
		codesByName.put(AfterDeadline.getCodeName().get(), AfterDeadline);
		codesByName.put(AssetsIlliquid.getCodeName().get(), AssetsIlliquid);
		codesByName.put(BelowMinimumInitialInvestmentAmount.getCodeName().get(), BelowMinimumInitialInvestmentAmount);
		codesByName.put(BelowMinimumRedemptionAmount.getCodeName().get(), BelowMinimumRedemptionAmount);
		codesByName.put(BelowMinimumRetainedAmount.getCodeName().get(), BelowMinimumRetainedAmount);
		codesByName.put(CutOffTime.getCodeName().get(), CutOffTime);
		codesByName.put(DeliveringAgent.getCodeName().get(), DeliveringAgent);
		codesByName.put(DirectDebit.getCodeName().get(), DirectDebit);
		codesByName.put(DuplicateOrderReference.getCodeName().get(), DuplicateOrderReference);
		codesByName.put(FeeOrCommission.getCodeName().get(), FeeOrCommission);
		codesByName.put(FinancialInstrumentIdentification.getCodeName().get(), FinancialInstrumentIdentification);
		codesByName.put(FinancialInstrumentIdentificationAndName.getCodeName().get(), FinancialInstrumentIdentificationAndName);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
		codesByName.put(FundClosed.getCodeName().get(), FundClosed);
		codesByName.put(InstructingPartyNotAllowedForAccount.getCodeName().get(), InstructingPartyNotAllowedForAccount);
		codesByName.put(InsufficientCapacity.getCodeName().get(), InsufficientCapacity);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(InvalidCashAccount.getCodeName().get(), InvalidCashAccount);
		codesByName.put(InvalidCreditTransfer.getCodeName().get(), InvalidCreditTransfer);
		codesByName.put(InvalidOrderType.getCodeName().get(), InvalidOrderType);
		codesByName.put(InvalidSecurityForm.getCodeName().get(), InvalidSecurityForm);
		codesByName.put(InvalidSettlementAmount.getCodeName().get(), InvalidSettlementAmount);
		codesByName.put(InvestmentAccount.getCodeName().get(), InvestmentAccount);
		codesByName.put(LockUp.getCodeName().get(), LockUp);
		codesByName.put(NoCancellationMatch.getCodeName().get(), NoCancellationMatch);
		codesByName.put(NotCompliantWithSLA.getCodeName().get(), NotCompliantWithSLA);
		codesByName.put(NotEnoughCash.getCodeName().get(), NotEnoughCash);
		codesByName.put(NotEnoughFinancialInstrument.getCodeName().get(), NotEnoughFinancialInstrument);
		codesByName.put(PaymentCard.getCodeName().get(), PaymentCard);
		codesByName.put(PercentageHoldingBreach.getCodeName().get(), PercentageHoldingBreach);
		codesByName.put(PhysicalDeliveryImpossible.getCodeName().get(), PhysicalDeliveryImpossible);
		codesByName.put(PhysicalSettlement.getCodeName().get(), PhysicalSettlement);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(ReceivingAgent.getCodeName().get(), ReceivingAgent);
		codesByName.put(RTGSSystem.getCodeName().get(), RTGSSystem);
		codesByName.put(SafekeepingPlace.getCodeName().get(), SafekeepingPlace);
		codesByName.put(SettlementAmountCurrency.getCodeName().get(), SettlementAmountCurrency);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(SettlementPlace.getCodeName().get(), SettlementPlace);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
		codesByName.put(SubscriberOrRedeemer.getCodeName().get(), SubscriberOrRedeemer);
		codesByName.put(TooHighUnitsOrAmountToSubscribe.getCodeName().get(), TooHighUnitsOrAmountToSubscribe);
		codesByName.put(TooLate.getCodeName().get(), TooLate);
		codesByName.put(TooLowUnitsOrAmountToSubscribe.getCodeName().get(), TooLowUnitsOrAmountToSubscribe);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(UnacceptedCommissionWaiving.getCodeName().get(), UnacceptedCommissionWaiving);
		codesByName.put(UnacceptedDealCurrency.getCodeName().get(), UnacceptedDealCurrency);
		codesByName.put(UnacceptedNAVCurrency.getCodeName().get(), UnacceptedNAVCurrency);
		codesByName.put(UnacceptedPaymentMethod.getCodeName().get(), UnacceptedPaymentMethod);
		codesByName.put(UnacceptedRequestedSettlementCurrency.getCodeName().get(), UnacceptedRequestedSettlementCurrency);
		codesByName.put(UnknownLinkagesReference.getCodeName().get(), UnknownLinkagesReference);
		codesByName.put(UnacceptableSwitchCombination.getCodeName().get(), UnacceptableSwitchCombination);
		codesByName.put(DifferentValuationPoints.getCodeName().get(), DifferentValuationPoints);
	}

	public static RejectedStatusReason11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectedStatusReason11Code[] values() {
		RejectedStatusReason11Code[] values = new RejectedStatusReason11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectedStatusReason11Code> {
		@Override
		public RejectedStatusReason11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectedStatusReason11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}