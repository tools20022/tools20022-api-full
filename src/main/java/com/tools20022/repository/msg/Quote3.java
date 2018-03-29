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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification24Choice;
import com.tools20022.repository.choice.PartyIdentification25Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Quote;
import com.tools20022.repository.entity.QuoteOriginator;
import com.tools20022.repository.entity.QuoteRequestor;
import com.tools20022.repository.entity.SecuritiesQuoteVariable;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price1;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Proposition of price for a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmType Quote3.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmQualifier
 * Quote3.mmQualifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmValidUntilDateTime
 * Quote3.mmValidUntilDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmPreviousClosingPrice
 * Quote3.mmPreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmPriceType
 * Quote3.mmPriceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmRequestedPrice
 * Quote3.mmRequestedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmCurrency
 * Quote3.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmQuoteOriginator
 * Quote3.mmQuoteOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmQuoteOriginatorRole
 * Quote3.mmQuoteOriginatorRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmRequestorEligibility
 * Quote3.mmRequestorEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote3#mmSourceOfQuote
 * Quote3.mmSourceOfQuote}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
 * SecuritiesQuoteVariable}</li>
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
 * "Quote3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Proposition of price for a financial instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Quote3", propOrder = {"type", "qualifier", "validUntilDateTime", "previousClosingPrice", "priceType", "requestedPrice", "currency", "quoteOriginator", "quoteOriginatorRole", "requestorEligibility", "sourceOfQuote"})
