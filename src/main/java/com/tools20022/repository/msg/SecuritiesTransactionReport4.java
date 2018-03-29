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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ExecutingParty1Choice;
import com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice;
import com.tools20022.repository.choice.InvestmentParty1Choice;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max52Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the securities transaction report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmTransactionIdentification
 * SecuritiesTransactionReport4.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmExecutingParty
 * SecuritiesTransactionReport4.mmExecutingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmInvestmentPartyIndicator
 * SecuritiesTransactionReport4.mmInvestmentPartyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmSubmittingParty
 * SecuritiesTransactionReport4.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmBuyer
 * SecuritiesTransactionReport4.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmSeller
 * SecuritiesTransactionReport4.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmOrderTransmission
 * SecuritiesTransactionReport4.mmOrderTransmission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmTransaction
 * SecuritiesTransactionReport4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmFinancialInstrument
 * SecuritiesTransactionReport4.mmFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmInvestmentDecisionPerson
 * SecuritiesTransactionReport4.mmInvestmentDecisionPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmExecutingPerson
 * SecuritiesTransactionReport4.mmExecutingPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmAdditionalAttributes
 * SecuritiesTransactionReport4.mmAdditionalAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmTechnicalAttributes
 * SecuritiesTransactionReport4.mmTechnicalAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmSupplementaryData
 * SecuritiesTransactionReport4.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransaction
 * SecuritiesTransaction}</li>
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
 * "SecuritiesTransactionReport4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the securities transaction report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTransactionReport4", propOrder = {"transactionIdentification", "executingParty", "investmentPartyIndicator", "submittingParty", "buyer", "seller", "orderTransmission", "transaction", "financialInstrument",
		"investmentDecisionPerson", "executingPerson", "additionalAttributes", "technicalAttributes", "supplementaryData"})
