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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Services allowed for the customer's profile.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService17#mmServiceType
 * ATMService17.mmServiceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService17#mmServiceVariant
 * ATMService17.mmServiceVariant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService17#mmLimits
 * ATMService17.mmLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMService17#mmPreferredWithdrawal
 * ATMService17.mmPreferredWithdrawal}</li>
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
 * "ATMService17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Services allowed for the customer's profile."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService19 ATMService19}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMService17", propOrder = {"serviceType", "serviceVariant", "limits", "preferredWithdrawal"})
public class ATMService17 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMService17 ATMService17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMService19#mmServiceType
	 * ATMService19.mmServiceType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService17.mmObject();
			isDerived = false;
			xmlTag = "SvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceType";
			definition = "Describes the type of inquiry selected by the customer or the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMService19.mmServiceType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMServiceType8Code.mmObject();
		}
	};
	@XmlElement(name = "SvcVarnt")
	protected List<com.tools20022.repository.msg.ATMService18> serviceVariant;
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
	 * {@linkplain com.tools20022.repository.msg.ATMService17 ATMService17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMService19#mmServiceVariant
	 * ATMService19.mmServiceVariant}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServiceVariant = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService17.mmObject();
			isDerived = false;
			xmlTag = "SvcVarnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceVariant";
			definition = "Variant of the service.";
			nextVersions_lazy = () -> Arrays.asList(ATMService19.mmServiceVariant);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMService18.mmObject();
		}
	};
	@XmlElement(name = "Lmts")
	protected List<com.tools20022.repository.msg.ATMTransactionAmounts6> limits;
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
	 * {@linkplain com.tools20022.repository.msg.ATMService17 ATMService17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMService19#mmLimits
	 * ATMService19.mmLimits}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimits = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService17.mmObject();
			isDerived = false;
			xmlTag = "Lmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limits";
			definition = "Limits of amounts.";
			nextVersions_lazy = () -> Arrays.asList(ATMService19.mmLimits);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts6.mmObject();
		}
	};
	@XmlElement(name = "PrefrdWdrwl")
	protected ATMTransaction8 preferredWithdrawal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction8
	 * ATMTransaction8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService17 ATMService17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrefrdWdrwl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preferred withdrawal transaction chosen by the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreferredWithdrawal = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService17.mmObject();
			isDerived = false;
			xmlTag = "PrefrdWdrwl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredWithdrawal";
			definition = "Preferred withdrawal transaction chosen by the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMTransaction8.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService17.mmServiceType, com.tools20022.repository.msg.ATMService17.mmServiceVariant, com.tools20022.repository.msg.ATMService17.mmLimits,
						com.tools20022.repository.msg.ATMService17.mmPreferredWithdrawal);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMService17";
				definition = "Services allowed for the customer's profile.";
				nextVersions_lazy = () -> Arrays.asList(ATMService19.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ATMServiceType8Code getServiceType() {
		return serviceType;
	}

	public ATMService17 setServiceType(ATMServiceType8Code serviceType) {
		this.serviceType = Objects.requireNonNull(serviceType);
		return this;
	}

	public List<ATMService18> getServiceVariant() {
		return serviceVariant == null ? serviceVariant = new ArrayList<>() : serviceVariant;
	}

	public ATMService17 setServiceVariant(List<com.tools20022.repository.msg.ATMService18> serviceVariant) {
		this.serviceVariant = Objects.requireNonNull(serviceVariant);
		return this;
	}

	public List<ATMTransactionAmounts6> getLimits() {
		return limits == null ? limits = new ArrayList<>() : limits;
	}

	public ATMService17 setLimits(List<com.tools20022.repository.msg.ATMTransactionAmounts6> limits) {
		this.limits = Objects.requireNonNull(limits);
		return this;
	}

	public Optional<ATMTransaction8> getPreferredWithdrawal() {
		return preferredWithdrawal == null ? Optional.empty() : Optional.of(preferredWithdrawal);
	}

	public ATMService17 setPreferredWithdrawal(com.tools20022.repository.msg.ATMTransaction8 preferredWithdrawal) {
		this.preferredWithdrawal = preferredWithdrawal;
		return this;
	}
}