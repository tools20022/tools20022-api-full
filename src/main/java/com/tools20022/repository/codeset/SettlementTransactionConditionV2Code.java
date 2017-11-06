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
 * Specifies the conditions under which the order/trade is to be settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmAssignment
 * SettlementTransactionConditionV2Code.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmBuytoCover
 * SettlementTransactionConditionV2Code.mmBuytoCover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmClean
 * SettlementTransactionConditionV2Code.mmClean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmDirty
 * SettlementTransactionConditionV2Code.mmDirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmDeliveryWithoutMatching
 * SettlementTransactionConditionV2Code.mmDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmDrawn
 * SettlementTransactionConditionV2Code.mmDrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmExercised
 * SettlementTransactionConditionV2Code.mmExercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmFreeCleanSettlement
 * SettlementTransactionConditionV2Code.mmFreeCleanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmKnockedOut
 * SettlementTransactionConditionV2Code.mmKnockedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmPhysical
 * SettlementTransactionConditionV2Code.mmPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmResidual
 * SettlementTransactionConditionV2Code.mmResidual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmShortSell
 * SettlementTransactionConditionV2Code.mmShortSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmSplitCurrencySettlement
 * SettlementTransactionConditionV2Code.mmSplitCurrencySettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmSpecialDelivery
 * SettlementTransactionConditionV2Code.mmSpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmSplitSettlement
 * SettlementTransactionConditionV2Code.mmSplitSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmUnexposed
 * SettlementTransactionConditionV2Code.mmUnexposed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmExpired
 * SettlementTransactionConditionV2Code.mmExpired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmPendingSale
 * SettlementTransactionConditionV2Code.mmPendingSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmTripartySegregation
 * SettlementTransactionConditionV2Code.mmTripartySegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmNoAutomaticMarketClaim
 * SettlementTransactionConditionV2Code.mmNoAutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmCSDPaymentOnly
 * SettlementTransactionConditionV2Code.mmCSDPaymentOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmChange
 * SettlementTransactionConditionV2Code.mmChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmDoNotChange
 * SettlementTransactionConditionV2Code.mmDoNotChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmEligibleForNetting
 * SettlementTransactionConditionV2Code.mmEligibleForNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmFullPayment
 * SettlementTransactionConditionV2Code.mmFullPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmHalfPayment
 * SettlementTransactionConditionV2Code.mmHalfPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmLetterOfGuaranteeIsAccepted
 * SettlementTransactionConditionV2Code.mmLetterOfGuaranteeIsAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmLetterOfGuaranteeIsNotAccepted
 * SettlementTransactionConditionV2Code.mmLetterOfGuaranteeIsNotAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmNotEligibleForNetting
 * SettlementTransactionConditionV2Code.mmNotEligibleForNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmPartialSettlement
 * SettlementTransactionConditionV2Code.mmPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmPartialSettlementNotAllowed
 * SettlementTransactionConditionV2Code.mmPartialSettlementNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmReHypothecation
 * SettlementTransactionConditionV2Code.mmReHypothecation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmSecurityEligibleForCollateralPurposes
 * SettlementTransactionConditionV2Code.mmSecurityEligibleForCollateralPurposes}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmSecurityNotEligibleForCollateralPurposes
 * SettlementTransactionConditionV2Code.
 * mmSecurityNotEligibleForCollateralPurposes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmSettlementInstructionIsCCPEligible
 * SettlementTransactionConditionV2Code.mmSettlementInstructionIsCCPEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmSettlementInstructionIsNotCCPEligible
 * SettlementTransactionConditionV2Code.mmSettlementInstructionIsNotCCPEligible}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmSettleThroughTheNonRTGSSystem
 * SettlementTransactionConditionV2Code.mmSettleThroughTheNonRTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmSettleThroughTheRTGSSystem
 * SettlementTransactionConditionV2Code.mmSettleThroughTheRTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmUncertifiedSecuritiesTaxNotApplicable
 * SettlementTransactionConditionV2Code.mmUncertifiedSecuritiesTaxNotApplicable}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmUSLegal144A
 * SettlementTransactionConditionV2Code.mmUSLegal144A}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmZengin
 * SettlementTransactionConditionV2Code.mmZengin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#mmTransformation
 * SettlementTransactionConditionV2Code.mmTransformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition7Code
 * SettlementTransactionCondition7Code}</li>
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
 * <li>"ASGN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionConditionV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be settled."</li>
 * </ul>
 */
