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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CollateralAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Record of transactions in specific types of assets, maintained by a servicing
 * party on behalf of one or more owning parties. Business relationship between
 * an account servicer and one or more account owners.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Account" src="doc-files/Account.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
 * Account.mmBaseCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmIdentification
 * Account.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmParentAccount
 * Account.mmParentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSubAccount
 * Account.mmSubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedFundProcessingCharacteristics
 * Account.mmRelatedFundProcessingCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmStatus
 * Account.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmLanguage
 * Account.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmPartyRole
 * Account.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmTradePartyRole
 * Account.mmTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReportingCurrency
 * Account.mmReportingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmAccountRestriction
 * Account.mmAccountRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmSettlementPartyRole
 * Account.mmSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmPurpose
 * Account.mmPurpose}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmClosingDate
 * Account.mmClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmLiveDate
 * Account.mmLiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReportedPeriod
 * Account.mmReportedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmInvestmentFundPartyRole
 * Account.mmInvestmentFundPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedCollateralProcess
 * Account.mmRelatedCollateralProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmType
 * Account.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedProceedsDelivery
 * Account.mmRelatedProceedsDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedCorporateActionPartyRole
 * Account.mmRelatedCorporateActionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundAccountOwner
 * Account.mmDefaultFundAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSystem
 * Account.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmBalance
 * Account.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmEntry
 * Account.mmEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmAccountContract
 * Account.mmAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmOpeningDate
 * Account.mmOpeningDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmCurrencyExchange
 * Account.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundContribution
 * Account.mmDefaultFundContribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSystemMember
 * Account.mmSystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmCollateralAccountType
 * Account.mmCollateralAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmAccountService
 * Account.mmAccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReconciliation
 * Account.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmManagedAccountProduct
 * Account.mmManagedAccountProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StatementDetails
 * StatementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
 * StatementAndFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account1 Account1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account2 Account2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account4 Account4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account3 Account3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account7 Account7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount1 SubAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account9 Account9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account10 Account10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account11 Account11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account13 Account13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account12 Account12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount2 SubAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationInformation1
 * IdentificationInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationModification1
 * IdentificationModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationInformation2
 * IdentificationInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationModification2
 * IdentificationModification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationVerification1
 * IdentificationVerification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IdentificationVerification2
 * IdentificationVerification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountingAccount1
 * AccountingAccount1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType1Choice
 * CollateralAccountIdentificationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount1
 * CollateralAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount3 SubAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account8 Account8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.StatementTerm1Choice
 * StatementTerm1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementAttributes1
 * StatementAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account14 Account14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount4 SubAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMAccountStatement1
 * ATMAccountStatement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account18 Account18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount5 SubAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account20 Account20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount2
 * CollateralAccount2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice
 * CollateralAccountIdentificationType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account21 Account21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount6 SubAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account23 Account23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account22 Account22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount3
 * CollateralAccount3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice
 * CollateralAccountIdentificationType3Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmAccount
 * GenericIdentification.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementAccount
 * InvestmentFundClassProcessingCharacteristics.mmSettlementAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmParentAccount
 * Account.mmParentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSubAccount
 * Account.mmSubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmAccount
 * AccountIdentification.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccount
 * DateTimePeriod.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
 * AccountPartyRole.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountService#mmAccount
 * AccountService.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmAccount
 * AccountStatus.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmAccount
 * AccountContract.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmAccount
 * Entry.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#mmAccount
 * InvestmentFundPartyRole.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
 * TradePartyRole.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAccount
 * System.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#mmAccount
 * SystemMemberRole.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDefaultFundAccount
 * ClearingMemberRole.mmDefaultFundAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAccount
 * Balance.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlementAccount
 * SettlementPartyRole.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmAccount
 * AccountRestriction.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmReportedAccount
 * CurrencyExchange.mmReportedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
 * Collateral.mmCollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSettlementAccount
 * CorporateActionProceedsDeliveryInstruction.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmAccount
 * CorporateActionPartyRole.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmContributionAccount
 * DefaultFundContribution.mmContributionAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmAccount
 * Reconciliation.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#mmAccount
 * ManagedAccountProduct.mmAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount1#mmCharacteristic
 * SubAccount1.mmCharacteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification1#mmOriginalPartyAndAccountIdentification
 * IdentificationModification1.mmOriginalPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification1#mmUpdatedPartyAndAccountIdentification
 * IdentificationModification1.mmUpdatedPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#mmOriginalPartyAndAccountIdentification
 * IdentificationModification2.mmOriginalPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#mmUpdatedPartyAndAccountIdentification
 * IdentificationModification2.mmUpdatedPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationVerification1#mmPartyAndAccountIdentification
 * IdentificationVerification1.mmPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationVerification2#mmPartyAndAccountIdentification
 * IdentificationVerification2.mmPartyAndAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount3#mmCharacteristic
 * SubAccount3.mmCharacteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmStatementTerm
 * StatementAttributes1.mmStatementTerm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount4#mmCharacteristic
 * SubAccount4.mmCharacteristic}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount5#mmCharacteristic
 * SubAccount5.mmCharacteristic}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount6#mmCharacteristic
 * SubAccount6.mmCharacteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Account23#mmRelatedAccountDetails
 * Account23.mmRelatedAccountDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Account"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners."
 * </li>
 * </ul>
 */
