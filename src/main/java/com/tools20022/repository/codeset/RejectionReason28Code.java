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
import com.tools20022.repository.codeset.RejectionReason28Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction/cancellation request has a rejected
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#AgreementStartDate
 * RejectionReason28Code.AgreementStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#TypeOfOrderRejection
 * RejectionReason28Code.TypeOfOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#TransactionCallDelay
 * RejectionReason28Code.TransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#CommercializationContractRejection
 * RejectionReason28Code.CommercializationContractRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#SettlementDateRejection
 * RejectionReason28Code.SettlementDateRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#DealPrice
 * RejectionReason28Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#PlaceOfSettlementRejection
 * RejectionReason28Code.PlaceOfSettlementRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#SettlementAmountRejection
 * RejectionReason28Code.SettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#QuantityRejection
 * RejectionReason28Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#InvalidSecurity
 * RejectionReason28Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#TradeDate
 * RejectionReason28Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#FeeCommissionRejection
 * RejectionReason28Code.FeeCommissionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#ForfeitAmount
 * RejectionReason28Code.ForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#DeliveringAgent
 * RejectionReason28Code.DeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#ReceivingOrDeliveringCustodianRejection
 * RejectionReason28Code.ReceivingOrDeliveringCustodianRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#ReceivingDeliveringParty3
 * RejectionReason28Code.ReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#CommonReferenceRejection
 * RejectionReason28Code.CommonReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#NarrativeInformationRejection
 * RejectionReason28Code.NarrativeInformationRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#NarrativeReason
 * RejectionReason28Code.NarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#SettlementAmountCurrencyRejection
 * RejectionReason28Code.SettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#OrderDateNotProvided
 * RejectionReason28Code.OrderDateNotProvided}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#PlaceOfTrade
 * RejectionReason28Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#QuantityUnitType
 * RejectionReason28Code.QuantityUnitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#ReferenceRejection
 * RejectionReason28Code.ReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#ClosingTransactionAmount
 * RejectionReason28Code.ClosingTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#RepurchaseRate
 * RejectionReason28Code.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#PremiumAmount
 * RejectionReason28Code.PremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#RepurchaseRateType
 * RejectionReason28Code.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#SpreadRate
 * RejectionReason28Code.SpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#SafekeepingAccountRejection
 * RejectionReason28Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#SettlementTransactionRejection
 * RejectionReason28Code.SettlementTransactionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#SettlementSystemMethodRejection
 * RejectionReason28Code.SettlementSystemMethodRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#ClosingDateTimeRejection
 * RejectionReason28Code.ClosingDateTimeRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#TransactionNoticeAlreadyAcceptedOrRejected
 * RejectionReason28Code.TransactionNoticeAlreadyAcceptedOrRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#TransactionNoticeIDUnknown
 * RejectionReason28Code.TransactionNoticeIDUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#TradedQuantityHigherThanOriginalOrderQuantity
 * RejectionReason28Code.TradedQuantityHigherThanOriginalOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#TradedSecuritiesQuantity
 * RejectionReason28Code.TradedSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#TaxStatusRejection
 * RejectionReason28Code.TaxStatusRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#InvalidReference
 * RejectionReason28Code.InvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#VariableRateSupportRejection
 * RejectionReason28Code.VariableRateSupportRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#InstructionIrrevocable
 * RejectionReason28Code.InstructionIrrevocable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#OptionNumberRejection
 * RejectionReason28Code.OptionNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#InvalidOptionType
 * RejectionReason28Code.InvalidOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#UnknownSymbol
 * RejectionReason28Code.UnknownSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#ExceedsLimit
 * RejectionReason28Code.ExceedsLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#InvalidPrice
 * RejectionReason28Code.InvalidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#PriceExceeds
 * RejectionReason28Code.PriceExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#QuantityExceeds
 * RejectionReason28Code.QuantityExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#WrongSide
 * RejectionReason28Code.WrongSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#CalculationDifference
 * RejectionReason28Code.CalculationDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#UnknownDealExposure
 * RejectionReason28Code.UnknownDealExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#DisagreeWithCallAmount
 * RejectionReason28Code.DisagreeWithCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#DisagreeWithExposureAmount
 * RejectionReason28Code.DisagreeWithExposureAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#MissingResultingAmount
 * RejectionReason28Code.MissingResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#MissingExchangeRate
 * RejectionReason28Code.MissingExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#UnexpectedAccruedInterest
 * RejectionReason28Code.UnexpectedAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#GrossAmountLessThanNetAmount
 * RejectionReason28Code.GrossAmountLessThanNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#MissingDefaultOption
 * RejectionReason28Code.MissingDefaultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#FailedValidation
 * RejectionReason28Code.FailedValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#InvalidDetails
 * RejectionReason28Code.InvalidDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code#Other
 * RejectionReason28Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
 * RejectionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ASTM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason28Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason28Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementStartDate"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code AgreementStartDate = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementStartDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.AgreementStartDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOrderRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code TypeOfOrderRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrderRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.TypeOfOrderRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code TransactionCallDelay = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.TransactionCallDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercializationContractRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code CommercializationContractRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercializationContractRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.CommercializationContractRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code SettlementDateRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDateRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.SettlementDateRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code DealPrice = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSettlementRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code PlaceOfSettlementRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSettlementRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.PlaceOfSettlementRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code SettlementAmountRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.SettlementAmountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code QuantityRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code InvalidSecurity = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code TradeDate = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeCommissionRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code FeeCommissionRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeCommissionRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.FeeCommissionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code ForfeitAmount = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.ForfeitAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgent"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code DeliveringAgent = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.DeliveringAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingOrDeliveringCustodianRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code ReceivingOrDeliveringCustodianRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingOrDeliveringCustodianRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.ReceivingOrDeliveringCustodianRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code ReceivingDeliveringParty3 = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.ReceivingDeliveringParty3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReferenceRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code CommonReferenceRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReferenceRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.CommonReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeInformationRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code NarrativeInformationRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeInformationRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.NarrativeInformationRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeReason"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code NarrativeReason = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.NarrativeReason.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code SettlementAmountCurrencyRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.SettlementAmountCurrencyRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateNotProvided"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code OrderDateNotProvided = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateNotProvided";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.OrderDateNotProvided.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code PlaceOfTrade = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityUnitType"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code QuantityUnitType = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityUnitType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.QuantityUnitType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code ReferenceRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.ReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingTransactionAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code ClosingTransactionAmount = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingTransactionAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.ClosingTransactionAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code RepurchaseRate = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.RepurchaseRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code PremiumAmount = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.PremiumAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code RepurchaseRateType = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.RepurchaseRateType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code SpreadRate = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.SpreadRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code SafekeepingAccountRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.SafekeepingAccountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code SettlementTransactionRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.SettlementTransactionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code SettlementSystemMethodRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.SettlementSystemMethodRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTimeRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code ClosingDateTimeRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTimeRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.ClosingDateTimeRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNoticeAlreadyAcceptedOrRejected"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code TransactionNoticeAlreadyAcceptedOrRejected = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNoticeAlreadyAcceptedOrRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.TransactionNoticeAlreadyAcceptedOrRejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNoticeIDUnknown"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code TransactionNoticeIDUnknown = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNoticeIDUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.TransactionNoticeIDUnknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedQuantityHigherThanOriginalOrderQuantity"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code TradedQuantityHigherThanOriginalOrderQuantity = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedQuantityHigherThanOriginalOrderQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.TradedQuantityHigherThanOriginalOrderQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedSecuritiesQuantity"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code TradedSecuritiesQuantity = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedSecuritiesQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.TradedSecuritiesQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatusRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code TaxStatusRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatusRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.TaxStatusRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code InvalidReference = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.InvalidReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupportRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code VariableRateSupportRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupportRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.VariableRateSupportRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIrrevocable"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code InstructionIrrevocable = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIrrevocable";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.InstructionIrrevocable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code OptionNumberRejection = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.OptionNumberRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOptionType"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code InvalidOptionType = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOptionType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.InvalidOptionType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownSymbol"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code UnknownSymbol = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownSymbol";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.UnknownSymbol.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceedsLimit"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code ExceedsLimit = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceedsLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.ExceedsLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPrice"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code InvalidPrice = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.InvalidPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceExceeds"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code PriceExceeds = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceExceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.PriceExceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityExceeds"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code QuantityExceeds = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityExceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.QuantityExceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongSide"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code WrongSide = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSide";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.WrongSide.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDifference"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code CalculationDifference = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.CalculationDifference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownDealExposure"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code UnknownDealExposure = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownDealExposure";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.UnknownDealExposure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreeWithCallAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code DisagreeWithCallAmount = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithCallAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.DisagreeWithCallAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreeWithExposureAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code DisagreeWithExposureAmount = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithExposureAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.DisagreeWithExposureAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingResultingAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code MissingResultingAmount = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingResultingAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.MissingResultingAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingExchangeRate"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code MissingExchangeRate = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingExchangeRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.MissingExchangeRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnexpectedAccruedInterest"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code UnexpectedAccruedInterest = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnexpectedAccruedInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.UnexpectedAccruedInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountLessThanNetAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code GrossAmountLessThanNetAmount = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmountLessThanNetAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.GrossAmountLessThanNetAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDefaultOption"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code MissingDefaultOption = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDefaultOption";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.MissingDefaultOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code FailedValidation = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.FailedValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDetails"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code InvalidDetails = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.InvalidDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason28Code
	 * RejectionReason28Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final RejectionReason28Code Other = new RejectionReason28Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason28Code.mmObject();
			codeName = RejectionReasonCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason28Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason28Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ASTM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason28Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason28Code.AgreementStartDate, com.tools20022.repository.codeset.RejectionReason28Code.TypeOfOrderRejection,
						com.tools20022.repository.codeset.RejectionReason28Code.TransactionCallDelay, com.tools20022.repository.codeset.RejectionReason28Code.CommercializationContractRejection,
						com.tools20022.repository.codeset.RejectionReason28Code.SettlementDateRejection, com.tools20022.repository.codeset.RejectionReason28Code.DealPrice,
						com.tools20022.repository.codeset.RejectionReason28Code.PlaceOfSettlementRejection, com.tools20022.repository.codeset.RejectionReason28Code.SettlementAmountRejection,
						com.tools20022.repository.codeset.RejectionReason28Code.QuantityRejection, com.tools20022.repository.codeset.RejectionReason28Code.InvalidSecurity, com.tools20022.repository.codeset.RejectionReason28Code.TradeDate,
						com.tools20022.repository.codeset.RejectionReason28Code.FeeCommissionRejection, com.tools20022.repository.codeset.RejectionReason28Code.ForfeitAmount,
						com.tools20022.repository.codeset.RejectionReason28Code.DeliveringAgent, com.tools20022.repository.codeset.RejectionReason28Code.ReceivingOrDeliveringCustodianRejection,
						com.tools20022.repository.codeset.RejectionReason28Code.ReceivingDeliveringParty3, com.tools20022.repository.codeset.RejectionReason28Code.CommonReferenceRejection,
						com.tools20022.repository.codeset.RejectionReason28Code.NarrativeInformationRejection, com.tools20022.repository.codeset.RejectionReason28Code.NarrativeReason,
						com.tools20022.repository.codeset.RejectionReason28Code.SettlementAmountCurrencyRejection, com.tools20022.repository.codeset.RejectionReason28Code.OrderDateNotProvided,
						com.tools20022.repository.codeset.RejectionReason28Code.PlaceOfTrade, com.tools20022.repository.codeset.RejectionReason28Code.QuantityUnitType,
						com.tools20022.repository.codeset.RejectionReason28Code.ReferenceRejection, com.tools20022.repository.codeset.RejectionReason28Code.ClosingTransactionAmount,
						com.tools20022.repository.codeset.RejectionReason28Code.RepurchaseRate, com.tools20022.repository.codeset.RejectionReason28Code.PremiumAmount,
						com.tools20022.repository.codeset.RejectionReason28Code.RepurchaseRateType, com.tools20022.repository.codeset.RejectionReason28Code.SpreadRate,
						com.tools20022.repository.codeset.RejectionReason28Code.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReason28Code.SettlementTransactionRejection,
						com.tools20022.repository.codeset.RejectionReason28Code.SettlementSystemMethodRejection, com.tools20022.repository.codeset.RejectionReason28Code.ClosingDateTimeRejection,
						com.tools20022.repository.codeset.RejectionReason28Code.TransactionNoticeAlreadyAcceptedOrRejected, com.tools20022.repository.codeset.RejectionReason28Code.TransactionNoticeIDUnknown,
						com.tools20022.repository.codeset.RejectionReason28Code.TradedQuantityHigherThanOriginalOrderQuantity, com.tools20022.repository.codeset.RejectionReason28Code.TradedSecuritiesQuantity,
						com.tools20022.repository.codeset.RejectionReason28Code.TaxStatusRejection, com.tools20022.repository.codeset.RejectionReason28Code.InvalidReference,
						com.tools20022.repository.codeset.RejectionReason28Code.VariableRateSupportRejection, com.tools20022.repository.codeset.RejectionReason28Code.InstructionIrrevocable,
						com.tools20022.repository.codeset.RejectionReason28Code.OptionNumberRejection, com.tools20022.repository.codeset.RejectionReason28Code.InvalidOptionType,
						com.tools20022.repository.codeset.RejectionReason28Code.UnknownSymbol, com.tools20022.repository.codeset.RejectionReason28Code.ExceedsLimit, com.tools20022.repository.codeset.RejectionReason28Code.InvalidPrice,
						com.tools20022.repository.codeset.RejectionReason28Code.PriceExceeds, com.tools20022.repository.codeset.RejectionReason28Code.QuantityExceeds, com.tools20022.repository.codeset.RejectionReason28Code.WrongSide,
						com.tools20022.repository.codeset.RejectionReason28Code.CalculationDifference, com.tools20022.repository.codeset.RejectionReason28Code.UnknownDealExposure,
						com.tools20022.repository.codeset.RejectionReason28Code.DisagreeWithCallAmount, com.tools20022.repository.codeset.RejectionReason28Code.DisagreeWithExposureAmount,
						com.tools20022.repository.codeset.RejectionReason28Code.MissingResultingAmount, com.tools20022.repository.codeset.RejectionReason28Code.MissingExchangeRate,
						com.tools20022.repository.codeset.RejectionReason28Code.UnexpectedAccruedInterest, com.tools20022.repository.codeset.RejectionReason28Code.GrossAmountLessThanNetAmount,
						com.tools20022.repository.codeset.RejectionReason28Code.MissingDefaultOption, com.tools20022.repository.codeset.RejectionReason28Code.FailedValidation,
						com.tools20022.repository.codeset.RejectionReason28Code.InvalidDetails, com.tools20022.repository.codeset.RejectionReason28Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AgreementStartDate.getCodeName().get(), AgreementStartDate);
		codesByName.put(TypeOfOrderRejection.getCodeName().get(), TypeOfOrderRejection);
		codesByName.put(TransactionCallDelay.getCodeName().get(), TransactionCallDelay);
		codesByName.put(CommercializationContractRejection.getCodeName().get(), CommercializationContractRejection);
		codesByName.put(SettlementDateRejection.getCodeName().get(), SettlementDateRejection);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(PlaceOfSettlementRejection.getCodeName().get(), PlaceOfSettlementRejection);
		codesByName.put(SettlementAmountRejection.getCodeName().get(), SettlementAmountRejection);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(InvalidSecurity.getCodeName().get(), InvalidSecurity);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(FeeCommissionRejection.getCodeName().get(), FeeCommissionRejection);
		codesByName.put(ForfeitAmount.getCodeName().get(), ForfeitAmount);
		codesByName.put(DeliveringAgent.getCodeName().get(), DeliveringAgent);
		codesByName.put(ReceivingOrDeliveringCustodianRejection.getCodeName().get(), ReceivingOrDeliveringCustodianRejection);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(CommonReferenceRejection.getCodeName().get(), CommonReferenceRejection);
		codesByName.put(NarrativeInformationRejection.getCodeName().get(), NarrativeInformationRejection);
		codesByName.put(NarrativeReason.getCodeName().get(), NarrativeReason);
		codesByName.put(SettlementAmountCurrencyRejection.getCodeName().get(), SettlementAmountCurrencyRejection);
		codesByName.put(OrderDateNotProvided.getCodeName().get(), OrderDateNotProvided);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(QuantityUnitType.getCodeName().get(), QuantityUnitType);
		codesByName.put(ReferenceRejection.getCodeName().get(), ReferenceRejection);
		codesByName.put(ClosingTransactionAmount.getCodeName().get(), ClosingTransactionAmount);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(PremiumAmount.getCodeName().get(), PremiumAmount);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(SpreadRate.getCodeName().get(), SpreadRate);
		codesByName.put(SafekeepingAccountRejection.getCodeName().get(), SafekeepingAccountRejection);
		codesByName.put(SettlementTransactionRejection.getCodeName().get(), SettlementTransactionRejection);
		codesByName.put(SettlementSystemMethodRejection.getCodeName().get(), SettlementSystemMethodRejection);
		codesByName.put(ClosingDateTimeRejection.getCodeName().get(), ClosingDateTimeRejection);
		codesByName.put(TransactionNoticeAlreadyAcceptedOrRejected.getCodeName().get(), TransactionNoticeAlreadyAcceptedOrRejected);
		codesByName.put(TransactionNoticeIDUnknown.getCodeName().get(), TransactionNoticeIDUnknown);
		codesByName.put(TradedQuantityHigherThanOriginalOrderQuantity.getCodeName().get(), TradedQuantityHigherThanOriginalOrderQuantity);
		codesByName.put(TradedSecuritiesQuantity.getCodeName().get(), TradedSecuritiesQuantity);
		codesByName.put(TaxStatusRejection.getCodeName().get(), TaxStatusRejection);
		codesByName.put(InvalidReference.getCodeName().get(), InvalidReference);
		codesByName.put(VariableRateSupportRejection.getCodeName().get(), VariableRateSupportRejection);
		codesByName.put(InstructionIrrevocable.getCodeName().get(), InstructionIrrevocable);
		codesByName.put(OptionNumberRejection.getCodeName().get(), OptionNumberRejection);
		codesByName.put(InvalidOptionType.getCodeName().get(), InvalidOptionType);
		codesByName.put(UnknownSymbol.getCodeName().get(), UnknownSymbol);
		codesByName.put(ExceedsLimit.getCodeName().get(), ExceedsLimit);
		codesByName.put(InvalidPrice.getCodeName().get(), InvalidPrice);
		codesByName.put(PriceExceeds.getCodeName().get(), PriceExceeds);
		codesByName.put(QuantityExceeds.getCodeName().get(), QuantityExceeds);
		codesByName.put(WrongSide.getCodeName().get(), WrongSide);
		codesByName.put(CalculationDifference.getCodeName().get(), CalculationDifference);
		codesByName.put(UnknownDealExposure.getCodeName().get(), UnknownDealExposure);
		codesByName.put(DisagreeWithCallAmount.getCodeName().get(), DisagreeWithCallAmount);
		codesByName.put(DisagreeWithExposureAmount.getCodeName().get(), DisagreeWithExposureAmount);
		codesByName.put(MissingResultingAmount.getCodeName().get(), MissingResultingAmount);
		codesByName.put(MissingExchangeRate.getCodeName().get(), MissingExchangeRate);
		codesByName.put(UnexpectedAccruedInterest.getCodeName().get(), UnexpectedAccruedInterest);
		codesByName.put(GrossAmountLessThanNetAmount.getCodeName().get(), GrossAmountLessThanNetAmount);
		codesByName.put(MissingDefaultOption.getCodeName().get(), MissingDefaultOption);
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
		codesByName.put(InvalidDetails.getCodeName().get(), InvalidDetails);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static RejectionReason28Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason28Code[] values() {
		RejectionReason28Code[] values = new RejectionReason28Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason28Code> {
		@Override
		public RejectionReason28Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason28Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}