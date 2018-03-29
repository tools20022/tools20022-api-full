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
import com.tools20022.repository.datatype.Max16Text;
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
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A proprietary or domestic identification scheme that uniquely identifies a
 * financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#DomesticOrProprietaryIdentificationSourceRule
 * AlternateFinancialInstrumentIdentification1.
 * DomesticOrProprietaryIdentificationSourceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmDomesticIdentificationSource
 * AlternateFinancialInstrumentIdentification1.mmDomesticIdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmProprietaryIdentificationSource
 * AlternateFinancialInstrumentIdentification1.mmProprietaryIdentificationSource
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmIdentification
 * AlternateFinancialInstrumentIdentification1.mmIdentification}</li>
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
 * "AlternateFinancialInstrumentIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A proprietary or domestic identification scheme that uniquely identifies a financial instrument."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AlternateFinancialInstrumentIdentification1", propOrder = {"domesticIdentificationSource", "proprietaryIdentificationSource", "identification"})
public class AlternateFinancialInstrumentIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1
	 * AlternateFinancialInstrumentIdentification1}</li>
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
	public static final MMMessageAttribute<AlternateFinancialInstrumentIdentification1, CountryCode> mmDomesticIdentificationSource = new MMMessageAttribute<AlternateFinancialInstrumentIdentification1, CountryCode>() {
		{
			businessElementTrace_lazy = () -> IdentificationIssuerRole.mmCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "DmstIdSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticIdentificationSource";
			definition = "Country of the proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(AlternateFinancialInstrumentIdentification1 obj) {
			return obj.getDomesticIdentificationSource();
		}

		@Override
		public void setValue(AlternateFinancialInstrumentIdentification1 obj, CountryCode value) {
			obj.setDomesticIdentificationSource(value);
		}
	};
	@XmlElement(name = "PrtryIdSrc", required = true)
	protected Max16Text proprietaryIdentificationSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmEntityName
	 * IdentificationIssuerRole.mmEntityName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1
	 * AlternateFinancialInstrumentIdentification1}</li>
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
	public static final MMMessageAttribute<AlternateFinancialInstrumentIdentification1, Max16Text> mmProprietaryIdentificationSource = new MMMessageAttribute<AlternateFinancialInstrumentIdentification1, Max16Text>() {
		{
			businessElementTrace_lazy = () -> IdentificationIssuerRole.mmEntityName;
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "PrtryIdSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentificationSource";
			definition = "Entity that issues the proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(AlternateFinancialInstrumentIdentification1 obj) {
			return obj.getProprietaryIdentificationSource();
		}

		@Override
		public void setValue(AlternateFinancialInstrumentIdentification1 obj, Max16Text value) {
			obj.setProprietaryIdentificationSource(value);
		}
	};
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1
	 * AlternateFinancialInstrumentIdentification1}</li>
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
	public static final MMMessageAttribute<AlternateFinancialInstrumentIdentification1, Max35Text> mmIdentification = new MMMessageAttribute<AlternateFinancialInstrumentIdentification1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AlternateFinancialInstrumentIdentification1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AlternateFinancialInstrumentIdentification1 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	/**
	 * Either DomesticIdentificationSource or ProprietaryIdentificationSource
	 * must be present but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1
	 * AlternateFinancialInstrumentIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmDomesticIdentificationSource
	 * AlternateFinancialInstrumentIdentification1.
	 * mmDomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmProprietaryIdentificationSource
	 * AlternateFinancialInstrumentIdentification1.
	 * mmProprietaryIdentificationSource}</li>
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
	 * "Either DomesticIdentificationSource or ProprietaryIdentificationSource must be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor DomesticOrProprietaryIdentificationSourceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticOrProprietaryIdentificationSourceRule";
			definition = "Either DomesticIdentificationSource or ProprietaryIdentificationSource must be present but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmDomesticIdentificationSource,
					com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmProprietaryIdentificationSource);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmDomesticIdentificationSource,
						com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmProprietaryIdentificationSource, com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmIdentification);
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
				name = "AlternateFinancialInstrumentIdentification1";
				definition = "A proprietary or domestic identification scheme that uniquely identifies a financial instrument.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.DomesticOrProprietaryIdentificationSourceRule);
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getDomesticIdentificationSource() {
		return domesticIdentificationSource;
	}

	public AlternateFinancialInstrumentIdentification1 setDomesticIdentificationSource(CountryCode domesticIdentificationSource) {
		this.domesticIdentificationSource = Objects.requireNonNull(domesticIdentificationSource);
		return this;
	}

	public Max16Text getProprietaryIdentificationSource() {
		return proprietaryIdentificationSource;
	}

	public AlternateFinancialInstrumentIdentification1 setProprietaryIdentificationSource(Max16Text proprietaryIdentificationSource) {
		this.proprietaryIdentificationSource = Objects.requireNonNull(proprietaryIdentificationSource);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public AlternateFinancialInstrumentIdentification1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}
}