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
import com.tools20022.repository.codeset.CreditTransferTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#IntraCompanyPayment
 * CreditTransferTypeCode.IntraCompanyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#TradeSettlementPayment
 * CreditTransferTypeCode.TradeSettlementPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#SalaryPayment
 * CreditTransferTypeCode.SalaryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#TreasuryPayment
 * CreditTransferTypeCode.TreasuryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#SweepAccount
 * CreditTransferTypeCode.SweepAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#TopAccount
 * CreditTransferTypeCode.TopAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#ZeroBalanceAccount
 * CreditTransferTypeCode.ZeroBalanceAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#AdvancePayment
 * CreditTransferTypeCode.AdvancePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#AgriculturalTransfer
 * CreditTransferTypeCode.AgriculturalTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#AlimonyPayment
 * CreditTransferTypeCode.AlimonyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#ChildBenefit
 * CreditTransferTypeCode.ChildBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#UnemploymentDisabilityBenefit
 * CreditTransferTypeCode.UnemploymentDisabilityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#BonusPayment
 * CreditTransferTypeCode.BonusPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#CashManagementTransfer
 * CreditTransferTypeCode.CashManagementTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#CapitalBuilding
 * CreditTransferTypeCode.CapitalBuilding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#CharityPayment
 * CreditTransferTypeCode.CharityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#CommodityTransfer
 * CreditTransferTypeCode.CommodityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#CommercialCredit
 * CreditTransferTypeCode.CommercialCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Commission
 * CreditTransferTypeCode.Commission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Costs
 * CreditTransferTypeCode.Costs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Copyright
 * CreditTransferTypeCode.Copyright}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Dividend
 * CreditTransferTypeCode.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#ForeignExchange
 * CreditTransferTypeCode.ForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#PurchaseSaleOfGoods
 * CreditTransferTypeCode.PurchaseSaleOfGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#GovernmentPayment
 * CreditTransferTypeCode.GovernmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#InstalmentHirePurchaseAgreement
 * CreditTransferTypeCode.InstalmentHirePurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#InsurancePremium
 * CreditTransferTypeCode.InsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Interest
 * CreditTransferTypeCode.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#LicenseFee
 * CreditTransferTypeCode.LicenseFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Loan
 * CreditTransferTypeCode.Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#LoanRepayment
 * CreditTransferTypeCode.LoanRepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Netting
 * CreditTransferTypeCode.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#PensionPayment
 * CreditTransferTypeCode.PensionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Refund
 * CreditTransferTypeCode.Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Rent
 * CreditTransferTypeCode.Rent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Royalties
 * CreditTransferTypeCode.Royalties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#PurchaseSaleOfServices
 * CreditTransferTypeCode.PurchaseSaleOfServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Securities
 * CreditTransferTypeCode.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#SocialSecurityBenefit
 * CreditTransferTypeCode.SocialSecurityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Subscription
 * CreditTransferTypeCode.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#TaxPayment
 * CreditTransferTypeCode.TaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#ValueAddedTaxPayment
 * CreditTransferTypeCode.ValueAddedTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#SupplierPayment
 * CreditTransferTypeCode.SupplierPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Hedging
 * CreditTransferTypeCode.Hedging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#Trade
 * CreditTransferTypeCode.Trade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditTransferTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of transaction that resulted in the payment."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INTC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CreditTransferTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is an intra-company payment, ie, a payment between two
	 * companies belonging to the same group.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode IntraCompanyPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "IntraCompanyPayment";
			definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "INTC";
		}
	};
	/**
	 * Transaction is related to settlement of a trade, eg a foreign exchange
	 * deal or a securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlementPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to settlement of a trade, eg a foreign exchange deal or a securities transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode TradeSettlementPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "TradeSettlementPayment";
			definition = "Transaction is related to settlement of a trade, eg a foreign exchange deal or a securities transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "CORT";
		}
	};
	/**
	 * Transaction is the payment of salaries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SALA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of salaries."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode SalaryPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "SalaryPayment";
			definition = "Transaction is the payment of salaries.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "SALA";
		}
	};
	/**
	 * Transaction is related to treasury operations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to treasury operations."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode TreasuryPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "TreasuryPayment";
			definition = "Transaction is related to treasury operations.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Transaction is a cash management instruction, requesting to sweep the
	 * account of the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMSW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SweepAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cash management instruction, requesting to sweep the account of the debtor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode SweepAccount = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "SweepAccount";
			definition = "Transaction is a cash management instruction, requesting to sweep the account of the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "CMSW";
		}
	};
	/**
	 * Transaction is a cash management instruction, requesting to top the
	 * account of the debtor above a certain floor amount. The floor amount, if
	 * not pre-agreed by the parties involved, may be specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMTO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cash management instruction, requesting to top the account of the debtor above a certain floor amount. The floor amount, if not pre-agreed by the parties involved, may be specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode TopAccount = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "TopAccount";
			definition = "Transaction is a cash management instruction, requesting to top the account of the debtor above a certain floor amount. The floor amount, if not pre-agreed by the parties involved, may be specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "CMTO";
		}
	};
	/**
	 * Transaction is a cash management instruction, requesting to zero balance
	 * the account of the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMZB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroBalanceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cash management instruction, requesting to zero balance the account of the debtor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode ZeroBalanceAccount = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ZeroBalanceAccount";
			definition = "Transaction is a cash management instruction, requesting to zero balance the account of the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "CMZB";
		}
	};
	/**
	 * Transaction is an advance payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADVA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvancePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an advance payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode AdvancePayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "AdvancePayment";
			definition = "Transaction is an advance payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "ADVA";
		}
	};
	/**
	 * Transaction is related to the agricultural domain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGRT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgriculturalTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to the agricultural domain."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode AgriculturalTransfer = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "AgriculturalTransfer";
			definition = "Transaction is related to the agricultural domain.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "AGRT";
		}
	};
	/**
	 * Transaction is the payment of alimony.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALMY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlimonyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of alimony."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode AlimonyPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "AlimonyPayment";
			definition = "Transaction is the payment of alimony.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "ALMY";
		}
	};
	/**
	 * Transaction is related to a payment made to assist parent/guardian to
	 * maintain child.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BECH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChildBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment made to assist parent/guardian to maintain child."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode ChildBenefit = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ChildBenefit";
			definition = "Transaction is related to a payment made to assist parent/guardian to maintain child.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "BECH";
		}
	};
	/**
	 * Transaction is related to a payment to person unemployed/disabled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnemploymentDisabilityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment to person unemployed/disabled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode UnemploymentDisabilityBenefit = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "UnemploymentDisabilityBenefit";
			definition = "Transaction is related to a payment to person unemployed/disabled.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "BENE";
		}
	};
	/**
	 * Transaction is related to payment of a bonus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BONU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to payment of a bonus."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode BonusPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "BonusPayment";
			definition = "Transaction is related to payment of a bonus.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "BONU";
		}
	};
	/**
	 * Transaction is a general cash management instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a general cash management instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode CashManagementTransfer = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "CashManagementTransfer";
			definition = "Transaction is a general cash management instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Transaction is related to capital building fringe fortune. Capital
	 * building for retirement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBFF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalBuilding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to capital building fringe fortune. Capital building for retirement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode CapitalBuilding = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "CapitalBuilding";
			definition = "Transaction is related to capital building fringe fortune. Capital building for retirement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "CBFF";
		}
	};
	/**
	 * Transaction is a payment for charity reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CharityPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment for charity reasons."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode CharityPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "CharityPayment";
			definition = "Transaction is a payment for charity reasons.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Transaction is payment of commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMDT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommodityTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of commodities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode CommodityTransfer = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "CommodityTransfer";
			definition = "Transaction is payment of commodities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "CMDT";
		}
	};
	/**
	 * Transaction is payment of commercial credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of commercial credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode CommercialCredit = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "CommercialCredit";
			definition = "Transaction is payment of commercial credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "COMC";
		}
	};
	/**
	 * Transaction is payment of commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Commission = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Commission";
			definition = "Transaction is payment of commission.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Transaction is related to payment of costs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Costs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to payment of costs."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Costs = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Costs";
			definition = "Transaction is related to payment of costs.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "COST";
		}
	};
	/**
	 * Transaction is payment of copyright.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPYR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copyright"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of copyright."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Copyright = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Copyright";
			definition = "Transaction is payment of copyright.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "CPYR";
		}
	};
	/**
	 * Transaction is the payment of dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of dividends."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Dividend = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Dividend";
			definition = "Transaction is the payment of dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Transaction is related to a foreign exchange operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a foreign exchange operation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode ForeignExchange = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ForeignExchange";
			definition = "Transaction is related to a foreign exchange operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "FREX";
		}
	};
	/**
	 * Transaction is related to purchase and sale of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GDDS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to purchase and sale of goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode PurchaseSaleOfGoods = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "PurchaseSaleOfGoods";
			definition = "Transaction is related to purchase and sale of goods.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "GDDS";
		}
	};
	/**
	 * Transaction is a payment to or from a government department.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOVT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment to or from a government department."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode GovernmentPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "GovernmentPayment";
			definition = "Transaction is a payment to or from a government department.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "GOVT";
		}
	};
	/**
	 * Transaction is payment for Instalment/hire-purchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IHRP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentHirePurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is payment for Instalment/hire-purchase agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode InstalmentHirePurchaseAgreement = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "InstalmentHirePurchaseAgreement";
			definition = "Transaction is payment for Instalment/hire-purchase agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "IHRP";
		}
	};
	/**
	 * Transaction is payment of an insurance premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of an insurance premium."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode InsurancePremium = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "InsurancePremium";
			definition = "Transaction is payment of an insurance premium.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Transaction is the payment of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of interest."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Interest = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Interest";
			definition = "Transaction is the payment of interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Transaction is payment of a license fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LICF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LicenseFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of a license fee."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode LicenseFee = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "LicenseFee";
			definition = "Transaction is payment of a license fee.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "LICF";
		}
	};
	/**
	 * Transaction is related to the transfer of a loan to a borrower.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to the transfer of a loan to a borrower."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Loan = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Loan";
			definition = "Transaction is related to the transfer of a loan to a borrower.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Transaction is related to repayment of loan to lender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoanRepayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to repayment of loan to lender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode LoanRepayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "LoanRepayment";
			definition = "Transaction is related to repayment of loan to lender.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "LOAR";
		}
	};
	/**
	 * Transaction is related to a netting operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a netting operation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Netting = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Netting";
			definition = "Transaction is related to a netting operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Transaction is the payment of pension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of pension."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode PensionPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "PensionPayment";
			definition = "Transaction is the payment of pension.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "PENS";
		}
	};
	/**
	 * Transaction is the payment of a refund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of a refund."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Refund = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Refund";
			definition = "Transaction is the payment of a refund.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "REFU";
		}
	};
	/**
	 * Transaction is the payment of rent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RENT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of rent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Rent = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Rent";
			definition = "Transaction is the payment of rent.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "RENT";
		}
	};
	/**
	 * Transaction is the payment of royalties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROYA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Royalties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of royalties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Royalties = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Royalties";
			definition = "Transaction is the payment of royalties.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "ROYA";
		}
	};
	/**
	 * Transaction is related to purchase and sale of services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCVE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to purchase and sale of services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode PurchaseSaleOfServices = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "PurchaseSaleOfServices";
			definition = "Transaction is related to purchase and sale of services.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "SCVE";
		}
	};
	/**
	 * Transaction is the payment of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Securities = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Securities";
			definition = "Transaction is the payment of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Transaction is a social security benefit, ie payment made by a government
	 * to support individuals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSBE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a social security benefit, ie payment made by a government to support individuals."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode SocialSecurityBenefit = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "SocialSecurityBenefit";
			definition = "Transaction is a social security benefit, ie payment made by a government to support individuals.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "SSBE";
		}
	};
	/**
	 * Transaction is payment of a subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of a subscription."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Subscription = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Subscription";
			definition = "Transaction is payment of a subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Transaction is the payment of taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of taxes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode TaxPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "TaxPayment";
			definition = "Transaction is the payment of taxes.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "TAXS";
		}
	};
	/**
	 * Transaction is the payment of value added tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VATX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of value added tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode ValueAddedTaxPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ValueAddedTaxPayment";
			definition = "Transaction is the payment of value added tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "VATX";
		}
	};
	/**
	 * Transaction is related to a payment to a supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUPP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplierPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment to a supplier."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode SupplierPayment = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "SupplierPayment";
			definition = "Transaction is related to a payment to a supplier.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "SUPP";
		}
	};
	/**
	 * Transaction is related to the payment of a hedging operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HEDG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hedging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to the payment of a hedging operation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Hedging = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Hedging";
			definition = "Transaction is related to the payment of a hedging operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "HEDG";
		}
	};
	/**
	 * Transaction is related to the payment of a trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode
	 * CreditTransferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to the payment of a trade transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final CreditTransferTypeCode Trade = new CreditTransferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Trade";
			definition = "Transaction is related to the payment of a trade transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditTransferTypeCode.mmObject();
			codeName = "TRAD";
		}
	};
	final static private LinkedHashMap<String, CreditTransferTypeCode> codesByName = new LinkedHashMap<>();

	protected CreditTransferTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INTC");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "CreditTransferTypeCode";
				definition = "Specifies the type of transaction that resulted in the payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CreditTransferTypeCode.IntraCompanyPayment, com.tools20022.repository.codeset.CreditTransferTypeCode.TradeSettlementPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.SalaryPayment, com.tools20022.repository.codeset.CreditTransferTypeCode.TreasuryPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.SweepAccount, com.tools20022.repository.codeset.CreditTransferTypeCode.TopAccount,
						com.tools20022.repository.codeset.CreditTransferTypeCode.ZeroBalanceAccount, com.tools20022.repository.codeset.CreditTransferTypeCode.AdvancePayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.AgriculturalTransfer, com.tools20022.repository.codeset.CreditTransferTypeCode.AlimonyPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.ChildBenefit, com.tools20022.repository.codeset.CreditTransferTypeCode.UnemploymentDisabilityBenefit,
						com.tools20022.repository.codeset.CreditTransferTypeCode.BonusPayment, com.tools20022.repository.codeset.CreditTransferTypeCode.CashManagementTransfer,
						com.tools20022.repository.codeset.CreditTransferTypeCode.CapitalBuilding, com.tools20022.repository.codeset.CreditTransferTypeCode.CharityPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.CommodityTransfer, com.tools20022.repository.codeset.CreditTransferTypeCode.CommercialCredit,
						com.tools20022.repository.codeset.CreditTransferTypeCode.Commission, com.tools20022.repository.codeset.CreditTransferTypeCode.Costs, com.tools20022.repository.codeset.CreditTransferTypeCode.Copyright,
						com.tools20022.repository.codeset.CreditTransferTypeCode.Dividend, com.tools20022.repository.codeset.CreditTransferTypeCode.ForeignExchange,
						com.tools20022.repository.codeset.CreditTransferTypeCode.PurchaseSaleOfGoods, com.tools20022.repository.codeset.CreditTransferTypeCode.GovernmentPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.InstalmentHirePurchaseAgreement, com.tools20022.repository.codeset.CreditTransferTypeCode.InsurancePremium,
						com.tools20022.repository.codeset.CreditTransferTypeCode.Interest, com.tools20022.repository.codeset.CreditTransferTypeCode.LicenseFee, com.tools20022.repository.codeset.CreditTransferTypeCode.Loan,
						com.tools20022.repository.codeset.CreditTransferTypeCode.LoanRepayment, com.tools20022.repository.codeset.CreditTransferTypeCode.Netting, com.tools20022.repository.codeset.CreditTransferTypeCode.PensionPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.Refund, com.tools20022.repository.codeset.CreditTransferTypeCode.Rent, com.tools20022.repository.codeset.CreditTransferTypeCode.Royalties,
						com.tools20022.repository.codeset.CreditTransferTypeCode.PurchaseSaleOfServices, com.tools20022.repository.codeset.CreditTransferTypeCode.Securities,
						com.tools20022.repository.codeset.CreditTransferTypeCode.SocialSecurityBenefit, com.tools20022.repository.codeset.CreditTransferTypeCode.Subscription,
						com.tools20022.repository.codeset.CreditTransferTypeCode.TaxPayment, com.tools20022.repository.codeset.CreditTransferTypeCode.ValueAddedTaxPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.SupplierPayment, com.tools20022.repository.codeset.CreditTransferTypeCode.Hedging, com.tools20022.repository.codeset.CreditTransferTypeCode.Trade);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IntraCompanyPayment.getCodeName().get(), IntraCompanyPayment);
		codesByName.put(TradeSettlementPayment.getCodeName().get(), TradeSettlementPayment);
		codesByName.put(SalaryPayment.getCodeName().get(), SalaryPayment);
		codesByName.put(TreasuryPayment.getCodeName().get(), TreasuryPayment);
		codesByName.put(SweepAccount.getCodeName().get(), SweepAccount);
		codesByName.put(TopAccount.getCodeName().get(), TopAccount);
		codesByName.put(ZeroBalanceAccount.getCodeName().get(), ZeroBalanceAccount);
		codesByName.put(AdvancePayment.getCodeName().get(), AdvancePayment);
		codesByName.put(AgriculturalTransfer.getCodeName().get(), AgriculturalTransfer);
		codesByName.put(AlimonyPayment.getCodeName().get(), AlimonyPayment);
		codesByName.put(ChildBenefit.getCodeName().get(), ChildBenefit);
		codesByName.put(UnemploymentDisabilityBenefit.getCodeName().get(), UnemploymentDisabilityBenefit);
		codesByName.put(BonusPayment.getCodeName().get(), BonusPayment);
		codesByName.put(CashManagementTransfer.getCodeName().get(), CashManagementTransfer);
		codesByName.put(CapitalBuilding.getCodeName().get(), CapitalBuilding);
		codesByName.put(CharityPayment.getCodeName().get(), CharityPayment);
		codesByName.put(CommodityTransfer.getCodeName().get(), CommodityTransfer);
		codesByName.put(CommercialCredit.getCodeName().get(), CommercialCredit);
		codesByName.put(Commission.getCodeName().get(), Commission);
		codesByName.put(Costs.getCodeName().get(), Costs);
		codesByName.put(Copyright.getCodeName().get(), Copyright);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(ForeignExchange.getCodeName().get(), ForeignExchange);
		codesByName.put(PurchaseSaleOfGoods.getCodeName().get(), PurchaseSaleOfGoods);
		codesByName.put(GovernmentPayment.getCodeName().get(), GovernmentPayment);
		codesByName.put(InstalmentHirePurchaseAgreement.getCodeName().get(), InstalmentHirePurchaseAgreement);
		codesByName.put(InsurancePremium.getCodeName().get(), InsurancePremium);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(LicenseFee.getCodeName().get(), LicenseFee);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(LoanRepayment.getCodeName().get(), LoanRepayment);
		codesByName.put(Netting.getCodeName().get(), Netting);
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
		codesByName.put(SupplierPayment.getCodeName().get(), SupplierPayment);
		codesByName.put(Hedging.getCodeName().get(), Hedging);
		codesByName.put(Trade.getCodeName().get(), Trade);
	}

	public static CreditTransferTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CreditTransferTypeCode[] values() {
		CreditTransferTypeCode[] values = new CreditTransferTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CreditTransferTypeCode> {
		@Override
		public CreditTransferTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CreditTransferTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}