public class Quote3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected QuoteType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteType1Code
	 * QuoteType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmType
	 * SecuritiesQuoteVariable.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 537</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote3, Optional<QuoteType1Code>> mmType = new MMMessageAttribute<Quote3, Optional<QuoteType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "537"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QuoteType1Code.mmObject();
		}

		@Override
		public Optional<QuoteType1Code> getValue(Quote3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Quote3 obj, Optional<QuoteType1Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Qlfr")
	protected List<Qualifier1Code> qualifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmQualifier
	 * SecuritiesQuoteVariable.mmQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qlfr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 695</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Qualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the use of the quote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote3, List<Qualifier1Code>> mmQualifier = new MMMessageAttribute<Quote3, List<Qualifier1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmQualifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "Qlfr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "695"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the quote.";
			minOccurs = 0;
			simpleType_lazy = () -> Qualifier1Code.mmObject();
		}

		@Override
		public List<Qualifier1Code> getValue(Quote3 obj) {
			return obj.getQualifier();
		}

		@Override
		public void setValue(Quote3 obj, List<Qualifier1Code> value) {
			obj.setQualifier(value);
		}
	};
	@XmlElement(name = "VldUntilDtTm")
	protected ISODateTime validUntilDateTime;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldUntilDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 62</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidUntilDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expresses the validity date and time of the Quote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote3, Optional<ISODateTime>> mmValidUntilDateTime = new MMMessageAttribute<Quote3, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmValidUntilDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "VldUntilDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "62"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidUntilDateTime";
			definition = "Expresses the validity date and time of the Quote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Quote3 obj) {
			return obj.getValidUntilDateTime();
		}

		@Override
		public void setValue(Quote3 obj, Optional<ISODateTime> value) {
			obj.setValidUntilDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsClsgPric")
	protected Price1 previousClosingPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmPreviousClosingPrice
	 * Quote.mmPreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsClsgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Previous closing price of the financial instrument - Useful for verifying its identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote3, Optional<Price1>> mmPreviousClosingPrice = new MMMessageAttribute<Quote3, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmPreviousClosingPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "PrvsClsgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Previous closing price of the financial instrument - Useful for verifying its identification.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(Quote3 obj) {
			return obj.getPreviousClosingPrice();
		}

		@Override
		public void setValue(Quote3 obj, Optional<Price1> value) {
			obj.setPreviousClosingPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "PricTp")
	protected PriceValueType3Code priceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType3Code
	 * PriceValueType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmPriceType
	 * SecuritiesQuoteVariable.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 692</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Initiator can specify the price type the quote needs to be quoted at. If not specified, the respondent has option to specify how quote is quoted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote3, Optional<PriceValueType3Code>> mmPriceType = new MMMessageAttribute<Quote3, Optional<PriceValueType3Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "PricTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "692"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceType";
			definition = "Initiator can specify the price type the quote needs to be quoted at. If not specified, the respondent has option to specify how quote is quoted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PriceValueType3Code.mmObject();
		}

		@Override
		public Optional<PriceValueType3Code> getValue(Quote3 obj) {
			return obj.getPriceType();
		}

		@Override
		public void setValue(Quote3 obj, Optional<PriceValueType3Code> value) {
			obj.setPriceType(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdPric")
	protected Price1 requestedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmRequestedPrice
	 * Quote.mmRequestedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 44, FIXSynonym: 423</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Is used to specify the desired currency of the quoted price when they differ from the normal trading currency of the instrument being quote requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote3, Optional<Price1>> mmRequestedPrice = new MMMessageAttribute<Quote3, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmRequestedPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "ReqdPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "44"), new FIXSynonym(this, "423"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedPrice";
			definition = "Is used to specify the desired currency of the quoted price when they differ from the normal trading currency of the instrument being quote requested.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(Quote3 obj) {
			return obj.getRequestedPrice();
		}

		@Override
		public void setValue(Quote3 obj, Optional<Price1> value) {
			obj.setRequestedPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmCurrency
	 * Quote.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Can be used to specify the desired currency of the quoted price that may differ from the normal trading currency of the instrument being quote requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote3, Optional<CurrencyCode>> mmCurrency = new MMMessageAttribute<Quote3, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Can be used to specify the desired currency of the quoted price that may differ from the normal trading currency of the instrument being quote requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(Quote3 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(Quote3 obj, Optional<CurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "QtOrgtr")
	protected PartyIdentification24Choice quoteOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification24Choice
	 * PartyIdentification24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Originator of the quote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote3, Optional<PartyIdentification24Choice>> mmQuoteOriginator = new MMMessageAttribute<Quote3, Optional<PartyIdentification24Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "QtOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteOriginator";
			definition = "Originator of the quote.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification24Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification24Choice> getValue(Quote3 obj) {
			return obj.getQuoteOriginator();
		}

		@Override
		public void setValue(Quote3 obj, Optional<PartyIdentification24Choice> value) {
			obj.setQuoteOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "QtOrgtrRole")
	protected OriginatorRole1Code quoteOriginatorRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRole1Code
	 * OriginatorRole1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuoteOriginator#mmQuoteOriginatorType
	 * QuoteOriginator.mmQuoteOriginatorType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtOrgtrRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteOriginatorRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in what capacity(role) the originator of the quote is acting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote3, Optional<OriginatorRole1Code>> mmQuoteOriginatorRole = new MMMessageAttribute<Quote3, Optional<OriginatorRole1Code>>() {
		{
			businessElementTrace_lazy = () -> QuoteOriginator.mmQuoteOriginatorType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "QtOrgtrRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteOriginatorRole";
			definition = "Identifies in what capacity(role) the originator of the quote is acting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OriginatorRole1Code.mmObject();
		}

		@Override
		public Optional<OriginatorRole1Code> getValue(Quote3 obj) {
			return obj.getQuoteOriginatorRole();
		}

		@Override
		public void setValue(Quote3 obj, Optional<OriginatorRole1Code> value) {
			obj.setQuoteOriginatorRole(value.orElse(null));
		}
	};
	@XmlElement(name = "RqstrElgblty")
	protected Eligibility1Code requestorEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code
	 * Eligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuoteRequestor#mmRequestorEligibility
	 * QuoteRequestor.mmRequestorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqstrElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestorEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the requestor of the quote is an elligible counterparty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quote3, Optional<Eligibility1Code>> mmRequestorEligibility = new MMMessageAttribute<Quote3, Optional<Eligibility1Code>>() {
		{
			businessElementTrace_lazy = () -> QuoteRequestor.mmRequestorEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "RqstrElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestorEligibility";
			definition = "Identifies if the requestor of the quote is an elligible counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligibility1Code.mmObject();
		}

		@Override
		public Optional<Eligibility1Code> getValue(Quote3 obj) {
			return obj.getRequestorEligibility();
		}

		@Override
		public void setValue(Quote3 obj, Optional<Eligibility1Code> value) {
			obj.setRequestorEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "SrcOfQt")
	protected PartyIdentification25Choice sourceOfQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification25Choice
	 * PartyIdentification25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote3
	 * Quote3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcOfQt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the source of the quote."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Quote3, Optional<PartyIdentification25Choice>> mmSourceOfQuote = new MMMessageAssociationEnd<Quote3, Optional<PartyIdentification25Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote3.mmObject();
			isDerived = false;
			xmlTag = "SrcOfQt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfQuote";
			definition = "Identifies the source of the quote.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification25Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification25Choice> getValue(Quote3 obj) {
			return obj.getSourceOfQuote();
		}

		@Override
		public void setValue(Quote3 obj, Optional<PartyIdentification25Choice> value) {
			obj.setSourceOfQuote(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quote3.mmType, com.tools20022.repository.msg.Quote3.mmQualifier, com.tools20022.repository.msg.Quote3.mmValidUntilDateTime,
						com.tools20022.repository.msg.Quote3.mmPreviousClosingPrice, com.tools20022.repository.msg.Quote3.mmPriceType, com.tools20022.repository.msg.Quote3.mmRequestedPrice, com.tools20022.repository.msg.Quote3.mmCurrency,
						com.tools20022.repository.msg.Quote3.mmQuoteOriginator, com.tools20022.repository.msg.Quote3.mmQuoteOriginatorRole, com.tools20022.repository.msg.Quote3.mmRequestorEligibility,
						com.tools20022.repository.msg.Quote3.mmSourceOfQuote);
				trace_lazy = () -> SecuritiesQuoteVariable.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Quote3";
				definition = "Proposition of price for a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<QuoteType1Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public Quote3 setType(QuoteType1Code type) {
		this.type = type;
		return this;
	}

	public List<Qualifier1Code> getQualifier() {
		return qualifier == null ? qualifier = new ArrayList<>() : qualifier;
	}

	public Quote3 setQualifier(List<Qualifier1Code> qualifier) {
		this.qualifier = Objects.requireNonNull(qualifier);
		return this;
	}

	public Optional<ISODateTime> getValidUntilDateTime() {
		return validUntilDateTime == null ? Optional.empty() : Optional.of(validUntilDateTime);
	}

	public Quote3 setValidUntilDateTime(ISODateTime validUntilDateTime) {
		this.validUntilDateTime = validUntilDateTime;
		return this;
	}

	public Optional<Price1> getPreviousClosingPrice() {
		return previousClosingPrice == null ? Optional.empty() : Optional.of(previousClosingPrice);
	}

	public Quote3 setPreviousClosingPrice(Price1 previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
		return this;
	}

	public Optional<PriceValueType3Code> getPriceType() {
		return priceType == null ? Optional.empty() : Optional.of(priceType);
	}

	public Quote3 setPriceType(PriceValueType3Code priceType) {
		this.priceType = priceType;
		return this;
	}

	public Optional<Price1> getRequestedPrice() {
		return requestedPrice == null ? Optional.empty() : Optional.of(requestedPrice);
	}

	public Quote3 setRequestedPrice(Price1 requestedPrice) {
		this.requestedPrice = requestedPrice;
		return this;
	}

	public Optional<CurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public Quote3 setCurrency(CurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<PartyIdentification24Choice> getQuoteOriginator() {
		return quoteOriginator == null ? Optional.empty() : Optional.of(quoteOriginator);
	}

	public Quote3 setQuoteOriginator(PartyIdentification24Choice quoteOriginator) {
		this.quoteOriginator = quoteOriginator;
		return this;
	}

	public Optional<OriginatorRole1Code> getQuoteOriginatorRole() {
		return quoteOriginatorRole == null ? Optional.empty() : Optional.of(quoteOriginatorRole);
	}

	public Quote3 setQuoteOriginatorRole(OriginatorRole1Code quoteOriginatorRole) {
		this.quoteOriginatorRole = quoteOriginatorRole;
		return this;
	}

	public Optional<Eligibility1Code> getRequestorEligibility() {
		return requestorEligibility == null ? Optional.empty() : Optional.of(requestorEligibility);
	}

	public Quote3 setRequestorEligibility(Eligibility1Code requestorEligibility) {
		this.requestorEligibility = requestorEligibility;
		return this;
	}

	public Optional<PartyIdentification25Choice> getSourceOfQuote() {
		return sourceOfQuote == null ? Optional.empty() : Optional.of(sourceOfQuote);
	}

	public Quote3 setSourceOfQuote(PartyIdentification25Choice sourceOfQuote) {
		this.sourceOfQuote = sourceOfQuote;
		return this;
	}
}