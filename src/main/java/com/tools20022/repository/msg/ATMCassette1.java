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
import com.tools20022.repository.msg.ATMCassetteCounters1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.ATMCassette1#mmPhysicalIdentification
 * ATMCassette1.mmPhysicalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassette1#mmLogicalIdentification
 * ATMCassette1.mmLogicalIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassette1#mmType
 * ATMCassette1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassette1#mmSubType
 * ATMCassette1.mmSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassette1#mmMediaType
 * ATMCassette1.mmMediaType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassette1#mmMediaCounters
 * ATMCassette1.mmMediaCounters}</li>
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
 * "ATMCassette1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information on the cassette of an ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCassette1", propOrder = {"physicalIdentification", "logicalIdentification", "type", "subType", "mediaType", "mediaCounters"})
public class ATMCassette1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PhysId")
	protected Max35Text physicalIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassette1 ATMCassette1}</li>
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
	public static final MMMessageAttribute<ATMCassette1, Optional<Max35Text>> mmPhysicalIdentification = new MMMessageAttribute<ATMCassette1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassette1.mmObject();
			isDerived = false;
			xmlTag = "PhysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalIdentification";
			definition = "Physical identification of the cassette for the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMCassette1 obj) {
			return obj.getPhysicalIdentification();
		}

		@Override
		public void setValue(ATMCassette1 obj, Optional<Max35Text> value) {
			obj.setPhysicalIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "LogclId", required = true)
	protected Max35Text logicalIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassette1 ATMCassette1}</li>
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
	public static final MMMessageAttribute<ATMCassette1, Max35Text> mmLogicalIdentification = new MMMessageAttribute<ATMCassette1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassette1.mmObject();
			isDerived = false;
			xmlTag = "LogclId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LogicalIdentification";
			definition = "Logical identification of the cassette for the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ATMCassette1 obj) {
			return obj.getLogicalIdentification();
		}

		@Override
		public void setValue(ATMCassette1 obj, Max35Text value) {
			obj.setLogicalIdentification(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected ATMCassetteType1Code type;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassette1 ATMCassette1}</li>
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
	public static final MMMessageAttribute<ATMCassette1, ATMCassetteType1Code> mmType = new MMMessageAttribute<ATMCassette1, ATMCassetteType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassette1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMCassetteType1Code.mmObject();
		}

		@Override
		public ATMCassetteType1Code getValue(ATMCassette1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ATMCassette1 obj, ATMCassetteType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "SubTp")
	protected List<ATMNoteType1Code> subType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassette1 ATMCassette1}</li>
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
	 * definition} = "Type of items the cash-in takes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCassette1, List<ATMNoteType1Code>> mmSubType = new MMMessageAttribute<ATMCassette1, List<ATMNoteType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassette1.mmObject();
			isDerived = false;
			xmlTag = "SubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubType";
			definition = "Type of items the cash-in takes.";
			minOccurs = 0;
			simpleType_lazy = () -> ATMNoteType1Code.mmObject();
		}

		@Override
		public List<ATMNoteType1Code> getValue(ATMCassette1 obj) {
			return obj.getSubType();
		}

		@Override
		public void setValue(ATMCassette1 obj, List<ATMNoteType1Code> value) {
			obj.setSubType(value);
		}
	};
	@XmlElement(name = "MdiaTp")
	protected ATMMediaType1Code mediaType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassette1 ATMCassette1}</li>
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
	public static final MMMessageAttribute<ATMCassette1, Optional<ATMMediaType1Code>> mmMediaType = new MMMessageAttribute<ATMCassette1, Optional<ATMMediaType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassette1.mmObject();
			isDerived = false;
			xmlTag = "MdiaTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaType";
			definition = "Type of media inside the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMMediaType1Code.mmObject();
		}

		@Override
		public Optional<ATMMediaType1Code> getValue(ATMCassette1 obj) {
			return obj.getMediaType();
		}

		@Override
		public void setValue(ATMCassette1 obj, Optional<ATMMediaType1Code> value) {
			obj.setMediaType(value.orElse(null));
		}
	};
	@XmlElement(name = "MdiaCntrs")
	protected List<ATMCassetteCounters1> mediaCounters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1
	 * ATMCassetteCounters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassette1 ATMCassette1}</li>
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
	public static final MMMessageAssociationEnd<ATMCassette1, List<ATMCassetteCounters1>> mmMediaCounters = new MMMessageAssociationEnd<ATMCassette1, List<ATMCassetteCounters1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassette1.mmObject();
			isDerived = false;
			xmlTag = "MdiaCntrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaCounters";
			definition = "Counter per unit value or globally.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCassetteCounters1.mmObject();
		}

		@Override
		public List<ATMCassetteCounters1> getValue(ATMCassette1 obj) {
			return obj.getMediaCounters();
		}

		@Override
		public void setValue(ATMCassette1 obj, List<ATMCassetteCounters1> value) {
			obj.setMediaCounters(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCassette1.mmPhysicalIdentification, com.tools20022.repository.msg.ATMCassette1.mmLogicalIdentification,
						com.tools20022.repository.msg.ATMCassette1.mmType, com.tools20022.repository.msg.ATMCassette1.mmSubType, com.tools20022.repository.msg.ATMCassette1.mmMediaType,
						com.tools20022.repository.msg.ATMCassette1.mmMediaCounters);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCassette1";
				definition = "Information on the cassette of an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getPhysicalIdentification() {
		return physicalIdentification == null ? Optional.empty() : Optional.of(physicalIdentification);
	}

	public ATMCassette1 setPhysicalIdentification(Max35Text physicalIdentification) {
		this.physicalIdentification = physicalIdentification;
		return this;
	}

	public Max35Text getLogicalIdentification() {
		return logicalIdentification;
	}

	public ATMCassette1 setLogicalIdentification(Max35Text logicalIdentification) {
		this.logicalIdentification = Objects.requireNonNull(logicalIdentification);
		return this;
	}

	public ATMCassetteType1Code getType() {
		return type;
	}

	public ATMCassette1 setType(ATMCassetteType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public List<ATMNoteType1Code> getSubType() {
		return subType == null ? subType = new ArrayList<>() : subType;
	}

	public ATMCassette1 setSubType(List<ATMNoteType1Code> subType) {
		this.subType = Objects.requireNonNull(subType);
		return this;
	}

	public Optional<ATMMediaType1Code> getMediaType() {
		return mediaType == null ? Optional.empty() : Optional.of(mediaType);
	}

	public ATMCassette1 setMediaType(ATMMediaType1Code mediaType) {
		this.mediaType = mediaType;
		return this;
	}

	public List<ATMCassetteCounters1> getMediaCounters() {
		return mediaCounters == null ? mediaCounters = new ArrayList<>() : mediaCounters;
	}

	public ATMCassette1 setMediaCounters(List<ATMCassetteCounters1> mediaCounters) {
		this.mediaCounters = Objects.requireNonNull(mediaCounters);
		return this;
	}
}