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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DTCCLinkType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding linkage details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReferenceSD2#mmPlaceAndName
 * CorporateActionEventReferenceSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReferenceSD2#mmLinkageType
 * CorporateActionEventReferenceSD2.mmLinkageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReferenceSD2#mmLinkAddedDate
 * CorporateActionEventReferenceSD2.mmLinkAddedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReferenceSD2#mmLinkModifiedDate
 * CorporateActionEventReferenceSD2.mmLinkModifiedDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventReferenceSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides additional information regarding linkage details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionEventReferenceSD2", propOrder = {"placeAndName", "linkageType", "linkAddedDate", "linkModifiedDate"})
public class CorporateActionEventReferenceSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReferenceSD2
	 * CorporateActionEventReferenceSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionEventReferenceSD2, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionEventReferenceSD2, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventReferenceSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionEventReferenceSD2 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionEventReferenceSD2 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "LkgTp", required = true)
	protected DTCCLinkType1Code linkageType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
	 * DTCCLinkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReferenceSD2
	 * CorporateActionEventReferenceSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkgTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the reason why two or more events are related."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Link Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionEventReferenceSD2, DTCCLinkType1Code> mmLinkageType = new MMMessageAttribute<CorporateActionEventReferenceSD2, DTCCLinkType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventReferenceSD2.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Link Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Indicates the reason why two or more events are related.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCLinkType1Code.mmObject();
		}

		@Override
		public DTCCLinkType1Code getValue(CorporateActionEventReferenceSD2 obj) {
			return obj.getLinkageType();
		}

		@Override
		public void setValue(CorporateActionEventReferenceSD2 obj, DTCCLinkType1Code value) {
			obj.setLinkageType(value);
		}
	};
	@XmlElement(name = "LkAddedDt", required = true)
	protected ISODate linkAddedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReferenceSD2
	 * CorporateActionEventReferenceSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkAddedDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkAddedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Events can be linked together. This date represents the date on which the link was established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Link Added Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionEventReferenceSD2, ISODate> mmLinkAddedDate = new MMMessageAttribute<CorporateActionEventReferenceSD2, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventReferenceSD2.mmObject();
			isDerived = false;
			xmlTag = "LkAddedDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Link Added Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkAddedDate";
			definition = "Events can be linked together. This date represents the date on which the link was established.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CorporateActionEventReferenceSD2 obj) {
			return obj.getLinkAddedDate();
		}

		@Override
		public void setValue(CorporateActionEventReferenceSD2 obj, ISODate value) {
			obj.setLinkAddedDate(value);
		}
	};
	@XmlElement(name = "LkModfdDt")
	protected ISODate linkModifiedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReferenceSD2
	 * CorporateActionEventReferenceSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkModfdDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkModifiedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Events can be linked together. This date represents the date on which the link was modified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Link Modified Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionEventReferenceSD2, Optional<ISODate>> mmLinkModifiedDate = new MMMessageAttribute<CorporateActionEventReferenceSD2, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventReferenceSD2.mmObject();
			isDerived = false;
			xmlTag = "LkModfdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Link Modified Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkModifiedDate";
			definition = "Events can be linked together. This date represents the date on which the link was modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionEventReferenceSD2 obj) {
			return obj.getLinkModifiedDate();
		}

		@Override
		public void setValue(CorporateActionEventReferenceSD2 obj, Optional<ISODate> value) {
			obj.setLinkModifiedDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventReferenceSD2.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionEventReferenceSD2.mmLinkageType,
						com.tools20022.repository.msg.CorporateActionEventReferenceSD2.mmLinkAddedDate, com.tools20022.repository.msg.CorporateActionEventReferenceSD2.mmLinkModifiedDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionEventReferenceSD2";
				definition = "Provides additional information regarding linkage details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionEventReferenceSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public DTCCLinkType1Code getLinkageType() {
		return linkageType;
	}

	public CorporateActionEventReferenceSD2 setLinkageType(DTCCLinkType1Code linkageType) {
		this.linkageType = Objects.requireNonNull(linkageType);
		return this;
	}

	public ISODate getLinkAddedDate() {
		return linkAddedDate;
	}

	public CorporateActionEventReferenceSD2 setLinkAddedDate(ISODate linkAddedDate) {
		this.linkAddedDate = Objects.requireNonNull(linkAddedDate);
		return this;
	}

	public Optional<ISODate> getLinkModifiedDate() {
		return linkModifiedDate == null ? Optional.empty() : Optional.of(linkModifiedDate);
	}

	public CorporateActionEventReferenceSD2 setLinkModifiedDate(ISODate linkModifiedDate) {
		this.linkModifiedDate = linkModifiedDate;
		return this;
	}
}