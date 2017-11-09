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
 * Specifies the type of the payment adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
 * DTCAdjustmentPaymentType2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
 * DTCAdjustmentPaymentType3Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmAdjustedForRightsSubscription
 * DTCAdjustmentPaymentTypeV2Code.mmAdjustedForRightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmADRIssueFeeCharge
 * DTCAdjustmentPaymentTypeV2Code.mmADRIssueFeeCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmADRIssueFeeReversal
 * DTCAdjustmentPaymentTypeV2Code.mmADRIssueFeeReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmCashInLieu
 * DTCAdjustmentPaymentTypeV2Code.mmCashInLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmClaimSettlement
 * DTCAdjustmentPaymentTypeV2Code.mmClaimSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmCustodyDividendPayment
 * DTCAdjustmentPaymentTypeV2Code.mmCustodyDividendPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmCustodyReorganizationDeposit
 * DTCAdjustmentPaymentTypeV2Code.mmCustodyReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmDynamicRateChange
 * DTCAdjustmentPaymentTypeV2Code.mmDynamicRateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmFailSettlement
 * DTCAdjustmentPaymentTypeV2Code.mmFailSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmFailTrackingTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.mmFailTrackingTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmIntraDayReversalOfOriginalTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.mmIntraDayReversalOfOriginalTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmLastDayProtect
 * DTCAdjustmentPaymentTypeV2Code.mmLastDayProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmLegalReorganizationDeposits
 * DTCAdjustmentPaymentTypeV2Code.mmLegalReorganizationDeposits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmMandatoryLegalReorgDeposit
 * DTCAdjustmentPaymentTypeV2Code.mmMandatoryLegalReorgDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmMandatoryOverThreeYearReorganizationDeposit
 * DTCAdjustmentPaymentTypeV2Code.mmMandatoryOverThreeYearReorganizationDeposit}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmMandatoryReorganizationDeposit
 * DTCAdjustmentPaymentTypeV2Code.mmMandatoryReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmManualUserTax
 * DTCAdjustmentPaymentTypeV2Code.mmManualUserTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmMiscellaneousSettlement
 * DTCAdjustmentPaymentTypeV2Code.mmMiscellaneousSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmOriginalInitialTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.mmOriginalInitialTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmOriginalLateTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.mmOriginalLateTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmOther
 * DTCAdjustmentPaymentTypeV2Code.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmRateChangeTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.mmRateChangeTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmReclassificationTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.mmReclassificationTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmReorganisationDepositPhaseOne
 * DTCAdjustmentPaymentTypeV2Code.mmReorganisationDepositPhaseOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmReorgDepositPhaseTwo
 * DTCAdjustmentPaymentTypeV2Code.mmReorgDepositPhaseTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmRepoSettlement
 * DTCAdjustmentPaymentTypeV2Code.mmRepoSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmReversal
 * DTCAdjustmentPaymentTypeV2Code.mmReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmReversalOfTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.mmReversalOfTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmRightsProtect
 * DTCAdjustmentPaymentTypeV2Code.mmRightsProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmRightsSales
 * DTCAdjustmentPaymentTypeV2Code.mmRightsSales}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmRightsStepUp
 * DTCAdjustmentPaymentTypeV2Code.mmRightsStepUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmRightsSubscription
 * DTCAdjustmentPaymentTypeV2Code.mmRightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmStockLoanSettlement
 * DTCAdjustmentPaymentTypeV2Code.mmStockLoanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmTaxInstructionChange
 * DTCAdjustmentPaymentTypeV2Code.mmTaxInstructionChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmTenderOfferFraction
 * DTCAdjustmentPaymentTypeV2Code.mmTenderOfferFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmWarrantParticipantDelete
 * DTCAdjustmentPaymentTypeV2Code.mmWarrantParticipantDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#mmWarrantRateChange
 * DTCAdjustmentPaymentTypeV2Code.mmWarrantRateChange}</li>
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
 * "DTCAdjustmentPaymentTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the payment adjustment."</li>
 * </ul>
 */
public class DTCAdjustmentPaymentTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Adjusted for rights subscription related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedForRightsSubscription";
			definition = "Adjusted for rights subscription related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRRA";
		}
	};
	/**
	 * American Depository R issue fee charge adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADRIssueFeeCharge";
			definition = "American Depository R issue fee charge adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RADC";
		}
	};
	/**
	 * ADR issue fee reversal adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADRIssueFeeReversal";
			definition = "ADR issue fee reversal adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RADR";
		}
	};
	/**
	 * Cash in lieu related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieu";
			definition = "Cash in lieu related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RCIL";
		}
	};
	/**
	 * Claim settlement related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimSettlement";
			definition = "Claim settlement  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRCL";
		}
	};
	/**
	 * Dividend payment on a DTC custody held security related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyDividendPayment";
			definition = "Dividend payment on a DTC custody held security related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RCDP";
		}
	};
	/**
	 * Custody reorganization deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyReorganizationDeposit";
			definition = "Custody reorganization deposit  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRCD";
		}
	};
	/**
	 * Dynamic rate change related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DynamicRateChange";
			definition = "Dynamic rate change  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRDR";
		}
	};
	/**
	 * FAIL (undelivered securities) transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "FAIL (undelivered securities) transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmFailSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailSettlement";
			definition = "FAIL (undelivered securities) transaction.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Fail tracking tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailTrackingTaxWithholding";
			definition = "Fail tracking tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "TJXF";
		}
	};
	/**
	 * Intra-day reversal of original tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraDayReversalOfOriginalTaxWithholding";
			definition = "Intra-day reversal of original tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "TJXV";
		}
	};
	/**
	 * Last day protect related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastDayProtect";
			definition = "Last day protect related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRRL";
		}
	};
	/**
	 * Legal reorganization deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalReorganizationDeposits";
			definition = "Legal reorganization deposit related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRML";
		}
	};
	/**
	 * Mandatory legal reorganization deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryLegalReorgDeposit";
			definition = "Mandatory legal reorganization deposit related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRLR";
		}
	};
	/**
	 * Mandatory over three year reorganization deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryOverThreeYearReorganizationDeposit";
			definition = "Mandatory over three year reorganization deposit related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRR3";
		}
	};
	/**
	 * Mandatory reorganization deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryReorganizationDeposit";
			definition = "Mandatory reorganization deposit  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRMD";
		}
	};
	/**
	 * Manual user tax adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualUserTax";
			definition = "Manual user tax adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "TJXU";
		}
	};
	/**
	 * Miscellaneous (adjustment) transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Miscellaneous (adjustment) transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmMiscellaneousSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousSettlement";
			definition = "Miscellaneous (adjustment) transaction.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "MISC";
		}
	};
	/**
	 * Original (initial) tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInitialTaxWithholding";
			definition = "Original (initial) tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "TJXO";
		}
	};
	/**
	 * Original late tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalLateTaxWithholding";
			definition = "Original late tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "TJXL";
		}
	};
	/**
	 * Reserved for new user defined reason codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Rate change tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeTaxWithholding";
			definition = "Rate change tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "TJXT";
		}
	};
	/**
	 * Reclassification tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReclassificationTaxWithholding";
			definition = "Reclassification tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "TJXD";
		}
	};
	/**
	 * Participant deposited a security within 10 days after a corporate action
	 * event has occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationDepositPhaseOne";
			definition = "Participant deposited a security within 10 days after a corporate action event has occurred. ";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRD1";
		}
	};
	/**
	 * Participant deposited a security 10 days after a corporate action event
	 * has occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorgDepositPhaseTwo";
			definition = "Participant deposited a security 10 days after a corporate action event has occurred. ";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRD2";
		}
	};
	/**
	 * REPO (repurchase agreement) transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "REPO (repurchase agreement) transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmRepoSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoSettlement";
			definition = "REPO (repurchase agreement) transaction.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Reversal related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			definition = "Reversal  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "REVA";
		}
	};
	/**
	 * Reversal of tax withholding related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfTaxWithholding";
			definition = "Reversal of tax withholding  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "TJXR";
		}
	};
	/**
	 * Rights protect related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsProtect";
			definition = "Rights protect related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRRI";
		}
	};
	/**
	 * Rights sales related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsSales";
			definition = "Rights sales  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRRS";
		}
	};
	/**
	 * Rights step up related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsStepUp";
			definition = "Rights step up  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRRU";
		}
	};
	/**
	 * Rights subscription related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsSubscription";
			definition = "Rights subscription related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRRE";
		}
	};
	/**
	 * Stock loan transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stock loan transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmStockLoanSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanSettlement";
			definition = "Stock loan transaction.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "STOK";
		}
	};
	/**
	 * Tax instruction change related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxInstructionChange";
			definition = "Tax instruction change  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "TJXI";
		}
	};
	/**
	 * Tender offer fraction related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderOfferFraction";
			definition = "Tender offer fraction  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRT2";
		}
	};
	/**
	 * Warrant Participant delete related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantParticipantDelete";
			definition = "Warrant Participant delete related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRWT";
		}
	};
	/**
	 * Warrant rate change related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
	 * DTCAdjustmentPaymentTypeV2Code}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantRateChange";
			definition = "Warrant rate change  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRWC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentTypeV2Code";
				definition = "Specifies the type of the payment adjustment.";
				code_lazy = () -> Arrays.asList(DTCAdjustmentPaymentTypeV2Code.mmAdjustedForRightsSubscription, DTCAdjustmentPaymentTypeV2Code.mmADRIssueFeeCharge, DTCAdjustmentPaymentTypeV2Code.mmADRIssueFeeReversal,
						DTCAdjustmentPaymentTypeV2Code.mmCashInLieu, DTCAdjustmentPaymentTypeV2Code.mmClaimSettlement, DTCAdjustmentPaymentTypeV2Code.mmCustodyDividendPayment, DTCAdjustmentPaymentTypeV2Code.mmCustodyReorganizationDeposit,
						DTCAdjustmentPaymentTypeV2Code.mmDynamicRateChange, DTCAdjustmentPaymentTypeV2Code.mmFailSettlement, DTCAdjustmentPaymentTypeV2Code.mmFailTrackingTaxWithholding,
						DTCAdjustmentPaymentTypeV2Code.mmIntraDayReversalOfOriginalTaxWithholding, DTCAdjustmentPaymentTypeV2Code.mmLastDayProtect, DTCAdjustmentPaymentTypeV2Code.mmLegalReorganizationDeposits,
						DTCAdjustmentPaymentTypeV2Code.mmMandatoryLegalReorgDeposit, DTCAdjustmentPaymentTypeV2Code.mmMandatoryOverThreeYearReorganizationDeposit, DTCAdjustmentPaymentTypeV2Code.mmMandatoryReorganizationDeposit,
						DTCAdjustmentPaymentTypeV2Code.mmManualUserTax, DTCAdjustmentPaymentTypeV2Code.mmMiscellaneousSettlement, DTCAdjustmentPaymentTypeV2Code.mmOriginalInitialTaxWithholding,
						DTCAdjustmentPaymentTypeV2Code.mmOriginalLateTaxWithholding, DTCAdjustmentPaymentTypeV2Code.mmOther, DTCAdjustmentPaymentTypeV2Code.mmRateChangeTaxWithholding,
						DTCAdjustmentPaymentTypeV2Code.mmReclassificationTaxWithholding, DTCAdjustmentPaymentTypeV2Code.mmReorganisationDepositPhaseOne, DTCAdjustmentPaymentTypeV2Code.mmReorgDepositPhaseTwo,
						DTCAdjustmentPaymentTypeV2Code.mmRepoSettlement, DTCAdjustmentPaymentTypeV2Code.mmReversal, DTCAdjustmentPaymentTypeV2Code.mmReversalOfTaxWithholding, DTCAdjustmentPaymentTypeV2Code.mmRightsProtect,
						DTCAdjustmentPaymentTypeV2Code.mmRightsSales, DTCAdjustmentPaymentTypeV2Code.mmRightsStepUp, DTCAdjustmentPaymentTypeV2Code.mmRightsSubscription, DTCAdjustmentPaymentTypeV2Code.mmStockLoanSettlement,
						DTCAdjustmentPaymentTypeV2Code.mmTaxInstructionChange, DTCAdjustmentPaymentTypeV2Code.mmTenderOfferFraction, DTCAdjustmentPaymentTypeV2Code.mmWarrantParticipantDelete,
						DTCAdjustmentPaymentTypeV2Code.mmWarrantRateChange);
				derivation_lazy = () -> Arrays.asList(DTCAdjustmentPaymentType2Code.mmObject(), DTCAdjustmentPaymentType3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}