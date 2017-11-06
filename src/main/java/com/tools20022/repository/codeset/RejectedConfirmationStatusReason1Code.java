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
import com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a confirmation rejected status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
 * RejectedConfirmationStatusReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentInvestmentAccountDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentFinancialInstrumentDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentBeneficiaryDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentPlaceOfTrade
 * RejectedConfirmationStatusReason1Code.mmDifferentPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentOrderDateTime
 * RejectedConfirmationStatusReason1Code.mmDifferentOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentCancellationRight
 * RejectedConfirmationStatusReason1Code.mmDifferentCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentUnitsNumber
 * RejectedConfirmationStatusReason1Code.mmDifferentUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentOrderType
 * RejectedConfirmationStatusReason1Code.mmDifferentOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentRounding
 * RejectedConfirmationStatusReason1Code.mmDifferentRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentNetAmount
 * RejectedConfirmationStatusReason1Code.mmDifferentNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentGrossAmount
 * RejectedConfirmationStatusReason1Code.mmDifferentGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentHoldingsRedemptionRate
 * RejectedConfirmationStatusReason1Code.mmDifferentHoldingsRedemptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentGroup1Or2Units
 * RejectedConfirmationStatusReason1Code.mmDifferentGroup1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentIncomePreference
 * RejectedConfirmationStatusReason1Code.mmDifferentIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentLetterIntentReference
 * RejectedConfirmationStatusReason1Code.mmDifferentLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentAccumulationRightReference
 * RejectedConfirmationStatusReason1Code.mmDifferentAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentPhysicalDeliveryIndicator
 * RejectedConfirmationStatusReason1Code.mmDifferentPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentRequestedSettlementCurrency
 * RejectedConfirmationStatusReason1Code.mmDifferentRequestedSettlementCurrency}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentRequestedNAVCurrency
 * RejectedConfirmationStatusReason1Code.mmDifferentRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentForeignExchangeDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentChargeDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentCommissionDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentTaxDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentPhysicalDeliveryDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentSettlementAndCustodyDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentSettlementAndCustodyDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentPaymentInstrumentDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentPaymentInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentSettlementAmount
 * RejectedConfirmationStatusReason1Code.mmDifferentSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentSettlementDate
 * RejectedConfirmationStatusReason1Code.mmDifferentSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentExtensionDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentExtensionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentIntermediaryDetails
 * RejectedConfirmationStatusReason1Code.mmDifferentIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentTotalRedemptionAmount
 * RejectedConfirmationStatusReason1Code.mmDifferentTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentTotalSubscriptionAmount
 * RejectedConfirmationStatusReason1Code.mmDifferentTotalSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentAdditionalCashIn
 * RejectedConfirmationStatusReason1Code.mmDifferentAdditionalCashIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentResultingCashOut
 * RejectedConfirmationStatusReason1Code.mmDifferentResultingCashOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentPercentageOfTotalSubscriptionAmount
 * RejectedConfirmationStatusReason1Code.
 * mmDifferentPercentageOfTotalSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentPercentageOfTotalRedemptionAmount
 * RejectedConfirmationStatusReason1Code.
 * mmDifferentPercentageOfTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentLegIdentification
 * RejectedConfirmationStatusReason1Code.mmDifferentLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDifferentOrderReference
 * RejectedConfirmationStatusReason1Code.mmDifferentOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmUnknownLinkagesReference
 * RejectedConfirmationStatusReason1Code.mmUnknownLinkagesReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDuplicateDealReference
 * RejectedConfirmationStatusReason1Code.mmDuplicateDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmReceivingAgent
 * RejectedConfirmationStatusReason1Code.mmReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmReceiversCustodian
 * RejectedConfirmationStatusReason1Code.mmReceiversCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmReceiversIntermediary
 * RejectedConfirmationStatusReason1Code.mmReceiversIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDeliveringAgent
 * RejectedConfirmationStatusReason1Code.mmDeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDeliverersCustodian
 * RejectedConfirmationStatusReason1Code.mmDeliverersCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmDeliverersIntermediary
 * RejectedConfirmationStatusReason1Code.mmDeliverersIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmInvalidCreditTransfer
 * RejectedConfirmationStatusReason1Code.mmInvalidCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmSettlementAmount
 * RejectedConfirmationStatusReason1Code.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmSettlementDate
 * RejectedConfirmationStatusReason1Code.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmNotCompliantWithSLA
 * RejectedConfirmationStatusReason1Code.mmNotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmMissingEUTaxInformation
 * RejectedConfirmationStatusReason1Code.mmMissingEUTaxInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmMissingCommission
 * RejectedConfirmationStatusReason1Code.mmMissingCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmMissingCharge
 * RejectedConfirmationStatusReason1Code.mmMissingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmMissingTaxInformation
 * RejectedConfirmationStatusReason1Code.mmMissingTaxInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmNotAllowedtoAmend
 * RejectedConfirmationStatusReason1Code.mmNotAllowedtoAmend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#mmAmendmentTooLate
 * RejectedConfirmationStatusReason1Code.mmAmendmentTooLate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DSAF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectedConfirmationStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a confirmation rejected status."</li>
 * </ul>
 */
