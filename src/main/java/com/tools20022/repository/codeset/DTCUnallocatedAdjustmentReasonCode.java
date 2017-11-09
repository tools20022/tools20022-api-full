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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * DTC Unallocated reason codes for payment adjustments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmGracePeriod
 * DTCUnallocatedAdjustmentReasonCode.mmGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmApproximateRate
 * DTCUnallocatedAdjustmentReasonCode.mmApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmBadAnnouncement
 * DTCUnallocatedAdjustmentReasonCode.mmBadAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmBadPayableDate
 * DTCUnallocatedAdjustmentReasonCode.mmBadPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmCashRateUnknown
 * DTCUnallocatedAdjustmentReasonCode.mmCashRateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmCashRateZero
 * DTCUnallocatedAdjustmentReasonCode.mmCashRateZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmConditionalPayment
 * DTCUnallocatedAdjustmentReasonCode.mmConditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmDefault
 * DTCUnallocatedAdjustmentReasonCode.mmDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmFundsNotReceivedByAgent
 * DTCUnallocatedAdjustmentReasonCode.mmFundsNotReceivedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmHolidayInCountryOfOrigin
 * DTCUnallocatedAdjustmentReasonCode.mmHolidayInCountryOfOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmInsufficientFundsReceivedFromAgent
 * DTCUnallocatedAdjustmentReasonCode.mmInsufficientFundsReceivedFromAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmIssueNotFunded
 * DTCUnallocatedAdjustmentReasonCode.mmIssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmIssueNotMaturing
 * DTCUnallocatedAdjustmentReasonCode.mmIssueNotMaturing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmAfterCycleCutOff
 * DTCUnallocatedAdjustmentReasonCode.mmAfterCycleCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmItemIsPending
 * DTCUnallocatedAdjustmentReasonCode.mmItemIsPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmLiquidation
 * DTCUnallocatedAdjustmentReasonCode.mmLiquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmNotionalBalance
 * DTCUnallocatedAdjustmentReasonCode.mmNotionalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmOther
 * DTCUnallocatedAdjustmentReasonCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmPaidUponReceiptOfCheck
 * DTCUnallocatedAdjustmentReasonCode.mmPaidUponReceiptOfCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmPendingConversionOfFunds
 * DTCUnallocatedAdjustmentReasonCode.mmPendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmRecapitalizationNotFunded
 * DTCUnallocatedAdjustmentReasonCode.mmRecapitalizationNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmRedemptionOfRatesNotYetFunded
 * DTCUnallocatedAdjustmentReasonCode.mmRedemptionOfRatesNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmReleasedPledgePosition
 * DTCUnallocatedAdjustmentReasonCode.mmReleasedPledgePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmSaleOfAssetsNotYetFunded
 * DTCUnallocatedAdjustmentReasonCode.mmSaleOfAssetsNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmSameDayPositionCapture
 * DTCUnallocatedAdjustmentReasonCode.mmSameDayPositionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmSpecialDistributionNotYetFunded
 * DTCUnallocatedAdjustmentReasonCode.mmSpecialDistributionNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmSpecificIssuesSuppressed
 * DTCUnallocatedAdjustmentReasonCode.mmSpecificIssuesSuppressed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmCallRescinded
 * DTCUnallocatedAdjustmentReasonCode.mmCallRescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmCDAcceleratedMaturity
 * DTCUnallocatedAdjustmentReasonCode.mmCDAcceleratedMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmCHIPSPayment
 * DTCUnallocatedAdjustmentReasonCode.mmCHIPSPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmFiveDayGracePeriod
 * DTCUnallocatedAdjustmentReasonCode.mmFiveDayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmFDIC
 * DTCUnallocatedAdjustmentReasonCode.mmFDIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmPledgedPosition
 * DTCUnallocatedAdjustmentReasonCode.mmPledgedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmMaturityForStockPaymentOption
 * DTCUnallocatedAdjustmentReasonCode.mmMaturityForStockPaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmChurchBondNotFunded
 * DTCUnallocatedAdjustmentReasonCode.mmChurchBondNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmFundsHeldAtChaseForOFAC
 * DTCUnallocatedAdjustmentReasonCode.mmFundsHeldAtChaseForOFAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode#mmCanadianDepositoryInventory
 * DTCUnallocatedAdjustmentReasonCode.mmCanadianDepositoryInventory}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCUnallocatedAdjustmentReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "DTC Unallocated reason codes for payment adjustments."</li>
 * </ul>
 */
