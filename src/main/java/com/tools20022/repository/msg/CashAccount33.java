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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccount33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a cash entry is made."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashAccount26
 * CashAccount26}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CashAccount33", propOrder = {"settlementCurrency", "identification", "accountOwner", "accountServicer", "accountServicerBranch", "accountOwnerOtherIdentification", "investmentAccountType", "creditDebit",
		"settlementInstructionReason", "cashAccountPurpose", "cashAccountDesignation", "dividendPercentage"})
public class CashAccount33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyCode settlementCurrency;
	/**
	 * Currency associated with the payment instrument.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with the payment instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency associated with the payment instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected AccountIdentificationAndName5 identification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmIdentification
	 * CashAccount26.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> CashAccount26.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountIdentificationAndName5.mmObject();
		}
	};
	protected PartyIdentification70Choice accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountOwner
	 * CashAccount26.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CashAccount33.mmObject();
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
	};
	protected FinancialInstitutionIdentification7Choice accountServicer;
	/**
	 * Party that manages the account on behalf of the account owner, that is
	 * manages the registration and booking of entries on the account,
	 * calculates balances on the account and provides information about the
	 * account.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountServicer
	 * CashAccount26.mmAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountServicer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CashAccount33.mmObject();
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
	};
	protected BranchData accountServicerBranch;
	/**
	 * Information identifying a specific branch of a financial institution.
	 * 
	 * Usage : this component should be used in case the identification
	 * information in the financial institution component does not provide
	 * identification up to branch level.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying a specific branch of a financial institution.\n\nUsage : this component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountServicerBranch
	 * CashAccount26.mmAccountServicerBranch}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicerBranch = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmBranch;
			componentContext_lazy = () -> CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerBranch";
			definition = "Information identifying a specific branch of a financial institution.\n\nUsage : this component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			previousVersion_lazy = () -> CashAccount26.mmAccountServicerBranch;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.BranchData.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification82> accountOwnerOtherIdentification;
	/**
	 * Alternative identification, for example, national registration
	 * identification number, passport number, tax identification number. This
	 * may be an account number used to further identify the beneficial owner,
	 * for example, a Central Provident Fund (CFP) account as required for
	 * Singapore.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerOtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternative identification, for example, national registration identification number, passport number, tax identification number. This may be an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountOwnerOtherIdentification
	 * CashAccount26.mmAccountOwnerOtherIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwnerOtherIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrOthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerOtherIdentification";
			definition = "Alternative identification, for example, national registration identification number, passport number, tax identification number. This may be an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore.";
			previousVersion_lazy = () -> CashAccount26.mmAccountOwnerOtherIdentification;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.GenericIdentification82.mmObject();
		}
	};
	protected AccountType2Choice investmentAccountType;
	/**
	 * Type of account.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmInvestmentAccountType
	 * CashAccount26.mmInvestmentAccountType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestmentAccountType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmRelatedInvestmentAccount;
			componentContext_lazy = () -> CashAccount33.mmObject();
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
	};
	protected CreditDebit3Code creditDebit;
	/**
	 * Specifies if the account is for credits or debits.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if the account is for credits or debits."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreditDebitIndicator;
			componentContext_lazy = () -> CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "CdtDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebit";
			definition = "Specifies if the account is for credits or debits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebit3Code.mmObject();
		}
	};
	protected SettlementInstructionReason1Choice settlementInstructionReason;
	/**
	 * Type of transaction for which the cash account is specified.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of transaction for which the cash account is specified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementInstructionReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmRelatedSettlementInstruction;
			componentContext_lazy = () -> CashAccount33.mmObject();
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
	};
	protected CashAccountType3Choice cashAccountPurpose;
	/**
	 * Purpose of the cash account.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purpose of the cash account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountPurpose = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashAccountType;
			componentContext_lazy = () -> CashAccount33.mmObject();
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
	};
	protected AccountDesignation1Choice cashAccountDesignation;
	/**
	 * Specifies whether the account is the primary or secondary account if
	 * there are two accounts for the same purpose.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountDesignation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the account is the primary or secondary account if there are two accounts for the same purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountDesignation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestorRole.mmCorporateInvestor;
			componentContext_lazy = () -> CashAccount33.mmObject();
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
	};
	protected PercentageBoundedRate dividendPercentage;
	/**
	 * Percentage of the dividend payment not to be reinvested, that is, to be
	 * paid in cash.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the dividend payment not to be reinvested, that is, to be paid in cash."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDividendPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmAnnualTotalDividendRate;
			componentContext_lazy = () -> CashAccount33.mmObject();
			isDerived = false;
			xmlTag = "DvddPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage";
			definition = "Percentage of the dividend payment not to be reinvested, that is, to be paid in cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageBoundedRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CashAccount33.mmSettlementCurrency, CashAccount33.mmIdentification, CashAccount33.mmAccountOwner, CashAccount33.mmAccountServicer, CashAccount33.mmAccountServicerBranch,
						CashAccount33.mmAccountOwnerOtherIdentification, CashAccount33.mmInvestmentAccountType, CashAccount33.mmCreditDebit, CashAccount33.mmSettlementInstructionReason, CashAccount33.mmCashAccountPurpose,
						CashAccount33.mmCashAccountDesignation, CashAccount33.mmDividendPercentage);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccount33";
				definition = "Account to or from which a cash entry is made.";
				previousVersion_lazy = () -> CashAccount26.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttlmCcy", required = true)
	public ActiveCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	@XmlElement(name = "Id", required = true)
	public AccountIdentificationAndName5 getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.msg.AccountIdentificationAndName5 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification70Choice getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(PartyIdentification70Choice accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "AcctSvcr")
	public FinancialInstitutionIdentification7Choice getAccountServicer() {
		return accountServicer;
	}

	public void setAccountServicer(FinancialInstitutionIdentification7Choice accountServicer) {
		this.accountServicer = accountServicer;
	}

	@XmlElement(name = "AcctSvcrBrnch")
	public BranchData getAccountServicerBranch() {
		return accountServicerBranch;
	}

	public void setAccountServicerBranch(com.tools20022.repository.msg.BranchData accountServicerBranch) {
		this.accountServicerBranch = accountServicerBranch;
	}

	@XmlElement(name = "AcctOwnrOthrId")
	public List<GenericIdentification82> getAccountOwnerOtherIdentification() {
		return accountOwnerOtherIdentification;
	}

	public void setAccountOwnerOtherIdentification(List<com.tools20022.repository.msg.GenericIdentification82> accountOwnerOtherIdentification) {
		this.accountOwnerOtherIdentification = accountOwnerOtherIdentification;
	}

	@XmlElement(name = "InvstmtAcctTp")
	public AccountType2Choice getInvestmentAccountType() {
		return investmentAccountType;
	}

	public void setInvestmentAccountType(AccountType2Choice investmentAccountType) {
		this.investmentAccountType = investmentAccountType;
	}

	@XmlElement(name = "CdtDbt")
	public CreditDebit3Code getCreditDebit() {
		return creditDebit;
	}

	public void setCreditDebit(CreditDebit3Code creditDebit) {
		this.creditDebit = creditDebit;
	}

	@XmlElement(name = "SttlmInstrRsn")
	public SettlementInstructionReason1Choice getSettlementInstructionReason() {
		return settlementInstructionReason;
	}

	public void setSettlementInstructionReason(SettlementInstructionReason1Choice settlementInstructionReason) {
		this.settlementInstructionReason = settlementInstructionReason;
	}

	@XmlElement(name = "CshAcctPurp")
	public CashAccountType3Choice getCashAccountPurpose() {
		return cashAccountPurpose;
	}

	public void setCashAccountPurpose(CashAccountType3Choice cashAccountPurpose) {
		this.cashAccountPurpose = cashAccountPurpose;
	}

	@XmlElement(name = "CshAcctDsgnt")
	public AccountDesignation1Choice getCashAccountDesignation() {
		return cashAccountDesignation;
	}

	public void setCashAccountDesignation(AccountDesignation1Choice cashAccountDesignation) {
		this.cashAccountDesignation = cashAccountDesignation;
	}

	@XmlElement(name = "DvddPctg")
	public PercentageBoundedRate getDividendPercentage() {
		return dividendPercentage;
	}

	public void setDividendPercentage(PercentageBoundedRate dividendPercentage) {
		this.dividendPercentage = dividendPercentage;
	}
}