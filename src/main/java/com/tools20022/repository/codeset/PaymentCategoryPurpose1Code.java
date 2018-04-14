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
import com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of transaction that resulted in the payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#TradeSettlementPayment
 * PaymentCategoryPurpose1Code.TradeSettlementPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#SalaryPayment
 * PaymentCategoryPurpose1Code.SalaryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#TreasuryPayment
 * PaymentCategoryPurpose1Code.TreasuryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#CashManagementTransfer
 * PaymentCategoryPurpose1Code.CashManagementTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#Dividend
 * PaymentCategoryPurpose1Code.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#GovernmentPayment
 * PaymentCategoryPurpose1Code.GovernmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#Interest
 * PaymentCategoryPurpose1Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#Loan
 * PaymentCategoryPurpose1Code.Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#PensionPayment
 * PaymentCategoryPurpose1Code.PensionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#Securities
 * PaymentCategoryPurpose1Code.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#SocialSecurityBenefit
 * PaymentCategoryPurpose1Code.SocialSecurityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#SupplierPayment
 * PaymentCategoryPurpose1Code.SupplierPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#TaxPayment
 * PaymentCategoryPurpose1Code.TaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#Trade
 * PaymentCategoryPurpose1Code.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#ValueAddedTaxPayment
 * PaymentCategoryPurpose1Code.ValueAddedTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#Hedging
 * PaymentCategoryPurpose1Code.Hedging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#IntraCompanyPayment
 * PaymentCategoryPurpose1Code.IntraCompanyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#WithHolding
 * PaymentCategoryPurpose1Code.WithHolding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
 * PaymentCategoryPurposeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCategoryPurpose1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of transaction that resulted in the payment."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CORT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentCategoryPurpose1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlementPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code TradeSettlementPayment = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlementPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.TradeSettlementPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code SalaryPayment = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SalaryPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.SalaryPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code TreasuryPayment = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.TreasuryPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code CashManagementTransfer = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashManagementTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.CashManagementTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code Dividend = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.Dividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code GovernmentPayment = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.GovernmentPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code Interest = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code Loan = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.Loan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code PensionPayment = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.PensionPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code Securities = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.Securities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code SocialSecurityBenefit = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityBenefit";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.SocialSecurityBenefit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplierPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code SupplierPayment = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplierPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.SupplierPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code TaxPayment = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.TaxPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code Trade = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.Trade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code ValueAddedTaxPayment = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTaxPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.ValueAddedTaxPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hedging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code Hedging = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hedging";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.Hedging.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code IntraCompanyPayment = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraCompanyPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.IntraCompanyPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentCategoryPurpose1Code WithHolding = new PaymentCategoryPurpose1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithHolding";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmObject();
			codeName = PaymentCategoryPurposeCode.WithHolding.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PaymentCategoryPurpose1Code> codesByName = new LinkedHashMap<>();

	protected PaymentCategoryPurpose1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CORT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCategoryPurpose1Code";
				definition = "Specifies the type of transaction that resulted in the payment.";
				trace_lazy = () -> PaymentCategoryPurposeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.TradeSettlementPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.SalaryPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.TreasuryPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.CashManagementTransfer,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.Dividend, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.GovernmentPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.Interest, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.Loan,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.PensionPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.Securities,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.SocialSecurityBenefit, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.SupplierPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.TaxPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.Trade,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.ValueAddedTaxPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.Hedging,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.IntraCompanyPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.WithHolding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TradeSettlementPayment.getCodeName().get(), TradeSettlementPayment);
		codesByName.put(SalaryPayment.getCodeName().get(), SalaryPayment);
		codesByName.put(TreasuryPayment.getCodeName().get(), TreasuryPayment);
		codesByName.put(CashManagementTransfer.getCodeName().get(), CashManagementTransfer);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(GovernmentPayment.getCodeName().get(), GovernmentPayment);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(PensionPayment.getCodeName().get(), PensionPayment);
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(SocialSecurityBenefit.getCodeName().get(), SocialSecurityBenefit);
		codesByName.put(SupplierPayment.getCodeName().get(), SupplierPayment);
		codesByName.put(TaxPayment.getCodeName().get(), TaxPayment);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(ValueAddedTaxPayment.getCodeName().get(), ValueAddedTaxPayment);
		codesByName.put(Hedging.getCodeName().get(), Hedging);
		codesByName.put(IntraCompanyPayment.getCodeName().get(), IntraCompanyPayment);
		codesByName.put(WithHolding.getCodeName().get(), WithHolding);
	}

	public static PaymentCategoryPurpose1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentCategoryPurpose1Code[] values() {
		PaymentCategoryPurpose1Code[] values = new PaymentCategoryPurpose1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentCategoryPurpose1Code> {
		@Override
		public PaymentCategoryPurpose1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentCategoryPurpose1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}