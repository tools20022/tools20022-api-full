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
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the payment adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#AdjustedForRightsSubscription
 * DTCAdjustmentPaymentType2Code.AdjustedForRightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#ADRIssueFeeCharge
 * DTCAdjustmentPaymentType2Code.ADRIssueFeeCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#ADRIssueFeeReversal
 * DTCAdjustmentPaymentType2Code.ADRIssueFeeReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#CashInLieu
 * DTCAdjustmentPaymentType2Code.CashInLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#ClaimSettlement
 * DTCAdjustmentPaymentType2Code.ClaimSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#CustodyDividendPayment
 * DTCAdjustmentPaymentType2Code.CustodyDividendPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#CustodyReorganizationDeposit
 * DTCAdjustmentPaymentType2Code.CustodyReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#DynamicRateChange
 * DTCAdjustmentPaymentType2Code.DynamicRateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#FailSettlement
 * DTCAdjustmentPaymentType2Code.FailSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#FailTrackingTaxWithholding
 * DTCAdjustmentPaymentType2Code.FailTrackingTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#IntraDayReversalOfOriginalTaxWithholding
 * DTCAdjustmentPaymentType2Code.IntraDayReversalOfOriginalTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#LastDayProtect
 * DTCAdjustmentPaymentType2Code.LastDayProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#LegalReorganizationDeposits
 * DTCAdjustmentPaymentType2Code.LegalReorganizationDeposits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#MandatoryLegalReorgDeposit
 * DTCAdjustmentPaymentType2Code.MandatoryLegalReorgDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#MandatoryReorganizationDeposit
 * DTCAdjustmentPaymentType2Code.MandatoryReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#ManualUserTax
 * DTCAdjustmentPaymentType2Code.ManualUserTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#MiscellaneousSettlement
 * DTCAdjustmentPaymentType2Code.MiscellaneousSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#OriginalInitialTaxWithholding
 * DTCAdjustmentPaymentType2Code.OriginalInitialTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#MandatoryOverThreeYearReorganizationDeposit
 * DTCAdjustmentPaymentType2Code.MandatoryOverThreeYearReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#OriginalLateTaxWithholding
 * DTCAdjustmentPaymentType2Code.OriginalLateTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#Other
 * DTCAdjustmentPaymentType2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#RateChangeTaxWithholding
 * DTCAdjustmentPaymentType2Code.RateChangeTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#ReclassificationTaxWithholding
 * DTCAdjustmentPaymentType2Code.ReclassificationTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#ReorganisationDepositPhaseOne
 * DTCAdjustmentPaymentType2Code.ReorganisationDepositPhaseOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#ReorgDepositPhaseTwo
 * DTCAdjustmentPaymentType2Code.ReorgDepositPhaseTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#RepoSettlement
 * DTCAdjustmentPaymentType2Code.RepoSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#Reversal
 * DTCAdjustmentPaymentType2Code.Reversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#ReversalOfTaxWithholding
 * DTCAdjustmentPaymentType2Code.ReversalOfTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#RightsProtect
 * DTCAdjustmentPaymentType2Code.RightsProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#RightsSales
 * DTCAdjustmentPaymentType2Code.RightsSales}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#RightsStepUp
 * DTCAdjustmentPaymentType2Code.RightsStepUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#RightsSubscription
 * DTCAdjustmentPaymentType2Code.RightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#StockLoanSettlement
 * DTCAdjustmentPaymentType2Code.StockLoanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#TaxInstructionChange
 * DTCAdjustmentPaymentType2Code.TaxInstructionChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#TenderOfferFraction
 * DTCAdjustmentPaymentType2Code.TenderOfferFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#WarrantParticipantDelete
 * DTCAdjustmentPaymentType2Code.WarrantParticipantDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code#WarrantRateChange
 * DTCAdjustmentPaymentType2Code.WarrantRateChange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
 * DTCAdjustmentPaymentTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAdjustmentPaymentType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the payment adjustment."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAdjustmentPaymentType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedForRightsSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code AdjustedForRightsSubscription = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedForRightsSubscription";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.AdjustedForRightsSubscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADRIssueFeeCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code ADRIssueFeeCharge = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADRIssueFeeCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.ADRIssueFeeCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADRIssueFeeReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code ADRIssueFeeReversal = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADRIssueFeeReversal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.ADRIssueFeeReversal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code CashInLieu = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieu";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.CashInLieu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code ClaimSettlement = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.ClaimSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyDividendPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code CustodyDividendPayment = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyDividendPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.CustodyDividendPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyReorganizationDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code CustodyReorganizationDeposit = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyReorganizationDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.CustodyReorganizationDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DynamicRateChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code DynamicRateChange = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DynamicRateChange";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.DynamicRateChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code FailSettlement = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.FailSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailTrackingTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code FailTrackingTaxWithholding = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailTrackingTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.FailTrackingTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDayReversalOfOriginalTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code IntraDayReversalOfOriginalTaxWithholding = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraDayReversalOfOriginalTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.IntraDayReversalOfOriginalTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastDayProtect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code LastDayProtect = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastDayProtect";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.LastDayProtect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalReorganizationDeposits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code LegalReorganizationDeposits = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalReorganizationDeposits";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.LegalReorganizationDeposits.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryLegalReorgDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code MandatoryLegalReorgDeposit = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryLegalReorgDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.MandatoryLegalReorgDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryReorganizationDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code MandatoryReorganizationDeposit = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryReorganizationDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.MandatoryReorganizationDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualUserTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code ManualUserTax = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualUserTax";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.ManualUserTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code MiscellaneousSettlement = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.MiscellaneousSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInitialTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code OriginalInitialTaxWithholding = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInitialTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.OriginalInitialTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryOverThreeYearReorganizationDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code MandatoryOverThreeYearReorganizationDeposit = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryOverThreeYearReorganizationDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.MandatoryOverThreeYearReorganizationDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalLateTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code OriginalLateTaxWithholding = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalLateTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.OriginalLateTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code Other = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChangeTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code RateChangeTaxWithholding = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.RateChangeTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReclassificationTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code ReclassificationTaxWithholding = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReclassificationTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.ReclassificationTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganisationDepositPhaseOne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code ReorganisationDepositPhaseOne = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationDepositPhaseOne";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.ReorganisationDepositPhaseOne.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorgDepositPhaseTwo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code ReorgDepositPhaseTwo = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorgDepositPhaseTwo";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.ReorgDepositPhaseTwo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code RepoSettlement = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.RepoSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code Reversal = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.Reversal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfTaxWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code ReversalOfTaxWithholding = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.ReversalOfTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsProtect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code RightsProtect = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsProtect";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.RightsProtect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsSales"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code RightsSales = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsSales";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.RightsSales.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsStepUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code RightsStepUp = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsStepUp";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.RightsStepUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code RightsSubscription = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsSubscription";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.RightsSubscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code StockLoanSettlement = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.StockLoanSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxInstructionChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code TaxInstructionChange = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxInstructionChange";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.TaxInstructionChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderOfferFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code TenderOfferFraction = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderOfferFraction";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.TenderOfferFraction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantParticipantDelete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code WarrantParticipantDelete = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantParticipantDelete";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.WarrantParticipantDelete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantRateChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType2Code WarrantRateChange = new DTCAdjustmentPaymentType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantRateChange";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.WarrantRateChange.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCAdjustmentPaymentType2Code> codesByName = new LinkedHashMap<>();

	protected DTCAdjustmentPaymentType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentType2Code";
				definition = "Specifies the type of the payment adjustment.";
				trace_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.AdjustedForRightsSubscription, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.ADRIssueFeeCharge,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.ADRIssueFeeReversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.CashInLieu,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.ClaimSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.CustodyDividendPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.CustodyReorganizationDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.DynamicRateChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.FailSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.FailTrackingTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.IntraDayReversalOfOriginalTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.LastDayProtect,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.LegalReorganizationDeposits, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.MandatoryLegalReorgDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.MandatoryReorganizationDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.ManualUserTax,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.MiscellaneousSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.OriginalInitialTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.MandatoryOverThreeYearReorganizationDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.OriginalLateTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.Other, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.RateChangeTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.ReclassificationTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.ReorganisationDepositPhaseOne,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.ReorgDepositPhaseTwo, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.RepoSettlement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.Reversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.ReversalOfTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.RightsProtect, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.RightsSales,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.RightsStepUp, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.RightsSubscription,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.StockLoanSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.TaxInstructionChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.TenderOfferFraction, com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.WarrantParticipantDelete,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code.WarrantRateChange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AdjustedForRightsSubscription.getCodeName().get(), AdjustedForRightsSubscription);
		codesByName.put(ADRIssueFeeCharge.getCodeName().get(), ADRIssueFeeCharge);
		codesByName.put(ADRIssueFeeReversal.getCodeName().get(), ADRIssueFeeReversal);
		codesByName.put(CashInLieu.getCodeName().get(), CashInLieu);
		codesByName.put(ClaimSettlement.getCodeName().get(), ClaimSettlement);
		codesByName.put(CustodyDividendPayment.getCodeName().get(), CustodyDividendPayment);
		codesByName.put(CustodyReorganizationDeposit.getCodeName().get(), CustodyReorganizationDeposit);
		codesByName.put(DynamicRateChange.getCodeName().get(), DynamicRateChange);
		codesByName.put(FailSettlement.getCodeName().get(), FailSettlement);
		codesByName.put(FailTrackingTaxWithholding.getCodeName().get(), FailTrackingTaxWithholding);
		codesByName.put(IntraDayReversalOfOriginalTaxWithholding.getCodeName().get(), IntraDayReversalOfOriginalTaxWithholding);
		codesByName.put(LastDayProtect.getCodeName().get(), LastDayProtect);
		codesByName.put(LegalReorganizationDeposits.getCodeName().get(), LegalReorganizationDeposits);
		codesByName.put(MandatoryLegalReorgDeposit.getCodeName().get(), MandatoryLegalReorgDeposit);
		codesByName.put(MandatoryReorganizationDeposit.getCodeName().get(), MandatoryReorganizationDeposit);
		codesByName.put(ManualUserTax.getCodeName().get(), ManualUserTax);
		codesByName.put(MiscellaneousSettlement.getCodeName().get(), MiscellaneousSettlement);
		codesByName.put(OriginalInitialTaxWithholding.getCodeName().get(), OriginalInitialTaxWithholding);
		codesByName.put(MandatoryOverThreeYearReorganizationDeposit.getCodeName().get(), MandatoryOverThreeYearReorganizationDeposit);
		codesByName.put(OriginalLateTaxWithholding.getCodeName().get(), OriginalLateTaxWithholding);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(RateChangeTaxWithholding.getCodeName().get(), RateChangeTaxWithholding);
		codesByName.put(ReclassificationTaxWithholding.getCodeName().get(), ReclassificationTaxWithholding);
		codesByName.put(ReorganisationDepositPhaseOne.getCodeName().get(), ReorganisationDepositPhaseOne);
		codesByName.put(ReorgDepositPhaseTwo.getCodeName().get(), ReorgDepositPhaseTwo);
		codesByName.put(RepoSettlement.getCodeName().get(), RepoSettlement);
		codesByName.put(Reversal.getCodeName().get(), Reversal);
		codesByName.put(ReversalOfTaxWithholding.getCodeName().get(), ReversalOfTaxWithholding);
		codesByName.put(RightsProtect.getCodeName().get(), RightsProtect);
		codesByName.put(RightsSales.getCodeName().get(), RightsSales);
		codesByName.put(RightsStepUp.getCodeName().get(), RightsStepUp);
		codesByName.put(RightsSubscription.getCodeName().get(), RightsSubscription);
		codesByName.put(StockLoanSettlement.getCodeName().get(), StockLoanSettlement);
		codesByName.put(TaxInstructionChange.getCodeName().get(), TaxInstructionChange);
		codesByName.put(TenderOfferFraction.getCodeName().get(), TenderOfferFraction);
		codesByName.put(WarrantParticipantDelete.getCodeName().get(), WarrantParticipantDelete);
		codesByName.put(WarrantRateChange.getCodeName().get(), WarrantRateChange);
	}

	public static DTCAdjustmentPaymentType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAdjustmentPaymentType2Code[] values() {
		DTCAdjustmentPaymentType2Code[] values = new DTCAdjustmentPaymentType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAdjustmentPaymentType2Code> {
		@Override
		public DTCAdjustmentPaymentType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAdjustmentPaymentType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}