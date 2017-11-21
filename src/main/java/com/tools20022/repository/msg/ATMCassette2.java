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
import com.tools20022.repository.codeset.ATMCassetteType1Code;
import com.tools20022.repository.codeset.ATMMediaType1Code;
import com.tools20022.repository.codeset.ATMNoteType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information on the cassette of an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassette2#mmPhysicalIdentification
 * ATMCassette2.mmPhysicalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassette2#mmLogicalIdentification
 * ATMCassette2.mmLogicalIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassette2#mmSerialNumber
 * ATMCassette2.mmSerialNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassette2#mmType
 * ATMCassette2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassette2#mmSubType
 * ATMCassette2.mmSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassette2#mmMediaType
 * ATMCassette2.mmMediaType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassette2#mmMediaCounters
 * ATMCassette2.mmMediaCounters}</li>
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
 * "ATMCassette2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information on the cassette of an ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMCassette2", propOrder = {"physicalIdentification", "logicalIdentification", "serialNumber", "type", "subType", "mediaType", "mediaCounters"})
public class ATMCassette2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text physicalIdentification;
	/**
	 * Physical identification of the cassette for the ATM.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassette2 ATMCassette2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical identification of the cassette for the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhysicalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassette2.mmObject();
			isDerived = false;
			xmlTag = "PhysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalIdentification";
			definition = "Physical identification of the cassette for the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text logicalIdentification;
	/**
	 * Logical identification of the cassette for the ATM.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassette2 ATMCassette2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LogclId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogicalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Logical identification of the cassette for the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLogicalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassette2.mmObject();
			isDerived = false;
			xmlTag = "LogclId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LogicalIdentification";
			definition = "Logical identification of the cassette for the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text serialNumber;
	/**
	 * Serial number or unique identification of the cassette hardware.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassette2 ATMCassette2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Serial number or unique identification of the cassette hardware."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSerialNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassette2.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Serial number or unique identification of the cassette hardware.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ATMCassetteType1Code type;
	/**
	 * Type of cassette.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code
	 * ATMCassetteType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassette2 ATMCassette2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassette2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMCassetteType1Code.mmObject();
		}
	};
	protected List<ATMNoteType1Code> subType;
	/**
	 * Type of items the cash-in takes
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteType1Code
	 * ATMNoteType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassette2 ATMCassette2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of items the cash-in takes"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassette2.mmObject();
			isDerived = false;
			xmlTag = "SubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubType";
			definition = "Type of items the cash-in takes";
			minOccurs = 0;
			simpleType_lazy = () -> ATMNoteType1Code.mmObject();
		}
	};
	protected ATMMediaType1Code mediaType;
	/**
	 * Type of media inside the cassette.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassette2 ATMCassette2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdiaTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of media inside the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMediaType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassette2.mmObject();
			isDerived = false;
			xmlTag = "MdiaTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaType";
			definition = "Type of media inside the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMMediaType1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMCassetteCounters3> mediaCounters;
	/**
	 * Counter per unit value or globally.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassette2 ATMCassette2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdiaCntrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaCounters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counter per unit value or globally."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMediaCounters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMCassette2.mmObject();
			isDerived = false;
			xmlTag = "MdiaCntrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaCounters";
			definition = "Counter per unit value or globally.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMCassette2.mmPhysicalIdentification, ATMCassette2.mmLogicalIdentification, ATMCassette2.mmSerialNumber, ATMCassette2.mmType, ATMCassette2.mmSubType, ATMCassette2.mmMediaType,
						ATMCassette2.mmMediaCounters);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCassette2";
				definition = "Information on the cassette of an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PhysId")
	public Max35Text getPhysicalIdentification() {
		return physicalIdentification;
	}

	public void setPhysicalIdentification(Max35Text physicalIdentification) {
		this.physicalIdentification = physicalIdentification;
	}

	@XmlElement(name = "LogclId", required = true)
	public Max35Text getLogicalIdentification() {
		return logicalIdentification;
	}

	public void setLogicalIdentification(Max35Text logicalIdentification) {
		this.logicalIdentification = logicalIdentification;
	}

	@XmlElement(name = "SrlNb")
	public Max35Text getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Max35Text serialNumber) {
		this.serialNumber = serialNumber;
	}

	@XmlElement(name = "Tp", required = true)
	public ATMCassetteType1Code getType() {
		return type;
	}

	public void setType(ATMCassetteType1Code type) {
		this.type = type;
	}

	@XmlElement(name = "SubTp")
	public List<ATMNoteType1Code> getSubType() {
		return subType;
	}

	public void setSubType(List<ATMNoteType1Code> subType) {
		this.subType = subType;
	}

	@XmlElement(name = "MdiaTp")
	public ATMMediaType1Code getMediaType() {
		return mediaType;
	}

	public void setMediaType(ATMMediaType1Code mediaType) {
		this.mediaType = mediaType;
	}

	@XmlElement(name = "MdiaCntrs")
	public List<ATMCassetteCounters3> getMediaCounters() {
		return mediaCounters;
	}

	public void setMediaCounters(List<com.tools20022.repository.msg.ATMCassetteCounters3> mediaCounters) {
		this.mediaCounters = mediaCounters;
	}
}