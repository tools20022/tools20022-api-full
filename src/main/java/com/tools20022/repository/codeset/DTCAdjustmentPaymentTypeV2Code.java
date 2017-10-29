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
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#AdjustedForRightsSubscription
 * DTCAdjustmentPaymentTypeV2Code.AdjustedForRightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#ADRIssueFeeCharge
 * DTCAdjustmentPaymentTypeV2Code.ADRIssueFeeCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#ADRIssueFeeReversal
 * DTCAdjustmentPaymentTypeV2Code.ADRIssueFeeReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#CashInLieu
 * DTCAdjustmentPaymentTypeV2Code.CashInLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#ClaimSettlement
 * DTCAdjustmentPaymentTypeV2Code.ClaimSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#CustodyDividendPayment
 * DTCAdjustmentPaymentTypeV2Code.CustodyDividendPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#CustodyReorganizationDeposit
 * DTCAdjustmentPaymentTypeV2Code.CustodyReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#DynamicRateChange
 * DTCAdjustmentPaymentTypeV2Code.DynamicRateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#FailSettlement
 * DTCAdjustmentPaymentTypeV2Code.FailSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#FailTrackingTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.FailTrackingTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#IntraDayReversalOfOriginalTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.IntraDayReversalOfOriginalTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#LastDayProtect
 * DTCAdjustmentPaymentTypeV2Code.LastDayProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#LegalReorganizationDeposits
 * DTCAdjustmentPaymentTypeV2Code.LegalReorganizationDeposits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#MandatoryLegalReorgDeposit
 * DTCAdjustmentPaymentTypeV2Code.MandatoryLegalReorgDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#MandatoryOverThreeYearReorganizationDeposit
 * DTCAdjustmentPaymentTypeV2Code.MandatoryOverThreeYearReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#MandatoryReorganizationDeposit
 * DTCAdjustmentPaymentTypeV2Code.MandatoryReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#ManualUserTax
 * DTCAdjustmentPaymentTypeV2Code.ManualUserTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#MiscellaneousSettlement
 * DTCAdjustmentPaymentTypeV2Code.MiscellaneousSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#OriginalInitialTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.OriginalInitialTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#OriginalLateTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.OriginalLateTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#Other
 * DTCAdjustmentPaymentTypeV2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#RateChangeTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.RateChangeTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#ReclassificationTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.ReclassificationTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#ReorganisationDepositPhaseOne
 * DTCAdjustmentPaymentTypeV2Code.ReorganisationDepositPhaseOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#ReorgDepositPhaseTwo
 * DTCAdjustmentPaymentTypeV2Code.ReorgDepositPhaseTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#RepoSettlement
 * DTCAdjustmentPaymentTypeV2Code.RepoSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#Reversal
 * DTCAdjustmentPaymentTypeV2Code.Reversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#ReversalOfTaxWithholding
 * DTCAdjustmentPaymentTypeV2Code.ReversalOfTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#RightsProtect
 * DTCAdjustmentPaymentTypeV2Code.RightsProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#RightsSales
 * DTCAdjustmentPaymentTypeV2Code.RightsSales}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#RightsStepUp
 * DTCAdjustmentPaymentTypeV2Code.RightsStepUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#RightsSubscription
 * DTCAdjustmentPaymentTypeV2Code.RightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#StockLoanSettlement
 * DTCAdjustmentPaymentTypeV2Code.StockLoanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#TaxInstructionChange
 * DTCAdjustmentPaymentTypeV2Code.TaxInstructionChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#TenderOfferFraction
 * DTCAdjustmentPaymentTypeV2Code.TenderOfferFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#WarrantParticipantDelete
 * DTCAdjustmentPaymentTypeV2Code.WarrantParticipantDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code#WarrantRateChange
 * DTCAdjustmentPaymentTypeV2Code.WarrantRateChange}</li>
 * </ul>
 * </li>
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
	public static final MMCode AdjustedForRightsSubscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ADRIssueFeeCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ADRIssueFeeReversal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CashInLieu = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ClaimSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CustodyDividendPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode CustodyReorganizationDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode DynamicRateChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode FailSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode FailTrackingTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode IntraDayReversalOfOriginalTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode LastDayProtect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode LegalReorganizationDeposits = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MandatoryLegalReorgDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MandatoryOverThreeYearReorganizationDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MandatoryReorganizationDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ManualUserTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode MiscellaneousSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode OriginalInitialTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode OriginalLateTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode RateChangeTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ReclassificationTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ReorganisationDepositPhaseOne = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ReorgDepositPhaseTwo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode RepoSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Reversal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ReversalOfTaxWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode RightsProtect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode RightsSales = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode RightsStepUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode RightsSubscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode StockLoanSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode TaxInstructionChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode TenderOfferFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode WarrantParticipantDelete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode WarrantRateChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantRateChange";
			definition = "Warrant rate change  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
			codeName = "RRWC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentTypeV2Code";
				definition = "Specifies the type of the payment adjustment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.AdjustedForRightsSubscription, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.ADRIssueFeeCharge,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.ADRIssueFeeReversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.CashInLieu,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.ClaimSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.CustodyDividendPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.CustodyReorganizationDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.DynamicRateChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.FailSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.FailTrackingTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.IntraDayReversalOfOriginalTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.LastDayProtect,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.LegalReorganizationDeposits, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.MandatoryLegalReorgDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.MandatoryOverThreeYearReorganizationDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.MandatoryReorganizationDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.ManualUserTax, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.MiscellaneousSettlement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.OriginalInitialTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.OriginalLateTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.Other, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.RateChangeTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.ReclassificationTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.ReorganisationDepositPhaseOne,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.ReorgDepositPhaseTwo, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.RepoSettlement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.Reversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.ReversalOfTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.RightsProtect, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.RightsSales,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.RightsStepUp, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.RightsSubscription,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.StockLoanSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.TaxInstructionChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.TenderOfferFraction, com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.WarrantParticipantDelete,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code.WarrantRateChange);
				derivation_lazy = () -> Arrays.asList(DTCAdjustmentPaymentType2Code.mmObject(), DTCAdjustmentPaymentType3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}