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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.IdentificationIssuerRole;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmDomesticOrProprietaryIdentificationSourceRule
 * AlternateSecurityIdentification1.
 * mmDomesticOrProprietaryIdentificationSourceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmIdentification
 * AlternateSecurityIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmDomesticIdentificationSource
 * AlternateSecurityIdentification1.mmDomesticIdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmProprietaryIdentificationSource
 * AlternateSecurityIdentification1.mmProprietaryIdentificationSource}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AlternateSecurityIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Proprietary or domestic identification scheme that uniquely identifies a security."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7
 * AlternateSecurityIdentification7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AlternateSecurityIdentification1", propOrder = {"identification", "domesticIdentificationSource", "proprietaryIdentificationSource"})
public class AlternateSecurityIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Unique and unambiguous identifier of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1
	 * AlternateSecurityIdentification1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7#mmIdentification
	 * AlternateSecurityIdentification7.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> AlternateSecurityIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of a security.";
			nextVersions_lazy = () -> Arrays.asList(AlternateSecurityIdentification7.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CountryCode domesticIdentificationSource;
	/**
	 * Country of the proprietary identification scheme.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1
	 * AlternateSecurityIdentification1}</li>
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
			componentContext_lazy = () -> AlternateSecurityIdentification1.mmObject();
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
	protected Max35Text proprietaryIdentificationSource;
	/**
	 * Entity that issues the proprietary identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmEntityName
	 * IdentificationIssuerRole.mmEntityName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1
	 * AlternateSecurityIdentification1}</li>
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
			componentContext_lazy = () -> AlternateSecurityIdentification1.mmObject();
			isDerived = false;
			xmlTag = "PrtryIdSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentificationSource";
			definition = "Entity that issues the proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1
	 * AlternateSecurityIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmDomesticIdentificationSource
	 * AlternateSecurityIdentification1.mmDomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmProprietaryIdentificationSource
	 * AlternateSecurityIdentification1.mmProprietaryIdentificationSource}</li>
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
	public static final MMXor mmDomesticOrProprietaryIdentificationSourceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticOrProprietaryIdentificationSourceRule";
			definition = "Either DomesticIdentificationSource or ProprietaryIdentificationSource must be present, but not both.";
			messageComponent_lazy = () -> AlternateSecurityIdentification1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(AlternateSecurityIdentification1.mmDomesticIdentificationSource, AlternateSecurityIdentification1.mmProprietaryIdentificationSource);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AlternateSecurityIdentification1.mmIdentification, AlternateSecurityIdentification1.mmDomesticIdentificationSource,
						AlternateSecurityIdentification1.mmProprietaryIdentificationSource);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AlternateSecurityIdentification1";
				definition = "Proprietary or domestic identification scheme that uniquely identifies a security.";
				nextVersions_lazy = () -> Arrays.asList(AlternateSecurityIdentification7.mmObject());
				xors_lazy = () -> Arrays.asList(AlternateSecurityIdentification1.mmDomesticOrProprietaryIdentificationSourceRule);
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

	@XmlElement(name = "DmstIdSrc", required = true)
	public CountryCode getDomesticIdentificationSource() {
		return domesticIdentificationSource;
	}

	public void setDomesticIdentificationSource(CountryCode domesticIdentificationSource) {
		this.domesticIdentificationSource = domesticIdentificationSource;
	}

	@XmlElement(name = "PrtryIdSrc", required = true)
	public Max35Text getProprietaryIdentificationSource() {
		return proprietaryIdentificationSource;
	}

	public void setProprietaryIdentificationSource(Max35Text proprietaryIdentificationSource) {
		this.proprietaryIdentificationSource = proprietaryIdentificationSource;
	}
}