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
import com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a confirmation rejected status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentInvestmentAccountDetails
 * RejectedConfirmationStatusReason1Code.DifferentInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentFinancialInstrumentDetails
 * RejectedConfirmationStatusReason1Code.DifferentFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentBeneficiaryDetails
 * RejectedConfirmationStatusReason1Code.DifferentBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentPlaceOfTrade
 * RejectedConfirmationStatusReason1Code.DifferentPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentOrderDateTime
 * RejectedConfirmationStatusReason1Code.DifferentOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentCancellationRight
 * RejectedConfirmationStatusReason1Code.DifferentCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentUnitsNumber
 * RejectedConfirmationStatusReason1Code.DifferentUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentOrderType
 * RejectedConfirmationStatusReason1Code.DifferentOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentRounding
 * RejectedConfirmationStatusReason1Code.DifferentRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentNetAmount
 * RejectedConfirmationStatusReason1Code.DifferentNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentGrossAmount
 * RejectedConfirmationStatusReason1Code.DifferentGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentHoldingsRedemptionRate
 * RejectedConfirmationStatusReason1Code.DifferentHoldingsRedemptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentGroup1Or2Units
 * RejectedConfirmationStatusReason1Code.DifferentGroup1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentIncomePreference
 * RejectedConfirmationStatusReason1Code.DifferentIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentLetterIntentReference
 * RejectedConfirmationStatusReason1Code.DifferentLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentAccumulationRightReference
 * RejectedConfirmationStatusReason1Code.DifferentAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentPhysicalDeliveryIndicator
 * RejectedConfirmationStatusReason1Code.DifferentPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentRequestedSettlementCurrency
 * RejectedConfirmationStatusReason1Code.DifferentRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentRequestedNAVCurrency
 * RejectedConfirmationStatusReason1Code.DifferentRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentForeignExchangeDetails
 * RejectedConfirmationStatusReason1Code.DifferentForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentChargeDetails
 * RejectedConfirmationStatusReason1Code.DifferentChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentCommissionDetails
 * RejectedConfirmationStatusReason1Code.DifferentCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentTaxDetails
 * RejectedConfirmationStatusReason1Code.DifferentTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentPhysicalDeliveryDetails
 * RejectedConfirmationStatusReason1Code.DifferentPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentSettlementAndCustodyDetails
 * RejectedConfirmationStatusReason1Code.DifferentSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentPaymentInstrumentDetails
 * RejectedConfirmationStatusReason1Code.DifferentPaymentInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentSettlementAmount
 * RejectedConfirmationStatusReason1Code.DifferentSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentSettlementDate
 * RejectedConfirmationStatusReason1Code.DifferentSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentExtensionDetails
 * RejectedConfirmationStatusReason1Code.DifferentExtensionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentIntermediaryDetails
 * RejectedConfirmationStatusReason1Code.DifferentIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentTotalRedemptionAmount
 * RejectedConfirmationStatusReason1Code.DifferentTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentTotalSubscriptionAmount
 * RejectedConfirmationStatusReason1Code.DifferentTotalSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentAdditionalCashIn
 * RejectedConfirmationStatusReason1Code.DifferentAdditionalCashIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentResultingCashOut
 * RejectedConfirmationStatusReason1Code.DifferentResultingCashOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentPercentageOfTotalSubscriptionAmount
 * RejectedConfirmationStatusReason1Code.
 * DifferentPercentageOfTotalSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentPercentageOfTotalRedemptionAmount
 * RejectedConfirmationStatusReason1Code.
 * DifferentPercentageOfTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentLegIdentification
 * RejectedConfirmationStatusReason1Code.DifferentLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DifferentOrderReference
 * RejectedConfirmationStatusReason1Code.DifferentOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#UnknownLinkagesReference
 * RejectedConfirmationStatusReason1Code.UnknownLinkagesReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DuplicateDealReference
 * RejectedConfirmationStatusReason1Code.DuplicateDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#ReceivingAgent
 * RejectedConfirmationStatusReason1Code.ReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#ReceiversCustodian
 * RejectedConfirmationStatusReason1Code.ReceiversCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#ReceiversIntermediary
 * RejectedConfirmationStatusReason1Code.ReceiversIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DeliveringAgent
 * RejectedConfirmationStatusReason1Code.DeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DeliverersCustodian
 * RejectedConfirmationStatusReason1Code.DeliverersCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#DeliverersIntermediary
 * RejectedConfirmationStatusReason1Code.DeliverersIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#InvalidCreditTransfer
 * RejectedConfirmationStatusReason1Code.InvalidCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#SettlementAmount
 * RejectedConfirmationStatusReason1Code.SettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#SettlementDate
 * RejectedConfirmationStatusReason1Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#NotCompliantWithSLA
 * RejectedConfirmationStatusReason1Code.NotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#MissingEUTaxInformation
 * RejectedConfirmationStatusReason1Code.MissingEUTaxInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#MissingCommission
 * RejectedConfirmationStatusReason1Code.MissingCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#MissingCharge
 * RejectedConfirmationStatusReason1Code.MissingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#MissingTaxInformation
 * RejectedConfirmationStatusReason1Code.MissingTaxInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#NotAllowedtoAmend
 * RejectedConfirmationStatusReason1Code.NotAllowedtoAmend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code#AmendmentTooLate
 * RejectedConfirmationStatusReason1Code.AmendmentTooLate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode
 * RejectedConfirmationStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectedConfirmationStatusReason1Code extends MMCode {

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
	public static final RejectedConfirmationStatusReason1Code DifferentInvestmentAccountDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentInvestmentAccountDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentInvestmentAccountDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentFinancialInstrumentDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentFinancialInstrumentDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentFinancialInstrumentDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentBeneficiaryDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentBeneficiaryDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentBeneficiaryDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentPlaceOfTrade = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPlaceOfTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentPlaceOfTrade.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentOrderDateTime = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderDateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentOrderDateTime.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentCancellationRight = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentCancellationRight";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentCancellationRight.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentUnitsNumber = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentUnitsNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentUnitsNumber.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentOrderType = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentOrderType.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentRounding = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRounding";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentRounding.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentNetAmount = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentNetAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentNetAmount.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentGrossAmount = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentGrossAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentGrossAmount.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentHoldingsRedemptionRate = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentHoldingsRedemptionRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentHoldingsRedemptionRate.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentGroup1Or2Units = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentGroup1Or2Units";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentGroup1Or2Units.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentIncomePreference = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentIncomePreference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentIncomePreference.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentLetterIntentReference = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentLetterIntentReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentLetterIntentReference.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentAccumulationRightReference = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentAccumulationRightReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentAccumulationRightReference.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentPhysicalDeliveryIndicator = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPhysicalDeliveryIndicator";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentPhysicalDeliveryIndicator.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentRequestedSettlementCurrency = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRequestedSettlementCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentRequestedSettlementCurrency.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentRequestedNAVCurrency = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRequestedNAVCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentRequestedNAVCurrency.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentForeignExchangeDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentForeignExchangeDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentForeignExchangeDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentChargeDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentChargeDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentChargeDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentCommissionDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentCommissionDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentCommissionDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentTaxDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTaxDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentTaxDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentPhysicalDeliveryDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPhysicalDeliveryDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentPhysicalDeliveryDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentSettlementAndCustodyDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementAndCustodyDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentSettlementAndCustodyDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentPaymentInstrumentDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPaymentInstrumentDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentPaymentInstrumentDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentSettlementAmount = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentSettlementAmount.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentSettlementDate = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentSettlementDate.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentExtensionDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentExtensionDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentExtensionDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentIntermediaryDetails = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentIntermediaryDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentIntermediaryDetails.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentTotalRedemptionAmount = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTotalRedemptionAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentTotalRedemptionAmount.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentTotalSubscriptionAmount = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTotalSubscriptionAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentTotalSubscriptionAmount.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentAdditionalCashIn = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentAdditionalCashIn";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentAdditionalCashIn.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentResultingCashOut = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentResultingCashOut";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentResultingCashOut.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentPercentageOfTotalSubscriptionAmount = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPercentageOfTotalSubscriptionAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentPercentageOfTotalSubscriptionAmount.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentPercentageOfTotalRedemptionAmount = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPercentageOfTotalRedemptionAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentPercentageOfTotalRedemptionAmount.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentLegIdentification = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentLegIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentLegIdentification.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DifferentOrderReference = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DifferentOrderReference.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code UnknownLinkagesReference = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownLinkagesReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.UnknownLinkagesReference.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DuplicateDealReference = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateDealReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DuplicateDealReference.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code ReceivingAgent = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.ReceivingAgent.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code ReceiversCustodian = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodian";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.ReceiversCustodian.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code ReceiversIntermediary = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.ReceiversIntermediary.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DeliveringAgent = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DeliveringAgent.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DeliverersCustodian = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodian";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DeliverersCustodian.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code DeliverersIntermediary = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.DeliverersIntermediary.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code InvalidCreditTransfer = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCreditTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.InvalidCreditTransfer.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code SettlementAmount = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.SettlementAmount.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code SettlementDate = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.SettlementDate.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code NotCompliantWithSLA = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.NotCompliantWithSLA.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code MissingEUTaxInformation = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingEUTaxInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.MissingEUTaxInformation.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code MissingCommission = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCommission";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.MissingCommission.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code MissingCharge = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.MissingCharge.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code MissingTaxInformation = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingTaxInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.MissingTaxInformation.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code NotAllowedtoAmend = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAllowedtoAmend";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.NotAllowedtoAmend.getCodeName().orElse(name);
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
	public static final RejectedConfirmationStatusReason1Code AmendmentTooLate = new RejectedConfirmationStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentTooLate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.mmObject();
			codeName = RejectedConfirmationStatusReasonCode.AmendmentTooLate.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectedConfirmationStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected RejectedConfirmationStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DSAF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedConfirmationStatusReason1Code";
				definition = "Specifies the reason for a confirmation rejected status.";
				trace_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentInvestmentAccountDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentFinancialInstrumentDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentBeneficiaryDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentPlaceOfTrade, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentOrderDateTime,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentCancellationRight, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentUnitsNumber,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentOrderType, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentRounding,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentNetAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentGrossAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentHoldingsRedemptionRate, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentGroup1Or2Units,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentIncomePreference, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentLetterIntentReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentAccumulationRightReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentPhysicalDeliveryIndicator,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentRequestedSettlementCurrency, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentRequestedNAVCurrency,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentForeignExchangeDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentChargeDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentCommissionDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentTaxDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentPhysicalDeliveryDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentSettlementAndCustodyDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentPaymentInstrumentDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentSettlementAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentSettlementDate, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentExtensionDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentIntermediaryDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentTotalRedemptionAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentTotalSubscriptionAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentAdditionalCashIn,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentResultingCashOut,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentPercentageOfTotalSubscriptionAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentPercentageOfTotalRedemptionAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentLegIdentification,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DifferentOrderReference, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.UnknownLinkagesReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DuplicateDealReference, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.ReceivingAgent,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.ReceiversCustodian, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.ReceiversIntermediary,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DeliveringAgent, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DeliverersCustodian,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.DeliverersIntermediary, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.InvalidCreditTransfer,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.SettlementAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.SettlementDate,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.NotCompliantWithSLA, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.MissingEUTaxInformation,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.MissingCommission, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.MissingCharge,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.MissingTaxInformation, com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.NotAllowedtoAmend,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code.AmendmentTooLate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DifferentInvestmentAccountDetails.getCodeName().get(), DifferentInvestmentAccountDetails);
		codesByName.put(DifferentFinancialInstrumentDetails.getCodeName().get(), DifferentFinancialInstrumentDetails);
		codesByName.put(DifferentBeneficiaryDetails.getCodeName().get(), DifferentBeneficiaryDetails);
		codesByName.put(DifferentPlaceOfTrade.getCodeName().get(), DifferentPlaceOfTrade);
		codesByName.put(DifferentOrderDateTime.getCodeName().get(), DifferentOrderDateTime);
		codesByName.put(DifferentCancellationRight.getCodeName().get(), DifferentCancellationRight);
		codesByName.put(DifferentUnitsNumber.getCodeName().get(), DifferentUnitsNumber);
		codesByName.put(DifferentOrderType.getCodeName().get(), DifferentOrderType);
		codesByName.put(DifferentRounding.getCodeName().get(), DifferentRounding);
		codesByName.put(DifferentNetAmount.getCodeName().get(), DifferentNetAmount);
		codesByName.put(DifferentGrossAmount.getCodeName().get(), DifferentGrossAmount);
		codesByName.put(DifferentHoldingsRedemptionRate.getCodeName().get(), DifferentHoldingsRedemptionRate);
		codesByName.put(DifferentGroup1Or2Units.getCodeName().get(), DifferentGroup1Or2Units);
		codesByName.put(DifferentIncomePreference.getCodeName().get(), DifferentIncomePreference);
		codesByName.put(DifferentLetterIntentReference.getCodeName().get(), DifferentLetterIntentReference);
		codesByName.put(DifferentAccumulationRightReference.getCodeName().get(), DifferentAccumulationRightReference);
		codesByName.put(DifferentPhysicalDeliveryIndicator.getCodeName().get(), DifferentPhysicalDeliveryIndicator);
		codesByName.put(DifferentRequestedSettlementCurrency.getCodeName().get(), DifferentRequestedSettlementCurrency);
		codesByName.put(DifferentRequestedNAVCurrency.getCodeName().get(), DifferentRequestedNAVCurrency);
		codesByName.put(DifferentForeignExchangeDetails.getCodeName().get(), DifferentForeignExchangeDetails);
		codesByName.put(DifferentChargeDetails.getCodeName().get(), DifferentChargeDetails);
		codesByName.put(DifferentCommissionDetails.getCodeName().get(), DifferentCommissionDetails);
		codesByName.put(DifferentTaxDetails.getCodeName().get(), DifferentTaxDetails);
		codesByName.put(DifferentPhysicalDeliveryDetails.getCodeName().get(), DifferentPhysicalDeliveryDetails);
		codesByName.put(DifferentSettlementAndCustodyDetails.getCodeName().get(), DifferentSettlementAndCustodyDetails);
		codesByName.put(DifferentPaymentInstrumentDetails.getCodeName().get(), DifferentPaymentInstrumentDetails);
		codesByName.put(DifferentSettlementAmount.getCodeName().get(), DifferentSettlementAmount);
		codesByName.put(DifferentSettlementDate.getCodeName().get(), DifferentSettlementDate);
		codesByName.put(DifferentExtensionDetails.getCodeName().get(), DifferentExtensionDetails);
		codesByName.put(DifferentIntermediaryDetails.getCodeName().get(), DifferentIntermediaryDetails);
		codesByName.put(DifferentTotalRedemptionAmount.getCodeName().get(), DifferentTotalRedemptionAmount);
		codesByName.put(DifferentTotalSubscriptionAmount.getCodeName().get(), DifferentTotalSubscriptionAmount);
		codesByName.put(DifferentAdditionalCashIn.getCodeName().get(), DifferentAdditionalCashIn);
		codesByName.put(DifferentResultingCashOut.getCodeName().get(), DifferentResultingCashOut);
		codesByName.put(DifferentPercentageOfTotalSubscriptionAmount.getCodeName().get(), DifferentPercentageOfTotalSubscriptionAmount);
		codesByName.put(DifferentPercentageOfTotalRedemptionAmount.getCodeName().get(), DifferentPercentageOfTotalRedemptionAmount);
		codesByName.put(DifferentLegIdentification.getCodeName().get(), DifferentLegIdentification);
		codesByName.put(DifferentOrderReference.getCodeName().get(), DifferentOrderReference);
		codesByName.put(UnknownLinkagesReference.getCodeName().get(), UnknownLinkagesReference);
		codesByName.put(DuplicateDealReference.getCodeName().get(), DuplicateDealReference);
		codesByName.put(ReceivingAgent.getCodeName().get(), ReceivingAgent);
		codesByName.put(ReceiversCustodian.getCodeName().get(), ReceiversCustodian);
		codesByName.put(ReceiversIntermediary.getCodeName().get(), ReceiversIntermediary);
		codesByName.put(DeliveringAgent.getCodeName().get(), DeliveringAgent);
		codesByName.put(DeliverersCustodian.getCodeName().get(), DeliverersCustodian);
		codesByName.put(DeliverersIntermediary.getCodeName().get(), DeliverersIntermediary);
		codesByName.put(InvalidCreditTransfer.getCodeName().get(), InvalidCreditTransfer);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(NotCompliantWithSLA.getCodeName().get(), NotCompliantWithSLA);
		codesByName.put(MissingEUTaxInformation.getCodeName().get(), MissingEUTaxInformation);
		codesByName.put(MissingCommission.getCodeName().get(), MissingCommission);
		codesByName.put(MissingCharge.getCodeName().get(), MissingCharge);
		codesByName.put(MissingTaxInformation.getCodeName().get(), MissingTaxInformation);
		codesByName.put(NotAllowedtoAmend.getCodeName().get(), NotAllowedtoAmend);
		codesByName.put(AmendmentTooLate.getCodeName().get(), AmendmentTooLate);
	}

	public static RejectedConfirmationStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectedConfirmationStatusReason1Code[] values() {
		RejectedConfirmationStatusReason1Code[] values = new RejectedConfirmationStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectedConfirmationStatusReason1Code> {
		@Override
		public RejectedConfirmationStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectedConfirmationStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}