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
import com.tools20022.repository.codeset.DTCCLinkType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationSD1#mmPlaceAndName
 * CorporateActionCancellationSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationSD1#mmLinkedCorporateActionIdentification
 * CorporateActionCancellationSD1.mmLinkedCorporateActionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationSD1#mmLinkageType
 * CorporateActionCancellationSD1.mmLinkageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationSD1#mmLinkAddedDate
 * CorporateActionCancellationSD1.mmLinkAddedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationSD1#mmLinkModifiedDate
 * CorporateActionCancellationSD1.mmLinkModifiedDate}</li>
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
 * "CorporateActionCancellationSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides additional information regarding linkage details. "</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionCancellationSD1", propOrder = {"placeAndName", "linkedCorporateActionIdentification", "linkageType", "linkAddedDate", "linkModifiedDate"})
public class CorporateActionCancellationSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationSD1
	 * CorporateActionCancellationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionCancellationSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text linkedCorporateActionIdentification;
	/**
	 * Reference assigned by the account servicer to unambiguously identify a
	 * related corporate action event.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationSD1
	 * CorporateActionCancellationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdCorpActnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedCorporateActionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by the account servicer to unambiguously identify a related corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkedCorporateActionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionCancellationSD1.mmObject();
			isDerived = false;
			xmlTag = "LkdCorpActnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedCorporateActionIdentification";
			definition = "Reference assigned by the account servicer to unambiguously identify a related corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DTCCLinkType1Code linkageType;
	/**
	 * Indicates the reason why two or more events are related.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationSD1
	 * CorporateActionCancellationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the reason why two or more events are related."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkageType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionCancellationSD1.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Indicates the reason why two or more events are related.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCLinkType1Code.mmObject();
		}
	};
	protected ISODate linkAddedDate;
	/**
	 * Events can be linked together. This date represents the date on which the
	 * link was established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationSD1
	 * CorporateActionCancellationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkAddedDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkAddedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Events can be linked together. This date represents the date on which the link was established."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkAddedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionCancellationSD1.mmObject();
			isDerived = false;
			xmlTag = "LkAddedDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkAddedDate";
			definition = "Events can be linked together. This date represents the date on which the link was established.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate linkModifiedDate;
	/**
	 * Events can be linked together. This date represents the date on which the
	 * link was modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationSD1
	 * CorporateActionCancellationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkModfdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkModifiedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Events can be linked together. This date represents the date on which the link was modified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkModifiedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionCancellationSD1.mmObject();
			isDerived = false;
			xmlTag = "LkModfdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkModifiedDate";
			definition = "Events can be linked together. This date represents the date on which the link was modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionCancellationSD1.mmPlaceAndName, CorporateActionCancellationSD1.mmLinkedCorporateActionIdentification, CorporateActionCancellationSD1.mmLinkageType,
						CorporateActionCancellationSD1.mmLinkAddedDate, CorporateActionCancellationSD1.mmLinkModifiedDate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCancellationSD1";
				definition = "Provides additional information regarding linkage details. ";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "LkdCorpActnId", required = true)
	public Max35Text getLinkedCorporateActionIdentification() {
		return linkedCorporateActionIdentification;
	}

	public void setLinkedCorporateActionIdentification(Max35Text linkedCorporateActionIdentification) {
		this.linkedCorporateActionIdentification = linkedCorporateActionIdentification;
	}

	@XmlElement(name = "LkgTp", required = true)
	public DTCCLinkType1Code getLinkageType() {
		return linkageType;
	}

	public void setLinkageType(DTCCLinkType1Code linkageType) {
		this.linkageType = linkageType;
	}

	@XmlElement(name = "LkAddedDt", required = true)
	public ISODate getLinkAddedDate() {
		return linkAddedDate;
	}

	public void setLinkAddedDate(ISODate linkAddedDate) {
		this.linkAddedDate = linkAddedDate;
	}

	@XmlElement(name = "LkModfdDt")
	public ISODate getLinkModifiedDate() {
		return linkModifiedDate;
	}

	public void setLinkModifiedDate(ISODate linkModifiedDate) {
		this.linkModifiedDate = linkModifiedDate;
	}
}