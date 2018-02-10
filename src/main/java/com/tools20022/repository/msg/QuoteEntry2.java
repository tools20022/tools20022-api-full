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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.OrderType1Code;
import com.tools20022.repository.codeset.RejectionReason3Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
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
 * Specifies the identification, order type, expiry date and if required,
 * rejection reason, for a specific set of quotes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmIdentification
 * QuoteEntry2.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmOrderType
 * QuoteEntry2.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmValidUntilDateTime
 * QuoteEntry2.mmValidUntilDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmCurrency
 * QuoteEntry2.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmRejectReason
 * QuoteEntry2.mmRejectReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmOfferSide
 * QuoteEntry2.mmOfferSide}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmMidSide
 * QuoteEntry2.mmMidSide}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteEntry2#mmBidSide
 * QuoteEntry2.mmBidSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmFinancialInstrumentDetails
 * QuoteEntry2.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmFinancialInstrumentAttributes
 * QuoteEntry2.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmInstrumentLegGroupDetails
 * QuoteEntry2.mmInstrumentLegGroupDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmLegFinancialInstrumentAttributes
 * QuoteEntry2.mmLegFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmTradingSessionDetails
 * QuoteEntry2.mmTradingSessionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmSettlementDetails
 * QuoteEntry2.mmSettlementDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMidSideRule#forQuoteEntry2
 * ConstraintMidSideRule.forQuoteEntry2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteEntry2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the identification, order type, expiry date and if required, rejection reason, for a specific set of quotes."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QuoteEntry2", propOrder = {"identification", "orderType", "validUntilDateTime", "currency", "rejectReason", "offerSide", "midSide", "bidSide", "financialInstrumentDetails", "financialInstrumentAttributes",
		"instrumentLegGroupDetails", "legFinancialInstrumentAttributes", "tradingSessionDetails", "settlementDetails"})
