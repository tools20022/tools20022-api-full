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
import com.tools20022.repository.datatype.Max240Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.GenericIdentification;
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
 * Extension to provide the local language information of the new company name
 * when the corporate action event type code is CHAN (name change).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2#mmPlaceAndName
 * UpdatedAdditionalInformation6SD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2#mmFullLocalLanguageSecurityName
 * UpdatedAdditionalInformation6SD2.mmFullLocalLanguageSecurityName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2#mmAbbreviatedLocalLanguageSecurityName
 * UpdatedAdditionalInformation6SD2.mmAbbreviatedLocalLanguageSecurityName}</li>
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
 * "UpdatedAdditionalInformation6SD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Extension to provide the local language information of the new company name when the corporate action event type code is CHAN (name change)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UpdatedAdditionalInformation6SD2", propOrder = {"placeAndName", "fullLocalLanguageSecurityName", "abbreviatedLocalLanguageSecurityName"})
public class UpdatedAdditionalInformation6SD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
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
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2
	 * UpdatedAdditionalInformation6SD2}</li>
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
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "FullLclLangSctyNm")
	protected Max240Text fullLocalLanguageSecurityName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max240Text
	 * Max240Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2
	 * UpdatedAdditionalInformation6SD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullLclLangSctyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullLocalLanguageSecurityName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full and formal name of underlying securities in the local language."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullLocalLanguageSecurityName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2.mmObject();
			isDerived = false;
			xmlTag = "FullLclLangSctyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullLocalLanguageSecurityName";
			definition = "Full and formal name of underlying securities in the local language.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max240Text.mmObject();
		}
	};
	@XmlElement(name = "AbbrvtdLclLangSctyNm", required = true)
	protected Max240Text abbreviatedLocalLanguageSecurityName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max240Text
	 * Max240Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2
	 * UpdatedAdditionalInformation6SD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AbbrvtdLclLangSctyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AbbreviatedLocalLanguageSecurityName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Abbreviated name of underlying securities in the local language. \r\nIn case of non-listed securities, it will be a full local language security name.\r\n銘柄名（銘柄略称."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAbbreviatedLocalLanguageSecurityName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2.mmObject();
			isDerived = false;
			xmlTag = "AbbrvtdLclLangSctyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AbbreviatedLocalLanguageSecurityName";
			definition = "Abbreviated name of underlying securities in the local language. \r\nIn case of non-listed securities, it will be a full local language security name.\r\n銘柄名（銘柄略称.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max240Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2.mmPlaceAndName, com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2.mmFullLocalLanguageSecurityName,
						com.tools20022.repository.msg.UpdatedAdditionalInformation6SD2.mmAbbreviatedLocalLanguageSecurityName);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UpdatedAdditionalInformation6SD2";
				definition = "Extension to provide the local language information of the new company name when the corporate action event type code is CHAN (name change).";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public UpdatedAdditionalInformation6SD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<Max240Text> getFullLocalLanguageSecurityName() {
		return fullLocalLanguageSecurityName == null ? Optional.empty() : Optional.of(fullLocalLanguageSecurityName);
	}

	public UpdatedAdditionalInformation6SD2 setFullLocalLanguageSecurityName(Max240Text fullLocalLanguageSecurityName) {
		this.fullLocalLanguageSecurityName = fullLocalLanguageSecurityName;
		return this;
	}

	public Max240Text getAbbreviatedLocalLanguageSecurityName() {
		return abbreviatedLocalLanguageSecurityName;
	}

	public UpdatedAdditionalInformation6SD2 setAbbreviatedLocalLanguageSecurityName(Max240Text abbreviatedLocalLanguageSecurityName) {
		this.abbreviatedLocalLanguageSecurityName = Objects.requireNonNull(abbreviatedLocalLanguageSecurityName);
		return this;
	}
}