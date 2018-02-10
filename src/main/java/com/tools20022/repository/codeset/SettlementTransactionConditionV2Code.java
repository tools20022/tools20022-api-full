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
import com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the conditions under which the order/trade is to be settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Assignment
 * SettlementTransactionConditionV2Code.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#BuytoCover
 * SettlementTransactionConditionV2Code.BuytoCover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Clean
 * SettlementTransactionConditionV2Code.Clean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Dirty
 * SettlementTransactionConditionV2Code.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#DeliveryWithoutMatching
 * SettlementTransactionConditionV2Code.DeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Drawn
 * SettlementTransactionConditionV2Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Exercised
 * SettlementTransactionConditionV2Code.Exercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#FreeCleanSettlement
 * SettlementTransactionConditionV2Code.FreeCleanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#KnockedOut
 * SettlementTransactionConditionV2Code.KnockedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Physical
 * SettlementTransactionConditionV2Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Residual
 * SettlementTransactionConditionV2Code.Residual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#ShortSell
 * SettlementTransactionConditionV2Code.ShortSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#SplitCurrencySettlement
 * SettlementTransactionConditionV2Code.SplitCurrencySettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#SpecialDelivery
 * SettlementTransactionConditionV2Code.SpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#SplitSettlement
 * SettlementTransactionConditionV2Code.SplitSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Unexposed
 * SettlementTransactionConditionV2Code.Unexposed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Expired
 * SettlementTransactionConditionV2Code.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#PendingSale
 * SettlementTransactionConditionV2Code.PendingSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#TripartySegregation
 * SettlementTransactionConditionV2Code.TripartySegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#NoAutomaticMarketClaim
 * SettlementTransactionConditionV2Code.NoAutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#CSDPaymentOnly
 * SettlementTransactionConditionV2Code.CSDPaymentOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Change
 * SettlementTransactionConditionV2Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#DoNotChange
 * SettlementTransactionConditionV2Code.DoNotChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#EligibleForNetting
 * SettlementTransactionConditionV2Code.EligibleForNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#FullPayment
 * SettlementTransactionConditionV2Code.FullPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#HalfPayment
 * SettlementTransactionConditionV2Code.HalfPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#LetterOfGuaranteeIsAccepted
 * SettlementTransactionConditionV2Code.LetterOfGuaranteeIsAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#LetterOfGuaranteeIsNotAccepted
 * SettlementTransactionConditionV2Code.LetterOfGuaranteeIsNotAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#NotEligibleForNetting
 * SettlementTransactionConditionV2Code.NotEligibleForNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#PartialSettlement
 * SettlementTransactionConditionV2Code.PartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#PartialSettlementNotAllowed
 * SettlementTransactionConditionV2Code.PartialSettlementNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#ReHypothecation
 * SettlementTransactionConditionV2Code.ReHypothecation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#SecurityEligibleForCollateralPurposes
 * SettlementTransactionConditionV2Code.SecurityEligibleForCollateralPurposes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#SecurityNotEligibleForCollateralPurposes
 * SettlementTransactionConditionV2Code.SecurityNotEligibleForCollateralPurposes
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#SettlementInstructionIsCCPEligible
 * SettlementTransactionConditionV2Code.SettlementInstructionIsCCPEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#SettlementInstructionIsNotCCPEligible
 * SettlementTransactionConditionV2Code.SettlementInstructionIsNotCCPEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#SettleThroughTheNonRTGSSystem
 * SettlementTransactionConditionV2Code.SettleThroughTheNonRTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#SettleThroughTheRTGSSystem
 * SettlementTransactionConditionV2Code.SettleThroughTheRTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#UncertifiedSecuritiesTaxNotApplicable
 * SettlementTransactionConditionV2Code.UncertifiedSecuritiesTaxNotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#USLegal144A
 * SettlementTransactionConditionV2Code.USLegal144A}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Zengin
 * SettlementTransactionConditionV2Code.Zengin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionV2Code#Transformation
 * SettlementTransactionConditionV2Code.Transformation}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionConditionV2Code extends MMCode {

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
	public static final SettlementTransactionConditionV2Code Assignment = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Assignment";
			definition = "Transfer of ownership of the asset to another party during the closing of an option.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code BuytoCover = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuytoCover";
			definition = "Transaction is a buy to cover.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code Clean = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Clean";
			definition = "Indicates that the trade was executed clean, ie government tax must not be paid on the accrued interest on the bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code Dirty = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dirty";
			definition = "Indicates that the trade was executed dirty, ie government tax must be paid on the accrued interest on the bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code DeliveryWithoutMatching = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryWithoutMatching";
			definition = "Matching receipt instruction not required (only for concerned international or national central securities depositories).";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code Drawn = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Drawn";
			definition = "Settlement transactions relates to drawn securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code Exercised = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Exercised";
			definition = "Settlement transaction relates to options, futures or derivatives that are exercised.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code FreeCleanSettlement = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FreeCleanSettlement";
			definition = "Delivery will be made free of payment but a clean payment order will be sent.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code KnockedOut = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KnockedOut";
			definition = "Settlement transaction relates to options, futures or derivatives that are expired worthless.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code Physical = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Securities are to be physically settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code Residual = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Residual";
			definition = "Relates to transaction on a security that is not eligible at the Central Security Depository (CSD) but for which the payment will be enacted by the central securities depository.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code ShortSell = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortSell";
			definition = "Account is used for short sale orders.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code SplitCurrencySettlement = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitCurrencySettlement";
			definition = "Settlement is in two different currencies.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code SpecialDelivery = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialDelivery";
			definition = "Settlement transactions to be settled with special delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code SplitSettlement = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitSettlement";
			definition = "Money and financial instruments settle in different locations.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code Unexposed = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unexposed";
			definition = "Delivery cannot be performed until money is received.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code Expired = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Expired";
			definition = "Settlement transaction relates to options, futures or derivatives that have expired.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code PendingSale = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingSale";
			definition = "The position to cover the pending sale will be available by contractual settlement date (accounting information).";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code TripartySegregation = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TripartySegregation";
			definition = "Securities are not be delivered but segregated following triparty collateral transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code NoAutomaticMarketClaim = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoAutomaticMarketClaim";
			definition = "No market claim should be automatically generated.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code CSDPaymentOnly = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDPaymentOnly";
			definition = "Transaction on a security that is not eligible at the Central Securities Depository (CSD) but for which the payment will be enacted by the CSD.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code Change = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			definition = "Change\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code DoNotChange = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoNotChange";
			definition = "Do Not Change\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code EligibleForNetting = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForNetting";
			definition = "Eligible for netting\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
			codeName = "YNET";
		}
	};
	/**
	 * Full Payment.
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
	 * definition} = "Full Payment."</li>
	 * </ul>
	 */
	public static final SettlementTransactionConditionV2Code FullPayment = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPayment";
			definition = "Full Payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
			codeName = "FUSD";
		}
	};
	/**
	 * Half Payment.
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
	 * definition} = "Half Payment."</li>
	 * </ul>
	 */
	public static final SettlementTransactionConditionV2Code HalfPayment = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HalfPayment";
			definition = "Half Payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code LetterOfGuaranteeIsAccepted = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteeIsAccepted";
			definition = "Letter of guarantee is accepted\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
			codeName = "YLEG";
		}
	};
	/**
	 * Letter of guarantee is not accepted.
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
	 * definition} = "Letter of guarantee is not accepted."</li>
	 * </ul>
	 */
	public static final SettlementTransactionConditionV2Code LetterOfGuaranteeIsNotAccepted = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteeIsNotAccepted";
			definition = "Letter of guarantee is not accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code NotEligibleForNetting = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEligibleForNetting";
			definition = "Not eligible for netting\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code PartialSettlement = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlement";
			definition = "Partial Settlement\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code PartialSettlementNotAllowed = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementNotAllowed";
			definition = "Partial Settlement Not Allowed\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code ReHypothecation = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReHypothecation";
			definition = "Re-hypothecation\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
			codeName = "RHYP";
		}
	};
	/**
	 * Security eligible for collateral purposes.
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
	 * definition} = "Security eligible for collateral purposes."</li>
	 * </ul>
	 */
	public static final SettlementTransactionConditionV2Code SecurityEligibleForCollateralPurposes = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityEligibleForCollateralPurposes";
			definition = "Security eligible for collateral purposes.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code SecurityNotEligibleForCollateralPurposes = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityNotEligibleForCollateralPurposes";
			definition = "Security not eligible for collateral purposes\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code SettlementInstructionIsCCPEligible = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionIsCCPEligible";
			definition = "Settlement Instruction is CCP eligible\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
			codeName = "YCCP";
		}
	};
	/**
	 * Settlement Instruction is not CCP eligible.
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
	 * definition} = "Settlement Instruction is not CCP eligible."</li>
	 * </ul>
	 */
	public static final SettlementTransactionConditionV2Code SettlementInstructionIsNotCCPEligible = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionIsNotCCPEligible";
			definition = "Settlement Instruction is not CCP eligible.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
			codeName = "NCCP";
		}
	};
	/**
	 * Settle through the Non-RTGS System.
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
	 * definition} = "Settle through the Non-RTGS System."</li>
	 * </ul>
	 */
	public static final SettlementTransactionConditionV2Code SettleThroughTheNonRTGSSystem = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettleThroughTheNon-RTGSSystem";
			definition = "Settle through the Non-RTGS System.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code SettleThroughTheRTGSSystem = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettleThroughTheRTGSSystem";
			definition = "Settle through the RTGS System\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code UncertifiedSecuritiesTaxNotApplicable = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UncertifiedSecuritiesTaxNotApplicable";
			definition = "Uncertified Securities Tax not applicable\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code USLegal144A = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USLegal144A";
			definition = "Unregistered Security Issued Pursuant to Rule 144A.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
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
	public static final SettlementTransactionConditionV2Code Zengin = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Zengin";
			definition = "Zengin (JP)\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
			codeName = "ZENG";
		}
	};
	/**
	 * Transformation.
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
	 * definition} = "Transformation."</li>
	 * </ul>
	 */
	public static final SettlementTransactionConditionV2Code Transformation = new SettlementTransactionConditionV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transformation";
			definition = "Transformation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.mmObject();
			codeName = "TRAN";
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionConditionV2Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionConditionV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ASGN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionConditionV2Code";
				definition = "Specifies the conditions under which the order/trade is to be settled.";
				derivation_lazy = () -> Arrays.asList(SettlementTransactionCondition7Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Assignment, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.BuytoCover,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Clean, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Dirty,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.DeliveryWithoutMatching, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Drawn,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Exercised, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.FreeCleanSettlement,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.KnockedOut, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Physical,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Residual, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.ShortSell,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.SplitCurrencySettlement, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.SpecialDelivery,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.SplitSettlement, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Unexposed,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Expired, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.PendingSale,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.TripartySegregation, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.NoAutomaticMarketClaim,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.CSDPaymentOnly, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Change,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.DoNotChange, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.EligibleForNetting,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.FullPayment, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.HalfPayment,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.LetterOfGuaranteeIsAccepted, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.LetterOfGuaranteeIsNotAccepted,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.NotEligibleForNetting, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.PartialSettlement,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.PartialSettlementNotAllowed, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.ReHypothecation,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.SecurityEligibleForCollateralPurposes,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.SecurityNotEligibleForCollateralPurposes,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.SettlementInstructionIsCCPEligible,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.SettlementInstructionIsNotCCPEligible, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.SettleThroughTheNonRTGSSystem,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.SettleThroughTheRTGSSystem, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.UncertifiedSecuritiesTaxNotApplicable,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.USLegal144A, com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Zengin,
						com.tools20022.repository.codeset.SettlementTransactionConditionV2Code.Transformation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Assignment.getCodeName().get(), Assignment);
		codesByName.put(BuytoCover.getCodeName().get(), BuytoCover);
		codesByName.put(Clean.getCodeName().get(), Clean);
		codesByName.put(Dirty.getCodeName().get(), Dirty);
		codesByName.put(DeliveryWithoutMatching.getCodeName().get(), DeliveryWithoutMatching);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(Exercised.getCodeName().get(), Exercised);
		codesByName.put(FreeCleanSettlement.getCodeName().get(), FreeCleanSettlement);
		codesByName.put(KnockedOut.getCodeName().get(), KnockedOut);
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(Residual.getCodeName().get(), Residual);
		codesByName.put(ShortSell.getCodeName().get(), ShortSell);
		codesByName.put(SplitCurrencySettlement.getCodeName().get(), SplitCurrencySettlement);
		codesByName.put(SpecialDelivery.getCodeName().get(), SpecialDelivery);
		codesByName.put(SplitSettlement.getCodeName().get(), SplitSettlement);
		codesByName.put(Unexposed.getCodeName().get(), Unexposed);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(PendingSale.getCodeName().get(), PendingSale);
		codesByName.put(TripartySegregation.getCodeName().get(), TripartySegregation);
		codesByName.put(NoAutomaticMarketClaim.getCodeName().get(), NoAutomaticMarketClaim);
		codesByName.put(CSDPaymentOnly.getCodeName().get(), CSDPaymentOnly);
		codesByName.put(Change.getCodeName().get(), Change);
		codesByName.put(DoNotChange.getCodeName().get(), DoNotChange);
		codesByName.put(EligibleForNetting.getCodeName().get(), EligibleForNetting);
		codesByName.put(FullPayment.getCodeName().get(), FullPayment);
		codesByName.put(HalfPayment.getCodeName().get(), HalfPayment);
		codesByName.put(LetterOfGuaranteeIsAccepted.getCodeName().get(), LetterOfGuaranteeIsAccepted);
		codesByName.put(LetterOfGuaranteeIsNotAccepted.getCodeName().get(), LetterOfGuaranteeIsNotAccepted);
		codesByName.put(NotEligibleForNetting.getCodeName().get(), NotEligibleForNetting);
		codesByName.put(PartialSettlement.getCodeName().get(), PartialSettlement);
		codesByName.put(PartialSettlementNotAllowed.getCodeName().get(), PartialSettlementNotAllowed);
		codesByName.put(ReHypothecation.getCodeName().get(), ReHypothecation);
		codesByName.put(SecurityEligibleForCollateralPurposes.getCodeName().get(), SecurityEligibleForCollateralPurposes);
		codesByName.put(SecurityNotEligibleForCollateralPurposes.getCodeName().get(), SecurityNotEligibleForCollateralPurposes);
		codesByName.put(SettlementInstructionIsCCPEligible.getCodeName().get(), SettlementInstructionIsCCPEligible);
		codesByName.put(SettlementInstructionIsNotCCPEligible.getCodeName().get(), SettlementInstructionIsNotCCPEligible);
		codesByName.put(SettleThroughTheNonRTGSSystem.getCodeName().get(), SettleThroughTheNonRTGSSystem);
		codesByName.put(SettleThroughTheRTGSSystem.getCodeName().get(), SettleThroughTheRTGSSystem);
		codesByName.put(UncertifiedSecuritiesTaxNotApplicable.getCodeName().get(), UncertifiedSecuritiesTaxNotApplicable);
		codesByName.put(USLegal144A.getCodeName().get(), USLegal144A);
		codesByName.put(Zengin.getCodeName().get(), Zengin);
		codesByName.put(Transformation.getCodeName().get(), Transformation);
	}

	public static SettlementTransactionConditionV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionConditionV2Code[] values() {
		SettlementTransactionConditionV2Code[] values = new SettlementTransactionConditionV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionConditionV2Code> {
		@Override
		public SettlementTransactionConditionV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionConditionV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}