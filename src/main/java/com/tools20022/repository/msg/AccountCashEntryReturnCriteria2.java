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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.RequestedIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the criteria used to report on the cash entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2#mmEntryReferenceIndicator
 * AccountCashEntryReturnCriteria2.mmEntryReferenceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2#mmAccountTypeIndicator
 * AccountCashEntryReturnCriteria2.mmAccountTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2#mmEntryAmountIndicator
 * AccountCashEntryReturnCriteria2.mmEntryAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2#mmAccountCurrencyIndicator
 * AccountCashEntryReturnCriteria2.mmAccountCurrencyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2#mmEntryStatusIndicator
 * AccountCashEntryReturnCriteria2.mmEntryStatusIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2#mmEntryDateIndicator
 * AccountCashEntryReturnCriteria2.mmEntryDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2#mmAccountServicerIndicator
 * AccountCashEntryReturnCriteria2.mmAccountServicerIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2#mmAccountOwnerIndicator
 * AccountCashEntryReturnCriteria2.mmAccountOwnerIndicator}</li>
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
 * "AccountCashEntryReturnCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on the cash entry."</li>
 * </ul>
 */
public class AccountCashEntryReturnCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator entryReferenceIndicator;
	/**
	 * Indicates whether the entry reference is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2
	 * AccountCashEntryReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryRefInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryReferenceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the entry reference is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryReferenceIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "NtryRefInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryReferenceIndicator";
			definition = "Indicates whether the entry reference is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator accountTypeIndicator;
	/**
	 * Indicates whether the account type is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2
	 * AccountCashEntryReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctTpInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTypeIndicator";
			definition = "Indicates whether the account type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator entryAmountIndicator;
	/**
	 * Indicates whether the entry amount is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2
	 * AccountCashEntryReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the entry amount is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "NtryAmtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmountIndicator";
			definition = "Indicates whether the entry amount is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator accountCurrencyIndicator;
	/**
	 * Indicates whether the account currency is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2
	 * AccountCashEntryReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctCcyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountCurrencyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account currency is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountCurrencyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctCcyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountCurrencyIndicator";
			definition = "Indicates whether the account currency is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator entryStatusIndicator;
	/**
	 * Indicates whether the entry status is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2
	 * AccountCashEntryReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryStsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryStatusIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the entry status is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryStatusIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "NtryStsInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryStatusIndicator";
			definition = "Indicates whether the entry status is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator entryDateIndicator;
	/**
	 * Indicates whether the entry date is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2
	 * AccountCashEntryReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryDtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the entry date is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "NtryDtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDateIndicator";
			definition = "Indicates whether the entry date is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator accountServicerIndicator;
	/**
	 * Indicates whether the account servicer is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2
	 * AccountCashEntryReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSrcrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account servicer is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicerIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctSrcrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIndicator";
			definition = "Indicates whether the account servicer is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator accountOwnerIndicator;
	/**
	 * Indicates whether the account owner is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria2
	 * AccountCashEntryReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account owner is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwnerIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerIndicator";
			definition = "Indicates whether the account owner is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmEntryReferenceIndicator, com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmAccountTypeIndicator,
						com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmEntryAmountIndicator, com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmAccountCurrencyIndicator,
						com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmEntryStatusIndicator, com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmEntryDateIndicator,
						com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmAccountServicerIndicator, com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmAccountOwnerIndicator);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountCashEntryReturnCriteria2";
				definition = "Defines the criteria used to report on the cash entry.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getEntryReferenceIndicator() {
		return entryReferenceIndicator;
	}

	public void setEntryReferenceIndicator(RequestedIndicator entryReferenceIndicator) {
		this.entryReferenceIndicator = entryReferenceIndicator;
	}

	public RequestedIndicator getAccountTypeIndicator() {
		return accountTypeIndicator;
	}

	public void setAccountTypeIndicator(RequestedIndicator accountTypeIndicator) {
		this.accountTypeIndicator = accountTypeIndicator;
	}

	public RequestedIndicator getEntryAmountIndicator() {
		return entryAmountIndicator;
	}

	public void setEntryAmountIndicator(RequestedIndicator entryAmountIndicator) {
		this.entryAmountIndicator = entryAmountIndicator;
	}

	public RequestedIndicator getAccountCurrencyIndicator() {
		return accountCurrencyIndicator;
	}

	public void setAccountCurrencyIndicator(RequestedIndicator accountCurrencyIndicator) {
		this.accountCurrencyIndicator = accountCurrencyIndicator;
	}

	public RequestedIndicator getEntryStatusIndicator() {
		return entryStatusIndicator;
	}

	public void setEntryStatusIndicator(RequestedIndicator entryStatusIndicator) {
		this.entryStatusIndicator = entryStatusIndicator;
	}

	public RequestedIndicator getEntryDateIndicator() {
		return entryDateIndicator;
	}

	public void setEntryDateIndicator(RequestedIndicator entryDateIndicator) {
		this.entryDateIndicator = entryDateIndicator;
	}

	public RequestedIndicator getAccountServicerIndicator() {
		return accountServicerIndicator;
	}

	public void setAccountServicerIndicator(RequestedIndicator accountServicerIndicator) {
		this.accountServicerIndicator = accountServicerIndicator;
	}

	public RequestedIndicator getAccountOwnerIndicator() {
		return accountOwnerIndicator;
	}

	public void setAccountOwnerIndicator(RequestedIndicator accountOwnerIndicator) {
		this.accountOwnerIndicator = accountOwnerIndicator;
	}
}