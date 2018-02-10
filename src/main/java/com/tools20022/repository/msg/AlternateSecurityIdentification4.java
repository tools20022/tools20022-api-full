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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.RestrictedFINExact2Text;
import com.tools20022.repository.datatype.RestrictedFINMax31Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.IdentificationIssuerRole;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Proprietary or domestic identification scheme that uniquely identifies a
 * security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#DomesticOrProprietaryIdentificationSourceRule
 * AlternateSecurityIdentification4.
 * DomesticOrProprietaryIdentificationSourceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#mmIdentification
 * AlternateSecurityIdentification4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#mmDomesticIdentificationSource
 * AlternateSecurityIdentification4.mmDomesticIdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#mmProprietaryIdentificationSource
 * AlternateSecurityIdentification4.mmProprietaryIdentificationSource}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AlternateSecurityIdentification4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Proprietary or domestic identification scheme that uniquely identifies a security."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AlternateSecurityIdentification4", propOrder = {"identification", "domesticIdentificationSource", "proprietaryIdentificationSource"})
public class AlternateSecurityIdentification4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected RestrictedFINMax31Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINMax31Text
	 * RestrictedFINMax31Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4
	 * AlternateSecurityIdentification4}</li>
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
	 * definition} = "Unique and unambiguous identifier of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateSecurityIdentification4.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINMax31Text.mmObject();
		}
	};
	@XmlElement(name = "DmstIdSrc", required = true)
	protected CountryCode domesticIdentificationSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmCountry
	 * IdentificationIssuerRole.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4
	 * AlternateSecurityIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmstIdSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticIdentificationSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the proprietary identification scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDomesticIdentificationSource = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IdentificationIssuerRole.mmCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateSecurityIdentification4.mmObject();
			isDerived = false;
			xmlTag = "DmstIdSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticIdentificationSource";
			definition = "Country of the proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "PrtryIdSrc", required = true)
	protected RestrictedFINExact2Text proprietaryIdentificationSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINExact2Text
	 * RestrictedFINExact2Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmEntityName
	 * IdentificationIssuerRole.mmEntityName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4
	 * AlternateSecurityIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryIdSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentificationSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that issues the proprietary identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryIdentificationSource = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IdentificationIssuerRole.mmEntityName;
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateSecurityIdentification4.mmObject();
			isDerived = false;
			xmlTag = "PrtryIdSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentificationSource";
			definition = "Entity that issues the proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINExact2Text.mmObject();
		}
	};
	/**
	 * Either DomesticIdentificationSource or ProprietaryIdentificationSource
	 * must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4
	 * AlternateSecurityIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#mmDomesticIdentificationSource
	 * AlternateSecurityIdentification4.mmDomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#mmProprietaryIdentificationSource
	 * AlternateSecurityIdentification4.mmProprietaryIdentificationSource}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticOrProprietaryIdentificationSourceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DomesticIdentificationSource or ProprietaryIdentificationSource must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor DomesticOrProprietaryIdentificationSourceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticOrProprietaryIdentificationSourceRule";
			definition = "Either DomesticIdentificationSource or ProprietaryIdentificationSource must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.AlternateSecurityIdentification4.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateSecurityIdentification4.mmDomesticIdentificationSource,
					com.tools20022.repository.msg.AlternateSecurityIdentification4.mmProprietaryIdentificationSource);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateSecurityIdentification4.mmIdentification, com.tools20022.repository.msg.AlternateSecurityIdentification4.mmDomesticIdentificationSource,
						com.tools20022.repository.msg.AlternateSecurityIdentification4.mmProprietaryIdentificationSource);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AlternateSecurityIdentification4";
				definition = "Proprietary or domestic identification scheme that uniquely identifies a security.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateSecurityIdentification4.DomesticOrProprietaryIdentificationSourceRule);
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINMax31Text getIdentification() {
		return identification;
	}

	public AlternateSecurityIdentification4 setIdentification(RestrictedFINMax31Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CountryCode getDomesticIdentificationSource() {
		return domesticIdentificationSource;
	}

	public AlternateSecurityIdentification4 setDomesticIdentificationSource(CountryCode domesticIdentificationSource) {
		this.domesticIdentificationSource = Objects.requireNonNull(domesticIdentificationSource);
		return this;
	}

	public RestrictedFINExact2Text getProprietaryIdentificationSource() {
		return proprietaryIdentificationSource;
	}

	public AlternateSecurityIdentification4 setProprietaryIdentificationSource(RestrictedFINExact2Text proprietaryIdentificationSource) {
		this.proprietaryIdentificationSource = Objects.requireNonNull(proprietaryIdentificationSource);
		return this;
	}
}