public class SecuritiesTransactionReport4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected Max52Text transactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identification of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTransactionReport4, Max52Text> mmTransactionIdentification = new MMMessageAttribute<SecuritiesTransactionReport4, Max52Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique and unambiguous identification of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max52Text.mmObject();
		}

		@Override
		public Max52Text getValue(SecuritiesTransactionReport4 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, Max52Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "ExctgPty", required = true)
	protected LEIIdentifier executingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExecutingTrader
	 * ExecutingTrader}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity executing the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTransactionReport4, LEIIdentifier> mmExecutingParty = new MMMessageAttribute<SecuritiesTransactionReport4, LEIIdentifier>() {
		{
			businessComponentTrace_lazy = () -> ExecutingTrader.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "ExctgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingParty";
			definition = "Identification of the entity executing the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public LEIIdentifier getValue(SecuritiesTransactionReport4 obj) {
			return obj.getExecutingParty();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, LEIIdentifier value) {
			obj.setExecutingParty(value);
		}
	};
	@XmlElement(name = "InvstmtPtyInd", required = true)
	protected TrueFalseIndicator investmentPartyIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtPtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=MiFIR, value=MiFID Investment
	 * Party</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPartyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the reporting party is defined as an investment firm under the local regulation or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTransactionReport4, TrueFalseIndicator> mmInvestmentPartyIndicator = new MMMessageAttribute<SecuritiesTransactionReport4, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPtyInd";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "MiFIR"}, new String[]{"value", "MiFID Investment Party"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPartyIndicator";
			definition = "Indicates whether the reporting party is defined as an investment firm under the local regulation or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(SecuritiesTransactionReport4 obj) {
			return obj.getInvestmentPartyIndicator();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, TrueFalseIndicator value) {
			obj.setInvestmentPartyIndicator(value);
		}
	};
	@XmlElement(name = "SubmitgPty", required = true)
	protected LEIIdentifier submittingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubmittingPartyRole
	 * SubmittingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity submitting the transaction report to the competent authority."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTransactionReport4, LEIIdentifier> mmSubmittingParty = new MMMessageAttribute<SecuritiesTransactionReport4, LEIIdentifier>() {
		{
			businessComponentTrace_lazy = () -> SubmittingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "SubmitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingParty";
			definition = "Entity submitting the transaction report to the competent authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public LEIIdentifier getValue(SecuritiesTransactionReport4 obj) {
			return obj.getSubmittingParty();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, LEIIdentifier value) {
			obj.setSubmittingParty(value);
		}
	};
	@XmlElement(name = "Buyr", required = true)
	protected PartyIdentification79 buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification79
	 * PartyIdentification79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the acquirer of the legal title to the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionReport4, PartyIdentification79> mmBuyer = new MMMessageAssociationEnd<SecuritiesTransactionReport4, PartyIdentification79>() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Identifies the acquirer of the legal title to the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification79.mmObject();
		}

		@Override
		public PartyIdentification79 getValue(SecuritiesTransactionReport4 obj) {
			return obj.getBuyer();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, PartyIdentification79 value) {
			obj.setBuyer(value);
		}
	};
	@XmlElement(name = "Sellr", required = true)
	protected PartyIdentification79 seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification79
	 * PartyIdentification79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the seller of the legal title to the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionReport4, PartyIdentification79> mmSeller = new MMMessageAssociationEnd<SecuritiesTransactionReport4, PartyIdentification79>() {
		{
			businessComponentTrace_lazy = () -> SellerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Identifies the seller of the legal title to the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification79.mmObject();
		}

		@Override
		public PartyIdentification79 getValue(SecuritiesTransactionReport4 obj) {
			return obj.getSeller();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, PartyIdentification79 value) {
			obj.setSeller(value);
		}
	};
	@XmlElement(name = "OrdrTrnsmssn", required = true)
	protected SecuritiesTransactionTransmission2 orderTransmission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2
	 * SecuritiesTransactionTransmission2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmRelatedOrder
	 * SecuritiesTrade.mmRelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrTrnsmssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderTransmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication as to whether the transaction results from an order transmitted by the reporting of a client to a third party.\r\n\r\nUsage: Only applicable when the conditions for transmission are not satisfied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionReport4, SecuritiesTransactionTransmission2> mmOrderTransmission = new MMMessageAssociationEnd<SecuritiesTransactionReport4, SecuritiesTransactionTransmission2>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmRelatedOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "OrdrTrnsmssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderTransmission";
			definition = "Indication as to whether the transaction results from an order transmitted by the reporting of a client to a third party.\r\n\r\nUsage: Only applicable when the conditions for transmission are not satisfied.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionTransmission2.mmObject();
		}

		@Override
		public SecuritiesTransactionTransmission2 getValue(SecuritiesTransactionReport4 obj) {
			return obj.getOrderTransmission();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, SecuritiesTransactionTransmission2 value) {
			obj.setOrderTransmission(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected SecuritiesTransaction1 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1
	 * SecuritiesTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransaction
	 * SecuritiesTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the details of the reported transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionReport4, SecuritiesTransaction1> mmTransaction = new MMMessageAssociationEnd<SecuritiesTransactionReport4, SecuritiesTransaction1>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Provides the details of the reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransaction1.mmObject();
		}

		@Override
		public SecuritiesTransaction1 getValue(SecuritiesTransactionReport4 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, SecuritiesTransaction1 value) {
			obj.setTransaction(value);
		}
	};
	@XmlElement(name = "FinInstrm", required = true)
	protected FinancialInstrumentAttributes3Choice financialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice
	 * FinancialInstrumentAttributes3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionReport4, FinancialInstrumentAttributes3Choice> mmFinancialInstrument = new MMMessageAssociationEnd<SecuritiesTransactionReport4, FinancialInstrumentAttributes3Choice>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes3Choice.mmObject();
		}

		@Override
		public FinancialInstrumentAttributes3Choice getValue(SecuritiesTransactionReport4 obj) {
			return obj.getFinancialInstrument();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, FinancialInstrumentAttributes3Choice value) {
			obj.setFinancialInstrument(value);
		}
	};
	@XmlElement(name = "InvstmtDcsnPrsn")
	protected InvestmentParty1Choice investmentDecisionPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InvestmentParty1Choice
	 * InvestmentParty1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Investor Investor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtDcsnPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentDecisionPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the person or algorithm which is responsible within the reporting party for the investment decision."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionReport4, Optional<InvestmentParty1Choice>> mmInvestmentDecisionPerson = new MMMessageAssociationEnd<SecuritiesTransactionReport4, Optional<InvestmentParty1Choice>>() {
		{
			businessComponentTrace_lazy = () -> Investor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "InvstmtDcsnPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentDecisionPerson";
			definition = "Identifies the person or algorithm which is responsible within the reporting party for the investment decision.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentParty1Choice.mmObject();
		}

		@Override
		public Optional<InvestmentParty1Choice> getValue(SecuritiesTransactionReport4 obj) {
			return obj.getInvestmentDecisionPerson();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, Optional<InvestmentParty1Choice> value) {
			obj.setInvestmentDecisionPerson(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctgPrsn", required = true)
	protected ExecutingParty1Choice executingPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ExecutingParty1Choice
	 * ExecutingParty1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person or algorithm responsible for the execution of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionReport4, ExecutingParty1Choice> mmExecutingPerson = new MMMessageAssociationEnd<SecuritiesTransactionReport4, ExecutingParty1Choice>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "ExctgPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingPerson";
			definition = "Person or algorithm responsible for the execution of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ExecutingParty1Choice.mmObject();
		}

		@Override
		public ExecutingParty1Choice getValue(SecuritiesTransactionReport4 obj) {
			return obj.getExecutingPerson();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, ExecutingParty1Choice value) {
			obj.setExecutingPerson(value);
		}
	};
	@XmlElement(name = "AddtlAttrbts", required = true)
	protected SecuritiesTransactionIndicator2 additionalAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionIndicator2
	 * SecuritiesTransactionIndicator2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional indicators on the reported transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionReport4, SecuritiesTransactionIndicator2> mmAdditionalAttributes = new MMMessageAssociationEnd<SecuritiesTransactionReport4, SecuritiesTransactionIndicator2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "AddtlAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalAttributes";
			definition = "Provides additional indicators on the reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionIndicator2.mmObject();
		}

		@Override
		public SecuritiesTransactionIndicator2 getValue(SecuritiesTransactionReport4 obj) {
			return obj.getAdditionalAttributes();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, SecuritiesTransactionIndicator2 value) {
			obj.setAdditionalAttributes(value);
		}
	};
	@XmlElement(name = "TechAttrbts")
	protected RecordTechnicalData1 technicalAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RecordTechnicalData1
	 * RecordTechnicalData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data used for exchanges between national competent authorities, not to be used by reporting entities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionReport4, Optional<RecordTechnicalData1>> mmTechnicalAttributes = new MMMessageAssociationEnd<SecuritiesTransactionReport4, Optional<RecordTechnicalData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "TechAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAttributes";
			definition = "Data used for exchanges between national competent authorities, not to be used by reporting entities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RecordTechnicalData1.mmObject();
		}

		@Override
		public Optional<RecordTechnicalData1> getValue(SecuritiesTransactionReport4 obj) {
			return obj.getTechnicalAttributes();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, Optional<RecordTechnicalData1> value) {
			obj.setTechnicalAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionReport4, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<SecuritiesTransactionReport4, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesTransactionReport4 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesTransactionReport4 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTransactionReport4.mmTransactionIdentification, com.tools20022.repository.msg.SecuritiesTransactionReport4.mmExecutingParty,
						com.tools20022.repository.msg.SecuritiesTransactionReport4.mmInvestmentPartyIndicator, com.tools20022.repository.msg.SecuritiesTransactionReport4.mmSubmittingParty,
						com.tools20022.repository.msg.SecuritiesTransactionReport4.mmBuyer, com.tools20022.repository.msg.SecuritiesTransactionReport4.mmSeller,
						com.tools20022.repository.msg.SecuritiesTransactionReport4.mmOrderTransmission, com.tools20022.repository.msg.SecuritiesTransactionReport4.mmTransaction,
						com.tools20022.repository.msg.SecuritiesTransactionReport4.mmFinancialInstrument, com.tools20022.repository.msg.SecuritiesTransactionReport4.mmInvestmentDecisionPerson,
						com.tools20022.repository.msg.SecuritiesTransactionReport4.mmExecutingPerson, com.tools20022.repository.msg.SecuritiesTransactionReport4.mmAdditionalAttributes,
						com.tools20022.repository.msg.SecuritiesTransactionReport4.mmTechnicalAttributes, com.tools20022.repository.msg.SecuritiesTransactionReport4.mmSupplementaryData);
				trace_lazy = () -> SecuritiesTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionReport4";
				definition = "Details of the securities transaction report.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max52Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesTransactionReport4 setTransactionIdentification(Max52Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public LEIIdentifier getExecutingParty() {
		return executingParty;
	}

	public SecuritiesTransactionReport4 setExecutingParty(LEIIdentifier executingParty) {
		this.executingParty = Objects.requireNonNull(executingParty);
		return this;
	}

	public TrueFalseIndicator getInvestmentPartyIndicator() {
		return investmentPartyIndicator;
	}

	public SecuritiesTransactionReport4 setInvestmentPartyIndicator(TrueFalseIndicator investmentPartyIndicator) {
		this.investmentPartyIndicator = Objects.requireNonNull(investmentPartyIndicator);
		return this;
	}

	public LEIIdentifier getSubmittingParty() {
		return submittingParty;
	}

	public SecuritiesTransactionReport4 setSubmittingParty(LEIIdentifier submittingParty) {
		this.submittingParty = Objects.requireNonNull(submittingParty);
		return this;
	}

	public PartyIdentification79 getBuyer() {
		return buyer;
	}

	public SecuritiesTransactionReport4 setBuyer(PartyIdentification79 buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public PartyIdentification79 getSeller() {
		return seller;
	}

	public SecuritiesTransactionReport4 setSeller(PartyIdentification79 seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public SecuritiesTransactionTransmission2 getOrderTransmission() {
		return orderTransmission;
	}

	public SecuritiesTransactionReport4 setOrderTransmission(SecuritiesTransactionTransmission2 orderTransmission) {
		this.orderTransmission = Objects.requireNonNull(orderTransmission);
		return this;
	}

	public SecuritiesTransaction1 getTransaction() {
		return transaction;
	}

	public SecuritiesTransactionReport4 setTransaction(SecuritiesTransaction1 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}

	public FinancialInstrumentAttributes3Choice getFinancialInstrument() {
		return financialInstrument;
	}

	public SecuritiesTransactionReport4 setFinancialInstrument(FinancialInstrumentAttributes3Choice financialInstrument) {
		this.financialInstrument = Objects.requireNonNull(financialInstrument);
		return this;
	}

	public Optional<InvestmentParty1Choice> getInvestmentDecisionPerson() {
		return investmentDecisionPerson == null ? Optional.empty() : Optional.of(investmentDecisionPerson);
	}

	public SecuritiesTransactionReport4 setInvestmentDecisionPerson(InvestmentParty1Choice investmentDecisionPerson) {
		this.investmentDecisionPerson = investmentDecisionPerson;
		return this;
	}

	public ExecutingParty1Choice getExecutingPerson() {
		return executingPerson;
	}

	public SecuritiesTransactionReport4 setExecutingPerson(ExecutingParty1Choice executingPerson) {
		this.executingPerson = Objects.requireNonNull(executingPerson);
		return this;
	}

	public SecuritiesTransactionIndicator2 getAdditionalAttributes() {
		return additionalAttributes;
	}

	public SecuritiesTransactionReport4 setAdditionalAttributes(SecuritiesTransactionIndicator2 additionalAttributes) {
		this.additionalAttributes = Objects.requireNonNull(additionalAttributes);
		return this;
	}

	public Optional<RecordTechnicalData1> getTechnicalAttributes() {
		return technicalAttributes == null ? Optional.empty() : Optional.of(technicalAttributes);
	}

	public SecuritiesTransactionReport4 setTechnicalAttributes(RecordTechnicalData1 technicalAttributes) {
		this.technicalAttributes = technicalAttributes;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesTransactionReport4 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}