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
 * Specifies the type of transaction that resulted in the payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmIntraCompanyPayment
 * CreditTransferTypeCode.mmIntraCompanyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmTradeSettlementPayment
 * CreditTransferTypeCode.mmTradeSettlementPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmSalaryPayment
 * CreditTransferTypeCode.mmSalaryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmTreasuryPayment
 * CreditTransferTypeCode.mmTreasuryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmSweepAccount
 * CreditTransferTypeCode.mmSweepAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmTopAccount
 * CreditTransferTypeCode.mmTopAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmZeroBalanceAccount
 * CreditTransferTypeCode.mmZeroBalanceAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmAdvancePayment
 * CreditTransferTypeCode.mmAdvancePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmAgriculturalTransfer
 * CreditTransferTypeCode.mmAgriculturalTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmAlimonyPayment
 * CreditTransferTypeCode.mmAlimonyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmChildBenefit
 * CreditTransferTypeCode.mmChildBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmUnemploymentDisabilityBenefit
 * CreditTransferTypeCode.mmUnemploymentDisabilityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmBonusPayment
 * CreditTransferTypeCode.mmBonusPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmCashManagementTransfer
 * CreditTransferTypeCode.mmCashManagementTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmCapitalBuilding
 * CreditTransferTypeCode.mmCapitalBuilding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmCharityPayment
 * CreditTransferTypeCode.mmCharityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmCommodityTransfer
 * CreditTransferTypeCode.mmCommodityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmCommercialCredit
 * CreditTransferTypeCode.mmCommercialCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmCommission
 * CreditTransferTypeCode.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmCosts
 * CreditTransferTypeCode.mmCosts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmCopyright
 * CreditTransferTypeCode.mmCopyright}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmDividend
 * CreditTransferTypeCode.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmForeignExchange
 * CreditTransferTypeCode.mmForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmPurchaseSaleOfGoods
 * CreditTransferTypeCode.mmPurchaseSaleOfGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmGovernmentPayment
 * CreditTransferTypeCode.mmGovernmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmInstalmentHirePurchaseAgreement
 * CreditTransferTypeCode.mmInstalmentHirePurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmInsurancePremium
 * CreditTransferTypeCode.mmInsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmInterest
 * CreditTransferTypeCode.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmLicenseFee
 * CreditTransferTypeCode.mmLicenseFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmLoan
 * CreditTransferTypeCode.mmLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmLoanRepayment
 * CreditTransferTypeCode.mmLoanRepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmNetting
 * CreditTransferTypeCode.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmPensionPayment
 * CreditTransferTypeCode.mmPensionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmRefund
 * CreditTransferTypeCode.mmRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmRent
 * CreditTransferTypeCode.mmRent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmRoyalties
 * CreditTransferTypeCode.mmRoyalties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmPurchaseSaleOfServices
 * CreditTransferTypeCode.mmPurchaseSaleOfServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmSecurities
 * CreditTransferTypeCode.mmSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmSocialSecurityBenefit
 * CreditTransferTypeCode.mmSocialSecurityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmSubscription
 * CreditTransferTypeCode.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmTaxPayment
 * CreditTransferTypeCode.mmTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmValueAddedTaxPayment
 * CreditTransferTypeCode.mmValueAddedTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmSupplierPayment
 * CreditTransferTypeCode.mmSupplierPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmHedging
 * CreditTransferTypeCode.mmHedging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditTransferTypeCode#mmTrade
 * CreditTransferTypeCode.mmTrade}</li>
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
 * <li>"INTC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditTransferTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of transaction that resulted in the payment."</li>
 * </ul>
 */
