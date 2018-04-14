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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CreditDebit3Code;
import com.tools20022.repository.datatype.PercentageBoundedRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountIdentificationAndName5;
import com.tools20022.repository.msg.BranchData;
import com.tools20022.repository.msg.GenericIdentification82;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account to or from which a cash entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmSettlementCurrency
 * CashAccount33.mmSettlementCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount33#mmIdentification
 * CashAccount33.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountOwner
 * CashAccount33.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountServicer
 * CashAccount33.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountServicerBranch
 * CashAccount33.mmAccountServicerBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountOwnerOtherIdentification
 * CashAccount33.mmAccountOwnerOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmInvestmentAccountType
 * CashAccount33.mmInvestmentAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount33#mmCreditDebit
 * CashAccount33.mmCreditDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmSettlementInstructionReason
 * CashAccount33.mmSettlementInstructionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmCashAccountPurpose
 * CashAccount33.mmCashAccountPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmCashAccountDesignation
 * CashAccount33.mmCashAccountDesignation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmDividendPercentage
 * CashAccount33.mmDividendPercentage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccount33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a cash entry is made."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashAccount26
 * CashAccount26}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccount33", propOrder = {"settlementCurrency", "identification", "accountOwner", "accountServicer", "accountServicerBranch", "accountOwnerOtherIdentification", "investmentAccountType", "creditDebit",
		"settlementInstructionReason", "cashAccountPurpose", "cashAccountDesignation", "dividendPercentage"})
