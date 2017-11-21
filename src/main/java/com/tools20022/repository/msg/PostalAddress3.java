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
import com.tools20022.repository.codeset.AddressType1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.entity.MailingInstructions;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information that locates and identifies a specific address, as defined by
 * postal services.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress3#mmAddressType
 * PostalAddress3.mmAddressType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress3#mmMailingIndicator
 * PostalAddress3.mmMailingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress3#mmRegistrationAddressIndicator
 * PostalAddress3.mmRegistrationAddressIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress3#mmNameAndAddress
 * PostalAddress3.mmNameAndAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PostalAddress
 * PostalAddress}</li>
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
 * "PostalAddress3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information that locates and identifies a specific address, as defined by postal services."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21
 * PostalAddress21}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PostalAddress3", propOrder = {"addressType", "mailingIndicator", "registrationAddressIndicator", "nameAndAddress"})
public class PostalAddress3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AddressType1Code addressType;
	/**
	 * Type of address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AddressType1Code
	 * AddressType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmAddressType
	 * PostalAddress.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress3 PostalAddress3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of address."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmAddressType
	 * PostalAddress21.mmAddressType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddressType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmAddressType;
			componentContext_lazy = () -> PostalAddress3.mmObject();
			isDerived = false;
			xmlTag = "AdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressType";
			definition = "Type of address.";
			nextVersions_lazy = () -> Arrays.asList(PostalAddress21.mmAddressType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AddressType1Code.mmObject();
		}
	};
	protected YesNoIndicator mailingIndicator;
	/**
	 * Indicates whether mail should be sent to an address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmMailingIndicator
	 * MailingInstructions.mmMailingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress3 PostalAddress3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MlngInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether mail should be sent to an address."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmMailingIndicator
	 * PostalAddress21.mmMailingIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMailingIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MailingInstructions.mmMailingIndicator;
			componentContext_lazy = () -> PostalAddress3.mmObject();
			isDerived = false;
			xmlTag = "MlngInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailingIndicator";
			definition = "Indicates whether mail should be sent to an address.";
			nextVersions_lazy = () -> Arrays.asList(PostalAddress21.mmMailingIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator registrationAddressIndicator;
	/**
	 * Indicates whether the address is the official address of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmRegistrationAddressIndicator
	 * MailingInstructions.mmRegistrationAddressIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress3 PostalAddress3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnAdrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the address is the official address of the party."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmRegistrationAddressIndicator
	 * PostalAddress21.mmRegistrationAddressIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationAddressIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MailingInstructions.mmRegistrationAddressIndicator;
			componentContext_lazy = () -> PostalAddress3.mmObject();
			isDerived = false;
			xmlTag = "RegnAdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationAddressIndicator";
			definition = "Indicates whether the address is the official address of the party.";
			nextVersions_lazy = () -> Arrays.asList(PostalAddress21.mmRegistrationAddressIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected NameAndAddress4 nameAndAddress;
	/**
	 * Information that locates and identifies a specific address, as defined by
	 * postal services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress4
	 * NameAndAddress4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
	 * ContactPoint.mmRelatedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress3 PostalAddress3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNameAndAddress = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmRelatedParty;
			componentContext_lazy = () -> PostalAddress3.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PostalAddress3.mmAddressType, PostalAddress3.mmMailingIndicator, PostalAddress3.mmRegistrationAddressIndicator, PostalAddress3.mmNameAndAddress);
				trace_lazy = () -> PostalAddress.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PostalAddress3";
				definition = "Information that locates and identifies a specific address, as defined by postal services.";
				nextVersions_lazy = () -> Arrays.asList(PostalAddress21.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AdrTp", required = true)
	public AddressType1Code getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType1Code addressType) {
		this.addressType = addressType;
	}

	@XmlElement(name = "MlngInd", required = true)
	public YesNoIndicator getMailingIndicator() {
		return mailingIndicator;
	}

	public void setMailingIndicator(YesNoIndicator mailingIndicator) {
		this.mailingIndicator = mailingIndicator;
	}

	@XmlElement(name = "RegnAdrInd", required = true)
	public YesNoIndicator getRegistrationAddressIndicator() {
		return registrationAddressIndicator;
	}

	public void setRegistrationAddressIndicator(YesNoIndicator registrationAddressIndicator) {
		this.registrationAddressIndicator = registrationAddressIndicator;
	}

	@XmlElement(name = "NmAndAdr", required = true)
	public NameAndAddress4 getNameAndAddress() {
		return nameAndAddress;
	}

	public void setNameAndAddress(com.tools20022.repository.msg.NameAndAddress4 nameAndAddress) {
		this.nameAndAddress = nameAndAddress;
	}
}