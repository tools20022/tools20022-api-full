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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SecurityIdentification20Choice;
import com.tools20022.repository.codeset.NotAvailable1Code;
import com.tools20022.repository.codeset.NotReported1Code;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.Max52Text;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Query based on various identification of the security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice#mmISIN
 * SecurityIdentificationQuery3Choice.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice#mmAlternativeInstrumentIdentification
 * SecurityIdentificationQuery3Choice.mmAlternativeInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice#mmNotAvailable
 * SecurityIdentificationQuery3Choice.mmNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice#mmUniqueProductIdentifier
 * SecurityIdentificationQuery3Choice.mmUniqueProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice#mmIndex
 * SecurityIdentificationQuery3Choice.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice#mmNotReported
 * SecurityIdentificationQuery3Choice.mmNotReported}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityIdentificationQuery3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Query based on various identification of the security."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityIdentificationQuery3Choice", propOrder = {"iSIN", "alternativeInstrumentIdentification", "notAvailable", "uniqueProductIdentifier", "index", "notReported"})
public class SecurityIdentificationQuery3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISIN")
	protected List<ISINOct2015Identifier> iSIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice
	 * SecurityIdentificationQuery3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentificationQuery3Choice, List<ISINOct2015Identifier>> mmISIN = new MMMessageAttribute<SecurityIdentificationQuery3Choice, List<ISINOct2015Identifier>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country.";
			minOccurs = 0;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public List<ISINOct2015Identifier> getValue(SecurityIdentificationQuery3Choice obj) {
			return obj.getISIN();
		}

		@Override
		public void setValue(SecurityIdentificationQuery3Choice obj, List<ISINOct2015Identifier> value) {
			obj.setISIN(value);
		}
	};
	@XmlElement(name = "AltrntvInstrmId")
	protected List<Max52Text> alternativeInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice
	 * SecurityIdentificationQuery3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrntvInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of a security assigned by an institution or organisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentificationQuery3Choice, List<Max52Text>> mmAlternativeInstrumentIdentification = new MMMessageAttribute<SecurityIdentificationQuery3Choice, List<Max52Text>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmObject();
			isDerived = false;
			xmlTag = "AltrntvInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeInstrumentIdentification";
			definition = "Proprietary identification of a security assigned by an institution or organisation.";
			minOccurs = 0;
			simpleType_lazy = () -> Max52Text.mmObject();
		}

		@Override
		public List<Max52Text> getValue(SecurityIdentificationQuery3Choice obj) {
			return obj.getAlternativeInstrumentIdentification();
		}

		@Override
		public void setValue(SecurityIdentificationQuery3Choice obj, List<Max52Text> value) {
			obj.setAlternativeInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "NotAvlbl")
	protected NotAvailable1Code notAvailable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NotAvailable1Code
	 * NotAvailable1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice
	 * SecurityIdentificationQuery3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotAvlbl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Query for not available value (N/A).\r\n\r\nUsage: N/A means that value was not available at the time of the reporting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentificationQuery3Choice, Optional<NotAvailable1Code>> mmNotAvailable = new MMMessageAttribute<SecurityIdentificationQuery3Choice, Optional<NotAvailable1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmObject();
			isDerived = false;
			xmlTag = "NotAvlbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			definition = "Query for not available value (N/A).\r\n\r\nUsage: N/A means that value was not available at the time of the reporting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NotAvailable1Code.mmObject();
		}

		@Override
		public Optional<NotAvailable1Code> getValue(SecurityIdentificationQuery3Choice obj) {
			return obj.getNotAvailable();
		}

		@Override
		public void setValue(SecurityIdentificationQuery3Choice obj, Optional<NotAvailable1Code> value) {
			obj.setNotAvailable(value.orElse(null));
		}
	};
	@XmlElement(name = "UnqPdctIdr")
	protected List<Max52Text> uniqueProductIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductIdentification
	 * Product.mmProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice
	 * SecurityIdentificationQuery3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnqPdctIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueProductIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification through a unique product identifier."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentificationQuery3Choice, List<Max52Text>> mmUniqueProductIdentifier = new MMMessageAttribute<SecurityIdentificationQuery3Choice, List<Max52Text>>() {
		{
			businessElementTrace_lazy = () -> Product.mmProductIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmObject();
			isDerived = false;
			xmlTag = "UnqPdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueProductIdentifier";
			definition = "Identification through a unique product identifier.";
			minOccurs = 0;
			simpleType_lazy = () -> Max52Text.mmObject();
		}

		@Override
		public List<Max52Text> getValue(SecurityIdentificationQuery3Choice obj) {
			return obj.getUniqueProductIdentifier();
		}

		@Override
		public void setValue(SecurityIdentificationQuery3Choice obj, List<Max52Text> value) {
			obj.setUniqueProductIdentifier(value);
		}
	};
	@XmlElement(name = "Indx")
	protected List<SecurityIdentification20Choice> index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification20Choice
	 * SecurityIdentification20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice
	 * SecurityIdentificationQuery3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Indx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the index on which the financial instrument is based."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityIdentificationQuery3Choice, List<SecurityIdentification20Choice>> mmIndex = new MMMessageAssociationEnd<SecurityIdentificationQuery3Choice, List<SecurityIdentification20Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmObject();
			isDerived = false;
			xmlTag = "Indx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Identification of the index on which the financial instrument is based.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification20Choice.mmObject();
		}

		@Override
		public List<SecurityIdentification20Choice> getValue(SecurityIdentificationQuery3Choice obj) {
			return obj.getIndex();
		}

		@Override
		public void setValue(SecurityIdentificationQuery3Choice obj, List<SecurityIdentification20Choice> value) {
			obj.setIndex(value);
		}
	};
	@XmlElement(name = "NotRptd")
	protected NotReported1Code notReported;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NotReported1Code
	 * NotReported1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice
	 * SecurityIdentificationQuery3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotRptd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Field can be queried for not reported value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentificationQuery3Choice, Optional<NotReported1Code>> mmNotReported = new MMMessageAttribute<SecurityIdentificationQuery3Choice, Optional<NotReported1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmObject();
			isDerived = false;
			xmlTag = "NotRptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReported";
			definition = "Field can be queried for not reported value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NotReported1Code.mmObject();
		}

		@Override
		public Optional<NotReported1Code> getValue(SecurityIdentificationQuery3Choice obj) {
			return obj.getNotReported();
		}

		@Override
		public void setValue(SecurityIdentificationQuery3Choice obj, Optional<NotReported1Code> value) {
			obj.setNotReported(value.orElse(null));
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmISIN,
						com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmAlternativeInstrumentIdentification, com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmNotAvailable,
						com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmUniqueProductIdentifier, com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmIndex,
						com.tools20022.repository.choice.SecurityIdentificationQuery3Choice.mmNotReported);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityIdentificationQuery3Choice";
				definition = "Query based on various identification of the security.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<ISINOct2015Identifier> getISIN() {
		return iSIN == null ? iSIN = new ArrayList<>() : iSIN;
	}

	public SecurityIdentificationQuery3Choice setISIN(List<ISINOct2015Identifier> iSIN) {
		this.iSIN = Objects.requireNonNull(iSIN);
		return this;
	}

	public List<Max52Text> getAlternativeInstrumentIdentification() {
		return alternativeInstrumentIdentification == null ? alternativeInstrumentIdentification = new ArrayList<>() : alternativeInstrumentIdentification;
	}

	public SecurityIdentificationQuery3Choice setAlternativeInstrumentIdentification(List<Max52Text> alternativeInstrumentIdentification) {
		this.alternativeInstrumentIdentification = Objects.requireNonNull(alternativeInstrumentIdentification);
		return this;
	}

	public Optional<NotAvailable1Code> getNotAvailable() {
		return notAvailable == null ? Optional.empty() : Optional.of(notAvailable);
	}

	public SecurityIdentificationQuery3Choice setNotAvailable(NotAvailable1Code notAvailable) {
		this.notAvailable = notAvailable;
		return this;
	}

	public List<Max52Text> getUniqueProductIdentifier() {
		return uniqueProductIdentifier == null ? uniqueProductIdentifier = new ArrayList<>() : uniqueProductIdentifier;
	}

	public SecurityIdentificationQuery3Choice setUniqueProductIdentifier(List<Max52Text> uniqueProductIdentifier) {
		this.uniqueProductIdentifier = Objects.requireNonNull(uniqueProductIdentifier);
		return this;
	}

	public List<SecurityIdentification20Choice> getIndex() {
		return index == null ? index = new ArrayList<>() : index;
	}

	public SecurityIdentificationQuery3Choice setIndex(List<SecurityIdentification20Choice> index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public Optional<NotReported1Code> getNotReported() {
		return notReported == null ? Optional.empty() : Optional.of(notReported);
	}

	public SecurityIdentificationQuery3Choice setNotReported(NotReported1Code notReported) {
		this.notReported = notReported;
		return this;
	}
}