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
import com.tools20022.repository.choice.ExecutingParty1Choice;
import com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice;
import com.tools20022.repository.choice.InvestmentParty1Choice;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max52Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesTransactionReport4", propOrder = {"transactionIdentification", "executingParty", "investmentPartyIndicator", "submittingParty", "buyer", "seller", "orderTransmission", "transaction", "financialInstrument",
		"investmentDecisionPerson", "executingPerson", "additionalAttributes", "technicalAttributes", "supplementaryData"})
public class SecuritiesTransactionReport4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max52Text transactionIdentification;
	/**
	 * Unique and unambiguous identification of the transaction.
	 * <p>
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
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique and unambiguous identification of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max52Text.mmObject();
		}
	};
	protected LEIIdentifier executingParty;
	/**
	 * Identification of the entity executing the transaction.
	 * <p>
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
	 * definition} = "Identification of the entity executing the transaction. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutingParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ExecutingTrader.mmObject();
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "ExctgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingParty";
			definition = "Identification of the entity executing the transaction. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected TrueFalseIndicator investmentPartyIndicator;
	/**
	 * Indicates whether the reporting party is defined as an investment firm
	 * under the local regulation or not.
	 * <p>
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
	public static final MMMessageAttribute mmInvestmentPartyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPartyIndicator";
			definition = "Indicates whether the reporting party is defined as an investment firm under the local regulation or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected LEIIdentifier submittingParty;
	/**
	 * Entity submitting the transaction report to the competent authority.
	 * <p>
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
	public static final MMMessageAttribute mmSubmittingParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SubmittingPartyRole.mmObject();
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "SubmitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingParty";
			definition = "Entity submitting the transaction report to the competent authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected PartyIdentification79 buyer;
	/**
	 * Identifies the acquirer of the legal title to the financial instrument.
	 * <p>
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
	public static final MMMessageAssociationEnd mmBuyer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Identifies the acquirer of the legal title to the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification79.mmObject();
		}
	};
	protected PartyIdentification79 seller;
	/**
	 * Identifies the seller of the legal title to the financial instrument.
	 * <p>
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
	public static final MMMessageAssociationEnd mmSeller = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SellerRole.mmObject();
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Identifies the seller of the legal title to the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification79.mmObject();
		}
	};
	protected SecuritiesTransactionTransmission2 orderTransmission;
	/**
	 * Indication as to whether the transaction results from an order
	 * transmitted by the reporting of a client to a third party.<br>
	 * <br>
	 * Usage: Only applicable when the conditions for transmission are not
	 * satisfied.
	 * <p>
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
	 * "Indication as to whether the transaction results from an order  transmitted by the reporting of a client to a third party.\r\n\r\nUsage: Only applicable when the conditions for transmission are not satisfied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderTransmission = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmRelatedOrder;
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "OrdrTrnsmssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderTransmission";
			definition = "Indication as to whether the transaction results from an order  transmitted by the reporting of a client to a third party.\r\n\r\nUsage: Only applicable when the conditions for transmission are not satisfied.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionTransmission2.mmObject();
		}
	};
	protected SecuritiesTransaction1 transaction;
	/**
	 * Provides the details of the reported transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTransaction.mmObject();
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Provides the details of the reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesTransaction1.mmObject();
		}
	};
	protected FinancialInstrumentAttributes3Choice financialInstrument;
	/**
	 * Financial instrument representing a sum of rights of the investor
	 * vis-a-vis the issuer.
	 * <p>
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
	public static final MMMessageAssociationEnd mmFinancialInstrument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
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
	};
	protected InvestmentParty1Choice investmentDecisionPerson;
	/**
	 * Identifies the person or algorithm which is responsible within the
	 * reporting party for the investment decision.
	 * <p>
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
	 * "Identifies the person or algorithm which is responsible within the reporting party for the investment decision. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentDecisionPerson = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Investor.mmObject();
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "InvstmtDcsnPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentDecisionPerson";
			definition = "Identifies the person or algorithm which is responsible within the reporting party for the investment decision. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentParty1Choice.mmObject();
		}
	};
	protected ExecutingParty1Choice executingPerson;
	/**
	 * Person or algorithm responsible for the execution of the transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmExecutingPerson = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
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
	};
	protected SecuritiesTransactionIndicator2 additionalAttributes;
	/**
	 * Provides additional indicators on the reported transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAdditionalAttributes = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "AddtlAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalAttributes";
			definition = "Provides additional indicators on the reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesTransactionIndicator2.mmObject();
		}
	};
	protected RecordTechnicalData1 technicalAttributes;
	/**
	 * Data used for exchanges between national competent authorities, not to be
	 * used by reporting entities.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTechnicalAttributes = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "TechAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAttributes";
			definition = "Data used for exchanges between national competent authorities, not to be used by reporting entities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
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
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesTransactionReport4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesTransactionReport4.mmTransactionIdentification, SecuritiesTransactionReport4.mmExecutingParty, SecuritiesTransactionReport4.mmInvestmentPartyIndicator,
						SecuritiesTransactionReport4.mmSubmittingParty, SecuritiesTransactionReport4.mmBuyer, SecuritiesTransactionReport4.mmSeller, SecuritiesTransactionReport4.mmOrderTransmission,
						SecuritiesTransactionReport4.mmTransaction, SecuritiesTransactionReport4.mmFinancialInstrument, SecuritiesTransactionReport4.mmInvestmentDecisionPerson, SecuritiesTransactionReport4.mmExecutingPerson,
						SecuritiesTransactionReport4.mmAdditionalAttributes, SecuritiesTransactionReport4.mmTechnicalAttributes, SecuritiesTransactionReport4.mmSupplementaryData);
				trace_lazy = () -> SecuritiesTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionReport4";
				definition = "Details of the securities transaction report.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public Max52Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max52Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "ExctgPty", required = true)
	public LEIIdentifier getExecutingParty() {
		return executingParty;
	}

	public void setExecutingParty(LEIIdentifier executingParty) {
		this.executingParty = executingParty;
	}

	@XmlElement(name = "InvstmtPtyInd", required = true)
	public TrueFalseIndicator getInvestmentPartyIndicator() {
		return investmentPartyIndicator;
	}

	public void setInvestmentPartyIndicator(TrueFalseIndicator investmentPartyIndicator) {
		this.investmentPartyIndicator = investmentPartyIndicator;
	}

	@XmlElement(name = "SubmitgPty", required = true)
	public LEIIdentifier getSubmittingParty() {
		return submittingParty;
	}

	public void setSubmittingParty(LEIIdentifier submittingParty) {
		this.submittingParty = submittingParty;
	}

	@XmlElement(name = "Buyr", required = true)
	public PartyIdentification79 getBuyer() {
		return buyer;
	}

	public void setBuyer(com.tools20022.repository.msg.PartyIdentification79 buyer) {
		this.buyer = buyer;
	}

	@XmlElement(name = "Sellr", required = true)
	public PartyIdentification79 getSeller() {
		return seller;
	}

	public void setSeller(com.tools20022.repository.msg.PartyIdentification79 seller) {
		this.seller = seller;
	}

	@XmlElement(name = "OrdrTrnsmssn", required = true)
	public SecuritiesTransactionTransmission2 getOrderTransmission() {
		return orderTransmission;
	}

	public void setOrderTransmission(com.tools20022.repository.msg.SecuritiesTransactionTransmission2 orderTransmission) {
		this.orderTransmission = orderTransmission;
	}

	@XmlElement(name = "Tx", required = true)
	public SecuritiesTransaction1 getTransaction() {
		return transaction;
	}

	public void setTransaction(com.tools20022.repository.msg.SecuritiesTransaction1 transaction) {
		this.transaction = transaction;
	}

	@XmlElement(name = "FinInstrm", required = true)
	public FinancialInstrumentAttributes3Choice getFinancialInstrument() {
		return financialInstrument;
	}

	public void setFinancialInstrument(FinancialInstrumentAttributes3Choice financialInstrument) {
		this.financialInstrument = financialInstrument;
	}

	@XmlElement(name = "InvstmtDcsnPrsn")
	public InvestmentParty1Choice getInvestmentDecisionPerson() {
		return investmentDecisionPerson;
	}

	public void setInvestmentDecisionPerson(InvestmentParty1Choice investmentDecisionPerson) {
		this.investmentDecisionPerson = investmentDecisionPerson;
	}

	@XmlElement(name = "ExctgPrsn", required = true)
	public ExecutingParty1Choice getExecutingPerson() {
		return executingPerson;
	}

	public void setExecutingPerson(ExecutingParty1Choice executingPerson) {
		this.executingPerson = executingPerson;
	}

	@XmlElement(name = "AddtlAttrbts", required = true)
	public SecuritiesTransactionIndicator2 getAdditionalAttributes() {
		return additionalAttributes;
	}

	public void setAdditionalAttributes(com.tools20022.repository.msg.SecuritiesTransactionIndicator2 additionalAttributes) {
		this.additionalAttributes = additionalAttributes;
	}

	@XmlElement(name = "TechAttrbts")
	public RecordTechnicalData1 getTechnicalAttributes() {
		return technicalAttributes;
	}

	public void setTechnicalAttributes(com.tools20022.repository.msg.RecordTechnicalData1 technicalAttributes) {
		this.technicalAttributes = technicalAttributes;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}