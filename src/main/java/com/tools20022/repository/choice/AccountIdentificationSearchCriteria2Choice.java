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
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice#mmEqual
 * AccountIdentificationSearchCriteria2Choice.mmEqual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice#mmContainText
 * AccountIdentificationSearchCriteria2Choice.mmContainText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice#mmNotContainText
 * AccountIdentificationSearchCriteria2Choice.mmNotContainText}</li>
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
 * "AccountIdentificationSearchCriteria2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the different options to search for an account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountIdentificationSearchCriteria2Choice", propOrder = {"equal", "containText", "notContainText"})
public class AccountIdentificationSearchCriteria2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EQ", required = true)
	protected AccountIdentification4Choice equal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice
	 * AccountIdentificationSearchCriteria2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Search for one or more accounts based on exact identification of the account(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEqual = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice.mmObject();
			isDerived = false;
			xmlTag = "EQ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equal";
			definition = "Search for one or more accounts based on exact identification of the account(s).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.AccountIdentification4Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice
	 * AccountIdentificationSearchCriteria2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CTTxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContainText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Search for one or more accounts based on partial identification of the account(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContainText = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice.mmObject();
			isDerived = false;
			xmlTag = "CTTxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContainText";
			definition = "Search for one or more accounts based on partial identification of the account(s).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice
	 * AccountIdentificationSearchCriteria2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NCTTxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotContainText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Search for one or more accounts based on a pattern that cannot be contained in the account identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotContainText = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice.mmObject();
			isDerived = false;
			xmlTag = "NCTTxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotContainText";
			definition = "Search for one or more accounts based on a pattern that cannot be contained in the account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice.mmEqual, com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice.mmContainText,
						com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice.mmNotContainText);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountIdentificationSearchCriteria2Choice";
				definition = "Choice between the different options to search for an account.";
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification4Choice getEqual() {
		return equal;
	}

	public AccountIdentificationSearchCriteria2Choice setEqual(com.tools20022.repository.choice.AccountIdentification4Choice equal) {
		this.equal = Objects.requireNonNull(equal);
		return this;
	}

	public Max35Text getContainText() {
		return containText;
	}

	public AccountIdentificationSearchCriteria2Choice setContainText(Max35Text containText) {
		this.containText = Objects.requireNonNull(containText);
		return this;
	}

	public Max35Text getNotContainText() {
		return notContainText;
	}

	public AccountIdentificationSearchCriteria2Choice setNotContainText(Max35Text notContainText) {
		this.notContainText = Objects.requireNonNull(notContainText);
		return this;
	}
}