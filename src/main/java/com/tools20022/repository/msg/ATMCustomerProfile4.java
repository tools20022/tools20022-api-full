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
import com.tools20022.repository.codeset.ATMCustomerProfile1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Profile of the customer selected by an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile4#mmRetrievalMode
 * ATMCustomerProfile4.mmRetrievalMode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile4#mmProfileReference
 * ATMCustomerProfile4.mmProfileReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile4#mmCustomerIdentification
 * ATMCustomerProfile4.mmCustomerIdentification}</li>
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
 * "ATMCustomerProfile4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Profile of the customer selected by an ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMCustomerProfile4", propOrder = {"retrievalMode", "profileReference", "customerIdentification"})
public class ATMCustomerProfile4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMCustomerProfile1Code retrievalMode;
	/**
	 * Describes the main way customer information was collected to build up the
	 * customer menu and to provide the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfile1Code
	 * ATMCustomerProfile1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile4
	 * ATMCustomerProfile4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrvlMd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetrievalMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the main way customer information was collected to build up the customer menu and to provide the service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRetrievalMode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCustomerProfile4.mmObject();
			isDerived = false;
			xmlTag = "RtrvlMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetrievalMode";
			definition = "Describes the main way customer information was collected to build up the customer menu and to provide the service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMCustomerProfile1Code.mmObject();
		}
	};
	protected Max35Text profileReference;
	/**
	 * Reference of the customer profile.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile4
	 * ATMCustomerProfile4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrflRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the customer profile."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProfileReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCustomerProfile4.mmObject();
			isDerived = false;
			xmlTag = "PrflRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileReference";
			definition = "Reference of the customer profile.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text customerIdentification;
	/**
	 * Identification of the customer for the bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCustomerProfile4
	 * ATMCustomerProfile4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the customer for the bank."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCustomerProfile4.mmObject();
			isDerived = false;
			xmlTag = "CstmrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerIdentification";
			definition = "Identification of the customer for the bank.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMCustomerProfile4.mmRetrievalMode, ATMCustomerProfile4.mmProfileReference, ATMCustomerProfile4.mmCustomerIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCustomerProfile4";
				definition = "Profile of the customer selected by an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RtrvlMd", required = true)
	public ATMCustomerProfile1Code getRetrievalMode() {
		return retrievalMode;
	}

	public void setRetrievalMode(ATMCustomerProfile1Code retrievalMode) {
		this.retrievalMode = retrievalMode;
	}

	@XmlElement(name = "PrflRef")
	public Max35Text getProfileReference() {
		return profileReference;
	}

	public void setProfileReference(Max35Text profileReference) {
		this.profileReference = profileReference;
	}

	@XmlElement(name = "CstmrId")
	public Max35Text getCustomerIdentification() {
		return customerIdentification;
	}

	public void setCustomerIdentification(Max35Text customerIdentification) {
		this.customerIdentification = customerIdentification;
	}
}