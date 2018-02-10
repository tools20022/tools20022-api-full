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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.CollateralAccountIdentificationType1Choice;
import com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice;
import com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice;
import com.tools20022.repository.choice.StatementTerm1Choice;
import com.tools20022.repository.codeset.CollateralAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.msg.NewAccount1 NewAccount1}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.PositionAccount2
 * PositionAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentAccount1
 * PaymentAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account25 Account25}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :11A::ACCT</li>
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
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmCurrency
	 * CustomerAccount7.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmCurrency
	 * CustomerAccount6.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CutOff1#mmCurrency
	 * CutOff1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria6#mmCurrency
	 * CashAccountSearchCriteria6.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount35#mmCurrency
	 * CashAccount35.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount36#mmCurrency
	 * CashAccount36.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount14#mmCurrency
	 * CardAccount14.mmCurrency}</li>
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
					CardAccount7.mmCurrency, CardAccount12.mmCurrency, CustomerAccount7.mmCurrency, CustomerAccount6.mmCurrency, CutOff1.mmCurrency, CashAccountSearchCriteria6.mmCurrency, CashAccount35.mmCurrency, CashAccount36.mmCurrency,
					CardAccount14.mmCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * derivation} = List of 509 elements</li>
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
			derivation_lazy = () -> ListBuilderForAccount_00.addElems(new ArrayList<>());
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount66#mmSubAccountDetails
	 * InvestmentAccount66.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmSubAccountDetails
	 * InvestmentAccount67.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount65#mmSubAccountDetails
	 * InvestmentAccount65.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158#mmSubAccountDetails
	 * PartyIdentificationAndAccount158.mmSubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount68#mmSubAccountDetails
	 * InvestmentAccount68.mmSubAccountDetails}</li>
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
					SubscriptionExecution13.mmSubAccountForHolding, SubscriptionOrder14.mmSubAccountForHolding, RedemptionExecution15.mmSubAccountForHolding, InvestmentAccount66.mmSubAccountDetails, InvestmentAccount67.mmSubAccountDetails,
					InvestmentAccount65.mmSubAccountDetails, PartyIdentificationAndAccount158.mmSubAccountDetails, InvestmentAccount68.mmSubAccountDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmStatus
	 * CustomerAccount7.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmStatus
	 * CustomerAccount6.mmStatus}</li>
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
					InvestmentAccount49.mmBlockedStatus, InvestmentAccount51.mmBlockedStatus, InvestmentAccount50.mmStatus, InvestmentAccount50.mmBlockedStatus, CustomerAccount7.mmStatus, CustomerAccount6.mmStatus,
					InvestmentAccount61.mmBlockedStatus, AccountManagementStatusAndReason5.mmAccountStatus, AccountManagementStatusAndReason5.mmBlockedStatus, InvestmentAccount63.mmBlockedStatus, InvestmentAccount62.mmAccountStatus,
					InvestmentAccount62.mmBlockedStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.NewAccount1#mmOrganisation
	 * NewAccount1.mmOrganisation}</li>
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
			derivation_lazy = () -> Arrays.asList(NewAccount1.mmOrganisation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :11A::ACCT</li>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::ACCT"));
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
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmRestriction
	 * CustomerAccount7.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmRestriction
	 * CustomerAccount6.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance10#mmRestrictionType
	 * CashBalance10.mmRestrictionType}</li>
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
					CustomerAccount2.mmRestriction, CustomerAccount3.mmRestriction, CustomerAccount7.mmRestriction, CustomerAccount6.mmRestriction, CashBalance10.mmRestrictionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmAccountPurpose
	 * CustomerAccount7.mmAccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmAccountPurpose
	 * CustomerAccount6.mmAccountPurpose}</li>
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
					CustomerAccount2.mmAccountPurpose, CustomerAccount3.mmAccountPurpose, CustomerAccount7.mmAccountPurpose, CustomerAccount6.mmAccountPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmClosingDate
	 * CustomerAccount7.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmClosingDate
	 * CustomerAccount6.mmClosingDate}</li>
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
					CustomerAccount2.mmClosingDate, CustomerAccount3.mmClosingDate, InvestmentAccount49.mmClosingDate, InvestmentAccount51.mmClosingDate, InvestmentAccount50.mmClosingDate, CustomerAccount7.mmClosingDate,
					CustomerAccount6.mmClosingDate, InvestmentAccount61.mmClosingDate, InvestmentAccount63.mmClosingDate, InvestmentAccount62.mmClosingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification15#mmFromToDate
	 * AccountNotification15.mmFromToDate}</li>
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
					AccountNotification5.mmFromToDate, AccountNotification7.mmFromToDate, StatementTerm1Choice.mmStatementPeriod, AccountNotification11.mmFromToDate, AccountNotification12.mmFromToDate, AccountNotification15.mmFromToDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification48#mmBalanceForSubAccount
	 * SubAccountIdentification48.mmBalanceForSubAccount}</li>
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
					PaymentCard23.mmElectronicPurseBalance, SubAccountIdentification48.mmBalanceForSubAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmOpeningDate
	 * CustomerAccount7.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmOpeningDate
	 * CustomerAccount6.mmOpeningDate}</li>
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
					CustomerAccount7.mmOpeningDate, CustomerAccount6.mmOpeningDate, InvestmentAccount61.mmOpeningDate, InvestmentAccount63.mmOpeningDate, InvestmentAccount62.mmOpeningDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetHolding1#mmCollateralRequirement
	 * AssetHolding1.mmCollateralRequirement}</li>
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
					CollateralAccountIdentificationType3Choice.mmProprietary, AssetHolding1.mmCollateralRequirement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
	 * 
	 <p>
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
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
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
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::ACCT"));
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
						StatementTerm1Choice.mmObject(), StatementAttributes1.mmObject(), Account14.mmObject(), SubAccount4.mmObject(), ATMAccountStatement1.mmObject(), Account18.mmObject(), NewAccount1.mmObject(), SubAccount5.mmObject(),
						Account20.mmObject(), CollateralAccount2.mmObject(), CollateralAccountIdentificationType2Choice.mmObject(), Account21.mmObject(), SubAccount6.mmObject(), Account23.mmObject(), Account22.mmObject(),
						CollateralAccount3.mmObject(), CollateralAccountIdentificationType3Choice.mmObject(), PositionAccount2.mmObject(), PaymentAccount1.mmObject(), Account25.mmObject());
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

	public Account setBaseCurrency(CurrencyCode baseCurrency) {
		this.baseCurrency = Objects.requireNonNull(baseCurrency);
		return this;
	}

	public AccountIdentification getIdentification() {
		return identification;
	}

	public Account setIdentification(com.tools20022.repository.entity.AccountIdentification identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Account getParentAccount() {
		return parentAccount;
	}

	public Account setParentAccount(com.tools20022.repository.entity.Account parentAccount) {
		this.parentAccount = Objects.requireNonNull(parentAccount);
		return this;
	}

	public List<Account> getSubAccount() {
		return subAccount == null ? subAccount = new ArrayList<>() : subAccount;
	}

	public Account setSubAccount(List<com.tools20022.repository.entity.Account> subAccount) {
		this.subAccount = Objects.requireNonNull(subAccount);
		return this;
	}

	public InvestmentFundClassProcessingCharacteristics getRelatedFundProcessingCharacteristics() {
		return relatedFundProcessingCharacteristics;
	}

	public Account setRelatedFundProcessingCharacteristics(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics relatedFundProcessingCharacteristics) {
		this.relatedFundProcessingCharacteristics = Objects.requireNonNull(relatedFundProcessingCharacteristics);
		return this;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public Account setStatus(com.tools20022.repository.entity.AccountStatus status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public Account setLanguage(LanguageCode language) {
		this.language = Objects.requireNonNull(language);
		return this;
	}

	public List<AccountPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Account setPartyRole(List<com.tools20022.repository.entity.AccountPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public TradePartyRole getTradePartyRole() {
		return tradePartyRole;
	}

	public Account setTradePartyRole(com.tools20022.repository.entity.TradePartyRole tradePartyRole) {
		this.tradePartyRole = Objects.requireNonNull(tradePartyRole);
		return this;
	}

	public CurrencyCode getReportingCurrency() {
		return reportingCurrency;
	}

	public Account setReportingCurrency(CurrencyCode reportingCurrency) {
		this.reportingCurrency = Objects.requireNonNull(reportingCurrency);
		return this;
	}

	public List<AccountRestriction> getAccountRestriction() {
		return accountRestriction == null ? accountRestriction = new ArrayList<>() : accountRestriction;
	}

	public Account setAccountRestriction(List<com.tools20022.repository.entity.AccountRestriction> accountRestriction) {
		this.accountRestriction = Objects.requireNonNull(accountRestriction);
		return this;
	}

	public SettlementPartyRole getSettlementPartyRole() {
		return settlementPartyRole;
	}

	public Account setSettlementPartyRole(com.tools20022.repository.entity.SettlementPartyRole settlementPartyRole) {
		this.settlementPartyRole = Objects.requireNonNull(settlementPartyRole);
		return this;
	}

	public Max140Text getPurpose() {
		return purpose;
	}

	public Account setPurpose(Max140Text purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public Optional<ISODateTime> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public Account setClosingDate(ISODateTime closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public ISODateTime getLiveDate() {
		return liveDate;
	}

	public Account setLiveDate(ISODateTime liveDate) {
		this.liveDate = Objects.requireNonNull(liveDate);
		return this;
	}

	public DateTimePeriod getReportedPeriod() {
		return reportedPeriod;
	}

	public Account setReportedPeriod(com.tools20022.repository.entity.DateTimePeriod reportedPeriod) {
		this.reportedPeriod = Objects.requireNonNull(reportedPeriod);
		return this;
	}

	public InvestmentFundPartyRole getInvestmentFundPartyRole() {
		return investmentFundPartyRole;
	}

	public Account setInvestmentFundPartyRole(com.tools20022.repository.entity.InvestmentFundPartyRole investmentFundPartyRole) {
		this.investmentFundPartyRole = Objects.requireNonNull(investmentFundPartyRole);
		return this;
	}

	public Optional<Collateral> getRelatedCollateralProcess() {
		return relatedCollateralProcess == null ? Optional.empty() : Optional.of(relatedCollateralProcess);
	}

	public Account setRelatedCollateralProcess(com.tools20022.repository.entity.Collateral relatedCollateralProcess) {
		this.relatedCollateralProcess = relatedCollateralProcess;
		return this;
	}

	public GenericIdentification getType() {
		return type;
	}

	public Account setType(com.tools20022.repository.entity.GenericIdentification type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedProceedsDelivery() {
		return relatedProceedsDelivery;
	}

	public Account setRelatedProceedsDelivery(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction relatedProceedsDelivery) {
		this.relatedProceedsDelivery = Objects.requireNonNull(relatedProceedsDelivery);
		return this;
	}

	public CorporateActionPartyRole getRelatedCorporateActionPartyRole() {
		return relatedCorporateActionPartyRole;
	}

	public Account setRelatedCorporateActionPartyRole(com.tools20022.repository.entity.CorporateActionPartyRole relatedCorporateActionPartyRole) {
		this.relatedCorporateActionPartyRole = Objects.requireNonNull(relatedCorporateActionPartyRole);
		return this;
	}

	public Optional<ClearingMemberRole> getDefaultFundAccountOwner() {
		return defaultFundAccountOwner == null ? Optional.empty() : Optional.of(defaultFundAccountOwner);
	}

	public Account setDefaultFundAccountOwner(com.tools20022.repository.entity.ClearingMemberRole defaultFundAccountOwner) {
		this.defaultFundAccountOwner = defaultFundAccountOwner;
		return this;
	}

	public List<System> getSystem() {
		return system == null ? system = new ArrayList<>() : system;
	}

	public Account setSystem(List<com.tools20022.repository.entity.System> system) {
		this.system = Objects.requireNonNull(system);
		return this;
	}

	public List<Balance> getBalance() {
		return balance == null ? balance = new ArrayList<>() : balance;
	}

	public Account setBalance(List<com.tools20022.repository.entity.Balance> balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public List<Entry> getEntry() {
		return entry == null ? entry = new ArrayList<>() : entry;
	}

	public Account setEntry(List<com.tools20022.repository.entity.Entry> entry) {
		this.entry = Objects.requireNonNull(entry);
		return this;
	}

	public List<AccountContract> getAccountContract() {
		return accountContract == null ? accountContract = new ArrayList<>() : accountContract;
	}

	public Account setAccountContract(List<com.tools20022.repository.entity.AccountContract> accountContract) {
		this.accountContract = Objects.requireNonNull(accountContract);
		return this;
	}

	public ISODateTime getOpeningDate() {
		return openingDate;
	}

	public Account setOpeningDate(ISODateTime openingDate) {
		this.openingDate = Objects.requireNonNull(openingDate);
		return this;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange == null ? currencyExchange = new ArrayList<>() : currencyExchange;
	}

	public Account setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public Optional<DefaultFundContribution> getDefaultFundContribution() {
		return defaultFundContribution == null ? Optional.empty() : Optional.of(defaultFundContribution);
	}

	public Account setDefaultFundContribution(com.tools20022.repository.entity.DefaultFundContribution defaultFundContribution) {
		this.defaultFundContribution = defaultFundContribution;
		return this;
	}

	public SystemMemberRole getSystemMember() {
		return systemMember;
	}

	public Account setSystemMember(com.tools20022.repository.entity.SystemMemberRole systemMember) {
		this.systemMember = Objects.requireNonNull(systemMember);
		return this;
	}

	public CollateralAccountTypeCode getCollateralAccountType() {
		return collateralAccountType;
	}

	public Account setCollateralAccountType(CollateralAccountTypeCode collateralAccountType) {
		this.collateralAccountType = Objects.requireNonNull(collateralAccountType);
		return this;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public Account setAccountService(com.tools20022.repository.entity.AccountService accountService) {
		this.accountService = Objects.requireNonNull(accountService);
		return this;
	}

	public Reconciliation getReconciliation() {
		return reconciliation;
	}

	public Account setReconciliation(com.tools20022.repository.entity.Reconciliation reconciliation) {
		this.reconciliation = Objects.requireNonNull(reconciliation);
		return this;
	}

	public ManagedAccountProduct getManagedAccountProduct() {
		return managedAccountProduct;
	}

	public Account setManagedAccountProduct(com.tools20022.repository.entity.ManagedAccountProduct managedAccountProduct) {
		this.managedAccountProduct = Objects.requireNonNull(managedAccountProduct);
		return this;
	}
}