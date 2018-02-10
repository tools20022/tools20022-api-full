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
import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification24Choice;
import com.tools20022.repository.choice.PartyIdentification25Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmType Quote1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmQualifier
 * Quote1.mmQualifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmValidUntilDateTime
 * Quote1.mmValidUntilDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmQuoteOriginator
 * Quote1.mmQuoteOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmQuoteOriginatorRole
 * Quote1.mmQuoteOriginatorRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmRequestorEligibility
 * Quote1.mmRequestorEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmCurrency
 * Quote1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmSpreadAndBenchmarkCurveDetails
 * Quote1.mmSpreadAndBenchmarkCurveDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmOfferYield
 * Quote1.mmOfferYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmMidYield
 * Quote1.mmMidYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmBidYield
 * Quote1.mmBidYield}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmSourceOfQuote
 * Quote1.mmSourceOfQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmFinancialInstrumentDetails
 * Quote1.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmUnderlyingFinancialInstrumentDetails
 * Quote1.mmUnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmFinancialInstrumentAttributes
 * Quote1.mmFinancialInstrumentAttributes}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quote1#mmStipulations
 * Quote1.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmUnderlyingFinancialAttributes
 * Quote1.mmUnderlyingFinancialAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quote1#mmUnderlyingStipulations
 * Quote1.mmUnderlyingStipulations}</li>
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
 * "Quote1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Proposition of price for a financial instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Quote1", propOrder = {"type", "qualifier", "validUntilDateTime", "quoteOriginator", "quoteOriginatorRole", "requestorEligibility", "currency", "spreadAndBenchmarkCurveDetails", "offerYield", "midYield", "bidYield",
		"sourceOfQuote", "financialInstrumentDetails", "underlyingFinancialInstrumentDetails", "financialInstrumentAttributes", "stipulations", "underlyingFinancialAttributes", "underlyingStipulations"})