public class QuoteEntry2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
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
	 * definition} = "Identification of a quote entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of a quote entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrdrTp")
	protected OrderType1Code orderType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmType
	 * SecuritiesOrder.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OrderType1Code.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
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
	 * definition} = "Expresses the validity date and time of the Quote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidUntilDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quote.mmValidUntilDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "VldUntilDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidUntilDateTime";
			definition = "Expresses the validity date and time of the Quote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
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
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quote.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Can be used to specify the desired currency of the quoted price that may differ from the normal trading currency of the instrument being quote requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "RjctRsn")
	protected RejectionReason3Code rejectReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the quote was rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "RjctRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectReason";
			definition = "Reason why the quote was rejected.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RejectionReason3Code.mmObject();
		}
	};
	@XmlElement(name = "OfferSd")
	protected List<com.tools20022.repository.msg.QuoteSide1> offerSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuoteSide1 QuoteSide1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmOfferSide
	 * SecuritiesQuoteVariable.mmOfferSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferSd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as an offer of a security, commodity, currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOfferSide = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmOfferSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "OfferSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferSide";
			definition = "Indicates that the quote details are indicated as an offer of a security, commodity, currency.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuoteSide1.mmObject();
		}
	};
	@XmlElement(name = "MidSd")
	protected List<com.tools20022.repository.msg.QuoteSide1> midSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuoteSide1 QuoteSide1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmMidSide
	 * SecuritiesQuoteVariable.mmMidSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MidSd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as a mid of a security, commodity, currency (an average of the offer and the bid)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMidSide = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmMidSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "MidSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidSide";
			definition = "Indicates that the quote details are indicated as a mid of a security, commodity, currency (an average of the offer and the bid).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuoteSide1.mmObject();
		}
	};
	@XmlElement(name = "BidSd")
	protected List<com.tools20022.repository.msg.QuoteSide1> bidSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuoteSide1 QuoteSide1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmBidSide
	 * SecuritiesQuoteVariable.mmBidSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidSd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote details are indicated as a bid of a security, commodity, currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBidSide = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmBidSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "BidSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidSide";
			definition = "Indicates that the quote details are indicated as a bid of a security, commodity, currency.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuoteSide1.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
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
	 * definition} =
	 * "Financial instrument to which a request for quote is related."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument to which a request for quote is related.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuotedSecurity
	 * Quote.mmQuotedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
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
			businessElementTrace_lazy = () -> Quote.mmQuotedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Provides details about the financial instrument attributes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
		}
	};
	@XmlElement(name = "InstrmLegGrpDtls")
	protected List<com.tools20022.repository.msg.InstrumentLeg2> instrumentLegGroupDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InstrumentLeg2
	 * InstrumentLeg2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmLegAdditionalInformation
	 * Asset.mmLegAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmLegGrpDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentLegGroupDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument of each leg."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstrumentLegGroupDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmLegAdditionalInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "InstrmLegGrpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentLegGroupDetails";
			definition = "Provides details about the financial instrument of each leg.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstrumentLeg2.mmObject();
		}
	};
	@XmlElement(name = "LegFinInstrmAttrbts")
	protected List<com.tools20022.repository.msg.FinancialInstrumentAttributes1> legFinancialInstrumentAttributes;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmLegAdditionalInformation
	 * Asset.mmLegAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegFinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegFinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument attributes of each leg."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmLegAdditionalInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "LegFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegFinancialInstrumentAttributes";
			definition = "Provides details about the underlying financial instrument attributes of each leg.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
		}
	};
	@XmlElement(name = "TradgSsnDtls")
	protected TradingSession1 tradingSessionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradingSession1
	 * TradingSession1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmQuoteTradingSession
	 * SecuritiesQuoteVariable.mmQuoteTradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSsnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the trading session."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingSessionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmQuoteTradingSession;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "TradgSsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSessionDetails";
			definition = "Provides details about the trading session.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradingSession1.mmObject();
		}
	};
	@XmlElement(name = "SttlmDtls")
	protected SecuritiesSettlement1 settlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesSettlement1
	 * SecuritiesSettlement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2 QuoteEntry2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The parameters required in order to settle the transfer of a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteEntry2.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "The parameters required in order to settle the transfer of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlement1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuoteEntry2.mmIdentification, com.tools20022.repository.msg.QuoteEntry2.mmOrderType, com.tools20022.repository.msg.QuoteEntry2.mmValidUntilDateTime,
						com.tools20022.repository.msg.QuoteEntry2.mmCurrency, com.tools20022.repository.msg.QuoteEntry2.mmRejectReason, com.tools20022.repository.msg.QuoteEntry2.mmOfferSide,
						com.tools20022.repository.msg.QuoteEntry2.mmMidSide, com.tools20022.repository.msg.QuoteEntry2.mmBidSide, com.tools20022.repository.msg.QuoteEntry2.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.QuoteEntry2.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.QuoteEntry2.mmInstrumentLegGroupDetails,
						com.tools20022.repository.msg.QuoteEntry2.mmLegFinancialInstrumentAttributes, com.tools20022.repository.msg.QuoteEntry2.mmTradingSessionDetails, com.tools20022.repository.msg.QuoteEntry2.mmSettlementDetails);
				trace_lazy = () -> SecuritiesQuoteVariable.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMidSideRule.forQuoteEntry2);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "QuoteEntry2";
				definition = "Specifies the identification, order type, expiry date and if required, rejection reason, for a specific set of quotes.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public QuoteEntry2 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<OrderType1Code> getOrderType() {
		return orderType == null ? Optional.empty() : Optional.of(orderType);
	}

	public QuoteEntry2 setOrderType(OrderType1Code orderType) {
		this.orderType = orderType;
		return this;
	}

	public Optional<ISODateTime> getValidUntilDateTime() {
		return validUntilDateTime == null ? Optional.empty() : Optional.of(validUntilDateTime);
	}

	public QuoteEntry2 setValidUntilDateTime(ISODateTime validUntilDateTime) {
		this.validUntilDateTime = validUntilDateTime;
		return this;
	}

	public Optional<CurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public QuoteEntry2 setCurrency(CurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<RejectionReason3Code> getRejectReason() {
		return rejectReason == null ? Optional.empty() : Optional.of(rejectReason);
	}

	public QuoteEntry2 setRejectReason(RejectionReason3Code rejectReason) {
		this.rejectReason = rejectReason;
		return this;
	}

	public List<QuoteSide1> getOfferSide() {
		return offerSide == null ? offerSide = new ArrayList<>() : offerSide;
	}

	public QuoteEntry2 setOfferSide(List<com.tools20022.repository.msg.QuoteSide1> offerSide) {
		this.offerSide = Objects.requireNonNull(offerSide);
		return this;
	}

	public List<QuoteSide1> getMidSide() {
		return midSide == null ? midSide = new ArrayList<>() : midSide;
	}

	public QuoteEntry2 setMidSide(List<com.tools20022.repository.msg.QuoteSide1> midSide) {
		this.midSide = Objects.requireNonNull(midSide);
		return this;
	}

	public List<QuoteSide1> getBidSide() {
		return bidSide == null ? bidSide = new ArrayList<>() : bidSide;
	}

	public QuoteEntry2 setBidSide(List<com.tools20022.repository.msg.QuoteSide1> bidSide) {
		this.bidSide = Objects.requireNonNull(bidSide);
		return this;
	}

	public SecurityIdentification7 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public QuoteEntry2 setFinancialInstrumentDetails(com.tools20022.repository.msg.SecurityIdentification7 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<FinancialInstrumentAttributes1> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public QuoteEntry2 setFinancialInstrumentAttributes(com.tools20022.repository.msg.FinancialInstrumentAttributes1 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public List<InstrumentLeg2> getInstrumentLegGroupDetails() {
		return instrumentLegGroupDetails == null ? instrumentLegGroupDetails = new ArrayList<>() : instrumentLegGroupDetails;
	}

	public QuoteEntry2 setInstrumentLegGroupDetails(List<com.tools20022.repository.msg.InstrumentLeg2> instrumentLegGroupDetails) {
		this.instrumentLegGroupDetails = Objects.requireNonNull(instrumentLegGroupDetails);
		return this;
	}

	public List<FinancialInstrumentAttributes1> getLegFinancialInstrumentAttributes() {
		return legFinancialInstrumentAttributes == null ? legFinancialInstrumentAttributes = new ArrayList<>() : legFinancialInstrumentAttributes;
	}

	public QuoteEntry2 setLegFinancialInstrumentAttributes(List<com.tools20022.repository.msg.FinancialInstrumentAttributes1> legFinancialInstrumentAttributes) {
		this.legFinancialInstrumentAttributes = Objects.requireNonNull(legFinancialInstrumentAttributes);
		return this;
	}

	public Optional<TradingSession1> getTradingSessionDetails() {
		return tradingSessionDetails == null ? Optional.empty() : Optional.of(tradingSessionDetails);
	}

	public QuoteEntry2 setTradingSessionDetails(com.tools20022.repository.msg.TradingSession1 tradingSessionDetails) {
		this.tradingSessionDetails = tradingSessionDetails;
		return this;
	}

	public Optional<SecuritiesSettlement1> getSettlementDetails() {
		return settlementDetails == null ? Optional.empty() : Optional.of(settlementDetails);
	}

	public QuoteEntry2 setSettlementDetails(com.tools20022.repository.msg.SecuritiesSettlement1 settlementDetails) {
		this.settlementDetails = settlementDetails;
		return this;
	}
}