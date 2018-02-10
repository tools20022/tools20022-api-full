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
import com.tools20022.repository.codeset.HoldingRejectionReason41Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason the report item is rejected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidPrice
 * HoldingRejectionReason41Code.InvalidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidIdentification
 * HoldingRejectionReason41Code.InvalidIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidAgent
 * HoldingRejectionReason41Code.InvalidAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#Intermediary
 * HoldingRejectionReason41Code.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#IncorrectCertification
 * HoldingRejectionReason41Code.IncorrectCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#BusinessPartnerNumberRejection
 * HoldingRejectionReason41Code.BusinessPartnerNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#BankReferenceNumberRejection
 * HoldingRejectionReason41Code.BankReferenceNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#AddressDetailsRejection
 * HoldingRejectionReason41Code.AddressDetailsRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#DeliveringCustodian
 * HoldingRejectionReason41Code.DeliveringCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#IncorrectActivityType
 * HoldingRejectionReason41Code.IncorrectActivityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidForTaxAuthorities
 * HoldingRejectionReason41Code.InvalidForTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidDetails
 * HoldingRejectionReason41Code.InvalidDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidOption
 * HoldingRejectionReason41Code.InvalidOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidOptionType
 * HoldingRejectionReason41Code.InvalidOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidMovementInformation
 * HoldingRejectionReason41Code.InvalidMovementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidModificationRequest
 * HoldingRejectionReason41Code.InvalidModificationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidUnderlyingSecurity
 * HoldingRejectionReason41Code.InvalidUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidSecurity
 * HoldingRejectionReason41Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#MissingPeriodEndDate
 * HoldingRejectionReason41Code.MissingPeriodEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#MissingPeriodStartDate
 * HoldingRejectionReason41Code.MissingPeriodStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#MissingOption
 * HoldingRejectionReason41Code.MissingOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NoHolding
 * HoldingRejectionReason41Code.NoHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NoInstrumentMarket
 * HoldingRejectionReason41Code.NoInstrumentMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NotApplicable
 * HoldingRejectionReason41Code.NotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NotAuthorised
 * HoldingRejectionReason41Code.NotAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NotDefinedAgent
 * HoldingRejectionReason41Code.NotDefinedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NotEligibleDisperseSecurity
 * HoldingRejectionReason41Code.NotEligibleDisperseSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NotIdentifiedCorrespondentBank
 * HoldingRejectionReason41Code.NotIdentifiedCorrespondentBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#PlaceOfSafekeeping
 * HoldingRejectionReason41Code.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#PlaceOfTrade
 * HoldingRejectionReason41Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#PriceExceeds
 * HoldingRejectionReason41Code.PriceExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#ReceivingAgent
 * HoldingRejectionReason41Code.ReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#QuantityUnitType
 * HoldingRejectionReason41Code.QuantityUnitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#QuantityRejection
 * HoldingRejectionReason41Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#QuantityExceeds
 * HoldingRejectionReason41Code.QuantityExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#ReceivingDeliveringDepository
 * HoldingRejectionReason41Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#ReceivingCustodian
 * HoldingRejectionReason41Code.ReceivingCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#SafekeepingAccountRejection
 * HoldingRejectionReason41Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#SettlementAmountRejection
 * HoldingRejectionReason41Code.SettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#SettlementAmountCurrencyRejection
 * HoldingRejectionReason41Code.SettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#TradedSecuritiesQuantity
 * HoldingRejectionReason41Code.TradedSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#SettlementTransactionRejection
 * HoldingRejectionReason41Code.SettlementTransactionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#UnknownSymbol
 * HoldingRejectionReason41Code.UnknownSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#DealPrice
 * HoldingRejectionReason41Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#ClosingDateTimeRejection
 * HoldingRejectionReason41Code.ClosingDateTimeRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidReference
 * HoldingRejectionReason41Code.InvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NarrativeReason
 * HoldingRejectionReason41Code.NarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NotFoundRejection
 * HoldingRejectionReason41Code.NotFoundRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidBalance
 * HoldingRejectionReason41Code.InvalidBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#AccountServicerDeadlineMissed
 * HoldingRejectionReason41Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#CashAccount
 * HoldingRejectionReason41Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#CommercializationContractRejection
 * HoldingRejectionReason41Code.CommercializationContractRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#ConcentrationLimitExceeded
 * HoldingRejectionReason41Code.ConcentrationLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InsufficientBalance
 * HoldingRejectionReason41Code.InsufficientBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InsufficientCollateral
 * HoldingRejectionReason41Code.InsufficientCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidInvestorParty
 * HoldingRejectionReason41Code.InvalidInvestorParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidLotNumber
 * HoldingRejectionReason41Code.InvalidLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidLink
 * HoldingRejectionReason41Code.InvalidLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvalidRule
 * HoldingRejectionReason41Code.InvalidRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#InvestorNameAddressUnknown
 * HoldingRejectionReason41Code.InvestorNameAddressUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#Late
 * HoldingRejectionReason41Code.Late}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#MinimumSettlementQuantity
 * HoldingRejectionReason41Code.MinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#MissingBeneficiaryOwnerDetails
 * HoldingRejectionReason41Code.MissingBeneficiaryOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#MissingCertification
 * HoldingRejectionReason41Code.MissingCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#MissingOrInvalidPOA
 * HoldingRejectionReason41Code.MissingOrInvalidPOA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#MultipleSettlementQuantity
 * HoldingRejectionReason41Code.MultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NarrativeInformationRejection
 * HoldingRejectionReason41Code.NarrativeInformationRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NoInventory
 * HoldingRejectionReason41Code.NoInventory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NonEligibleSecurity
 * HoldingRejectionReason41Code.NonEligibleSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#PeriodEndDateBeforeStartDate
 * HoldingRejectionReason41Code.PeriodEndDateBeforeStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#ReferenceRejection
 * HoldingRejectionReason41Code.ReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#SameIdentification
 * HoldingRejectionReason41Code.SameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#TypeOfOwnershipRejection
 * HoldingRejectionReason41Code.TypeOfOwnershipRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code#NotAvailable
 * HoldingRejectionReason41Code.NotAvailable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
 * RejectionReasonV2Code}</li>
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
 * "HoldingRejectionReason41Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason the report item is rejected."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class HoldingRejectionReason41Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPrice"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidPrice = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidIdentification"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidIdentification = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAgent"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidAgent = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code Intermediary = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.Intermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCertification"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code IncorrectCertification = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.IncorrectCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessPartnerNumberRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code BusinessPartnerNumberRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessPartnerNumberRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.BusinessPartnerNumberRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankReferenceNumberRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code BankReferenceNumberRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankReferenceNumberRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.BankReferenceNumberRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressDetailsRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code AddressDetailsRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressDetailsRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.AddressDetailsRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringCustodian"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code DeliveringCustodian = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringCustodian";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.DeliveringCustodian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectActivityType"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code IncorrectActivityType = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectActivityType";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.IncorrectActivityType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidForTaxAuthorities"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidForTaxAuthorities = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidForTaxAuthorities";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidForTaxAuthorities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDetails"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidDetails = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOption"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidOption = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOption";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOptionType"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidOptionType = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOptionType";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidOptionType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMovementInformation"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidMovementInformation = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMovementInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidMovementInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidModificationRequest"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidModificationRequest = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidModificationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidModificationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidUnderlyingSecurity"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidUnderlyingSecurity = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidUnderlyingSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidUnderlyingSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidSecurity = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingPeriodEndDate"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code MissingPeriodEndDate = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingPeriodEndDate";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.MissingPeriodEndDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingPeriodStartDate"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code MissingPeriodStartDate = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingPeriodStartDate";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.MissingPeriodStartDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOption"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code MissingOption = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOption";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.MissingOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoHolding"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NoHolding = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoHolding";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NoHolding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoInstrumentMarket"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NoInstrumentMarket = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInstrumentMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NoInstrumentMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApplicable"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NotApplicable = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApplicable";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NotApplicable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorised"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NotAuthorised = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorised";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NotAuthorised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDefinedAgent"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NotDefinedAgent = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDefinedAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NotDefinedAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleDisperseSecurity"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NotEligibleDisperseSecurity = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEligibleDisperseSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NotEligibleDisperseSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotIdentifiedCorrespondentBank"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NotIdentifiedCorrespondentBank = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIdentifiedCorrespondentBank";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NotIdentifiedCorrespondentBank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code PlaceOfSafekeeping = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfSafekeeping.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code PlaceOfTrade = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceExceeds"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code PriceExceeds = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceExceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.PriceExceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code ReceivingAgent = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityUnitType"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code QuantityUnitType = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityUnitType";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.QuantityUnitType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code QuantityRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityExceeds"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code QuantityExceeds = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityExceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.QuantityExceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code ReceivingDeliveringDepository = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingCustodian"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code ReceivingCustodian = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingCustodian";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingCustodian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code SafekeepingAccountRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.SafekeepingAccountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code SettlementAmountRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code SettlementAmountCurrencyRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountCurrencyRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedSecuritiesQuantity"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code TradedSecuritiesQuantity = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedSecuritiesQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.TradedSecuritiesQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code SettlementTransactionRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementTransactionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownSymbol"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code UnknownSymbol = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownSymbol";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.UnknownSymbol.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code DealPrice = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTimeRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code ClosingDateTimeRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTimeRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.ClosingDateTimeRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidReference = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeReason"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NarrativeReason = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NarrativeReason.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotFoundRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NotFoundRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFoundRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NotFoundRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBalance"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidBalance = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code AccountServicerDeadlineMissed = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code CashAccount = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.CashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercializationContractRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code CommercializationContractRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercializationContractRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.CommercializationContractRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConcentrationLimitExceeded"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code ConcentrationLimitExceeded = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConcentrationLimitExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.ConcentrationLimitExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientBalance"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InsufficientBalance = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InsufficientBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCollateral"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InsufficientCollateral = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InsufficientCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidInvestorParty"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidInvestorParty = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidInvestorParty";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidInvestorParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidLotNumber"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidLotNumber = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLotNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidLotNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidLink"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidLink = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLink";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidLink.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidRule"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvalidRule = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidRule";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidRule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorNameAddressUnknown"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code InvestorNameAddressUnknown = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorNameAddressUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.InvestorNameAddressUnknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Late"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code Late = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Late";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.Late.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementQuantity"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code MinimumSettlementQuantity = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.MinimumSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingBeneficiaryOwnerDetails"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code MissingBeneficiaryOwnerDetails = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingBeneficiaryOwnerDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.MissingBeneficiaryOwnerDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCertification"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code MissingCertification = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.MissingCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOrInvalidPOA"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code MissingOrInvalidPOA = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrInvalidPOA";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.MissingOrInvalidPOA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementQuantity"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code MultipleSettlementQuantity = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.MultipleSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeInformationRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NarrativeInformationRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeInformationRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NarrativeInformationRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoInventory"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NoInventory = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInventory";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NoInventory.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleSecurity"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NonEligibleSecurity = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NonEligibleSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodEndDateBeforeStartDate"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code PeriodEndDateBeforeStartDate = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodEndDateBeforeStartDate";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.PeriodEndDateBeforeStartDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code ReferenceRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.ReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameIdentification"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code SameIdentification = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.SameIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOwnershipRejection"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code TypeOfOwnershipRejection = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOwnershipRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.TypeOfOwnershipRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingRejectionReason41Code
	 * HoldingRejectionReason41Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * </ul>
	 */
	public static final HoldingRejectionReason41Code NotAvailable = new HoldingRejectionReason41Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingRejectionReason41Code.mmObject();
			codeName = RejectionReasonV2Code.NotAvailable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, HoldingRejectionReason41Code> codesByName = new LinkedHashMap<>();

	protected HoldingRejectionReason41Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HoldingRejectionReason41Code";
				definition = "Specifies the reason the report item is rejected.";
				trace_lazy = () -> RejectionReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidPrice, com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidIdentification,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidAgent, com.tools20022.repository.codeset.HoldingRejectionReason41Code.Intermediary,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.IncorrectCertification, com.tools20022.repository.codeset.HoldingRejectionReason41Code.BusinessPartnerNumberRejection,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.BankReferenceNumberRejection, com.tools20022.repository.codeset.HoldingRejectionReason41Code.AddressDetailsRejection,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.DeliveringCustodian, com.tools20022.repository.codeset.HoldingRejectionReason41Code.IncorrectActivityType,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidForTaxAuthorities, com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidDetails,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidOption, com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidOptionType,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidMovementInformation, com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidModificationRequest,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidUnderlyingSecurity, com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidSecurity,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.MissingPeriodEndDate, com.tools20022.repository.codeset.HoldingRejectionReason41Code.MissingPeriodStartDate,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.MissingOption, com.tools20022.repository.codeset.HoldingRejectionReason41Code.NoHolding,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.NoInstrumentMarket, com.tools20022.repository.codeset.HoldingRejectionReason41Code.NotApplicable,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.NotAuthorised, com.tools20022.repository.codeset.HoldingRejectionReason41Code.NotDefinedAgent,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.NotEligibleDisperseSecurity, com.tools20022.repository.codeset.HoldingRejectionReason41Code.NotIdentifiedCorrespondentBank,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.PlaceOfSafekeeping, com.tools20022.repository.codeset.HoldingRejectionReason41Code.PlaceOfTrade,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.PriceExceeds, com.tools20022.repository.codeset.HoldingRejectionReason41Code.ReceivingAgent,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.QuantityUnitType, com.tools20022.repository.codeset.HoldingRejectionReason41Code.QuantityRejection,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.QuantityExceeds, com.tools20022.repository.codeset.HoldingRejectionReason41Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.ReceivingCustodian, com.tools20022.repository.codeset.HoldingRejectionReason41Code.SafekeepingAccountRejection,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.SettlementAmountRejection, com.tools20022.repository.codeset.HoldingRejectionReason41Code.SettlementAmountCurrencyRejection,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.TradedSecuritiesQuantity, com.tools20022.repository.codeset.HoldingRejectionReason41Code.SettlementTransactionRejection,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.UnknownSymbol, com.tools20022.repository.codeset.HoldingRejectionReason41Code.DealPrice,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.ClosingDateTimeRejection, com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidReference,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.NarrativeReason, com.tools20022.repository.codeset.HoldingRejectionReason41Code.NotFoundRejection,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidBalance, com.tools20022.repository.codeset.HoldingRejectionReason41Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.CashAccount, com.tools20022.repository.codeset.HoldingRejectionReason41Code.CommercializationContractRejection,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.ConcentrationLimitExceeded, com.tools20022.repository.codeset.HoldingRejectionReason41Code.InsufficientBalance,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.InsufficientCollateral, com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidInvestorParty,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidLotNumber, com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidLink,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvalidRule, com.tools20022.repository.codeset.HoldingRejectionReason41Code.InvestorNameAddressUnknown,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.Late, com.tools20022.repository.codeset.HoldingRejectionReason41Code.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.MissingBeneficiaryOwnerDetails, com.tools20022.repository.codeset.HoldingRejectionReason41Code.MissingCertification,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.MissingOrInvalidPOA, com.tools20022.repository.codeset.HoldingRejectionReason41Code.MultipleSettlementQuantity,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.NarrativeInformationRejection, com.tools20022.repository.codeset.HoldingRejectionReason41Code.NoInventory,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.NonEligibleSecurity, com.tools20022.repository.codeset.HoldingRejectionReason41Code.PeriodEndDateBeforeStartDate,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.ReferenceRejection, com.tools20022.repository.codeset.HoldingRejectionReason41Code.SameIdentification,
						com.tools20022.repository.codeset.HoldingRejectionReason41Code.TypeOfOwnershipRejection, com.tools20022.repository.codeset.HoldingRejectionReason41Code.NotAvailable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InvalidPrice.getCodeName().get(), InvalidPrice);
		codesByName.put(InvalidIdentification.getCodeName().get(), InvalidIdentification);
		codesByName.put(InvalidAgent.getCodeName().get(), InvalidAgent);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(IncorrectCertification.getCodeName().get(), IncorrectCertification);
		codesByName.put(BusinessPartnerNumberRejection.getCodeName().get(), BusinessPartnerNumberRejection);
		codesByName.put(BankReferenceNumberRejection.getCodeName().get(), BankReferenceNumberRejection);
		codesByName.put(AddressDetailsRejection.getCodeName().get(), AddressDetailsRejection);
		codesByName.put(DeliveringCustodian.getCodeName().get(), DeliveringCustodian);
		codesByName.put(IncorrectActivityType.getCodeName().get(), IncorrectActivityType);
		codesByName.put(InvalidForTaxAuthorities.getCodeName().get(), InvalidForTaxAuthorities);
		codesByName.put(InvalidDetails.getCodeName().get(), InvalidDetails);
		codesByName.put(InvalidOption.getCodeName().get(), InvalidOption);
		codesByName.put(InvalidOptionType.getCodeName().get(), InvalidOptionType);
		codesByName.put(InvalidMovementInformation.getCodeName().get(), InvalidMovementInformation);
		codesByName.put(InvalidModificationRequest.getCodeName().get(), InvalidModificationRequest);
		codesByName.put(InvalidUnderlyingSecurity.getCodeName().get(), InvalidUnderlyingSecurity);
		codesByName.put(InvalidSecurity.getCodeName().get(), InvalidSecurity);
		codesByName.put(MissingPeriodEndDate.getCodeName().get(), MissingPeriodEndDate);
		codesByName.put(MissingPeriodStartDate.getCodeName().get(), MissingPeriodStartDate);
		codesByName.put(MissingOption.getCodeName().get(), MissingOption);
		codesByName.put(NoHolding.getCodeName().get(), NoHolding);
		codesByName.put(NoInstrumentMarket.getCodeName().get(), NoInstrumentMarket);
		codesByName.put(NotApplicable.getCodeName().get(), NotApplicable);
		codesByName.put(NotAuthorised.getCodeName().get(), NotAuthorised);
		codesByName.put(NotDefinedAgent.getCodeName().get(), NotDefinedAgent);
		codesByName.put(NotEligibleDisperseSecurity.getCodeName().get(), NotEligibleDisperseSecurity);
		codesByName.put(NotIdentifiedCorrespondentBank.getCodeName().get(), NotIdentifiedCorrespondentBank);
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(PriceExceeds.getCodeName().get(), PriceExceeds);
		codesByName.put(ReceivingAgent.getCodeName().get(), ReceivingAgent);
		codesByName.put(QuantityUnitType.getCodeName().get(), QuantityUnitType);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(QuantityExceeds.getCodeName().get(), QuantityExceeds);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(ReceivingCustodian.getCodeName().get(), ReceivingCustodian);
		codesByName.put(SafekeepingAccountRejection.getCodeName().get(), SafekeepingAccountRejection);
		codesByName.put(SettlementAmountRejection.getCodeName().get(), SettlementAmountRejection);
		codesByName.put(SettlementAmountCurrencyRejection.getCodeName().get(), SettlementAmountCurrencyRejection);
		codesByName.put(TradedSecuritiesQuantity.getCodeName().get(), TradedSecuritiesQuantity);
		codesByName.put(SettlementTransactionRejection.getCodeName().get(), SettlementTransactionRejection);
		codesByName.put(UnknownSymbol.getCodeName().get(), UnknownSymbol);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(ClosingDateTimeRejection.getCodeName().get(), ClosingDateTimeRejection);
		codesByName.put(InvalidReference.getCodeName().get(), InvalidReference);
		codesByName.put(NarrativeReason.getCodeName().get(), NarrativeReason);
		codesByName.put(NotFoundRejection.getCodeName().get(), NotFoundRejection);
		codesByName.put(InvalidBalance.getCodeName().get(), InvalidBalance);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(CommercializationContractRejection.getCodeName().get(), CommercializationContractRejection);
		codesByName.put(ConcentrationLimitExceeded.getCodeName().get(), ConcentrationLimitExceeded);
		codesByName.put(InsufficientBalance.getCodeName().get(), InsufficientBalance);
		codesByName.put(InsufficientCollateral.getCodeName().get(), InsufficientCollateral);
		codesByName.put(InvalidInvestorParty.getCodeName().get(), InvalidInvestorParty);
		codesByName.put(InvalidLotNumber.getCodeName().get(), InvalidLotNumber);
		codesByName.put(InvalidLink.getCodeName().get(), InvalidLink);
		codesByName.put(InvalidRule.getCodeName().get(), InvalidRule);
		codesByName.put(InvestorNameAddressUnknown.getCodeName().get(), InvestorNameAddressUnknown);
		codesByName.put(Late.getCodeName().get(), Late);
		codesByName.put(MinimumSettlementQuantity.getCodeName().get(), MinimumSettlementQuantity);
		codesByName.put(MissingBeneficiaryOwnerDetails.getCodeName().get(), MissingBeneficiaryOwnerDetails);
		codesByName.put(MissingCertification.getCodeName().get(), MissingCertification);
		codesByName.put(MissingOrInvalidPOA.getCodeName().get(), MissingOrInvalidPOA);
		codesByName.put(MultipleSettlementQuantity.getCodeName().get(), MultipleSettlementQuantity);
		codesByName.put(NarrativeInformationRejection.getCodeName().get(), NarrativeInformationRejection);
		codesByName.put(NoInventory.getCodeName().get(), NoInventory);
		codesByName.put(NonEligibleSecurity.getCodeName().get(), NonEligibleSecurity);
		codesByName.put(PeriodEndDateBeforeStartDate.getCodeName().get(), PeriodEndDateBeforeStartDate);
		codesByName.put(ReferenceRejection.getCodeName().get(), ReferenceRejection);
		codesByName.put(SameIdentification.getCodeName().get(), SameIdentification);
		codesByName.put(TypeOfOwnershipRejection.getCodeName().get(), TypeOfOwnershipRejection);
		codesByName.put(NotAvailable.getCodeName().get(), NotAvailable);
	}

	public static HoldingRejectionReason41Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static HoldingRejectionReason41Code[] values() {
		HoldingRejectionReason41Code[] values = new HoldingRejectionReason41Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, HoldingRejectionReason41Code> {
		@Override
		public HoldingRejectionReason41Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(HoldingRejectionReason41Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}