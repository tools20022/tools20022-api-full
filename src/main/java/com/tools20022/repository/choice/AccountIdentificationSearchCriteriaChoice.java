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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AccountIdentification1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between the different options to search for an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice#mmEqual
 * AccountIdentificationSearchCriteriaChoice.mmEqual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice#mmContainText
 * AccountIdentificationSearchCriteriaChoice.mmContainText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice#mmNotContainText
 * AccountIdentificationSearchCriteriaChoice.mmNotContainText}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountIdentificationSearchCriteriaChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the different options to search for an account."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountIdentificationSearchCriteriaChoice", propOrder = {"equal", "containText", "notContainText"})
public class AccountIdentificationSearchCriteriaChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EQ", required = true)
	protected AccountIdentification1Choice equal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice
	 * AccountIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice
	 * AccountIdentificationSearchCriteriaChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EQ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Search for one or more accounts based on exact identification of the account(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentificationSearchCriteriaChoice, AccountIdentification1Choice> mmEqual = new MMMessageAttribute<AccountIdentificationSearchCriteriaChoice, AccountIdentification1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice.mmObject();
			isDerived = false;
			xmlTag = "EQ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equal";
			definition = "Search for one or more accounts based on exact identification of the account(s).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification1Choice.mmObject();
		}

		@Override
		public AccountIdentification1Choice getValue(AccountIdentificationSearchCriteriaChoice obj) {
			return obj.getEqual();
		}

		@Override
		public void setValue(AccountIdentificationSearchCriteriaChoice obj, AccountIdentification1Choice value) {
			obj.setEqual(value);
		}
	};
	@XmlElement(name = "CTTxt", required = true)
	protected Max35Text containText;
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
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice
	 * AccountIdentificationSearchCriteriaChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CTTxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContainText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Search for one or more accounts based on partial identification of the account(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentificationSearchCriteriaChoice, Max35Text> mmContainText = new MMMessageAttribute<AccountIdentificationSearchCriteriaChoice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice.mmObject();
			isDerived = false;
			xmlTag = "CTTxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContainText";
			definition = "Search for one or more accounts based on partial identification of the account(s).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountIdentificationSearchCriteriaChoice obj) {
			return obj.getContainText();
		}

		@Override
		public void setValue(AccountIdentificationSearchCriteriaChoice obj, Max35Text value) {
			obj.setContainText(value);
		}
	};
	@XmlElement(name = "NCTTxt", required = true)
	protected Max35Text notContainText;
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
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice
	 * AccountIdentificationSearchCriteriaChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NCTTxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotContainText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Search for one or more accounts based on a pattern that cannot be contained in the account identification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentificationSearchCriteriaChoice, Max35Text> mmNotContainText = new MMMessageAttribute<AccountIdentificationSearchCriteriaChoice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice.mmObject();
			isDerived = false;
			xmlTag = "NCTTxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotContainText";
			definition = "Search for one or more accounts based on a pattern that cannot be contained in the account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountIdentificationSearchCriteriaChoice obj) {
			return obj.getNotContainText();
		}

		@Override
		public void setValue(AccountIdentificationSearchCriteriaChoice obj, Max35Text value) {
			obj.setNotContainText(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice.mmEqual, com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice.mmContainText,
						com.tools20022.repository.choice.AccountIdentificationSearchCriteriaChoice.mmNotContainText);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountIdentificationSearchCriteriaChoice";
				definition = "Choice between the different options to search for an account.";
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification1Choice getEqual() {
		return equal;
	}

	public AccountIdentificationSearchCriteriaChoice setEqual(AccountIdentification1Choice equal) {
		this.equal = Objects.requireNonNull(equal);
		return this;
	}

	public Max35Text getContainText() {
		return containText;
	}

	public AccountIdentificationSearchCriteriaChoice setContainText(Max35Text containText) {
		this.containText = Objects.requireNonNull(containText);
		return this;
	}

	public Max35Text getNotContainText() {
		return notContainText;
	}

	public AccountIdentificationSearchCriteriaChoice setNotContainText(Max35Text notContainText) {
		this.notContainText = Objects.requireNonNull(notContainText);
		return this;
	}
}