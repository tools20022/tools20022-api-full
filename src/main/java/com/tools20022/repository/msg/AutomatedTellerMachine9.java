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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.TransactionEnvironment2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ATM information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9#mmIdentification
 * AutomatedTellerMachine9.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9#mmAdditionalIdentification
 * AutomatedTellerMachine9.mmAdditionalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9#mmSequenceNumber
 * AutomatedTellerMachine9.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9#mmBaseCurrency
 * AutomatedTellerMachine9.mmBaseCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9#mmLocation
 * AutomatedTellerMachine9.mmLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9#mmLocationCategory
 * AutomatedTellerMachine9.mmLocationCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9#mmCapabilities
 * AutomatedTellerMachine9.mmCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9#mmEquipment
 * AutomatedTellerMachine9.mmEquipment}</li>
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
 * "AutomatedTellerMachine9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "ATM information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AutomatedTellerMachine9", propOrder = {"identification", "additionalIdentification", "sequenceNumber", "baseCurrency", "location", "locationCategory", "capabilities", "equipment"})
public class AutomatedTellerMachine9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * ATM terminal device identification for the acquirer and the issuer.
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
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9
	 * AutomatedTellerMachine9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ATM terminal device identification for the acquirer and the issuer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AutomatedTellerMachine9.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "ATM terminal device identification for the acquirer and the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text additionalIdentification;
	/**
	 * ATM terminal device identification for the ATM manager.
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
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9
	 * AutomatedTellerMachine9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM terminal device identification for the ATM manager."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AutomatedTellerMachine9.mmObject();
			isDerived = false;
			xmlTag = "AddtlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalIdentification";
			definition = "ATM terminal device identification for the ATM manager.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text sequenceNumber;
	/**
	 * ATM terminal device identification for the branch.
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
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9
	 * AutomatedTellerMachine9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM terminal device identification for the branch."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AutomatedTellerMachine9.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "ATM terminal device identification for the branch.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveCurrencyCode baseCurrency;
	/**
	 * Reference currency of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9
	 * AutomatedTellerMachine9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BaseCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference currency of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBaseCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AutomatedTellerMachine9.mmObject();
			isDerived = false;
			xmlTag = "BaseCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCurrency";
			definition = "Reference currency of the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected PostalAddress17 location;
	/**
	 * Location of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress17
	 * PostalAddress17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9
	 * AutomatedTellerMachine9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AutomatedTellerMachine9.mmObject();
			isDerived = false;
			xmlTag = "Lctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Location";
			definition = "Location of the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress17.mmObject();
		}
	};
	protected TransactionEnvironment2Code locationCategory;
	/**
	 * Indicates the environment of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironment2Code
	 * TransactionEnvironment2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9
	 * AutomatedTellerMachine9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LctnCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocationCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the environment of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocationCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AutomatedTellerMachine9.mmObject();
			isDerived = false;
			xmlTag = "LctnCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocationCategory";
			definition = "Indicates the environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionEnvironment2Code.mmObject();
		}
	};
	protected PointOfInteractionCapabilities7 capabilities;
	/**
	 * Capabilities of the ATM terminal performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9
	 * AutomatedTellerMachine9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capabilities of the ATM terminal performing the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCapabilities = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AutomatedTellerMachine9.mmObject();
			isDerived = false;
			xmlTag = "Cpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capabilities";
			definition = "Capabilities of the ATM terminal performing the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
		}
	};
	protected ATMEquipment1 equipment;
	/**
	 * ATM terminal equipment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEquipment1
	 * ATMEquipment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9
	 * AutomatedTellerMachine9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Eqpmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM terminal equipment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEquipment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AutomatedTellerMachine9.mmObject();
			isDerived = false;
			xmlTag = "Eqpmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equipment";
			definition = "ATM terminal equipment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMEquipment1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AutomatedTellerMachine9.mmIdentification, AutomatedTellerMachine9.mmAdditionalIdentification, AutomatedTellerMachine9.mmSequenceNumber, AutomatedTellerMachine9.mmBaseCurrency,
						AutomatedTellerMachine9.mmLocation, AutomatedTellerMachine9.mmLocationCategory, AutomatedTellerMachine9.mmCapabilities, AutomatedTellerMachine9.mmEquipment);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AutomatedTellerMachine9";
				definition = "ATM information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "AddtlId")
	public Max35Text getAdditionalIdentification() {
		return additionalIdentification;
	}

	public void setAdditionalIdentification(Max35Text additionalIdentification) {
		this.additionalIdentification = additionalIdentification;
	}

	@XmlElement(name = "SeqNb")
	public Max35Text getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	@XmlElement(name = "BaseCcy", required = true)
	public ActiveCurrencyCode getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(ActiveCurrencyCode baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	@XmlElement(name = "Lctn")
	public PostalAddress17 getLocation() {
		return location;
	}

	public void setLocation(com.tools20022.repository.msg.PostalAddress17 location) {
		this.location = location;
	}

	@XmlElement(name = "LctnCtgy")
	public TransactionEnvironment2Code getLocationCategory() {
		return locationCategory;
	}

	public void setLocationCategory(TransactionEnvironment2Code locationCategory) {
		this.locationCategory = locationCategory;
	}

	@XmlElement(name = "Cpblties")
	public PointOfInteractionCapabilities7 getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(com.tools20022.repository.msg.PointOfInteractionCapabilities7 capabilities) {
		this.capabilities = capabilities;
	}

	@XmlElement(name = "Eqpmnt")
	public ATMEquipment1 getEquipment() {
		return equipment;
	}

	public void setEquipment(com.tools20022.repository.msg.ATMEquipment1 equipment) {
		this.equipment = equipment;
	}
}