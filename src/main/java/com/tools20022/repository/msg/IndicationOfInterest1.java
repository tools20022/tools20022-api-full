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
import com.tools20022.repository.choice.Quantity1Choice;
import com.tools20022.repository.codeset.IOISideTypeCode;
import com.tools20022.repository.codeset.Qualifier1Code;
import com.tools20022.repository.codeset.QualityIndication1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Intention to buy or sell a financial Instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmSide
 * IndicationOfInterest1.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmIOIQuantity
 * IndicationOfInterest1.mmIOIQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmPrice
 * IndicationOfInterest1.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmValidUntilDateTime
 * IndicationOfInterest1.mmValidUntilDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmQualityIndication
 * IndicationOfInterest1.mmQualityIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmNaturalIndicator
 * IndicationOfInterest1.mmNaturalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmQualifier
 * IndicationOfInterest1.mmQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmLinkedURLAddress
 * IndicationOfInterest1.mmLinkedURLAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmNumberOfLegs
 * IndicationOfInterest1.mmNumberOfLegs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmFinancialInstrumentDetails
 * IndicationOfInterest1.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmFinancialInstrumentAttributes
 * IndicationOfInterest1.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmStipulations
 * IndicationOfInterest1.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmUnderlyingFinancialInstrumentDetails
 * IndicationOfInterest1.mmUnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmUnderlyingFinancialInstrumentAttributes
 * IndicationOfInterest1.mmUnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmUnderlyingStipulations
 * IndicationOfInterest1.mmUnderlyingStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmInstrumentLegGroupDetails
 * IndicationOfInterest1.mmInstrumentLegGroupDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmYieldDetails
 * IndicationOfInterest1.mmYieldDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmOrderQuantity
 * IndicationOfInterest1.mmOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmSpreadAndBenchmarkCurveDetails
 * IndicationOfInterest1.mmSpreadAndBenchmarkCurveDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmTwoLegTransactionDetails
 * IndicationOfInterest1.mmTwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmTradingParties
 * IndicationOfInterest1.mmTradingParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmCashParties
 * IndicationOfInterest1.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmReceivingSettlementParties
 * IndicationOfInterest1.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmDeliveringSettlementParties
 * IndicationOfInterest1.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmOtherBusinessParties
 * IndicationOfInterest1.mmOtherBusinessParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
 * BuyOrSellIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfLegsRule#forIndicationOfInterest1
 * ConstraintNumberOfLegsRule.forIndicationOfInterest1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndicationOfInterest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to buy or sell a financial Instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndicationOfInterest1", propOrder = {"side", "iOIQuantity", "price", "validUntilDateTime", "qualityIndication", "naturalIndicator", "qualifier", "linkedURLAddress", "numberOfLegs", "financialInstrumentDetails",
		"financialInstrumentAttributes", "stipulations", "underlyingFinancialInstrumentDetails", "underlyingFinancialInstrumentAttributes", "underlyingStipulations", "instrumentLegGroupDetails", "yieldDetails", "orderQuantity",
		"spreadAndBenchmarkCurveDetails", "twoLegTransactionDetails", "tradingParties", "cashParties", "receivingSettlementParties", "deliveringSettlementParties", "otherBusinessParties"})
