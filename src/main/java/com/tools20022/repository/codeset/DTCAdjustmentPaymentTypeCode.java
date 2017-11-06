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
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmStockLoanPayment
 * DTCAdjustmentPaymentTypeCode.mmStockLoanPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmRepoPayment
 * DTCAdjustmentPaymentTypeCode.mmRepoPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmFailPayment
 * DTCAdjustmentPaymentTypeCode.mmFailPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmMiscellaneousPayment
 * DTCAdjustmentPaymentTypeCode.mmMiscellaneousPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmCashInLieu
 * DTCAdjustmentPaymentTypeCode.mmCashInLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmReorganisationDepositPhaseOne
 * DTCAdjustmentPaymentTypeCode.mmReorganisationDepositPhaseOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmDynamicRateChange
 * DTCAdjustmentPaymentTypeCode.mmDynamicRateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmMandatoryReorganizationDeposit
 * DTCAdjustmentPaymentTypeCode.mmMandatoryReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmMandatoryLegalReorgDeposit
 * DTCAdjustmentPaymentTypeCode.mmMandatoryLegalReorgDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmReorgDepositPhaseTwo
 * DTCAdjustmentPaymentTypeCode.mmReorgDepositPhaseTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmClaimSettlement
 * DTCAdjustmentPaymentTypeCode.mmClaimSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmCustodyReorganizationDeposit
 * DTCAdjustmentPaymentTypeCode.mmCustodyReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmReversal
 * DTCAdjustmentPaymentTypeCode.mmReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmCustodyDividendPayment
 * DTCAdjustmentPaymentTypeCode.mmCustodyDividendPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmADRIssueFeeReversal
 * DTCAdjustmentPaymentTypeCode.mmADRIssueFeeReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmADRIssueFeeCharge
 * DTCAdjustmentPaymentTypeCode.mmADRIssueFeeCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmOther
 * DTCAdjustmentPaymentTypeCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmWarrantRateChange
 * DTCAdjustmentPaymentTypeCode.mmWarrantRateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmTenderOfferFraction
 * DTCAdjustmentPaymentTypeCode.mmTenderOfferFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmRightsStepUp
 * DTCAdjustmentPaymentTypeCode.mmRightsStepUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmRightsSales
 * DTCAdjustmentPaymentTypeCode.mmRightsSales}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmLastDayProtect
 * DTCAdjustmentPaymentTypeCode.mmLastDayProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmRightsProtect
 * DTCAdjustmentPaymentTypeCode.mmRightsProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmRightsSubscription
 * DTCAdjustmentPaymentTypeCode.mmRightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmAdjustedForRightsSubscription
 * DTCAdjustmentPaymentTypeCode.mmAdjustedForRightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmMandatoryOverThreeYearReorganizationDeposit
 * DTCAdjustmentPaymentTypeCode.mmMandatoryOverThreeYearReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmLegalReorganizationDeposits
 * DTCAdjustmentPaymentTypeCode.mmLegalReorganizationDeposits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmManualUserTax
 * DTCAdjustmentPaymentTypeCode.mmManualUserTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmRateChangeTaxWithholding
 * DTCAdjustmentPaymentTypeCode.mmRateChangeTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmReversalOfTaxWithholding
 * DTCAdjustmentPaymentTypeCode.mmReversalOfTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmOriginalInitialTaxWithholding
 * DTCAdjustmentPaymentTypeCode.mmOriginalInitialTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmOriginalLateTaxWithholding
 * DTCAdjustmentPaymentTypeCode.mmOriginalLateTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmTaxInstructionChange
 * DTCAdjustmentPaymentTypeCode.mmTaxInstructionChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmFailTrackingTaxWithholding
 * DTCAdjustmentPaymentTypeCode.mmFailTrackingTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmReclassificationTaxWithholding
 * DTCAdjustmentPaymentTypeCode.mmReclassificationTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmWarrantParticipantDelete
 * DTCAdjustmentPaymentTypeCode.mmWarrantParticipantDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode#mmIntraDayReversalOfOriginalTaxWithholding
 * DTCAdjustmentPaymentTypeCode.mmIntraDayReversalOfOriginalTaxWithholding}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	public static final MMCode mmStockLoanPayment = new MMCode() {
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
	public static final MMCode mmRepoPayment = new MMCode() {
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
	public static final MMCode mmFailPayment = new MMCode() {
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
	public static final MMCode mmMiscellaneousPayment = new MMCode() {
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
	public static final MMCode mmCashInLieu = new MMCode() {
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
	public static final MMCode mmReorganisationDepositPhaseOne = new MMCode() {
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
	public static final MMCode mmDynamicRateChange = new MMCode() {
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
	public static final MMCode mmMandatoryReorganizationDeposit = new MMCode() {
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
	public static final MMCode mmMandatoryLegalReorgDeposit = new MMCode() {
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
	public static final MMCode mmReorgDepositPhaseTwo = new MMCode() {
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
	public static final MMCode mmClaimSettlement = new MMCode() {
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
	public static final MMCode mmCustodyReorganizationDeposit = new MMCode() {
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
	public static final MMCode mmReversal = new MMCode() {
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
	public static final MMCode mmCustodyDividendPayment = new MMCode() {
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
	public static final MMCode mmADRIssueFeeReversal = new MMCode() {
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
	public static final MMCode mmADRIssueFeeCharge = new MMCode() {
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
	public static final MMCode mmOther = new MMCode() {
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
	public static final MMCode mmWarrantRateChange = new MMCode() {
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
	public static final MMCode mmTenderOfferFraction = new MMCode() {
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
	public static final MMCode mmRightsStepUp = new MMCode() {
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
	public static final MMCode mmRightsSales = new MMCode() {
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
	public static final MMCode mmLastDayProtect = new MMCode() {
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
	public static final MMCode mmRightsProtect = new MMCode() {
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
	public static final MMCode mmRightsSubscription = new MMCode() {
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
	public static final MMCode mmAdjustedForRightsSubscription = new MMCode() {
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
	public static final MMCode mmMandatoryOverThreeYearReorganizationDeposit = new MMCode() {
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
	public static final MMCode mmLegalReorganizationDeposits = new MMCode() {
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
	public static final MMCode mmManualUserTax = new MMCode() {
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
	public static final MMCode mmRateChangeTaxWithholding = new MMCode() {
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
	public static final MMCode mmReversalOfTaxWithholding = new MMCode() {
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
	public static final MMCode mmOriginalInitialTaxWithholding = new MMCode() {
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
	public static final MMCode mmOriginalLateTaxWithholding = new MMCode() {
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
	public static final MMCode mmTaxInstructionChange = new MMCode() {
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
	public static final MMCode mmFailTrackingTaxWithholding = new MMCode() {
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
	public static final MMCode mmReclassificationTaxWithholding = new MMCode() {
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
	public static final MMCode mmWarrantParticipantDelete = new MMCode() {
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
	public static final MMCode mmIntraDayReversalOfOriginalTaxWithholding = new MMCode() {
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("STOK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentTypeCode";
				definition = "Specifies the type of the payment adjustment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmStockLoanPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmRepoPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmFailPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmMiscellaneousPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmCashInLieu, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmReorganisationDepositPhaseOne,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmDynamicRateChange, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmMandatoryReorganizationDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmMandatoryLegalReorgDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmReorgDepositPhaseTwo,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmClaimSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmCustodyReorganizationDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmReversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmCustodyDividendPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmADRIssueFeeReversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmADRIssueFeeCharge,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmOther, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmWarrantRateChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmTenderOfferFraction, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmRightsStepUp,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmRightsSales, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmLastDayProtect,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmRightsProtect, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmRightsSubscription,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmAdjustedForRightsSubscription, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmMandatoryOverThreeYearReorganizationDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmLegalReorganizationDeposits, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmManualUserTax,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmRateChangeTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmReversalOfTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmOriginalInitialTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmOriginalLateTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmTaxInstructionChange, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmFailTrackingTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmReclassificationTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmWarrantParticipantDelete,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode.mmIntraDayReversalOfOriginalTaxWithholding);
				derivation_lazy = () -> Arrays.asList(DTCAdjustmentPaymentType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}