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
import com.tools20022.repository.codeset.PaymentPurpose1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of transaction that resulted in a payment initiation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#SalaryPayment
 * PaymentPurpose1Code.SalaryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#TreasuryPayment
 * PaymentPurpose1Code.TreasuryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#AdvancePayment
 * PaymentPurpose1Code.AdvancePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#AgriculturalTransfer
 * PaymentPurpose1Code.AgriculturalTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#AlimonyPayment
 * PaymentPurpose1Code.AlimonyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#ChildBenefit
 * PaymentPurpose1Code.ChildBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#UnemploymentDisabilityBenefit
 * PaymentPurpose1Code.UnemploymentDisabilityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#BonusPayment
 * PaymentPurpose1Code.BonusPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#CashManagementTransfer
 * PaymentPurpose1Code.CashManagementTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#CapitalBuilding
 * PaymentPurpose1Code.CapitalBuilding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#CharityPayment
 * PaymentPurpose1Code.CharityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#CollectionPayment
 * PaymentPurpose1Code.CollectionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#CommodityTransfer
 * PaymentPurpose1Code.CommodityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#CommercialPayment
 * PaymentPurpose1Code.CommercialPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Commission
 * PaymentPurpose1Code.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Costs
 * PaymentPurpose1Code.Costs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Copyright
 * PaymentPurpose1Code.Copyright}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Dividend
 * PaymentPurpose1Code.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#ForeignExchange
 * PaymentPurpose1Code.ForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#PurchaseSaleOfGoods
 * PaymentPurpose1Code.PurchaseSaleOfGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#GovernmentPayment
 * PaymentPurpose1Code.GovernmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#InstalmentHirePurchaseAgreement
 * PaymentPurpose1Code.InstalmentHirePurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#IntraCompanyPayment
 * PaymentPurpose1Code.IntraCompanyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#InsurancePremium
 * PaymentPurpose1Code.InsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Interest
 * PaymentPurpose1Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#LicenseFee
 * PaymentPurpose1Code.LicenseFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Loan
 * PaymentPurpose1Code.Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#LoanRepayment
 * PaymentPurpose1Code.LoanRepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Netting
 * PaymentPurpose1Code.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Payroll
 * PaymentPurpose1Code.Payroll}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#PensionPayment
 * PaymentPurpose1Code.PensionPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Refund
 * PaymentPurpose1Code.Refund}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Rent
 * PaymentPurpose1Code.Rent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Royalties
 * PaymentPurpose1Code.Royalties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#PurchaseSaleOfServices
 * PaymentPurpose1Code.PurchaseSaleOfServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Securities
 * PaymentPurpose1Code.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#SocialSecurityBenefit
 * PaymentPurpose1Code.SocialSecurityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Subscription
 * PaymentPurpose1Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#TaxPayment
 * PaymentPurpose1Code.TaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#ValueAddedTaxPayment
 * PaymentPurpose1Code.ValueAddedTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#ConsumerThirdPartyConsolidatedPayment
 * PaymentPurpose1Code.ConsumerThirdPartyConsolidatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#DebitCollectionPayment
 * PaymentPurpose1Code.DebitCollectionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#SupplierPayment
 * PaymentPurpose1Code.SupplierPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#Hedging
 * PaymentPurpose1Code.Hedging}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
 * PaymentPurposeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentPurpose1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of transaction that resulted in a payment initiation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SALA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentPurpose1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code SalaryPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SalaryPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.SalaryPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code TreasuryPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.TreasuryPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvancePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code AdvancePayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvancePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.AdvancePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgriculturalTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code AgriculturalTransfer = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgriculturalTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.AgriculturalTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlimonyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code AlimonyPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlimonyPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.AlimonyPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChildBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code ChildBenefit = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChildBenefit";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.ChildBenefit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnemploymentDisabilityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code UnemploymentDisabilityBenefit = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnemploymentDisabilityBenefit";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.UnemploymentDisabilityBenefit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code BonusPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.BonusPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code CashManagementTransfer = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashManagementTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.CashManagementTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalBuilding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code CapitalBuilding = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalBuilding";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.CapitalBuilding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CharityPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code CharityPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CharityPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.CharityPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code CollectionPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.CollectionPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommodityTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code CommodityTransfer = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommodityTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.CommodityTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code CommercialPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.CommercialPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Commission = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Commission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Costs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Costs = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Costs";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Costs.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copyright"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Copyright = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Copyright";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Copyright.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Dividend = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Dividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code ForeignExchange = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.ForeignExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code PurchaseSaleOfGoods = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseSaleOfGoods";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.PurchaseSaleOfGoods.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code GovernmentPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.GovernmentPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentHirePurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code InstalmentHirePurchaseAgreement = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentHirePurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.InstalmentHirePurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code IntraCompanyPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraCompanyPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.IntraCompanyPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code InsurancePremium = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsurancePremium";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.InsurancePremium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Interest = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LicenseFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code LicenseFee = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LicenseFee";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.LicenseFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Loan = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Loan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoanRepayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code LoanRepayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LoanRepayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.LoanRepayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Netting = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Netting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payroll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Payroll = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payroll";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Payroll.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code PensionPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.PensionPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Refund = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Refund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Rent = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rent";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Rent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Royalties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Royalties = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Royalties";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Royalties.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code PurchaseSaleOfServices = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseSaleOfServices";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.PurchaseSaleOfServices.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Securities = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Securities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code SocialSecurityBenefit = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityBenefit";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.SocialSecurityBenefit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Subscription = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code TaxPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.TaxPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code ValueAddedTaxPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTaxPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.ValueAddedTaxPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumerThirdPartyConsolidatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code ConsumerThirdPartyConsolidatedPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumerThirdPartyConsolidatedPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.ConsumerThirdPartyConsolidatedPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCollectionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code DebitCollectionPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCollectionPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.DebitCollectionPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplierPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code SupplierPayment = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplierPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.SupplierPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hedging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentPurpose1Code Hedging = new PaymentPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hedging";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurpose1Code.mmObject();
			codeName = PaymentPurposeCode.Hedging.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PaymentPurpose1Code> codesByName = new LinkedHashMap<>();

	protected PaymentPurpose1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SALA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentPurpose1Code";
				definition = "Specifies the type of transaction that resulted in a payment initiation.";
				trace_lazy = () -> PaymentPurposeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentPurpose1Code.SalaryPayment, com.tools20022.repository.codeset.PaymentPurpose1Code.TreasuryPayment,
						com.tools20022.repository.codeset.PaymentPurpose1Code.AdvancePayment, com.tools20022.repository.codeset.PaymentPurpose1Code.AgriculturalTransfer, com.tools20022.repository.codeset.PaymentPurpose1Code.AlimonyPayment,
						com.tools20022.repository.codeset.PaymentPurpose1Code.ChildBenefit, com.tools20022.repository.codeset.PaymentPurpose1Code.UnemploymentDisabilityBenefit,
						com.tools20022.repository.codeset.PaymentPurpose1Code.BonusPayment, com.tools20022.repository.codeset.PaymentPurpose1Code.CashManagementTransfer,
						com.tools20022.repository.codeset.PaymentPurpose1Code.CapitalBuilding, com.tools20022.repository.codeset.PaymentPurpose1Code.CharityPayment, com.tools20022.repository.codeset.PaymentPurpose1Code.CollectionPayment,
						com.tools20022.repository.codeset.PaymentPurpose1Code.CommodityTransfer, com.tools20022.repository.codeset.PaymentPurpose1Code.CommercialPayment, com.tools20022.repository.codeset.PaymentPurpose1Code.Commission,
						com.tools20022.repository.codeset.PaymentPurpose1Code.Costs, com.tools20022.repository.codeset.PaymentPurpose1Code.Copyright, com.tools20022.repository.codeset.PaymentPurpose1Code.Dividend,
						com.tools20022.repository.codeset.PaymentPurpose1Code.ForeignExchange, com.tools20022.repository.codeset.PaymentPurpose1Code.PurchaseSaleOfGoods,
						com.tools20022.repository.codeset.PaymentPurpose1Code.GovernmentPayment, com.tools20022.repository.codeset.PaymentPurpose1Code.InstalmentHirePurchaseAgreement,
						com.tools20022.repository.codeset.PaymentPurpose1Code.IntraCompanyPayment, com.tools20022.repository.codeset.PaymentPurpose1Code.InsurancePremium, com.tools20022.repository.codeset.PaymentPurpose1Code.Interest,
						com.tools20022.repository.codeset.PaymentPurpose1Code.LicenseFee, com.tools20022.repository.codeset.PaymentPurpose1Code.Loan, com.tools20022.repository.codeset.PaymentPurpose1Code.LoanRepayment,
						com.tools20022.repository.codeset.PaymentPurpose1Code.Netting, com.tools20022.repository.codeset.PaymentPurpose1Code.Payroll, com.tools20022.repository.codeset.PaymentPurpose1Code.PensionPayment,
						com.tools20022.repository.codeset.PaymentPurpose1Code.Refund, com.tools20022.repository.codeset.PaymentPurpose1Code.Rent, com.tools20022.repository.codeset.PaymentPurpose1Code.Royalties,
						com.tools20022.repository.codeset.PaymentPurpose1Code.PurchaseSaleOfServices, com.tools20022.repository.codeset.PaymentPurpose1Code.Securities,
						com.tools20022.repository.codeset.PaymentPurpose1Code.SocialSecurityBenefit, com.tools20022.repository.codeset.PaymentPurpose1Code.Subscription, com.tools20022.repository.codeset.PaymentPurpose1Code.TaxPayment,
						com.tools20022.repository.codeset.PaymentPurpose1Code.ValueAddedTaxPayment, com.tools20022.repository.codeset.PaymentPurpose1Code.ConsumerThirdPartyConsolidatedPayment,
						com.tools20022.repository.codeset.PaymentPurpose1Code.DebitCollectionPayment, com.tools20022.repository.codeset.PaymentPurpose1Code.SupplierPayment, com.tools20022.repository.codeset.PaymentPurpose1Code.Hedging);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SalaryPayment.getCodeName().get(), SalaryPayment);
		codesByName.put(TreasuryPayment.getCodeName().get(), TreasuryPayment);
		codesByName.put(AdvancePayment.getCodeName().get(), AdvancePayment);
		codesByName.put(AgriculturalTransfer.getCodeName().get(), AgriculturalTransfer);
		codesByName.put(AlimonyPayment.getCodeName().get(), AlimonyPayment);
		codesByName.put(ChildBenefit.getCodeName().get(), ChildBenefit);
		codesByName.put(UnemploymentDisabilityBenefit.getCodeName().get(), UnemploymentDisabilityBenefit);
		codesByName.put(BonusPayment.getCodeName().get(), BonusPayment);
		codesByName.put(CashManagementTransfer.getCodeName().get(), CashManagementTransfer);
		codesByName.put(CapitalBuilding.getCodeName().get(), CapitalBuilding);
		codesByName.put(CharityPayment.getCodeName().get(), CharityPayment);
		codesByName.put(CollectionPayment.getCodeName().get(), CollectionPayment);
		codesByName.put(CommodityTransfer.getCodeName().get(), CommodityTransfer);
		codesByName.put(CommercialPayment.getCodeName().get(), CommercialPayment);
		codesByName.put(Commission.getCodeName().get(), Commission);
		codesByName.put(Costs.getCodeName().get(), Costs);
		codesByName.put(Copyright.getCodeName().get(), Copyright);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(ForeignExchange.getCodeName().get(), ForeignExchange);
		codesByName.put(PurchaseSaleOfGoods.getCodeName().get(), PurchaseSaleOfGoods);
		codesByName.put(GovernmentPayment.getCodeName().get(), GovernmentPayment);
		codesByName.put(InstalmentHirePurchaseAgreement.getCodeName().get(), InstalmentHirePurchaseAgreement);
		codesByName.put(IntraCompanyPayment.getCodeName().get(), IntraCompanyPayment);
		codesByName.put(InsurancePremium.getCodeName().get(), InsurancePremium);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(LicenseFee.getCodeName().get(), LicenseFee);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(LoanRepayment.getCodeName().get(), LoanRepayment);
		codesByName.put(Netting.getCodeName().get(), Netting);
		codesByName.put(Payroll.getCodeName().get(), Payroll);
		codesByName.put(PensionPayment.getCodeName().get(), PensionPayment);
		codesByName.put(Refund.getCodeName().get(), Refund);
		codesByName.put(Rent.getCodeName().get(), Rent);
		codesByName.put(Royalties.getCodeName().get(), Royalties);
		codesByName.put(PurchaseSaleOfServices.getCodeName().get(), PurchaseSaleOfServices);
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(SocialSecurityBenefit.getCodeName().get(), SocialSecurityBenefit);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(TaxPayment.getCodeName().get(), TaxPayment);
		codesByName.put(ValueAddedTaxPayment.getCodeName().get(), ValueAddedTaxPayment);
		codesByName.put(ConsumerThirdPartyConsolidatedPayment.getCodeName().get(), ConsumerThirdPartyConsolidatedPayment);
		codesByName.put(DebitCollectionPayment.getCodeName().get(), DebitCollectionPayment);
		codesByName.put(SupplierPayment.getCodeName().get(), SupplierPayment);
		codesByName.put(Hedging.getCodeName().get(), Hedging);
	}

	public static PaymentPurpose1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentPurpose1Code[] values() {
		PaymentPurpose1Code[] values = new PaymentPurpose1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentPurpose1Code> {
		@Override
		public PaymentPurpose1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentPurpose1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}