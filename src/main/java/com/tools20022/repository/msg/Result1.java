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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Summation of the call amounts either due to A or due to B.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Result1#mmDueToPartyA
 * Result1.mmDueToPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Result1#mmDueToPartyB
 * Result1.mmDueToPartyB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Result1#mmAdditionalInformation
 * Result1.mmAdditionalInformation}</li>
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
 * "Result1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Summation of the call amounts either due to A or due to B."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Result1", propOrder = {"dueToPartyA", "dueToPartyB", "additionalInformation"})
public class Result1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount dueToPartyA;
	/**
	 * Amount payable by party B to party A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Result1
	 * Result1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DueToPtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueToPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount payable by party B to party A."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDueToPartyA = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Result1.mmObject();
			isDerived = false;
			xmlTag = "DueToPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueToPartyA";
			definition = "Amount payable by party B to party A.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount dueToPartyB;
	/**
	 * Amount payable by party A to party B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Result1
	 * Result1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DueToPtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueToPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount payable by party A to party B."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDueToPartyB = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Result1.mmObject();
			isDerived = false;
			xmlTag = "DueToPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueToPartyB";
			definition = "Amount payable by party A to party B.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Max210Text additionalInformation;
	/**
	 * Provides additional information related to the collateral that may be
	 * requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Result1
	 * Result1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information related to the collateral that may be requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Result1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information related to the collateral that may be requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Result1.mmDueToPartyA, Result1.mmDueToPartyB, Result1.mmAdditionalInformation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Result1";
				definition = "Summation of the call amounts either due to A or due to B.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DueToPtyA")
	public ActiveCurrencyAndAmount getDueToPartyA() {
		return dueToPartyA;
	}

	public void setDueToPartyA(ActiveCurrencyAndAmount dueToPartyA) {
		this.dueToPartyA = dueToPartyA;
	}

	@XmlElement(name = "DueToPtyB")
	public ActiveCurrencyAndAmount getDueToPartyB() {
		return dueToPartyB;
	}

	public void setDueToPartyB(ActiveCurrencyAndAmount dueToPartyB) {
		this.dueToPartyB = dueToPartyB;
	}

	@XmlElement(name = "AddtlInf")
	public Max210Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max210Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}