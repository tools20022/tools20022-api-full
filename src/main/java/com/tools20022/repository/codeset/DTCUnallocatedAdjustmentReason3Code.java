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
import com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
 * DTCUnallocatedAdjustmentReasonCode}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCUnallocatedAdjustmentReason3Code extends MMCode {

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
	public static final DTCUnallocatedAdjustmentReason3Code BadAnnouncement = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadAnnouncement";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.BadAnnouncement;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.BadAnnouncement.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code BadPayableDate = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadPayableDate";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.BadPayableDate;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.BadPayableDate.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code CashRateUnknown = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateUnknown";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.CashRateUnknown;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CashRateUnknown.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code CashRateZero = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateZero";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.CashRateZero;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CashRateZero.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code ConditionalPayment = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPayment";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.ConditionalPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ConditionalPayment.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code Default = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.Default;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.Default.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code HolidayInCountryOfOrigin = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryOfOrigin";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.HolidayInCountryOfOrigin;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.HolidayInCountryOfOrigin.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code InsufficientFundsReceivedFromAgent = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFundsReceivedFromAgent";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.InsufficientFundsReceivedFromAgent;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.InsufficientFundsReceivedFromAgent.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code IssueNotFunded = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.IssueNotFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.IssueNotFunded.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code IssueNotMaturing = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotMaturing";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.IssueNotMaturing;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.IssueNotMaturing.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code AfterCycleCutOff = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterCycleCutOff";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.AfterCycleCutOff;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.AfterCycleCutOff.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code ItemIsPending = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIsPending";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.ItemIsPending;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ItemIsPending.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code FundsNotReceivedByAgent = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceivedByAgent";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.FundsNotReceivedByAgent;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.FundsNotReceivedByAgent.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code Liquidation = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.Liquidation;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.Liquidation.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code NotionalBalance = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalBalance";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.NotionalBalance;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.NotionalBalance.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code Other = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.Other;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.Other.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code PaidUponReceiptOfCheck = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponReceiptOfCheck";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.PaidUponReceiptOfCheck;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.PaidUponReceiptOfCheck.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code PendingConversionOfFunds = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.PendingConversionOfFunds;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.PendingConversionOfFunds.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code RecapitalizationNotFunded = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalizationNotFunded";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.RecapitalizationNotFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.RecapitalizationNotFunded.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code RedemptionOfRatesNotYetFunded = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionOfRatesNotYetFunded";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.RedemptionOfRatesNotYetFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.RedemptionOfRatesNotYetFunded.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code ReleasedPledgePosition = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasedPledgePosition";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.ReleasedPledgePosition;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ReleasedPledgePosition.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code SaleOfAssetsNotYetFunded = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssetsNotYetFunded";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.SaleOfAssetsNotYetFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SaleOfAssetsNotYetFunded.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code SameDayPositionCapture = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayPositionCapture";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.SameDayPositionCapture;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SameDayPositionCapture.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code SpecialDistributionNotYetFunded = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistributionNotYetFunded";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.SpecialDistributionNotYetFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SpecialDistributionNotYetFunded.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code SpecificIssuesSuppressed = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificIssuesSuppressed";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.SpecificIssuesSuppressed;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SpecificIssuesSuppressed.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code ApproximateRate = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.ApproximateRate;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ApproximateRate.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code GracePeriod = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.GracePeriod;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.GracePeriod.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code MaturityForStockPaymentOption = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityForStockPaymentOption";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.MaturityForStockPaymentOption;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.MaturityForStockPaymentOption.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code PledgedPosition = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedPosition";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.PledgedPosition;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.PledgedPosition.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code CallRescinded = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallRescinded";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.CallRescinded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CallRescinded.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code CDAcceleratedMaturity = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDAcceleratedMaturity";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.CDAcceleratedMaturity;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CDAcceleratedMaturity.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code CHIPSPayment = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSPayment";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.CHIPSPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CHIPSPayment.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code ChurchBondNotFunded = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChurchBondNotFunded";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.ChurchBondNotFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ChurchBondNotFunded.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code FDIC = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FDIC";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.FDIC;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.FDIC.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code FiveDayGracePeriod = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayGracePeriod";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.FiveDayGracePeriod;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.FiveDayGracePeriod.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code FundsHeldAtChaseForOFAC = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsHeldAtChaseForOFAC";
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.FundsHeldAtChaseForOFAC;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.FundsHeldAtChaseForOFAC.getCodeName().orElse(name);
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
	public static final DTCUnallocatedAdjustmentReason3Code CanadianDepositoryInventory = new DTCUnallocatedAdjustmentReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianDepositoryInventory";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CanadianDepositoryInventory.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCUnallocatedAdjustmentReason3Code> codesByName = new LinkedHashMap<>();

	protected DTCUnallocatedAdjustmentReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DTCUnallocatedAdjustmentReason3Code";
				definition = "DTC Unallocated reason codes for payment adjustments.";
				previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
				trace_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BadAnnouncement.getCodeName().get(), BadAnnouncement);
		codesByName.put(BadPayableDate.getCodeName().get(), BadPayableDate);
		codesByName.put(CashRateUnknown.getCodeName().get(), CashRateUnknown);
		codesByName.put(CashRateZero.getCodeName().get(), CashRateZero);
		codesByName.put(ConditionalPayment.getCodeName().get(), ConditionalPayment);
		codesByName.put(Default.getCodeName().get(), Default);
		codesByName.put(HolidayInCountryOfOrigin.getCodeName().get(), HolidayInCountryOfOrigin);
		codesByName.put(InsufficientFundsReceivedFromAgent.getCodeName().get(), InsufficientFundsReceivedFromAgent);
		codesByName.put(IssueNotFunded.getCodeName().get(), IssueNotFunded);
		codesByName.put(IssueNotMaturing.getCodeName().get(), IssueNotMaturing);
		codesByName.put(AfterCycleCutOff.getCodeName().get(), AfterCycleCutOff);
		codesByName.put(ItemIsPending.getCodeName().get(), ItemIsPending);
		codesByName.put(FundsNotReceivedByAgent.getCodeName().get(), FundsNotReceivedByAgent);
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
		codesByName.put(ApproximateRate.getCodeName().get(), ApproximateRate);
		codesByName.put(GracePeriod.getCodeName().get(), GracePeriod);
		codesByName.put(MaturityForStockPaymentOption.getCodeName().get(), MaturityForStockPaymentOption);
		codesByName.put(PledgedPosition.getCodeName().get(), PledgedPosition);
		codesByName.put(CallRescinded.getCodeName().get(), CallRescinded);
		codesByName.put(CDAcceleratedMaturity.getCodeName().get(), CDAcceleratedMaturity);
		codesByName.put(CHIPSPayment.getCodeName().get(), CHIPSPayment);
		codesByName.put(ChurchBondNotFunded.getCodeName().get(), ChurchBondNotFunded);
		codesByName.put(FDIC.getCodeName().get(), FDIC);
		codesByName.put(FiveDayGracePeriod.getCodeName().get(), FiveDayGracePeriod);
		codesByName.put(FundsHeldAtChaseForOFAC.getCodeName().get(), FundsHeldAtChaseForOFAC);
		codesByName.put(CanadianDepositoryInventory.getCodeName().get(), CanadianDepositoryInventory);
	}

	public static DTCUnallocatedAdjustmentReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCUnallocatedAdjustmentReason3Code[] values() {
		DTCUnallocatedAdjustmentReason3Code[] values = new DTCUnallocatedAdjustmentReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCUnallocatedAdjustmentReason3Code> {
		@Override
		public DTCUnallocatedAdjustmentReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCUnallocatedAdjustmentReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}