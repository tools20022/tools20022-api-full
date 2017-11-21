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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Quote;
import com.tools20022.repository.entity.SecuritiesQuoteVariable;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies a group of related quotes. This can, for example be used to
 * represent an option class.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSet2#mmIdentification
 * QuoteSet2.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSet2#mmValidUntilDateTime
 * QuoteSet2.mmValidUntilDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSet2#mmQuoteEntryDetails
 * QuoteSet2.mmQuoteEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteSet2#mmUnderlyingFinancialInstrument
 * QuoteSet2.mmUnderlyingFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteSet2#mmUnderlyingFinancialInstrumentAttributes
 * QuoteSet2.mmUnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteSet2#mmUnderlyingStipulations
 * QuoteSet2.mmUnderlyingStipulations}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
 * SecuritiesQuoteVariable}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteSet2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a group of related quotes. This can, for example be used to represent an option class."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "QuoteSet2", propOrder = {"identification", "validUntilDateTime", "quoteEntryDetails", "underlyingFinancialInstrument", "underlyingFinancialInstrumentAttributes", "underlyingStipulations"})
public class QuoteSet2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Identification of a set of quotes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSet2
	 * QuoteSet2}</li>
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
	 * definition} = "Identification of a set of quotes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> QuoteSet2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of a set of quotes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime validUntilDateTime;
	/**
	 * Expresses the validity of a set of quotes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmValidUntilDateTime
	 * Quote.mmValidUntilDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSet2
	 * QuoteSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldUntilDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidUntilDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expresses the validity of a set of quotes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidUntilDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quote.mmValidUntilDateTime;
			componentContext_lazy = () -> QuoteSet2.mmObject();
			isDerived = false;
			xmlTag = "VldUntilDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidUntilDateTime";
			definition = "Expresses the validity of a set of quotes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QuoteEntry2> quoteEntryDetails;
	/**
	 * Details of the quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuoteEntry2
	 * QuoteEntry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSet2
	 * QuoteSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtNtryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteEntryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the quote."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuoteEntryDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesQuoteVariable.mmObject();
			componentContext_lazy = () -> QuoteSet2.mmObject();
			isDerived = false;
			xmlTag = "QtNtryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteEntryDetails";
			definition = "Details of the quote.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecurityIdentification7> underlyingFinancialInstrument;
	/**
	 * Provides details about the underlying financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSet2
	 * QuoteSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingFinancialInstrument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> QuoteSet2.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrument";
			definition = "Provides details about the underlying financial instrument.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	protected FinancialInstrumentAttributes1 underlyingFinancialInstrumentAttributes;
	/**
	 * Provides details about the underlying financial instrument attributes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuotedSecurity
	 * Quote.mmQuotedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSet2
	 * QuoteSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument attributes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Quote.mmQuotedSecurity;
			componentContext_lazy = () -> QuoteSet2.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentAttributes";
			definition = "Provides details about the underlying financial instrument attributes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
		}
	};
	protected FinancialInstrumentStipulations underlyingStipulations;
	/**
	 * Provides details about the underlying financial instrument stipulations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuotedSecurity
	 * Quote.mmQuotedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSet2
	 * QuoteSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygStiptns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingStipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument stipulations."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingStipulations = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Quote.mmQuotedSecurity;
			componentContext_lazy = () -> QuoteSet2.mmObject();
			isDerived = false;
			xmlTag = "UndrlygStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingStipulations";
			definition = "Provides details about the underlying financial instrument stipulations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(QuoteSet2.mmIdentification, QuoteSet2.mmValidUntilDateTime, QuoteSet2.mmQuoteEntryDetails, QuoteSet2.mmUnderlyingFinancialInstrument,
						QuoteSet2.mmUnderlyingFinancialInstrumentAttributes, QuoteSet2.mmUnderlyingStipulations);
				trace_lazy = () -> SecuritiesQuoteVariable.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QuoteSet2";
				definition = "Identifies a group of related quotes. This can, for example be used to represent an option class.";
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

	@XmlElement(name = "VldUntilDtTm")
	public ISODateTime getValidUntilDateTime() {
		return validUntilDateTime;
	}

	public void setValidUntilDateTime(ISODateTime validUntilDateTime) {
		this.validUntilDateTime = validUntilDateTime;
	}

	@XmlElement(name = "QtNtryDtls")
	public List<QuoteEntry2> getQuoteEntryDetails() {
		return quoteEntryDetails;
	}

	public void setQuoteEntryDetails(List<com.tools20022.repository.msg.QuoteEntry2> quoteEntryDetails) {
		this.quoteEntryDetails = quoteEntryDetails;
	}

	@XmlElement(name = "UndrlygFinInstrm", required = true)
	public List<SecurityIdentification7> getUnderlyingFinancialInstrument() {
		return underlyingFinancialInstrument;
	}

	public void setUnderlyingFinancialInstrument(List<com.tools20022.repository.msg.SecurityIdentification7> underlyingFinancialInstrument) {
		this.underlyingFinancialInstrument = underlyingFinancialInstrument;
	}

	@XmlElement(name = "UndrlygFinInstrmAttrbts")
	public FinancialInstrumentAttributes1 getUnderlyingFinancialInstrumentAttributes() {
		return underlyingFinancialInstrumentAttributes;
	}

	public void setUnderlyingFinancialInstrumentAttributes(com.tools20022.repository.msg.FinancialInstrumentAttributes1 underlyingFinancialInstrumentAttributes) {
		this.underlyingFinancialInstrumentAttributes = underlyingFinancialInstrumentAttributes;
	}

	@XmlElement(name = "UndrlygStiptns")
	public FinancialInstrumentStipulations getUnderlyingStipulations() {
		return underlyingStipulations;
	}

	public void setUnderlyingStipulations(com.tools20022.repository.msg.FinancialInstrumentStipulations underlyingStipulations) {
		this.underlyingStipulations = underlyingStipulations;
	}
}