public class DTCUnallocatedAdjustmentReasonCode {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Company is taking a 30 day grace period."</li>
	 * </ul>
	 */
	public static final MMCode mmGracePeriod = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			definition = "Company is taking a 30 day grace period.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproximateRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate is not final. Rate is approximate."</li>
	 * </ul>
	 */
	public static final MMCode mmApproximateRate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			definition = "Rate is not final. Rate is approximate.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadAnnouncement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incorrect announcement."</li>
	 * </ul>
	 */
	public static final MMCode mmBadAnnouncement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadAnnouncement";
			definition = "Incorrect announcement.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadPayableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incorrect payable date."</li>
	 * </ul>
	 */
	public static final MMCode mmBadPayableDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadPayableDate";
			definition = "Incorrect payable date.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash rate for allocation is zero."</li>
	 * </ul>
	 */
	public static final MMCode mmCashRateUnknown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateUnknown";
			definition = "Cash rate for allocation is zero.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateZero"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash rate for allocation is zero."</li>
	 * </ul>
	 */
	public static final MMCode mmCashRateZero = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateZero";
			definition = "Cash rate for allocation is zero.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is conditional and conditions have not been met yet."</li>
	 * </ul>
	 */
	public static final MMCode mmConditionalPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPayment";
			definition = "Payment is conditional and conditions have not been met yet.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue is in default."</li>
	 * </ul>
	 */
	public static final MMCode mmDefault = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			definition = "Issue is in default.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsNotReceivedByAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds were not received by the agent."</li>
	 * </ul>
	 */
	public static final MMCode mmFundsNotReceivedByAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceivedByAgent";
			definition = "Funds were not received by the agent.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HolidayInCountryOfOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holiday  in country of origin."</li>
	 * </ul>
	 */
	public static final MMCode mmHolidayInCountryOfOrigin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryOfOrigin";
			definition = "Holiday  in country of origin.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFundsReceivedFromAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient funds  were received from the agent."</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientFundsReceivedFromAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFundsReceivedFromAgent";
			definition = "Insufficient funds  were received from the agent.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue was not funded."</li>
	 * </ul>
	 */
	public static final MMCode mmIssueNotFunded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			definition = "Issue was not funded.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotMaturing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue is not maturing."</li>
	 * </ul>
	 */
	public static final MMCode mmIssueNotMaturing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotMaturing";
			definition = "Issue is not maturing.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterCycleCutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issues funded and/or identified after the cycle cut off."</li>
	 * </ul>
	 */
	public static final MMCode mmAfterCycleCutOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterCycleCutOff";
			definition = "Issues funded and/or identified after the cycle cut off.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIsPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Item is pending."</li>
	 * </ul>
	 */
	public static final MMCode mmItemIsPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIsPending";
			definition = "Item is pending.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue is being liquidated."</li>
	 * </ul>
	 */
	public static final MMCode mmLiquidation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			definition = "Issue is being liquidated.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notional balance pincipal will not be paid."</li>
	 * </ul>
	 */
	public static final MMCode mmNotionalBalance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalBalance";
			definition = "Notional balance pincipal will not be paid.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reserved for new user defined reason codes."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Reserved for new user defined reason codes.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaidUponReceiptOfCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Paid upon receipt of check."</li>
	 * </ul>
	 */
	public static final MMCode mmPaidUponReceiptOfCheck = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponReceiptOfCheck";
			definition = "Paid upon receipt of check.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConversionOfFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pending conversion of funds. "</li>
	 * </ul>
	 */
	public static final MMCode mmPendingConversionOfFunds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			definition = "Pending conversion of funds. ";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecapitalizationNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Recapitalization. Issue not funded."</li>
	 * </ul>
	 */
	public static final MMCode mmRecapitalizationNotFunded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalizationNotFunded";
			definition = "Recapitalization. Issue not funded.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionOfRatesNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption of rates. Issue not funded."</li>
	 * </ul>
	 */
	public static final MMCode mmRedemptionOfRatesNotYetFunded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionOfRatesNotYetFunded";
			definition = "Redemption of rates. Issue not funded.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReleasedPledgePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Released pledge position."</li>
	 * </ul>
	 */
	public static final MMCode mmReleasedPledgePosition = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasedPledgePosition";
			definition = "Released pledge position.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssetsNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sale of asset. Issue not funded."</li>
	 * </ul>
	 */
	public static final MMCode mmSaleOfAssetsNotYetFunded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssetsNotYetFunded";
			definition = "Sale of asset. Issue not funded.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayPositionCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Same day position capture."</li>
	 * </ul>
	 */
	public static final MMCode mmSameDayPositionCapture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayPositionCapture";
			definition = "Same day position capture.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDistributionNotYetFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Special distribution. Issue not funded."</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialDistributionNotYetFunded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistributionNotYetFunded";
			definition = "Special distribution. Issue not funded.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificIssuesSuppressed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific issues have been suppressed."</li>
	 * </ul>
	 */
	public static final MMCode mmSpecificIssuesSuppressed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificIssuesSuppressed";
			definition = "Specific issues have been suppressed.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "PUVF";
		}
	};
	/**
	 * Call Rescinded
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallRescinded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Call Rescinded"</li>
	 * </ul>
	 */
	public static final MMCode mmCallRescinded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallRescinded";
			definition = "Call Rescinded";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "RESC";
		}
	};
	/**
	 * CD Accelerated Maturity
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERLY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDAcceleratedMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CD Accelerated Maturity"</li>
	 * </ul>
	 */
	public static final MMCode mmCDAcceleratedMaturity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDAcceleratedMaturity";
			definition = "CD Accelerated Maturity";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CHIPS Payment."</li>
	 * </ul>
	 */
	public static final MMCode mmCHIPSPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSPayment";
			definition = "CHIPS Payment.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "CHIP";
		}
	};
	/**
	 * Five Day Grace Period
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FVDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveDayGracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Five Day Grace Period"</li>
	 * </ul>
	 */
	public static final MMCode mmFiveDayGracePeriod = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayGracePeriod";
			definition = "Five Day Grace Period";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FDIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Failed Bank, FDIC Assumed."</li>
	 * </ul>
	 */
	public static final MMCode mmFDIC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FDIC";
			definition = "Failed Bank, FDIC Assumed.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "FDIC";
		}
	};
	/**
	 * Pledged Position
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
	 * DTCUnallocatedAdjustmentReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLEG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pledged Position"</li>
	 * </ul>
	 */
	public static final MMCode mmPledgedPosition = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedPosition";
			definition = "Pledged Position";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityForStockPaymentOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maturity for stock payment option."</li>
	 * </ul>
	 */
	public static final MMCode mmMaturityForStockPaymentOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityForStockPaymentOption";
			definition = "Maturity for stock payment option.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChurchBondNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Church bond not funded."</li>
	 * </ul>
	 */
	public static final MMCode mmChurchBondNotFunded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChurchBondNotFunded";
			definition = "Church bond not funded.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsHeldAtChaseForOFAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds held at Chase for OFAC."</li>
	 * </ul>
	 */
	public static final MMCode mmFundsHeldAtChaseForOFAC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsHeldAtChaseForOFAC";
			definition = "Funds held at Chase for OFAC.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianDepositoryInventory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Canadian depository inventory."</li>
	 * </ul>
	 */
	public static final MMCode mmCanadianDepositoryInventory = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianDepositoryInventory";
			definition = "Canadian depository inventory.";
			owner_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
			codeName = "CDIN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCUnallocatedAdjustmentReasonCode";
				definition = "DTC Unallocated reason codes for payment adjustments.";
				code_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReasonCode.mmGracePeriod, DTCUnallocatedAdjustmentReasonCode.mmApproximateRate, DTCUnallocatedAdjustmentReasonCode.mmBadAnnouncement,
						DTCUnallocatedAdjustmentReasonCode.mmBadPayableDate, DTCUnallocatedAdjustmentReasonCode.mmCashRateUnknown, DTCUnallocatedAdjustmentReasonCode.mmCashRateZero, DTCUnallocatedAdjustmentReasonCode.mmConditionalPayment,
						DTCUnallocatedAdjustmentReasonCode.mmDefault, DTCUnallocatedAdjustmentReasonCode.mmFundsNotReceivedByAgent, DTCUnallocatedAdjustmentReasonCode.mmHolidayInCountryOfOrigin,
						DTCUnallocatedAdjustmentReasonCode.mmInsufficientFundsReceivedFromAgent, DTCUnallocatedAdjustmentReasonCode.mmIssueNotFunded, DTCUnallocatedAdjustmentReasonCode.mmIssueNotMaturing,
						DTCUnallocatedAdjustmentReasonCode.mmAfterCycleCutOff, DTCUnallocatedAdjustmentReasonCode.mmItemIsPending, DTCUnallocatedAdjustmentReasonCode.mmLiquidation, DTCUnallocatedAdjustmentReasonCode.mmNotionalBalance,
						DTCUnallocatedAdjustmentReasonCode.mmOther, DTCUnallocatedAdjustmentReasonCode.mmPaidUponReceiptOfCheck, DTCUnallocatedAdjustmentReasonCode.mmPendingConversionOfFunds,
						DTCUnallocatedAdjustmentReasonCode.mmRecapitalizationNotFunded, DTCUnallocatedAdjustmentReasonCode.mmRedemptionOfRatesNotYetFunded, DTCUnallocatedAdjustmentReasonCode.mmReleasedPledgePosition,
						DTCUnallocatedAdjustmentReasonCode.mmSaleOfAssetsNotYetFunded, DTCUnallocatedAdjustmentReasonCode.mmSameDayPositionCapture, DTCUnallocatedAdjustmentReasonCode.mmSpecialDistributionNotYetFunded,
						DTCUnallocatedAdjustmentReasonCode.mmSpecificIssuesSuppressed, DTCUnallocatedAdjustmentReasonCode.mmCallRescinded, DTCUnallocatedAdjustmentReasonCode.mmCDAcceleratedMaturity,
						DTCUnallocatedAdjustmentReasonCode.mmCHIPSPayment, DTCUnallocatedAdjustmentReasonCode.mmFiveDayGracePeriod, DTCUnallocatedAdjustmentReasonCode.mmFDIC, DTCUnallocatedAdjustmentReasonCode.mmPledgedPosition,
						DTCUnallocatedAdjustmentReasonCode.mmMaturityForStockPaymentOption, DTCUnallocatedAdjustmentReasonCode.mmChurchBondNotFunded, DTCUnallocatedAdjustmentReasonCode.mmFundsHeldAtChaseForOFAC,
						DTCUnallocatedAdjustmentReasonCode.mmCanadianDepositoryInventory);
				derivation_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason1Code.mmObject(), DTCUnallocatedAdjustmentReason2Code.mmObject(), DTCUnallocatedAdjustmentReason3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}