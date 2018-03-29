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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = November 11, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountCashEntryReturnCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on the cash entry."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria3
 * AccountCashEntryReturnCriteria3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountCashEntryReturnCriteria2", propOrder = {"entryReferenceIndicator", "accountTypeIndicator", "entryAmountIndicator", "accountCurrencyIndicator", "entryStatusIndicator", "entryDateIndicator",
		"accountServicerIndicator", "accountOwnerIndicator"})
public class AccountCashEntryReturnCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtryRefInd")
	protected RequestedIndicator entryReferenceIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria3#mmEntryReferenceIndicator
	 * AccountCashEntryReturnCriteria3.mmEntryReferenceIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>> mmEntryReferenceIndicator = new MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "NtryRefInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryReferenceIndicator";
			definition = "Indicates whether the entry reference is requested.";
			nextVersions_lazy = () -> Arrays.asList(AccountCashEntryReturnCriteria3.mmEntryReferenceIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(AccountCashEntryReturnCriteria2 obj) {
			return obj.getEntryReferenceIndicator();
		}

		@Override
		public void setValue(AccountCashEntryReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setEntryReferenceIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctTpInd")
	protected RequestedIndicator accountTypeIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria3#mmAccountTypeIndicator
	 * AccountCashEntryReturnCriteria3.mmAccountTypeIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>> mmAccountTypeIndicator = new MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctTpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTypeIndicator";
			definition = "Indicates whether the account type is requested.";
			nextVersions_lazy = () -> Arrays.asList(AccountCashEntryReturnCriteria3.mmAccountTypeIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(AccountCashEntryReturnCriteria2 obj) {
			return obj.getAccountTypeIndicator();
		}

		@Override
		public void setValue(AccountCashEntryReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setAccountTypeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NtryAmtInd")
	protected RequestedIndicator entryAmountIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria3#mmEntryAmountIndicator
	 * AccountCashEntryReturnCriteria3.mmEntryAmountIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>> mmEntryAmountIndicator = new MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "NtryAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmountIndicator";
			definition = "Indicates whether the entry amount is requested.";
			nextVersions_lazy = () -> Arrays.asList(AccountCashEntryReturnCriteria3.mmEntryAmountIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(AccountCashEntryReturnCriteria2 obj) {
			return obj.getEntryAmountIndicator();
		}

		@Override
		public void setValue(AccountCashEntryReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setEntryAmountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctCcyInd")
	protected RequestedIndicator accountCurrencyIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria3#mmAccountCurrencyIndicator
	 * AccountCashEntryReturnCriteria3.mmAccountCurrencyIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>> mmAccountCurrencyIndicator = new MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctCcyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountCurrencyIndicator";
			definition = "Indicates whether the account currency is requested.";
			nextVersions_lazy = () -> Arrays.asList(AccountCashEntryReturnCriteria3.mmAccountCurrencyIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(AccountCashEntryReturnCriteria2 obj) {
			return obj.getAccountCurrencyIndicator();
		}

		@Override
		public void setValue(AccountCashEntryReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setAccountCurrencyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NtryStsInd")
	protected RequestedIndicator entryStatusIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria3#mmEntryStatusIndicator
	 * AccountCashEntryReturnCriteria3.mmEntryStatusIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>> mmEntryStatusIndicator = new MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "NtryStsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryStatusIndicator";
			definition = "Indicates whether the entry status is requested.";
			nextVersions_lazy = () -> Arrays.asList(AccountCashEntryReturnCriteria3.mmEntryStatusIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(AccountCashEntryReturnCriteria2 obj) {
			return obj.getEntryStatusIndicator();
		}

		@Override
		public void setValue(AccountCashEntryReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setEntryStatusIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NtryDtInd")
	protected RequestedIndicator entryDateIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria3#mmEntryDateIndicator
	 * AccountCashEntryReturnCriteria3.mmEntryDateIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>> mmEntryDateIndicator = new MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "NtryDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDateIndicator";
			definition = "Indicates whether the entry date is requested.";
			nextVersions_lazy = () -> Arrays.asList(AccountCashEntryReturnCriteria3.mmEntryDateIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(AccountCashEntryReturnCriteria2 obj) {
			return obj.getEntryDateIndicator();
		}

		@Override
		public void setValue(AccountCashEntryReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setEntryDateIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSrcrInd")
	protected RequestedIndicator accountServicerIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria3#mmAccountServicerIndicator
	 * AccountCashEntryReturnCriteria3.mmAccountServicerIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>> mmAccountServicerIndicator = new MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctSrcrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIndicator";
			definition = "Indicates whether the account servicer is requested.";
			nextVersions_lazy = () -> Arrays.asList(AccountCashEntryReturnCriteria3.mmAccountServicerIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(AccountCashEntryReturnCriteria2 obj) {
			return obj.getAccountServicerIndicator();
		}

		@Override
		public void setValue(AccountCashEntryReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setAccountServicerIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnrInd")
	protected RequestedIndicator accountOwnerIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryReturnCriteria3#mmAccountOwnerIndicator
	 * AccountCashEntryReturnCriteria3.mmAccountOwnerIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>> mmAccountOwnerIndicator = new MMMessageAttribute<AccountCashEntryReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerIndicator";
			definition = "Indicates whether the account owner is requested.";
			nextVersions_lazy = () -> Arrays.asList(AccountCashEntryReturnCriteria3.mmAccountOwnerIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(AccountCashEntryReturnCriteria2 obj) {
			return obj.getAccountOwnerIndicator();
		}

		@Override
		public void setValue(AccountCashEntryReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setAccountOwnerIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmEntryReferenceIndicator, com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmAccountTypeIndicator,
						com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmEntryAmountIndicator, com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmAccountCurrencyIndicator,
						com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmEntryStatusIndicator, com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmEntryDateIndicator,
						com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmAccountServicerIndicator, com.tools20022.repository.msg.AccountCashEntryReturnCriteria2.mmAccountOwnerIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("November 11, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AccountCashEntryReturnCriteria2";
				definition = "Defines the criteria used to report on the cash entry.";
				nextVersions_lazy = () -> Arrays.asList(AccountCashEntryReturnCriteria3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getEntryReferenceIndicator() {
		return entryReferenceIndicator == null ? Optional.empty() : Optional.of(entryReferenceIndicator);
	}

	public AccountCashEntryReturnCriteria2 setEntryReferenceIndicator(RequestedIndicator entryReferenceIndicator) {
		this.entryReferenceIndicator = entryReferenceIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getAccountTypeIndicator() {
		return accountTypeIndicator == null ? Optional.empty() : Optional.of(accountTypeIndicator);
	}

	public AccountCashEntryReturnCriteria2 setAccountTypeIndicator(RequestedIndicator accountTypeIndicator) {
		this.accountTypeIndicator = accountTypeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getEntryAmountIndicator() {
		return entryAmountIndicator == null ? Optional.empty() : Optional.of(entryAmountIndicator);
	}

	public AccountCashEntryReturnCriteria2 setEntryAmountIndicator(RequestedIndicator entryAmountIndicator) {
		this.entryAmountIndicator = entryAmountIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getAccountCurrencyIndicator() {
		return accountCurrencyIndicator == null ? Optional.empty() : Optional.of(accountCurrencyIndicator);
	}

	public AccountCashEntryReturnCriteria2 setAccountCurrencyIndicator(RequestedIndicator accountCurrencyIndicator) {
		this.accountCurrencyIndicator = accountCurrencyIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getEntryStatusIndicator() {
		return entryStatusIndicator == null ? Optional.empty() : Optional.of(entryStatusIndicator);
	}

	public AccountCashEntryReturnCriteria2 setEntryStatusIndicator(RequestedIndicator entryStatusIndicator) {
		this.entryStatusIndicator = entryStatusIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getEntryDateIndicator() {
		return entryDateIndicator == null ? Optional.empty() : Optional.of(entryDateIndicator);
	}

	public AccountCashEntryReturnCriteria2 setEntryDateIndicator(RequestedIndicator entryDateIndicator) {
		this.entryDateIndicator = entryDateIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getAccountServicerIndicator() {
		return accountServicerIndicator == null ? Optional.empty() : Optional.of(accountServicerIndicator);
	}

	public AccountCashEntryReturnCriteria2 setAccountServicerIndicator(RequestedIndicator accountServicerIndicator) {
		this.accountServicerIndicator = accountServicerIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getAccountOwnerIndicator() {
		return accountOwnerIndicator == null ? Optional.empty() : Optional.of(accountOwnerIndicator);
	}

	public AccountCashEntryReturnCriteria2 setAccountOwnerIndicator(RequestedIndicator accountOwnerIndicator) {
		this.accountOwnerIndicator = accountOwnerIndicator;
		return this;
	}
}