public class CashAccount33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmCcy", required = true)
	protected ActiveCurrencyCode settlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
	 * CurrencyExchange.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with the payment instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount33, ActiveCurrencyCode> mmSettlementCurrency = new MMMessageAttribute<CashAccount33, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency associated with the payment instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(CashAccount33 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(CashAccount33 obj, ActiveCurrencyCode value) {
			obj.setSettlementCurrency(value);
		}
	};
	@XmlElement(name = "Id", required = true)
	protected AccountIdentificationAndName5 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5
	 * AccountIdentificationAndName5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmIdentification
	 * CashAccount26.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount33, AccountIdentificationAndName5> mmIdentification = new MMMessageAttribute<CashAccount33, AccountIdentificationAndName5>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> CashAccount26.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentificationAndName5.mmObject();
		}

		@Override
		public AccountIdentificationAndName5 getValue(CashAccount33 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CashAccount33 obj, AccountIdentificationAndName5 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification70Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountOwner
	 * CashAccount26.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount33, Optional<PartyIdentification70Choice>> mmAccountOwner = new MMMessageAssociationEnd<CashAccount33, Optional<PartyIdentification70Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> CashAccount26.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification70Choice> getValue(CashAccount33 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(CashAccount33 obj, Optional<PartyIdentification70Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected FinancialInstitutionIdentification7Choice accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice
	 * FinancialInstitutionIdentification7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountServicer
	 * CashAccount26.mmAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount33, Optional<FinancialInstitutionIdentification7Choice>> mmAccountServicer = new MMMessageAssociationEnd<CashAccount33, Optional<FinancialInstitutionIdentification7Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			previousVersion_lazy = () -> CashAccount26.mmAccountServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentification7Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification7Choice> getValue(CashAccount33 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(CashAccount33 obj, Optional<FinancialInstitutionIdentification7Choice> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcrBrnch")
	protected BranchData accountServicerBranch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BranchData
	 * BranchData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmBranch
	 * Organisation.mmBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrBrnch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountServicerBranch
	 * CashAccount26.mmAccountServicerBranch}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount33, Optional<BranchData>> mmAccountServicerBranch = new MMMessageAttribute<CashAccount33, Optional<BranchData>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmBranch;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerBranch";
			definition = "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			previousVersion_lazy = () -> CashAccount26.mmAccountServicerBranch;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchData.mmObject();
		}

		@Override
		public Optional<BranchData> getValue(CashAccount33 obj) {
			return obj.getAccountServicerBranch();
		}

		@Override
		public void setValue(CashAccount33 obj, Optional<BranchData> value) {
			obj.setAccountServicerBranch(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnrOthrId")
	protected List<GenericIdentification82> accountOwnerOtherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82
	 * GenericIdentification82}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrOthrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerOtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternative identification, for example, national registration identification number, passport number, tax identification number. This may be an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountOwnerOtherIdentification
	 * CashAccount26.mmAccountOwnerOtherIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount33, List<GenericIdentification82>> mmAccountOwnerOtherIdentification = new MMMessageAttribute<CashAccount33, List<GenericIdentification82>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrOthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerOtherIdentification";
			definition = "Alternative identification, for example, national registration identification number, passport number, tax identification number. This may be an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore.";
			previousVersion_lazy = () -> CashAccount26.mmAccountOwnerOtherIdentification;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification82.mmObject();
		}

		@Override
		public List<GenericIdentification82> getValue(CashAccount33 obj) {
			return obj.getAccountOwnerOtherIdentification();
		}

		@Override
		public void setValue(CashAccount33 obj, List<GenericIdentification82> value) {
			obj.setAccountOwnerOtherIdentification(value);
		}
	};
	@XmlElement(name = "InvstmtAcctTp")
	protected AccountType2Choice investmentAccountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountType2Choice
	 * AccountType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedInvestmentAccount
	 * CashAccount.mmRelatedInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmInvestmentAccountType
	 * CashAccount26.mmInvestmentAccountType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount33, Optional<AccountType2Choice>> mmInvestmentAccountType = new MMMessageAttribute<CashAccount33, Optional<AccountType2Choice>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmRelatedInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountType";
			definition = "Type of account.";
			previousVersion_lazy = () -> CashAccount26.mmInvestmentAccountType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountType2Choice.mmObject();
		}

		@Override
		public Optional<AccountType2Choice> getValue(CashAccount33 obj) {
			return obj.getInvestmentAccountType();
		}

		@Override
		public void setValue(CashAccount33 obj, Optional<AccountType2Choice> value) {
			obj.setInvestmentAccountType(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtDbt")
	protected CreditDebit3Code creditDebit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebit3Code
	 * CreditDebit3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreditDebitIndicator
	 * PaymentExecution.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if the account is for credits or debits."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount33, Optional<CreditDebit3Code>> mmCreditDebit = new MMMessageAttribute<CashAccount33, Optional<CreditDebit3Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "CdtDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebit";
			definition = "Specifies if the account is for credits or debits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebit3Code.mmObject();
		}

		@Override
		public Optional<CreditDebit3Code> getValue(CashAccount33 obj) {
			return obj.getCreditDebit();
		}

		@Override
		public void setValue(CashAccount33 obj, Optional<CreditDebit3Code> value) {
			obj.setCreditDebit(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmInstrRsn")
	protected SettlementInstructionReason1Choice settlementInstructionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementInstructionReason1Choice
	 * SettlementInstructionReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedSettlementInstruction
	 * CashAccount.mmRelatedSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInstrRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of transaction for which the cash account is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount33, Optional<SettlementInstructionReason1Choice>> mmSettlementInstructionReason = new MMMessageAssociationEnd<CashAccount33, Optional<SettlementInstructionReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmRelatedSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionReason";
			definition = "Type of transaction for which the cash account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementInstructionReason1Choice.mmObject();
		}

		@Override
		public Optional<SettlementInstructionReason1Choice> getValue(CashAccount33 obj) {
			return obj.getSettlementInstructionReason();
		}

		@Override
		public void setValue(CashAccount33 obj, Optional<SettlementInstructionReason1Choice> value) {
			obj.setSettlementInstructionReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcctPurp")
	protected CashAccountType3Choice cashAccountPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountType3Choice
	 * CashAccountType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountType
	 * CashAccount.mmCashAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctPurp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purpose of the cash account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount33, Optional<CashAccountType3Choice>> mmCashAccountPurpose = new MMMessageAssociationEnd<CashAccount33, Optional<CashAccountType3Choice>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "CshAcctPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountPurpose";
			definition = "Purpose of the cash account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountType3Choice.mmObject();
		}

		@Override
		public Optional<CashAccountType3Choice> getValue(CashAccount33 obj) {
			return obj.getCashAccountPurpose();
		}

		@Override
		public void setValue(CashAccount33 obj, Optional<CashAccountType3Choice> value) {
			obj.setCashAccountPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcctDsgnt")
	protected AccountDesignation1Choice cashAccountDesignation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountDesignation1Choice
	 * AccountDesignation1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmCorporateInvestor
	 * InvestorRole.mmCorporateInvestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctDsgnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountDesignation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the account is the primary or secondary account if there are two accounts for the same purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount33, Optional<AccountDesignation1Choice>> mmCashAccountDesignation = new MMMessageAssociationEnd<CashAccount33, Optional<AccountDesignation1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestorRole.mmCorporateInvestor;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "CshAcctDsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountDesignation";
			definition = "Specifies whether the account is the primary or secondary account if there are two accounts for the same purpose.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountDesignation1Choice.mmObject();
		}

		@Override
		public Optional<AccountDesignation1Choice> getValue(CashAccount33 obj) {
			return obj.getCashAccountDesignation();
		}

		@Override
		public void setValue(CashAccount33 obj, Optional<AccountDesignation1Choice> value) {
			obj.setCashAccountDesignation(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddPctg")
	protected PercentageBoundedRate dividendPercentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageBoundedRate
	 * PercentageBoundedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmAnnualTotalDividendRate
	 * Dividend.mmAnnualTotalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddPctg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the dividend payment not to be reinvested, that is, to be paid in cash."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount33, Optional<PercentageBoundedRate>> mmDividendPercentage = new MMMessageAttribute<CashAccount33, Optional<PercentageBoundedRate>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmAnnualTotalDividendRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "DvddPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage";
			definition = "Percentage of the dividend payment not to be reinvested, that is, to be paid in cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageBoundedRate.mmObject();
		}

		@Override
		public Optional<PercentageBoundedRate> getValue(CashAccount33 obj) {
			return obj.getDividendPercentage();
		}

		@Override
		public void setValue(CashAccount33 obj, Optional<PercentageBoundedRate> value) {
			obj.setDividendPercentage(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount33.mmSettlementCurrency, com.tools20022.repository.msg.CashAccount33.mmIdentification,
						com.tools20022.repository.msg.CashAccount33.mmAccountOwner, com.tools20022.repository.msg.CashAccount33.mmAccountServicer, com.tools20022.repository.msg.CashAccount33.mmAccountServicerBranch,
						com.tools20022.repository.msg.CashAccount33.mmAccountOwnerOtherIdentification, com.tools20022.repository.msg.CashAccount33.mmInvestmentAccountType, com.tools20022.repository.msg.CashAccount33.mmCreditDebit,
						com.tools20022.repository.msg.CashAccount33.mmSettlementInstructionReason, com.tools20022.repository.msg.CashAccount33.mmCashAccountPurpose, com.tools20022.repository.msg.CashAccount33.mmCashAccountDesignation,
						com.tools20022.repository.msg.CashAccount33.mmDividendPercentage);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccount33";
				definition = "Account to or from which a cash entry is made.";
				previousVersion_lazy = () -> CashAccount26.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public CashAccount33 setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = Objects.requireNonNull(settlementCurrency);
		return this;
	}

	public AccountIdentificationAndName5 getIdentification() {
		return identification;
	}

	public CashAccount33 setIdentification(AccountIdentificationAndName5 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<PartyIdentification70Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CashAccount33 setAccountOwner(PartyIdentification70Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<FinancialInstitutionIdentification7Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public CashAccount33 setAccountServicer(FinancialInstitutionIdentification7Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<BranchData> getAccountServicerBranch() {
		return accountServicerBranch == null ? Optional.empty() : Optional.of(accountServicerBranch);
	}

	public CashAccount33 setAccountServicerBranch(BranchData accountServicerBranch) {
		this.accountServicerBranch = accountServicerBranch;
		return this;
	}

	public List<GenericIdentification82> getAccountOwnerOtherIdentification() {
		return accountOwnerOtherIdentification == null ? accountOwnerOtherIdentification = new ArrayList<>() : accountOwnerOtherIdentification;
	}

	public CashAccount33 setAccountOwnerOtherIdentification(List<GenericIdentification82> accountOwnerOtherIdentification) {
		this.accountOwnerOtherIdentification = Objects.requireNonNull(accountOwnerOtherIdentification);
		return this;
	}

	public Optional<AccountType2Choice> getInvestmentAccountType() {
		return investmentAccountType == null ? Optional.empty() : Optional.of(investmentAccountType);
	}

	public CashAccount33 setInvestmentAccountType(AccountType2Choice investmentAccountType) {
		this.investmentAccountType = investmentAccountType;
		return this;
	}

	public Optional<CreditDebit3Code> getCreditDebit() {
		return creditDebit == null ? Optional.empty() : Optional.of(creditDebit);
	}

	public CashAccount33 setCreditDebit(CreditDebit3Code creditDebit) {
		this.creditDebit = creditDebit;
		return this;
	}

	public Optional<SettlementInstructionReason1Choice> getSettlementInstructionReason() {
		return settlementInstructionReason == null ? Optional.empty() : Optional.of(settlementInstructionReason);
	}

	public CashAccount33 setSettlementInstructionReason(SettlementInstructionReason1Choice settlementInstructionReason) {
		this.settlementInstructionReason = settlementInstructionReason;
		return this;
	}

	public Optional<CashAccountType3Choice> getCashAccountPurpose() {
		return cashAccountPurpose == null ? Optional.empty() : Optional.of(cashAccountPurpose);
	}

	public CashAccount33 setCashAccountPurpose(CashAccountType3Choice cashAccountPurpose) {
		this.cashAccountPurpose = cashAccountPurpose;
		return this;
	}

	public Optional<AccountDesignation1Choice> getCashAccountDesignation() {
		return cashAccountDesignation == null ? Optional.empty() : Optional.of(cashAccountDesignation);
	}

	public CashAccount33 setCashAccountDesignation(AccountDesignation1Choice cashAccountDesignation) {
		this.cashAccountDesignation = cashAccountDesignation;
		return this;
	}

	public Optional<PercentageBoundedRate> getDividendPercentage() {
		return dividendPercentage == null ? Optional.empty() : Optional.of(dividendPercentage);
	}

	public CashAccount33 setDividendPercentage(PercentageBoundedRate dividendPercentage) {
		this.dividendPercentage = dividendPercentage;
		return this;
	}
}