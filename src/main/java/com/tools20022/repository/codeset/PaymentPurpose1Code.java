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
import com.tools20022.repository.codeset.PaymentPurposeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of transaction that resulted in a payment initiation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
 * PaymentPurposeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmSalaryPayment
 * PaymentPurpose1Code.mmSalaryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmTreasuryPayment
 * PaymentPurpose1Code.mmTreasuryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmAdvancePayment
 * PaymentPurpose1Code.mmAdvancePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmAgriculturalTransfer
 * PaymentPurpose1Code.mmAgriculturalTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmAlimonyPayment
 * PaymentPurpose1Code.mmAlimonyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmChildBenefit
 * PaymentPurpose1Code.mmChildBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmUnemploymentDisabilityBenefit
 * PaymentPurpose1Code.mmUnemploymentDisabilityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmBonusPayment
 * PaymentPurpose1Code.mmBonusPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmCashManagementTransfer
 * PaymentPurpose1Code.mmCashManagementTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmCapitalBuilding
 * PaymentPurpose1Code.mmCapitalBuilding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmCharityPayment
 * PaymentPurpose1Code.mmCharityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmCollectionPayment
 * PaymentPurpose1Code.mmCollectionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmCommodityTransfer
 * PaymentPurpose1Code.mmCommodityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmCommercialPayment
 * PaymentPurpose1Code.mmCommercialPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmCommission
 * PaymentPurpose1Code.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmCosts
 * PaymentPurpose1Code.mmCosts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmCopyright
 * PaymentPurpose1Code.mmCopyright}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmDividend
 * PaymentPurpose1Code.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmForeignExchange
 * PaymentPurpose1Code.mmForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmPurchaseSaleOfGoods
 * PaymentPurpose1Code.mmPurchaseSaleOfGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmGovernmentPayment
 * PaymentPurpose1Code.mmGovernmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmInstalmentHirePurchaseAgreement
 * PaymentPurpose1Code.mmInstalmentHirePurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmIntraCompanyPayment
 * PaymentPurpose1Code.mmIntraCompanyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmInsurancePremium
 * PaymentPurpose1Code.mmInsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmInterest
 * PaymentPurpose1Code.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmLicenseFee
 * PaymentPurpose1Code.mmLicenseFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmLoan
 * PaymentPurpose1Code.mmLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmLoanRepayment
 * PaymentPurpose1Code.mmLoanRepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmNetting
 * PaymentPurpose1Code.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmPayroll
 * PaymentPurpose1Code.mmPayroll}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmPensionPayment
 * PaymentPurpose1Code.mmPensionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmRefund
 * PaymentPurpose1Code.mmRefund}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmRent
 * PaymentPurpose1Code.mmRent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmRoyalties
 * PaymentPurpose1Code.mmRoyalties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmPurchaseSaleOfServices
 * PaymentPurpose1Code.mmPurchaseSaleOfServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmSecurities
 * PaymentPurpose1Code.mmSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmSocialSecurityBenefit
 * PaymentPurpose1Code.mmSocialSecurityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmSubscription
 * PaymentPurpose1Code.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmTaxPayment
 * PaymentPurpose1Code.mmTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmValueAddedTaxPayment
 * PaymentPurpose1Code.mmValueAddedTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmConsumerThirdPartyConsolidatedPayment
 * PaymentPurpose1Code.mmConsumerThirdPartyConsolidatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmDebitCollectionPayment
 * PaymentPurpose1Code.mmDebitCollectionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmSupplierPayment
 * PaymentPurpose1Code.mmSupplierPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code#mmHedging
 * PaymentPurpose1Code.mmHedging}</li>
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
 * <li>"SALA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentPurpose1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of transaction that resulted in a payment initiation."</li>
 * </ul>
 */
