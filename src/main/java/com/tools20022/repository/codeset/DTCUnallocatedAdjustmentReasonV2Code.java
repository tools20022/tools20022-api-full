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
import com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * DTC Unallocated reason codes for payment adjustments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#GracePeriod
 * DTCUnallocatedAdjustmentReasonV2Code.GracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#ApproximateRate
 * DTCUnallocatedAdjustmentReasonV2Code.ApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#BadAnnouncement
 * DTCUnallocatedAdjustmentReasonV2Code.BadAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#BadPayableDate
 * DTCUnallocatedAdjustmentReasonV2Code.BadPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#CashRateUnknown
 * DTCUnallocatedAdjustmentReasonV2Code.CashRateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#CashRateZero
 * DTCUnallocatedAdjustmentReasonV2Code.CashRateZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#ConditionalPayment
 * DTCUnallocatedAdjustmentReasonV2Code.ConditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#Default
 * DTCUnallocatedAdjustmentReasonV2Code.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#FundsNotReceivedByAgent
 * DTCUnallocatedAdjustmentReasonV2Code.FundsNotReceivedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#HolidayInCountryOfOrigin
 * DTCUnallocatedAdjustmentReasonV2Code.HolidayInCountryOfOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#InsufficientFundsReceivedFromAgent
 * DTCUnallocatedAdjustmentReasonV2Code.InsufficientFundsReceivedFromAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#IssueNotFunded
 * DTCUnallocatedAdjustmentReasonV2Code.IssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#IssueNotMaturing
 * DTCUnallocatedAdjustmentReasonV2Code.IssueNotMaturing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#AfterCycleCutOff
 * DTCUnallocatedAdjustmentReasonV2Code.AfterCycleCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#ItemIsPending
 * DTCUnallocatedAdjustmentReasonV2Code.ItemIsPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#Liquidation
 * DTCUnallocatedAdjustmentReasonV2Code.Liquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#NotionalBalance
 * DTCUnallocatedAdjustmentReasonV2Code.NotionalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#Other
 * DTCUnallocatedAdjustmentReasonV2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#PaidUponReceiptOfCheck
 * DTCUnallocatedAdjustmentReasonV2Code.PaidUponReceiptOfCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#PendingConversionOfFunds
 * DTCUnallocatedAdjustmentReasonV2Code.PendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#RecapitalisationNotFunded
 * DTCUnallocatedAdjustmentReasonV2Code.RecapitalisationNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#RedemptionOfRatesNotYetFunded
 * DTCUnallocatedAdjustmentReasonV2Code.RedemptionOfRatesNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#ReleasedPledgePosition
 * DTCUnallocatedAdjustmentReasonV2Code.ReleasedPledgePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#SaleOfAssetsNotYetFunded
 * DTCUnallocatedAdjustmentReasonV2Code.SaleOfAssetsNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#SameDayPositionCapture
 * DTCUnallocatedAdjustmentReasonV2Code.SameDayPositionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#SpecialDistributionNotYetFunded
 * DTCUnallocatedAdjustmentReasonV2Code.SpecialDistributionNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#SpecificIssuesSuppressed
 * DTCUnallocatedAdjustmentReasonV2Code.SpecificIssuesSuppressed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#CallRescinded
 * DTCUnallocatedAdjustmentReasonV2Code.CallRescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#CDAcceleratedMaturity
 * DTCUnallocatedAdjustmentReasonV2Code.CDAcceleratedMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#CHIPSPayment
 * DTCUnallocatedAdjustmentReasonV2Code.CHIPSPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#FiveDayGracePeriod
 * DTCUnallocatedAdjustmentReasonV2Code.FiveDayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#FederalDepositInsuranceCorporation
 * DTCUnallocatedAdjustmentReasonV2Code.FederalDepositInsuranceCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#PledgedPosition
 * DTCUnallocatedAdjustmentReasonV2Code.PledgedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#MaturityForStockPaymentOption
 * DTCUnallocatedAdjustmentReasonV2Code.MaturityForStockPaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#ChurchBondNotFunded
 * DTCUnallocatedAdjustmentReasonV2Code.ChurchBondNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#FundsHeldAtChaseForOFAC
 * DTCUnallocatedAdjustmentReasonV2Code.FundsHeldAtChaseForOFAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code#CanadianDepositoryInventory
 * DTCUnallocatedAdjustmentReasonV2Code.CanadianDepositoryInventory}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
 * DTCUnallocatedAdjustmentReason4Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCUnallocatedAdjustmentReasonV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "DTC Unallocated reason codes for payment adjustments."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCUnallocatedAdjustmentReasonV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Company is taking a 30 day grace period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAGA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Company is taking a 30 day grace period."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code GracePeriod = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			definition = "Company is taking a 30 day grace period.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "SAGA";
		}
	};
	/**
	 * Rate is not final. Rate is approximate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APRR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproximateRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate is not final. Rate is approximate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code ApproximateRate = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			definition = "Rate is not final. Rate is approximate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "APRR";
		}
	};
	/**
	 * Incorrect announcement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANNG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadAnnouncement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incorrect announcement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code BadAnnouncement = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadAnnouncement";
			definition = "Incorrect announcement.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "ANNG";
		}
	};
	/**
	 * Incorrect payable date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BDPD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadPayableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incorrect payable date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code BadPayableDate = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadPayableDate";
			definition = "Incorrect payable date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "BDPD";
		}
	};
	/**
	 * Cash rate for allocation is zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash rate for allocation is zero."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code CashRateUnknown = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateUnknown";
			definition = "Cash rate for allocation is zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "CSHR";
		}
	};
	/**
	 * Cash rate for allocation is zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateZero"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash rate for allocation is zero."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code CashRateZero = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateZero";
			definition = "Cash rate for allocation is zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "CSHU";
		}
	};
	/**
	 * Payment is conditional and conditions have not been met yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is conditional and conditions have not been met yet."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code ConditionalPayment = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPayment";
			definition = "Payment is conditional and conditions have not been met yet.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "COND";
		}
	};
	/**
	 * Issue is in default.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue is in default."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code Default = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			definition = "Issue is in default.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Funds were not received by the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANFI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsNotReceivedByAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds were not received by the agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code FundsNotReceivedByAgent = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceivedByAgent";
			definition = "Funds were not received by the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "ANFI";
		}
	};
	/**
	 * Reason is due to holiday in country of origin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HICO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HolidayInCountryOfOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to holiday in country of origin."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code HolidayInCountryOfOrigin = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryOfOrigin";
			definition = "Reason is due to holiday in country of origin.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "HICO";
		}
	};
	/**
	 * Reason is due to insufficient funds received from the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MASF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFundsReceivedFromAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason is due to insufficient funds received from the agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code InsufficientFundsReceivedFromAgent = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFundsReceivedFromAgent";
			definition = "Reason is due to insufficient funds received from the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "MASF";
		}
	};
	/**
	 * Reason is due to issue that was not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISNF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to issue that was not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code IssueNotFunded = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			definition = "Reason is due to issue that was not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "ISNF";
		}
	};
	/**
	 * Reason is due to issue that is not maturing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotMaturing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to issue that is not maturing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code IssueNotMaturing = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotMaturing";
			definition = "Reason is due to issue that is not maturing.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Issues funded and/or identified after the cycle cut off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LFID"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterCycleCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issues funded and/or identified after the cycle cut off."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code AfterCycleCutOff = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterCycleCutOff";
			definition = "Issues funded and/or identified after the cycle cut off.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "LFID";
		}
	};
	/**
	 * Reason is due to items pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIsPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to items pending."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code ItemIsPending = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIsPending";
			definition = "Reason is due to items pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Issue is being liquidated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue is being liquidated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code Liquidation = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			definition = "Issue is being liquidated.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "LIQD";
		}
	};
	/**
	 * Notional balance principal will not be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notional balance principal will not be paid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code NotionalBalance = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalBalance";
			definition = "Notional balance principal will not be paid.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "NOTL";
		}
	};
	/**
	 * Reserved for new user defined reason codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reserved for new user defined reason codes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code Other = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Reserved for new user defined reason codes.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Reason is due paid upon receipt of check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCHK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaidUponReceiptOfCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due paid upon receipt of check."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code PaidUponReceiptOfCheck = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponReceiptOfCheck";
			definition = "Reason is due paid upon receipt of check.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "PCHK";
		}
	};
	/**
	 * Reason is due to pending conversion of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRFX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConversionOfFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to pending conversion of funds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code PendingConversionOfFunds = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			definition = "Reason is due to pending conversion of funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "RRFX";
		}
	};
	/**
	 * Reason is due to recapitalisation and issue not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCNF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecapitalisationNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to recapitalisation and issue not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code RecapitalisationNotFunded = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalisationNotFunded";
			definition = "Reason is due to recapitalisation and issue not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "RCNF";
		}
	};
	/**
	 * Reason is that due to redemption of rates, issue was not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRNF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionOfRatesNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason is that due to redemption of rates, issue was not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code RedemptionOfRatesNotYetFunded = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionOfRatesNotYetFunded";
			definition = "Reason is that due to redemption of rates, issue was not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "RRNF";
		}
	};
	/**
	 * Reason is due to released pledge position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPLG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReleasedPledgePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to released pledge position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code ReleasedPledgePosition = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasedPledgePosition";
			definition = "Reason is due to released pledge position.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "RPLG";
		}
	};
	/**
	 * Reason is that due to sale of asset, issue was not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SANF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssetsNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason is that due to sale of asset, issue was not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code SaleOfAssetsNotYetFunded = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssetsNotYetFunded";
			definition = "Reason is that due to sale of asset, issue was not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "SANF";
		}
	};
	/**
	 * Reason is due to same day position capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDPC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayPositionCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to same day position capture."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code SameDayPositionCapture = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayPositionCapture";
			definition = "Reason is due to same day position capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "SDPC";
		}
	};
	/**
	 * Reason is due to special distribution and the issue was not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPNF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDistributionNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason is due to special distribution and the issue was not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code SpecialDistributionNotYetFunded = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistributionNotYetFunded";
			definition = "Reason is due to special distribution and the issue was not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "SPNF";
		}
	};
	/**
	 * Specific issues have been suppressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUVF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificIssuesSuppressed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific issues have been suppressed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code SpecificIssuesSuppressed = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificIssuesSuppressed";
			definition = "Specific issues have been suppressed.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "PUVF";
		}
	};
	/**
	 * Reason is due to a call rescinded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallRescinded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to a call rescinded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code CallRescinded = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallRescinded";
			definition = "Reason is due to a call rescinded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "RESC";
		}
	};
	/**
	 * Reason is due to a CD accelerated maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERLY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDAcceleratedMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to a CD accelerated maturity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code CDAcceleratedMaturity = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDAcceleratedMaturity";
			definition = "Reason is due to a CD accelerated maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "ERLY";
		}
	};
	/**
	 * Reason is due to a CHIPS Payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHIP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to a CHIPS Payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code CHIPSPayment = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSPayment";
			definition = "Reason is due to a CHIPS Payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "CHIP";
		}
	};
	/**
	 * Reason is due to a five day grace period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FVDG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveDayGracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to a five day grace period."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code FiveDayGracePeriod = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayGracePeriod";
			definition = "Reason is due to a five day grace period.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "FVDG";
		}
	};
	/**
	 * Reason is due to a failed bank; Federal Deposit Insurance Corporation
	 * assumed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDIC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalDepositInsuranceCorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason is due to a failed bank; Federal Deposit Insurance Corporation assumed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code FederalDepositInsuranceCorporation = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalDepositInsuranceCorporation";
			definition = "Reason is due to a failed bank; Federal Deposit Insurance Corporation assumed.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "FDIC";
		}
	};
	/**
	 * Reason is due to pledged position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLEG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to pledged position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code PledgedPosition = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedPosition";
			definition = "Reason is due to pledged position.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "PLEG";
		}
	};
	/**
	 * Reason is due to maturity for stock payment option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSTK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityForStockPaymentOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to maturity for stock payment option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code MaturityForStockPaymentOption = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityForStockPaymentOption";
			definition = "Reason is due to maturity for stock payment option.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "MSTK";
		}
	};
	/**
	 * Reason is due to a church bond not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHBD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChurchBondNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to a church bond not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code ChurchBondNotFunded = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChurchBondNotFunded";
			definition = "Reason is due to a church bond not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "CHBD";
		}
	};
	/**
	 * Reason is due to funds held at Chase for official foreign asset control.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFAC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsHeldAtChaseForOFAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason is due to funds held at Chase for official foreign asset control."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code FundsHeldAtChaseForOFAC = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsHeldAtChaseForOFAC";
			definition = "Reason is due to funds held at Chase for official foreign asset control.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "OFAC";
		}
	};
	/**
	 * Reason is due to a Canadian depository inventory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
	 * DTCUnallocatedAdjustmentReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianDepositoryInventory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is due to a Canadian depository inventory."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonV2Code CanadianDepositoryInventory = new DTCUnallocatedAdjustmentReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianDepositoryInventory";
			definition = "Reason is due to a Canadian depository inventory.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.mmObject();
			codeName = "CDIN";
		}
	};
	final static private LinkedHashMap<String, DTCUnallocatedAdjustmentReasonV2Code> codesByName = new LinkedHashMap<>();

	protected DTCUnallocatedAdjustmentReasonV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCUnallocatedAdjustmentReasonV2Code";
				definition = "DTC Unallocated reason codes for payment adjustments.";
				derivation_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.GracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.ApproximateRate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.BadAnnouncement, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.BadPayableDate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.CashRateUnknown, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.CashRateZero,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.ConditionalPayment, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.Default,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.FundsNotReceivedByAgent, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.HolidayInCountryOfOrigin,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.InsufficientFundsReceivedFromAgent, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.IssueNotFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.IssueNotMaturing, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.AfterCycleCutOff,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.ItemIsPending, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.Liquidation,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.NotionalBalance, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.Other,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.PaidUponReceiptOfCheck, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.PendingConversionOfFunds,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.RecapitalisationNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.RedemptionOfRatesNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.ReleasedPledgePosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.SaleOfAssetsNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.SameDayPositionCapture, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.SpecialDistributionNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.SpecificIssuesSuppressed, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.CallRescinded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.CDAcceleratedMaturity, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.CHIPSPayment,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.FiveDayGracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.FederalDepositInsuranceCorporation,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.PledgedPosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.MaturityForStockPaymentOption,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.ChurchBondNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.FundsHeldAtChaseForOFAC,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code.CanadianDepositoryInventory);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(GracePeriod.getCodeName().get(), GracePeriod);
		codesByName.put(ApproximateRate.getCodeName().get(), ApproximateRate);
		codesByName.put(BadAnnouncement.getCodeName().get(), BadAnnouncement);
		codesByName.put(BadPayableDate.getCodeName().get(), BadPayableDate);
		codesByName.put(CashRateUnknown.getCodeName().get(), CashRateUnknown);
		codesByName.put(CashRateZero.getCodeName().get(), CashRateZero);
		codesByName.put(ConditionalPayment.getCodeName().get(), ConditionalPayment);
		codesByName.put(Default.getCodeName().get(), Default);
		codesByName.put(FundsNotReceivedByAgent.getCodeName().get(), FundsNotReceivedByAgent);
		codesByName.put(HolidayInCountryOfOrigin.getCodeName().get(), HolidayInCountryOfOrigin);
		codesByName.put(InsufficientFundsReceivedFromAgent.getCodeName().get(), InsufficientFundsReceivedFromAgent);
		codesByName.put(IssueNotFunded.getCodeName().get(), IssueNotFunded);
		codesByName.put(IssueNotMaturing.getCodeName().get(), IssueNotMaturing);
		codesByName.put(AfterCycleCutOff.getCodeName().get(), AfterCycleCutOff);
		codesByName.put(ItemIsPending.getCodeName().get(), ItemIsPending);
		codesByName.put(Liquidation.getCodeName().get(), Liquidation);
		codesByName.put(NotionalBalance.getCodeName().get(), NotionalBalance);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PaidUponReceiptOfCheck.getCodeName().get(), PaidUponReceiptOfCheck);
		codesByName.put(PendingConversionOfFunds.getCodeName().get(), PendingConversionOfFunds);
		codesByName.put(RecapitalisationNotFunded.getCodeName().get(), RecapitalisationNotFunded);
		codesByName.put(RedemptionOfRatesNotYetFunded.getCodeName().get(), RedemptionOfRatesNotYetFunded);
		codesByName.put(ReleasedPledgePosition.getCodeName().get(), ReleasedPledgePosition);
		codesByName.put(SaleOfAssetsNotYetFunded.getCodeName().get(), SaleOfAssetsNotYetFunded);
		codesByName.put(SameDayPositionCapture.getCodeName().get(), SameDayPositionCapture);
		codesByName.put(SpecialDistributionNotYetFunded.getCodeName().get(), SpecialDistributionNotYetFunded);
		codesByName.put(SpecificIssuesSuppressed.getCodeName().get(), SpecificIssuesSuppressed);
		codesByName.put(CallRescinded.getCodeName().get(), CallRescinded);
		codesByName.put(CDAcceleratedMaturity.getCodeName().get(), CDAcceleratedMaturity);
		codesByName.put(CHIPSPayment.getCodeName().get(), CHIPSPayment);
		codesByName.put(FiveDayGracePeriod.getCodeName().get(), FiveDayGracePeriod);
		codesByName.put(FederalDepositInsuranceCorporation.getCodeName().get(), FederalDepositInsuranceCorporation);
		codesByName.put(PledgedPosition.getCodeName().get(), PledgedPosition);
		codesByName.put(MaturityForStockPaymentOption.getCodeName().get(), MaturityForStockPaymentOption);
		codesByName.put(ChurchBondNotFunded.getCodeName().get(), ChurchBondNotFunded);
		codesByName.put(FundsHeldAtChaseForOFAC.getCodeName().get(), FundsHeldAtChaseForOFAC);
		codesByName.put(CanadianDepositoryInventory.getCodeName().get(), CanadianDepositoryInventory);
	}

	public static DTCUnallocatedAdjustmentReasonV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCUnallocatedAdjustmentReasonV2Code[] values() {
		DTCUnallocatedAdjustmentReasonV2Code[] values = new DTCUnallocatedAdjustmentReasonV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCUnallocatedAdjustmentReasonV2Code> {
		@Override
		public DTCUnallocatedAdjustmentReasonV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCUnallocatedAdjustmentReasonV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}