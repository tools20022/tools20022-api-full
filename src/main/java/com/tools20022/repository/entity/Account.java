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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.CollateralAccountIdentificationType1Choice;
import com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice;
import com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice;
import com.tools20022.repository.choice.StatementTerm1Choice;
import com.tools20022.repository.codeset.CollateralAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.entity.Account#BaseCurrency
 * Account.BaseCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Identification
 * Account.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ParentAccount
 * Account.ParentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#SubAccount
 * Account.SubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedFundProcessingCharacteristics
 * Account.RelatedFundProcessingCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Status
 * Account.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Language
 * Account.Language}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#PartyRole
 * Account.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#TradePartyRole
 * Account.TradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ReportingCurrency
 * Account.ReportingCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#AccountRestriction
 * Account.AccountRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#SettlementPartyRole
 * Account.SettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Purpose
 * Account.Purpose}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ClosingDate
 * Account.ClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#LiveDate
 * Account.LiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ReportedPeriod
 * Account.ReportedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#InvestmentFundPartyRole
 * Account.InvestmentFundPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedCollateralProcess
 * Account.RelatedCollateralProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Type Account.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedProceedsDelivery
 * Account.RelatedProceedsDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedCorporateActionPartyRole
 * Account.RelatedCorporateActionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#DefaultFundAccountOwner
 * Account.DefaultFundAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#System
 * Account.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Balance
 * Account.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Entry Account.Entry}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#AccountContract
 * Account.AccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#OpeningDate
 * Account.OpeningDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#CurrencyExchange
 * Account.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#DefaultFundContribution
 * Account.DefaultFundContribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#SystemMember
 * Account.SystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#CollateralAccountType
 * Account.CollateralAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#AccountService
 * Account.AccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Reconciliation
 * Account.Reconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#ManagedAccountProduct
 * Account.ManagedAccountProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Account
 * GenericIdentification.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SettlementAccount
 * InvestmentFundClassProcessingCharacteristics.SettlementAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#ParentAccount
 * Account.ParentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#SubAccount
 * Account.SubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountIdentification#Account
 * AccountIdentification.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Account
 * DateTimePeriod.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountPartyRole#Account
 * AccountPartyRole.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountService#Account
 * AccountService.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#Account
 * AccountStatus.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#Account
 * AccountContract.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Account Entry.Account}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#Account
 * InvestmentFundPartyRole.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#Account
 * TradePartyRole.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Account
 * System.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#Account
 * SystemMemberRole.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#DefaultFundAccount
 * ClearingMemberRole.DefaultFundAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#Account
 * Balance.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#SettlementAccount
 * SettlementPartyRole.SettlementAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountRestriction#Account
 * AccountRestriction.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ReportedAccount
 * CurrencyExchange.ReportedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAccount
 * Collateral.CollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SettlementAccount
 * CorporateActionProceedsDeliveryInstruction.SettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#Account
 * CorporateActionPartyRole.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#ContributionAccount
 * DefaultFundContribution.ContributionAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#Account
 * Reconciliation.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#Account
 * ManagedAccountProduct.Account}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount1#Characteristic
 * SubAccount1.Characteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification1#OriginalPartyAndAccountIdentification
 * IdentificationModification1.OriginalPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification1#UpdatedPartyAndAccountIdentification
 * IdentificationModification1.UpdatedPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#OriginalPartyAndAccountIdentification
 * IdentificationModification2.OriginalPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationModification2#UpdatedPartyAndAccountIdentification
 * IdentificationModification2.UpdatedPartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationVerification1#PartyAndAccountIdentification
 * IdentificationVerification1.PartyAndAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IdentificationVerification2#PartyAndAccountIdentification
 * IdentificationVerification2.PartyAndAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount3#Characteristic
 * SubAccount3.Characteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#StatementTerm
 * StatementAttributes1.StatementTerm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount4#Characteristic
 * SubAccount4.Characteristic}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount5#Characteristic
 * SubAccount5.Characteristic}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccount6#Characteristic
 * SubAccount6.Characteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Account23#RelatedAccountDetails
 * Account23.RelatedAccountDetails}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount14#Currency
	 * CashAccount14.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount22#Currency
	 * CashAccount22.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount5#Currency
	 * CashAccount5.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12#Currency
	 * CashAccount12.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2#Currency
	 * CashAccountSearchCriteria2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3#Currency
	 * CashAccountSearchCriteria3.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4#Currency
	 * CashAccountSearchCriteria4.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#Currency
	 * CashAccountSearchCriteria5.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount7#Currency
	 * CashAccount7.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount16#Currency
	 * CashAccount16.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24#Currency
	 * CashAccount24.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#Currency
	 * CashAccountDetails1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#Currency
	 * CashAccountDetails3.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails4#Currency
	 * CashAccountDetails4.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount23#Currency
	 * CashAccount23.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#AccountCurrency
	 * AccountCashEntryDetails3.AccountCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount13#Currency
	 * CashAccount13.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount20#Currency
	 * CashAccount20.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#Currency
	 * CashAccount25.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction1#Currency
	 * AccountForAction1.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction2#Currency
	 * AccountForAction2.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount1#Currency
	 * CustomerAccount1.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5#Currency
	 * CustomerAccount5.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4#Currency
	 * CustomerAccount4.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount28#Currency
	 * CashAccount28.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount27#Currency
	 * CashAccount27.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount3#Currency
	 * CashAccount3.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount17#PaymentCurrency
	 * CashAccount17.PaymentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#BaseCurrency
	 * SecuritiesAccount21.BaseCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#Currency
	 * CustomerAccount2.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#Currency
	 * CustomerAccount3.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#Currency
	 * CardAccount3.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#Currency
	 * CardAccount6.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#Currency
	 * CardAccount4.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5#Currency
	 * CardAccount5.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#Currency
	 * CardAccount2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#SettlementCurrency
	 * TradeContract1.SettlementCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#Currency
	 * CardAccount10.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount9#Currency
	 * CardAccount9.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8#Currency
	 * CardAccount8.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11#Currency
	 * CardAccount11.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount13#Currency
	 * CardAccount13.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#Currency
	 * CardAccount7.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount12#Currency
	 * CardAccount12.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CutOff1#Currency
	 * CutOff1.Currency}</li>
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
	public static final MMBusinessAttribute BaseCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount14.Currency, com.tools20022.repository.msg.CashAccount22.Currency, com.tools20022.repository.msg.CashAccount5.Currency,
					com.tools20022.repository.msg.CashAccount12.Currency, com.tools20022.repository.msg.CashAccountSearchCriteria2.Currency, com.tools20022.repository.msg.CashAccountSearchCriteria3.Currency,
					com.tools20022.repository.msg.CashAccountSearchCriteria4.Currency, com.tools20022.repository.msg.CashAccountSearchCriteria5.Currency, com.tools20022.repository.msg.CashAccount7.Currency,
					com.tools20022.repository.msg.CashAccount16.Currency, com.tools20022.repository.msg.CashAccount24.Currency, com.tools20022.repository.msg.CashAccountDetails1.Currency,
					com.tools20022.repository.msg.CashAccountDetails3.Currency, com.tools20022.repository.msg.CashAccountDetails4.Currency, com.tools20022.repository.msg.CashAccount23.Currency,
					com.tools20022.repository.msg.AccountCashEntryDetails3.AccountCurrency, com.tools20022.repository.msg.CashAccount13.Currency, com.tools20022.repository.msg.CashAccount20.Currency,
					com.tools20022.repository.msg.CashAccount25.Currency, com.tools20022.repository.msg.AccountForAction1.Currency, com.tools20022.repository.msg.AccountForAction2.Currency,
					com.tools20022.repository.msg.CustomerAccount1.Currency, com.tools20022.repository.msg.CustomerAccount5.Currency, com.tools20022.repository.msg.CustomerAccount4.Currency,
					com.tools20022.repository.msg.CashAccount28.Currency, com.tools20022.repository.msg.CashAccount27.Currency, com.tools20022.repository.msg.CashAccount3.Currency,
					com.tools20022.repository.msg.CashAccount17.PaymentCurrency, com.tools20022.repository.msg.SecuritiesAccount21.BaseCurrency, com.tools20022.repository.msg.CustomerAccount2.Currency,
					com.tools20022.repository.msg.CustomerAccount3.Currency, com.tools20022.repository.msg.CardAccount3.Currency, com.tools20022.repository.msg.CardAccount6.Currency, com.tools20022.repository.msg.CardAccount4.Currency,
					com.tools20022.repository.msg.CardAccount5.Currency, com.tools20022.repository.msg.CardAccount2.Currency, com.tools20022.repository.msg.TradeContract1.SettlementCurrency,
					com.tools20022.repository.msg.CardAccount10.Currency, com.tools20022.repository.msg.CardAccount9.Currency, com.tools20022.repository.msg.CardAccount8.Currency, com.tools20022.repository.msg.CardAccount11.Currency,
					com.tools20022.repository.msg.CardAccount13.Currency, com.tools20022.repository.msg.CardAccount7.Currency, com.tools20022.repository.msg.CardAccount12.Currency, com.tools20022.repository.msg.CutOff1.Currency);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BaseCurrency";
			definition = "Base currency of the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#Account
	 * AccountIdentification.Account}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccount15#Identification
	 * CashAccount15.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount14#Identification
	 * CashAccount14.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount21#Identification
	 * CashAccount21.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount22#Identification
	 * CashAccount22.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#AccountIdentification
	 * StatementDetails.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#SubAccountIdentification
	 * StatementDetails.SubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#AccountIdentification
	 * StatementAndFinancialInstrumentDetails.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#SubAccountIdentification
	 * StatementAndFinancialInstrumentDetails.SubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount5#Identification
	 * CashAccount5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount1#Identification
	 * SecuritiesAccount1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#Identification
	 * InvestmentAccount17.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account1#Identification
	 * Account1.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account2#Identification
	 * Account2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount4#Identification
	 * CashAccount4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate2#DebtorAccountIdentification
	 * DirectDebitMandate2.DebtorAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#DebtorAccountIdentification
	 * DirectDebitMandate3.DebtorAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount12#Identification
	 * CashAccount12.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount4#Identification
	 * SecuritiesAccount4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#Identification
	 * InvestmentAccount27.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#DebtorAccount
	 * DirectDebitMandate4.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#Identification
	 * InvestmentAccount35.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#Identification
	 * CashAccount26.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account4#Identification
	 * Account4.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account5#Identification
	 * Account5.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account6#Identification
	 * Account6.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount93#AccountIdentification
	 * PartyIdentificationAndAccount93.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection1#AccountIdentification
	 * InvestmentAccountSelection1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2#AccountIdentification
	 * InvestmentAccountSelection2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#Identification
	 * InvestmentAccount16.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#Identification
	 * InvestmentAccount26.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#Identification
	 * InvestmentAccount34.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#AccountIdentification
	 * LimitIdentificationDetails1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2#AccountIdentification
	 * LimitIdentificationDetails2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails3#AccountIdentification
	 * LimitIdentificationDetails3.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification1#AccountIdentification
	 * LimitIdentification1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification2#AccountIdentification
	 * LimitIdentification2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentificationDetails1#AccountIdentification
	 * ReservationIdentificationDetails1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentification1#AccountIdentification
	 * ReservationIdentification1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2#AccountIdentification
	 * CashAccountSearchCriteria2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3#AccountIdentification
	 * CashAccountSearchCriteria3.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4#AccountIdentification
	 * CashAccountSearchCriteria4.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#AccountIdentification
	 * CashAccountSearchCriteria5.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2#AccountIdentification
	 * LimitSearchCriteria2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#AccountIdentification
	 * LimitSearchCriteria3.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria1#AccountIdentification
	 * ReservationSearchCriteria1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#AccountIdentification
	 * ReservationSearchCriteria2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount7#Identification
	 * CashAccount7.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount16#Identification
	 * CashAccount16.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount24#Identification
	 * CashAccount24.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#AssociatedPoolAccount
	 * StandingOrderSearchCriteria1.AssociatedPoolAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemSearch2#AccountIdentification
	 * SystemSearch2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#AccountIdentification
	 * AccountCashEntrySearch2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemSearch3#AccountIdentification
	 * SystemSearch3.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification1#AccountIdentification
	 * StandingOrderIdentification1.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account3#Identification
	 * Account3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount6#Identification
	 * CashAccount6.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount11#Identification
	 * CashAccount11.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails3#AssociatedPoolAccount
	 * StandingOrderDetails3.AssociatedPoolAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport7#AccountIdentification
	 * AccountReport7.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport8#AccountIdentification
	 * AccountReport8.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport10#AccountIdentification
	 * AccountReport10.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2#AssociatedPoolAccount
	 * StandingOrder2.AssociatedPoolAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport13#AccountIdentification
	 * AccountReport13.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemDetails2#AccountIdentification
	 * SystemDetails2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#AccountIdentification
	 * AccountCashEntryDetails3.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.System1#AccountIdentification
	 * System1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount13#Identification
	 * CashAccount13.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount20#Identification
	 * CashAccount20.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount25#Identification
	 * CashAccount25.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#AccountIdentification
	 * InvestmentAccount10.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#AccountIdentification
	 * InvestmentAccount11.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount2#AccountIdentification
	 * PartyIdentificationAndAccount2.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account7#Identification
	 * Account7.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#AccountIdentification
	 * InvestmentAccount22.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount1#Identification
	 * SubAccount1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#AccountIdentification
	 * InvestmentAccount24.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5#AccountIdentification
	 * PartyIdentificationAndAccount5.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#AccountIdentification
	 * PartyIdentificationAndAccount4.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29#CashAccount
	 * QuantityAndAccount29.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#CashAccount
	 * PartyIdentificationAndAccount11.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#ChargesAccount
	 * PartyIdentificationAndAccount11.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#CommissionAccount
	 * PartyIdentificationAndAccount11.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#TaxAccount
	 * PartyIdentificationAndAccount11.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#CashAccount
	 * PartyIdentificationAndAccount12.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#ChargesAccount
	 * PartyIdentificationAndAccount12.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#CommissionAccount
	 * PartyIdentificationAndAccount12.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#TaxAccount
	 * PartyIdentificationAndAccount12.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#CashAccount
	 * PartyIdentificationAndAccount20.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#ChargesAccount
	 * PartyIdentificationAndAccount20.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#CommissionAccount
	 * PartyIdentificationAndAccount20.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#TaxAccount
	 * PartyIdentificationAndAccount20.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#CashAccount
	 * PartyIdentificationAndAccount15.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#ChargesAccount
	 * PartyIdentificationAndAccount15.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#CommissionAccount
	 * PartyIdentificationAndAccount15.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#TaxAccount
	 * PartyIdentificationAndAccount15.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#CashAccount
	 * PartyIdentificationAndAccount39.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#ChargesAccount
	 * PartyIdentificationAndAccount39.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#CommissionAccount
	 * PartyIdentificationAndAccount39.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#TaxAccount
	 * PartyIdentificationAndAccount39.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#CashAccount
	 * PartyIdentificationAndAccount50.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#ChargesAccount
	 * PartyIdentificationAndAccount50.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#CommissionAccount
	 * PartyIdentificationAndAccount50.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#TaxAccount
	 * PartyIdentificationAndAccount50.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#CashAccount
	 * QuantityAndAccount30.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32#CashAccount
	 * QuantityAndAccount32.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#CashAccount
	 * PartyIdentificationAndAccount64.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#ChargesAccount
	 * PartyIdentificationAndAccount64.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#CommissionAccount
	 * PartyIdentificationAndAccount64.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#TaxAccount
	 * PartyIdentificationAndAccount64.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#CashAccount
	 * PartyIdentificationAndAccount60.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#ChargesAccount
	 * PartyIdentificationAndAccount60.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#CommissionAccount
	 * PartyIdentificationAndAccount60.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#TaxAccount
	 * PartyIdentificationAndAccount60.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#CashAccount
	 * QuantityAndAccount33.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount17#CashAccount
	 * PartyIdentificationAndAccount17.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount18#CashAccount
	 * PartyIdentificationAndAccount18.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount23#CashAccount
	 * PartyIdentificationAndAccount23.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount24#CashAccount
	 * PartyIdentificationAndAccount24.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52#CashAccount
	 * PartyIdentificationAndAccount52.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount54#CashAccount
	 * PartyIdentificationAndAccount54.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount57#CashAccount
	 * PartyIdentificationAndAccount57.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount58#CashAccount
	 * PartyIdentificationAndAccount58.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#CashAccountIdentification
	 * CashOption3.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#CashAccountIdentification
	 * CashOption6.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#CashAccountIdentification
	 * CashOption11.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#CashAccountIdentification
	 * CashOption14.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#CashAccountIdentification
	 * CashOption16.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#CashAccountIdentification
	 * CashOption20.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#CashAccountIdentification
	 * CashOption25.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#CashAccountIdentification
	 * CashOption28.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#CashAccountIdentification
	 * CashOption4.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#CashAccountIdentification
	 * CashOption8.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#CashAccountIdentification
	 * CashOption10.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#CashAccountIdentification
	 * CashOption15.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#CashAccountIdentification
	 * CashOption17.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#CashAccountIdentification
	 * CashOption21.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#CashAccountIdentification
	 * CashOption24.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#CashAccountIdentification
	 * CashOption29.CashAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account9#Identification
	 * Account9.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account10#Identification
	 * Account10.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount1#Identification
	 * SafekeepingAccount1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#Identification
	 * SafekeepingAccount2.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account11#Identification
	 * Account11.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account13#Identification
	 * Account13.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account12#Identification
	 * Account12.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#CashAccount
	 * QuantityAndAccount6.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#CashAccount
	 * QuantityAndAccount11.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#CashAccount
	 * PartyIdentificationAndAccount29.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#ChargesAccount
	 * PartyIdentificationAndAccount29.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#CommissionAccount
	 * PartyIdentificationAndAccount29.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#TaxAccount
	 * PartyIdentificationAndAccount29.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#CashAccount
	 * PartyIdentificationAndAccount27.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#ChargesAccount
	 * PartyIdentificationAndAccount27.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#CommissionAccount
	 * PartyIdentificationAndAccount27.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#TaxAccount
	 * PartyIdentificationAndAccount27.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#CashAccount
	 * QuantityAndAccount18.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#CashAccount
	 * PartyIdentificationAndAccount38.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#ChargesAccount
	 * PartyIdentificationAndAccount38.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#CommissionAccount
	 * PartyIdentificationAndAccount38.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#TaxAccount
	 * PartyIdentificationAndAccount38.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#CashAccount
	 * QuantityAndAccount19.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#CashAccount
	 * PartyIdentificationAndAccount59.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#ChargesAccount
	 * PartyIdentificationAndAccount59.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#CommissionAccount
	 * PartyIdentificationAndAccount59.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#TaxAccount
	 * PartyIdentificationAndAccount59.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#CashAccount
	 * QuantityAndAccount1.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#CashAccount
	 * QuantityAndAccount5.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#CashAccount
	 * QuantityAndAccount17.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#CashAccount
	 * QuantityAndAccount24.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#CashAccount
	 * QuantityAndAccount25.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#CashAccount
	 * QuantityAndAccount34.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#CashAccount
	 * QuantityAndAccount2.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#CashAccount
	 * QuantityAndAccount12.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#CashAccount
	 * QuantityAndAccount15.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#CashAccount
	 * QuantityAndAccount20.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#CashAccount
	 * QuantityAndAccount28.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#CashAccount
	 * QuantityAndAccount37.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9#CashAccount
	 * PartyIdentificationAndAccount9.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#CashAccount
	 * PartyIdentificationAndAccount79.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#CashAccount
	 * PartyIdentificationAndAccount83.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount20#Identification
	 * SecuritiesAccount20.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#CashDetails
	 * ConfirmationPartyDetails3.CashDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount8#CashAccount
	 * PartyIdentificationAndAccount8.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#CashDetails
	 * ConfirmationPartyDetails6.CashDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#CashAccount
	 * PartyIdentificationAndAccount80.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#ChargesAccount
	 * PartyIdentificationAndAccount80.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#CommissionAccount
	 * PartyIdentificationAndAccount80.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#TaxAccount
	 * PartyIdentificationAndAccount80.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1#Identification
	 * AccountForAction1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountForAction2#Identification
	 * AccountForAction2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#Identification
	 * CustomerAccount1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#Identification
	 * CustomerAccount5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#Identification
	 * CustomerAccountModification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#Identification
	 * CustomerAccount4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount28#Identification
	 * CashAccount28.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount27#Identification
	 * CashAccount27.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings1#SubAccountDetails
	 * AccountingStatementOfHoldings1.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingStatementOfHoldings2#SubAccountDetails
	 * AccountingStatementOfHoldings2.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings1#SubAccountDetails
	 * CustodyStatementOfHoldings1.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustodyStatementOfHoldings2#SubAccountDetails
	 * CustodyStatementOfHoldings2.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount13#AccountIdentification
	 * InvestmentAccount13.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount3#AccountIdentification
	 * PartyIdentificationAndAccount3.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Creditor2#AccountIdentification
	 * Creditor2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debtor2#AccountIdentification
	 * Debtor2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount15#AccountIdentification
	 * InvestmentAccount15.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21#AccountIdentification
	 * InvestmentAccount21.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#CreditorAgentAccount
	 * CreditTransfer6.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount20#AccountIdentification
	 * InvestmentAccount20.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount14#AccountIdentification
	 * InvestmentAccount14.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount12#Identification
	 * InvestmentAccount12.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1#SubAccountDetails
	 * StatementOfInvestmentFundTransactions1.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount25#Identification
	 * InvestmentAccount25.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#SubAccountDetails
	 * StatementOfInvestmentFundTransactions2.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount3#Identification
	 * CashAccount3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition2#AccountIdentification
	 * EligiblePosition2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition3#AccountIdentification
	 * EligiblePosition3.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition4#AccountIdentification
	 * EligiblePosition4.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount2#Identification
	 * SubAccount2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus1#AccountIdentification
	 * DetailedInstructionStatus1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus1#SubAccountIdentification
	 * DetailedInstructionStatus1.SubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus2#AccountIdentification
	 * DetailedInstructionStatus2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus2#SubAccountIdentification
	 * DetailedInstructionStatus2.SubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#AccountIdentification
	 * DetailedInstructionStatus9.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#SubAccountIdentification
	 * DetailedInstructionStatus9.SubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#AgentSecuritiesAccountIdentification
	 * CorporateActionOption1.AgentSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#AgentCashAccountIdentification
	 * CorporateActionOption1.AgentCashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount19#AccountIdentification
	 * CashAccount19.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#CashAccountIdentification
	 * ProceedsDelivery1.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount18#AccountIdentification
	 * CashAccount18.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#AgentAccountIdentification
	 * CorporateActionMovementFailedStatus1.AgentAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1#ClientAccountIdentification
	 * CorporateActionMovementFailedStatus1.ClientAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IncludedAccount1#SecuritiesAccountIdentification
	 * IncludedAccount1.SecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount17#AccountIdentification
	 * CashAccount17.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount7#CashAccount
	 * QuantityAndAccount7.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount16#CashAccount
	 * QuantityAndAccount16.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#CashAccount
	 * QuantityAndAccount3.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#CashAccount
	 * QuantityAndAccount13.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#CashAccount
	 * PartyIdentificationAndAccount53.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#ChargesAccount
	 * PartyIdentificationAndAccount53.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#CommissionAccount
	 * PartyIdentificationAndAccount53.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#TaxAccount
	 * PartyIdentificationAndAccount53.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#CashAccount
	 * PartyIdentificationAndAccount55.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#ChargesAccount
	 * PartyIdentificationAndAccount55.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#CommissionAccount
	 * PartyIdentificationAndAccount55.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#TaxAccount
	 * PartyIdentificationAndAccount55.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#CashAccount
	 * QuantityAndAccount8.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14#CashAccount
	 * QuantityAndAccount14.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#CashAccount
	 * PartyIdentificationAndAccount48.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#ChargesAccount
	 * PartyIdentificationAndAccount48.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#CommissionAccount
	 * PartyIdentificationAndAccount48.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#TaxAccount
	 * PartyIdentificationAndAccount48.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation1#Account
	 * IdentificationInformation1.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IdentificationInformation2#Account
	 * IdentificationInformation2.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountingAccount1#Identification
	 * AccountingAccount1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTerms1#BeneficiaryAccount
	 * SettlementTerms1.BeneficiaryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#CollateralAccountIdentification
	 * InterestCalculation2.CollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount1#Identification
	 * CollateralAccount1.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#Account
	 * MemberDetails.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount10#CashAccount
	 * QuantityAndAccount10.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount21#CashAccount
	 * QuantityAndAccount21.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#CashAccount
	 * QuantityAndAccount4.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#CashAccount
	 * QuantityAndAccount22.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#CashAccount
	 * PartyIdentificationAndAccount69.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#ChargesAccount
	 * PartyIdentificationAndAccount69.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#CommissionAccount
	 * PartyIdentificationAndAccount69.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#TaxAccount
	 * PartyIdentificationAndAccount69.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#CashAccount
	 * PartyIdentificationAndAccount70.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#ChargesAccount
	 * PartyIdentificationAndAccount70.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#CommissionAccount
	 * PartyIdentificationAndAccount70.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#TaxAccount
	 * PartyIdentificationAndAccount70.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#CashAccount
	 * QuantityAndAccount27.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#CashAccount
	 * QuantityAndAccount36.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#CashAccount
	 * QuantityAndAccount9.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23#CashAccount
	 * QuantityAndAccount23.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26#CashAccount
	 * QuantityAndAccount26.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35#CashAccount
	 * QuantityAndAccount35.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#CashAccount
	 * PartyIdentificationAndAccount72.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#ChargesAccount
	 * PartyIdentificationAndAccount72.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#CommissionAccount
	 * PartyIdentificationAndAccount72.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#TaxAccount
	 * PartyIdentificationAndAccount72.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#Account
	 * SecuritiesAccount21.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BalanceType7Choice#Account
	 * BalanceType7Choice.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19#Identification
	 * SecuritiesAccount19.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount18#Identification
	 * SecuritiesAccount18.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#AccountIdentification
	 * PartyIdentificationAndAccount32.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contribution1#Account
	 * Contribution1.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DefaultFund1#DefaultFundAccount
	 * DefaultFund1.DefaultFundAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#DebitAccount
	 * CashAccountCharacteristics1.DebitAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount3#Identification
	 * SubAccount3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount10#Identification
	 * CashAccount10.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount8#Identification
	 * CashAccount8.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount13#AccountIdentification
	 * PartyIdentificationAndAccount13.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount31#AccountIdentification
	 * InvestmentAccount31.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount32#AccountIdentification
	 * InvestmentAccount32.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount33#AccountIdentification
	 * InvestmentAccount33.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer7#CreditorAgentAccount
	 * CreditTransfer7.CreditorAgentAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account8#Identification
	 * Account8.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount7#AccountIdentification
	 * PartyIdentificationAndAccount7.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#AccountIdentification
	 * StatementAttributes1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#SubAccountIdentification
	 * StatementAttributes1.SubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#Identification
	 * CustomerAccount2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#ReferenceAccountIdentification
	 * CustomerAccount2.ReferenceAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#Identification
	 * CustomerAccount3.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Balance3#SubAccountDetails
	 * Balance3.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification4#AccountIdentification
	 * LimitIdentification4.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#AccountIdentification
	 * ServiceCategoryTotals1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#AccountIdentification
	 * BillingSearchCriteria1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#AccountIdentification
	 * LimitUtilisationJournalSearchCriteria1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#Identification
	 * InvestmentAccount38.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#Identification
	 * InvestmentAccount37.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#AccountIdentification
	 * InvestmentAccount40.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport17#AccountIdentification
	 * AccountReport17.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account15#Identification
	 * Account15.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account16#Identification
	 * Account16.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount29#Identification
	 * CashAccount29.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#AccountIdentification
	 * InvestmentAccount41.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account14#Identification
	 * Account14.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#CashAccountIdentification
	 * CashOption31.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#CashAccountIdentification
	 * CashOption32.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97#AccountIdentification
	 * PartyIdentificationAndAccount97.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount96#AccountIdentification
	 * PartyIdentificationAndAccount96.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#CashAccountIdentification
	 * CashOption36.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#CashAccountIdentification
	 * CashOption35.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount43#Identification
	 * InvestmentAccount43.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#SubAccountDetails
	 * StatementOfInvestmentFundTransactions3.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountSelection1Choice#AccountIdentification
	 * InvestmentAccountSelection1Choice.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount45#AccountIdentification
	 * InvestmentAccount45.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount42#AccountIdentification
	 * InvestmentAccount42.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#Identification
	 * InvestmentAccount46.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel1#AccountIdentification
	 * AccountSubLevel1.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel4#AccountIdentification
	 * AccountSubLevel4.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel5#AccountIdentification
	 * AccountSubLevel5.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel2#AccountIdentification
	 * AccountSubLevel2.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel3#AccountIdentification
	 * AccountSubLevel3.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel6#AccountIdentification
	 * AccountSubLevel6.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel7#AccountIdentification
	 * AccountSubLevel7.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#AccountIdentification
	 * AccountSubLevel8.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel9#AccountIdentification
	 * AccountSubLevel9.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount101#CashAccount
	 * PartyIdentificationAndAccount101.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#CashAccountIdentification
	 * CashCollateral3.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#CashAccountIdentification
	 * CashCollateral2.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#AccountIdentification
	 * DetailedInstructionStatus10.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#SubAccountIdentification
	 * DetailedInstructionStatus10.SubAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#AccountIdentification
	 * EligiblePosition5.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition6#AccountIdentification
	 * EligiblePosition6.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#CashAccountIdentification
	 * CashCollateralResponse1.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#AccountIdentification
	 * PartyIdentificationAndAccount102.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#CollateralAccountIdentification
	 * InterestCalculation3.CollateralAccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount4#Identification
	 * SubAccount4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount104#CashAccount
	 * PartyIdentificationAndAccount104.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#CashAccountIdentification
	 * CashCollateral5.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#DebitAccount
	 * FinancialItemParameters1.DebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#CreditAccount
	 * FinancialItemParameters1.CreditAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement1#AccountIdentifier
	 * ATMAccountStatement1.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount3#AccountIdentifier
	 * CardAccount3.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#AccountIdentifier
	 * CardAccount1.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount6#AccountIdentifier
	 * CardAccount6.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#AccountIdentifier
	 * CardAccount4.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount5#AccountIdentifier
	 * CardAccount5.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount2#AccountIdentifier
	 * CardAccount2.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#CashAccount
	 * QuantityAndAccount39.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#CashAccount
	 * QuantityAndAccount41.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#CashAccount
	 * QuantityAndAccount40.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#CashAccount
	 * QuantityAndAccount42.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#CashAccount
	 * QuantityAndAccount38.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#CashAccount
	 * PartyIdentificationAndAccount112.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#ChargesAccount
	 * PartyIdentificationAndAccount112.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#CommissionAccount
	 * PartyIdentificationAndAccount112.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#TaxAccount
	 * PartyIdentificationAndAccount112.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#CashAccount
	 * PartyIdentificationAndAccount111.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#ChargesAccount
	 * PartyIdentificationAndAccount111.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#CommissionAccount
	 * PartyIdentificationAndAccount111.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#TaxAccount
	 * PartyIdentificationAndAccount111.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#CashAccount
	 * QuantityAndAccount43.CashAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account18#Identification
	 * Account18.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#CashAccount
	 * QuantityAndAccount45.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44#CashAccount
	 * QuantityAndAccount44.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#DebitAccount
	 * CashAccountCharacteristics2.DebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#CashAccountIdentification
	 * CashOption42.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#CashAccountIdentification
	 * CashOption43.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120#CashAccount
	 * PartyIdentificationAndAccount120.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121#CashAccount
	 * PartyIdentificationAndAccount121.CashAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account19#Identification
	 * Account19.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#Identification
	 * InvestmentAccount49.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount34#Identification
	 * CashAccount34.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#AccountIdentification
	 * InvestmentAccount54.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSelection1Choice#AccountIdentification
	 * AccountSelection1Choice.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#Identification
	 * InvestmentAccount50.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#AccountIdentification
	 * InvestmentAccount56.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124#AccountIdentification
	 * PartyIdentificationAndAccount124.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount5#Identification
	 * SubAccount5.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#AccountIdentification
	 * InvestmentAccount55.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#DebtorAccount
	 * DirectDebitMandate5.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount32#Identification
	 * CashAccount32.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount53#AccountIdentification
	 * InvestmentAccount53.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125#AccountIdentification
	 * PartyIdentificationAndAccount125.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account20#Identification
	 * Account20.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#Identification
	 * CashAccount33.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#AccountIdentification
	 * InvestmentAccount57.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#AccountIdentification
	 * PartyIdentificationAndAccount123.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount2#Identification
	 * CollateralAccount2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#CollateralAccountIdentification
	 * InterestCalculation4.CollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126#AccountIdentification
	 * PartyIdentificationAndAccount126.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#CashAccountIdentification
	 * CashOption49.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#CashAccountIdentification
	 * CashOption47.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount129#CashAccount
	 * PartyIdentificationAndAccount129.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount130#CashAccount
	 * PartyIdentificationAndAccount130.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#CashAccount
	 * QuantityAndAccount47.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount48#CashAccount
	 * QuantityAndAccount48.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#CashAccount
	 * QuantityAndAccount46.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#CashAccount
	 * QuantityAndAccount51.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#CashAccount
	 * QuantityAndAccount49.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#CashAccount
	 * PartyIdentificationAndAccount133.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#ChargesAccount
	 * PartyIdentificationAndAccount133.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#CommissionAccount
	 * PartyIdentificationAndAccount133.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#TaxAccount
	 * PartyIdentificationAndAccount133.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount30#Identification
	 * SecuritiesAccount30.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50#CashAccount
	 * QuantityAndAccount50.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#CashAccount
	 * QuantityAndAccount55.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#CashAccount
	 * PartyIdentificationAndAccount134.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#ChargesAccount
	 * PartyIdentificationAndAccount134.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#CommissionAccount
	 * PartyIdentificationAndAccount134.CommissionAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#TaxAccount
	 * PartyIdentificationAndAccount134.TaxAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account21#Identification
	 * Account21.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount54#CashAccount
	 * QuantityAndAccount54.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount10#AccountIdentifier
	 * CardAccount10.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#AccountIdentifier
	 * CardAccount9.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount8#AccountIdentifier
	 * CardAccount8.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount11#AccountIdentifier
	 * CardAccount11.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount13#AccountIdentifier
	 * CardAccount13.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount7#AccountIdentifier
	 * CardAccount7.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount12#AccountIdentifier
	 * CardAccount12.AccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#Identification
	 * InvestmentAccount61.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSelection2Choice#AccountIdentification
	 * AccountSelection2Choice.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#ExistingAccountIdentification
	 * AccountManagementStatusAndReason5.ExistingAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#AccountIdentification
	 * AccountManagementStatusAndReason5.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#Identification
	 * InvestmentAccount62.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#AccountIdentification
	 * AccountSubLevel15.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#AccountIdentification
	 * AccountSubLevel16.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#AccountIdentification
	 * InvestmentAccount58.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#AccountIdentification
	 * AccountSubLevel18.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#AccountIdentification
	 * AccountSubLevel19.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SubAccount6#Identification
	 * SubAccount6.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#AccountIdentification
	 * AccountSubLevel11.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#AccountIdentification
	 * AccountSubLevel12.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147#AccountIdentification
	 * PartyIdentificationAndAccount147.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Account23#AccountIdentification
	 * Account23.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#AccountIdentification
	 * AccountSubLevel17.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#AccountIdentification
	 * AccountSubLevel13.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#AccountIdentification
	 * AccountSubLevel14.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#CreditorAgentAccount
	 * CreditTransfer8.CreditorAgentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount60#AccountIdentification
	 * InvestmentAccount60.AccountIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Account22#Identification
	 * Account22.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#DebtorAccount
	 * DirectDebitMandate6.DebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#CashAccountIdentification
	 * CashOption51.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#CashAccountIdentification
	 * CashOption50.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#CashAccountIdentification
	 * CashCollateralResponse2.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#CashAccountIdentification
	 * CashOption53.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#CashAccountIdentification
	 * CashOption54.CashAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#CashAccount
	 * QuantityAndAccount57.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#CashAccount
	 * QuantityAndAccount58.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#CashAccount
	 * QuantityAndAccount56.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount61#CashAccount
	 * QuantityAndAccount61.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#CashAccount
	 * QuantityAndAccount62.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount59#CashAccount
	 * QuantityAndAccount59.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#CashAccount
	 * QuantityAndAccount60.CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount3#Identification
	 * CollateralAccount3.Identification}</li>
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
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount15.Identification, com.tools20022.repository.msg.CashAccount14.Identification, com.tools20022.repository.msg.CashAccount21.Identification,
					com.tools20022.repository.msg.CashAccount22.Identification, com.tools20022.repository.msg.StatementDetails.AccountIdentification, com.tools20022.repository.msg.StatementDetails.SubAccountIdentification,
					com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails.AccountIdentification, com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails.SubAccountIdentification,
					com.tools20022.repository.msg.CashAccount5.Identification, com.tools20022.repository.msg.SecuritiesAccount1.Identification, com.tools20022.repository.msg.InvestmentAccount17.Identification,
					com.tools20022.repository.msg.Account1.Identification, com.tools20022.repository.msg.Account2.Identification, com.tools20022.repository.msg.CashAccount4.Identification,
					com.tools20022.repository.msg.DirectDebitMandate2.DebtorAccountIdentification, com.tools20022.repository.msg.DirectDebitMandate3.DebtorAccountIdentification, com.tools20022.repository.msg.CashAccount12.Identification,
					com.tools20022.repository.msg.SecuritiesAccount4.Identification, com.tools20022.repository.msg.InvestmentAccount27.Identification, com.tools20022.repository.msg.DirectDebitMandate4.DebtorAccount,
					com.tools20022.repository.msg.InvestmentAccount35.Identification, com.tools20022.repository.msg.CashAccount26.Identification, com.tools20022.repository.msg.Account4.Identification,
					com.tools20022.repository.msg.Account5.Identification, com.tools20022.repository.msg.Account6.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount93.AccountIdentification,
					com.tools20022.repository.msg.InvestmentAccountSelection1.AccountIdentification, com.tools20022.repository.msg.InvestmentAccountSelection2.AccountIdentification,
					com.tools20022.repository.msg.InvestmentAccount16.Identification, com.tools20022.repository.msg.InvestmentAccount26.Identification, com.tools20022.repository.msg.InvestmentAccount34.Identification,
					com.tools20022.repository.msg.LimitIdentificationDetails1.AccountIdentification, com.tools20022.repository.msg.LimitIdentificationDetails2.AccountIdentification,
					com.tools20022.repository.msg.LimitIdentificationDetails3.AccountIdentification, com.tools20022.repository.msg.LimitIdentification1.AccountIdentification,
					com.tools20022.repository.msg.LimitIdentification2.AccountIdentification, com.tools20022.repository.msg.ReservationIdentificationDetails1.AccountIdentification,
					com.tools20022.repository.msg.ReservationIdentification1.AccountIdentification, com.tools20022.repository.msg.CashAccountSearchCriteria2.AccountIdentification,
					com.tools20022.repository.msg.CashAccountSearchCriteria3.AccountIdentification, com.tools20022.repository.msg.CashAccountSearchCriteria4.AccountIdentification,
					com.tools20022.repository.msg.CashAccountSearchCriteria5.AccountIdentification, com.tools20022.repository.msg.LimitSearchCriteria2.AccountIdentification,
					com.tools20022.repository.msg.LimitSearchCriteria3.AccountIdentification, com.tools20022.repository.msg.ReservationSearchCriteria1.AccountIdentification,
					com.tools20022.repository.msg.ReservationSearchCriteria2.AccountIdentification, com.tools20022.repository.msg.CashAccount7.Identification, com.tools20022.repository.msg.CashAccount16.Identification,
					com.tools20022.repository.msg.CashAccount24.Identification, com.tools20022.repository.msg.StandingOrderSearchCriteria1.AssociatedPoolAccount, com.tools20022.repository.msg.SystemSearch2.AccountIdentification,
					com.tools20022.repository.msg.AccountCashEntrySearch2.AccountIdentification, com.tools20022.repository.msg.SystemSearch3.AccountIdentification,
					com.tools20022.repository.msg.StandingOrderIdentification1.AccountIdentification, com.tools20022.repository.msg.Account3.Identification, com.tools20022.repository.msg.CashAccount6.Identification,
					com.tools20022.repository.msg.CashAccount11.Identification, com.tools20022.repository.msg.StandingOrderDetails3.AssociatedPoolAccount, com.tools20022.repository.msg.AccountReport7.AccountIdentification,
					com.tools20022.repository.msg.AccountReport8.AccountIdentification, com.tools20022.repository.msg.AccountReport10.AccountIdentification, com.tools20022.repository.msg.StandingOrder2.AssociatedPoolAccount,
					com.tools20022.repository.msg.AccountReport13.AccountIdentification, com.tools20022.repository.msg.SystemDetails2.AccountIdentification, com.tools20022.repository.msg.AccountCashEntryDetails3.AccountIdentification,
					com.tools20022.repository.msg.System1.AccountIdentification, com.tools20022.repository.msg.CashAccount13.Identification, com.tools20022.repository.msg.CashAccount20.Identification,
					com.tools20022.repository.msg.CashAccount25.Identification, com.tools20022.repository.msg.InvestmentAccount10.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount11.AccountIdentification,
					com.tools20022.repository.msg.PartyIdentificationAndAccount2.AccountIdentification, com.tools20022.repository.msg.Account7.Identification, com.tools20022.repository.msg.InvestmentAccount22.AccountIdentification,
					com.tools20022.repository.msg.SubAccount1.Identification, com.tools20022.repository.msg.InvestmentAccount24.AccountIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount5.AccountIdentification,
					com.tools20022.repository.msg.PartyIdentificationAndAccount4.AccountIdentification, com.tools20022.repository.msg.QuantityAndAccount29.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount11.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount11.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount11.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount11.TaxAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount12.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount12.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount12.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount12.TaxAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount20.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount20.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount20.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount20.TaxAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount15.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount15.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount15.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount15.TaxAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount39.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount39.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount39.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount39.TaxAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount50.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount50.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount50.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount50.TaxAccount, com.tools20022.repository.msg.QuantityAndAccount30.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount32.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount64.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount64.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount64.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount64.TaxAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount60.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount60.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount60.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount60.TaxAccount, com.tools20022.repository.msg.QuantityAndAccount33.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount17.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount18.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount23.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount24.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount52.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount54.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount57.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount58.CashAccount, com.tools20022.repository.msg.CashOption3.CashAccountIdentification,
					com.tools20022.repository.msg.CashOption6.CashAccountIdentification, com.tools20022.repository.msg.CashOption11.CashAccountIdentification, com.tools20022.repository.msg.CashOption14.CashAccountIdentification,
					com.tools20022.repository.msg.CashOption16.CashAccountIdentification, com.tools20022.repository.msg.CashOption20.CashAccountIdentification, com.tools20022.repository.msg.CashOption25.CashAccountIdentification,
					com.tools20022.repository.msg.CashOption28.CashAccountIdentification, com.tools20022.repository.msg.CashOption4.CashAccountIdentification, com.tools20022.repository.msg.CashOption8.CashAccountIdentification,
					com.tools20022.repository.msg.CashOption10.CashAccountIdentification, com.tools20022.repository.msg.CashOption15.CashAccountIdentification, com.tools20022.repository.msg.CashOption17.CashAccountIdentification,
					com.tools20022.repository.msg.CashOption21.CashAccountIdentification, com.tools20022.repository.msg.CashOption24.CashAccountIdentification, com.tools20022.repository.msg.CashOption29.CashAccountIdentification,
					com.tools20022.repository.msg.Account9.Identification, com.tools20022.repository.msg.Account10.Identification, com.tools20022.repository.msg.SafekeepingAccount1.Identification,
					com.tools20022.repository.msg.SafekeepingAccount2.Identification, com.tools20022.repository.msg.Account11.Identification, com.tools20022.repository.msg.Account13.Identification,
					com.tools20022.repository.msg.Account12.Identification, com.tools20022.repository.msg.QuantityAndAccount6.CashAccount, com.tools20022.repository.msg.QuantityAndAccount11.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount29.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount29.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount29.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount29.TaxAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount27.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount27.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount27.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount27.TaxAccount, com.tools20022.repository.msg.QuantityAndAccount18.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount38.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount38.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount38.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount38.TaxAccount, com.tools20022.repository.msg.QuantityAndAccount19.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount59.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount59.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount59.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount59.TaxAccount, com.tools20022.repository.msg.QuantityAndAccount1.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount5.CashAccount, com.tools20022.repository.msg.QuantityAndAccount17.CashAccount, com.tools20022.repository.msg.QuantityAndAccount24.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount25.CashAccount, com.tools20022.repository.msg.QuantityAndAccount34.CashAccount, com.tools20022.repository.msg.QuantityAndAccount2.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount12.CashAccount, com.tools20022.repository.msg.QuantityAndAccount15.CashAccount, com.tools20022.repository.msg.QuantityAndAccount20.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount28.CashAccount, com.tools20022.repository.msg.QuantityAndAccount37.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount9.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount79.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount83.CashAccount, com.tools20022.repository.msg.SecuritiesAccount20.Identification,
					com.tools20022.repository.msg.ConfirmationPartyDetails3.CashDetails, com.tools20022.repository.msg.PartyIdentificationAndAccount8.CashAccount, com.tools20022.repository.msg.ConfirmationPartyDetails6.CashDetails,
					com.tools20022.repository.msg.PartyIdentificationAndAccount80.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount80.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount80.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount80.TaxAccount, com.tools20022.repository.msg.AccountForAction1.Identification,
					com.tools20022.repository.msg.AccountForAction2.Identification, com.tools20022.repository.msg.CustomerAccount1.Identification, com.tools20022.repository.msg.CustomerAccount5.Identification,
					com.tools20022.repository.msg.CustomerAccountModification1.Identification, com.tools20022.repository.msg.CustomerAccount4.Identification, com.tools20022.repository.msg.CashAccount28.Identification,
					com.tools20022.repository.msg.CashAccount27.Identification, com.tools20022.repository.msg.AccountingStatementOfHoldings1.SubAccountDetails, com.tools20022.repository.msg.AccountingStatementOfHoldings2.SubAccountDetails,
					com.tools20022.repository.msg.CustodyStatementOfHoldings1.SubAccountDetails, com.tools20022.repository.msg.CustodyStatementOfHoldings2.SubAccountDetails,
					com.tools20022.repository.msg.InvestmentAccount13.AccountIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount3.AccountIdentification, com.tools20022.repository.msg.Creditor2.AccountIdentification,
					com.tools20022.repository.msg.Debtor2.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount15.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount21.AccountIdentification,
					com.tools20022.repository.msg.CreditTransfer6.CreditorAgentAccount, com.tools20022.repository.msg.InvestmentAccount20.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount14.AccountIdentification,
					com.tools20022.repository.msg.InvestmentAccount12.Identification, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions1.SubAccountDetails, com.tools20022.repository.msg.InvestmentAccount25.Identification,
					com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.SubAccountDetails, com.tools20022.repository.msg.CashAccount3.Identification, com.tools20022.repository.msg.EligiblePosition2.AccountIdentification,
					com.tools20022.repository.msg.EligiblePosition3.AccountIdentification, com.tools20022.repository.msg.EligiblePosition4.AccountIdentification, com.tools20022.repository.msg.SubAccount2.Identification,
					com.tools20022.repository.msg.DetailedInstructionStatus1.AccountIdentification, com.tools20022.repository.msg.DetailedInstructionStatus1.SubAccountIdentification,
					com.tools20022.repository.msg.DetailedInstructionStatus2.AccountIdentification, com.tools20022.repository.msg.DetailedInstructionStatus2.SubAccountIdentification,
					com.tools20022.repository.msg.DetailedInstructionStatus9.AccountIdentification, com.tools20022.repository.msg.DetailedInstructionStatus9.SubAccountIdentification,
					com.tools20022.repository.msg.CorporateActionOption1.AgentSecuritiesAccountIdentification, com.tools20022.repository.msg.CorporateActionOption1.AgentCashAccountIdentification,
					com.tools20022.repository.msg.CashAccount19.AccountIdentification, com.tools20022.repository.msg.ProceedsDelivery1.CashAccountIdentification, com.tools20022.repository.msg.CashAccount18.AccountIdentification,
					com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.AgentAccountIdentification, com.tools20022.repository.msg.CorporateActionMovementFailedStatus1.ClientAccountIdentification,
					com.tools20022.repository.msg.IncludedAccount1.SecuritiesAccountIdentification, com.tools20022.repository.msg.CashAccount17.AccountIdentification, com.tools20022.repository.msg.QuantityAndAccount7.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount16.CashAccount, com.tools20022.repository.msg.QuantityAndAccount3.CashAccount, com.tools20022.repository.msg.QuantityAndAccount13.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount53.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount53.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount53.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount53.TaxAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount55.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount55.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount55.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount55.TaxAccount, com.tools20022.repository.msg.QuantityAndAccount8.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount14.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount48.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount48.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount48.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount48.TaxAccount,
					com.tools20022.repository.msg.IdentificationInformation1.Account, com.tools20022.repository.msg.IdentificationInformation2.Account, com.tools20022.repository.msg.AccountingAccount1.Identification,
					com.tools20022.repository.msg.SettlementTerms1.BeneficiaryAccount, com.tools20022.repository.msg.InterestCalculation2.CollateralAccountIdentification, com.tools20022.repository.msg.CollateralAccount1.Identification,
					com.tools20022.repository.msg.MemberDetails.Account, com.tools20022.repository.msg.QuantityAndAccount10.CashAccount, com.tools20022.repository.msg.QuantityAndAccount21.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount4.CashAccount, com.tools20022.repository.msg.QuantityAndAccount22.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount69.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount69.ChargesAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount69.CommissionAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount69.TaxAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount70.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount70.ChargesAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount70.CommissionAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount70.TaxAccount, com.tools20022.repository.msg.QuantityAndAccount27.CashAccount, com.tools20022.repository.msg.QuantityAndAccount36.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount9.CashAccount, com.tools20022.repository.msg.QuantityAndAccount23.CashAccount, com.tools20022.repository.msg.QuantityAndAccount26.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount35.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount72.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount72.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount72.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount72.TaxAccount, com.tools20022.repository.msg.SecuritiesAccount21.Account,
					com.tools20022.repository.choice.BalanceType7Choice.Account, com.tools20022.repository.msg.SecuritiesAccount19.Identification, com.tools20022.repository.msg.SecuritiesAccount18.Identification,
					com.tools20022.repository.msg.PartyIdentificationAndAccount32.AccountIdentification, com.tools20022.repository.msg.Contribution1.Account, com.tools20022.repository.msg.DefaultFund1.DefaultFundAccount,
					com.tools20022.repository.msg.CashAccountCharacteristics1.DebitAccount, com.tools20022.repository.msg.SubAccount3.Identification, com.tools20022.repository.msg.CashAccount10.Identification,
					com.tools20022.repository.msg.CashAccount8.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount13.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount31.AccountIdentification,
					com.tools20022.repository.msg.InvestmentAccount32.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount33.AccountIdentification, com.tools20022.repository.msg.CreditTransfer7.CreditorAgentAccount,
					com.tools20022.repository.msg.Account8.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount7.AccountIdentification, com.tools20022.repository.msg.StatementAttributes1.AccountIdentification,
					com.tools20022.repository.msg.StatementAttributes1.SubAccountIdentification, com.tools20022.repository.msg.CustomerAccount2.Identification, com.tools20022.repository.msg.CustomerAccount2.ReferenceAccountIdentification,
					com.tools20022.repository.msg.CustomerAccount3.Identification, com.tools20022.repository.msg.Balance3.SubAccountDetails, com.tools20022.repository.msg.LimitIdentification4.AccountIdentification,
					com.tools20022.repository.msg.ServiceCategoryTotals1.AccountIdentification, com.tools20022.repository.msg.BillingSearchCriteria1.AccountIdentification,
					com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount38.Identification,
					com.tools20022.repository.msg.InvestmentAccount37.Identification, com.tools20022.repository.msg.InvestmentAccount40.AccountIdentification, com.tools20022.repository.msg.AccountReport17.AccountIdentification,
					com.tools20022.repository.msg.Account15.Identification, com.tools20022.repository.msg.Account16.Identification, com.tools20022.repository.msg.CashAccount29.Identification,
					com.tools20022.repository.msg.InvestmentAccount41.AccountIdentification, com.tools20022.repository.msg.Account14.Identification, com.tools20022.repository.msg.CashOption31.CashAccountIdentification,
					com.tools20022.repository.msg.CashOption32.CashAccountIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount97.AccountIdentification,
					com.tools20022.repository.msg.PartyIdentificationAndAccount96.AccountIdentification, com.tools20022.repository.msg.CashOption36.CashAccountIdentification,
					com.tools20022.repository.msg.CashOption35.CashAccountIdentification, com.tools20022.repository.msg.InvestmentAccount43.Identification,
					com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3.SubAccountDetails, com.tools20022.repository.choice.InvestmentAccountSelection1Choice.AccountIdentification,
					com.tools20022.repository.msg.InvestmentAccount45.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount42.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount46.Identification,
					com.tools20022.repository.msg.AccountSubLevel1.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel4.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel5.AccountIdentification,
					com.tools20022.repository.msg.AccountSubLevel2.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel3.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel6.AccountIdentification,
					com.tools20022.repository.msg.AccountSubLevel7.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel8.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel9.AccountIdentification,
					com.tools20022.repository.msg.PartyIdentificationAndAccount101.CashAccount, com.tools20022.repository.msg.CashCollateral3.CashAccountIdentification,
					com.tools20022.repository.msg.CashCollateral2.CashAccountIdentification, com.tools20022.repository.msg.DetailedInstructionStatus10.AccountIdentification,
					com.tools20022.repository.msg.DetailedInstructionStatus10.SubAccountIdentification, com.tools20022.repository.msg.EligiblePosition5.AccountIdentification,
					com.tools20022.repository.msg.EligiblePosition6.AccountIdentification, com.tools20022.repository.msg.CashCollateralResponse1.CashAccountIdentification,
					com.tools20022.repository.msg.PartyIdentificationAndAccount102.AccountIdentification, com.tools20022.repository.msg.InterestCalculation3.CollateralAccountIdentification,
					com.tools20022.repository.msg.SubAccount4.Identification, com.tools20022.repository.msg.PartyIdentificationAndAccount104.CashAccount, com.tools20022.repository.msg.CashCollateral5.CashAccountIdentification,
					com.tools20022.repository.msg.FinancialItemParameters1.DebitAccount, com.tools20022.repository.msg.FinancialItemParameters1.CreditAccount, com.tools20022.repository.msg.ATMAccountStatement1.AccountIdentifier,
					com.tools20022.repository.msg.CardAccount3.AccountIdentifier, com.tools20022.repository.msg.CardAccount1.AccountIdentifier, com.tools20022.repository.msg.CardAccount6.AccountIdentifier,
					com.tools20022.repository.msg.CardAccount4.AccountIdentifier, com.tools20022.repository.msg.CardAccount5.AccountIdentifier, com.tools20022.repository.msg.CardAccount2.AccountIdentifier,
					com.tools20022.repository.msg.QuantityAndAccount39.CashAccount, com.tools20022.repository.msg.QuantityAndAccount41.CashAccount, com.tools20022.repository.msg.QuantityAndAccount40.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount42.CashAccount, com.tools20022.repository.msg.QuantityAndAccount38.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount112.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount112.ChargesAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount112.CommissionAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount112.TaxAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount111.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount111.ChargesAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount111.CommissionAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount111.TaxAccount, com.tools20022.repository.msg.QuantityAndAccount43.CashAccount, com.tools20022.repository.msg.Account18.Identification,
					com.tools20022.repository.msg.QuantityAndAccount45.CashAccount, com.tools20022.repository.msg.QuantityAndAccount44.CashAccount, com.tools20022.repository.msg.CashAccountCharacteristics2.DebitAccount,
					com.tools20022.repository.msg.CashOption42.CashAccountIdentification, com.tools20022.repository.msg.CashOption43.CashAccountIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount120.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount121.CashAccount, com.tools20022.repository.msg.Account19.Identification, com.tools20022.repository.msg.InvestmentAccount49.Identification,
					com.tools20022.repository.msg.CashAccount34.Identification, com.tools20022.repository.msg.InvestmentAccount54.AccountIdentification, com.tools20022.repository.choice.AccountSelection1Choice.AccountIdentification,
					com.tools20022.repository.msg.InvestmentAccount50.Identification, com.tools20022.repository.msg.InvestmentAccount56.AccountIdentification,
					com.tools20022.repository.msg.PartyIdentificationAndAccount124.AccountIdentification, com.tools20022.repository.msg.SubAccount5.Identification, com.tools20022.repository.msg.InvestmentAccount55.AccountIdentification,
					com.tools20022.repository.msg.DirectDebitMandate5.DebtorAccount, com.tools20022.repository.msg.CashAccount32.Identification, com.tools20022.repository.msg.InvestmentAccount53.AccountIdentification,
					com.tools20022.repository.msg.PartyIdentificationAndAccount125.AccountIdentification, com.tools20022.repository.msg.Account20.Identification, com.tools20022.repository.msg.CashAccount33.Identification,
					com.tools20022.repository.msg.InvestmentAccount57.AccountIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount123.AccountIdentification,
					com.tools20022.repository.msg.CollateralAccount2.Identification, com.tools20022.repository.msg.InterestCalculation4.CollateralAccountIdentification,
					com.tools20022.repository.msg.PartyIdentificationAndAccount126.AccountIdentification, com.tools20022.repository.msg.CashOption49.CashAccountIdentification,
					com.tools20022.repository.msg.CashOption47.CashAccountIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount129.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount130.CashAccount, com.tools20022.repository.msg.QuantityAndAccount47.CashAccount, com.tools20022.repository.msg.QuantityAndAccount48.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount46.CashAccount, com.tools20022.repository.msg.QuantityAndAccount51.CashAccount, com.tools20022.repository.msg.QuantityAndAccount49.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount133.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount133.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount133.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount133.TaxAccount,
					com.tools20022.repository.msg.SecuritiesAccount30.Identification, com.tools20022.repository.msg.QuantityAndAccount50.CashAccount, com.tools20022.repository.msg.QuantityAndAccount55.CashAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount134.CashAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount134.ChargesAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount134.CommissionAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount134.TaxAccount, com.tools20022.repository.msg.Account21.Identification,
					com.tools20022.repository.msg.QuantityAndAccount54.CashAccount, com.tools20022.repository.msg.CardAccount10.AccountIdentifier, com.tools20022.repository.msg.CardAccount9.AccountIdentifier,
					com.tools20022.repository.msg.CardAccount8.AccountIdentifier, com.tools20022.repository.msg.CardAccount11.AccountIdentifier, com.tools20022.repository.msg.CardAccount13.AccountIdentifier,
					com.tools20022.repository.msg.CardAccount7.AccountIdentifier, com.tools20022.repository.msg.CardAccount12.AccountIdentifier, com.tools20022.repository.msg.InvestmentAccount61.Identification,
					com.tools20022.repository.choice.AccountSelection2Choice.AccountIdentification, com.tools20022.repository.msg.AccountManagementStatusAndReason5.ExistingAccountIdentification,
					com.tools20022.repository.msg.AccountManagementStatusAndReason5.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount62.Identification,
					com.tools20022.repository.msg.AccountSubLevel15.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel16.AccountIdentification, com.tools20022.repository.msg.InvestmentAccount58.AccountIdentification,
					com.tools20022.repository.msg.AccountSubLevel18.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel19.AccountIdentification, com.tools20022.repository.msg.SubAccount6.Identification,
					com.tools20022.repository.msg.AccountSubLevel11.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel12.AccountIdentification,
					com.tools20022.repository.msg.PartyIdentificationAndAccount147.AccountIdentification, com.tools20022.repository.msg.Account23.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel17.AccountIdentification,
					com.tools20022.repository.msg.AccountSubLevel13.AccountIdentification, com.tools20022.repository.msg.AccountSubLevel14.AccountIdentification, com.tools20022.repository.msg.CreditTransfer8.CreditorAgentAccount,
					com.tools20022.repository.msg.InvestmentAccount60.AccountIdentification, com.tools20022.repository.msg.Account22.Identification, com.tools20022.repository.msg.DirectDebitMandate6.DebtorAccount,
					com.tools20022.repository.msg.CashOption51.CashAccountIdentification, com.tools20022.repository.msg.CashOption50.CashAccountIdentification,
					com.tools20022.repository.msg.CashCollateralResponse2.CashAccountIdentification, com.tools20022.repository.msg.CashOption53.CashAccountIdentification,
					com.tools20022.repository.msg.CashOption54.CashAccountIdentification, com.tools20022.repository.msg.QuantityAndAccount57.CashAccount, com.tools20022.repository.msg.QuantityAndAccount58.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount56.CashAccount, com.tools20022.repository.msg.QuantityAndAccount61.CashAccount, com.tools20022.repository.msg.QuantityAndAccount62.CashAccount,
					com.tools20022.repository.msg.QuantityAndAccount59.CashAccount, com.tools20022.repository.msg.QuantityAndAccount60.CashAccount, com.tools20022.repository.msg.CollateralAccount3.Identification);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AccountIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account for which one or more sub-accounts are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#SubAccount
	 * Account.SubAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#ParentAccount
	 * CashAccountCharacteristics1.ParentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#ParentAccount
	 * CashAccountCharacteristics2.ParentAccount}</li>
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
	public static final MMBusinessAssociationEnd ParentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics1.ParentAccount, com.tools20022.repository.msg.CashAccountCharacteristics2.ParentAccount);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParentAccount";
			definition = "Account for which one or more sub-accounts are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.SubAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Subdivision of an account used to segregate specific holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#ParentAccount
	 * Account.ParentAccount}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccount14#SecondaryAccount
	 * CashAccount14.SecondaryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount22#SecondaryAccount
	 * CashAccount22.SecondaryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#SubAccountDetails
	 * InvestmentAccount24.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#SubAccountDetails
	 * PartyIdentificationAndAccount4.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21#SubAccountDetails
	 * InvestmentAccount21.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#SubAccountForHolding
	 * RedemptionOrder6.SubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#SubAccountForHolding
	 * RedemptionExecution6.SubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#SubAccountForHolding
	 * RedemptionOrder8.SubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#SubAccountForHolding
	 * SubscriptionOrder6.SubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#SubAccountForHolding
	 * SubscriptionExecution6.SubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#SubAccountForHolding
	 * SubscriptionOrder8.SubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount3#SubAccountDetails
	 * SafekeepingAccount3.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#SubAccountDetails
	 * SafekeepingAccount4.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition4#SubAccount
	 * SecurityPosition4.SubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#SubAccountDetails
	 * PartyIdentificationAndAccount32.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount30#SubAccount
	 * InvestmentAccount30.SubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#SubAccountDetails
	 * InvestmentAccount40.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#SubAccountDetails
	 * InvestmentAccount41.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#SubAccountDetails
	 * SafekeepingAccount6.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#SubAccount
	 * PartyIdentificationAndAccount102.SubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#SubAccountDetails
	 * InvestmentAccount54.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#SubAccountDetails
	 * InvestmentAccount56.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#SubAccountDetails
	 * InvestmentAccount55.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#SubAccountDetails
	 * InvestmentAccount57.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#SubAccountDetails
	 * PartyIdentificationAndAccount123.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126#SubAccount
	 * PartyIdentificationAndAccount126.SubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#SubAccountForHolding
	 * RedemptionOrder14.SubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58#SubAccountDetails
	 * InvestmentAccount58.SubAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#SubAccountForHolding
	 * SubscriptionExecution13.SubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#SubAccountForHolding
	 * SubscriptionOrder14.SubAccountForHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#SubAccountForHolding
	 * RedemptionExecution15.SubAccountForHolding}</li>
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
	public static final MMBusinessAssociationEnd SubAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount14.SecondaryAccount, com.tools20022.repository.msg.CashAccount22.SecondaryAccount,
					com.tools20022.repository.msg.InvestmentAccount24.SubAccountDetails, com.tools20022.repository.msg.PartyIdentificationAndAccount4.SubAccountDetails, com.tools20022.repository.msg.InvestmentAccount21.SubAccountDetails,
					com.tools20022.repository.msg.RedemptionOrder6.SubAccountForHolding, com.tools20022.repository.msg.RedemptionExecution6.SubAccountForHolding, com.tools20022.repository.msg.RedemptionOrder8.SubAccountForHolding,
					com.tools20022.repository.msg.SubscriptionOrder6.SubAccountForHolding, com.tools20022.repository.msg.SubscriptionExecution6.SubAccountForHolding, com.tools20022.repository.msg.SubscriptionOrder8.SubAccountForHolding,
					com.tools20022.repository.msg.SafekeepingAccount3.SubAccountDetails, com.tools20022.repository.msg.SafekeepingAccount4.SubAccountDetails, com.tools20022.repository.msg.SecurityPosition4.SubAccount,
					com.tools20022.repository.msg.PartyIdentificationAndAccount32.SubAccountDetails, com.tools20022.repository.msg.InvestmentAccount30.SubAccount, com.tools20022.repository.msg.InvestmentAccount40.SubAccountDetails,
					com.tools20022.repository.msg.InvestmentAccount41.SubAccountDetails, com.tools20022.repository.msg.SafekeepingAccount6.SubAccountDetails, com.tools20022.repository.msg.PartyIdentificationAndAccount102.SubAccount,
					com.tools20022.repository.msg.InvestmentAccount54.SubAccountDetails, com.tools20022.repository.msg.InvestmentAccount56.SubAccountDetails, com.tools20022.repository.msg.InvestmentAccount55.SubAccountDetails,
					com.tools20022.repository.msg.InvestmentAccount57.SubAccountDetails, com.tools20022.repository.msg.PartyIdentificationAndAccount123.SubAccountDetails,
					com.tools20022.repository.msg.PartyIdentificationAndAccount126.SubAccount, com.tools20022.repository.msg.RedemptionOrder14.SubAccountForHolding, com.tools20022.repository.msg.InvestmentAccount58.SubAccountDetails,
					com.tools20022.repository.msg.SubscriptionExecution13.SubAccountForHolding, com.tools20022.repository.msg.SubscriptionOrder14.SubAccountForHolding,
					com.tools20022.repository.msg.RedemptionExecution15.SubAccountForHolding);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubAccount";
			definition = "Subdivision of an account used to segregate specific holdings.";
			minOccurs = 0;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.ParentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fund processing characteristics for which a settlement account is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SettlementAccount
	 * InvestmentFundClassProcessingCharacteristics.SettlementAccount}</li>
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
	public static final MMBusinessAssociationEnd RelatedFundProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedFundProcessingCharacteristics";
			definition = "Fund processing characteristics for which a settlement account is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the current state of an account, eg, enabled or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#Account
	 * AccountStatus.Account}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount5#Status
	 * CashAccount5.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount17#Status
	 * InvestmentAccount17.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12#Status
	 * CashAccount12.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount27#Status
	 * InvestmentAccount27.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount35#Status
	 * InvestmentAccount35.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#BlockedStatus
	 * InvestmentAccount35.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#BlockedStatus
	 * InvestmentAccount36.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#BlockedStatus
	 * InvestmentAccount34.BlockedStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount1#Status
	 * CustomerAccount1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#Status
	 * CustomerAccount2.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#Status
	 * CustomerAccount3.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount38#Status
	 * InvestmentAccount38.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#BlockedStatus
	 * InvestmentAccount38.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#BlockedStatus
	 * InvestmentAccount37.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#BlockedStatus
	 * InvestmentAccount39.BlockedStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount46#Status
	 * InvestmentAccount46.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#BlockedStatus
	 * InvestmentAccount46.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#BlockedStatus
	 * InvestmentAccount47.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#BlockedStatus
	 * InvestmentAccount49.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#BlockedStatus
	 * InvestmentAccount51.BlockedStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50#Status
	 * InvestmentAccount50.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#BlockedStatus
	 * InvestmentAccount50.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#BlockedStatus
	 * InvestmentAccount61.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#AccountStatus
	 * AccountManagementStatusAndReason5.AccountStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#BlockedStatus
	 * AccountManagementStatusAndReason5.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#BlockedStatus
	 * InvestmentAccount63.BlockedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#AccountStatus
	 * InvestmentAccount62.AccountStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#BlockedStatus
	 * InvestmentAccount62.BlockedStatus}</li>
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
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount5.Status, com.tools20022.repository.msg.InvestmentAccount17.Status, com.tools20022.repository.msg.CashAccount12.Status,
					com.tools20022.repository.msg.InvestmentAccount27.Status, com.tools20022.repository.msg.InvestmentAccount35.Status, com.tools20022.repository.msg.InvestmentAccount35.BlockedStatus,
					com.tools20022.repository.msg.InvestmentAccount36.BlockedStatus, com.tools20022.repository.msg.InvestmentAccount34.BlockedStatus, com.tools20022.repository.msg.CustomerAccount1.Status,
					com.tools20022.repository.msg.CustomerAccount2.Status, com.tools20022.repository.msg.CustomerAccount3.Status, com.tools20022.repository.msg.InvestmentAccount38.Status,
					com.tools20022.repository.msg.InvestmentAccount38.BlockedStatus, com.tools20022.repository.msg.InvestmentAccount37.BlockedStatus, com.tools20022.repository.msg.InvestmentAccount39.BlockedStatus,
					com.tools20022.repository.msg.InvestmentAccount46.Status, com.tools20022.repository.msg.InvestmentAccount46.BlockedStatus, com.tools20022.repository.msg.InvestmentAccount47.BlockedStatus,
					com.tools20022.repository.msg.InvestmentAccount49.BlockedStatus, com.tools20022.repository.msg.InvestmentAccount51.BlockedStatus, com.tools20022.repository.msg.InvestmentAccount50.Status,
					com.tools20022.repository.msg.InvestmentAccount50.BlockedStatus, com.tools20022.repository.msg.InvestmentAccount61.BlockedStatus, com.tools20022.repository.msg.AccountManagementStatusAndReason5.AccountStatus,
					com.tools20022.repository.msg.AccountManagementStatusAndReason5.BlockedStatus, com.tools20022.repository.msg.InvestmentAccount63.BlockedStatus, com.tools20022.repository.msg.InvestmentAccount62.AccountStatus,
					com.tools20022.repository.msg.InvestmentAccount62.BlockedStatus);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AccountStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountStatus.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#Language
	 * InvestmentAccount17.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#Language
	 * InvestmentAccount27.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#Language
	 * InvestmentAccount35.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#Language
	 * InvestmentAccount18.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#Language
	 * InvestmentAccount28.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#Language
	 * InvestmentAccount36.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#Language
	 * InvestmentAccount16.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#Language
	 * InvestmentAccount26.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#Language
	 * InvestmentAccount34.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#Language
	 * InvestmentAccount38.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#Language
	 * InvestmentAccount37.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#Language
	 * InvestmentAccount39.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#Language
	 * InvestmentAccount46.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#Language
	 * InvestmentAccount47.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#Language
	 * InvestmentAccount49.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#Language
	 * InvestmentAccount51.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#Language
	 * InvestmentAccount50.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#Language
	 * InvestmentAccountOwnershipInformation12.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#Language
	 * InvestmentAccountOwnershipInformation13.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#Language
	 * InvestmentAccount61.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#Language
	 * InvestmentAccount63.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#Language
	 * InvestmentAccount62.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#Language
	 * InvestmentAccountOwnershipInformation15.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#Language
	 * InvestmentAccountOwnershipInformation14.Language}</li>
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
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.Language, com.tools20022.repository.msg.InvestmentAccount27.Language, com.tools20022.repository.msg.InvestmentAccount35.Language,
					com.tools20022.repository.msg.InvestmentAccount18.Language, com.tools20022.repository.msg.InvestmentAccount28.Language, com.tools20022.repository.msg.InvestmentAccount36.Language,
					com.tools20022.repository.msg.InvestmentAccount16.Language, com.tools20022.repository.msg.InvestmentAccount26.Language, com.tools20022.repository.msg.InvestmentAccount34.Language,
					com.tools20022.repository.msg.InvestmentAccount38.Language, com.tools20022.repository.msg.InvestmentAccount37.Language, com.tools20022.repository.msg.InvestmentAccount39.Language,
					com.tools20022.repository.msg.InvestmentAccount46.Language, com.tools20022.repository.msg.InvestmentAccount47.Language, com.tools20022.repository.msg.InvestmentAccount49.Language,
					com.tools20022.repository.msg.InvestmentAccount51.Language, com.tools20022.repository.msg.InvestmentAccount50.Language, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.Language,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.Language, com.tools20022.repository.msg.InvestmentAccount61.Language, com.tools20022.repository.msg.InvestmentAccount63.Language,
					com.tools20022.repository.msg.InvestmentAccount62.Language, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.Language, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.Language);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language for all communication concerning the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	/**
	 * Specifies each role linked to an account and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountPartyRole#Account
	 * AccountPartyRole.Account}</li>
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
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to an account and played by a party in that context.";
			minOccurs = 0;
			type_lazy = () -> AccountPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountPartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party for which an account is specified in the context of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#Account
	 * TradePartyRole.Account}</li>
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
	public static final MMBusinessAssociationEnd TradePartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Party for which an account is specified in the context of a trade.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradePartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#Currency
	 * CustomerAccountModification1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#ReportingCurrency
	 * SecuritiesAccount21.ReportingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#AccountBalanceCurrencyCode
	 * CashAccountCharacteristics1.AccountBalanceCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountBalanceCurrencyCode
	 * CashAccountCharacteristics2.AccountBalanceCurrencyCode}</li>
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
	public static final MMBusinessAttribute ReportingCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccountModification1.Currency, com.tools20022.repository.msg.SecuritiesAccount21.ReportingCurrency,
					com.tools20022.repository.msg.CashAccountCharacteristics1.AccountBalanceCurrencyCode, com.tools20022.repository.msg.CashAccountCharacteristics2.AccountBalanceCurrencyCode);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingCurrency";
			definition = "Currency used to calculate and report the balance and related entries of an account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Restriction on capability or operations allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction#Account
	 * AccountRestriction.Account}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashBalance5#RestrictionType
	 * CashBalance5.RestrictionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#Restriction
	 * CustomerAccount1.Restriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#Restriction
	 * CustomerAccount5.Restriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#Restriction
	 * CustomerAccountModification1.Restriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#Restriction
	 * CustomerAccount4.Restriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#Restriction
	 * CustomerAccount2.Restriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#Restriction
	 * CustomerAccount3.Restriction}</li>
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
	public static final MMBusinessAssociationEnd AccountRestriction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalance5.RestrictionType, com.tools20022.repository.msg.CustomerAccount1.Restriction, com.tools20022.repository.msg.CustomerAccount5.Restriction,
					com.tools20022.repository.msg.CustomerAccountModification1.Restriction, com.tools20022.repository.msg.CustomerAccount4.Restriction, com.tools20022.repository.msg.CustomerAccount2.Restriction,
					com.tools20022.repository.msg.CustomerAccount3.Restriction);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountRestriction";
			definition = "Restriction on capability or operations allowed.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountRestriction.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role of the party which uses the account for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#SettlementAccount
	 * SettlementPartyRole.SettlementAccount}</li>
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
	public static final MMBusinessAssociationEnd SettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPartyRole";
			definition = "Specifies the role of the party which uses the account for settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#AccountPurpose
	 * CustomerAccount1.AccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#AccountPurpose
	 * CustomerAccount5.AccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PurposeModification1#Purpose
	 * PurposeModification1.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#AccountPurpose
	 * CustomerAccountModification1.AccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#AccountPurpose
	 * CustomerAccount4.AccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#AccountPurpose
	 * CustomerAccount2.AccountPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#AccountPurpose
	 * CustomerAccount3.AccountPurpose}</li>
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
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount1.AccountPurpose, com.tools20022.repository.msg.CustomerAccount5.AccountPurpose, com.tools20022.repository.msg.PurposeModification1.Purpose,
					com.tools20022.repository.msg.CustomerAccountModification1.AccountPurpose, com.tools20022.repository.msg.CustomerAccount4.AccountPurpose, com.tools20022.repository.msg.CustomerAccount2.AccountPurpose,
					com.tools20022.repository.msg.CustomerAccount3.AccountPurpose);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the purpose of the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#ClosingDate
	 * CustomerAccount1.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#ClosingDate
	 * CustomerAccount5.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#ClosingDate
	 * CustomerAccountModification1.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#ClosingDate
	 * CustomerAccount4.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#ClosingDate
	 * AccountContract3.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#ClosingDate
	 * CustomerAccount2.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#ClosingDate
	 * CustomerAccount3.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#ClosingDate
	 * InvestmentAccount49.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#ClosingDate
	 * InvestmentAccount51.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#ClosingDate
	 * InvestmentAccount50.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#ClosingDate
	 * InvestmentAccount61.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#ClosingDate
	 * InvestmentAccount63.ClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#ClosingDate
	 * InvestmentAccount62.ClosingDate}</li>
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
	public static final MMBusinessAttribute ClosingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount1.ClosingDate, com.tools20022.repository.msg.CustomerAccount5.ClosingDate,
					com.tools20022.repository.msg.CustomerAccountModification1.ClosingDate, com.tools20022.repository.msg.CustomerAccount4.ClosingDate, com.tools20022.repository.msg.AccountContract3.ClosingDate,
					com.tools20022.repository.msg.CustomerAccount2.ClosingDate, com.tools20022.repository.msg.CustomerAccount3.ClosingDate, com.tools20022.repository.msg.InvestmentAccount49.ClosingDate,
					com.tools20022.repository.msg.InvestmentAccount51.ClosingDate, com.tools20022.repository.msg.InvestmentAccount50.ClosingDate, com.tools20022.repository.msg.InvestmentAccount61.ClosingDate,
					com.tools20022.repository.msg.InvestmentAccount63.ClosingDate, com.tools20022.repository.msg.InvestmentAccount62.ClosingDate);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingDate";
			definition = "Date on which the account and related services cease effectively to be operational for the account owner.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#GoLiveDate
	 * AccountContract3.GoLiveDate}</li>
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
	public static final MMBusinessAttribute LiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountContract3.GoLiveDate);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiveDate";
			definition = "Date of the first movement on the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the period for which the movements in the account are reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#Account
	 * DateTimePeriod.Account}</li>
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
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#StatementPeriod
	 * StatementDetails.StatementPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#StatementPeriod
	 * StatementAndFinancialInstrumentDetails.StatementPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification1#FromToDate
	 * AccountNotification1.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2#FromToDate
	 * AccountNotification2.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification5#FromToDate
	 * AccountNotification5.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#FromToDate
	 * AccountNotification7.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StatementTerm1Choice#StatementPeriod
	 * StatementTerm1Choice.StatementPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#FromToDate
	 * AccountNotification11.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#FromToDate
	 * AccountNotification12.FromToDate}</li>
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
	public static final MMBusinessAssociationEnd ReportedPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementDetails.StatementPeriod, com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails.StatementPeriod,
					com.tools20022.repository.msg.AccountNotification1.FromToDate, com.tools20022.repository.msg.AccountNotification2.FromToDate, com.tools20022.repository.msg.AccountNotification5.FromToDate,
					com.tools20022.repository.msg.AccountNotification7.FromToDate, com.tools20022.repository.choice.StatementTerm1Choice.StatementPeriod, com.tools20022.repository.msg.AccountNotification11.FromToDate,
					com.tools20022.repository.msg.AccountNotification12.FromToDate);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedPeriod";
			definition = "Specifies the period for which the movements in the account are reported.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party role for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#Account
	 * InvestmentFundPartyRole.Account}</li>
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
	public static final MMBusinessAssociationEnd InvestmentFundPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundPartyRole";
			definition = "Party role for which an account is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral data for which a collateral account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAccount
	 * Collateral.CollateralAccount}</li>
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
	public static final MMBusinessAssociationEnd RelatedCollateralProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCollateralProcess";
			definition = "Collateral data for which a collateral account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Account
	 * GenericIdentification.Account}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification5#Type
	 * AccountIdentification5.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount3#SelectedAccountType
	 * CardAccount3.SelectedAccountType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#AccountType
	 * CardAccount6.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#SelectedAccountType
	 * CardAccount4.SelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount5#SelectedAccountType
	 * CardAccount5.SelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount10#SelectedAccountType
	 * CardAccount10.SelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount9#SelectedAccountType
	 * CardAccount9.SelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount8#SelectedAccountType
	 * CardAccount8.SelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount11#SelectedAccountType
	 * CardAccount11.SelectedAccountType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount13#AccountType
	 * CardAccount13.AccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount7#SelectedAccountType
	 * CardAccount7.SelectedAccountType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount12#AccountType
	 * CardAccount12.AccountType}</li>
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
	public static final MMBusinessAssociationEnd Type = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountIdentification5.Type, com.tools20022.repository.msg.CardAccount3.SelectedAccountType, com.tools20022.repository.msg.CardAccount6.AccountType,
					com.tools20022.repository.msg.CardAccount4.SelectedAccountType, com.tools20022.repository.msg.CardAccount5.SelectedAccountType, com.tools20022.repository.msg.CardAccount10.SelectedAccountType,
					com.tools20022.repository.msg.CardAccount9.SelectedAccountType, com.tools20022.repository.msg.CardAccount8.SelectedAccountType, com.tools20022.repository.msg.CardAccount11.SelectedAccountType,
					com.tools20022.repository.msg.CardAccount13.AccountType, com.tools20022.repository.msg.CardAccount7.SelectedAccountType, com.tools20022.repository.msg.CardAccount12.AccountType);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Proceeds delivery instruction which contain account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SettlementAccount
	 * CorporateActionProceedsDeliveryInstruction.SettlementAccount}</li>
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
	public static final MMBusinessAssociationEnd RelatedProceedsDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProceedsDelivery";
			definition = "Proceeds delivery instruction which contain account identification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party for which an account is specified in the context of a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole#Account
	 * CorporateActionPartyRole.Account}</li>
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
	public static final MMBusinessAssociationEnd RelatedCorporateActionPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionPartyRole";
			definition = "Party for which an account is specified in the context of a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing member which holds a default fund account at an ICSD or at the
	 * central bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#DefaultFundAccount
	 * ClearingMemberRole.DefaultFundAccount}</li>
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
	public static final MMBusinessAssociationEnd DefaultFundAccountOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccountOwner";
			definition = "Clearing member which holds a default fund account at an ICSD or at the central bank.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.DefaultFundAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * System where the account is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#Account
	 * System.Account}</li>
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
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System where the account is held.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Overall position representing the net debits and credits in an account at
	 * a specific point in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Balance#Account
	 * Balance.Account}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification10#BalanceForSubAccount
	 * SubAccountIdentification10.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification13#BalanceForSubAccount
	 * SubAccountIdentification13.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification2#BalanceForSubAccount
	 * SubAccountIdentification2.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification3#BalanceForSubAccount
	 * SubAccountIdentification3.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification16#BalanceForSubAccount
	 * SubAccountIdentification16.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification20#BalanceForSubAccount
	 * SubAccountIdentification20.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification23#BalanceForSubAccount
	 * SubAccountIdentification23.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification26#BalanceForSubAccount
	 * SubAccountIdentification26.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification11#BalanceForSubAccount
	 * SubAccountIdentification11.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification12#BalanceForSubAccount
	 * SubAccountIdentification12.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification1#BalanceForSubAccount
	 * SubAccountIdentification1.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5#BalanceForSubAccount
	 * SubAccountIdentification5.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification17#BalanceForSubAccount
	 * SubAccountIdentification17.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification19#BalanceForSubAccount
	 * SubAccountIdentification19.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification22#BalanceForSubAccount
	 * SubAccountIdentification22.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification25#BalanceForSubAccount
	 * SubAccountIdentification25.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification27#BalanceForSubAccount
	 * SubAccountIdentification27.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubaccountIdentification7#BalanceForSubAccount
	 * SubaccountIdentification7.BalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubaccountIdentification8#BalanceForSubAccount
	 * SubaccountIdentification8.BalanceForSubAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#Balance
	 * CardAccount4.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard17#RetainedCardBalance
	 * PaymentCard17.RetainedCardBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#Balance
	 * CardAccount2.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#AccountAndBalance
	 * CardTransactionDetail2.AccountAndBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#AccountAndBalance
	 * CardTransactionDetail4.AccountAndBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8#Balance
	 * CardAccount8.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard23#ElectronicPurseBalance
	 * PaymentCard23.ElectronicPurseBalance}</li>
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
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubAccountIdentification10.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification13.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification2.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification3.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification16.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification20.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification23.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification26.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification11.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification12.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification1.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification5.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification17.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification19.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification22.BalanceForSubAccount, com.tools20022.repository.msg.SubAccountIdentification25.BalanceForSubAccount,
					com.tools20022.repository.msg.SubAccountIdentification27.BalanceForSubAccount, com.tools20022.repository.msg.SubaccountIdentification7.BalanceForSubAccount,
					com.tools20022.repository.msg.SubaccountIdentification8.BalanceForSubAccount, com.tools20022.repository.msg.CardAccount4.Balance, com.tools20022.repository.msg.PaymentCard17.RetainedCardBalance,
					com.tools20022.repository.msg.CardAccount2.Balance, com.tools20022.repository.msg.CardTransactionDetail2.AccountAndBalance, com.tools20022.repository.msg.CardTransactionDetail4.AccountAndBalance,
					com.tools20022.repository.msg.CardAccount8.Balance, com.tools20022.repository.msg.PaymentCard23.ElectronicPurseBalance);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Overall position representing the net debits and credits in an account at a specific point in time.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Record of the movements into or out of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#Account
	 * Entry.Account}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement1#AccountStatement
	 * ATMAccountStatement1.AccountStatement}</li>
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
	public static final MMBusinessAssociationEnd Entry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMAccountStatement1.AccountStatement);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Agreement which provides information on the account and on the services
	 * linked to it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#Account
	 * AccountContract.Account}</li>
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
	public static final MMBusinessAssociationEnd AccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountContract";
			definition = "Agreement which provides information on the account and on the services linked to it.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#OpeningDate
	 * CustomerAccount2.OpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#OpeningDate
	 * CustomerAccount3.OpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#OpeningDate
	 * InvestmentAccount49.OpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#OpeningDate
	 * InvestmentAccount51.OpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#OpeningDate
	 * InvestmentAccount50.OpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#OpeningDate
	 * InvestmentAccount61.OpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#OpeningDate
	 * InvestmentAccount63.OpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#OpeningDate
	 * InvestmentAccount62.OpeningDate}</li>
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
	public static final MMBusinessAttribute OpeningDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount2.OpeningDate, com.tools20022.repository.msg.CustomerAccount3.OpeningDate, com.tools20022.repository.msg.InvestmentAccount49.OpeningDate,
					com.tools20022.repository.msg.InvestmentAccount51.OpeningDate, com.tools20022.repository.msg.InvestmentAccount50.OpeningDate, com.tools20022.repository.msg.InvestmentAccount61.OpeningDate,
					com.tools20022.repository.msg.InvestmentAccount63.OpeningDate, com.tools20022.repository.msg.InvestmentAccount62.OpeningDate);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningDate";
			definition = "Date on which the account and related basic services are effectively operational for the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate used to calculate the difference between amounts based on the base
	 * currency and the reporting currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ReportedAccount
	 * CurrencyExchange.ReportedAccount}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to calculate the difference between amounts based on the base currency and the reporting currency.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.ReportedAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Default fund contribution parameters associated with a contribution
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#ContributionAccount
	 * DefaultFundContribution.ContributionAccount}</li>
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
	public static final MMBusinessAssociationEnd DefaultFundContribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Default fund contribution parameters associated with a contribution account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.ContributionAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Member of a system which is the owner of an account with the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#Account
	 * SystemMemberRole.Account}</li>
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
	public static final MMBusinessAssociationEnd SystemMember = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMember";
			definition = "Member of a system which is the owner of an account with the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType1Choice#Type
	 * CollateralAccountIdentificationType1Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType1Choice#Proprietary
	 * CollateralAccountIdentificationType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount1#Type
	 * CollateralAccount1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount2#Type
	 * CollateralAccount2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice#Type
	 * CollateralAccountIdentificationType2Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice#Proprietary
	 * CollateralAccountIdentificationType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount3#Type
	 * CollateralAccount3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice#Type
	 * CollateralAccountIdentificationType3Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice#Proprietary
	 * CollateralAccountIdentificationType3Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute CollateralAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralAccountIdentificationType1Choice.Type, com.tools20022.repository.choice.CollateralAccountIdentificationType1Choice.Proprietary,
					com.tools20022.repository.msg.CollateralAccount1.Type, com.tools20022.repository.msg.CollateralAccount2.Type, com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice.Type,
					com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice.Proprietary, com.tools20022.repository.msg.CollateralAccount3.Type,
					com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice.Type, com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice.Proprietary);
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAccountType";
			definition = "Specifies the collateral account type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralAccountTypeCode.mmObject();
		}
	};
	/**
	 * Services linked to the account and specified in the account contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#Account
	 * AccountService.Account}</li>
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
	public static final MMBusinessAssociationEnd AccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Services linked to the account and specified in the account contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process which compares and matches trade information with entries in an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#Account
	 * Reconciliation.Account}</li>
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
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Product which provides guidance to investors to manage their portfolios.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ManagedAccountProduct#Account
	 * ManagedAccountProduct.Account}</li>
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
	public static final MMBusinessAssociationEnd ManagedAccountProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Account.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagedAccountProduct";
			definition = "Product which provides guidance to investors to manage their portfolios.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Account";
				definition = "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.Account, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementAccount,
						com.tools20022.repository.entity.Account.ParentAccount, com.tools20022.repository.entity.Account.SubAccount, com.tools20022.repository.entity.AccountIdentification.Account,
						com.tools20022.repository.entity.DateTimePeriod.Account, com.tools20022.repository.entity.AccountPartyRole.Account, com.tools20022.repository.entity.AccountService.Account,
						com.tools20022.repository.entity.AccountStatus.Account, com.tools20022.repository.entity.AccountContract.Account, com.tools20022.repository.entity.Entry.Account,
						com.tools20022.repository.entity.InvestmentFundPartyRole.Account, com.tools20022.repository.entity.TradePartyRole.Account, com.tools20022.repository.entity.System.Account,
						com.tools20022.repository.entity.SystemMemberRole.Account, com.tools20022.repository.entity.ClearingMemberRole.DefaultFundAccount, com.tools20022.repository.entity.Balance.Account,
						com.tools20022.repository.entity.SettlementPartyRole.SettlementAccount, com.tools20022.repository.entity.AccountRestriction.Account, com.tools20022.repository.entity.CurrencyExchange.ReportedAccount,
						com.tools20022.repository.entity.Collateral.CollateralAccount, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SettlementAccount,
						com.tools20022.repository.entity.CorporateActionPartyRole.Account, com.tools20022.repository.entity.DefaultFundContribution.ContributionAccount, com.tools20022.repository.entity.Reconciliation.Account,
						com.tools20022.repository.entity.ManagedAccountProduct.Account);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubAccount1.Characteristic, com.tools20022.repository.msg.IdentificationModification1.OriginalPartyAndAccountIdentification,
						com.tools20022.repository.msg.IdentificationModification1.UpdatedPartyAndAccountIdentification, com.tools20022.repository.msg.IdentificationModification2.OriginalPartyAndAccountIdentification,
						com.tools20022.repository.msg.IdentificationModification2.UpdatedPartyAndAccountIdentification, com.tools20022.repository.msg.IdentificationVerification1.PartyAndAccountIdentification,
						com.tools20022.repository.msg.IdentificationVerification2.PartyAndAccountIdentification, com.tools20022.repository.msg.SubAccount3.Characteristic, com.tools20022.repository.msg.StatementAttributes1.StatementTerm,
						com.tools20022.repository.msg.SubAccount4.Characteristic, com.tools20022.repository.msg.SubAccount5.Characteristic, com.tools20022.repository.msg.SubAccount6.Characteristic,
						com.tools20022.repository.msg.Account23.RelatedAccountDetails);
				subType_lazy = () -> Arrays.asList(CashAccount.mmObject(), SecuritiesAccount.mmObject(), InvestmentAccount.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.BaseCurrency, com.tools20022.repository.entity.Account.Identification, com.tools20022.repository.entity.Account.ParentAccount,
						com.tools20022.repository.entity.Account.SubAccount, com.tools20022.repository.entity.Account.RelatedFundProcessingCharacteristics, com.tools20022.repository.entity.Account.Status,
						com.tools20022.repository.entity.Account.Language, com.tools20022.repository.entity.Account.PartyRole, com.tools20022.repository.entity.Account.TradePartyRole,
						com.tools20022.repository.entity.Account.ReportingCurrency, com.tools20022.repository.entity.Account.AccountRestriction, com.tools20022.repository.entity.Account.SettlementPartyRole,
						com.tools20022.repository.entity.Account.Purpose, com.tools20022.repository.entity.Account.ClosingDate, com.tools20022.repository.entity.Account.LiveDate, com.tools20022.repository.entity.Account.ReportedPeriod,
						com.tools20022.repository.entity.Account.InvestmentFundPartyRole, com.tools20022.repository.entity.Account.RelatedCollateralProcess, com.tools20022.repository.entity.Account.Type,
						com.tools20022.repository.entity.Account.RelatedProceedsDelivery, com.tools20022.repository.entity.Account.RelatedCorporateActionPartyRole, com.tools20022.repository.entity.Account.DefaultFundAccountOwner,
						com.tools20022.repository.entity.Account.System, com.tools20022.repository.entity.Account.Balance, com.tools20022.repository.entity.Account.Entry, com.tools20022.repository.entity.Account.AccountContract,
						com.tools20022.repository.entity.Account.OpeningDate, com.tools20022.repository.entity.Account.CurrencyExchange, com.tools20022.repository.entity.Account.DefaultFundContribution,
						com.tools20022.repository.entity.Account.SystemMember, com.tools20022.repository.entity.Account.CollateralAccountType, com.tools20022.repository.entity.Account.AccountService,
						com.tools20022.repository.entity.Account.Reconciliation, com.tools20022.repository.entity.Account.ManagedAccountProduct);
				derivationComponent_lazy = () -> Arrays.asList(StatementDetails.mmObject(), StatementAndFinancialInstrumentDetails.mmObject(), Account1.mmObject(), Account2.mmObject(), Account4.mmObject(), Account3.mmObject(),
						Account7.mmObject(), SubAccount1.mmObject(), Account9.mmObject(), Account10.mmObject(), Account11.mmObject(), Account13.mmObject(), Account12.mmObject(), SubAccount2.mmObject(),
						IdentificationInformation1.mmObject(), IdentificationModification1.mmObject(), IdentificationInformation2.mmObject(), IdentificationModification2.mmObject(), IdentificationVerification1.mmObject(),
						IdentificationVerification2.mmObject(), AccountingAccount1.mmObject(), CollateralAccountIdentificationType1Choice.mmObject(), CollateralAccount1.mmObject(), SubAccount3.mmObject(), Account8.mmObject(),
						StatementTerm1Choice.mmObject(), StatementAttributes1.mmObject(), Account14.mmObject(), SubAccount4.mmObject(), ATMAccountStatement1.mmObject(), Account18.mmObject(), SubAccount5.mmObject(), Account20.mmObject(),
						CollateralAccount2.mmObject(), CollateralAccountIdentificationType2Choice.mmObject(), Account21.mmObject(), SubAccount6.mmObject(), Account23.mmObject(), Account22.mmObject(), CollateralAccount3.mmObject(),
						CollateralAccountIdentificationType3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}