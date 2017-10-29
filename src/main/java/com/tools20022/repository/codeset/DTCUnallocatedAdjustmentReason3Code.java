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
import com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * DTC Unallocated reason codes for payment adjustments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
 * DTCUnallocatedAdjustmentReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#BadAnnouncement
 * DTCUnallocatedAdjustmentReason3Code.BadAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#BadPayableDate
 * DTCUnallocatedAdjustmentReason3Code.BadPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CashRateUnknown
 * DTCUnallocatedAdjustmentReason3Code.CashRateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CashRateZero
 * DTCUnallocatedAdjustmentReason3Code.CashRateZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#ConditionalPayment
 * DTCUnallocatedAdjustmentReason3Code.ConditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#Default
 * DTCUnallocatedAdjustmentReason3Code.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#HolidayInCountryOfOrigin
 * DTCUnallocatedAdjustmentReason3Code.HolidayInCountryOfOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#InsufficientFundsReceivedFromAgent
 * DTCUnallocatedAdjustmentReason3Code.InsufficientFundsReceivedFromAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#IssueNotFunded
 * DTCUnallocatedAdjustmentReason3Code.IssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#IssueNotMaturing
 * DTCUnallocatedAdjustmentReason3Code.IssueNotMaturing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#AfterCycleCutOff
 * DTCUnallocatedAdjustmentReason3Code.AfterCycleCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#ItemIsPending
 * DTCUnallocatedAdjustmentReason3Code.ItemIsPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#FundsNotReceivedByAgent
 * DTCUnallocatedAdjustmentReason3Code.FundsNotReceivedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#Liquidation
 * DTCUnallocatedAdjustmentReason3Code.Liquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#NotionalBalance
 * DTCUnallocatedAdjustmentReason3Code.NotionalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#Other
 * DTCUnallocatedAdjustmentReason3Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#PaidUponReceiptOfCheck
 * DTCUnallocatedAdjustmentReason3Code.PaidUponReceiptOfCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#PendingConversionOfFunds
 * DTCUnallocatedAdjustmentReason3Code.PendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#RecapitalizationNotFunded
 * DTCUnallocatedAdjustmentReason3Code.RecapitalizationNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#RedemptionOfRatesNotYetFunded
 * DTCUnallocatedAdjustmentReason3Code.RedemptionOfRatesNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#ReleasedPledgePosition
 * DTCUnallocatedAdjustmentReason3Code.ReleasedPledgePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#SaleOfAssetsNotYetFunded
 * DTCUnallocatedAdjustmentReason3Code.SaleOfAssetsNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#SameDayPositionCapture
 * DTCUnallocatedAdjustmentReason3Code.SameDayPositionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#SpecialDistributionNotYetFunded
 * DTCUnallocatedAdjustmentReason3Code.SpecialDistributionNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#SpecificIssuesSuppressed
 * DTCUnallocatedAdjustmentReason3Code.SpecificIssuesSuppressed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#ApproximateRate
 * DTCUnallocatedAdjustmentReason3Code.ApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#GracePeriod
 * DTCUnallocatedAdjustmentReason3Code.GracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#MaturityForStockPaymentOption
 * DTCUnallocatedAdjustmentReason3Code.MaturityForStockPaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#PledgedPosition
 * DTCUnallocatedAdjustmentReason3Code.PledgedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CallRescinded
 * DTCUnallocatedAdjustmentReason3Code.CallRescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CDAcceleratedMaturity
 * DTCUnallocatedAdjustmentReason3Code.CDAcceleratedMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CHIPSPayment
 * DTCUnallocatedAdjustmentReason3Code.CHIPSPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#ChurchBondNotFunded
 * DTCUnallocatedAdjustmentReason3Code.ChurchBondNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#FDIC
 * DTCUnallocatedAdjustmentReason3Code.FDIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#FiveDayGracePeriod
 * DTCUnallocatedAdjustmentReason3Code.FiveDayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#FundsHeldAtChaseForOFAC
 * DTCUnallocatedAdjustmentReason3Code.FundsHeldAtChaseForOFAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CanadianDepositoryInventory
 * DTCUnallocatedAdjustmentReason3Code.CanadianDepositoryInventory}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCUnallocatedAdjustmentReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "DTC Unallocated reason codes for payment adjustments."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
 * DTCUnallocatedAdjustmentReason2Code}</li>
 * </ul>
 */
