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
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Customer account information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#mmSelectionMethod
 * CardAccount3.mmSelectionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount3#mmSelectedAccountType
 * CardAccount3.mmSelectedAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#mmAccountName
 * CardAccount3.mmAccountName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#mmAccountOwner
 * CardAccount3.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#mmCurrency
 * CardAccount3.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount3#mmAccountIdentifier
 * CardAccount3.mmAccountIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#mmServicer
 * CardAccount3.mmServicer}</li>
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
 * "CardAccount3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Customer account information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7 CardAccount7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CardAccount1
 * CardAccount1}</li>
 * </ul>
 */
public class CardAccount3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountChoiceMethod1Code selectionMethod;
	/**
	 * Method used by the cardholder and the terminal for the choice of the
	 * account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount3 CardAccount3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmSelectionMethod
	 * CardAccount4.mmSelectionMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount7#mmSelectionMethod
	 * CardAccount7.mmSelectionMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#mmSelectionMethod
	 * CardAccount1.mmSelectionMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSelectionMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardAccount3.mmObject();
			isDerived = false;
			xmlTag = "SelctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectionMethod";
			definition = "Method used by the cardholder and the terminal for the choice of the account.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount4.mmSelectionMethod, CardAccount7.mmSelectionMethod);
			previousVersion_lazy = () -> CardAccount1.mmSelectionMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountChoiceMethod1Code.mmObject();
		}
	};
	protected CardAccountType2Code selectedAccountType;
	/**
	 * Type of cardholder account used for the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount3 CardAccount3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmSelectedAccountType
	 * CardAccount4.mmSelectedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount7#mmSelectedAccountType
	 * CardAccount7.mmSelectedAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#mmSelectedAccountType
	 * CardAccount1.mmSelectedAccountType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSelectedAccountType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmType;
			componentContext_lazy = () -> CardAccount3.mmObject();
			isDerived = false;
			xmlTag = "SelctdAcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectedAccountType";
			definition = "Type of cardholder account used for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount4.mmSelectedAccountType, CardAccount7.mmSelectedAccountType);
			previousVersion_lazy = () -> CardAccount1.mmSelectedAccountType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	protected Max70Text accountName;
	/**
	 * Name of the account, as assigned by the account servicing institution, in
	 * agreement with the account owner in order to provide an additional means
	 * of identification of the account.<br>
	 * Usage: The account name is different from the account owner name. The
	 * account name is used in certain user communities to provide a means of
	 * identifying the account, in addition to the account owner's identity and
	 * the account number.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount3 CardAccount3}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmAccountName
	 * CardAccount4.mmAccountName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#mmAccountName
	 * CardAccount7.mmAccountName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#mmAccountName
	 * CardAccount1.mmAccountName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> CardAccount3.mmObject();
			isDerived = false;
			xmlTag = "AcctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountName";
			definition = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.\r\nUsage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount4.mmAccountName, CardAccount7.mmAccountName);
			previousVersion_lazy = () -> CardAccount1.mmAccountName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected NameAndAddress3 accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount3 CardAccount3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount7#mmAccountOwner
	 * CardAccount7.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#mmAccountOwner
	 * CardAccount1.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountOwnerRole.mmObject();
			componentContext_lazy = () -> CardAccount3.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount7.mmAccountOwner);
			previousVersion_lazy = () -> CardAccount1.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress3.mmObject();
		}
	};
	protected ActiveCurrencyCode currency;
	/**
	 * Identification of the currency in which the account is held.
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
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount3 CardAccount3}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmCurrency
	 * CardAccount4.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#mmCurrency
	 * CardAccount7.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> CardAccount3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Identification of the currency in which the account is held.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount4.mmCurrency, CardAccount7.mmCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected AccountIdentification31Choice accountIdentifier;
	/**
	 * Unique identifier of the account, as assigned by the account servicer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount3 CardAccount3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount4#mmAccountIdentifier
	 * CardAccount4.mmAccountIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAccount7#mmAccountIdentifier
	 * CardAccount7.mmAccountIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#mmAccountIdentifier
	 * CardAccount1.mmAccountIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentifier = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> CardAccount3.mmObject();
			isDerived = false;
			xmlTag = "AcctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentifier";
			definition = "Unique identifier of the account, as assigned by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount4.mmAccountIdentifier, CardAccount7.mmAccountIdentifier);
			previousVersion_lazy = () -> CardAccount1.mmAccountIdentifier;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification31Choice.mmObject();
		}
	};
	protected PartyIdentification72Choice servicer;
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
	 * {@linkplain com.tools20022.repository.msg.CardAccount3 CardAccount3}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmServicer
	 * CardAccount4.mmServicer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#mmServicer
	 * CardAccount7.mmServicer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount1#mmServicer
	 * CardAccount1.mmServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServicer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountServicerRole.mmObject();
			componentContext_lazy = () -> CardAccount3.mmObject();
			isDerived = false;
			xmlTag = "Svcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Servicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			nextVersions_lazy = () -> Arrays.asList(CardAccount4.mmServicer, CardAccount7.mmServicer);
			previousVersion_lazy = () -> CardAccount1.mmServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification72Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardAccount3.mmSelectionMethod, CardAccount3.mmSelectedAccountType, CardAccount3.mmAccountName, CardAccount3.mmAccountOwner, CardAccount3.mmCurrency,
						CardAccount3.mmAccountIdentifier, CardAccount3.mmServicer);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardAccount3";
				definition = "Customer account information.";
				nextVersions_lazy = () -> Arrays.asList(CardAccount4.mmObject(), CardAccount7.mmObject());
				previousVersion_lazy = () -> CardAccount1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AccountChoiceMethod1Code getSelectionMethod() {
		return selectionMethod;
	}

	public void setSelectionMethod(AccountChoiceMethod1Code selectionMethod) {
		this.selectionMethod = selectionMethod;
	}

	public CardAccountType2Code getSelectedAccountType() {
		return selectedAccountType;
	}

	public void setSelectedAccountType(CardAccountType2Code selectedAccountType) {
		this.selectedAccountType = selectedAccountType;
	}

	public Max70Text getAccountName() {
		return accountName;
	}

	public void setAccountName(Max70Text accountName) {
		this.accountName = accountName;
	}

	public NameAndAddress3 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.NameAndAddress3 accountOwner) {
		this.accountOwner = accountOwner;
	}

	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
	}

	public AccountIdentification31Choice getAccountIdentifier() {
		return accountIdentifier;
	}

	public void setAccountIdentifier(AccountIdentification31Choice accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}

	public PartyIdentification72Choice getServicer() {
		return servicer;
	}

	public void setServicer(PartyIdentification72Choice servicer) {
		this.servicer = servicer;
	}
}