public class PaymentPurpose1Code extends PaymentPurposeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurpose1Code
	 * PaymentPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmSalaryPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SalaryPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmTreasuryPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvancePayment"</li>
	 * </ul>
	 */
	public static final MMCode mmAdvancePayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvancePayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgriculturalTransfer"</li>
	 * </ul>
	 */
	public static final MMCode mmAgriculturalTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgriculturalTransfer";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlimonyPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmAlimonyPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlimonyPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChildBenefit"</li>
	 * </ul>
	 */
	public static final MMCode mmChildBenefit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChildBenefit";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnemploymentDisabilityBenefit"</li>
	 * </ul>
	 */
	public static final MMCode mmUnemploymentDisabilityBenefit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnemploymentDisabilityBenefit";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmBonusPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementTransfer"</li>
	 * </ul>
	 */
	public static final MMCode mmCashManagementTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashManagementTransfer";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalBuilding"</li>
	 * </ul>
	 */
	public static final MMCode mmCapitalBuilding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalBuilding";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CharityPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmCharityPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CharityPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmCollectionPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommodityTransfer"</li>
	 * </ul>
	 */
	public static final MMCode mmCommodityTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommodityTransfer";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmCommercialPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * </ul>
	 */
	public static final MMCode mmCommission = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Costs"</li>
	 * </ul>
	 */
	public static final MMCode mmCosts = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Costs";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copyright"</li>
	 * </ul>
	 */
	public static final MMCode mmCopyright = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Copyright";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * </ul>
	 */
	public static final MMCode mmDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignExchange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfGoods"</li>
	 * </ul>
	 */
	public static final MMCode mmPurchaseSaleOfGoods = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseSaleOfGoods";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmGovernmentPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentHirePurchaseAgreement"</li>
	 * </ul>
	 */
	public static final MMCode mmInstalmentHirePurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentHirePurchaseAgreement";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmIntraCompanyPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraCompanyPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremium"</li>
	 * </ul>
	 */
	public static final MMCode mmInsurancePremium = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsurancePremium";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final MMCode mmInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LicenseFee"</li>
	 * </ul>
	 */
	public static final MMCode mmLicenseFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LicenseFee";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * </ul>
	 */
	public static final MMCode mmLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoanRepayment"</li>
	 * </ul>
	 */
	public static final MMCode mmLoanRepayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LoanRepayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * </ul>
	 */
	public static final MMCode mmNetting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payroll"</li>
	 * </ul>
	 */
	public static final MMCode mmPayroll = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payroll";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmPensionPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * </ul>
	 */
	public static final MMCode mmRefund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rent"</li>
	 * </ul>
	 */
	public static final MMCode mmRent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rent";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Royalties"</li>
	 * </ul>
	 */
	public static final MMCode mmRoyalties = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Royalties";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfServices"</li>
	 * </ul>
	 */
	public static final MMCode mmPurchaseSaleOfServices = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseSaleOfServices";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * </ul>
	 */
	public static final MMCode mmSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityBenefit"</li>
	 * </ul>
	 */
	public static final MMCode mmSocialSecurityBenefit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityBenefit";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * </ul>
	 */
	public static final MMCode mmSubscription = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmTaxPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmValueAddedTaxPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTaxPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumerThirdPartyConsolidatedPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmConsumerThirdPartyConsolidatedPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumerThirdPartyConsolidatedPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCollectionPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmDebitCollectionPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCollectionPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplierPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmSupplierPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplierPayment";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hedging"</li>
	 * </ul>
	 */
	public static final MMCode mmHedging = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hedging";
			owner_lazy = () -> PaymentPurpose1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SALA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentPurpose1Code";
				definition = "Specifies the type of transaction that resulted in a payment initiation.";
				code_lazy = () -> Arrays.asList(PaymentPurpose1Code.mmSalaryPayment, PaymentPurpose1Code.mmTreasuryPayment, PaymentPurpose1Code.mmAdvancePayment, PaymentPurpose1Code.mmAgriculturalTransfer,
						PaymentPurpose1Code.mmAlimonyPayment, PaymentPurpose1Code.mmChildBenefit, PaymentPurpose1Code.mmUnemploymentDisabilityBenefit, PaymentPurpose1Code.mmBonusPayment, PaymentPurpose1Code.mmCashManagementTransfer,
						PaymentPurpose1Code.mmCapitalBuilding, PaymentPurpose1Code.mmCharityPayment, PaymentPurpose1Code.mmCollectionPayment, PaymentPurpose1Code.mmCommodityTransfer, PaymentPurpose1Code.mmCommercialPayment,
						PaymentPurpose1Code.mmCommission, PaymentPurpose1Code.mmCosts, PaymentPurpose1Code.mmCopyright, PaymentPurpose1Code.mmDividend, PaymentPurpose1Code.mmForeignExchange, PaymentPurpose1Code.mmPurchaseSaleOfGoods,
						PaymentPurpose1Code.mmGovernmentPayment, PaymentPurpose1Code.mmInstalmentHirePurchaseAgreement, PaymentPurpose1Code.mmIntraCompanyPayment, PaymentPurpose1Code.mmInsurancePremium, PaymentPurpose1Code.mmInterest,
						PaymentPurpose1Code.mmLicenseFee, PaymentPurpose1Code.mmLoan, PaymentPurpose1Code.mmLoanRepayment, PaymentPurpose1Code.mmNetting, PaymentPurpose1Code.mmPayroll, PaymentPurpose1Code.mmPensionPayment,
						PaymentPurpose1Code.mmRefund, PaymentPurpose1Code.mmRent, PaymentPurpose1Code.mmRoyalties, PaymentPurpose1Code.mmPurchaseSaleOfServices, PaymentPurpose1Code.mmSecurities, PaymentPurpose1Code.mmSocialSecurityBenefit,
						PaymentPurpose1Code.mmSubscription, PaymentPurpose1Code.mmTaxPayment, PaymentPurpose1Code.mmValueAddedTaxPayment, PaymentPurpose1Code.mmConsumerThirdPartyConsolidatedPayment,
						PaymentPurpose1Code.mmDebitCollectionPayment, PaymentPurpose1Code.mmSupplierPayment, PaymentPurpose1Code.mmHedging);
				trace_lazy = () -> PaymentPurposeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}