public class DTCUnallocatedAdjustmentReason3Code extends DTCUnallocatedAdjustmentReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadAnnouncement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#BadAnnouncement
	 * DTCUnallocatedAdjustmentReason2Code.BadAnnouncement}</li>
	 * </ul>
	 */
	public static final MMCode BadAnnouncement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadAnnouncement";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.BadAnnouncement;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadPayableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#BadPayableDate
	 * DTCUnallocatedAdjustmentReason2Code.BadPayableDate}</li>
	 * </ul>
	 */
	public static final MMCode BadPayableDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadPayableDate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.BadPayableDate;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CashRateUnknown
	 * DTCUnallocatedAdjustmentReason2Code.CashRateUnknown}</li>
	 * </ul>
	 */
	public static final MMCode CashRateUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateUnknown";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.CashRateUnknown;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateZero"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CashRateZero
	 * DTCUnallocatedAdjustmentReason2Code.CashRateZero}</li>
	 * </ul>
	 */
	public static final MMCode CashRateZero = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateZero";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.CashRateZero;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ConditionalPayment
	 * DTCUnallocatedAdjustmentReason2Code.ConditionalPayment}</li>
	 * </ul>
	 */
	public static final MMCode ConditionalPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPayment";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.ConditionalPayment;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#Default
	 * DTCUnallocatedAdjustmentReason2Code.Default}</li>
	 * </ul>
	 */
	public static final MMCode Default = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.Default;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HolidayInCountryOfOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#HolidayInCountryOfOrigin
	 * DTCUnallocatedAdjustmentReason2Code.HolidayInCountryOfOrigin}</li>
	 * </ul>
	 */
	public static final MMCode HolidayInCountryOfOrigin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryOfOrigin";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.HolidayInCountryOfOrigin;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFundsReceivedFromAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#InsufficientFundsReceivedFromAgent
	 * DTCUnallocatedAdjustmentReason2Code.InsufficientFundsReceivedFromAgent}</li>
	 * </ul>
	 */
	public static final MMCode InsufficientFundsReceivedFromAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFundsReceivedFromAgent";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.InsufficientFundsReceivedFromAgent;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#IssueNotFunded
	 * DTCUnallocatedAdjustmentReason2Code.IssueNotFunded}</li>
	 * </ul>
	 */
	public static final MMCode IssueNotFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.IssueNotFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotMaturing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#IssueNotMaturing
	 * DTCUnallocatedAdjustmentReason2Code.IssueNotMaturing}</li>
	 * </ul>
	 */
	public static final MMCode IssueNotMaturing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotMaturing";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.IssueNotMaturing;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterCycleCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#AfterCycleCutOff
	 * DTCUnallocatedAdjustmentReason2Code.AfterCycleCutOff}</li>
	 * </ul>
	 */
	public static final MMCode AfterCycleCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterCycleCutOff";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.AfterCycleCutOff;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIsPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ItemIsPending
	 * DTCUnallocatedAdjustmentReason2Code.ItemIsPending}</li>
	 * </ul>
	 */
	public static final MMCode ItemIsPending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIsPending";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.ItemIsPending;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsNotReceivedByAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#FundsNotReceivedByAgent
	 * DTCUnallocatedAdjustmentReason2Code.FundsNotReceivedByAgent}</li>
	 * </ul>
	 */
	public static final MMCode FundsNotReceivedByAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceivedByAgent";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.FundsNotReceivedByAgent;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#Liquidation
	 * DTCUnallocatedAdjustmentReason2Code.Liquidation}</li>
	 * </ul>
	 */
	public static final MMCode Liquidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.Liquidation;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#NotionalBalance
	 * DTCUnallocatedAdjustmentReason2Code.NotionalBalance}</li>
	 * </ul>
	 */
	public static final MMCode NotionalBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalBalance";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.NotionalBalance;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#Other
	 * DTCUnallocatedAdjustmentReason2Code.Other}</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.Other;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaidUponReceiptOfCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#PaidUponReceiptOfCheck
	 * DTCUnallocatedAdjustmentReason2Code.PaidUponReceiptOfCheck}</li>
	 * </ul>
	 */
	public static final MMCode PaidUponReceiptOfCheck = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponReceiptOfCheck";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.PaidUponReceiptOfCheck;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConversionOfFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#PendingConversionOfFunds
	 * DTCUnallocatedAdjustmentReason2Code.PendingConversionOfFunds}</li>
	 * </ul>
	 */
	public static final MMCode PendingConversionOfFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.PendingConversionOfFunds;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecapitalizationNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#RecapitalizationNotFunded
	 * DTCUnallocatedAdjustmentReason2Code.RecapitalizationNotFunded}</li>
	 * </ul>
	 */
	public static final MMCode RecapitalizationNotFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalizationNotFunded";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.RecapitalizationNotFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionOfRatesNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#RedemptionOfRatesNotYetFunded
	 * DTCUnallocatedAdjustmentReason2Code.RedemptionOfRatesNotYetFunded}</li>
	 * </ul>
	 */
	public static final MMCode RedemptionOfRatesNotYetFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionOfRatesNotYetFunded";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.RedemptionOfRatesNotYetFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReleasedPledgePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ReleasedPledgePosition
	 * DTCUnallocatedAdjustmentReason2Code.ReleasedPledgePosition}</li>
	 * </ul>
	 */
	public static final MMCode ReleasedPledgePosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasedPledgePosition";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.ReleasedPledgePosition;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssetsNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SaleOfAssetsNotYetFunded
	 * DTCUnallocatedAdjustmentReason2Code.SaleOfAssetsNotYetFunded}</li>
	 * </ul>
	 */
	public static final MMCode SaleOfAssetsNotYetFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssetsNotYetFunded";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.SaleOfAssetsNotYetFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayPositionCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SameDayPositionCapture
	 * DTCUnallocatedAdjustmentReason2Code.SameDayPositionCapture}</li>
	 * </ul>
	 */
	public static final MMCode SameDayPositionCapture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayPositionCapture";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.SameDayPositionCapture;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDistributionNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SpecialDistributionNotYetFunded
	 * DTCUnallocatedAdjustmentReason2Code.SpecialDistributionNotYetFunded}</li>
	 * </ul>
	 */
	public static final MMCode SpecialDistributionNotYetFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistributionNotYetFunded";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.SpecialDistributionNotYetFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificIssuesSuppressed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SpecificIssuesSuppressed
	 * DTCUnallocatedAdjustmentReason2Code.SpecificIssuesSuppressed}</li>
	 * </ul>
	 */
	public static final MMCode SpecificIssuesSuppressed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificIssuesSuppressed";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.SpecificIssuesSuppressed;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproximateRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ApproximateRate
	 * DTCUnallocatedAdjustmentReason2Code.ApproximateRate}</li>
	 * </ul>
	 */
	public static final MMCode ApproximateRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.ApproximateRate;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#GracePeriod
	 * DTCUnallocatedAdjustmentReason2Code.GracePeriod}</li>
	 * </ul>
	 */
	public static final MMCode GracePeriod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.GracePeriod;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityForStockPaymentOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#MaturityForStockPaymentOption
	 * DTCUnallocatedAdjustmentReason2Code.MaturityForStockPaymentOption}</li>
	 * </ul>
	 */
	public static final MMCode MaturityForStockPaymentOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityForStockPaymentOption";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.MaturityForStockPaymentOption;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#PledgedPosition
	 * DTCUnallocatedAdjustmentReason2Code.PledgedPosition}</li>
	 * </ul>
	 */
	public static final MMCode PledgedPosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedPosition";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.PledgedPosition;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallRescinded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CallRescinded
	 * DTCUnallocatedAdjustmentReason2Code.CallRescinded}</li>
	 * </ul>
	 */
	public static final MMCode CallRescinded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallRescinded";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.CallRescinded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDAcceleratedMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CDAcceleratedMaturity
	 * DTCUnallocatedAdjustmentReason2Code.CDAcceleratedMaturity}</li>
	 * </ul>
	 */
	public static final MMCode CDAcceleratedMaturity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDAcceleratedMaturity";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.CDAcceleratedMaturity;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CHIPSPayment
	 * DTCUnallocatedAdjustmentReason2Code.CHIPSPayment}</li>
	 * </ul>
	 */
	public static final MMCode CHIPSPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSPayment";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.CHIPSPayment;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChurchBondNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ChurchBondNotFunded
	 * DTCUnallocatedAdjustmentReason2Code.ChurchBondNotFunded}</li>
	 * </ul>
	 */
	public static final MMCode ChurchBondNotFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChurchBondNotFunded";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.ChurchBondNotFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FDIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#FDIC
	 * DTCUnallocatedAdjustmentReason2Code.FDIC}</li>
	 * </ul>
	 */
	public static final MMCode FDIC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FDIC";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.FDIC;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveDayGracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#FiveDayGracePeriod
	 * DTCUnallocatedAdjustmentReason2Code.FiveDayGracePeriod}</li>
	 * </ul>
	 */
	public static final MMCode FiveDayGracePeriod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayGracePeriod";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.FiveDayGracePeriod;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsHeldAtChaseForOFAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#FundsHeldAtChaseForOFAC
	 * DTCUnallocatedAdjustmentReason2Code.FundsHeldAtChaseForOFAC}</li>
	 * </ul>
	 */
	public static final MMCode FundsHeldAtChaseForOFAC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsHeldAtChaseForOFAC";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.FundsHeldAtChaseForOFAC;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
	 * DTCUnallocatedAdjustmentReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianDepositoryInventory"</li>
	 * </ul>
	 */
	public static final MMCode CanadianDepositoryInventory = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianDepositoryInventory";
			owner_lazy = () -> DTCUnallocatedAdjustmentReason3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DTCUnallocatedAdjustmentReason3Code";
				definition = "DTC Unallocated reason codes for payment adjustments.";
				previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.BadAnnouncement, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.BadPayableDate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.CashRateUnknown, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.CashRateZero,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.ConditionalPayment, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.Default,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.HolidayInCountryOfOrigin, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.InsufficientFundsReceivedFromAgent,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.IssueNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.IssueNotMaturing,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.AfterCycleCutOff, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.ItemIsPending,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.FundsNotReceivedByAgent, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.Liquidation,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.NotionalBalance, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.Other,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.PaidUponReceiptOfCheck, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.PendingConversionOfFunds,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.RecapitalizationNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.RedemptionOfRatesNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.ReleasedPledgePosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.SaleOfAssetsNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.SameDayPositionCapture, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.SpecialDistributionNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.SpecificIssuesSuppressed, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.ApproximateRate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.GracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.MaturityForStockPaymentOption,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.PledgedPosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.CallRescinded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.CDAcceleratedMaturity, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.CHIPSPayment,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.ChurchBondNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.FDIC,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.FiveDayGracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.FundsHeldAtChaseForOFAC,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.CanadianDepositoryInventory);
				trace_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}