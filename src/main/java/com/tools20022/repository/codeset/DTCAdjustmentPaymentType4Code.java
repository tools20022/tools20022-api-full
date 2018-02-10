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
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#AdjustedForRightsSubscription
 * DTCAdjustmentPaymentType4Code.AdjustedForRightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#ADRIssueFeeCharge
 * DTCAdjustmentPaymentType4Code.ADRIssueFeeCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#ADRIssueFeeReversal
 * DTCAdjustmentPaymentType4Code.ADRIssueFeeReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#CashInLieu
 * DTCAdjustmentPaymentType4Code.CashInLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#ClaimSettlement
 * DTCAdjustmentPaymentType4Code.ClaimSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#CustodyDividendPayment
 * DTCAdjustmentPaymentType4Code.CustodyDividendPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#CustodyReorganisationDeposit
 * DTCAdjustmentPaymentType4Code.CustodyReorganisationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#DynamicRateChange
 * DTCAdjustmentPaymentType4Code.DynamicRateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#FailSettlement
 * DTCAdjustmentPaymentType4Code.FailSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#FailTrackingTaxWithholding
 * DTCAdjustmentPaymentType4Code.FailTrackingTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#LastDayProtect
 * DTCAdjustmentPaymentType4Code.LastDayProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#MandatoryLegalReorganisationDeposit
 * DTCAdjustmentPaymentType4Code.MandatoryLegalReorganisationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#MandatoryOverThreeYearReorganisationDeposit
 * DTCAdjustmentPaymentType4Code.MandatoryOverThreeYearReorganisationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#ManualUserTax
 * DTCAdjustmentPaymentType4Code.ManualUserTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#MiscellaneousSettlement
 * DTCAdjustmentPaymentType4Code.MiscellaneousSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#Other
 * DTCAdjustmentPaymentType4Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#ReclassificationTaxWithholding
 * DTCAdjustmentPaymentType4Code.ReclassificationTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#ReorganisationDepositPhaseOne
 * DTCAdjustmentPaymentType4Code.ReorganisationDepositPhaseOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#ReorganisationDepositPhaseTwo
 * DTCAdjustmentPaymentType4Code.ReorganisationDepositPhaseTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#Reversal
 * DTCAdjustmentPaymentType4Code.Reversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#ReversalOfTaxWithholding
 * DTCAdjustmentPaymentType4Code.ReversalOfTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#IntraDayReversalOfOriginalTaxWithholding
 * DTCAdjustmentPaymentType4Code.IntraDayReversalOfOriginalTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#LegalReorganisationDeposits
 * DTCAdjustmentPaymentType4Code.LegalReorganisationDeposits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#MandatoryReorganisationDeposit
 * DTCAdjustmentPaymentType4Code.MandatoryReorganisationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#OriginalInitialTaxWithholding
 * DTCAdjustmentPaymentType4Code.OriginalInitialTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#OriginalLateTaxWithholding
 * DTCAdjustmentPaymentType4Code.OriginalLateTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#RateChangeTaxWithholding
 * DTCAdjustmentPaymentType4Code.RateChangeTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#RepoSettlement
 * DTCAdjustmentPaymentType4Code.RepoSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#RightsProtect
 * DTCAdjustmentPaymentType4Code.RightsProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#RightsSales
 * DTCAdjustmentPaymentType4Code.RightsSales}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#RightsStepUp
 * DTCAdjustmentPaymentType4Code.RightsStepUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#RightsSubscription
 * DTCAdjustmentPaymentType4Code.RightsSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#StockLoanSettlement
 * DTCAdjustmentPaymentType4Code.StockLoanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#TaxInstructionChange
 * DTCAdjustmentPaymentType4Code.TaxInstructionChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#TenderOfferFraction
 * DTCAdjustmentPaymentType4Code.TenderOfferFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#WarrantParticipantDelete
 * DTCAdjustmentPaymentType4Code.WarrantParticipantDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code#WarrantRateChange
 * DTCAdjustmentPaymentType4Code.WarrantRateChange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV3Code
 * DTCAdjustmentPaymentTypeV3Code}</li>
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
 * "DTCAdjustmentPaymentType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the payment adjustment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAdjustmentPaymentType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedForRightsSubscription"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code AdjustedForRightsSubscription = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedForRightsSubscription";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.AdjustedForRightsSubscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADRIssueFeeCharge"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code ADRIssueFeeCharge = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADRIssueFeeCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.ADRIssueFeeCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADRIssueFeeReversal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code ADRIssueFeeReversal = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADRIssueFeeReversal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.ADRIssueFeeReversal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieu"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code CashInLieu = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieu";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.CashInLieu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimSettlement"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code ClaimSettlement = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.ClaimSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyDividendPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code CustodyDividendPayment = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyDividendPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.CustodyDividendPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyReorganisationDeposit"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code CustodyReorganisationDeposit = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyReorganisationDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.CustodyReorganisationDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DynamicRateChange"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code DynamicRateChange = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DynamicRateChange";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.DynamicRateChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailSettlement"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code FailSettlement = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.FailSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailTrackingTaxWithholding"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code FailTrackingTaxWithholding = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailTrackingTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.FailTrackingTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastDayProtect"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code LastDayProtect = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastDayProtect";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.LastDayProtect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryLegalReorganisationDeposit"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code MandatoryLegalReorganisationDeposit = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryLegalReorganisationDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.MandatoryLegalReorganisationDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryOverThreeYearReorganisationDeposit"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code MandatoryOverThreeYearReorganisationDeposit = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryOverThreeYearReorganisationDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.MandatoryOverThreeYearReorganisationDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualUserTax"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code ManualUserTax = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualUserTax";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.ManualUserTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousSettlement"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code MiscellaneousSettlement = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.MiscellaneousSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code Other = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReclassificationTaxWithholding"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code ReclassificationTaxWithholding = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReclassificationTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.ReclassificationTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganisationDepositPhaseOne"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code ReorganisationDepositPhaseOne = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationDepositPhaseOne";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.ReorganisationDepositPhaseOne.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganisationDepositPhaseTwo"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code ReorganisationDepositPhaseTwo = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationDepositPhaseTwo";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.ReorganisationDepositPhaseTwo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code Reversal = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.Reversal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfTaxWithholding"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code ReversalOfTaxWithholding = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.ReversalOfTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDayReversalOfOriginalTaxWithholding"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code IntraDayReversalOfOriginalTaxWithholding = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraDayReversalOfOriginalTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.IntraDayReversalOfOriginalTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalReorganisationDeposits"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code LegalReorganisationDeposits = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalReorganisationDeposits";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.LegalReorganisationDeposits.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryReorganisationDeposit"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code MandatoryReorganisationDeposit = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryReorganisationDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.MandatoryReorganisationDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInitialTaxWithholding"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code OriginalInitialTaxWithholding = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInitialTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.OriginalInitialTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalLateTaxWithholding"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code OriginalLateTaxWithholding = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalLateTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.OriginalLateTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChangeTaxWithholding"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code RateChangeTaxWithholding = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.RateChangeTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoSettlement"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code RepoSettlement = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.RepoSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsProtect"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code RightsProtect = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsProtect";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.RightsProtect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsSales"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code RightsSales = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsSales";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.RightsSales.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsStepUp"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code RightsStepUp = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsStepUp";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.RightsStepUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsSubscription"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code RightsSubscription = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsSubscription";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.RightsSubscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanSettlement"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code StockLoanSettlement = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.StockLoanSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxInstructionChange"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code TaxInstructionChange = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxInstructionChange";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.TaxInstructionChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderOfferFraction"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code TenderOfferFraction = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderOfferFraction";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.TenderOfferFraction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantParticipantDelete"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code WarrantParticipantDelete = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantParticipantDelete";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.WarrantParticipantDelete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantRateChange"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType4Code WarrantRateChange = new DTCAdjustmentPaymentType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantRateChange";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV3Code.WarrantRateChange.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCAdjustmentPaymentType4Code> codesByName = new LinkedHashMap<>();

	protected DTCAdjustmentPaymentType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentType4Code";
				definition = "Specifies the type of the payment adjustment.";
				trace_lazy = () -> DTCAdjustmentPaymentTypeV3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.AdjustedForRightsSubscription, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.ADRIssueFeeCharge,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.ADRIssueFeeReversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.CashInLieu,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.ClaimSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.CustodyDividendPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.CustodyReorganisationDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.DynamicRateChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.FailSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.FailTrackingTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.LastDayProtect, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.MandatoryLegalReorganisationDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.MandatoryOverThreeYearReorganisationDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.ManualUserTax,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.MiscellaneousSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.Other,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.ReclassificationTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.ReorganisationDepositPhaseOne,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.ReorganisationDepositPhaseTwo, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.Reversal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.ReversalOfTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.IntraDayReversalOfOriginalTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.LegalReorganisationDeposits, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.MandatoryReorganisationDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.OriginalInitialTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.OriginalLateTaxWithholding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.RateChangeTaxWithholding, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.RepoSettlement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.RightsProtect, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.RightsSales,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.RightsStepUp, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.RightsSubscription,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.StockLoanSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.TaxInstructionChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.TenderOfferFraction, com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.WarrantParticipantDelete,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code.WarrantRateChange);
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
		codesByName.put(CustodyReorganisationDeposit.getCodeName().get(), CustodyReorganisationDeposit);
		codesByName.put(DynamicRateChange.getCodeName().get(), DynamicRateChange);
		codesByName.put(FailSettlement.getCodeName().get(), FailSettlement);
		codesByName.put(FailTrackingTaxWithholding.getCodeName().get(), FailTrackingTaxWithholding);
		codesByName.put(LastDayProtect.getCodeName().get(), LastDayProtect);
		codesByName.put(MandatoryLegalReorganisationDeposit.getCodeName().get(), MandatoryLegalReorganisationDeposit);
		codesByName.put(MandatoryOverThreeYearReorganisationDeposit.getCodeName().get(), MandatoryOverThreeYearReorganisationDeposit);
		codesByName.put(ManualUserTax.getCodeName().get(), ManualUserTax);
		codesByName.put(MiscellaneousSettlement.getCodeName().get(), MiscellaneousSettlement);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ReclassificationTaxWithholding.getCodeName().get(), ReclassificationTaxWithholding);
		codesByName.put(ReorganisationDepositPhaseOne.getCodeName().get(), ReorganisationDepositPhaseOne);
		codesByName.put(ReorganisationDepositPhaseTwo.getCodeName().get(), ReorganisationDepositPhaseTwo);
		codesByName.put(Reversal.getCodeName().get(), Reversal);
		codesByName.put(ReversalOfTaxWithholding.getCodeName().get(), ReversalOfTaxWithholding);
		codesByName.put(IntraDayReversalOfOriginalTaxWithholding.getCodeName().get(), IntraDayReversalOfOriginalTaxWithholding);
		codesByName.put(LegalReorganisationDeposits.getCodeName().get(), LegalReorganisationDeposits);
		codesByName.put(MandatoryReorganisationDeposit.getCodeName().get(), MandatoryReorganisationDeposit);
		codesByName.put(OriginalInitialTaxWithholding.getCodeName().get(), OriginalInitialTaxWithholding);
		codesByName.put(OriginalLateTaxWithholding.getCodeName().get(), OriginalLateTaxWithholding);
		codesByName.put(RateChangeTaxWithholding.getCodeName().get(), RateChangeTaxWithholding);
		codesByName.put(RepoSettlement.getCodeName().get(), RepoSettlement);
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

	public static DTCAdjustmentPaymentType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAdjustmentPaymentType4Code[] values() {
		DTCAdjustmentPaymentType4Code[] values = new DTCAdjustmentPaymentType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAdjustmentPaymentType4Code> {
		@Override
		public DTCAdjustmentPaymentType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAdjustmentPaymentType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}