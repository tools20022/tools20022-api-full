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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMService17", propOrder = {"serviceType", "serviceVariant", "limits", "preferredWithdrawal"})
public class ATMService17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMServiceType8Code serviceType;
	/**
	 * Describes the type of inquiry selected by the customer or the ATM.
	 * <p>
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
			componentContext_lazy = () -> ATMService17.mmObject();
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
	protected List<com.tools20022.repository.msg.ATMService18> serviceVariant;
	/**
	 * Variant of the service.
	 * <p>
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
			componentContext_lazy = () -> ATMService17.mmObject();
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
	protected List<com.tools20022.repository.msg.ATMTransactionAmounts6> limits;
	/**
	 * Limits of amounts.
	 * <p>
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
			componentContext_lazy = () -> ATMService17.mmObject();
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
	protected ATMTransaction8 preferredWithdrawal;
	/**
	 * Preferred withdrawal transaction chosen by the customer.
	 * <p>
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
			componentContext_lazy = () -> ATMService17.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(ATMService17.mmServiceType, ATMService17.mmServiceVariant, ATMService17.mmLimits, ATMService17.mmPreferredWithdrawal);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMService17";
				definition = "Services allowed for the customer's profile.";
				nextVersions_lazy = () -> Arrays.asList(ATMService19.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SvcTp", required = true)
	public ATMServiceType8Code getServiceType() {
		return serviceType;
	}

	public void setServiceType(ATMServiceType8Code serviceType) {
		this.serviceType = serviceType;
	}

	@XmlElement(name = "SvcVarnt")
	public List<ATMService18> getServiceVariant() {
		return serviceVariant;
	}

	public void setServiceVariant(List<com.tools20022.repository.msg.ATMService18> serviceVariant) {
		this.serviceVariant = serviceVariant;
	}

	@XmlElement(name = "Lmts")
	public List<ATMTransactionAmounts6> getLimits() {
		return limits;
	}

	public void setLimits(List<com.tools20022.repository.msg.ATMTransactionAmounts6> limits) {
		this.limits = limits;
	}

	@XmlElement(name = "PrefrdWdrwl")
	public ATMTransaction8 getPreferredWithdrawal() {
		return preferredWithdrawal;
	}

	public void setPreferredWithdrawal(com.tools20022.repository.msg.ATMTransaction8 preferredWithdrawal) {
		this.preferredWithdrawal = preferredWithdrawal;
	}
}