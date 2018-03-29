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
import com.tools20022.repository.codeset.ATMServiceType8Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMService18;
import com.tools20022.repository.msg.ATMTransactionAmounts6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Service allowed on the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService19#mmServiceType
 * ATMService19.mmServiceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService19#mmServiceVariant
 * ATMService19.mmServiceVariant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService19#mmLimits
 * ATMService19.mmLimits}</li>
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
 * "ATMService19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Service allowed on the account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMService17
 * ATMService17}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMService19", propOrder = {"serviceType", "serviceVariant", "limits"})
public class ATMService19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SvcTp", required = true)
	protected ATMServiceType8Code serviceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
	 * ATMServiceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService19 ATMService19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of inquiry selected by the customer or the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService17#mmServiceType
	 * ATMService17.mmServiceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMService19, ATMServiceType8Code> mmServiceType = new MMMessageAttribute<ATMService19, ATMServiceType8Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService19.mmObject();
			isDerived = false;
			xmlTag = "SvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceType";
			definition = "Describes the type of inquiry selected by the customer or the ATM.";
			previousVersion_lazy = () -> ATMService17.mmServiceType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMServiceType8Code.mmObject();
		}

		@Override
		public ATMServiceType8Code getValue(ATMService19 obj) {
			return obj.getServiceType();
		}

		@Override
		public void setValue(ATMService19 obj, ATMServiceType8Code value) {
			obj.setServiceType(value);
		}
	};
	@XmlElement(name = "SvcVarnt")
	protected List<ATMService18> serviceVariant;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMService18
	 * ATMService18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService19 ATMService19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcVarnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceVariant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variant of the service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService17#mmServiceVariant
	 * ATMService17.mmServiceVariant}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMService19, List<ATMService18>> mmServiceVariant = new MMMessageAssociationEnd<ATMService19, List<ATMService18>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService19.mmObject();
			isDerived = false;
			xmlTag = "SvcVarnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceVariant";
			definition = "Variant of the service.";
			previousVersion_lazy = () -> ATMService17.mmServiceVariant;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMService18.mmObject();
		}

		@Override
		public List<ATMService18> getValue(ATMService19 obj) {
			return obj.getServiceVariant();
		}

		@Override
		public void setValue(ATMService19 obj, List<ATMService18> value) {
			obj.setServiceVariant(value);
		}
	};
	@XmlElement(name = "Lmts")
	protected List<ATMTransactionAmounts6> limits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6
	 * ATMTransactionAmounts6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService19 ATMService19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limits of amounts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService17#mmLimits
	 * ATMService17.mmLimits}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMService19, List<ATMTransactionAmounts6>> mmLimits = new MMMessageAssociationEnd<ATMService19, List<ATMTransactionAmounts6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService19.mmObject();
			isDerived = false;
			xmlTag = "Lmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limits";
			definition = "Limits of amounts.";
			previousVersion_lazy = () -> ATMService17.mmLimits;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTransactionAmounts6.mmObject();
		}

		@Override
		public List<ATMTransactionAmounts6> getValue(ATMService19 obj) {
			return obj.getLimits();
		}

		@Override
		public void setValue(ATMService19 obj, List<ATMTransactionAmounts6> value) {
			obj.setLimits(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService19.mmServiceType, com.tools20022.repository.msg.ATMService19.mmServiceVariant, com.tools20022.repository.msg.ATMService19.mmLimits);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMService19";
				definition = "Service allowed on the account.";
				previousVersion_lazy = () -> ATMService17.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMServiceType8Code getServiceType() {
		return serviceType;
	}

	public ATMService19 setServiceType(ATMServiceType8Code serviceType) {
		this.serviceType = Objects.requireNonNull(serviceType);
		return this;
	}

	public List<ATMService18> getServiceVariant() {
		return serviceVariant == null ? serviceVariant = new ArrayList<>() : serviceVariant;
	}

	public ATMService19 setServiceVariant(List<ATMService18> serviceVariant) {
		this.serviceVariant = Objects.requireNonNull(serviceVariant);
		return this;
	}

	public List<ATMTransactionAmounts6> getLimits() {
		return limits == null ? limits = new ArrayList<>() : limits;
	}

	public ATMService19 setLimits(List<ATMTransactionAmounts6> limits) {
		this.limits = Objects.requireNonNull(limits);
		return this;
	}
}