public class IndicationOfInterest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sd", required = true)
	protected IOISideTypeCode side;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IOISideTypeCode
	 * IOISideTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Side of the indication of interest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Side of the indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IOISideTypeCode.mmObject();
		}
	};
	@XmlElement(name = "IOIQty", required = true)
	protected Quantity1Choice iOIQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity1Choice
	 * Quantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuantity
	 * Quote.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IOIQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 27</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IOIQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument to which the indication applies."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIOIQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quote.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "IOIQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "27"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IOIQuantity";
			definition = "Quantity of financial instrument to which the indication applies.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "Pric")
	protected Price1 price;
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
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmPrice
	 * BuyOrSellIndicationOfInterest.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 44, FIXSynonym: 423</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the price of the instrument, applicable to the indication of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BuyOrSellIndicationOfInterest.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "44"), new FIXSynonym(this, "423"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Indicates the price of the instrument, applicable to the indication of interest.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
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
	 * definition} =
	 * "Specifies the date and time at which the indication of interest expires and is no longer valid."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidUntilDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quote.mmValidUntilDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "VldUntilDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "62"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidUntilDateTime";
			definition = "Specifies the date and time at which the indication of interest expires and is no longer valid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "QltyIndctn")
	protected QualityIndication1Code qualityIndication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QualityIndication1Code
	 * QualityIndication1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmQualityIndication
	 * BuyOrSellIndicationOfInterest.mmQualityIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QltyIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 25</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualityIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the relative quality of the indication of interest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQualityIndication = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BuyOrSellIndicationOfInterest.mmQualityIndication;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "QltyIndctn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "25"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualityIndication";
			definition = "Indicates the relative quality of the indication of interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QualityIndication1Code.mmObject();
		}
	};
	@XmlElement(name = "NtrlInd")
	protected TrueFalseIndicator naturalIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmNaturalIndicator
	 * BuyOrSellIndicationOfInterest.mmNaturalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtrlInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 130</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NaturalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the indication of interest is the result of an existing agency order or a facilitation position resulting from an agency order, not from principal trading or order solicitation activity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNaturalIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BuyOrSellIndicationOfInterest.mmNaturalIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "NtrlInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "130"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalIndicator";
			definition = "Indicates whether or not the indication of interest is the result of an existing agency order or a facilitation position resulting from an agency order, not from principal trading or order solicitation activity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmQualifier
	 * BuyOrSellIndicationOfInterest.mmQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qlfr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 104</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Qualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the use of the indication of interest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQualifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BuyOrSellIndicationOfInterest.mmQualifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "Qlfr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "104"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the indication of interest.";
			minOccurs = 0;
			simpleType_lazy = () -> Qualifier1Code.mmObject();
		}
	};
	@XmlElement(name = "LkdURLAdr")
	protected Max256Text linkedURLAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdURLAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 149</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedURLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkedURLAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "LkdURLAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "149"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedURLAddress";
			definition = "Address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	@XmlElement(name = "NbOfLegs")
	protected DecimalNumber numberOfLegs;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmNumberOfLegs
	 * BuyOrSellIndicationOfInterest.mmNumberOfLegs}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfLegs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 555</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfLegs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of InstrumentLeg repeating group instances. Required for multilegs IOIs."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfLegs = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BuyOrSellIndicationOfInterest.mmNumberOfLegs;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "NbOfLegs";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "555"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfLegs";
			definition = "Number of InstrumentLeg repeating group instances. Required for multilegs IOIs.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
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
	 * "Financial instrument to which an indication of interest is related."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument to which an indication of interest is related.";
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
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
	 * "Financial instrument attributes to which an indication of interest is related."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Financial instrument attributes to which an indication of interest is related.";
			maxOccurs = 1;
			minOccurs = 0;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
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
	 * "Financial instrument stipulations to which an indication of interest is related."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStipulations = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "Stiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stipulations";
			definition = "Financial instrument stipulations to which an indication of interest is related.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
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
	 * "Underlying financial instrument to which an indication of interest is related."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentDetails";
			definition = "Underlying financial instrument to which an indication of interest is related.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	@XmlElement(name = "UndrlygFinInstrmAttrbts")
	protected List<com.tools20022.repository.msg.FinancialInstrumentAttributes1> underlyingFinancialInstrumentAttributes;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
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
	 * "Underlying financial instrument attributes to which an indication of interest is related."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentAttributes";
			definition = "Underlying financial instrument attributes to which an indication of interest is related.";
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
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
	 * "Underlying financial instrument stipulations to which an indication of interest is related."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingStipulations = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingStipulations";
			definition = "Underlying financial instrument stipulations to which an indication of interest is related.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentStipulations.mmObject();
		}
	};
	@XmlElement(name = "InstrmLegGrpDtls")
	protected List<com.tools20022.repository.msg.InstrumentLeg1> instrumentLegGroupDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InstrumentLeg1
	 * InstrumentLeg1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmLegAdditionalInformation
	 * Asset.mmLegAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
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
	 * "Provides details about each leg of the multileg instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstrumentLegGroupDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmLegAdditionalInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "InstrmLegGrpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentLegGroupDetails";
			definition = "Provides details about each leg of the multileg instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstrumentLeg1.mmObject();
		}
	};
	@XmlElement(name = "YldDtls")
	protected YieldCalculation1 yieldDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
	 * SecuritiesPricing.mmYieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YldDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details about the return provided by a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmYieldDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmYieldCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "YldDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldDetails";
			definition = "Details about the return provided by a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
		}
	};
	@XmlElement(name = "OrdrQty")
	protected OrderQuantity1 orderQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderQuantity1
	 * OrderQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details about the order quantity to which an indication of interest is related."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "OrdrQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderQuantity";
			definition = "Details about the order quantity to which an indication of interest is related.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OrderQuantity1.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSpreadToBenchmark
	 * BuyOrSellIndicationOfInterest.mmSpreadToBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
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
	 * "Indicates the difference in value between a financial instrument and a benchmark for an indication of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpreadAndBenchmarkCurveDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BuyOrSellIndicationOfInterest.mmSpreadToBenchmark;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "SprdAndBchmkCrvDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadAndBenchmarkCurveDetails";
			definition = "Indicates the difference in value between a financial instrument and a benchmark for an indication of interest.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BenchmarkCurve1.mmObject();
		}
	};
	@XmlElement(name = "TwoLegTxDtls")
	protected SecuritiesFinancing1 twoLegTransactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmTwoLegTransaction
	 * BuyOrSellIndicationOfInterest.mmTwoLegTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwoLegTxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities Financing is the process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTwoLegTransactionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BuyOrSellIndicationOfInterest.mmTwoLegTransaction;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "TwoLegTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionDetails";
			definition = "Securities Financing is the process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing1.mmObject();
		}
	};
	@XmlElement(name = "TradgPties")
	protected List<com.tools20022.repository.msg.Intermediary14> tradingParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary14
	 * Intermediary14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parties involved in the specific transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingParties = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "TradgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParties";
			definition = "Parties involved in the specific transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary14.mmObject();
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties1 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashParties1
	 * CashParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash parties involved in the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashParties = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashParties1.mmObject();
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties3 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiving parties involved in the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingSettlementParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Receiving parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties3.mmObject();
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties3 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringSettlementParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties3.mmObject();
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties1 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherParties1
	 * OtherParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1
	 * IndicationOfInterest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other parties involved in the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherBusinessParties = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IndicationOfInterest1.mmObject();
			isDerived = false;
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherParties1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndicationOfInterest1.mmSide, com.tools20022.repository.msg.IndicationOfInterest1.mmIOIQuantity,
						com.tools20022.repository.msg.IndicationOfInterest1.mmPrice, com.tools20022.repository.msg.IndicationOfInterest1.mmValidUntilDateTime, com.tools20022.repository.msg.IndicationOfInterest1.mmQualityIndication,
						com.tools20022.repository.msg.IndicationOfInterest1.mmNaturalIndicator, com.tools20022.repository.msg.IndicationOfInterest1.mmQualifier, com.tools20022.repository.msg.IndicationOfInterest1.mmLinkedURLAddress,
						com.tools20022.repository.msg.IndicationOfInterest1.mmNumberOfLegs, com.tools20022.repository.msg.IndicationOfInterest1.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.IndicationOfInterest1.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.IndicationOfInterest1.mmStipulations,
						com.tools20022.repository.msg.IndicationOfInterest1.mmUnderlyingFinancialInstrumentDetails, com.tools20022.repository.msg.IndicationOfInterest1.mmUnderlyingFinancialInstrumentAttributes,
						com.tools20022.repository.msg.IndicationOfInterest1.mmUnderlyingStipulations, com.tools20022.repository.msg.IndicationOfInterest1.mmInstrumentLegGroupDetails,
						com.tools20022.repository.msg.IndicationOfInterest1.mmYieldDetails, com.tools20022.repository.msg.IndicationOfInterest1.mmOrderQuantity,
						com.tools20022.repository.msg.IndicationOfInterest1.mmSpreadAndBenchmarkCurveDetails, com.tools20022.repository.msg.IndicationOfInterest1.mmTwoLegTransactionDetails,
						com.tools20022.repository.msg.IndicationOfInterest1.mmTradingParties, com.tools20022.repository.msg.IndicationOfInterest1.mmCashParties,
						com.tools20022.repository.msg.IndicationOfInterest1.mmReceivingSettlementParties, com.tools20022.repository.msg.IndicationOfInterest1.mmDeliveringSettlementParties,
						com.tools20022.repository.msg.IndicationOfInterest1.mmOtherBusinessParties);
				trace_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNumberOfLegsRule.forIndicationOfInterest1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IndicationOfInterest1";
				definition = "Intention to buy or sell a financial Instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public IOISideTypeCode getSide() {
		return side;
	}

	public IndicationOfInterest1 setSide(IOISideTypeCode side) {
		this.side = Objects.requireNonNull(side);
		return this;
	}

	public Quantity1Choice getIOIQuantity() {
		return iOIQuantity;
	}

	public IndicationOfInterest1 setIOIQuantity(Quantity1Choice iOIQuantity) {
		this.iOIQuantity = Objects.requireNonNull(iOIQuantity);
		return this;
	}

	public Optional<Price1> getPrice() {
		return price == null ? Optional.empty() : Optional.of(price);
	}

	public IndicationOfInterest1 setPrice(com.tools20022.repository.msg.Price1 price) {
		this.price = price;
		return this;
	}

	public Optional<ISODateTime> getValidUntilDateTime() {
		return validUntilDateTime == null ? Optional.empty() : Optional.of(validUntilDateTime);
	}

	public IndicationOfInterest1 setValidUntilDateTime(ISODateTime validUntilDateTime) {
		this.validUntilDateTime = validUntilDateTime;
		return this;
	}

	public Optional<QualityIndication1Code> getQualityIndication() {
		return qualityIndication == null ? Optional.empty() : Optional.of(qualityIndication);
	}

	public IndicationOfInterest1 setQualityIndication(QualityIndication1Code qualityIndication) {
		this.qualityIndication = qualityIndication;
		return this;
	}

	public Optional<TrueFalseIndicator> getNaturalIndicator() {
		return naturalIndicator == null ? Optional.empty() : Optional.of(naturalIndicator);
	}

	public IndicationOfInterest1 setNaturalIndicator(TrueFalseIndicator naturalIndicator) {
		this.naturalIndicator = naturalIndicator;
		return this;
	}

	public List<Qualifier1Code> getQualifier() {
		return qualifier == null ? qualifier = new ArrayList<>() : qualifier;
	}

	public IndicationOfInterest1 setQualifier(List<Qualifier1Code> qualifier) {
		this.qualifier = Objects.requireNonNull(qualifier);
		return this;
	}

	public Optional<Max256Text> getLinkedURLAddress() {
		return linkedURLAddress == null ? Optional.empty() : Optional.of(linkedURLAddress);
	}

	public IndicationOfInterest1 setLinkedURLAddress(Max256Text linkedURLAddress) {
		this.linkedURLAddress = linkedURLAddress;
		return this;
	}

	public Optional<DecimalNumber> getNumberOfLegs() {
		return numberOfLegs == null ? Optional.empty() : Optional.of(numberOfLegs);
	}

	public IndicationOfInterest1 setNumberOfLegs(DecimalNumber numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
		return this;
	}

	public SecurityIdentification7 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public IndicationOfInterest1 setFinancialInstrumentDetails(com.tools20022.repository.msg.SecurityIdentification7 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<FinancialInstrumentAttributes1> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public IndicationOfInterest1 setFinancialInstrumentAttributes(com.tools20022.repository.msg.FinancialInstrumentAttributes1 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public Optional<FinancialInstrumentStipulations> getStipulations() {
		return stipulations == null ? Optional.empty() : Optional.of(stipulations);
	}

	public IndicationOfInterest1 setStipulations(com.tools20022.repository.msg.FinancialInstrumentStipulations stipulations) {
		this.stipulations = stipulations;
		return this;
	}

	public List<SecurityIdentification7> getUnderlyingFinancialInstrumentDetails() {
		return underlyingFinancialInstrumentDetails == null ? underlyingFinancialInstrumentDetails = new ArrayList<>() : underlyingFinancialInstrumentDetails;
	}

	public IndicationOfInterest1 setUnderlyingFinancialInstrumentDetails(List<com.tools20022.repository.msg.SecurityIdentification7> underlyingFinancialInstrumentDetails) {
		this.underlyingFinancialInstrumentDetails = Objects.requireNonNull(underlyingFinancialInstrumentDetails);
		return this;
	}

	public List<FinancialInstrumentAttributes1> getUnderlyingFinancialInstrumentAttributes() {
		return underlyingFinancialInstrumentAttributes == null ? underlyingFinancialInstrumentAttributes = new ArrayList<>() : underlyingFinancialInstrumentAttributes;
	}

	public IndicationOfInterest1 setUnderlyingFinancialInstrumentAttributes(List<com.tools20022.repository.msg.FinancialInstrumentAttributes1> underlyingFinancialInstrumentAttributes) {
		this.underlyingFinancialInstrumentAttributes = Objects.requireNonNull(underlyingFinancialInstrumentAttributes);
		return this;
	}

	public List<FinancialInstrumentStipulations> getUnderlyingStipulations() {
		return underlyingStipulations == null ? underlyingStipulations = new ArrayList<>() : underlyingStipulations;
	}

	public IndicationOfInterest1 setUnderlyingStipulations(List<com.tools20022.repository.msg.FinancialInstrumentStipulations> underlyingStipulations) {
		this.underlyingStipulations = Objects.requireNonNull(underlyingStipulations);
		return this;
	}

	public List<InstrumentLeg1> getInstrumentLegGroupDetails() {
		return instrumentLegGroupDetails == null ? instrumentLegGroupDetails = new ArrayList<>() : instrumentLegGroupDetails;
	}

	public IndicationOfInterest1 setInstrumentLegGroupDetails(List<com.tools20022.repository.msg.InstrumentLeg1> instrumentLegGroupDetails) {
		this.instrumentLegGroupDetails = Objects.requireNonNull(instrumentLegGroupDetails);
		return this;
	}

	public Optional<YieldCalculation1> getYieldDetails() {
		return yieldDetails == null ? Optional.empty() : Optional.of(yieldDetails);
	}

	public IndicationOfInterest1 setYieldDetails(com.tools20022.repository.msg.YieldCalculation1 yieldDetails) {
		this.yieldDetails = yieldDetails;
		return this;
	}

	public Optional<OrderQuantity1> getOrderQuantity() {
		return orderQuantity == null ? Optional.empty() : Optional.of(orderQuantity);
	}

	public IndicationOfInterest1 setOrderQuantity(com.tools20022.repository.msg.OrderQuantity1 orderQuantity) {
		this.orderQuantity = orderQuantity;
		return this;
	}

	public Optional<BenchmarkCurve1> getSpreadAndBenchmarkCurveDetails() {
		return spreadAndBenchmarkCurveDetails == null ? Optional.empty() : Optional.of(spreadAndBenchmarkCurveDetails);
	}

	public IndicationOfInterest1 setSpreadAndBenchmarkCurveDetails(com.tools20022.repository.msg.BenchmarkCurve1 spreadAndBenchmarkCurveDetails) {
		this.spreadAndBenchmarkCurveDetails = spreadAndBenchmarkCurveDetails;
		return this;
	}

	public Optional<SecuritiesFinancing1> getTwoLegTransactionDetails() {
		return twoLegTransactionDetails == null ? Optional.empty() : Optional.of(twoLegTransactionDetails);
	}

	public IndicationOfInterest1 setTwoLegTransactionDetails(com.tools20022.repository.msg.SecuritiesFinancing1 twoLegTransactionDetails) {
		this.twoLegTransactionDetails = twoLegTransactionDetails;
		return this;
	}

	public List<Intermediary14> getTradingParties() {
		return tradingParties == null ? tradingParties = new ArrayList<>() : tradingParties;
	}

	public IndicationOfInterest1 setTradingParties(List<com.tools20022.repository.msg.Intermediary14> tradingParties) {
		this.tradingParties = Objects.requireNonNull(tradingParties);
		return this;
	}

	public Optional<CashParties1> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public IndicationOfInterest1 setCashParties(com.tools20022.repository.msg.CashParties1 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<SettlementParties3> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public IndicationOfInterest1 setReceivingSettlementParties(com.tools20022.repository.msg.SettlementParties3 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<SettlementParties3> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public IndicationOfInterest1 setDeliveringSettlementParties(com.tools20022.repository.msg.SettlementParties3 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<OtherParties1> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public IndicationOfInterest1 setOtherBusinessParties(com.tools20022.repository.msg.OtherParties1 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}
}