public class Quote1 {

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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
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
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qlfr"</li>
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
	public static final MMMessageAttribute mmQualifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmQualifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "Qlfr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the quote.";
			minOccurs = 0;
			simpleType_lazy = () -> Qualifier1Code.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
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
	public static final MMMessageAttribute mmValidUntilDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quote.mmValidUntilDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuoteOriginator
	 * QuoteOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 452/61</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in what capacity(role) the originator of the quote is acting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuoteOriginator = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> QuoteOriginator.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "QtOrgtr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452/61"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteOriginator";
			definition = "Identifies in what capacity(role) the originator of the quote is acting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification24Choice.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtOrgtrRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 452/63,64,65,66,67</li>
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
	public static final MMMessageAttribute mmQuoteOriginatorRole = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> QuoteOriginator.mmQuoteOriginatorType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "QtOrgtrRole";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452/63,64,65,66,67"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteOriginatorRole";
			definition = "Identifies in what capacity(role) the originator of the quote is acting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OriginatorRole1Code.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqstrElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=MIFID requirement, value=MIFID</li>
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
	public static final MMMessageAttribute mmRequestorEligibility = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> QuoteRequestor.mmRequestorEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "RqstrElgblty";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "MIFID requirement"}, new String[]{"value", "MIFID"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestorEligibility";
			definition = "Identifies if the requestor of the quote is an elligible counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligibility1Code.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 15</li>
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
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quote.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "15"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Can be used to specify the desired currency of the quoted price that may differ from the normal trading currency of the instrument being quote requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "SprdAndBchmkCrvDtls")
	protected BenchmarkCurve1 spreadAndBenchmarkCurveDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BenchmarkCurve1
	 * BenchmarkCurve1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkCurve
	 * Spread.mmBenchmarkCurve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SprdAndBchmkCrvDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadAndBenchmarkCurveDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the benchmark against which the financial instrument is measured."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpreadAndBenchmarkCurveDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Spread.mmBenchmarkCurve;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "SprdAndBchmkCrvDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadAndBenchmarkCurveDetails";
			definition = "Provides details about the benchmark against which the financial instrument is measured.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve1.mmObject();
		}
	};
	@XmlElement(name = "OfferYld")
	protected YieldCalculation1 offerYield;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferYld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the offer yield details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOfferYield = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> YieldCalculation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "OfferYld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferYield";
			definition = "Indicates the offer yield details.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
		}
	};
	@XmlElement(name = "MidYld")
	protected YieldCalculation1 midYield;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MidYld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the mid yield details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMidYield = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> YieldCalculation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "MidYld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidYield";
			definition = "Indicates the mid yield details.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
		}
	};
	@XmlElement(name = "BidYld")
	protected YieldCalculation1 bidYield;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidYld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the bid yield details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBidYield = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> YieldCalculation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "BidYld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidYield";
			definition = "Indicates the bid yield details.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
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
	 * definition} = "Source of the quote."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSourceOfQuote = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "SrcOfQt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfQuote";
			definition = "Source of the quote.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification25Choice.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected SecurityIdentification7 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Provides details about the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	@XmlElement(name = "UndrlygFinInstrmDtls")
	protected List<com.tools20022.repository.msg.SecurityIdentification7> underlyingFinancialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentDetails";
			definition = "Provides details about the underlying financial instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmAttrbts", required = true)
	protected FinancialInstrumentAttributes1 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument attributes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Provides details about the financial instrument attributes.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
		}
	};
	@XmlElement(name = "Stiptns")
	protected FinancialInstrumentStipulations stipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stiptns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument stipulations."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStipulations = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "Stiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stipulations";
			definition = "Provides details about the financial instrument stipulations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations.mmObject();
		}
	};
	@XmlElement(name = "UndrlygFinAttrbts")
	protected List<com.tools20022.repository.msg.FinancialInstrumentAttributes1> underlyingFinancialAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument attributes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingFinancialAttributes = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialAttributes";
			definition = "Provides details about the underlying financial instrument attributes.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
		}
	};
	@XmlElement(name = "UndrlygStiptns")
	protected List<com.tools20022.repository.msg.FinancialInstrumentStipulations> underlyingStipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quote1
	 * Quote1}</li>
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
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Quote1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingStipulations";
			definition = "Provides details about the underlying financial instrument stipulations.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quote1.mmType, com.tools20022.repository.msg.Quote1.mmQualifier, com.tools20022.repository.msg.Quote1.mmValidUntilDateTime,
						com.tools20022.repository.msg.Quote1.mmQuoteOriginator, com.tools20022.repository.msg.Quote1.mmQuoteOriginatorRole, com.tools20022.repository.msg.Quote1.mmRequestorEligibility,
						com.tools20022.repository.msg.Quote1.mmCurrency, com.tools20022.repository.msg.Quote1.mmSpreadAndBenchmarkCurveDetails, com.tools20022.repository.msg.Quote1.mmOfferYield,
						com.tools20022.repository.msg.Quote1.mmMidYield, com.tools20022.repository.msg.Quote1.mmBidYield, com.tools20022.repository.msg.Quote1.mmSourceOfQuote,
						com.tools20022.repository.msg.Quote1.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Quote1.mmUnderlyingFinancialInstrumentDetails, com.tools20022.repository.msg.Quote1.mmFinancialInstrumentAttributes,
						com.tools20022.repository.msg.Quote1.mmStipulations, com.tools20022.repository.msg.Quote1.mmUnderlyingFinancialAttributes, com.tools20022.repository.msg.Quote1.mmUnderlyingStipulations);
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
				name = "Quote1";
				definition = "Proposition of price for a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<QuoteType1Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public Quote1 setType(QuoteType1Code type) {
		this.type = type;
		return this;
	}

	public List<Qualifier1Code> getQualifier() {
		return qualifier == null ? qualifier = new ArrayList<>() : qualifier;
	}

	public Quote1 setQualifier(List<Qualifier1Code> qualifier) {
		this.qualifier = Objects.requireNonNull(qualifier);
		return this;
	}

	public Optional<ISODateTime> getValidUntilDateTime() {
		return validUntilDateTime == null ? Optional.empty() : Optional.of(validUntilDateTime);
	}

	public Quote1 setValidUntilDateTime(ISODateTime validUntilDateTime) {
		this.validUntilDateTime = validUntilDateTime;
		return this;
	}

	public Optional<PartyIdentification24Choice> getQuoteOriginator() {
		return quoteOriginator == null ? Optional.empty() : Optional.of(quoteOriginator);
	}

	public Quote1 setQuoteOriginator(PartyIdentification24Choice quoteOriginator) {
		this.quoteOriginator = quoteOriginator;
		return this;
	}

	public Optional<OriginatorRole1Code> getQuoteOriginatorRole() {
		return quoteOriginatorRole == null ? Optional.empty() : Optional.of(quoteOriginatorRole);
	}

	public Quote1 setQuoteOriginatorRole(OriginatorRole1Code quoteOriginatorRole) {
		this.quoteOriginatorRole = quoteOriginatorRole;
		return this;
	}

	public Optional<Eligibility1Code> getRequestorEligibility() {
		return requestorEligibility == null ? Optional.empty() : Optional.of(requestorEligibility);
	}

	public Quote1 setRequestorEligibility(Eligibility1Code requestorEligibility) {
		this.requestorEligibility = requestorEligibility;
		return this;
	}

	public Optional<CurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public Quote1 setCurrency(CurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<BenchmarkCurve1> getSpreadAndBenchmarkCurveDetails() {
		return spreadAndBenchmarkCurveDetails == null ? Optional.empty() : Optional.of(spreadAndBenchmarkCurveDetails);
	}

	public Quote1 setSpreadAndBenchmarkCurveDetails(com.tools20022.repository.msg.BenchmarkCurve1 spreadAndBenchmarkCurveDetails) {
		this.spreadAndBenchmarkCurveDetails = spreadAndBenchmarkCurveDetails;
		return this;
	}

	public Optional<YieldCalculation1> getOfferYield() {
		return offerYield == null ? Optional.empty() : Optional.of(offerYield);
	}

	public Quote1 setOfferYield(com.tools20022.repository.msg.YieldCalculation1 offerYield) {
		this.offerYield = offerYield;
		return this;
	}

	public Optional<YieldCalculation1> getMidYield() {
		return midYield == null ? Optional.empty() : Optional.of(midYield);
	}

	public Quote1 setMidYield(com.tools20022.repository.msg.YieldCalculation1 midYield) {
		this.midYield = midYield;
		return this;
	}

	public Optional<YieldCalculation1> getBidYield() {
		return bidYield == null ? Optional.empty() : Optional.of(bidYield);
	}

	public Quote1 setBidYield(com.tools20022.repository.msg.YieldCalculation1 bidYield) {
		this.bidYield = bidYield;
		return this;
	}

	public Optional<PartyIdentification25Choice> getSourceOfQuote() {
		return sourceOfQuote == null ? Optional.empty() : Optional.of(sourceOfQuote);
	}

	public Quote1 setSourceOfQuote(PartyIdentification25Choice sourceOfQuote) {
		this.sourceOfQuote = sourceOfQuote;
		return this;
	}

	public SecurityIdentification7 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public Quote1 setFinancialInstrumentDetails(com.tools20022.repository.msg.SecurityIdentification7 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public List<SecurityIdentification7> getUnderlyingFinancialInstrumentDetails() {
		return underlyingFinancialInstrumentDetails == null ? underlyingFinancialInstrumentDetails = new ArrayList<>() : underlyingFinancialInstrumentDetails;
	}

	public Quote1 setUnderlyingFinancialInstrumentDetails(List<com.tools20022.repository.msg.SecurityIdentification7> underlyingFinancialInstrumentDetails) {
		this.underlyingFinancialInstrumentDetails = Objects.requireNonNull(underlyingFinancialInstrumentDetails);
		return this;
	}

	public FinancialInstrumentAttributes1 getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes;
	}

	public Quote1 setFinancialInstrumentAttributes(com.tools20022.repository.msg.FinancialInstrumentAttributes1 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = Objects.requireNonNull(financialInstrumentAttributes);
		return this;
	}

	public Optional<FinancialInstrumentStipulations> getStipulations() {
		return stipulations == null ? Optional.empty() : Optional.of(stipulations);
	}

	public Quote1 setStipulations(com.tools20022.repository.msg.FinancialInstrumentStipulations stipulations) {
		this.stipulations = stipulations;
		return this;
	}

	public List<FinancialInstrumentAttributes1> getUnderlyingFinancialAttributes() {
		return underlyingFinancialAttributes == null ? underlyingFinancialAttributes = new ArrayList<>() : underlyingFinancialAttributes;
	}

	public Quote1 setUnderlyingFinancialAttributes(List<com.tools20022.repository.msg.FinancialInstrumentAttributes1> underlyingFinancialAttributes) {
		this.underlyingFinancialAttributes = Objects.requireNonNull(underlyingFinancialAttributes);
		return this;
	}

	public List<FinancialInstrumentStipulations> getUnderlyingStipulations() {
		return underlyingStipulations == null ? underlyingStipulations = new ArrayList<>() : underlyingStipulations;
	}

	public Quote1 setUnderlyingStipulations(List<com.tools20022.repository.msg.FinancialInstrumentStipulations> underlyingStipulations) {
		this.underlyingStipulations = Objects.requireNonNull(underlyingStipulations);
		return this;
	}
}