public class Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode baseCurrency;
	/**
	 * Base currency of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount14#mmCurrency
	 * CashAccount14.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount22#mmCurrency
	 * CashAccount22.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount5#mmCurrency
	 * CashAccount5.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12#mmCurrency
	 * CashAccount12.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2#mmCurrency
	 * CashAccountSearchCriteria2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3#mmCurrency
	 * CashAccountSearchCriteria3.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4#mmCurrency
	 * CashAccountSearchCriteria4.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#mmCurrency
	 * CashAccountSearchCriteria5.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount7#mmCurrency
	 * CashAccount7.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount16#mmCurrency
	 * CashAccount16.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24#mmCurrency
	 * CashAccount24.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmCurrency
	 * CashAccountDetails1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmCurrency
	 * CashAccountDetails3.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails4#mmCurrency
	 * CashAccountDetails4.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount23#mmCurrency
	 * CashAccount23.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmAccountCurrency
	 * AccountCashEntryDetails3.mmAccountCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount13#mmCurrency
	 * CashAccount13.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount20#mmCurrency
	 * CashAccount20.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#mmCurrency
	 * CashAccount25.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1#mmCurrency
	 * AccountForAction1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction2#mmCurrency
	 * AccountForAction2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmCurrency
	 * CustomerAccount1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmCurrency
	 * CustomerAccount5.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmCurrency
	 * CustomerAccount4.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount28#mmCurrency
	 * CashAccount28.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount27#mmCurrency
	 * CashAccount27.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount3#mmCurrency
	 * CashAccount3.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount17#mmPaymentCurrency
	 * CashAccount17.mmPaymentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmBaseCurrency
	 * SecuritiesAccount21.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmCurrency
	 * CustomerAccount2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmCurrency
	 * CustomerAccount3.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#mmCurrency
	 * CardAccount3.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmCurrency
	 * CardAccount6.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmCurrency
	 * CardAccount4.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5#mmCurrency
	 * CardAccount5.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#mmCurrency
	 * CardAccount2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmSettlementCurrency
	 * TradeContract1.mmSettlementCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#mmCurrency
	 * CardAccount10.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount9#mmCurrency
	 * CardAccount9.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8#mmCurrency
	 * CardAccount8.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11#mmCurrency
	 * CardAccount11.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount13#mmCurrency
	 * CardAccount13.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#mmCurrency
	 * CardAccount7.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount12#mmCurrency
	 * CardAccount12.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CutOff1#mmCurrency
	 * CutOff1.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Base currency of the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBaseCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount14.mmCurrency, CashAccount22.mmCurrency, CashAccount5.mmCurrency, CashAccount12.mmCurrency, CashAccountSearchCriteria2.mmCurrency, CashAccountSearchCriteria3.mmCurrency,
					CashAccountSearchCriteria4.mmCurrency, CashAccountSearchCriteria5.mmCurrency, CashAccount7.mmCurrency, CashAccount16.mmCurrency, CashAccount24.mmCurrency, CashAccountDetails1.mmCurrency, CashAccountDetails3.mmCurrency,
					CashAccountDetails4.mmCurrency, CashAccount23.mmCurrency, AccountCashEntryDetails3.mmAccountCurrency, CashAccount13.mmCurrency, CashAccount20.mmCurrency, CashAccount25.mmCurrency, AccountForAction1.mmCurrency,
					AccountForAction2.mmCurrency, CustomerAccount1.mmCurrency, CustomerAccount5.mmCurrency, CustomerAccount4.mmCurrency, CashAccount28.mmCurrency, CashAccount27.mmCurrency, CashAccount3.mmCurrency,
					CashAccount17.mmPaymentCurrency, SecuritiesAccount21.mmBaseCurrency, CustomerAccount2.mmCurrency, CustomerAccount3.mmCurrency, CardAccount3.mmCurrency, CardAccount6.mmCurrency, CardAccount4.mmCurrency,
					CardAccount5.mmCurrency, CardAccount2.mmCurrency, TradeContract1.mmSettlementCurrency, CardAccount10.mmCurrency, CardAccount9.mmCurrency, CardAccount8.mmCurrency, CardAccount11.mmCurrency, CardAccount13.mmCurrency,
					CardAccount7.mmCurrency, CardAccount12.mmCurrency, CutOff1.mmCurrency);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BaseCurrency";
			definition = "Base currency of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getBaseCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountIdentification identification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmAccount
	 * AccountIdentification.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount15#mmIdentification
	 * CashAccount15.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount14#mmIdentification
	 * CashAccount14.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount21#mmIdentification
	 * CashAccount21.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount22#mmIdentification
	 * CashAccount22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmAccountIdentification
	 * StatementDetails.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmSubAccountIdentification
	 * StatementDetails.mmSubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmAccountIdentification
	 * StatementAndFinancialInstrumentDetails.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmSubAccountIdentification
	 * StatementAndFinancialInstrumentDetails.mmSubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount5#mmIdentification
	 * CashAccount5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount1#mmIdentification
	 * SecuritiesAccount1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmIdentification
	 * InvestmentAccount17.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account1#mmIdentification
	 * Account1.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account2#mmIdentification
	 * Account2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount4#mmIdentification
	 * CashAccount4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate2#mmDebtorAccountIdentification
	 * DirectDebitMandate2.mmDebtorAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmDebtorAccountIdentification
	 * DirectDebitMandate3.mmDebtorAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount12#mmIdentification
	 * CashAccount12.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount4#mmIdentification
	 * SecuritiesAccount4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmIdentification
	 * InvestmentAccount27.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorAccount
	 * DirectDebitMandate4.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmIdentification
	 * InvestmentAccount35.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmIdentification
	 * CashAccount26.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account4#mmIdentification
	 * Account4.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account5#mmIdentification
	 * Account5.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account6#mmIdentification
	 * Account6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount93#mmAccountIdentification
	 * PartyIdentificationAndAccount93.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection1#mmAccountIdentification
	 * InvestmentAccountSelection1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2#mmAccountIdentification
	 * InvestmentAccountSelection2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmIdentification
	 * InvestmentAccount16.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmIdentification
	 * InvestmentAccount26.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmIdentification
	 * InvestmentAccount34.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#mmAccountIdentification
	 * LimitIdentificationDetails1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2#mmAccountIdentification
	 * LimitIdentificationDetails2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails3#mmAccountIdentification
	 * LimitIdentificationDetails3.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification1#mmAccountIdentification
	 * LimitIdentification1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification2#mmAccountIdentification
	 * LimitIdentification2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentificationDetails1#mmAccountIdentification
	 * ReservationIdentificationDetails1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentification1#mmAccountIdentification
	 * ReservationIdentification1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2#mmAccountIdentification
	 * CashAccountSearchCriteria2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3#mmAccountIdentification
	 * CashAccountSearchCriteria3.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4#mmAccountIdentification
	 * CashAccountSearchCriteria4.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#mmAccountIdentification
	 * CashAccountSearchCriteria5.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2#mmAccountIdentification
	 * LimitSearchCriteria2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmAccountIdentification
	 * LimitSearchCriteria3.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria1#mmAccountIdentification
	 * ReservationSearchCriteria1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#mmAccountIdentification
	 * ReservationSearchCriteria2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount7#mmIdentification
	 * CashAccount7.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount16#mmIdentification
	 * CashAccount16.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount24#mmIdentification
	 * CashAccount24.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmAssociatedPoolAccount
	 * StandingOrderSearchCriteria1.mmAssociatedPoolAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemSearch2#mmAccountIdentification
	 * SystemSearch2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmAccountIdentification
	 * AccountCashEntrySearch2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemSearch3#mmAccountIdentification
	 * SystemSearch3.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification1#mmAccountIdentification
	 * StandingOrderIdentification1.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account3#mmIdentification
	 * Account3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount6#mmIdentification
	 * CashAccount6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount11#mmIdentification
	 * CashAccount11.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails3#mmAssociatedPoolAccount
	 * StandingOrderDetails3.mmAssociatedPoolAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport7#mmAccountIdentification
	 * AccountReport7.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport8#mmAccountIdentification
	 * AccountReport8.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport10#mmAccountIdentification
	 * AccountReport10.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmAssociatedPoolAccount
	 * StandingOrder2.mmAssociatedPoolAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport13#mmAccountIdentification
	 * AccountReport13.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemDetails2#mmAccountIdentification
	 * SystemDetails2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmAccountIdentification
	 * AccountCashEntryDetails3.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.System1#mmAccountIdentification
	 * System1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount13#mmIdentification
	 * CashAccount13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount20#mmIdentification
	 * CashAccount20.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount25#mmIdentification
	 * CashAccount25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmAccountIdentification
	 * InvestmentAccount10.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#mmAccountIdentification
	 * InvestmentAccount11.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount2#mmAccountIdentification
	 * PartyIdentificationAndAccount2.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account7#mmIdentification
	 * Account7.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmAccountIdentification
	 * InvestmentAccount22.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount1#mmIdentification
	 * SubAccount1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#mmAccountIdentification
	 * InvestmentAccount24.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5#mmAccountIdentification
	 * PartyIdentificationAndAccount5.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#mmAccountIdentification
	 * PartyIdentificationAndAccount4.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29#mmCashAccount
	 * QuantityAndAccount29.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#mmCashAccount
	 * PartyIdentificationAndAccount11.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#mmChargesAccount
	 * PartyIdentificationAndAccount11.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#mmCommissionAccount
	 * PartyIdentificationAndAccount11.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#mmTaxAccount
	 * PartyIdentificationAndAccount11.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#mmCashAccount
	 * PartyIdentificationAndAccount12.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#mmChargesAccount
	 * PartyIdentificationAndAccount12.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#mmCommissionAccount
	 * PartyIdentificationAndAccount12.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#mmTaxAccount
	 * PartyIdentificationAndAccount12.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#mmCashAccount
	 * PartyIdentificationAndAccount20.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#mmChargesAccount
	 * PartyIdentificationAndAccount20.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#mmCommissionAccount
	 * PartyIdentificationAndAccount20.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#mmTaxAccount
	 * PartyIdentificationAndAccount20.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#mmCashAccount
	 * PartyIdentificationAndAccount15.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#mmChargesAccount
	 * PartyIdentificationAndAccount15.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#mmCommissionAccount
	 * PartyIdentificationAndAccount15.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#mmTaxAccount
	 * PartyIdentificationAndAccount15.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#mmCashAccount
	 * PartyIdentificationAndAccount39.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#mmChargesAccount
	 * PartyIdentificationAndAccount39.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#mmCommissionAccount
	 * PartyIdentificationAndAccount39.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#mmTaxAccount
	 * PartyIdentificationAndAccount39.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#mmCashAccount
	 * PartyIdentificationAndAccount50.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#mmChargesAccount
	 * PartyIdentificationAndAccount50.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#mmCommissionAccount
	 * PartyIdentificationAndAccount50.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#mmTaxAccount
	 * PartyIdentificationAndAccount50.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#mmCashAccount
	 * QuantityAndAccount30.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32#mmCashAccount
	 * QuantityAndAccount32.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#mmCashAccount
	 * PartyIdentificationAndAccount64.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#mmChargesAccount
	 * PartyIdentificationAndAccount64.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#mmCommissionAccount
	 * PartyIdentificationAndAccount64.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#mmTaxAccount
	 * PartyIdentificationAndAccount64.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#mmCashAccount
	 * PartyIdentificationAndAccount60.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#mmChargesAccount
	 * PartyIdentificationAndAccount60.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#mmCommissionAccount
	 * PartyIdentificationAndAccount60.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#mmTaxAccount
	 * PartyIdentificationAndAccount60.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#mmCashAccount
	 * QuantityAndAccount33.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount17#mmCashAccount
	 * PartyIdentificationAndAccount17.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount18#mmCashAccount
	 * PartyIdentificationAndAccount18.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount23#mmCashAccount
	 * PartyIdentificationAndAccount23.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount24#mmCashAccount
	 * PartyIdentificationAndAccount24.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52#mmCashAccount
	 * PartyIdentificationAndAccount52.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount54#mmCashAccount
	 * PartyIdentificationAndAccount54.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount57#mmCashAccount
	 * PartyIdentificationAndAccount57.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount58#mmCashAccount
	 * PartyIdentificationAndAccount58.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#mmCashAccountIdentification
	 * CashOption3.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#mmCashAccountIdentification
	 * CashOption6.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#mmCashAccountIdentification
	 * CashOption11.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#mmCashAccountIdentification
	 * CashOption14.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#mmCashAccountIdentification
	 * CashOption16.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#mmCashAccountIdentification
	 * CashOption20.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#mmCashAccountIdentification
	 * CashOption25.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#mmCashAccountIdentification
	 * CashOption28.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#mmCashAccountIdentification
	 * CashOption4.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#mmCashAccountIdentification
	 * CashOption8.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#mmCashAccountIdentification
	 * CashOption10.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#mmCashAccountIdentification
	 * CashOption15.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#mmCashAccountIdentification
	 * CashOption17.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#mmCashAccountIdentification
	 * CashOption21.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#mmCashAccountIdentification
	 * CashOption24.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#mmCashAccountIdentification
	 * CashOption29.mmCashAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account9#mmIdentification
	 * Account9.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account10#mmIdentification
	 * Account10.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount1#mmIdentification
	 * SafekeepingAccount1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmIdentification
	 * SafekeepingAccount2.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account11#mmIdentification
	 * Account11.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account13#mmIdentification
	 * Account13.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account12#mmIdentification
	 * Account12.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#mmCashAccount
	 * QuantityAndAccount6.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#mmCashAccount
	 * QuantityAndAccount11.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#mmCashAccount
	 * PartyIdentificationAndAccount29.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#mmChargesAccount
	 * PartyIdentificationAndAccount29.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#mmCommissionAccount
	 * PartyIdentificationAndAccount29.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#mmTaxAccount
	 * PartyIdentificationAndAccount29.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#mmCashAccount
	 * PartyIdentificationAndAccount27.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#mmChargesAccount
	 * PartyIdentificationAndAccount27.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#mmCommissionAccount
	 * PartyIdentificationAndAccount27.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#mmTaxAccount
	 * PartyIdentificationAndAccount27.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#mmCashAccount
	 * QuantityAndAccount18.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#mmCashAccount
	 * PartyIdentificationAndAccount38.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#mmChargesAccount
	 * PartyIdentificationAndAccount38.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#mmCommissionAccount
	 * PartyIdentificationAndAccount38.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#mmTaxAccount
	 * PartyIdentificationAndAccount38.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#mmCashAccount
	 * QuantityAndAccount19.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmCashAccount
	 * PartyIdentificationAndAccount59.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmChargesAccount
	 * PartyIdentificationAndAccount59.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmCommissionAccount
	 * PartyIdentificationAndAccount59.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmTaxAccount
	 * PartyIdentificationAndAccount59.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#mmCashAccount
	 * QuantityAndAccount1.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#mmCashAccount
	 * QuantityAndAccount5.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#mmCashAccount
	 * QuantityAndAccount17.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#mmCashAccount
	 * QuantityAndAccount24.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#mmCashAccount
	 * QuantityAndAccount25.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#mmCashAccount
	 * QuantityAndAccount34.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#mmCashAccount
	 * QuantityAndAccount2.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#mmCashAccount
	 * QuantityAndAccount12.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#mmCashAccount
	 * QuantityAndAccount15.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#mmCashAccount
	 * QuantityAndAccount20.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmCashAccount
	 * QuantityAndAccount28.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#mmCashAccount
	 * QuantityAndAccount37.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9#mmCashAccount
	 * PartyIdentificationAndAccount9.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmCashAccount
	 * PartyIdentificationAndAccount79.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#mmCashAccount
	 * PartyIdentificationAndAccount83.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount20#mmIdentification
	 * SecuritiesAccount20.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#mmCashDetails
	 * ConfirmationPartyDetails3.mmCashDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount8#mmCashAccount
	 * PartyIdentificationAndAccount8.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmCashDetails
	 * ConfirmationPartyDetails6.mmCashDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmCashAccount
	 * PartyIdentificationAndAccount80.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmChargesAccount
	 * PartyIdentificationAndAccount80.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmCommissionAccount
	 * PartyIdentificationAndAccount80.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmTaxAccount
	 * PartyIdentificationAndAccount80.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1#mmIdentification
	 * AccountForAction1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction2#mmIdentification
	 * AccountForAction2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmIdentification
	 * CustomerAccount1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmIdentification
	 * CustomerAccount5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmIdentification
	 * CustomerAccountModification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmIdentification
	 * CustomerAccount4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount28#mmIdentification
	 * CashAccount28.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount27#mmIdentification
	 * CashAccount27.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings1#mmSubAccountDetails
	 * AccountingStatementOfHoldings1.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2#mmSubAccountDetails
	 * AccountingStatementOfHoldings2.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#mmSubAccountDetails
	 * CustodyStatementOfHoldings1.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#mmSubAccountDetails
	 * CustodyStatementOfHoldings2.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount13#mmAccountIdentification
	 * InvestmentAccount13.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount3#mmAccountIdentification
	 * PartyIdentificationAndAccount3.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Creditor2#mmAccountIdentification
	 * Creditor2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debtor2#mmAccountIdentification
	 * Debtor2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount15#mmAccountIdentification
	 * InvestmentAccount15.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21#mmAccountIdentification
	 * InvestmentAccount21.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmCreditorAgentAccount
	 * CreditTransfer6.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount20#mmAccountIdentification
	 * InvestmentAccount20.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount14#mmAccountIdentification
	 * InvestmentAccount14.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount12#mmIdentification
	 * InvestmentAccount12.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1#mmSubAccountDetails
	 * StatementOfInvestmentFundTransactions1.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount25#mmIdentification
	 * InvestmentAccount25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmSubAccountDetails
	 * StatementOfInvestmentFundTransactions2.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount3#mmIdentification
	 * CashAccount3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition2#mmAccountIdentification
	 * EligiblePosition2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition3#mmAccountIdentification
	 * EligiblePosition3.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition4#mmAccountIdentification
	 * EligiblePosition4.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount2#mmIdentification
	 * SubAccount2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus1#mmAccountIdentification
	 * DetailedInstructionStatus1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus1#mmSubAccountIdentification
	 * DetailedInstructionStatus1.mmSubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus2#mmAccountIdentification
	 * DetailedInstructionStatus2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus2#mmSubAccountIdentification
	 * DetailedInstructionStatus2.mmSubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#mmAccountIdentification
	 * DetailedInstructionStatus9.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#mmSubAccountIdentification
	 * DetailedInstructionStatus9.mmSubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmAgentSecuritiesAccountIdentification
	 * CorporateActionOption1.mmAgentSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmAgentCashAccountIdentification
	 * CorporateActionOption1.mmAgentCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount19#mmAccountIdentification
	 * CashAccount19.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmCashAccountIdentification
	 * ProceedsDelivery1.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount18#mmAccountIdentification
	 * CashAccount18.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#mmAgentAccountIdentification
	 * CorporateActionMovementFailedStatus1.mmAgentAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#mmClientAccountIdentification
	 * CorporateActionMovementFailedStatus1.mmClientAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncludedAccount1#mmSecuritiesAccountIdentification
	 * IncludedAccount1.mmSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount17#mmAccountIdentification
	 * CashAccount17.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount7#mmCashAccount
	 * QuantityAndAccount7.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount16#mmCashAccount
	 * QuantityAndAccount16.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#mmCashAccount
	 * QuantityAndAccount3.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#mmCashAccount
	 * QuantityAndAccount13.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#mmCashAccount
	 * PartyIdentificationAndAccount53.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#mmChargesAccount
	 * PartyIdentificationAndAccount53.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#mmCommissionAccount
	 * PartyIdentificationAndAccount53.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#mmTaxAccount
	 * PartyIdentificationAndAccount53.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#mmCashAccount
	 * PartyIdentificationAndAccount55.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#mmChargesAccount
	 * PartyIdentificationAndAccount55.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#mmCommissionAccount
	 * PartyIdentificationAndAccount55.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#mmTaxAccount
	 * PartyIdentificationAndAccount55.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#mmCashAccount
	 * QuantityAndAccount8.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14#mmCashAccount
	 * QuantityAndAccount14.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#mmCashAccount
	 * PartyIdentificationAndAccount48.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#mmChargesAccount
	 * PartyIdentificationAndAccount48.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#mmCommissionAccount
	 * PartyIdentificationAndAccount48.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#mmTaxAccount
	 * PartyIdentificationAndAccount48.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation1#mmAccount
	 * IdentificationInformation1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation2#mmAccount
	 * IdentificationInformation2.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingAccount1#mmIdentification
	 * AccountingAccount1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTerms1#mmBeneficiaryAccount
	 * SettlementTerms1.mmBeneficiaryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmCollateralAccountIdentification
	 * InterestCalculation2.mmCollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount1#mmIdentification
	 * CollateralAccount1.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#mmAccount
	 * MemberDetails.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount10#mmCashAccount
	 * QuantityAndAccount10.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount21#mmCashAccount
	 * QuantityAndAccount21.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#mmCashAccount
	 * QuantityAndAccount4.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#mmCashAccount
	 * QuantityAndAccount22.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#mmCashAccount
	 * PartyIdentificationAndAccount69.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#mmChargesAccount
	 * PartyIdentificationAndAccount69.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#mmCommissionAccount
	 * PartyIdentificationAndAccount69.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#mmTaxAccount
	 * PartyIdentificationAndAccount69.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#mmCashAccount
	 * PartyIdentificationAndAccount70.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#mmChargesAccount
	 * PartyIdentificationAndAccount70.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#mmCommissionAccount
	 * PartyIdentificationAndAccount70.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#mmTaxAccount
	 * PartyIdentificationAndAccount70.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#mmCashAccount
	 * QuantityAndAccount27.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#mmCashAccount
	 * QuantityAndAccount36.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#mmCashAccount
	 * QuantityAndAccount9.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23#mmCashAccount
	 * QuantityAndAccount23.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26#mmCashAccount
	 * QuantityAndAccount26.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35#mmCashAccount
	 * QuantityAndAccount35.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#mmCashAccount
	 * PartyIdentificationAndAccount72.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#mmChargesAccount
	 * PartyIdentificationAndAccount72.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#mmCommissionAccount
	 * PartyIdentificationAndAccount72.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#mmTaxAccount
	 * PartyIdentificationAndAccount72.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmAccount
	 * SecuritiesAccount21.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType7Choice#mmAccount
	 * BalanceType7Choice.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmIdentification
	 * SecuritiesAccount19.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount18#mmIdentification
	 * SecuritiesAccount18.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmAccountIdentification
	 * PartyIdentificationAndAccount32.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contribution1#mmAccount
	 * Contribution1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DefaultFund1#mmDefaultFundAccount
	 * DefaultFund1.mmDefaultFundAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmDebitAccount
	 * CashAccountCharacteristics1.mmDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount3#mmIdentification
	 * SubAccount3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount10#mmIdentification
	 * CashAccount10.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount8#mmIdentification
	 * CashAccount8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount13#mmAccountIdentification
	 * PartyIdentificationAndAccount13.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount31#mmAccountIdentification
	 * InvestmentAccount31.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount32#mmAccountIdentification
	 * InvestmentAccount32.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount33#mmAccountIdentification
	 * InvestmentAccount33.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer7#mmCreditorAgentAccount
	 * CreditTransfer7.mmCreditorAgentAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account8#mmIdentification
	 * Account8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount7#mmAccountIdentification
	 * PartyIdentificationAndAccount7.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmAccountIdentification
	 * StatementAttributes1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmSubAccountIdentification
	 * StatementAttributes1.mmSubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmIdentification
	 * CustomerAccount2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmReferenceAccountIdentification
	 * CustomerAccount2.mmReferenceAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmIdentification
	 * CustomerAccount3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Balance3#mmSubAccountDetails
	 * Balance3.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification4#mmAccountIdentification
	 * LimitIdentification4.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmAccountIdentification
	 * ServiceCategoryTotals1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmAccountIdentification
	 * BillingSearchCriteria1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#mmAccountIdentification
	 * LimitUtilisationJournalSearchCriteria1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmIdentification
	 * InvestmentAccount38.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmIdentification
	 * InvestmentAccount37.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmAccountIdentification
	 * InvestmentAccount40.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport17#mmAccountIdentification
	 * AccountReport17.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account15#mmIdentification
	 * Account15.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account16#mmIdentification
	 * Account16.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount29#mmIdentification
	 * CashAccount29.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#mmAccountIdentification
	 * InvestmentAccount41.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account14#mmIdentification
	 * Account14.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#mmCashAccountIdentification
	 * CashOption31.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#mmCashAccountIdentification
	 * CashOption32.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97#mmAccountIdentification
	 * PartyIdentificationAndAccount97.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount96#mmAccountIdentification
	 * PartyIdentificationAndAccount96.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#mmCashAccountIdentification
	 * CashOption36.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#mmCashAccountIdentification
	 * CashOption35.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount43#mmIdentification
	 * InvestmentAccount43.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmSubAccountDetails
	 * StatementOfInvestmentFundTransactions3.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountSelection1Choice#mmAccountIdentification
	 * InvestmentAccountSelection1Choice.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount45#mmAccountIdentification
	 * InvestmentAccount45.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount42#mmAccountIdentification
	 * InvestmentAccount42.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmIdentification
	 * InvestmentAccount46.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel1#mmAccountIdentification
	 * AccountSubLevel1.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel4#mmAccountIdentification
	 * AccountSubLevel4.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel5#mmAccountIdentification
	 * AccountSubLevel5.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel2#mmAccountIdentification
	 * AccountSubLevel2.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel3#mmAccountIdentification
	 * AccountSubLevel3.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel6#mmAccountIdentification
	 * AccountSubLevel6.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel7#mmAccountIdentification
	 * AccountSubLevel7.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmAccountIdentification
	 * AccountSubLevel8.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel9#mmAccountIdentification
	 * AccountSubLevel9.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount101#mmCashAccount
	 * PartyIdentificationAndAccount101.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmCashAccountIdentification
	 * CashCollateral3.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmCashAccountIdentification
	 * CashCollateral2.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmAccountIdentification
	 * DetailedInstructionStatus10.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmSubAccountIdentification
	 * DetailedInstructionStatus10.mmSubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#mmAccountIdentification
	 * EligiblePosition5.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition6#mmAccountIdentification
	 * EligiblePosition6.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#mmCashAccountIdentification
	 * CashCollateralResponse1.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmAccountIdentification
	 * PartyIdentificationAndAccount102.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmCollateralAccountIdentification
	 * InterestCalculation3.mmCollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount4#mmIdentification
	 * SubAccount4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount104#mmCashAccount
	 * PartyIdentificationAndAccount104.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmCashAccountIdentification
	 * CashCollateral5.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmDebitAccount
	 * FinancialItemParameters1.mmDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmCreditAccount
	 * FinancialItemParameters1.mmCreditAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement1#mmAccountIdentifier
	 * ATMAccountStatement1.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount3#mmAccountIdentifier
	 * CardAccount3.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#mmAccountIdentifier
	 * CardAccount1.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount6#mmAccountIdentifier
	 * CardAccount6.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmAccountIdentifier
	 * CardAccount4.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount5#mmAccountIdentifier
	 * CardAccount5.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount2#mmAccountIdentifier
	 * CardAccount2.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#mmCashAccount
	 * QuantityAndAccount39.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmCashAccount
	 * QuantityAndAccount41.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmCashAccount
	 * QuantityAndAccount40.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#mmCashAccount
	 * QuantityAndAccount42.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#mmCashAccount
	 * QuantityAndAccount38.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmCashAccount
	 * PartyIdentificationAndAccount112.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmChargesAccount
	 * PartyIdentificationAndAccount112.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmCommissionAccount
	 * PartyIdentificationAndAccount112.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmTaxAccount
	 * PartyIdentificationAndAccount112.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmCashAccount
	 * PartyIdentificationAndAccount111.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmChargesAccount
	 * PartyIdentificationAndAccount111.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmCommissionAccount
	 * PartyIdentificationAndAccount111.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmTaxAccount
	 * PartyIdentificationAndAccount111.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#mmCashAccount
	 * QuantityAndAccount43.mmCashAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account18#mmIdentification
	 * Account18.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#mmCashAccount
	 * QuantityAndAccount45.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44#mmCashAccount
	 * QuantityAndAccount44.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmDebitAccount
	 * CashAccountCharacteristics2.mmDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#mmCashAccountIdentification
	 * CashOption42.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#mmCashAccountIdentification
	 * CashOption43.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120#mmCashAccount
	 * PartyIdentificationAndAccount120.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121#mmCashAccount
	 * PartyIdentificationAndAccount121.mmCashAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account19#mmIdentification
	 * Account19.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmIdentification
	 * InvestmentAccount49.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount34#mmIdentification
	 * CashAccount34.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmAccountIdentification
	 * InvestmentAccount54.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSelection1Choice#mmAccountIdentification
	 * AccountSelection1Choice.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmIdentification
	 * InvestmentAccount50.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmAccountIdentification
	 * InvestmentAccount56.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124#mmAccountIdentification
	 * PartyIdentificationAndAccount124.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount5#mmIdentification
	 * SubAccount5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmAccountIdentification
	 * InvestmentAccount55.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorAccount
	 * DirectDebitMandate5.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount32#mmIdentification
	 * CashAccount32.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#mmAccountIdentification
	 * InvestmentAccount53.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125#mmAccountIdentification
	 * PartyIdentificationAndAccount125.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account20#mmIdentification
	 * Account20.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmIdentification
	 * CashAccount33.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmAccountIdentification
	 * InvestmentAccount57.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmAccountIdentification
	 * PartyIdentificationAndAccount123.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount2#mmIdentification
	 * CollateralAccount2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmCollateralAccountIdentification
	 * InterestCalculation4.mmCollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126#mmAccountIdentification
	 * PartyIdentificationAndAccount126.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#mmCashAccountIdentification
	 * CashOption49.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#mmCashAccountIdentification
	 * CashOption47.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount129#mmCashAccount
	 * PartyIdentificationAndAccount129.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount130#mmCashAccount
	 * PartyIdentificationAndAccount130.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#mmCashAccount
	 * QuantityAndAccount47.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount48#mmCashAccount
	 * QuantityAndAccount48.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#mmCashAccount
	 * QuantityAndAccount46.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmCashAccount
	 * QuantityAndAccount51.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#mmCashAccount
	 * QuantityAndAccount49.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#mmCashAccount
	 * PartyIdentificationAndAccount133.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#mmChargesAccount
	 * PartyIdentificationAndAccount133.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#mmCommissionAccount
	 * PartyIdentificationAndAccount133.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#mmTaxAccount
	 * PartyIdentificationAndAccount133.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount30#mmIdentification
	 * SecuritiesAccount30.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50#mmCashAccount
	 * QuantityAndAccount50.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#mmCashAccount
	 * QuantityAndAccount55.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#mmCashAccount
	 * PartyIdentificationAndAccount134.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#mmChargesAccount
	 * PartyIdentificationAndAccount134.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#mmCommissionAccount
	 * PartyIdentificationAndAccount134.mmCommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#mmTaxAccount
	 * PartyIdentificationAndAccount134.mmTaxAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account21#mmIdentification
	 * Account21.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount54#mmCashAccount
	 * QuantityAndAccount54.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount10#mmAccountIdentifier
	 * CardAccount10.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmAccountIdentifier
	 * CardAccount9.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount8#mmAccountIdentifier
	 * CardAccount8.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount11#mmAccountIdentifier
	 * CardAccount11.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount13#mmAccountIdentifier
	 * CardAccount13.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount7#mmAccountIdentifier
	 * CardAccount7.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount12#mmAccountIdentifier
	 * CardAccount12.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmIdentification
	 * InvestmentAccount61.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSelection2Choice#mmAccountIdentification
	 * AccountSelection2Choice.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmExistingAccountIdentification
	 * AccountManagementStatusAndReason5.mmExistingAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmAccountIdentification
	 * AccountManagementStatusAndReason5.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmIdentification
	 * InvestmentAccount62.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountIdentification
	 * AccountSubLevel15.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmAccountIdentification
	 * AccountSubLevel16.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmAccountIdentification
	 * InvestmentAccount58.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountIdentification
	 * AccountSubLevel18.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#mmAccountIdentification
	 * AccountSubLevel19.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccount6#mmIdentification
	 * SubAccount6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmAccountIdentification
	 * AccountSubLevel11.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmAccountIdentification
	 * AccountSubLevel12.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147#mmAccountIdentification
	 * PartyIdentificationAndAccount147.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Account23#mmAccountIdentification
	 * Account23.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmAccountIdentification
	 * AccountSubLevel17.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountIdentification
	 * AccountSubLevel13.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmAccountIdentification
	 * AccountSubLevel14.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditorAgentAccount
	 * CreditTransfer8.mmCreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount60#mmAccountIdentification
	 * InvestmentAccount60.mmAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account22#mmIdentification
	 * Account22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorAccount
	 * DirectDebitMandate6.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmCashAccountIdentification
	 * CashOption51.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmCashAccountIdentification
	 * CashOption50.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmCashAccountIdentification
	 * CashCollateralResponse2.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#mmCashAccountIdentification
	 * CashOption53.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#mmCashAccountIdentification
	 * CashOption54.mmCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmCashAccount
	 * QuantityAndAccount57.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#mmCashAccount
	 * QuantityAndAccount58.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#mmCashAccount
	 * QuantityAndAccount56.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount61#mmCashAccount
	 * QuantityAndAccount61.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#mmCashAccount
	 * QuantityAndAccount62.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount59#mmCashAccount
	 * QuantityAndAccount59.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#mmCashAccount
	 * QuantityAndAccount60.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount3#mmIdentification
	 * CollateralAccount3.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount15.mmIdentification, CashAccount14.mmIdentification, CashAccount21.mmIdentification, CashAccount22.mmIdentification, StatementDetails.mmAccountIdentification,
					StatementDetails.mmSubAccountIdentification, StatementAndFinancialInstrumentDetails.mmAccountIdentification, StatementAndFinancialInstrumentDetails.mmSubAccountIdentification, CashAccount5.mmIdentification,
					SecuritiesAccount1.mmIdentification, InvestmentAccount17.mmIdentification, Account1.mmIdentification, Account2.mmIdentification, CashAccount4.mmIdentification, DirectDebitMandate2.mmDebtorAccountIdentification,
					DirectDebitMandate3.mmDebtorAccountIdentification, CashAccount12.mmIdentification, SecuritiesAccount4.mmIdentification, InvestmentAccount27.mmIdentification, DirectDebitMandate4.mmDebtorAccount,
					InvestmentAccount35.mmIdentification, CashAccount26.mmIdentification, Account4.mmIdentification, Account5.mmIdentification, Account6.mmIdentification, PartyIdentificationAndAccount93.mmAccountIdentification,
					InvestmentAccountSelection1.mmAccountIdentification, InvestmentAccountSelection2.mmAccountIdentification, InvestmentAccount16.mmIdentification, InvestmentAccount26.mmIdentification, InvestmentAccount34.mmIdentification,
					LimitIdentificationDetails1.mmAccountIdentification, LimitIdentificationDetails2.mmAccountIdentification, LimitIdentificationDetails3.mmAccountIdentification, LimitIdentification1.mmAccountIdentification,
					LimitIdentification2.mmAccountIdentification, ReservationIdentificationDetails1.mmAccountIdentification, ReservationIdentification1.mmAccountIdentification, CashAccountSearchCriteria2.mmAccountIdentification,
					CashAccountSearchCriteria3.mmAccountIdentification, CashAccountSearchCriteria4.mmAccountIdentification, CashAccountSearchCriteria5.mmAccountIdentification, LimitSearchCriteria2.mmAccountIdentification,
					LimitSearchCriteria3.mmAccountIdentification, ReservationSearchCriteria1.mmAccountIdentification, ReservationSearchCriteria2.mmAccountIdentification, CashAccount7.mmIdentification, CashAccount16.mmIdentification,
					CashAccount24.mmIdentification, StandingOrderSearchCriteria1.mmAssociatedPoolAccount, SystemSearch2.mmAccountIdentification, AccountCashEntrySearch2.mmAccountIdentification, SystemSearch3.mmAccountIdentification,
					StandingOrderIdentification1.mmAccountIdentification, Account3.mmIdentification, CashAccount6.mmIdentification, CashAccount11.mmIdentification, StandingOrderDetails3.mmAssociatedPoolAccount,
					AccountReport7.mmAccountIdentification, AccountReport8.mmAccountIdentification, AccountReport10.mmAccountIdentification, StandingOrder2.mmAssociatedPoolAccount, AccountReport13.mmAccountIdentification,
					SystemDetails2.mmAccountIdentification, AccountCashEntryDetails3.mmAccountIdentification, System1.mmAccountIdentification, CashAccount13.mmIdentification, CashAccount20.mmIdentification, CashAccount25.mmIdentification,
					InvestmentAccount10.mmAccountIdentification, InvestmentAccount11.mmAccountIdentification, PartyIdentificationAndAccount2.mmAccountIdentification, Account7.mmIdentification, InvestmentAccount22.mmAccountIdentification,
					SubAccount1.mmIdentification, InvestmentAccount24.mmAccountIdentification, PartyIdentificationAndAccount5.mmAccountIdentification, PartyIdentificationAndAccount4.mmAccountIdentification,
					QuantityAndAccount29.mmCashAccount, PartyIdentificationAndAccount11.mmCashAccount, PartyIdentificationAndAccount11.mmChargesAccount, PartyIdentificationAndAccount11.mmCommissionAccount,
					PartyIdentificationAndAccount11.mmTaxAccount, PartyIdentificationAndAccount12.mmCashAccount, PartyIdentificationAndAccount12.mmChargesAccount, PartyIdentificationAndAccount12.mmCommissionAccount,
					PartyIdentificationAndAccount12.mmTaxAccount, PartyIdentificationAndAccount20.mmCashAccount, PartyIdentificationAndAccount20.mmChargesAccount, PartyIdentificationAndAccount20.mmCommissionAccount,
					PartyIdentificationAndAccount20.mmTaxAccount, PartyIdentificationAndAccount15.mmCashAccount, PartyIdentificationAndAccount15.mmChargesAccount, PartyIdentificationAndAccount15.mmCommissionAccount,
					PartyIdentificationAndAccount15.mmTaxAccount, PartyIdentificationAndAccount39.mmCashAccount, PartyIdentificationAndAccount39.mmChargesAccount, PartyIdentificationAndAccount39.mmCommissionAccount,
					PartyIdentificationAndAccount39.mmTaxAccount, PartyIdentificationAndAccount50.mmCashAccount, PartyIdentificationAndAccount50.mmChargesAccount, PartyIdentificationAndAccount50.mmCommissionAccount,
					PartyIdentificationAndAccount50.mmTaxAccount, QuantityAndAccount30.mmCashAccount, QuantityAndAccount32.mmCashAccount, PartyIdentificationAndAccount64.mmCashAccount, PartyIdentificationAndAccount64.mmChargesAccount,
					PartyIdentificationAndAccount64.mmCommissionAccount, PartyIdentificationAndAccount64.mmTaxAccount, PartyIdentificationAndAccount60.mmCashAccount, PartyIdentificationAndAccount60.mmChargesAccount,
					PartyIdentificationAndAccount60.mmCommissionAccount, PartyIdentificationAndAccount60.mmTaxAccount, QuantityAndAccount33.mmCashAccount, PartyIdentificationAndAccount17.mmCashAccount,
					PartyIdentificationAndAccount18.mmCashAccount, PartyIdentificationAndAccount23.mmCashAccount, PartyIdentificationAndAccount24.mmCashAccount, PartyIdentificationAndAccount52.mmCashAccount,
					PartyIdentificationAndAccount54.mmCashAccount, PartyIdentificationAndAccount57.mmCashAccount, PartyIdentificationAndAccount58.mmCashAccount, CashOption3.mmCashAccountIdentification,
					CashOption6.mmCashAccountIdentification, CashOption11.mmCashAccountIdentification, CashOption14.mmCashAccountIdentification, CashOption16.mmCashAccountIdentification, CashOption20.mmCashAccountIdentification,
					CashOption25.mmCashAccountIdentification, CashOption28.mmCashAccountIdentification, CashOption4.mmCashAccountIdentification, CashOption8.mmCashAccountIdentification, CashOption10.mmCashAccountIdentification,
					CashOption15.mmCashAccountIdentification, CashOption17.mmCashAccountIdentification, CashOption21.mmCashAccountIdentification, CashOption24.mmCashAccountIdentification, CashOption29.mmCashAccountIdentification,
					Account9.mmIdentification, Account10.mmIdentification, SafekeepingAccount1.mmIdentification, SafekeepingAccount2.mmIdentification, Account11.mmIdentification, Account13.mmIdentification, Account12.mmIdentification,
					QuantityAndAccount6.mmCashAccount, QuantityAndAccount11.mmCashAccount, PartyIdentificationAndAccount29.mmCashAccount, PartyIdentificationAndAccount29.mmChargesAccount,
					PartyIdentificationAndAccount29.mmCommissionAccount, PartyIdentificationAndAccount29.mmTaxAccount, PartyIdentificationAndAccount27.mmCashAccount, PartyIdentificationAndAccount27.mmChargesAccount,
					PartyIdentificationAndAccount27.mmCommissionAccount, PartyIdentificationAndAccount27.mmTaxAccount, QuantityAndAccount18.mmCashAccount, PartyIdentificationAndAccount38.mmCashAccount,
					PartyIdentificationAndAccount38.mmChargesAccount, PartyIdentificationAndAccount38.mmCommissionAccount, PartyIdentificationAndAccount38.mmTaxAccount, QuantityAndAccount19.mmCashAccount,
					PartyIdentificationAndAccount59.mmCashAccount, PartyIdentificationAndAccount59.mmChargesAccount, PartyIdentificationAndAccount59.mmCommissionAccount, PartyIdentificationAndAccount59.mmTaxAccount,
					QuantityAndAccount1.mmCashAccount, QuantityAndAccount5.mmCashAccount, QuantityAndAccount17.mmCashAccount, QuantityAndAccount24.mmCashAccount, QuantityAndAccount25.mmCashAccount, QuantityAndAccount34.mmCashAccount,
					QuantityAndAccount2.mmCashAccount, QuantityAndAccount12.mmCashAccount, QuantityAndAccount15.mmCashAccount, QuantityAndAccount20.mmCashAccount, QuantityAndAccount28.mmCashAccount, QuantityAndAccount37.mmCashAccount,
					PartyIdentificationAndAccount9.mmCashAccount, PartyIdentificationAndAccount79.mmCashAccount, PartyIdentificationAndAccount83.mmCashAccount, SecuritiesAccount20.mmIdentification, ConfirmationPartyDetails3.mmCashDetails,
					PartyIdentificationAndAccount8.mmCashAccount, ConfirmationPartyDetails6.mmCashDetails, PartyIdentificationAndAccount80.mmCashAccount, PartyIdentificationAndAccount80.mmChargesAccount,
					PartyIdentificationAndAccount80.mmCommissionAccount, PartyIdentificationAndAccount80.mmTaxAccount, AccountForAction1.mmIdentification, AccountForAction2.mmIdentification, CustomerAccount1.mmIdentification,
					CustomerAccount5.mmIdentification, CustomerAccountModification1.mmIdentification, CustomerAccount4.mmIdentification, CashAccount28.mmIdentification, CashAccount27.mmIdentification,
					AccountingStatementOfHoldings1.mmSubAccountDetails, AccountingStatementOfHoldings2.mmSubAccountDetails, CustodyStatementOfHoldings1.mmSubAccountDetails, CustodyStatementOfHoldings2.mmSubAccountDetails,
					InvestmentAccount13.mmAccountIdentification, PartyIdentificationAndAccount3.mmAccountIdentification, Creditor2.mmAccountIdentification, Debtor2.mmAccountIdentification, InvestmentAccount15.mmAccountIdentification,
					InvestmentAccount21.mmAccountIdentification, CreditTransfer6.mmCreditorAgentAccount, InvestmentAccount20.mmAccountIdentification, InvestmentAccount14.mmAccountIdentification, InvestmentAccount12.mmIdentification,
					StatementOfInvestmentFundTransactions1.mmSubAccountDetails, InvestmentAccount25.mmIdentification, StatementOfInvestmentFundTransactions2.mmSubAccountDetails, CashAccount3.mmIdentification,
					EligiblePosition2.mmAccountIdentification, EligiblePosition3.mmAccountIdentification, EligiblePosition4.mmAccountIdentification, SubAccount2.mmIdentification, DetailedInstructionStatus1.mmAccountIdentification,
					DetailedInstructionStatus1.mmSubAccountIdentification, DetailedInstructionStatus2.mmAccountIdentification, DetailedInstructionStatus2.mmSubAccountIdentification, DetailedInstructionStatus9.mmAccountIdentification,
					DetailedInstructionStatus9.mmSubAccountIdentification, CorporateActionOption1.mmAgentSecuritiesAccountIdentification, CorporateActionOption1.mmAgentCashAccountIdentification, CashAccount19.mmAccountIdentification,
					ProceedsDelivery1.mmCashAccountIdentification, CashAccount18.mmAccountIdentification, CorporateActionMovementFailedStatus1.mmAgentAccountIdentification,
					CorporateActionMovementFailedStatus1.mmClientAccountIdentification, IncludedAccount1.mmSecuritiesAccountIdentification, CashAccount17.mmAccountIdentification, QuantityAndAccount7.mmCashAccount,
					QuantityAndAccount16.mmCashAccount, QuantityAndAccount3.mmCashAccount, QuantityAndAccount13.mmCashAccount, PartyIdentificationAndAccount53.mmCashAccount, PartyIdentificationAndAccount53.mmChargesAccount,
					PartyIdentificationAndAccount53.mmCommissionAccount, PartyIdentificationAndAccount53.mmTaxAccount, PartyIdentificationAndAccount55.mmCashAccount, PartyIdentificationAndAccount55.mmChargesAccount,
					PartyIdentificationAndAccount55.mmCommissionAccount, PartyIdentificationAndAccount55.mmTaxAccount, QuantityAndAccount8.mmCashAccount, QuantityAndAccount14.mmCashAccount, PartyIdentificationAndAccount48.mmCashAccount,
					PartyIdentificationAndAccount48.mmChargesAccount, PartyIdentificationAndAccount48.mmCommissionAccount, PartyIdentificationAndAccount48.mmTaxAccount, IdentificationInformation1.mmAccount,
					IdentificationInformation2.mmAccount, AccountingAccount1.mmIdentification, SettlementTerms1.mmBeneficiaryAccount, InterestCalculation2.mmCollateralAccountIdentification, CollateralAccount1.mmIdentification,
					MemberDetails.mmAccount, QuantityAndAccount10.mmCashAccount, QuantityAndAccount21.mmCashAccount, QuantityAndAccount4.mmCashAccount, QuantityAndAccount22.mmCashAccount, PartyIdentificationAndAccount69.mmCashAccount,
					PartyIdentificationAndAccount69.mmChargesAccount, PartyIdentificationAndAccount69.mmCommissionAccount, PartyIdentificationAndAccount69.mmTaxAccount, PartyIdentificationAndAccount70.mmCashAccount,
					PartyIdentificationAndAccount70.mmChargesAccount, PartyIdentificationAndAccount70.mmCommissionAccount, PartyIdentificationAndAccount70.mmTaxAccount, QuantityAndAccount27.mmCashAccount,
					QuantityAndAccount36.mmCashAccount, QuantityAndAccount9.mmCashAccount, QuantityAndAccount23.mmCashAccount, QuantityAndAccount26.mmCashAccount, QuantityAndAccount35.mmCashAccount,
					PartyIdentificationAndAccount72.mmCashAccount, PartyIdentificationAndAccount72.mmChargesAccount, PartyIdentificationAndAccount72.mmCommissionAccount, PartyIdentificationAndAccount72.mmTaxAccount,
					SecuritiesAccount21.mmAccount, BalanceType7Choice.mmAccount, SecuritiesAccount19.mmIdentification, SecuritiesAccount18.mmIdentification, PartyIdentificationAndAccount32.mmAccountIdentification, Contribution1.mmAccount,
					DefaultFund1.mmDefaultFundAccount, CashAccountCharacteristics1.mmDebitAccount, SubAccount3.mmIdentification, CashAccount10.mmIdentification, CashAccount8.mmIdentification,
					PartyIdentificationAndAccount13.mmAccountIdentification, InvestmentAccount31.mmAccountIdentification, InvestmentAccount32.mmAccountIdentification, InvestmentAccount33.mmAccountIdentification,
					CreditTransfer7.mmCreditorAgentAccount, Account8.mmIdentification, PartyIdentificationAndAccount7.mmAccountIdentification, StatementAttributes1.mmAccountIdentification, StatementAttributes1.mmSubAccountIdentification,
					CustomerAccount2.mmIdentification, CustomerAccount2.mmReferenceAccountIdentification, CustomerAccount3.mmIdentification, Balance3.mmSubAccountDetails, LimitIdentification4.mmAccountIdentification,
					ServiceCategoryTotals1.mmAccountIdentification, BillingSearchCriteria1.mmAccountIdentification, LimitUtilisationJournalSearchCriteria1.mmAccountIdentification, InvestmentAccount38.mmIdentification,
					InvestmentAccount37.mmIdentification, InvestmentAccount40.mmAccountIdentification, AccountReport17.mmAccountIdentification, Account15.mmIdentification, Account16.mmIdentification, CashAccount29.mmIdentification,
					InvestmentAccount41.mmAccountIdentification, Account14.mmIdentification, CashOption31.mmCashAccountIdentification, CashOption32.mmCashAccountIdentification, PartyIdentificationAndAccount97.mmAccountIdentification,
					PartyIdentificationAndAccount96.mmAccountIdentification, CashOption36.mmCashAccountIdentification, CashOption35.mmCashAccountIdentification, InvestmentAccount43.mmIdentification,
					StatementOfInvestmentFundTransactions3.mmSubAccountDetails, InvestmentAccountSelection1Choice.mmAccountIdentification, InvestmentAccount45.mmAccountIdentification, InvestmentAccount42.mmAccountIdentification,
					InvestmentAccount46.mmIdentification, AccountSubLevel1.mmAccountIdentification, AccountSubLevel4.mmAccountIdentification, AccountSubLevel5.mmAccountIdentification, AccountSubLevel2.mmAccountIdentification,
					AccountSubLevel3.mmAccountIdentification, AccountSubLevel6.mmAccountIdentification, AccountSubLevel7.mmAccountIdentification, AccountSubLevel8.mmAccountIdentification, AccountSubLevel9.mmAccountIdentification,
					PartyIdentificationAndAccount101.mmCashAccount, CashCollateral3.mmCashAccountIdentification, CashCollateral2.mmCashAccountIdentification, DetailedInstructionStatus10.mmAccountIdentification,
					DetailedInstructionStatus10.mmSubAccountIdentification, EligiblePosition5.mmAccountIdentification, EligiblePosition6.mmAccountIdentification, CashCollateralResponse1.mmCashAccountIdentification,
					PartyIdentificationAndAccount102.mmAccountIdentification, InterestCalculation3.mmCollateralAccountIdentification, SubAccount4.mmIdentification, PartyIdentificationAndAccount104.mmCashAccount,
					CashCollateral5.mmCashAccountIdentification, FinancialItemParameters1.mmDebitAccount, FinancialItemParameters1.mmCreditAccount, ATMAccountStatement1.mmAccountIdentifier, CardAccount3.mmAccountIdentifier,
					CardAccount1.mmAccountIdentifier, CardAccount6.mmAccountIdentifier, CardAccount4.mmAccountIdentifier, CardAccount5.mmAccountIdentifier, CardAccount2.mmAccountIdentifier, QuantityAndAccount39.mmCashAccount,
					QuantityAndAccount41.mmCashAccount, QuantityAndAccount40.mmCashAccount, QuantityAndAccount42.mmCashAccount, QuantityAndAccount38.mmCashAccount, PartyIdentificationAndAccount112.mmCashAccount,
					PartyIdentificationAndAccount112.mmChargesAccount, PartyIdentificationAndAccount112.mmCommissionAccount, PartyIdentificationAndAccount112.mmTaxAccount, PartyIdentificationAndAccount111.mmCashAccount,
					PartyIdentificationAndAccount111.mmChargesAccount, PartyIdentificationAndAccount111.mmCommissionAccount, PartyIdentificationAndAccount111.mmTaxAccount, QuantityAndAccount43.mmCashAccount, Account18.mmIdentification,
					QuantityAndAccount45.mmCashAccount, QuantityAndAccount44.mmCashAccount, CashAccountCharacteristics2.mmDebitAccount, CashOption42.mmCashAccountIdentification, CashOption43.mmCashAccountIdentification,
					PartyIdentificationAndAccount120.mmCashAccount, PartyIdentificationAndAccount121.mmCashAccount, Account19.mmIdentification, InvestmentAccount49.mmIdentification, CashAccount34.mmIdentification,
					InvestmentAccount54.mmAccountIdentification, AccountSelection1Choice.mmAccountIdentification, InvestmentAccount50.mmIdentification, InvestmentAccount56.mmAccountIdentification,
					PartyIdentificationAndAccount124.mmAccountIdentification, SubAccount5.mmIdentification, InvestmentAccount55.mmAccountIdentification, DirectDebitMandate5.mmDebtorAccount, CashAccount32.mmIdentification,
					InvestmentAccount53.mmAccountIdentification, PartyIdentificationAndAccount125.mmAccountIdentification, Account20.mmIdentification, CashAccount33.mmIdentification, InvestmentAccount57.mmAccountIdentification,
					PartyIdentificationAndAccount123.mmAccountIdentification, CollateralAccount2.mmIdentification, InterestCalculation4.mmCollateralAccountIdentification, PartyIdentificationAndAccount126.mmAccountIdentification,
					CashOption49.mmCashAccountIdentification, CashOption47.mmCashAccountIdentification, PartyIdentificationAndAccount129.mmCashAccount, PartyIdentificationAndAccount130.mmCashAccount, QuantityAndAccount47.mmCashAccount,
					QuantityAndAccount48.mmCashAccount, QuantityAndAccount46.mmCashAccount, QuantityAndAccount51.mmCashAccount, QuantityAndAccount49.mmCashAccount, PartyIdentificationAndAccount133.mmCashAccount,
					PartyIdentificationAndAccount133.mmChargesAccount, PartyIdentificationAndAccount133.mmCommissionAccount, PartyIdentificationAndAccount133.mmTaxAccount, SecuritiesAccount30.mmIdentification,
					QuantityAndAccount50.mmCashAccount, QuantityAndAccount55.mmCashAccount, PartyIdentificationAndAccount134.mmCashAccount, PartyIdentificationAndAccount134.mmChargesAccount,
					PartyIdentificationAndAccount134.mmCommissionAccount, PartyIdentificationAndAccount134.mmTaxAccount, Account21.mmIdentification, QuantityAndAccount54.mmCashAccount, CardAccount10.mmAccountIdentifier,
					CardAccount9.mmAccountIdentifier, CardAccount8.mmAccountIdentifier, CardAccount11.mmAccountIdentifier, CardAccount13.mmAccountIdentifier, CardAccount7.mmAccountIdentifier, CardAccount12.mmAccountIdentifier,
					InvestmentAccount61.mmIdentification, AccountSelection2Choice.mmAccountIdentification, AccountManagementStatusAndReason5.mmExistingAccountIdentification, AccountManagementStatusAndReason5.mmAccountIdentification,
					InvestmentAccount62.mmIdentification, AccountSubLevel15.mmAccountIdentification, AccountSubLevel16.mmAccountIdentification, InvestmentAccount58.mmAccountIdentification, AccountSubLevel18.mmAccountIdentification,
					AccountSubLevel19.mmAccountIdentification, SubAccount6.mmIdentification, AccountSubLevel11.mmAccountIdentification, AccountSubLevel12.mmAccountIdentification, PartyIdentificationAndAccount147.mmAccountIdentification,
					Account23.mmAccountIdentification, AccountSubLevel17.mmAccountIdentification, AccountSubLevel13.mmAccountIdentification, AccountSubLevel14.mmAccountIdentification, CreditTransfer8.mmCreditorAgentAccount,
					InvestmentAccount60.mmAccountIdentification, Account22.mmIdentification, DirectDebitMandate6.mmDebtorAccount, CashOption51.mmCashAccountIdentification, CashOption50.mmCashAccountIdentification,
					CashCollateralResponse2.mmCashAccountIdentification, CashOption53.mmCashAccountIdentification, CashOption54.mmCashAccountIdentification, QuantityAndAccount57.mmCashAccount, QuantityAndAccount58.mmCashAccount,
					QuantityAndAccount56.mmCashAccount, QuantityAndAccount61.mmCashAccount, QuantityAndAccount62.mmCashAccount, QuantityAndAccount59.mmCashAccount, QuantityAndAccount60.mmCashAccount, CollateralAccount3.mmIdentification);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmObject();
		}
	};
	protected Account parentAccount;
	/**
	 * Account for which one or more sub-accounts are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSubAccount
	 * Account.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmParentAccount
	 * CashAccountCharacteristics1.mmParentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmParentAccount
	 * CashAccountCharacteristics2.mmParentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which one or more sub-accounts are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmParentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccountCharacteristics1.mmParentAccount, CashAccountCharacteristics2.mmParentAccount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParentAccount";
			definition = "Account for which one or more sub-accounts are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmSubAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Account> subAccount;
	/**
	 * Subdivision of an account used to segregate specific holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmParentAccount
	 * Account.mmParentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount14#mmSecondaryAccount
	 * CashAccount14.mmSecondaryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount22#mmSecondaryAccount
	 * CashAccount22.mmSecondaryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#mmSubAccountDetails
	 * InvestmentAccount24.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#mmSubAccountDetails
	 * PartyIdentificationAndAccount4.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21#mmSubAccountDetails
	 * InvestmentAccount21.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmSubAccountForHolding
	 * RedemptionOrder6.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmSubAccountForHolding
	 * RedemptionExecution6.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmSubAccountForHolding
	 * RedemptionOrder8.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmSubAccountForHolding
	 * SubscriptionOrder6.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmSubAccountForHolding
	 * SubscriptionExecution6.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmSubAccountForHolding
	 * SubscriptionOrder8.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount3#mmSubAccountDetails
	 * SafekeepingAccount3.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmSubAccountDetails
	 * SafekeepingAccount4.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition4#mmSubAccount
	 * SecurityPosition4.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmSubAccountDetails
	 * PartyIdentificationAndAccount32.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount30#mmSubAccount
	 * InvestmentAccount30.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmSubAccountDetails
	 * InvestmentAccount40.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#mmSubAccountDetails
	 * InvestmentAccount41.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmSubAccountDetails
	 * SafekeepingAccount6.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmSubAccount
	 * PartyIdentificationAndAccount102.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmSubAccountDetails
	 * InvestmentAccount54.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmSubAccountDetails
	 * InvestmentAccount56.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmSubAccountDetails
	 * InvestmentAccount55.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmSubAccountDetails
	 * InvestmentAccount57.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmSubAccountDetails
	 * PartyIdentificationAndAccount123.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126#mmSubAccount
	 * PartyIdentificationAndAccount126.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSubAccountForHolding
	 * RedemptionOrder14.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#mmSubAccountDetails
	 * InvestmentAccount58.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSubAccountForHolding
	 * SubscriptionExecution13.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSubAccountForHolding
	 * SubscriptionOrder14.mmSubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSubAccountForHolding
	 * RedemptionExecution15.mmSubAccountForHolding}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subdivision of an account used to segregate specific holdings."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSubAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount14.mmSecondaryAccount, CashAccount22.mmSecondaryAccount, InvestmentAccount24.mmSubAccountDetails, PartyIdentificationAndAccount4.mmSubAccountDetails,
					InvestmentAccount21.mmSubAccountDetails, RedemptionOrder6.mmSubAccountForHolding, RedemptionExecution6.mmSubAccountForHolding, RedemptionOrder8.mmSubAccountForHolding, SubscriptionOrder6.mmSubAccountForHolding,
					SubscriptionExecution6.mmSubAccountForHolding, SubscriptionOrder8.mmSubAccountForHolding, SafekeepingAccount3.mmSubAccountDetails, SafekeepingAccount4.mmSubAccountDetails, SecurityPosition4.mmSubAccount,
					PartyIdentificationAndAccount32.mmSubAccountDetails, InvestmentAccount30.mmSubAccount, InvestmentAccount40.mmSubAccountDetails, InvestmentAccount41.mmSubAccountDetails, SafekeepingAccount6.mmSubAccountDetails,
					PartyIdentificationAndAccount102.mmSubAccount, InvestmentAccount54.mmSubAccountDetails, InvestmentAccount56.mmSubAccountDetails, InvestmentAccount55.mmSubAccountDetails, InvestmentAccount57.mmSubAccountDetails,
					PartyIdentificationAndAccount123.mmSubAccountDetails, PartyIdentificationAndAccount126.mmSubAccount, RedemptionOrder14.mmSubAccountForHolding, InvestmentAccount58.mmSubAccountDetails,
					SubscriptionExecution13.mmSubAccountForHolding, SubscriptionOrder14.mmSubAccountForHolding, RedemptionExecution15.mmSubAccountForHolding);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubAccount";
			definition = "Subdivision of an account used to segregate specific holdings.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmParentAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected InvestmentFundClassProcessingCharacteristics relatedFundProcessingCharacteristics;
	/**
	 * Fund processing characteristics for which a settlement account is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementAccount
	 * InvestmentFundClassProcessingCharacteristics.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFundProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fund processing characteristics for which a settlement account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedFundProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedFundProcessingCharacteristics";
			definition = "Fund processing characteristics for which a settlement account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSettlementAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	protected AccountStatus status;
	/**
	 * Specifies the current state of an account, eg, enabled or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmAccount
	 * AccountStatus.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountStatus
	 * AccountStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount5#mmStatus
	 * CashAccount5.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmStatus
	 * InvestmentAccount17.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12#mmStatus
	 * CashAccount12.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmStatus
	 * InvestmentAccount27.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmStatus
	 * InvestmentAccount35.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmBlockedStatus
	 * InvestmentAccount35.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmBlockedStatus
	 * InvestmentAccount36.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmBlockedStatus
	 * InvestmentAccount34.mmBlockedStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount1#mmStatus
	 * CustomerAccount1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmStatus
	 * CustomerAccount2.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#mmStatus
	 * CustomerAccount3.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmStatus
	 * InvestmentAccount38.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmBlockedStatus
	 * InvestmentAccount38.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmBlockedStatus
	 * InvestmentAccount37.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmBlockedStatus
	 * InvestmentAccount39.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmStatus
	 * InvestmentAccount46.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmBlockedStatus
	 * InvestmentAccount46.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmBlockedStatus
	 * InvestmentAccount47.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmBlockedStatus
	 * InvestmentAccount49.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmBlockedStatus
	 * InvestmentAccount51.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmStatus
	 * InvestmentAccount50.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmBlockedStatus
	 * InvestmentAccount50.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmBlockedStatus
	 * InvestmentAccount61.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmAccountStatus
	 * AccountManagementStatusAndReason5.mmAccountStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmBlockedStatus
	 * AccountManagementStatusAndReason5.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmBlockedStatus
	 * InvestmentAccount63.mmBlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountStatus
	 * InvestmentAccount62.mmAccountStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmBlockedStatus
	 * InvestmentAccount62.mmBlockedStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the current state of an account, eg, enabled or deleted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount5.mmStatus, InvestmentAccount17.mmStatus, CashAccount12.mmStatus, InvestmentAccount27.mmStatus, InvestmentAccount35.mmStatus, InvestmentAccount35.mmBlockedStatus,
					InvestmentAccount36.mmBlockedStatus, InvestmentAccount34.mmBlockedStatus, CustomerAccount1.mmStatus, CustomerAccount2.mmStatus, CustomerAccount3.mmStatus, InvestmentAccount38.mmStatus,
					InvestmentAccount38.mmBlockedStatus, InvestmentAccount37.mmBlockedStatus, InvestmentAccount39.mmBlockedStatus, InvestmentAccount46.mmStatus, InvestmentAccount46.mmBlockedStatus, InvestmentAccount47.mmBlockedStatus,
					InvestmentAccount49.mmBlockedStatus, InvestmentAccount51.mmBlockedStatus, InvestmentAccount50.mmStatus, InvestmentAccount50.mmBlockedStatus, InvestmentAccount61.mmBlockedStatus,
					AccountManagementStatusAndReason5.mmAccountStatus, AccountManagementStatusAndReason5.mmBlockedStatus, InvestmentAccount63.mmBlockedStatus, InvestmentAccount62.mmAccountStatus, InvestmentAccount62.mmBlockedStatus);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmObject();
		}
	};
	protected LanguageCode language;
	/**
	 * Language for all communication concerning the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmLanguage
	 * InvestmentAccount17.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmLanguage
	 * InvestmentAccount27.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmLanguage
	 * InvestmentAccount35.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmLanguage
	 * InvestmentAccount18.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmLanguage
	 * InvestmentAccount28.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#mmLanguage
	 * InvestmentAccount36.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmLanguage
	 * InvestmentAccount16.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmLanguage
	 * InvestmentAccount26.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#mmLanguage
	 * InvestmentAccount34.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmLanguage
	 * InvestmentAccount38.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmLanguage
	 * InvestmentAccount37.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmLanguage
	 * InvestmentAccount39.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmLanguage
	 * InvestmentAccount46.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmLanguage
	 * InvestmentAccount47.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmLanguage
	 * InvestmentAccount49.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmLanguage
	 * InvestmentAccount51.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmLanguage
	 * InvestmentAccount50.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmLanguage
	 * InvestmentAccountOwnershipInformation12.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmLanguage
	 * InvestmentAccountOwnershipInformation13.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmLanguage
	 * InvestmentAccount61.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmLanguage
	 * InvestmentAccount63.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmLanguage
	 * InvestmentAccount62.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmLanguage
	 * InvestmentAccountOwnershipInformation15.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmLanguage
	 * InvestmentAccountOwnershipInformation14.mmLanguage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language for all communication concerning the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLanguage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount17.mmLanguage, InvestmentAccount27.mmLanguage, InvestmentAccount35.mmLanguage, InvestmentAccount18.mmLanguage, InvestmentAccount28.mmLanguage,
					InvestmentAccount36.mmLanguage, InvestmentAccount16.mmLanguage, InvestmentAccount26.mmLanguage, InvestmentAccount34.mmLanguage, InvestmentAccount38.mmLanguage, InvestmentAccount37.mmLanguage,
					InvestmentAccount39.mmLanguage, InvestmentAccount46.mmLanguage, InvestmentAccount47.mmLanguage, InvestmentAccount49.mmLanguage, InvestmentAccount51.mmLanguage, InvestmentAccount50.mmLanguage,
					InvestmentAccountOwnershipInformation12.mmLanguage, InvestmentAccountOwnershipInformation13.mmLanguage, InvestmentAccount61.mmLanguage, InvestmentAccount63.mmLanguage, InvestmentAccount62.mmLanguage,
					InvestmentAccountOwnershipInformation15.mmLanguage, InvestmentAccountOwnershipInformation14.mmLanguage);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language for all communication concerning the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getLanguage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.AccountPartyRole> partyRole;
	/**
	 * Specifies each role linked to an account and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
	 * AccountPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
	 * AccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to an account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to an account and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountPartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountPartyRole.mmObject();
		}
	};
	protected TradePartyRole tradePartyRole;
	/**
	 * Party for which an account is specified in the context of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
	 * TradePartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party for which an account is specified in the context of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradePartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Party for which an account is specified in the context of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
		}
	};
	protected CurrencyCode reportingCurrency;
	/**
	 * Currency used to calculate and report the balance and related entries of
	 * an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmCurrency
	 * CustomerAccountModification1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmReportingCurrency
	 * SecuritiesAccount21.mmReportingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmAccountBalanceCurrencyCode
	 * CashAccountCharacteristics1.mmAccountBalanceCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountBalanceCurrencyCode
	 * CashAccountCharacteristics2.mmAccountBalanceCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency used to calculate and report the balance and related entries of an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReportingCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccountModification1.mmCurrency, SecuritiesAccount21.mmReportingCurrency, CashAccountCharacteristics1.mmAccountBalanceCurrencyCode,
					CashAccountCharacteristics2.mmAccountBalanceCurrencyCode);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingCurrency";
			definition = "Currency used to calculate and report the balance and related entries of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getReportingCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.AccountRestriction> accountRestriction;
	/**
	 * Restriction on capability or operations allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmAccount
	 * AccountRestriction.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountRestriction
	 * AccountRestriction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance5#mmRestrictionType
	 * CashBalance5.mmRestrictionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmRestriction
	 * CustomerAccount1.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmRestriction
	 * CustomerAccount5.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmRestriction
	 * CustomerAccountModification1.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmRestriction
	 * CustomerAccount4.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmRestriction
	 * CustomerAccount2.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmRestriction
	 * CustomerAccount3.mmRestriction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction on capability or operations allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountRestriction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashBalance5.mmRestrictionType, CustomerAccount1.mmRestriction, CustomerAccount5.mmRestriction, CustomerAccountModification1.mmRestriction, CustomerAccount4.mmRestriction,
					CustomerAccount2.mmRestriction, CustomerAccount3.mmRestriction);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountRestriction";
			definition = "Restriction on capability or operations allowed.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
		}
	};
	protected SettlementPartyRole settlementPartyRole;
	/**
	 * Specifies the role of the party which uses the account for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlementAccount
	 * SettlementPartyRole.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SettlementPartyRole
	 * SettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role of the party which uses the account for settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPartyRole";
			definition = "Specifies the role of the party which uses the account for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmSettlementAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmObject();
		}
	};
	protected Max140Text purpose;
	/**
	 * Specifies the purpose of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmAccountPurpose
	 * CustomerAccount1.mmAccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmAccountPurpose
	 * CustomerAccount5.mmAccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PurposeModification1#mmPurpose
	 * PurposeModification1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmAccountPurpose
	 * CustomerAccountModification1.mmAccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmAccountPurpose
	 * CustomerAccount4.mmAccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmAccountPurpose
	 * CustomerAccount2.mmAccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmAccountPurpose
	 * CustomerAccount3.mmAccountPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the purpose of the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount1.mmAccountPurpose, CustomerAccount5.mmAccountPurpose, PurposeModification1.mmPurpose, CustomerAccountModification1.mmAccountPurpose, CustomerAccount4.mmAccountPurpose,
					CustomerAccount2.mmAccountPurpose, CustomerAccount3.mmAccountPurpose);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the purpose of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime closingDate;
	/**
	 * Date on which the account and related services cease effectively to be
	 * operational for the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmClosingDate
	 * CustomerAccount1.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmClosingDate
	 * CustomerAccount5.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmClosingDate
	 * CustomerAccountModification1.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmClosingDate
	 * CustomerAccount4.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmClosingDate
	 * AccountContract3.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmClosingDate
	 * CustomerAccount2.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmClosingDate
	 * CustomerAccount3.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmClosingDate
	 * InvestmentAccount49.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmClosingDate
	 * InvestmentAccount51.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmClosingDate
	 * InvestmentAccount50.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmClosingDate
	 * InvestmentAccount61.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmClosingDate
	 * InvestmentAccount63.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmClosingDate
	 * InvestmentAccount62.mmClosingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services cease effectively to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClosingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount1.mmClosingDate, CustomerAccount5.mmClosingDate, CustomerAccountModification1.mmClosingDate, CustomerAccount4.mmClosingDate, AccountContract3.mmClosingDate,
					CustomerAccount2.mmClosingDate, CustomerAccount3.mmClosingDate, InvestmentAccount49.mmClosingDate, InvestmentAccount51.mmClosingDate, InvestmentAccount50.mmClosingDate, InvestmentAccount61.mmClosingDate,
					InvestmentAccount63.mmClosingDate, InvestmentAccount62.mmClosingDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingDate";
			definition = "Date on which the account and related services cease effectively to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getClosingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime liveDate;
	/**
	 * Date of the first movement on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmGoLiveDate
	 * AccountContract3.mmGoLiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the first movement on the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract3.mmGoLiveDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiveDate";
			definition = "Date of the first movement on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getLiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod reportedPeriod;
	/**
	 * Specifies the period for which the movements in the account are reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccount
	 * DateTimePeriod.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmStatementPeriod
	 * StatementDetails.mmStatementPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmStatementPeriod
	 * StatementAndFinancialInstrumentDetails.mmStatementPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification1#mmFromToDate
	 * AccountNotification1.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmFromToDate
	 * AccountNotification2.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification5#mmFromToDate
	 * AccountNotification5.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmFromToDate
	 * AccountNotification7.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatementTerm1Choice#mmStatementPeriod
	 * StatementTerm1Choice.mmStatementPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmFromToDate
	 * AccountNotification11.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmFromToDate
	 * AccountNotification12.mmFromToDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period for which the movements in the account are reported."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReportedPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StatementDetails.mmStatementPeriod, StatementAndFinancialInstrumentDetails.mmStatementPeriod, AccountNotification1.mmFromToDate, AccountNotification2.mmFromToDate,
					AccountNotification5.mmFromToDate, AccountNotification7.mmFromToDate, StatementTerm1Choice.mmStatementPeriod, AccountNotification11.mmFromToDate, AccountNotification12.mmFromToDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportedPeriod";
			definition = "Specifies the period for which the movements in the account are reported.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected InvestmentFundPartyRole investmentFundPartyRole;
	/**
	 * Party role for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#mmAccount
	 * InvestmentFundPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
	 * InvestmentFundPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party role for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundPartyRole";
			definition = "Party role for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.mmObject();
		}
	};
	protected Collateral relatedCollateralProcess;
	/**
	 * Collateral data for which a collateral account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
	 * Collateral.mmCollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral data for which a collateral account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCollateralProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCollateralProcess";
			definition = "Collateral data for which a collateral account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmCollateralAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected GenericIdentification type;
	/**
	 * Specifies the type of account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmAccount
	 * GenericIdentification.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification5#mmType
	 * AccountIdentification5.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount3#mmSelectedAccountType
	 * CardAccount3.mmSelectedAccountType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmAccountType
	 * CardAccount6.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmSelectedAccountType
	 * CardAccount4.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount5#mmSelectedAccountType
	 * CardAccount5.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount10#mmSelectedAccountType
	 * CardAccount10.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#mmSelectedAccountType
	 * CardAccount9.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount8#mmSelectedAccountType
	 * CardAccount8.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount11#mmSelectedAccountType
	 * CardAccount11.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount13#mmAccountType
	 * CardAccount13.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount7#mmSelectedAccountType
	 * CardAccount7.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount12#mmAccountType
	 * CardAccount12.mmAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentification5.mmType, CardAccount3.mmSelectedAccountType, CardAccount6.mmAccountType, CardAccount4.mmSelectedAccountType, CardAccount5.mmSelectedAccountType,
					CardAccount10.mmSelectedAccountType, CardAccount9.mmSelectedAccountType, CardAccount8.mmSelectedAccountType, CardAccount11.mmSelectedAccountType, CardAccount13.mmAccountType, CardAccount7.mmSelectedAccountType,
					CardAccount12.mmAccountType);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected CorporateActionProceedsDeliveryInstruction relatedProceedsDelivery;
	/**
	 * Proceeds delivery instruction which contain account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSettlementAccount
	 * CorporateActionProceedsDeliveryInstruction.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProceedsDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds delivery instruction which contain account identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedProceedsDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedProceedsDelivery";
			definition = "Proceeds delivery instruction which contain account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmSettlementAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
		}
	};
	protected CorporateActionPartyRole relatedCorporateActionPartyRole;
	/**
	 * Party for which an account is specified in the context of a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#mmAccount
	 * CorporateActionPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
	 * CorporateActionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party for which an account is specified in the context of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionPartyRole";
			definition = "Party for which an account is specified in the context of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.mmObject();
		}
	};
	protected ClearingMemberRole defaultFundAccountOwner;
	/**
	 * Clearing member which holds a default fund account at an ICSD or at the
	 * central bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDefaultFundAccount
	 * ClearingMemberRole.mmDefaultFundAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing member which holds a default fund account at an ICSD or at the central bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDefaultFundAccountOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccountOwner";
			definition = "Clearing member which holds a default fund account at an ICSD or at the central bank.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmDefaultFundAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.System> system;
	/**
	 * System where the account is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmAccount
	 * System.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System where the account is held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System where the account is held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Balance> balance;
	/**
	 * Overall position representing the net debits and credits in an account at
	 * a specific point in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAccount
	 * Balance.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification10#mmBalanceForSubAccount
	 * SubAccountIdentification10.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification13#mmBalanceForSubAccount
	 * SubAccountIdentification13.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification2#mmBalanceForSubAccount
	 * SubAccountIdentification2.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification3#mmBalanceForSubAccount
	 * SubAccountIdentification3.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification16#mmBalanceForSubAccount
	 * SubAccountIdentification16.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification20#mmBalanceForSubAccount
	 * SubAccountIdentification20.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification23#mmBalanceForSubAccount
	 * SubAccountIdentification23.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification26#mmBalanceForSubAccount
	 * SubAccountIdentification26.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification11#mmBalanceForSubAccount
	 * SubAccountIdentification11.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification12#mmBalanceForSubAccount
	 * SubAccountIdentification12.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification1#mmBalanceForSubAccount
	 * SubAccountIdentification1.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5#mmBalanceForSubAccount
	 * SubAccountIdentification5.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification17#mmBalanceForSubAccount
	 * SubAccountIdentification17.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification19#mmBalanceForSubAccount
	 * SubAccountIdentification19.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification22#mmBalanceForSubAccount
	 * SubAccountIdentification22.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification25#mmBalanceForSubAccount
	 * SubAccountIdentification25.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification27#mmBalanceForSubAccount
	 * SubAccountIdentification27.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubaccountIdentification7#mmBalanceForSubAccount
	 * SubaccountIdentification7.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubaccountIdentification8#mmBalanceForSubAccount
	 * SubaccountIdentification8.mmBalanceForSubAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmBalance
	 * CardAccount4.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard17#mmRetainedCardBalance
	 * PaymentCard17.mmRetainedCardBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#mmBalance
	 * CardAccount2.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmAccountAndBalance
	 * CardTransactionDetail2.mmAccountAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmAccountAndBalance
	 * CardTransactionDetail4.mmAccountAndBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8#mmBalance
	 * CardAccount8.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard23#mmElectronicPurseBalance
	 * PaymentCard23.mmElectronicPurseBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overall position representing the net debits and credits in an account at a specific point in time."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SubAccountIdentification10.mmBalanceForSubAccount, SubAccountIdentification13.mmBalanceForSubAccount, SubAccountIdentification2.mmBalanceForSubAccount,
					SubAccountIdentification3.mmBalanceForSubAccount, SubAccountIdentification16.mmBalanceForSubAccount, SubAccountIdentification20.mmBalanceForSubAccount, SubAccountIdentification23.mmBalanceForSubAccount,
					SubAccountIdentification26.mmBalanceForSubAccount, SubAccountIdentification11.mmBalanceForSubAccount, SubAccountIdentification12.mmBalanceForSubAccount, SubAccountIdentification1.mmBalanceForSubAccount,
					SubAccountIdentification5.mmBalanceForSubAccount, SubAccountIdentification17.mmBalanceForSubAccount, SubAccountIdentification19.mmBalanceForSubAccount, SubAccountIdentification22.mmBalanceForSubAccount,
					SubAccountIdentification25.mmBalanceForSubAccount, SubAccountIdentification27.mmBalanceForSubAccount, SubaccountIdentification7.mmBalanceForSubAccount, SubaccountIdentification8.mmBalanceForSubAccount,
					CardAccount4.mmBalance, PaymentCard17.mmRetainedCardBalance, CardAccount2.mmBalance, CardTransactionDetail2.mmAccountAndBalance, CardTransactionDetail4.mmAccountAndBalance, CardAccount8.mmBalance,
					PaymentCard23.mmElectronicPurseBalance);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Overall position representing the net debits and credits in an account at a specific point in time.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Entry> entry;
	/**
	 * Record of the movements into or out of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#mmAccount
	 * Entry.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement1#mmAccountStatement
	 * ATMAccountStatement1.mmAccountStatement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of the movements into or out of an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEntry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ATMAccountStatement1.mmAccountStatement);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AccountContract> accountContract;
	/**
	 * Agreement which provides information on the account and on the services
	 * linked to it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccount
	 * AccountContract.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement which provides information on the account and on the services linked to it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountContract";
			definition = "Agreement which provides information on the account and on the services linked to it.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
		}
	};
	protected ISODateTime openingDate;
	/**
	 * Date on which the account and related basic services are effectively
	 * operational for the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmOpeningDate
	 * CustomerAccount2.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmOpeningDate
	 * CustomerAccount3.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmOpeningDate
	 * InvestmentAccount49.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmOpeningDate
	 * InvestmentAccount51.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmOpeningDate
	 * InvestmentAccount50.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmOpeningDate
	 * InvestmentAccount61.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmOpeningDate
	 * InvestmentAccount63.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmOpeningDate
	 * InvestmentAccount62.mmOpeningDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related basic services are effectively operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOpeningDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount2.mmOpeningDate, CustomerAccount3.mmOpeningDate, InvestmentAccount49.mmOpeningDate, InvestmentAccount51.mmOpeningDate, InvestmentAccount50.mmOpeningDate,
					InvestmentAccount61.mmOpeningDate, InvestmentAccount63.mmOpeningDate, InvestmentAccount62.mmOpeningDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningDate";
			definition = "Date on which the account and related basic services are effectively operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getOpeningDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Rate used to calculate the difference between amounts based on the base
	 * currency and the reporting currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmReportedAccount
	 * CurrencyExchange.mmReportedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the difference between amounts based on the base currency and the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to calculate the difference between amounts based on the base currency and the reporting currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmReportedAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected DefaultFundContribution defaultFundContribution;
	/**
	 * Default fund contribution parameters associated with a contribution
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmContributionAccount
	 * DefaultFundContribution.mmContributionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundContribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Default fund contribution parameters associated with a contribution account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDefaultFundContribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Default fund contribution parameters associated with a contribution account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmContributionAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
		}
	};
	protected SystemMemberRole systemMember;
	/**
	 * Member of a system which is the owner of an account with the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmAccount
	 * SystemMemberRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member of a system which is the owner of an account with the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystemMember = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMember";
			definition = "Member of a system which is the owner of an account with the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmObject();
		}
	};
	protected CollateralAccountTypeCode collateralAccountType;
	/**
	 * Specifies the collateral account type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode
	 * CollateralAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType1Choice#mmType
	 * CollateralAccountIdentificationType1Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType1Choice#mmProprietary
	 * CollateralAccountIdentificationType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount1#mmType
	 * CollateralAccount1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount2#mmType
	 * CollateralAccount2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice#mmType
	 * CollateralAccountIdentificationType2Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice#mmProprietary
	 * CollateralAccountIdentificationType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount3#mmType
	 * CollateralAccount3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice#mmType
	 * CollateralAccountIdentificationType3Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice#mmProprietary
	 * CollateralAccountIdentificationType3Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the collateral account type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralAccountIdentificationType1Choice.mmType, CollateralAccountIdentificationType1Choice.mmProprietary, CollateralAccount1.mmType, CollateralAccount2.mmType,
					CollateralAccountIdentificationType2Choice.mmType, CollateralAccountIdentificationType2Choice.mmProprietary, CollateralAccount3.mmType, CollateralAccountIdentificationType3Choice.mmType,
					CollateralAccountIdentificationType3Choice.mmProprietary);
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAccountType";
			definition = "Specifies the collateral account type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralAccountTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Account.class.getMethod("getCollateralAccountType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountService accountService;
	/**
	 * Services linked to the account and specified in the account contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccount
	 * AccountService.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Services linked to the account and specified in the account contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Services linked to the account and specified in the account contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}
	};
	protected Reconciliation reconciliation;
	/**
	 * Process which compares and matches trade information with entries in an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmAccount
	 * Reconciliation.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which compares and matches trade information with entries in an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};
	protected ManagedAccountProduct managedAccountProduct;
	/**
	 * Product which provides guidance to investors to manage their portfolios.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#mmAccount
	 * ManagedAccountProduct.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct
	 * ManagedAccountProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Account
	 * Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagedAccountProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Product which provides guidance to investors to manage their portfolios."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmManagedAccountProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManagedAccountProduct";
			definition = "Product which provides guidance to investors to manage their portfolios.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Account";
				definition = "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmAccount, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSettlementAccount,
						com.tools20022.repository.entity.Account.mmParentAccount, com.tools20022.repository.entity.Account.mmSubAccount, com.tools20022.repository.entity.AccountIdentification.mmAccount,
						com.tools20022.repository.entity.DateTimePeriod.mmAccount, com.tools20022.repository.entity.AccountPartyRole.mmAccount, com.tools20022.repository.entity.AccountService.mmAccount,
						com.tools20022.repository.entity.AccountStatus.mmAccount, com.tools20022.repository.entity.AccountContract.mmAccount, com.tools20022.repository.entity.Entry.mmAccount,
						com.tools20022.repository.entity.InvestmentFundPartyRole.mmAccount, com.tools20022.repository.entity.TradePartyRole.mmAccount, com.tools20022.repository.entity.System.mmAccount,
						com.tools20022.repository.entity.SystemMemberRole.mmAccount, com.tools20022.repository.entity.ClearingMemberRole.mmDefaultFundAccount, com.tools20022.repository.entity.Balance.mmAccount,
						com.tools20022.repository.entity.SettlementPartyRole.mmSettlementAccount, com.tools20022.repository.entity.AccountRestriction.mmAccount, com.tools20022.repository.entity.CurrencyExchange.mmReportedAccount,
						com.tools20022.repository.entity.Collateral.mmCollateralAccount, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmSettlementAccount,
						com.tools20022.repository.entity.CorporateActionPartyRole.mmAccount, com.tools20022.repository.entity.DefaultFundContribution.mmContributionAccount, com.tools20022.repository.entity.Reconciliation.mmAccount,
						com.tools20022.repository.entity.ManagedAccountProduct.mmAccount);
				derivationElement_lazy = () -> Arrays.asList(SubAccount1.mmCharacteristic, IdentificationModification1.mmOriginalPartyAndAccountIdentification, IdentificationModification1.mmUpdatedPartyAndAccountIdentification,
						IdentificationModification2.mmOriginalPartyAndAccountIdentification, IdentificationModification2.mmUpdatedPartyAndAccountIdentification, IdentificationVerification1.mmPartyAndAccountIdentification,
						IdentificationVerification2.mmPartyAndAccountIdentification, SubAccount3.mmCharacteristic, StatementAttributes1.mmStatementTerm, SubAccount4.mmCharacteristic, SubAccount5.mmCharacteristic,
						SubAccount6.mmCharacteristic, Account23.mmRelatedAccountDetails);
				subType_lazy = () -> Arrays.asList(CashAccount.mmObject(), SecuritiesAccount.mmObject(), InvestmentAccount.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmBaseCurrency, com.tools20022.repository.entity.Account.mmIdentification, com.tools20022.repository.entity.Account.mmParentAccount,
						com.tools20022.repository.entity.Account.mmSubAccount, com.tools20022.repository.entity.Account.mmRelatedFundProcessingCharacteristics, com.tools20022.repository.entity.Account.mmStatus,
						com.tools20022.repository.entity.Account.mmLanguage, com.tools20022.repository.entity.Account.mmPartyRole, com.tools20022.repository.entity.Account.mmTradePartyRole,
						com.tools20022.repository.entity.Account.mmReportingCurrency, com.tools20022.repository.entity.Account.mmAccountRestriction, com.tools20022.repository.entity.Account.mmSettlementPartyRole,
						com.tools20022.repository.entity.Account.mmPurpose, com.tools20022.repository.entity.Account.mmClosingDate, com.tools20022.repository.entity.Account.mmLiveDate,
						com.tools20022.repository.entity.Account.mmReportedPeriod, com.tools20022.repository.entity.Account.mmInvestmentFundPartyRole, com.tools20022.repository.entity.Account.mmRelatedCollateralProcess,
						com.tools20022.repository.entity.Account.mmType, com.tools20022.repository.entity.Account.mmRelatedProceedsDelivery, com.tools20022.repository.entity.Account.mmRelatedCorporateActionPartyRole,
						com.tools20022.repository.entity.Account.mmDefaultFundAccountOwner, com.tools20022.repository.entity.Account.mmSystem, com.tools20022.repository.entity.Account.mmBalance,
						com.tools20022.repository.entity.Account.mmEntry, com.tools20022.repository.entity.Account.mmAccountContract, com.tools20022.repository.entity.Account.mmOpeningDate,
						com.tools20022.repository.entity.Account.mmCurrencyExchange, com.tools20022.repository.entity.Account.mmDefaultFundContribution, com.tools20022.repository.entity.Account.mmSystemMember,
						com.tools20022.repository.entity.Account.mmCollateralAccountType, com.tools20022.repository.entity.Account.mmAccountService, com.tools20022.repository.entity.Account.mmReconciliation,
						com.tools20022.repository.entity.Account.mmManagedAccountProduct);
				derivationComponent_lazy = () -> Arrays.asList(StatementDetails.mmObject(), StatementAndFinancialInstrumentDetails.mmObject(), Account1.mmObject(), Account2.mmObject(), Account4.mmObject(), Account3.mmObject(),
						Account7.mmObject(), SubAccount1.mmObject(), Account9.mmObject(), Account10.mmObject(), Account11.mmObject(), Account13.mmObject(), Account12.mmObject(), SubAccount2.mmObject(),
						IdentificationInformation1.mmObject(), IdentificationModification1.mmObject(), IdentificationInformation2.mmObject(), IdentificationModification2.mmObject(), IdentificationVerification1.mmObject(),
						IdentificationVerification2.mmObject(), AccountingAccount1.mmObject(), CollateralAccountIdentificationType1Choice.mmObject(), CollateralAccount1.mmObject(), SubAccount3.mmObject(), Account8.mmObject(),
						StatementTerm1Choice.mmObject(), StatementAttributes1.mmObject(), Account14.mmObject(), SubAccount4.mmObject(), ATMAccountStatement1.mmObject(), Account18.mmObject(), SubAccount5.mmObject(), Account20.mmObject(),
						CollateralAccount2.mmObject(), CollateralAccountIdentificationType2Choice.mmObject(), Account21.mmObject(), SubAccount6.mmObject(), Account23.mmObject(), Account22.mmObject(), CollateralAccount3.mmObject(),
						CollateralAccountIdentificationType3Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Account.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(CurrencyCode baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public AccountIdentification getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.entity.AccountIdentification identification) {
		this.identification = identification;
	}

	public Account getParentAccount() {
		return parentAccount;
	}

	public void setParentAccount(com.tools20022.repository.entity.Account parentAccount) {
		this.parentAccount = parentAccount;
	}

	public List<Account> getSubAccount() {
		return subAccount;
	}

	public void setSubAccount(List<com.tools20022.repository.entity.Account> subAccount) {
		this.subAccount = subAccount;
	}

	public InvestmentFundClassProcessingCharacteristics getRelatedFundProcessingCharacteristics() {
		return relatedFundProcessingCharacteristics;
	}

	public void setRelatedFundProcessingCharacteristics(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics relatedFundProcessingCharacteristics) {
		this.relatedFundProcessingCharacteristics = relatedFundProcessingCharacteristics;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(com.tools20022.repository.entity.AccountStatus status) {
		this.status = status;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public void setLanguage(LanguageCode language) {
		this.language = language;
	}

	public List<AccountPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.AccountPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public TradePartyRole getTradePartyRole() {
		return tradePartyRole;
	}

	public void setTradePartyRole(com.tools20022.repository.entity.TradePartyRole tradePartyRole) {
		this.tradePartyRole = tradePartyRole;
	}

	public CurrencyCode getReportingCurrency() {
		return reportingCurrency;
	}

	public void setReportingCurrency(CurrencyCode reportingCurrency) {
		this.reportingCurrency = reportingCurrency;
	}

	public List<AccountRestriction> getAccountRestriction() {
		return accountRestriction;
	}

	public void setAccountRestriction(List<com.tools20022.repository.entity.AccountRestriction> accountRestriction) {
		this.accountRestriction = accountRestriction;
	}

	public SettlementPartyRole getSettlementPartyRole() {
		return settlementPartyRole;
	}

	public void setSettlementPartyRole(com.tools20022.repository.entity.SettlementPartyRole settlementPartyRole) {
		this.settlementPartyRole = settlementPartyRole;
	}

	public Max140Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max140Text purpose) {
		this.purpose = purpose;
	}

	public ISODateTime getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(ISODateTime closingDate) {
		this.closingDate = closingDate;
	}

	public ISODateTime getLiveDate() {
		return liveDate;
	}

	public void setLiveDate(ISODateTime liveDate) {
		this.liveDate = liveDate;
	}

	public DateTimePeriod getReportedPeriod() {
		return reportedPeriod;
	}

	public void setReportedPeriod(com.tools20022.repository.entity.DateTimePeriod reportedPeriod) {
		this.reportedPeriod = reportedPeriod;
	}

	public InvestmentFundPartyRole getInvestmentFundPartyRole() {
		return investmentFundPartyRole;
	}

	public void setInvestmentFundPartyRole(com.tools20022.repository.entity.InvestmentFundPartyRole investmentFundPartyRole) {
		this.investmentFundPartyRole = investmentFundPartyRole;
	}

	public Collateral getRelatedCollateralProcess() {
		return relatedCollateralProcess;
	}

	public void setRelatedCollateralProcess(com.tools20022.repository.entity.Collateral relatedCollateralProcess) {
		this.relatedCollateralProcess = relatedCollateralProcess;
	}

	public GenericIdentification getType() {
		return type;
	}

	public void setType(com.tools20022.repository.entity.GenericIdentification type) {
		this.type = type;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedProceedsDelivery() {
		return relatedProceedsDelivery;
	}

	public void setRelatedProceedsDelivery(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction relatedProceedsDelivery) {
		this.relatedProceedsDelivery = relatedProceedsDelivery;
	}

	public CorporateActionPartyRole getRelatedCorporateActionPartyRole() {
		return relatedCorporateActionPartyRole;
	}

	public void setRelatedCorporateActionPartyRole(com.tools20022.repository.entity.CorporateActionPartyRole relatedCorporateActionPartyRole) {
		this.relatedCorporateActionPartyRole = relatedCorporateActionPartyRole;
	}

	public ClearingMemberRole getDefaultFundAccountOwner() {
		return defaultFundAccountOwner;
	}

	public void setDefaultFundAccountOwner(com.tools20022.repository.entity.ClearingMemberRole defaultFundAccountOwner) {
		this.defaultFundAccountOwner = defaultFundAccountOwner;
	}

	public List<System> getSystem() {
		return system;
	}

	public void setSystem(List<com.tools20022.repository.entity.System> system) {
		this.system = system;
	}

	public List<Balance> getBalance() {
		return balance;
	}

	public void setBalance(List<com.tools20022.repository.entity.Balance> balance) {
		this.balance = balance;
	}

	public List<Entry> getEntry() {
		return entry;
	}

	public void setEntry(List<com.tools20022.repository.entity.Entry> entry) {
		this.entry = entry;
	}

	public List<AccountContract> getAccountContract() {
		return accountContract;
	}

	public void setAccountContract(List<com.tools20022.repository.entity.AccountContract> accountContract) {
		this.accountContract = accountContract;
	}

	public ISODateTime getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(ISODateTime openingDate) {
		this.openingDate = openingDate;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public DefaultFundContribution getDefaultFundContribution() {
		return defaultFundContribution;
	}

	public void setDefaultFundContribution(com.tools20022.repository.entity.DefaultFundContribution defaultFundContribution) {
		this.defaultFundContribution = defaultFundContribution;
	}

	public SystemMemberRole getSystemMember() {
		return systemMember;
	}

	public void setSystemMember(com.tools20022.repository.entity.SystemMemberRole systemMember) {
		this.systemMember = systemMember;
	}

	public CollateralAccountTypeCode getCollateralAccountType() {
		return collateralAccountType;
	}

	public void setCollateralAccountType(CollateralAccountTypeCode collateralAccountType) {
		this.collateralAccountType = collateralAccountType;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(com.tools20022.repository.entity.AccountService accountService) {
		this.accountService = accountService;
	}

	public Reconciliation getReconciliation() {
		return reconciliation;
	}

	public void setReconciliation(com.tools20022.repository.entity.Reconciliation reconciliation) {
		this.reconciliation = reconciliation;
	}

	public ManagedAccountProduct getManagedAccountProduct() {
		return managedAccountProduct;
	}

	public void setManagedAccountProduct(com.tools20022.repository.entity.ManagedAccountProduct managedAccountProduct) {
		this.managedAccountProduct = managedAccountProduct;
	}
}