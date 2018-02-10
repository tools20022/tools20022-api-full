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
import com.tools20022.repository.choice.AccountIdentification31Choice;
import com.tools20022.repository.choice.PartyIdentification72Choice;
import com.tools20022.repository.codeset.AccountChoiceMethod1Code;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CardAccountType2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Customer account information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmSelectionMethod
 * CardAccount4.mmSelectionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmSelectedAccountType
 * CardAccount4.mmSelectedAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmAccountName
 * CardAccount4.mmAccountName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmAccountOwner
 * CardAccount4.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmCurrency
 * CardAccount4.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmAccountIdentifier
 * CardAccount4.mmAccountIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmCreditReference
 * CardAccount4.mmCreditReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmServicer
 * CardAccount4.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmBalance
 * CardAccount4.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmBalanceDisplayFlag
 * CardAccount4.mmBalanceDisplayFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmDefaultAccountIndicator
 * CardAccount4.mmDefaultAccountIndicator}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardAccount4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Customer account information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5 CardAccount5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CardAccount3
 * CardAccount3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardAccount4", propOrder = {"selectionMethod", "selectedAccountType", "accountName", "accountOwner", "currency", "accountIdentifier", "creditReference", "servicer", "balance", "balanceDisplayFlag",
		"defaultAccountIndicator"})