public class CreditTransferTypeCode {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIntraCompanyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "IntraCompanyPayment";
			definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlementPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to settlement of a trade, eg a foreign exchange deal or a securities transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTradeSettlementPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "TradeSettlementPayment";
			definition = "Transaction is related to settlement of a trade, eg a foreign exchange deal or a securities transaction.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of salaries."</li>
	 * </ul>
	 */
	public static final MMCode mmSalaryPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "SalaryPayment";
			definition = "Transaction is the payment of salaries.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to treasury operations."</li>
	 * </ul>
	 */
	public static final MMCode mmTreasuryPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "TreasuryPayment";
			definition = "Transaction is related to treasury operations.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SweepAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cash management instruction, requesting to sweep the account of the debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSweepAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "SweepAccount";
			definition = "Transaction is a cash management instruction, requesting to sweep the account of the debtor.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cash management instruction, requesting to top the account of the debtor above a certain floor amount. The floor amount, if not pre-agreed by the parties involved, may be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTopAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "TopAccount";
			definition = "Transaction is a cash management instruction, requesting to top the account of the debtor above a certain floor amount. The floor amount, if not pre-agreed by the parties involved, may be specified.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroBalanceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cash management instruction, requesting to zero balance the account of the debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmZeroBalanceAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ZeroBalanceAccount";
			definition = "Transaction is a cash management instruction, requesting to zero balance the account of the debtor.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvancePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an advance payment."</li>
	 * </ul>
	 */
	public static final MMCode mmAdvancePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "AdvancePayment";
			definition = "Transaction is an advance payment.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgriculturalTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to the agricultural domain."</li>
	 * </ul>
	 */
	public static final MMCode mmAgriculturalTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "AgriculturalTransfer";
			definition = "Transaction is related to the agricultural domain.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlimonyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of alimony."</li>
	 * </ul>
	 */
	public static final MMCode mmAlimonyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "AlimonyPayment";
			definition = "Transaction is the payment of alimony.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChildBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment made to assist parent/guardian to maintain child."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChildBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ChildBenefit";
			definition = "Transaction is related to a payment made to assist parent/guardian to maintain child.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnemploymentDisabilityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment to person unemployed/disabled."</li>
	 * </ul>
	 */
	public static final MMCode mmUnemploymentDisabilityBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "UnemploymentDisabilityBenefit";
			definition = "Transaction is related to a payment to person unemployed/disabled.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to payment of a bonus."</li>
	 * </ul>
	 */
	public static final MMCode mmBonusPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "BonusPayment";
			definition = "Transaction is related to payment of a bonus.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a general cash management instruction."</li>
	 * </ul>
	 */
	public static final MMCode mmCashManagementTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "CashManagementTransfer";
			definition = "Transaction is a general cash management instruction.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalBuilding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to capital building fringe fortune. Capital building for retirement."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCapitalBuilding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "CapitalBuilding";
			definition = "Transaction is related to capital building fringe fortune. Capital building for retirement.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CharityPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment for charity reasons."</li>
	 * </ul>
	 */
	public static final MMCode mmCharityPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "CharityPayment";
			definition = "Transaction is a payment for charity reasons.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommodityTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of commodities."</li>
	 * </ul>
	 */
	public static final MMCode mmCommodityTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "CommodityTransfer";
			definition = "Transaction is payment of commodities.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of commercial credit."</li>
	 * </ul>
	 */
	public static final MMCode mmCommercialCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "CommercialCredit";
			definition = "Transaction is payment of commercial credit.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of commission."</li>
	 * </ul>
	 */
	public static final MMCode mmCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Commission";
			definition = "Transaction is payment of commission.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Costs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to payment of costs."</li>
	 * </ul>
	 */
	public static final MMCode mmCosts = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Costs";
			definition = "Transaction is related to payment of costs.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copyright"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of copyright."</li>
	 * </ul>
	 */
	public static final MMCode mmCopyright = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Copyright";
			definition = "Transaction is payment of copyright.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of dividends."</li>
	 * </ul>
	 */
	public static final MMCode mmDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Dividend";
			definition = "Transaction is the payment of dividends.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a foreign exchange operation."</li>
	 * </ul>
	 */
	public static final MMCode mmForeignExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ForeignExchange";
			definition = "Transaction is related to a foreign exchange operation.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to purchase and sale of goods."</li>
	 * </ul>
	 */
	public static final MMCode mmPurchaseSaleOfGoods = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "PurchaseSaleOfGoods";
			definition = "Transaction is related to purchase and sale of goods.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment to or from a government department."</li>
	 * </ul>
	 */
	public static final MMCode mmGovernmentPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "GovernmentPayment";
			definition = "Transaction is a payment to or from a government department.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentHirePurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is payment for Instalment/hire-purchase agreement."</li>
	 * </ul>
	 */
	public static final MMCode mmInstalmentHirePurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "InstalmentHirePurchaseAgreement";
			definition = "Transaction is payment for Instalment/hire-purchase agreement.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of an insurance premium."</li>
	 * </ul>
	 */
	public static final MMCode mmInsurancePremium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "InsurancePremium";
			definition = "Transaction is payment of an insurance premium.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of interest."</li>
	 * </ul>
	 */
	public static final MMCode mmInterest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Interest";
			definition = "Transaction is the payment of interest.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LicenseFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of a license fee."</li>
	 * </ul>
	 */
	public static final MMCode mmLicenseFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "LicenseFee";
			definition = "Transaction is payment of a license fee.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to the transfer of a loan to a borrower."</li>
	 * </ul>
	 */
	public static final MMCode mmLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Loan";
			definition = "Transaction is related to the transfer of a loan to a borrower.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoanRepayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to repayment of loan to lender."</li>
	 * </ul>
	 */
	public static final MMCode mmLoanRepayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "LoanRepayment";
			definition = "Transaction is related to repayment of loan to lender.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a netting operation."</li>
	 * </ul>
	 */
	public static final MMCode mmNetting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Netting";
			definition = "Transaction is related to a netting operation.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of pension."</li>
	 * </ul>
	 */
	public static final MMCode mmPensionPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "PensionPayment";
			definition = "Transaction is the payment of pension.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of a refund."</li>
	 * </ul>
	 */
	public static final MMCode mmRefund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Refund";
			definition = "Transaction is the payment of a refund.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of rent."</li>
	 * </ul>
	 */
	public static final MMCode mmRent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Rent";
			definition = "Transaction is the payment of rent.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Royalties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of royalties."</li>
	 * </ul>
	 */
	public static final MMCode mmRoyalties = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Royalties";
			definition = "Transaction is the payment of royalties.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to purchase and sale of services."</li>
	 * </ul>
	 */
	public static final MMCode mmPurchaseSaleOfServices = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "PurchaseSaleOfServices";
			definition = "Transaction is related to purchase and sale of services.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of securities."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Securities";
			definition = "Transaction is the payment of securities.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a social security benefit, ie payment made by a government to support individuals."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSocialSecurityBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "SocialSecurityBenefit";
			definition = "Transaction is a social security benefit, ie payment made by a government to support individuals.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of a subscription."</li>
	 * </ul>
	 */
	public static final MMCode mmSubscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Subscription";
			definition = "Transaction is payment of a subscription.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of taxes."</li>
	 * </ul>
	 */
	public static final MMCode mmTaxPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "TaxPayment";
			definition = "Transaction is the payment of taxes.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of value added tax."</li>
	 * </ul>
	 */
	public static final MMCode mmValueAddedTaxPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ValueAddedTaxPayment";
			definition = "Transaction is the payment of value added tax.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplierPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment to a supplier."</li>
	 * </ul>
	 */
	public static final MMCode mmSupplierPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "SupplierPayment";
			definition = "Transaction is related to a payment to a supplier.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hedging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to the payment of a hedging operation."</li>
	 * </ul>
	 */
	public static final MMCode mmHedging = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Hedging";
			definition = "Transaction is related to the payment of a hedging operation.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to the payment of a trade transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "Trade";
			definition = "Transaction is related to the payment of a trade transaction.";
			owner_lazy = () -> CreditTransferTypeCode.mmObject();
			codeName = "TRAD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("INTC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				name = "CreditTransferTypeCode";
				definition = "Specifies the type of transaction that resulted in the payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CreditTransferTypeCode.mmIntraCompanyPayment, com.tools20022.repository.codeset.CreditTransferTypeCode.mmTradeSettlementPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmSalaryPayment, com.tools20022.repository.codeset.CreditTransferTypeCode.mmTreasuryPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmSweepAccount, com.tools20022.repository.codeset.CreditTransferTypeCode.mmTopAccount,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmZeroBalanceAccount, com.tools20022.repository.codeset.CreditTransferTypeCode.mmAdvancePayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmAgriculturalTransfer, com.tools20022.repository.codeset.CreditTransferTypeCode.mmAlimonyPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmChildBenefit, com.tools20022.repository.codeset.CreditTransferTypeCode.mmUnemploymentDisabilityBenefit,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmBonusPayment, com.tools20022.repository.codeset.CreditTransferTypeCode.mmCashManagementTransfer,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmCapitalBuilding, com.tools20022.repository.codeset.CreditTransferTypeCode.mmCharityPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmCommodityTransfer, com.tools20022.repository.codeset.CreditTransferTypeCode.mmCommercialCredit,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmCommission, com.tools20022.repository.codeset.CreditTransferTypeCode.mmCosts, com.tools20022.repository.codeset.CreditTransferTypeCode.mmCopyright,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmDividend, com.tools20022.repository.codeset.CreditTransferTypeCode.mmForeignExchange,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmPurchaseSaleOfGoods, com.tools20022.repository.codeset.CreditTransferTypeCode.mmGovernmentPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmInstalmentHirePurchaseAgreement, com.tools20022.repository.codeset.CreditTransferTypeCode.mmInsurancePremium,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmInterest, com.tools20022.repository.codeset.CreditTransferTypeCode.mmLicenseFee, com.tools20022.repository.codeset.CreditTransferTypeCode.mmLoan,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmLoanRepayment, com.tools20022.repository.codeset.CreditTransferTypeCode.mmNetting,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmPensionPayment, com.tools20022.repository.codeset.CreditTransferTypeCode.mmRefund, com.tools20022.repository.codeset.CreditTransferTypeCode.mmRent,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmRoyalties, com.tools20022.repository.codeset.CreditTransferTypeCode.mmPurchaseSaleOfServices,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmSecurities, com.tools20022.repository.codeset.CreditTransferTypeCode.mmSocialSecurityBenefit,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmSubscription, com.tools20022.repository.codeset.CreditTransferTypeCode.mmTaxPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmValueAddedTaxPayment, com.tools20022.repository.codeset.CreditTransferTypeCode.mmSupplierPayment,
						com.tools20022.repository.codeset.CreditTransferTypeCode.mmHedging, com.tools20022.repository.codeset.CreditTransferTypeCode.mmTrade);
			}
		});
		return mmObject_lazy.get();
	}
}