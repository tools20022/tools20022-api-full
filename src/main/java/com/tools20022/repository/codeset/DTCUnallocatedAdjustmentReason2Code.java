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
import com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#BadAnnouncement
 * DTCUnallocatedAdjustmentReason2Code.BadAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#BadPayableDate
 * DTCUnallocatedAdjustmentReason2Code.BadPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CashRateUnknown
 * DTCUnallocatedAdjustmentReason2Code.CashRateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CashRateZero
 * DTCUnallocatedAdjustmentReason2Code.CashRateZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ConditionalPayment
 * DTCUnallocatedAdjustmentReason2Code.ConditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#Default
 * DTCUnallocatedAdjustmentReason2Code.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#HolidayInCountryOfOrigin
 * DTCUnallocatedAdjustmentReason2Code.HolidayInCountryOfOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#InsufficientFundsReceivedFromAgent
 * DTCUnallocatedAdjustmentReason2Code.InsufficientFundsReceivedFromAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#IssueNotFunded
 * DTCUnallocatedAdjustmentReason2Code.IssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#IssueNotMaturing
 * DTCUnallocatedAdjustmentReason2Code.IssueNotMaturing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#AfterCycleCutOff
 * DTCUnallocatedAdjustmentReason2Code.AfterCycleCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ItemIsPending
 * DTCUnallocatedAdjustmentReason2Code.ItemIsPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#FundsNotReceivedByAgent
 * DTCUnallocatedAdjustmentReason2Code.FundsNotReceivedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#Liquidation
 * DTCUnallocatedAdjustmentReason2Code.Liquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#NotionalBalance
 * DTCUnallocatedAdjustmentReason2Code.NotionalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#Other
 * DTCUnallocatedAdjustmentReason2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#PaidUponReceiptOfCheck
 * DTCUnallocatedAdjustmentReason2Code.PaidUponReceiptOfCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#PendingConversionOfFunds
 * DTCUnallocatedAdjustmentReason2Code.PendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#RecapitalizationNotFunded
 * DTCUnallocatedAdjustmentReason2Code.RecapitalizationNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#RedemptionOfRatesNotYetFunded
 * DTCUnallocatedAdjustmentReason2Code.RedemptionOfRatesNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ReleasedPledgePosition
 * DTCUnallocatedAdjustmentReason2Code.ReleasedPledgePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SaleOfAssetsNotYetFunded
 * DTCUnallocatedAdjustmentReason2Code.SaleOfAssetsNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SameDayPositionCapture
 * DTCUnallocatedAdjustmentReason2Code.SameDayPositionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SpecialDistributionNotYetFunded
 * DTCUnallocatedAdjustmentReason2Code.SpecialDistributionNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SpecificIssuesSuppressed
 * DTCUnallocatedAdjustmentReason2Code.SpecificIssuesSuppressed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ApproximateRate
 * DTCUnallocatedAdjustmentReason2Code.ApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#GracePeriod
 * DTCUnallocatedAdjustmentReason2Code.GracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#MaturityForStockPaymentOption
 * DTCUnallocatedAdjustmentReason2Code.MaturityForStockPaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#PledgedPosition
 * DTCUnallocatedAdjustmentReason2Code.PledgedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CallRescinded
 * DTCUnallocatedAdjustmentReason2Code.CallRescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CDAcceleratedMaturity
 * DTCUnallocatedAdjustmentReason2Code.CDAcceleratedMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CHIPSPayment
 * DTCUnallocatedAdjustmentReason2Code.CHIPSPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ChurchBondNotFunded
 * DTCUnallocatedAdjustmentReason2Code.ChurchBondNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#FDIC
 * DTCUnallocatedAdjustmentReason2Code.FDIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#FiveDayGracePeriod
 * DTCUnallocatedAdjustmentReason2Code.FiveDayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#FundsHeldAtChaseForOFAC
 * DTCUnallocatedAdjustmentReason2Code.FundsHeldAtChaseForOFAC}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCUnallocatedAdjustmentReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "DTC Unallocated reason codes for payment adjustments."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
 * DTCUnallocatedAdjustmentReason3Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
 * DTCUnallocatedAdjustmentReason1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCUnallocatedAdjustmentReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadAnnouncement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#BadAnnouncement
	 * DTCUnallocatedAdjustmentReason3Code.BadAnnouncement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#BadAnnouncement
	 * DTCUnallocatedAdjustmentReason1Code.BadAnnouncement}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code BadAnnouncement = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadAnnouncement";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.BadAnnouncement);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.BadAnnouncement;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.BadAnnouncement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadPayableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#BadPayableDate
	 * DTCUnallocatedAdjustmentReason3Code.BadPayableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#BadPayableDate
	 * DTCUnallocatedAdjustmentReason1Code.BadPayableDate}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code BadPayableDate = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadPayableDate";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.BadPayableDate);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.BadPayableDate;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.BadPayableDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CashRateUnknown
	 * DTCUnallocatedAdjustmentReason3Code.CashRateUnknown}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#CashRateUnknown
	 * DTCUnallocatedAdjustmentReason1Code.CashRateUnknown}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code CashRateUnknown = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateUnknown";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.CashRateUnknown);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.CashRateUnknown;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CashRateUnknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateZero"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CashRateZero
	 * DTCUnallocatedAdjustmentReason3Code.CashRateZero}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#CashRateZero
	 * DTCUnallocatedAdjustmentReason1Code.CashRateZero}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code CashRateZero = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateZero";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.CashRateZero);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.CashRateZero;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CashRateZero.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#ConditionalPayment
	 * DTCUnallocatedAdjustmentReason3Code.ConditionalPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#ConditionalPayment
	 * DTCUnallocatedAdjustmentReason1Code.ConditionalPayment}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code ConditionalPayment = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPayment";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.ConditionalPayment);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.ConditionalPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ConditionalPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#Default
	 * DTCUnallocatedAdjustmentReason3Code.Default}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#Default
	 * DTCUnallocatedAdjustmentReason1Code.Default}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code Default = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.Default);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.Default;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.Default.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HolidayInCountryOfOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#HolidayInCountryOfOrigin
	 * DTCUnallocatedAdjustmentReason3Code.HolidayInCountryOfOrigin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#HolidayInCountryOfOrigin
	 * DTCUnallocatedAdjustmentReason1Code.HolidayInCountryOfOrigin}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code HolidayInCountryOfOrigin = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryOfOrigin";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.HolidayInCountryOfOrigin);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.HolidayInCountryOfOrigin;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.HolidayInCountryOfOrigin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFundsReceivedFromAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#InsufficientFundsReceivedFromAgent
	 * DTCUnallocatedAdjustmentReason3Code.InsufficientFundsReceivedFromAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#InsufficientFundsReceivedFromAgent
	 * DTCUnallocatedAdjustmentReason1Code.InsufficientFundsReceivedFromAgent}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code InsufficientFundsReceivedFromAgent = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFundsReceivedFromAgent";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.InsufficientFundsReceivedFromAgent);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.InsufficientFundsReceivedFromAgent;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.InsufficientFundsReceivedFromAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#IssueNotFunded
	 * DTCUnallocatedAdjustmentReason3Code.IssueNotFunded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#IssueNotFunded
	 * DTCUnallocatedAdjustmentReason1Code.IssueNotFunded}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code IssueNotFunded = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.IssueNotFunded);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.IssueNotFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.IssueNotFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotMaturing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#IssueNotMaturing
	 * DTCUnallocatedAdjustmentReason3Code.IssueNotMaturing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#IssueNotMaturing
	 * DTCUnallocatedAdjustmentReason1Code.IssueNotMaturing}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code IssueNotMaturing = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotMaturing";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.IssueNotMaturing);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.IssueNotMaturing;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.IssueNotMaturing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterCycleCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#AfterCycleCutOff
	 * DTCUnallocatedAdjustmentReason3Code.AfterCycleCutOff}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#AfterCycleCutOff
	 * DTCUnallocatedAdjustmentReason1Code.AfterCycleCutOff}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code AfterCycleCutOff = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterCycleCutOff";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.AfterCycleCutOff);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.AfterCycleCutOff;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.AfterCycleCutOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIsPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#ItemIsPending
	 * DTCUnallocatedAdjustmentReason3Code.ItemIsPending}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#ItemIsPending
	 * DTCUnallocatedAdjustmentReason1Code.ItemIsPending}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code ItemIsPending = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIsPending";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.ItemIsPending);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.ItemIsPending;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ItemIsPending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsNotReceivedByAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#FundsNotReceivedByAgent
	 * DTCUnallocatedAdjustmentReason3Code.FundsNotReceivedByAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#FundsNotReceivedByAgent
	 * DTCUnallocatedAdjustmentReason1Code.FundsNotReceivedByAgent}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code FundsNotReceivedByAgent = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceivedByAgent";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.FundsNotReceivedByAgent);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.FundsNotReceivedByAgent;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.FundsNotReceivedByAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#Liquidation
	 * DTCUnallocatedAdjustmentReason3Code.Liquidation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#Liquidation
	 * DTCUnallocatedAdjustmentReason1Code.Liquidation}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code Liquidation = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.Liquidation);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.Liquidation;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.Liquidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#NotionalBalance
	 * DTCUnallocatedAdjustmentReason3Code.NotionalBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#NotionalBalance
	 * DTCUnallocatedAdjustmentReason1Code.NotionalBalance}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code NotionalBalance = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalBalance";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.NotionalBalance);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.NotionalBalance;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.NotionalBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#Other
	 * DTCUnallocatedAdjustmentReason3Code.Other}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#Other
	 * DTCUnallocatedAdjustmentReason1Code.Other}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code Other = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.Other);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.Other;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaidUponReceiptOfCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#PaidUponReceiptOfCheck
	 * DTCUnallocatedAdjustmentReason3Code.PaidUponReceiptOfCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#PaidUponReceiptOfCheck
	 * DTCUnallocatedAdjustmentReason1Code.PaidUponReceiptOfCheck}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code PaidUponReceiptOfCheck = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponReceiptOfCheck";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.PaidUponReceiptOfCheck);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.PaidUponReceiptOfCheck;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.PaidUponReceiptOfCheck.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConversionOfFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#PendingConversionOfFunds
	 * DTCUnallocatedAdjustmentReason3Code.PendingConversionOfFunds}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#PendingConversionOfFunds
	 * DTCUnallocatedAdjustmentReason1Code.PendingConversionOfFunds}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code PendingConversionOfFunds = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.PendingConversionOfFunds);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.PendingConversionOfFunds;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.PendingConversionOfFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecapitalizationNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#RecapitalizationNotFunded
	 * DTCUnallocatedAdjustmentReason3Code.RecapitalizationNotFunded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#RecapitalizationNotFunded
	 * DTCUnallocatedAdjustmentReason1Code.RecapitalizationNotFunded}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code RecapitalizationNotFunded = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalizationNotFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.RecapitalizationNotFunded);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.RecapitalizationNotFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.RecapitalizationNotFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionOfRatesNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#RedemptionOfRatesNotYetFunded
	 * DTCUnallocatedAdjustmentReason3Code.RedemptionOfRatesNotYetFunded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#RedemptionOfRatesNotYetFunded
	 * DTCUnallocatedAdjustmentReason1Code.RedemptionOfRatesNotYetFunded}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code RedemptionOfRatesNotYetFunded = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionOfRatesNotYetFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.RedemptionOfRatesNotYetFunded);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.RedemptionOfRatesNotYetFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.RedemptionOfRatesNotYetFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReleasedPledgePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#ReleasedPledgePosition
	 * DTCUnallocatedAdjustmentReason3Code.ReleasedPledgePosition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#ReleasedPledgePosition
	 * DTCUnallocatedAdjustmentReason1Code.ReleasedPledgePosition}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code ReleasedPledgePosition = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasedPledgePosition";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.ReleasedPledgePosition);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.ReleasedPledgePosition;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ReleasedPledgePosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssetsNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#SaleOfAssetsNotYetFunded
	 * DTCUnallocatedAdjustmentReason3Code.SaleOfAssetsNotYetFunded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#SaleOfAssetsNotYetFunded
	 * DTCUnallocatedAdjustmentReason1Code.SaleOfAssetsNotYetFunded}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code SaleOfAssetsNotYetFunded = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssetsNotYetFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.SaleOfAssetsNotYetFunded);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.SaleOfAssetsNotYetFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SaleOfAssetsNotYetFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayPositionCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#SameDayPositionCapture
	 * DTCUnallocatedAdjustmentReason3Code.SameDayPositionCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#SameDayPositionCapture
	 * DTCUnallocatedAdjustmentReason1Code.SameDayPositionCapture}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code SameDayPositionCapture = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayPositionCapture";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.SameDayPositionCapture);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.SameDayPositionCapture;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SameDayPositionCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDistributionNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#SpecialDistributionNotYetFunded
	 * DTCUnallocatedAdjustmentReason3Code.SpecialDistributionNotYetFunded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#SpecialDistributionNotYetFunded
	 * DTCUnallocatedAdjustmentReason1Code.SpecialDistributionNotYetFunded}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code SpecialDistributionNotYetFunded = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistributionNotYetFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.SpecialDistributionNotYetFunded);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.SpecialDistributionNotYetFunded;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SpecialDistributionNotYetFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificIssuesSuppressed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#SpecificIssuesSuppressed
	 * DTCUnallocatedAdjustmentReason3Code.SpecificIssuesSuppressed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#SpecificIssuesSuppressed
	 * DTCUnallocatedAdjustmentReason1Code.SpecificIssuesSuppressed}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code SpecificIssuesSuppressed = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificIssuesSuppressed";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.SpecificIssuesSuppressed);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.SpecificIssuesSuppressed;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SpecificIssuesSuppressed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproximateRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#ApproximateRate
	 * DTCUnallocatedAdjustmentReason3Code.ApproximateRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#ApproximateRate
	 * DTCUnallocatedAdjustmentReason1Code.ApproximateRate}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code ApproximateRate = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.ApproximateRate);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.ApproximateRate;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ApproximateRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#GracePeriod
	 * DTCUnallocatedAdjustmentReason3Code.GracePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#GracePeriod
	 * DTCUnallocatedAdjustmentReason1Code.GracePeriod}</li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code GracePeriod = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.GracePeriod);
			previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.GracePeriod;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.GracePeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityForStockPaymentOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#MaturityForStockPaymentOption
	 * DTCUnallocatedAdjustmentReason3Code.MaturityForStockPaymentOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code MaturityForStockPaymentOption = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityForStockPaymentOption";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.MaturityForStockPaymentOption);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.MaturityForStockPaymentOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#PledgedPosition
	 * DTCUnallocatedAdjustmentReason3Code.PledgedPosition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code PledgedPosition = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedPosition";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.PledgedPosition);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.PledgedPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallRescinded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CallRescinded
	 * DTCUnallocatedAdjustmentReason3Code.CallRescinded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code CallRescinded = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallRescinded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.CallRescinded);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CallRescinded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDAcceleratedMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CDAcceleratedMaturity
	 * DTCUnallocatedAdjustmentReason3Code.CDAcceleratedMaturity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code CDAcceleratedMaturity = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDAcceleratedMaturity";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.CDAcceleratedMaturity);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CDAcceleratedMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#CHIPSPayment
	 * DTCUnallocatedAdjustmentReason3Code.CHIPSPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code CHIPSPayment = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSPayment";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.CHIPSPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CHIPSPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChurchBondNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#ChurchBondNotFunded
	 * DTCUnallocatedAdjustmentReason3Code.ChurchBondNotFunded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code ChurchBondNotFunded = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChurchBondNotFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.ChurchBondNotFunded);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ChurchBondNotFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FDIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#FDIC
	 * DTCUnallocatedAdjustmentReason3Code.FDIC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code FDIC = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FDIC";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.FDIC);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.FDIC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveDayGracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#FiveDayGracePeriod
	 * DTCUnallocatedAdjustmentReason3Code.FiveDayGracePeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code FiveDayGracePeriod = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayGracePeriod";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.FiveDayGracePeriod);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.FiveDayGracePeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsHeldAtChaseForOFAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#FundsHeldAtChaseForOFAC
	 * DTCUnallocatedAdjustmentReason3Code.FundsHeldAtChaseForOFAC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason2Code FundsHeldAtChaseForOFAC = new DTCUnallocatedAdjustmentReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsHeldAtChaseForOFAC";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.FundsHeldAtChaseForOFAC);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.FundsHeldAtChaseForOFAC.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCUnallocatedAdjustmentReason2Code> codesByName = new LinkedHashMap<>();

	protected DTCUnallocatedAdjustmentReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCUnallocatedAdjustmentReason2Code";
				definition = "DTC Unallocated reason codes for payment adjustments.";
				nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.mmObject());
				previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.mmObject();
				trace_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.BadAnnouncement, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.BadPayableDate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.CashRateUnknown, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.CashRateZero,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.ConditionalPayment, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.Default,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.HolidayInCountryOfOrigin, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.InsufficientFundsReceivedFromAgent,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.IssueNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.IssueNotMaturing,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.AfterCycleCutOff, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.ItemIsPending,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.FundsNotReceivedByAgent, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.Liquidation,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.NotionalBalance, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.Other,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.PaidUponReceiptOfCheck, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.PendingConversionOfFunds,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.RecapitalizationNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.RedemptionOfRatesNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.ReleasedPledgePosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.SaleOfAssetsNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.SameDayPositionCapture, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.SpecialDistributionNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.SpecificIssuesSuppressed, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.ApproximateRate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.GracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.MaturityForStockPaymentOption,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.PledgedPosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.CallRescinded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.CDAcceleratedMaturity, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.CHIPSPayment,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.ChurchBondNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.FDIC,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.FiveDayGracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.FundsHeldAtChaseForOFAC);
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
	}

	public static DTCUnallocatedAdjustmentReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCUnallocatedAdjustmentReason2Code[] values() {
		DTCUnallocatedAdjustmentReason2Code[] values = new DTCUnallocatedAdjustmentReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCUnallocatedAdjustmentReason2Code> {
		@Override
		public DTCUnallocatedAdjustmentReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCUnallocatedAdjustmentReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}