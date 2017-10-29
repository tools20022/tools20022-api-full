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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of the payment adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#StockLoanPayment
 * DTCAdjustmentPaymentTypeCode.StockLoanPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#RepoPayment
 * DTCAdjustmentPaymentTypeCode.RepoPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#FailPayment
 * DTCAdjustmentPaymentTypeCode.FailPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#MiscellaneousPayment
 * DTCAdjustmentPaymentTypeCode.MiscellaneousPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#CashInLieu
 * DTCAdjustmentPaymentTypeCode.CashInLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#ReorganisationDepositPhaseOne
 * DTCAdjustmentPaymentTypeCode.ReorganisationDepositPhaseOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#DynamicRateChange
 * DTCAdjustmentPaymentTypeCode.DynamicRateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#MandatoryReorganizationDeposit
 * DTCAdjustmentPaymentTypeCode.MandatoryReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#MandatoryLegalReorgDeposit
 * DTCAdjustmentPaymentTypeCode.MandatoryLegalReorgDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#ReorgDepositPhaseTwo
 * DTCAdjustmentPaymentTypeCode.ReorgDepositPhaseTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#ClaimSettlement
 * DTCAdjustmentPaymentTypeCode.ClaimSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#CustodyReorganizationDeposit
 * DTCAdjustmentPaymentTypeCode.CustodyReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#Reversal
 * DTCAdjustmentPaymentTypeCode.Reversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#CustodyDividendPayment
 * DTCAdjustmentPaymentTypeCode.CustodyDividendPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#ADRIssueFeeReversal
 * DTCAdjustmentPaymentTypeCode.ADRIssueFeeReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#ADRIssueFeeCharge
 * DTCAdjustmentPaymentTypeCode.ADRIssueFeeCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#Other
 * DTCAdjustmentPaymentTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#WarrantRateChange
 * DTCAdjustmentPaymentTypeCode.WarrantRateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#TenderOfferFraction
 * DTCAdjustmentPaymentTypeCode.TenderOfferFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#RightsStepUp
 * DTCAdjustmentPaymentTypeCode.RightsStepUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#RightsSales
 * DTCAdjustmentPaymentTypeCode.RightsSales}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#LastDayProtect
 * DTCAdjustmentPaymentTypeCode.LastDayProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#RightsProtect
 * DTCAdjustmentPaymentTypeCode.RightsProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#RightsSubscription
 * DTCAdjustmentPaymentTypeCode.RightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#AdjustedForRightsSubscription
 * DTCAdjustmentPaymentTypeCode.AdjustedForRightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#MandatoryOverThreeYearReorganizationDeposit
 * DTCAdjustmentPaymentTypeCode.MandatoryOverThreeYearReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#LegalReorganizationDeposits
 * DTCAdjustmentPaymentTypeCode.LegalReorganizationDeposits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#ManualUserTax
 * DTCAdjustmentPaymentTypeCode.ManualUserTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#RateChangeTaxWithholding
 * DTCAdjustmentPaymentTypeCode.RateChangeTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#ReversalOfTaxWithholding
 * DTCAdjustmentPaymentTypeCode.ReversalOfTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#OriginalInitialTaxWithholding
 * DTCAdjustmentPaymentTypeCode.OriginalInitialTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#OriginalLateTaxWithholding
 * DTCAdjustmentPaymentTypeCode.OriginalLateTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#TaxInstructionChange
 * DTCAdjustmentPaymentTypeCode.TaxInstructionChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#FailTrackingTaxWithholding
 * DTCAdjustmentPaymentTypeCode.FailTrackingTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#ReclassificationTaxWithholding
 * DTCAdjustmentPaymentTypeCode.ReclassificationTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#WarrantParticipantDelete
 * DTCAdjustmentPaymentTypeCode.WarrantParticipantDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#IntraDayReversalOfOriginalTaxWithholding
 * DTCAdjustmentPaymentTypeCode.IntraDayReversalOfOriginalTaxWithholding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code
 * DTCAdjustmentPaymentType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"STOK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAdjustmentPaymentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the payment adjustment."</li>
 * </ul>
 */
public class DTCAdjustmentPaymentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Stock loan transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stock loan transaction."</li>
	 * </ul>
	 */
	public static final MMCode StockLoanPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanPayment";
			definition = "Stock loan transaction.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "STOK";
		}
	};
	/**
	 * REPO (repurchase agreement) transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "REPO (repurchase agreement) transaction."</li>
	 * </ul>
	 */
	public static final MMCode RepoPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoPayment";
			definition = "REPO (repurchase agreement) transaction.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * FAIL (undelivered securities) transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "FAIL (undelivered securities) transaction."</li>
	 * </ul>
	 */
	public static final MMCode FailPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailPayment";
			definition = "FAIL (undelivered securities) transaction.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Miscellaneous (adjustment) transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Miscellaneous (adjustment) transaction."</li>
	 * </ul>
	 */
	public static final MMCode MiscellaneousPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousPayment";
			definition = "Miscellaneous (adjustment) transaction.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "MISC";
		}
	};
	/**
	 * Cash in lieu related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash in lieu related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode CashInLieu = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieu";
			definition = "Cash in lieu related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RCIL";
		}
	};
	/**
	 * Participant deposited a security within 10 days after a corporate action
	 * event has occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRD1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganisationDepositPhaseOne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participant deposited a security within 10 days after a corporate action event has occurred. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode ReorganisationDepositPhaseOne = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationDepositPhaseOne";
			definition = "Participant deposited a security within 10 days after a corporate action event has occurred. ";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRD1";
		}
	};
	/**
	 * Dynamic rate change related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DynamicRateChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dynamic rate change  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode DynamicRateChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DynamicRateChange";
			definition = "Dynamic rate change  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRDR";
		}
	};
	/**
	 * Mandatory reorganization deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryReorganizationDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandatory reorganization deposit  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode MandatoryReorganizationDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryReorganizationDeposit";
			definition = "Mandatory reorganization deposit  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRMD";
		}
	};
	/**
	 * Mandatory legal reorganization deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryLegalReorgDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandatory legal reorganization deposit related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode MandatoryLegalReorgDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryLegalReorgDeposit";
			definition = "Mandatory legal reorganization deposit related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRLR";
		}
	};
	/**
	 * Participant deposited a security 10 days after a corporate action event
	 * has occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRD2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorgDepositPhaseTwo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participant deposited a security 10 days after a corporate action event has occurred. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode ReorgDepositPhaseTwo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorgDepositPhaseTwo";
			definition = "Participant deposited a security 10 days after a corporate action event has occurred. ";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRD2";
		}
	};
	/**
	 * Claim settlement related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Claim settlement  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode ClaimSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimSettlement";
			definition = "Claim settlement  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRCL";
		}
	};
	/**
	 * Custody reorganization deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyReorganizationDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custody reorganization deposit  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode CustodyReorganizationDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyReorganizationDeposit";
			definition = "Custody reorganization deposit  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRCD";
		}
	};
	/**
	 * Reversal related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reversal  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode Reversal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			definition = "Reversal  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "REVA";
		}
	};
	/**
	 * Dividend payment on a DTC custody held security related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyDividendPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend payment on a DTC custody held security related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode CustodyDividendPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyDividendPayment";
			definition = "Dividend payment on a DTC custody held security related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RCDP";
		}
	};
	/**
	 * ADR issue fee reversal adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADRIssueFeeReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ADR issue fee reversal adjustment."</li>
	 * </ul>
	 */
	public static final MMCode ADRIssueFeeReversal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADRIssueFeeReversal";
			definition = "ADR issue fee reversal adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RADR";
		}
	};
	/**
	 * American Depository R issue fee charge adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RADC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADRIssueFeeCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "American Depository R issue fee charge adjustment."</li>
	 * </ul>
	 */
	public static final MMCode ADRIssueFeeCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADRIssueFeeCharge";
			definition = "American Depository R issue fee charge adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RADC";
		}
	};
	/**
	 * Reserved for new user defined reason codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
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
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Reserved for new user defined reason codes.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Warrant rate change related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRWC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantRateChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warrant rate change  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode WarrantRateChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantRateChange";
			definition = "Warrant rate change  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRWC";
		}
	};
	/**
	 * Tender offer fraction related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRT2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderOfferFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tender offer fraction  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode TenderOfferFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderOfferFraction";
			definition = "Tender offer fraction  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRT2";
		}
	};
	/**
	 * Rights step up related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRRU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsStepUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rights step up  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode RightsStepUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsStepUp";
			definition = "Rights step up  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRRU";
		}
	};
	/**
	 * Rights sales related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsSales"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rights sales  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode RightsSales = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsSales";
			definition = "Rights sales  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRRS";
		}
	};
	/**
	 * Last day protect related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRRL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastDayProtect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last day protect related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode LastDayProtect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastDayProtect";
			definition = "Last day protect related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRRL";
		}
	};
	/**
	 * Rights protect related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsProtect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rights protect related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode RightsProtect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsProtect";
			definition = "Rights protect related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRRI";
		}
	};
	/**
	 * Rights subscription related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rights subscription related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode RightsSubscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsSubscription";
			definition = "Rights subscription related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRRE";
		}
	};
	/**
	 * Adjusted for rights subscription related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedForRightsSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjusted for rights subscription related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode AdjustedForRightsSubscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedForRightsSubscription";
			definition = "Adjusted for rights subscription related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRRA";
		}
	};
	/**
	 * Mandatory over three year reorganization deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRR3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryOverThreeYearReorganizationDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandatory over three year reorganization deposit related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode MandatoryOverThreeYearReorganizationDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryOverThreeYearReorganizationDeposit";
			definition = "Mandatory over three year reorganization deposit related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRR3";
		}
	};
	/**
	 * Legal reorganization deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRML"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalReorganizationDeposits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal reorganization deposit related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode LegalReorganizationDeposits = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalReorganizationDeposits";
			definition = "Legal reorganization deposit related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRML";
		}
	};
	/**
	 * Manual user tax adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TJXU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualUserTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Manual user tax adjustment."</li>
	 * </ul>
	 */
	public static final MMCode ManualUserTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualUserTax";
			definition = "Manual user tax adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "TJXU";
		}
	};
	/**
	 * Rate change tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TJXT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChangeTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate change tax withholding  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode RateChangeTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeTaxWithholding";
			definition = "Rate change tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "TJXT";
		}
	};
	/**
	 * Reversal of tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TJXR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reversal of tax withholding  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode ReversalOfTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfTaxWithholding";
			definition = "Reversal of tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "TJXR";
		}
	};
	/**
	 * Original (initial) tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TJXO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInitialTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original (initial) tax withholding  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode OriginalInitialTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInitialTaxWithholding";
			definition = "Original (initial) tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "TJXO";
		}
	};
	/**
	 * Original late tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TJXL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalLateTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original late tax withholding  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode OriginalLateTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalLateTaxWithholding";
			definition = "Original late tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "TJXL";
		}
	};
	/**
	 * Tax instruction change related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TJXI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxInstructionChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax instruction change  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode TaxInstructionChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxInstructionChange";
			definition = "Tax instruction change  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "TJXI";
		}
	};
	/**
	 * Fail tracking tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TJXF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailTrackingTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fail tracking tax withholding  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode FailTrackingTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailTrackingTaxWithholding";
			definition = "Fail tracking tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "TJXF";
		}
	};
	/**
	 * Reclassification tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TJXD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReclassificationTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reclassification tax withholding  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode ReclassificationTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReclassificationTaxWithholding";
			definition = "Reclassification tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "TJXD";
		}
	};
	/**
	 * Warrant Participant delete related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRWT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantParticipantDelete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warrant Participant delete related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode WarrantParticipantDelete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantParticipantDelete";
			definition = "Warrant Participant delete related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "RRWT";
		}
	};
	/**
	 * Intra-day reversal of original tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
	 * DTCAdjustmentPaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TJXV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDayReversalOfOriginalTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Intra-day reversal of original tax withholding  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode IntraDayReversalOfOriginalTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraDayReversalOfOriginalTaxWithholding";
			definition = "Intra-day reversal of original tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
			codeName = "TJXV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("STOK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentTypeCode";
				definition = "Specifies the type of the payment adjustment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.StockLoanPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.RepoPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.FailPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.MiscellaneousPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.CashInLieu, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.ReorganisationDepositPhaseOne,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.DynamicRateChange, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.MandatoryReorganizationDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.MandatoryLegalReorgDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.ReorgDepositPhaseTwo,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.ClaimSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.CustodyReorganizationDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.Reversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.CustodyDividendPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.ADRIssueFeeReversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.ADRIssueFeeCharge,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.Other, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.WarrantRateChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.TenderOfferFraction, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.RightsStepUp,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.RightsSales, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.LastDayProtect,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.RightsProtect, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.RightsSubscription,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.AdjustedForRightsSubscription, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.MandatoryOverThreeYearReorganizationDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.LegalReorganizationDeposits, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.ManualUserTax,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.RateChangeTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.ReversalOfTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.OriginalInitialTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.OriginalLateTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.TaxInstructionChange, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.FailTrackingTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.ReclassificationTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.WarrantParticipantDelete,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.IntraDayReversalOfOriginalTaxWithholding);
				derivation_lazy = () -> Arrays.asList(DTCAdjustmentPaymentType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}