public class SettlementTransactionConditionV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer of ownership of the asset to another party during the closing of
	 * an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer of ownership of the asset to another party during the closing of an option."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAssignment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Assignment";
			definition = "Transfer of ownership of the asset to another party during the closing of an option.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "ASGN";
		}
	};
	/**
	 * Transaction is a buy to cover.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuytoCover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a buy to cover."</li>
	 * </ul>
	 */
	public static final MMCode mmBuytoCover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuytoCover";
			definition = "Transaction is a buy to cover.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "BUTC";
		}
	};
	/**
	 * Indicates that the trade was executed clean, ie government tax must not
	 * be paid on the accrued interest on the bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade was executed clean, ie government tax must not be paid on the accrued interest on the bond."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClean = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Clean";
			definition = "Indicates that the trade was executed clean, ie government tax must not be paid on the accrued interest on the bond.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "CLEN";
		}
	};
	/**
	 * Indicates that the trade was executed dirty, ie government tax must be
	 * paid on the accrued interest on the bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade was executed dirty, ie government tax must be paid on the accrued interest on the bond."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDirty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dirty";
			definition = "Indicates that the trade was executed dirty, ie government tax must be paid on the accrued interest on the bond.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Matching receipt instruction not required (only for concerned
	 * international or national central securities depositories).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLWM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryWithoutMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Matching receipt instruction not required (only for concerned international or national central securities depositories)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDeliveryWithoutMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryWithoutMatching";
			definition = "Matching receipt instruction not required (only for concerned international or national central securities depositories).";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "DLWM";
		}
	};
	/**
	 * Settlement transactions relates to drawn securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement transactions relates to drawn securities."</li>
	 * </ul>
	 */
	public static final MMCode mmDrawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Drawn";
			definition = "Settlement transactions relates to drawn securities.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * are exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transaction relates to options, futures or derivatives that are exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExercised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exercised";
			definition = "Settlement transaction relates to options, futures or derivatives that are exercised.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "EXER";
		}
	};
	/**
	 * Delivery will be made free of payment but a clean payment order will be
	 * sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCleanSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery will be made free of payment but a clean payment order will be sent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFreeCleanSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FreeCleanSettlement";
			definition = "Delivery will be made free of payment but a clean payment order will be sent.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "FRCL";
		}
	};
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * are expired worthless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KNOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnockedOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transaction relates to options, futures or derivatives that are expired worthless."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmKnockedOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "KnockedOut";
			definition = "Settlement transaction relates to options, futures or derivatives that are expired worthless.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "KNOC";
		}
	};
	/**
	 * Securities are to be physically settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities are to be physically settled."</li>
	 * </ul>
	 */
	public static final MMCode mmPhysical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Securities are to be physically settled.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Relates to transaction on a security that is not eligible at the Central
	 * Security Depository (CSD) but for which the payment will be enacted by
	 * the central securities depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to transaction on a security that is not eligible at the Central Security Depository (CSD) but for which the payment will be enacted by the central securities depository."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmResidual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Residual";
			definition = "Relates to transaction on a security that is not eligible at the Central Security Depository (CSD) but for which the payment will be enacted by the central securities depository.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "RESI";
		}
	};
	/**
	 * Account is used for short sale orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is used for short sale orders."</li>
	 * </ul>
	 */
	public static final MMCode mmShortSell = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortSell";
			definition = "Account is used for short sale orders.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "SHOR";
		}
	};
	/**
	 * Settlement is in two different currencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitCurrencySettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is in two different currencies."</li>
	 * </ul>
	 */
	public static final MMCode mmSplitCurrencySettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitCurrencySettlement";
			definition = "Settlement is in two different currencies.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "SPCS";
		}
	};
	/**
	 * Settlement transactions to be settled with special delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPDL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transactions to be settled with special delivery."</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialDelivery";
			definition = "Settlement transactions to be settled with special delivery.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "SPDL";
		}
	};
	/**
	 * Money and financial instruments settle in different locations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money and financial instruments settle in different locations."</li>
	 * </ul>
	 */
	public static final MMCode mmSplitSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitSettlement";
			definition = "Money and financial instruments settle in different locations.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "SPST";
		}
	};
	/**
	 * Delivery cannot be performed until money is received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unexposed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery cannot be performed until money is received."</li>
	 * </ul>
	 */
	public static final MMCode mmUnexposed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unexposed";
			definition = "Delivery cannot be performed until money is received.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "UNEX";
		}
	};
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * have expired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transaction relates to options, futures or derivatives that have expired."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExpired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expired";
			definition = "Settlement transaction relates to options, futures or derivatives that have expired.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * The position to cover the pending sale will be available by contractual
	 * settlement date (accounting information).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The position to cover the pending sale will be available by contractual settlement date (accounting information)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingSale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSale";
			definition = "The position to cover the pending sale will be available by contractual settlement date (accounting information).";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "PENS";
		}
	};
	/**
	 * Securities are not be delivered but segregated following triparty
	 * collateral transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartySegregation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are not be delivered but segregated following triparty collateral transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTripartySegregation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TripartySegregation";
			definition = "Securities are not be delivered but segregated following triparty collateral transaction.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "TRIP";
		}
	};
	/**
	 * No market claim should be automatically generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No market claim should be automatically generated."</li>
	 * </ul>
	 */
	public static final MMCode mmNoAutomaticMarketClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAutomaticMarketClaim";
			definition = "No market claim should be automatically generated.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "NOMC";
		}
	};
	/**
	 * Transaction on a security that is not eligible at the Central Securities
	 * Depository (CSD) but for which the payment will be enacted by the CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDPaymentOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction on a security that is not eligible at the Central Securities Depository (CSD) but for which the payment will be enacted by the CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCSDPaymentOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDPaymentOnly";
			definition = "Transaction on a security that is not eligible at the Central Securities Depository (CSD) but for which the payment will be enacted by the CSD.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "CSDP";
		}
	};
	/**
	 * Change<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YBEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			definition = "Change\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "YBEN";
		}
	};
	/**
	 * Do Not Change<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NBEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoNotChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Do Not Change\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmDoNotChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoNotChange";
			definition = "Do Not Change\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "NBEN";
		}
	};
	/**
	 * Eligible for netting<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YNET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForNetting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Eligible for netting\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmEligibleForNetting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForNetting";
			definition = "Eligible for netting\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "YNET";
		}
	};
	/**
	 * Full Payment
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full Payment"</li>
	 * </ul>
	 */
	public static final MMCode mmFullPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPayment";
			definition = "Full Payment";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "FUSD";
		}
	};
	/**
	 * Half Payment
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HASD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HalfPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Half Payment"</li>
	 * </ul>
	 */
	public static final MMCode mmHalfPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HalfPayment";
			definition = "Half Payment";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "HASD";
		}
	};
	/**
	 * Letter of guarantee is accepted<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YLEG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuaranteeIsAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Letter of guarantee is accepted\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmLetterOfGuaranteeIsAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteeIsAccepted";
			definition = "Letter of guarantee is accepted\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "YLEG";
		}
	};
	/**
	 * Letter of guarantee is not accepted
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NLEG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuaranteeIsNotAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Letter of guarantee is not accepted"</li>
	 * </ul>
	 */
	public static final MMCode mmLetterOfGuaranteeIsNotAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteeIsNotAccepted";
			definition = "Letter of guarantee is not accepted";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "NLEG";
		}
	};
	/**
	 * Not eligible for netting<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NNET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleForNetting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Not eligible for netting\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmNotEligibleForNetting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEligibleForNetting";
			definition = "Not eligible for netting\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "NNET";
		}
	};
	/**
	 * Partial Settlement<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial Settlement\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmPartialSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlement";
			definition = "Partial Settlement\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Partial Settlement Not Allowed<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial Settlement Not Allowed\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmPartialSettlementNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementNotAllowed";
			definition = "Partial Settlement Not Allowed\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "NPAR";
		}
	};
	/**
	 * Re-hypothecation<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHYP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReHypothecation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Re-hypothecation\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmReHypothecation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReHypothecation";
			definition = "Re-hypothecation\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "RHYP";
		}
	};
	/**
	 * Security eligible for collateral purposes
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityEligibleForCollateralPurposes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security eligible for collateral purposes"</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityEligibleForCollateralPurposes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityEligibleForCollateralPurposes";
			definition = "Security eligible for collateral purposes";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "COLA";
		}
	};
	/**
	 * Security not eligible for collateral purposes<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityNotEligibleForCollateralPurposes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security not eligible for collateral purposes\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityNotEligibleForCollateralPurposes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityNotEligibleForCollateralPurposes";
			definition = "Security not eligible for collateral purposes\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "COLN";
		}
	};
	/**
	 * Settlement Instruction is CCP eligible<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YCCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionIsCCPEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement Instruction is CCP eligible\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementInstructionIsCCPEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionIsCCPEligible";
			definition = "Settlement Instruction is CCP eligible\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "YCCP";
		}
	};
	/**
	 * Settlement Instruction is not CCP eligible
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionIsNotCCPEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement Instruction is not CCP eligible"</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementInstructionIsNotCCPEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionIsNotCCPEligible";
			definition = "Settlement Instruction is not CCP eligible";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "NCCP";
		}
	};
	/**
	 * Settle through the Non-RTGS System
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRTG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettleThroughTheNon-RTGSSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle through the Non-RTGS System"</li>
	 * </ul>
	 */
	public static final MMCode mmSettleThroughTheNonRTGSSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettleThroughTheNon-RTGSSystem";
			definition = "Settle through the Non-RTGS System";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "NRTG";
		}
	};
	/**
	 * Settle through the RTGS System<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YRTG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettleThroughTheRTGSSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle through the RTGS System\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmSettleThroughTheRTGSSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettleThroughTheRTGSSystem";
			definition = "Settle through the RTGS System\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "YRTG";
		}
	};
	/**
	 * Uncertified Securities Tax not applicable<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UncertifiedSecuritiesTaxNotApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uncertified Securities Tax not applicable\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmUncertifiedSecuritiesTaxNotApplicable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UncertifiedSecuritiesTaxNotApplicable";
			definition = "Uncertified Securities Tax not applicable\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "USTN";
		}
	};
	/**
	 * Unregistered Security Issued Pursuant to Rule 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USLegal144A"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unregistered Security Issued Pursuant to Rule 144A."</li>
	 * </ul>
	 */
	public static final MMCode mmUSLegal144A = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USLegal144A";
			definition = "Unregistered Security Issued Pursuant to Rule 144A.";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "USLE";
		}
	};
	/**
	 * Zengin (JP)<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZENG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Zengin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Zengin (JP)\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmZengin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Zengin";
			definition = "Zengin (JP)\r\n";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "ZENG";
		}
	};
	/**
	 * Transformation
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code
	 * SettlementTransactionConditionV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transformation"</li>
	 * </ul>
	 */
	public static final MMCode mmTransformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transformation";
			definition = "Transformation";
			owner_lazy = () -> SettlementTransactionConditionV2Code.mmObject();
			codeName = "TRAN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ASGN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionConditionV2Code";
				definition = "Specifies the conditions under which the order/trade is to be settled.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmAssignment, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmBuytoCover,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmClean, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmDirty,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmDeliveryWithoutMatching, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmDrawn,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmExercised, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmFreeCleanSettlement,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmKnockedOut, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmPhysical,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmResidual, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmShortSell,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmSplitCurrencySettlement, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmSpecialDelivery,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmSplitSettlement, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmUnexposed,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmExpired, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmPendingSale,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmTripartySegregation, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmNoAutomaticMarketClaim,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmCSDPaymentOnly, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmChange,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmDoNotChange, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmEligibleForNetting,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmFullPayment, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmHalfPayment,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmLetterOfGuaranteeIsAccepted, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmLetterOfGuaranteeIsNotAccepted,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmNotEligibleForNetting, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmPartialSettlement,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmPartialSettlementNotAllowed, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmReHypothecation,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmSecurityEligibleForCollateralPurposes,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmSecurityNotEligibleForCollateralPurposes,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmSettlementInstructionIsCCPEligible,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmSettlementInstructionIsNotCCPEligible, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmSettleThroughTheNonRTGSSystem,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmSettleThroughTheRTGSSystem, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmUncertifiedSecuritiesTaxNotApplicable,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmUSLegal144A, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmZengin,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmTransformation);
				derivation_lazy = () -> Arrays.asList(SettlementTransactionCondition7Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}