public class RejectedConfirmationStatusReason1Code extends RejectedConfirmationStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentInvestmentAccountDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentInvestmentAccountDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentInvestmentAccountDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentFinancialInstrumentDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentFinancialInstrumentDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentFinancialInstrumentDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentBeneficiaryDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentBeneficiaryDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentBeneficiaryDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPlaceOfTrade"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentPlaceOfTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPlaceOfTrade";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentOrderDateTime"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentOrderDateTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderDateTime";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentCancellationRight"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentCancellationRight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentCancellationRight";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentUnitsNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentUnitsNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentUnitsNumber";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentOrderType"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentOrderType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderType";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentRounding"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentRounding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRounding";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentNetAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentNetAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentNetAmount";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentGrossAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentGrossAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentGrossAmount";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentHoldingsRedemptionRate"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentHoldingsRedemptionRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentHoldingsRedemptionRate";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentGroup1Or2Units"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentGroup1Or2Units = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentGroup1Or2Units";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentIncomePreference"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentIncomePreference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentIncomePreference";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentLetterIntentReference"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentLetterIntentReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentLetterIntentReference";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentAccumulationRightReference"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentAccumulationRightReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentAccumulationRightReference";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPhysicalDeliveryIndicator"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentPhysicalDeliveryIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPhysicalDeliveryIndicator";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentRequestedSettlementCurrency"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentRequestedSettlementCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRequestedSettlementCurrency";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentRequestedNAVCurrency"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentRequestedNAVCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRequestedNAVCurrency";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentForeignExchangeDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentForeignExchangeDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentForeignExchangeDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentChargeDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentChargeDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentChargeDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentCommissionDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentCommissionDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentCommissionDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentTaxDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentTaxDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTaxDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPhysicalDeliveryDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentPhysicalDeliveryDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPhysicalDeliveryDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentSettlementAndCustodyDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentSettlementAndCustodyDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementAndCustodyDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPaymentInstrumentDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentPaymentInstrumentDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPaymentInstrumentDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentSettlementAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementAmount";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentSettlementDate"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentSettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementDate";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentExtensionDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentExtensionDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentExtensionDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentIntermediaryDetails"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentIntermediaryDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentIntermediaryDetails";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentTotalRedemptionAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentTotalRedemptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTotalRedemptionAmount";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentTotalSubscriptionAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentTotalSubscriptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTotalSubscriptionAmount";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentAdditionalCashIn"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentAdditionalCashIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentAdditionalCashIn";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentResultingCashOut"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentResultingCashOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentResultingCashOut";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPercentageOfTotalSubscriptionAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentPercentageOfTotalSubscriptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPercentageOfTotalSubscriptionAmount";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentPercentageOfTotalRedemptionAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentPercentageOfTotalRedemptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPercentageOfTotalRedemptionAmount";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentLegIdentification"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentLegIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentLegIdentification";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentOrderReference"</li>
	 * </ul>
	 */
	public static final MMCode mmDifferentOrderReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderReference";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownLinkagesReference"</li>
	 * </ul>
	 */
	public static final MMCode mmUnknownLinkagesReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownLinkagesReference";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateDealReference"</li>
	 * </ul>
	 */
	public static final MMCode mmDuplicateDealReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateDealReference";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodian"</li>
	 * </ul>
	 */
	public static final MMCode mmReceiversCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodian";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary"</li>
	 * </ul>
	 */
	public static final MMCode mmReceiversIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveringAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgent";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodian"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliverersCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodian";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediary"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliverersIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCreditTransfer"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCreditTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCreditTransfer";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCompliantWithSLA"</li>
	 * </ul>
	 */
	public static final MMCode mmNotCompliantWithSLA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingEUTaxInformation"</li>
	 * </ul>
	 */
	public static final MMCode mmMissingEUTaxInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingEUTaxInformation";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCommission"</li>
	 * </ul>
	 */
	public static final MMCode mmMissingCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCommission";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCharge"</li>
	 * </ul>
	 */
	public static final MMCode mmMissingCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCharge";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingTaxInformation"</li>
	 * </ul>
	 */
	public static final MMCode mmMissingTaxInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingTaxInformation";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowedtoAmend"</li>
	 * </ul>
	 */
	public static final MMCode mmNotAllowedtoAmend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAllowedtoAmend";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentTooLate"</li>
	 * </ul>
	 */
	public static final MMCode mmAmendmentTooLate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentTooLate";
			owner_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("DSAF");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectedConfirmationStatusReason1Code";
				definition = "Specifies the reason for a confirmation rejected status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentInvestmentAccountDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentFinancialInstrumentDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentBeneficiaryDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentPlaceOfTrade, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentOrderDateTime,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentCancellationRight, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentUnitsNumber,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentOrderType, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentRounding,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentNetAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentGrossAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentHoldingsRedemptionRate, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentGroup1Or2Units,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentIncomePreference, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentLetterIntentReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentAccumulationRightReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentPhysicalDeliveryIndicator,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentRequestedSettlementCurrency,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentRequestedNAVCurrency, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentForeignExchangeDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentChargeDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentCommissionDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentTaxDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentPhysicalDeliveryDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentSettlementAndCustodyDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentPaymentInstrumentDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentSettlementAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentSettlementDate, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentExtensionDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentIntermediaryDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentTotalRedemptionAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentTotalSubscriptionAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentAdditionalCashIn,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentResultingCashOut,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentPercentageOfTotalSubscriptionAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentPercentageOfTotalRedemptionAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentLegIdentification, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDifferentOrderReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmUnknownLinkagesReference, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDuplicateDealReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmReceivingAgent, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmReceiversCustodian,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmReceiversIntermediary, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDeliveringAgent,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDeliverersCustodian, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmDeliverersIntermediary,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmInvalidCreditTransfer, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmSettlementAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmSettlementDate, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmNotCompliantWithSLA,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmMissingEUTaxInformation, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmMissingCommission,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmMissingCharge, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmMissingTaxInformation,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmNotAllowedtoAmend, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmAmendmentTooLate);
				trace_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}