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
import com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#AfterCycleCutOff
 * DTCUnallocatedAdjustmentReason4Code.AfterCycleCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#ApproximateRate
 * DTCUnallocatedAdjustmentReason4Code.ApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#BadAnnouncement
 * DTCUnallocatedAdjustmentReason4Code.BadAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#BadPayableDate
 * DTCUnallocatedAdjustmentReason4Code.BadPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#CallRescinded
 * DTCUnallocatedAdjustmentReason4Code.CallRescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#CanadianDepositoryInventory
 * DTCUnallocatedAdjustmentReason4Code.CanadianDepositoryInventory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#CashRateUnknown
 * DTCUnallocatedAdjustmentReason4Code.CashRateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#CDAcceleratedMaturity
 * DTCUnallocatedAdjustmentReason4Code.CDAcceleratedMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#ConditionalPayment
 * DTCUnallocatedAdjustmentReason4Code.ConditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#Default
 * DTCUnallocatedAdjustmentReason4Code.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#FiveDayGracePeriod
 * DTCUnallocatedAdjustmentReason4Code.FiveDayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#FundsNotReceivedByAgent
 * DTCUnallocatedAdjustmentReason4Code.FundsNotReceivedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#GracePeriod
 * DTCUnallocatedAdjustmentReason4Code.GracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#HolidayInCountryOfOrigin
 * DTCUnallocatedAdjustmentReason4Code.HolidayInCountryOfOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#IssueNotFunded
 * DTCUnallocatedAdjustmentReason4Code.IssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#IssueNotMaturing
 * DTCUnallocatedAdjustmentReason4Code.IssueNotMaturing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#ItemIsPending
 * DTCUnallocatedAdjustmentReason4Code.ItemIsPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#Liquidation
 * DTCUnallocatedAdjustmentReason4Code.Liquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#MaturityForStockPaymentOption
 * DTCUnallocatedAdjustmentReason4Code.MaturityForStockPaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#NotionalBalance
 * DTCUnallocatedAdjustmentReason4Code.NotionalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#InsufficientFundsReceivedFromAgent
 * DTCUnallocatedAdjustmentReason4Code.InsufficientFundsReceivedFromAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#FundsHeldAtChaseForOFAC
 * DTCUnallocatedAdjustmentReason4Code.FundsHeldAtChaseForOFAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#FederalDepositInsuranceCorporation
 * DTCUnallocatedAdjustmentReason4Code.FederalDepositInsuranceCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#ChurchBondNotFunded
 * DTCUnallocatedAdjustmentReason4Code.ChurchBondNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#CHIPSPayment
 * DTCUnallocatedAdjustmentReason4Code.CHIPSPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#CashRateZero
 * DTCUnallocatedAdjustmentReason4Code.CashRateZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#SpecificIssuesSuppressed
 * DTCUnallocatedAdjustmentReason4Code.SpecificIssuesSuppressed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#SpecialDistributionNotYetFunded
 * DTCUnallocatedAdjustmentReason4Code.SpecialDistributionNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#SameDayPositionCapture
 * DTCUnallocatedAdjustmentReason4Code.SameDayPositionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#SaleOfAssetsNotYetFunded
 * DTCUnallocatedAdjustmentReason4Code.SaleOfAssetsNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#ReleasedPledgePosition
 * DTCUnallocatedAdjustmentReason4Code.ReleasedPledgePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#RedemptionOfRatesNotYetFunded
 * DTCUnallocatedAdjustmentReason4Code.RedemptionOfRatesNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#RecapitalisationNotFunded
 * DTCUnallocatedAdjustmentReason4Code.RecapitalisationNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#PledgedPosition
 * DTCUnallocatedAdjustmentReason4Code.PledgedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#PendingConversionOfFunds
 * DTCUnallocatedAdjustmentReason4Code.PendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#PaidUponReceiptOfCheck
 * DTCUnallocatedAdjustmentReason4Code.PaidUponReceiptOfCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code#Other
 * DTCUnallocatedAdjustmentReason4Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonV2Code
 * DTCUnallocatedAdjustmentReasonV2Code}</li>
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
 * "DTCUnallocatedAdjustmentReason4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "DTC Unallocated reason codes for payment adjustments."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCUnallocatedAdjustmentReason4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterCycleCutOff"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code AfterCycleCutOff = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterCycleCutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.AfterCycleCutOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproximateRate"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code ApproximateRate = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.ApproximateRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadAnnouncement"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code BadAnnouncement = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadAnnouncement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.BadAnnouncement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadPayableDate"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code BadPayableDate = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadPayableDate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.BadPayableDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallRescinded"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code CallRescinded = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallRescinded";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.CallRescinded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianDepositoryInventory"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code CanadianDepositoryInventory = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianDepositoryInventory";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.CanadianDepositoryInventory.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateUnknown"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code CashRateUnknown = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.CashRateUnknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDAcceleratedMaturity"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code CDAcceleratedMaturity = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDAcceleratedMaturity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.CDAcceleratedMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalPayment"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code ConditionalPayment = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.ConditionalPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code Default = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.Default.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveDayGracePeriod"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code FiveDayGracePeriod = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayGracePeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.FiveDayGracePeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsNotReceivedByAgent"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code FundsNotReceivedByAgent = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceivedByAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.FundsNotReceivedByAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GracePeriod"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code GracePeriod = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.GracePeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HolidayInCountryOfOrigin"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code HolidayInCountryOfOrigin = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryOfOrigin";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.HolidayInCountryOfOrigin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotFunded"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code IssueNotFunded = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.IssueNotFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotMaturing"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code IssueNotMaturing = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotMaturing";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.IssueNotMaturing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIsPending"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code ItemIsPending = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIsPending";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.ItemIsPending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidation"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code Liquidation = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.Liquidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityForStockPaymentOption"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code MaturityForStockPaymentOption = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityForStockPaymentOption";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.MaturityForStockPaymentOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalBalance"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code NotionalBalance = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.NotionalBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFundsReceivedFromAgent"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code InsufficientFundsReceivedFromAgent = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFundsReceivedFromAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.InsufficientFundsReceivedFromAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsHeldAtChaseForOFAC"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code FundsHeldAtChaseForOFAC = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsHeldAtChaseForOFAC";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.FundsHeldAtChaseForOFAC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalDepositInsuranceCorporation"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code FederalDepositInsuranceCorporation = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalDepositInsuranceCorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.FederalDepositInsuranceCorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChurchBondNotFunded"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code ChurchBondNotFunded = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChurchBondNotFunded";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.ChurchBondNotFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSPayment"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code CHIPSPayment = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.CHIPSPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateZero"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code CashRateZero = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateZero";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.CashRateZero.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificIssuesSuppressed"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code SpecificIssuesSuppressed = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificIssuesSuppressed";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.SpecificIssuesSuppressed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDistributionNotYetFunded"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code SpecialDistributionNotYetFunded = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistributionNotYetFunded";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.SpecialDistributionNotYetFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayPositionCapture"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code SameDayPositionCapture = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayPositionCapture";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.SameDayPositionCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssetsNotYetFunded"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code SaleOfAssetsNotYetFunded = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssetsNotYetFunded";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.SaleOfAssetsNotYetFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReleasedPledgePosition"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code ReleasedPledgePosition = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasedPledgePosition";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.ReleasedPledgePosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionOfRatesNotYetFunded"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code RedemptionOfRatesNotYetFunded = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionOfRatesNotYetFunded";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.RedemptionOfRatesNotYetFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecapitalisationNotFunded"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code RecapitalisationNotFunded = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalisationNotFunded";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.RecapitalisationNotFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedPosition"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code PledgedPosition = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.PledgedPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConversionOfFunds"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code PendingConversionOfFunds = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.PendingConversionOfFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaidUponReceiptOfCheck"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code PaidUponReceiptOfCheck = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponReceiptOfCheck";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.PaidUponReceiptOfCheck.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason4Code Other = new DTCUnallocatedAdjustmentReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCUnallocatedAdjustmentReason4Code> codesByName = new LinkedHashMap<>();

	protected DTCUnallocatedAdjustmentReason4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCUnallocatedAdjustmentReason4Code";
				definition = "DTC Unallocated reason codes for payment adjustments.";
				trace_lazy = () -> DTCUnallocatedAdjustmentReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.AfterCycleCutOff, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.ApproximateRate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.BadAnnouncement, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.BadPayableDate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.CallRescinded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.CanadianDepositoryInventory,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.CashRateUnknown, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.CDAcceleratedMaturity,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.ConditionalPayment, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.Default,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.FiveDayGracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.FundsNotReceivedByAgent,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.GracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.HolidayInCountryOfOrigin,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.IssueNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.IssueNotMaturing,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.ItemIsPending, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.Liquidation,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.MaturityForStockPaymentOption, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.NotionalBalance,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.InsufficientFundsReceivedFromAgent, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.FundsHeldAtChaseForOFAC,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.FederalDepositInsuranceCorporation, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.ChurchBondNotFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.CHIPSPayment, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.CashRateZero,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.SpecificIssuesSuppressed, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.SpecialDistributionNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.SameDayPositionCapture, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.SaleOfAssetsNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.ReleasedPledgePosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.RedemptionOfRatesNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.RecapitalisationNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.PledgedPosition,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.PendingConversionOfFunds, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.PaidUponReceiptOfCheck,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AfterCycleCutOff.getCodeName().get(), AfterCycleCutOff);
		codesByName.put(ApproximateRate.getCodeName().get(), ApproximateRate);
		codesByName.put(BadAnnouncement.getCodeName().get(), BadAnnouncement);
		codesByName.put(BadPayableDate.getCodeName().get(), BadPayableDate);
		codesByName.put(CallRescinded.getCodeName().get(), CallRescinded);
		codesByName.put(CanadianDepositoryInventory.getCodeName().get(), CanadianDepositoryInventory);
		codesByName.put(CashRateUnknown.getCodeName().get(), CashRateUnknown);
		codesByName.put(CDAcceleratedMaturity.getCodeName().get(), CDAcceleratedMaturity);
		codesByName.put(ConditionalPayment.getCodeName().get(), ConditionalPayment);
		codesByName.put(Default.getCodeName().get(), Default);
		codesByName.put(FiveDayGracePeriod.getCodeName().get(), FiveDayGracePeriod);
		codesByName.put(FundsNotReceivedByAgent.getCodeName().get(), FundsNotReceivedByAgent);
		codesByName.put(GracePeriod.getCodeName().get(), GracePeriod);
		codesByName.put(HolidayInCountryOfOrigin.getCodeName().get(), HolidayInCountryOfOrigin);
		codesByName.put(IssueNotFunded.getCodeName().get(), IssueNotFunded);
		codesByName.put(IssueNotMaturing.getCodeName().get(), IssueNotMaturing);
		codesByName.put(ItemIsPending.getCodeName().get(), ItemIsPending);
		codesByName.put(Liquidation.getCodeName().get(), Liquidation);
		codesByName.put(MaturityForStockPaymentOption.getCodeName().get(), MaturityForStockPaymentOption);
		codesByName.put(NotionalBalance.getCodeName().get(), NotionalBalance);
		codesByName.put(InsufficientFundsReceivedFromAgent.getCodeName().get(), InsufficientFundsReceivedFromAgent);
		codesByName.put(FundsHeldAtChaseForOFAC.getCodeName().get(), FundsHeldAtChaseForOFAC);
		codesByName.put(FederalDepositInsuranceCorporation.getCodeName().get(), FederalDepositInsuranceCorporation);
		codesByName.put(ChurchBondNotFunded.getCodeName().get(), ChurchBondNotFunded);
		codesByName.put(CHIPSPayment.getCodeName().get(), CHIPSPayment);
		codesByName.put(CashRateZero.getCodeName().get(), CashRateZero);
		codesByName.put(SpecificIssuesSuppressed.getCodeName().get(), SpecificIssuesSuppressed);
		codesByName.put(SpecialDistributionNotYetFunded.getCodeName().get(), SpecialDistributionNotYetFunded);
		codesByName.put(SameDayPositionCapture.getCodeName().get(), SameDayPositionCapture);
		codesByName.put(SaleOfAssetsNotYetFunded.getCodeName().get(), SaleOfAssetsNotYetFunded);
		codesByName.put(ReleasedPledgePosition.getCodeName().get(), ReleasedPledgePosition);
		codesByName.put(RedemptionOfRatesNotYetFunded.getCodeName().get(), RedemptionOfRatesNotYetFunded);
		codesByName.put(RecapitalisationNotFunded.getCodeName().get(), RecapitalisationNotFunded);
		codesByName.put(PledgedPosition.getCodeName().get(), PledgedPosition);
		codesByName.put(PendingConversionOfFunds.getCodeName().get(), PendingConversionOfFunds);
		codesByName.put(PaidUponReceiptOfCheck.getCodeName().get(), PaidUponReceiptOfCheck);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static DTCUnallocatedAdjustmentReason4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCUnallocatedAdjustmentReason4Code[] values() {
		DTCUnallocatedAdjustmentReason4Code[] values = new DTCUnallocatedAdjustmentReason4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCUnallocatedAdjustmentReason4Code> {
		@Override
		public DTCUnallocatedAdjustmentReason4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCUnallocatedAdjustmentReason4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}