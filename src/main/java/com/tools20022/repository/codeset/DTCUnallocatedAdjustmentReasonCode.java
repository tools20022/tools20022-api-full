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
import com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#GracePeriod
 * DTCUnallocatedAdjustmentReasonCode.GracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#ApproximateRate
 * DTCUnallocatedAdjustmentReasonCode.ApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#BadAnnouncement
 * DTCUnallocatedAdjustmentReasonCode.BadAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#BadPayableDate
 * DTCUnallocatedAdjustmentReasonCode.BadPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#CashRateUnknown
 * DTCUnallocatedAdjustmentReasonCode.CashRateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#CashRateZero
 * DTCUnallocatedAdjustmentReasonCode.CashRateZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#ConditionalPayment
 * DTCUnallocatedAdjustmentReasonCode.ConditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#Default
 * DTCUnallocatedAdjustmentReasonCode.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#FundsNotReceivedByAgent
 * DTCUnallocatedAdjustmentReasonCode.FundsNotReceivedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#HolidayInCountryOfOrigin
 * DTCUnallocatedAdjustmentReasonCode.HolidayInCountryOfOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#InsufficientFundsReceivedFromAgent
 * DTCUnallocatedAdjustmentReasonCode.InsufficientFundsReceivedFromAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#IssueNotFunded
 * DTCUnallocatedAdjustmentReasonCode.IssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#IssueNotMaturing
 * DTCUnallocatedAdjustmentReasonCode.IssueNotMaturing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#AfterCycleCutOff
 * DTCUnallocatedAdjustmentReasonCode.AfterCycleCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#ItemIsPending
 * DTCUnallocatedAdjustmentReasonCode.ItemIsPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#Liquidation
 * DTCUnallocatedAdjustmentReasonCode.Liquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#NotionalBalance
 * DTCUnallocatedAdjustmentReasonCode.NotionalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#Other
 * DTCUnallocatedAdjustmentReasonCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#PaidUponReceiptOfCheck
 * DTCUnallocatedAdjustmentReasonCode.PaidUponReceiptOfCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#PendingConversionOfFunds
 * DTCUnallocatedAdjustmentReasonCode.PendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#RecapitalizationNotFunded
 * DTCUnallocatedAdjustmentReasonCode.RecapitalizationNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#RedemptionOfRatesNotYetFunded
 * DTCUnallocatedAdjustmentReasonCode.RedemptionOfRatesNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#ReleasedPledgePosition
 * DTCUnallocatedAdjustmentReasonCode.ReleasedPledgePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#SaleOfAssetsNotYetFunded
 * DTCUnallocatedAdjustmentReasonCode.SaleOfAssetsNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#SameDayPositionCapture
 * DTCUnallocatedAdjustmentReasonCode.SameDayPositionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#SpecialDistributionNotYetFunded
 * DTCUnallocatedAdjustmentReasonCode.SpecialDistributionNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#SpecificIssuesSuppressed
 * DTCUnallocatedAdjustmentReasonCode.SpecificIssuesSuppressed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#CallRescinded
 * DTCUnallocatedAdjustmentReasonCode.CallRescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#CDAcceleratedMaturity
 * DTCUnallocatedAdjustmentReasonCode.CDAcceleratedMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#CHIPSPayment
 * DTCUnallocatedAdjustmentReasonCode.CHIPSPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#FiveDayGracePeriod
 * DTCUnallocatedAdjustmentReasonCode.FiveDayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#FDIC
 * DTCUnallocatedAdjustmentReasonCode.FDIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#PledgedPosition
 * DTCUnallocatedAdjustmentReasonCode.PledgedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#MaturityForStockPaymentOption
 * DTCUnallocatedAdjustmentReasonCode.MaturityForStockPaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#ChurchBondNotFunded
 * DTCUnallocatedAdjustmentReasonCode.ChurchBondNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#FundsHeldAtChaseForOFAC
 * DTCUnallocatedAdjustmentReasonCode.FundsHeldAtChaseForOFAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#CanadianDepositoryInventory
 * DTCUnallocatedAdjustmentReasonCode.CanadianDepositoryInventory}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
 * DTCUnallocatedAdjustmentReason1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
 * DTCUnallocatedAdjustmentReason2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
 * DTCUnallocatedAdjustmentReason3Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCUnallocatedAdjustmentReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "DTC Unallocated reason codes for payment adjustments."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCUnallocatedAdjustmentReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Company is taking a 30 day grace period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode GracePeriod = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			definition = "Company is taking a 30 day grace period.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "SAGA";
		}
	};
	/**
	 * Rate is not final. Rate is approximate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode ApproximateRate = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			definition = "Rate is not final. Rate is approximate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "APRR";
		}
	};
	/**
	 * Incorrect announcement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode BadAnnouncement = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadAnnouncement";
			definition = "Incorrect announcement.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "ANNG";
		}
	};
	/**
	 * Incorrect payable date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode BadPayableDate = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadPayableDate";
			definition = "Incorrect payable date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "BDPD";
		}
	};
	/**
	 * Cash rate for allocation is zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode CashRateUnknown = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateUnknown";
			definition = "Cash rate for allocation is zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "CSHR";
		}
	};
	/**
	 * Cash rate for allocation is zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode CashRateZero = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateZero";
			definition = "Cash rate for allocation is zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "CSHU";
		}
	};
	/**
	 * Payment is conditional and conditions have not been met yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode ConditionalPayment = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPayment";
			definition = "Payment is conditional and conditions have not been met yet.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "COND";
		}
	};
	/**
	 * Issue is in default.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode Default = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			definition = "Issue is in default.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Funds were not received by the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode FundsNotReceivedByAgent = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceivedByAgent";
			definition = "Funds were not received by the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "ANFI";
		}
	};
	/**
	 * Holiday in country of origin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HICO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HolidayInCountryOfOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holiday in country of origin."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode HolidayInCountryOfOrigin = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryOfOrigin";
			definition = "Holiday in country of origin.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "HICO";
		}
	};
	/**
	 * Insufficient funds were received from the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MASF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFundsReceivedFromAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient funds were received from the agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode InsufficientFundsReceivedFromAgent = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFundsReceivedFromAgent";
			definition = "Insufficient funds were received from the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "MASF";
		}
	};
	/**
	 * Issue was not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISNF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue was not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode IssueNotFunded = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			definition = "Issue was not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "ISNF";
		}
	};
	/**
	 * Issue is not maturing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotMaturing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue is not maturing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode IssueNotMaturing = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotMaturing";
			definition = "Issue is not maturing.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Issues funded and/or identified after the cycle cut off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode AfterCycleCutOff = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterCycleCutOff";
			definition = "Issues funded and/or identified after the cycle cut off.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "LFID";
		}
	};
	/**
	 * Item is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIsPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Item is pending."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode ItemIsPending = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIsPending";
			definition = "Item is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Issue is being liquidated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode Liquidation = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			definition = "Issue is being liquidated.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "LIQD";
		}
	};
	/**
	 * Notional balance pincipal will not be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notional balance pincipal will not be paid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode NotionalBalance = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalBalance";
			definition = "Notional balance pincipal will not be paid.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "NOTL";
		}
	};
	/**
	 * Reserved for new user defined reason codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode Other = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Reserved for new user defined reason codes.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Paid upon receipt of check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCHK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaidUponReceiptOfCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Paid upon receipt of check."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode PaidUponReceiptOfCheck = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponReceiptOfCheck";
			definition = "Paid upon receipt of check.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "PCHK";
		}
	};
	/**
	 * Pending conversion of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRFX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConversionOfFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pending conversion of funds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode PendingConversionOfFunds = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			definition = "Pending conversion of funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "RRFX";
		}
	};
	/**
	 * Recapitalization. Issue not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCNF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecapitalizationNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Recapitalization. Issue not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode RecapitalizationNotFunded = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalizationNotFunded";
			definition = "Recapitalization. Issue not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "RCNF";
		}
	};
	/**
	 * Redemption of rates. Issue not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRNF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionOfRatesNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption of rates. Issue not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode RedemptionOfRatesNotYetFunded = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionOfRatesNotYetFunded";
			definition = "Redemption of rates. Issue not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "RRNF";
		}
	};
	/**
	 * Released pledge position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPLG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReleasedPledgePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Released pledge position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode ReleasedPledgePosition = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasedPledgePosition";
			definition = "Released pledge position.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "RPLG";
		}
	};
	/**
	 * Sale of asset. Issue not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SANF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssetsNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sale of asset. Issue not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode SaleOfAssetsNotYetFunded = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssetsNotYetFunded";
			definition = "Sale of asset. Issue not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "SANF";
		}
	};
	/**
	 * Same day position capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDPC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayPositionCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Same day position capture."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode SameDayPositionCapture = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayPositionCapture";
			definition = "Same day position capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "SDPC";
		}
	};
	/**
	 * Special distribution. Issue not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPNF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDistributionNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Special distribution. Issue not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode SpecialDistributionNotYetFunded = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistributionNotYetFunded";
			definition = "Special distribution. Issue not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "SPNF";
		}
	};
	/**
	 * Specific issues have been suppressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
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
	public static final DTCUnallocatedAdjustmentReasonCode SpecificIssuesSuppressed = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificIssuesSuppressed";
			definition = "Specific issues have been suppressed.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "PUVF";
		}
	};
	/**
	 * Call Rescinded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallRescinded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Call Rescinded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode CallRescinded = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallRescinded";
			definition = "Call Rescinded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "RESC";
		}
	};
	/**
	 * CD Accelerated Maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERLY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDAcceleratedMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CD Accelerated Maturity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode CDAcceleratedMaturity = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDAcceleratedMaturity";
			definition = "CD Accelerated Maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "ERLY";
		}
	};
	/**
	 * CHIPS Payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHIP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CHIPS Payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode CHIPSPayment = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSPayment";
			definition = "CHIPS Payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "CHIP";
		}
	};
	/**
	 * Five Day Grace Period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FVDG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveDayGracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Five Day Grace Period."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode FiveDayGracePeriod = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayGracePeriod";
			definition = "Five Day Grace Period.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "FVDG";
		}
	};
	/**
	 * Failed Bank, FDIC Assumed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDIC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FDIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Failed Bank, FDIC Assumed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode FDIC = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FDIC";
			definition = "Failed Bank, FDIC Assumed.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "FDIC";
		}
	};
	/**
	 * Pledged Position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLEG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pledged Position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode PledgedPosition = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedPosition";
			definition = "Pledged Position.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "PLEG";
		}
	};
	/**
	 * Maturity for stock payment option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSTK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityForStockPaymentOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maturity for stock payment option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode MaturityForStockPaymentOption = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityForStockPaymentOption";
			definition = "Maturity for stock payment option.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "MSTK";
		}
	};
	/**
	 * Church bond not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHBD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChurchBondNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Church bond not funded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode ChurchBondNotFunded = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChurchBondNotFunded";
			definition = "Church bond not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "CHBD";
		}
	};
	/**
	 * Funds held at Chase for OFAC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFAC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsHeldAtChaseForOFAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds held at Chase for OFAC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode FundsHeldAtChaseForOFAC = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsHeldAtChaseForOFAC";
			definition = "Funds held at Chase for OFAC.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "OFAC";
		}
	};
	/**
	 * Canadian depository inventory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianDepositoryInventory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Canadian depository inventory."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReasonCode CanadianDepositoryInventory = new DTCUnallocatedAdjustmentReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianDepositoryInventory";
			definition = "Canadian depository inventory.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "CDIN";
		}
	};
	final static private LinkedHashMap<String, DTCUnallocatedAdjustmentReasonCode> codesByName = new LinkedHashMap<>();

	protected DTCUnallocatedAdjustmentReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCUnallocatedAdjustmentReasonCode";
				definition = "DTC Unallocated reason codes for payment adjustments.";
				derivation_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason1Code.mmObject(), DTCUnallocatedAdjustmentReason2Code.mmObject(), DTCUnallocatedAdjustmentReason3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.GracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.ApproximateRate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.BadAnnouncement, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.BadPayableDate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.CashRateUnknown, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.CashRateZero,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.ConditionalPayment, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.Default,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.FundsNotReceivedByAgent, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.HolidayInCountryOfOrigin,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.InsufficientFundsReceivedFromAgent, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.IssueNotFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.IssueNotMaturing, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.AfterCycleCutOff,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.ItemIsPending, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.Liquidation,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.NotionalBalance, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.Other,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.PaidUponReceiptOfCheck, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.PendingConversionOfFunds,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.RecapitalizationNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.RedemptionOfRatesNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.ReleasedPledgePosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.SaleOfAssetsNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.SameDayPositionCapture, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.SpecialDistributionNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.SpecificIssuesSuppressed, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.CallRescinded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.CDAcceleratedMaturity, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.CHIPSPayment,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.FiveDayGracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.FDIC,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.PledgedPosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.MaturityForStockPaymentOption,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.ChurchBondNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.FundsHeldAtChaseForOFAC,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode.CanadianDepositoryInventory);
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
		codesByName.put(RecapitalizationNotFunded.getCodeName().get(), RecapitalizationNotFunded);
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
		codesByName.put(FDIC.getCodeName().get(), FDIC);
		codesByName.put(PledgedPosition.getCodeName().get(), PledgedPosition);
		codesByName.put(MaturityForStockPaymentOption.getCodeName().get(), MaturityForStockPaymentOption);
		codesByName.put(ChurchBondNotFunded.getCodeName().get(), ChurchBondNotFunded);
		codesByName.put(FundsHeldAtChaseForOFAC.getCodeName().get(), FundsHeldAtChaseForOFAC);
		codesByName.put(CanadianDepositoryInventory.getCodeName().get(), CanadianDepositoryInventory);
	}

	public static DTCUnallocatedAdjustmentReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCUnallocatedAdjustmentReasonCode[] values() {
		DTCUnallocatedAdjustmentReasonCode[] values = new DTCUnallocatedAdjustmentReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCUnallocatedAdjustmentReasonCode> {
		@Override
		public DTCUnallocatedAdjustmentReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCUnallocatedAdjustmentReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}