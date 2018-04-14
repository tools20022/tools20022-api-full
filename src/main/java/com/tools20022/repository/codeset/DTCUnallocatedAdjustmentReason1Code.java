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
import com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#BadAnnouncement
 * DTCUnallocatedAdjustmentReason1Code.BadAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#BadPayableDate
 * DTCUnallocatedAdjustmentReason1Code.BadPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#CashRateUnknown
 * DTCUnallocatedAdjustmentReason1Code.CashRateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#CashRateZero
 * DTCUnallocatedAdjustmentReason1Code.CashRateZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#ConditionalPayment
 * DTCUnallocatedAdjustmentReason1Code.ConditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#Default
 * DTCUnallocatedAdjustmentReason1Code.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#HolidayInCountryOfOrigin
 * DTCUnallocatedAdjustmentReason1Code.HolidayInCountryOfOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#InsufficientFundsReceivedFromAgent
 * DTCUnallocatedAdjustmentReason1Code.InsufficientFundsReceivedFromAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#IssueNotFunded
 * DTCUnallocatedAdjustmentReason1Code.IssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#IssueNotMaturing
 * DTCUnallocatedAdjustmentReason1Code.IssueNotMaturing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#AfterCycleCutOff
 * DTCUnallocatedAdjustmentReason1Code.AfterCycleCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#ItemIsPending
 * DTCUnallocatedAdjustmentReason1Code.ItemIsPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#FundsNotReceivedByAgent
 * DTCUnallocatedAdjustmentReason1Code.FundsNotReceivedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#Liquidation
 * DTCUnallocatedAdjustmentReason1Code.Liquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#NotionalBalance
 * DTCUnallocatedAdjustmentReason1Code.NotionalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#Other
 * DTCUnallocatedAdjustmentReason1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#PaidUponReceiptOfCheck
 * DTCUnallocatedAdjustmentReason1Code.PaidUponReceiptOfCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#PendingConversionOfFunds
 * DTCUnallocatedAdjustmentReason1Code.PendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#RecapitalizationNotFunded
 * DTCUnallocatedAdjustmentReason1Code.RecapitalizationNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#RedemptionOfRatesNotYetFunded
 * DTCUnallocatedAdjustmentReason1Code.RedemptionOfRatesNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#ReleasedPledgePosition
 * DTCUnallocatedAdjustmentReason1Code.ReleasedPledgePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#SaleOfAssetsNotYetFunded
 * DTCUnallocatedAdjustmentReason1Code.SaleOfAssetsNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#SameDayPositionCapture
 * DTCUnallocatedAdjustmentReason1Code.SameDayPositionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#SpecialDistributionNotYetFunded
 * DTCUnallocatedAdjustmentReason1Code.SpecialDistributionNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#SpecificIssuesSuppressed
 * DTCUnallocatedAdjustmentReason1Code.SpecificIssuesSuppressed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#ApproximateRate
 * DTCUnallocatedAdjustmentReason1Code.ApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#GracePeriod
 * DTCUnallocatedAdjustmentReason1Code.GracePeriod}</li>
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
 * "DTCUnallocatedAdjustmentReason1Code"</li>
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
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
 * DTCUnallocatedAdjustmentReason2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCUnallocatedAdjustmentReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#BadAnnouncement
	 * DTCUnallocatedAdjustmentReason2Code.BadAnnouncement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code BadAnnouncement = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadAnnouncement";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.BadAnnouncement);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.BadAnnouncement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#BadPayableDate
	 * DTCUnallocatedAdjustmentReason2Code.BadPayableDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code BadPayableDate = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadPayableDate";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.BadPayableDate);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.BadPayableDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CashRateUnknown
	 * DTCUnallocatedAdjustmentReason2Code.CashRateUnknown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code CashRateUnknown = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateUnknown";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.CashRateUnknown);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CashRateUnknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#CashRateZero
	 * DTCUnallocatedAdjustmentReason2Code.CashRateZero}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code CashRateZero = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateZero";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.CashRateZero);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.CashRateZero.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ConditionalPayment
	 * DTCUnallocatedAdjustmentReason2Code.ConditionalPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code ConditionalPayment = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPayment";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.ConditionalPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ConditionalPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#Default
	 * DTCUnallocatedAdjustmentReason2Code.Default}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code Default = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.Default);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.Default.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#HolidayInCountryOfOrigin
	 * DTCUnallocatedAdjustmentReason2Code.HolidayInCountryOfOrigin}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code HolidayInCountryOfOrigin = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryOfOrigin";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.HolidayInCountryOfOrigin);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.HolidayInCountryOfOrigin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#InsufficientFundsReceivedFromAgent
	 * DTCUnallocatedAdjustmentReason2Code.InsufficientFundsReceivedFromAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code InsufficientFundsReceivedFromAgent = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFundsReceivedFromAgent";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.InsufficientFundsReceivedFromAgent);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.InsufficientFundsReceivedFromAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#IssueNotFunded
	 * DTCUnallocatedAdjustmentReason2Code.IssueNotFunded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code IssueNotFunded = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.IssueNotFunded);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.IssueNotFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#IssueNotMaturing
	 * DTCUnallocatedAdjustmentReason2Code.IssueNotMaturing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code IssueNotMaturing = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotMaturing";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.IssueNotMaturing);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.IssueNotMaturing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#AfterCycleCutOff
	 * DTCUnallocatedAdjustmentReason2Code.AfterCycleCutOff}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code AfterCycleCutOff = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterCycleCutOff";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.AfterCycleCutOff);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.AfterCycleCutOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ItemIsPending
	 * DTCUnallocatedAdjustmentReason2Code.ItemIsPending}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code ItemIsPending = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIsPending";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.ItemIsPending);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ItemIsPending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#FundsNotReceivedByAgent
	 * DTCUnallocatedAdjustmentReason2Code.FundsNotReceivedByAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code FundsNotReceivedByAgent = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceivedByAgent";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.FundsNotReceivedByAgent);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.FundsNotReceivedByAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#Liquidation
	 * DTCUnallocatedAdjustmentReason2Code.Liquidation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code Liquidation = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.Liquidation);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.Liquidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#NotionalBalance
	 * DTCUnallocatedAdjustmentReason2Code.NotionalBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code NotionalBalance = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalBalance";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.NotionalBalance);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.NotionalBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#Other
	 * DTCUnallocatedAdjustmentReason2Code.Other}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code Other = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.Other);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#PaidUponReceiptOfCheck
	 * DTCUnallocatedAdjustmentReason2Code.PaidUponReceiptOfCheck}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code PaidUponReceiptOfCheck = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponReceiptOfCheck";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.PaidUponReceiptOfCheck);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.PaidUponReceiptOfCheck.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#PendingConversionOfFunds
	 * DTCUnallocatedAdjustmentReason2Code.PendingConversionOfFunds}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code PendingConversionOfFunds = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.PendingConversionOfFunds);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.PendingConversionOfFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#RecapitalizationNotFunded
	 * DTCUnallocatedAdjustmentReason2Code.RecapitalizationNotFunded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code RecapitalizationNotFunded = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalizationNotFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.RecapitalizationNotFunded);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.RecapitalizationNotFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#RedemptionOfRatesNotYetFunded
	 * DTCUnallocatedAdjustmentReason2Code.RedemptionOfRatesNotYetFunded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code RedemptionOfRatesNotYetFunded = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionOfRatesNotYetFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.RedemptionOfRatesNotYetFunded);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.RedemptionOfRatesNotYetFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ReleasedPledgePosition
	 * DTCUnallocatedAdjustmentReason2Code.ReleasedPledgePosition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code ReleasedPledgePosition = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasedPledgePosition";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.ReleasedPledgePosition);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ReleasedPledgePosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SaleOfAssetsNotYetFunded
	 * DTCUnallocatedAdjustmentReason2Code.SaleOfAssetsNotYetFunded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code SaleOfAssetsNotYetFunded = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssetsNotYetFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.SaleOfAssetsNotYetFunded);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SaleOfAssetsNotYetFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SameDayPositionCapture
	 * DTCUnallocatedAdjustmentReason2Code.SameDayPositionCapture}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code SameDayPositionCapture = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayPositionCapture";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.SameDayPositionCapture);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SameDayPositionCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SpecialDistributionNotYetFunded
	 * DTCUnallocatedAdjustmentReason2Code.SpecialDistributionNotYetFunded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code SpecialDistributionNotYetFunded = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistributionNotYetFunded";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.SpecialDistributionNotYetFunded);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SpecialDistributionNotYetFunded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#SpecificIssuesSuppressed
	 * DTCUnallocatedAdjustmentReason2Code.SpecificIssuesSuppressed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code SpecificIssuesSuppressed = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificIssuesSuppressed";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.SpecificIssuesSuppressed);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.SpecificIssuesSuppressed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#ApproximateRate
	 * DTCUnallocatedAdjustmentReason2Code.ApproximateRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code ApproximateRate = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.ApproximateRate);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.ApproximateRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
	 * DTCUnallocatedAdjustmentReason1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#GracePeriod
	 * DTCUnallocatedAdjustmentReason2Code.GracePeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCUnallocatedAdjustmentReason1Code GracePeriod = new DTCUnallocatedAdjustmentReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.GracePeriod);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmObject();
			codeName = DTCUnallocatedAdjustmentReasonCode.GracePeriod.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCUnallocatedAdjustmentReason1Code> codesByName = new LinkedHashMap<>();

	protected DTCUnallocatedAdjustmentReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCUnallocatedAdjustmentReason1Code";
				definition = "DTC Unallocated reason codes for payment adjustments.";
				nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason2Code.mmObject());
				trace_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.BadAnnouncement, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.BadPayableDate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.CashRateUnknown, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.CashRateZero,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.ConditionalPayment, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.Default,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.HolidayInCountryOfOrigin, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.InsufficientFundsReceivedFromAgent,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.IssueNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.IssueNotMaturing,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.AfterCycleCutOff, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.ItemIsPending,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.FundsNotReceivedByAgent, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.Liquidation,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.NotionalBalance, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.Other,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.PaidUponReceiptOfCheck, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.PendingConversionOfFunds,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.RecapitalizationNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.RedemptionOfRatesNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.ReleasedPledgePosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.SaleOfAssetsNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.SameDayPositionCapture, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.SpecialDistributionNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.SpecificIssuesSuppressed, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.ApproximateRate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.GracePeriod);
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
	}

	public static DTCUnallocatedAdjustmentReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCUnallocatedAdjustmentReason1Code[] values() {
		DTCUnallocatedAdjustmentReason1Code[] values = new DTCUnallocatedAdjustmentReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCUnallocatedAdjustmentReason1Code> {
		@Override
		public DTCUnallocatedAdjustmentReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCUnallocatedAdjustmentReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}