public class CardAccount4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SelctnMtd")
	protected AccountChoiceMethod1Code selectionMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code
	 * AccountChoiceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectionMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used by the cardholder and the terminal for the choice of the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount5#mmSelectionMethod
	 * CardAccount5.mmSelectionMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount3#mmSelectionMethod
	 * CardAccount3.mmSelectionMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSelectionMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "SelctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectionMethod";
			definition = "Method used by the cardholder and the terminal for the choice of the account.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount5.mmSelectionMethod);
			previousVersion_lazy = () -> CardAccount3.mmSelectionMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountChoiceMethod1Code.mmObject();
		}
	};
	@XmlElement(name = "SelctdAcctTp")
	protected CardAccountType2Code selectedAccountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmType
	 * Account.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctdAcctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectedAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cardholder account used for the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmAccountType
	 * CardAccount6.mmAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount5#mmSelectedAccountType
	 * CardAccount5.mmSelectedAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount3#mmSelectedAccountType
	 * CardAccount3.mmSelectedAccountType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSelectedAccountType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "SelctdAcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectedAccountType";
			definition = "Type of cardholder account used for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount6.mmAccountType, CardAccount5.mmSelectedAccountType);
			previousVersion_lazy = () -> CardAccount3.mmSelectedAccountType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	@XmlElement(name = "AcctNm")
	protected Max70Text accountName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.\r\nUsage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmAccountName
	 * CardAccount6.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5#mmAccountName
	 * CardAccount5.mmAccountName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount3#mmAccountName
	 * CardAccount3.mmAccountName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "AcctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountName";
			definition = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.\r\nUsage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount6.mmAccountName, CardAccount5.mmAccountName);
			previousVersion_lazy = () -> CardAccount3.mmAccountName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected NameAndAddress3 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress3
	 * NameAndAddress3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountOwnerRole
	 * AccountOwnerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountOwnerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress3.mmObject();
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveCurrencyCode currency;
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
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the currency in which the account is held."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmCurrency
	 * CardAccount6.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5#mmCurrency
	 * CardAccount5.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount3#mmCurrency
	 * CardAccount3.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Identification of the currency in which the account is held.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount6.mmCurrency, CardAccount5.mmCurrency);
			previousVersion_lazy = () -> CardAccount3.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "AcctIdr")
	protected AccountIdentification31Choice accountIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice
	 * AccountIdentification31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of the account, as assigned by the account servicer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount6#mmAccountIdentifier
	 * CardAccount6.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount5#mmAccountIdentifier
	 * CardAccount5.mmAccountIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount3#mmAccountIdentifier
	 * CardAccount3.mmAccountIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentifier = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "AcctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentifier";
			definition = "Unique identifier of the account, as assigned by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount6.mmAccountIdentifier, CardAccount5.mmAccountIdentifier);
			previousVersion_lazy = () -> CardAccount3.mmAccountIdentifier;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification31Choice.mmObject();
		}
	};
	@XmlElement(name = "CdtRef")
	protected Max35Text creditReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Internal account reference in case of credit account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount6#mmCreditReference
	 * CardAccount6.mmCreditReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "CdtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditReference";
			definition = "Internal account reference in case of credit account.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount6.mmCreditReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Svcr")
	protected PartyIdentification72Choice servicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
	 * PartyIdentification72Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountServicerRole
	 * AccountServicerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Svcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Servicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmServicer
	 * CardAccount6.mmServicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5#mmServicer
	 * CardAccount5.mmServicer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount3#mmServicer
	 * CardAccount3.mmServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServicer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountServicerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "Svcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Servicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount6.mmServicer, CardAccount5.mmServicer);
			previousVersion_lazy = () -> CardAccount3.mmServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification72Choice.mmObject();
		}
	};
	@XmlElement(name = "Bal")
	protected AmountAndDirection43 balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection43
	 * AmountAndDirection43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBalance
	 * Account.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmBalance
	 * CardAccount6.mmBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Balance of the account.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount6.mmBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection43.mmObject();
		}
	};
	@XmlElement(name = "BalDispFlg")
	protected TrueFalseIndicator balanceDisplayFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalDispFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceDisplayFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the balance must be displayed to the customer on the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceDisplayFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "BalDispFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceDisplayFlag";
			definition = "Indicates if the balance must be displayed to the customer on the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "DfltAcctInd")
	protected TrueFalseIndicator defaultAccountIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltAcctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this is the default account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDefaultAccountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAccount4.mmObject();
			isDerived = false;
			xmlTag = "DfltAcctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAccountIndicator";
			definition = "Indicates if this is the default account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardAccount4.mmSelectionMethod, com.tools20022.repository.msg.CardAccount4.mmSelectedAccountType,
						com.tools20022.repository.msg.CardAccount4.mmAccountName, com.tools20022.repository.msg.CardAccount4.mmAccountOwner, com.tools20022.repository.msg.CardAccount4.mmCurrency,
						com.tools20022.repository.msg.CardAccount4.mmAccountIdentifier, com.tools20022.repository.msg.CardAccount4.mmCreditReference, com.tools20022.repository.msg.CardAccount4.mmServicer,
						com.tools20022.repository.msg.CardAccount4.mmBalance, com.tools20022.repository.msg.CardAccount4.mmBalanceDisplayFlag, com.tools20022.repository.msg.CardAccount4.mmDefaultAccountIndicator);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardAccount4";
				definition = "Customer account information.";
				nextVersions_lazy = () -> Arrays.asList(CardAccount6.mmObject(), CardAccount5.mmObject());
				previousVersion_lazy = () -> CardAccount3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AccountChoiceMethod1Code> getSelectionMethod() {
		return selectionMethod == null ? Optional.empty() : Optional.of(selectionMethod);
	}

	public CardAccount4 setSelectionMethod(AccountChoiceMethod1Code selectionMethod) {
		this.selectionMethod = selectionMethod;
		return this;
	}

	public Optional<CardAccountType2Code> getSelectedAccountType() {
		return selectedAccountType == null ? Optional.empty() : Optional.of(selectedAccountType);
	}

	public CardAccount4 setSelectedAccountType(CardAccountType2Code selectedAccountType) {
		this.selectedAccountType = selectedAccountType;
		return this;
	}

	public Optional<Max70Text> getAccountName() {
		return accountName == null ? Optional.empty() : Optional.of(accountName);
	}

	public CardAccount4 setAccountName(Max70Text accountName) {
		this.accountName = accountName;
		return this;
	}

	public Optional<NameAndAddress3> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CardAccount4 setAccountOwner(com.tools20022.repository.msg.NameAndAddress3 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public CardAccount4 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<AccountIdentification31Choice> getAccountIdentifier() {
		return accountIdentifier == null ? Optional.empty() : Optional.of(accountIdentifier);
	}

	public CardAccount4 setAccountIdentifier(AccountIdentification31Choice accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
		return this;
	}

	public Optional<Max35Text> getCreditReference() {
		return creditReference == null ? Optional.empty() : Optional.of(creditReference);
	}

	public CardAccount4 setCreditReference(Max35Text creditReference) {
		this.creditReference = creditReference;
		return this;
	}

	public Optional<PartyIdentification72Choice> getServicer() {
		return servicer == null ? Optional.empty() : Optional.of(servicer);
	}

	public CardAccount4 setServicer(PartyIdentification72Choice servicer) {
		this.servicer = servicer;
		return this;
	}

	public Optional<AmountAndDirection43> getBalance() {
		return balance == null ? Optional.empty() : Optional.of(balance);
	}

	public CardAccount4 setBalance(com.tools20022.repository.msg.AmountAndDirection43 balance) {
		this.balance = balance;
		return this;
	}

	public Optional<TrueFalseIndicator> getBalanceDisplayFlag() {
		return balanceDisplayFlag == null ? Optional.empty() : Optional.of(balanceDisplayFlag);
	}

	public CardAccount4 setBalanceDisplayFlag(TrueFalseIndicator balanceDisplayFlag) {
		this.balanceDisplayFlag = balanceDisplayFlag;
		return this;
	}

	public Optional<TrueFalseIndicator> getDefaultAccountIndicator() {
		return defaultAccountIndicator == null ? Optional.empty() : Optional.of(defaultAccountIndicator);
	}

	public CardAccount4 setDefaultAccountIndicator(TrueFalseIndicator defaultAccountIndicator) {
		this.defaultAccountIndicator = defaultAccountIndicator;
		return this;
	}
}