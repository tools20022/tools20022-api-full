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
import com.tools20022.repository.choice.CustomerHandlingInstructionChoice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the single order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleOrder1#mmManualOrderIndicator
 * SingleOrder1.mmManualOrderIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleOrder1#mmDirectedOrder
 * SingleOrder1.mmDirectedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleOrder1#mmReceivedDepartment
 * SingleOrder1.mmReceivedDepartment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleOrder1#mmCustomerHandlingInstruction
 * SingleOrder1.mmCustomerHandlingInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleOrder1#mmOrderDetails
 * SingleOrder1.mmOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleOrder1#mmSpreadAndBenchmarkCurveDetails
 * SingleOrder1.mmSpreadAndBenchmarkCurveDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleOrder1#mmYieldDetails
 * SingleOrder1.mmYieldDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleOrder1#mmTwoLegTransactionDetails
 * SingleOrder1.mmTwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleOrder1#mmTradeRegulatoryTimeStampsDetails
 * SingleOrder1.mmTradeRegulatoryTimeStampsDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SingleOrder1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about the single order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SingleOrder1", propOrder = {"manualOrderIndicator", "directedOrder", "receivedDepartment", "customerHandlingInstruction", "orderDetails", "spreadAndBenchmarkCurveDetails", "yieldDetails", "twoLegTransactionDetails",
		"tradeRegulatoryTimeStampsDetails"})
public class SingleOrder1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MnlOrdrInd")
	protected YesNoIndicator manualOrderIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmManualOrderIndicator
	 * SecuritiesOrderParameters.mmManualOrderIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleOrder1 SingleOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnlOrdrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1028</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the order was initially received manually (as opposed to electronically)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmManualOrderIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmManualOrderIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleOrder1.mmObject();
			isDerived = false;
			xmlTag = "MnlOrdrInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1028"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualOrderIndicator";
			definition = "Indicates if the order was initially received manually (as opposed to electronically).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DrctdOrdr")
	protected YesNoIndicator directedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmDirectedOrder
	 * SecuritiesOrderParameters.mmDirectedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleOrder1 SingleOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctdOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1029</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the customer directed this order to a specific execution venue (Y) or not (N)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDirectedOrder = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmDirectedOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleOrder1.mmObject();
			isDerived = false;
			xmlTag = "DrctdOrdr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1029"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectedOrder";
			definition = "Indicates if the customer directed this order to a specific execution venue (Y) or not (N).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "RcvdDptmt")
	protected Max35Text receivedDepartment;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmReceivedDepartment
	 * SecuritiesOrderParameters.mmReceivedDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleOrder1 SingleOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdDptmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1030</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedDepartment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the Broker / Dealer Department that first took the order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivedDepartment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmReceivedDepartment;
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleOrder1.mmObject();
			isDerived = false;
			xmlTag = "RcvdDptmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1030"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedDepartment";
			definition = "Identifies the Broker / Dealer Department that first took the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CstmrHdlgInstr")
	protected CustomerHandlingInstructionChoice customerHandlingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CustomerHandlingInstructionChoice
	 * CustomerHandlingInstructionChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmCustomerHandlingInstruction
	 * SecuritiesOrderParameters.mmCustomerHandlingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleOrder1 SingleOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrHdlgInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1032</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerHandlingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerHandlingInstruction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmCustomerHandlingInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleOrder1.mmObject();
			isDerived = false;
			xmlTag = "CstmrHdlgInstr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1032"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerHandlingInstruction";
			definition = "Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CustomerHandlingInstructionChoice.mmObject();
		}
	};
	@XmlElement(name = "OrdrDtls", required = true)
	protected Order3 orderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Order3 Order3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleOrder1 SingleOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides order details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleOrder1.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetails";
			definition = "Provides order details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Order3.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleOrder1 SingleOrder1}</li>
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
			businessComponentTrace_lazy = () -> Spread.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleOrder1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SingleOrder1 SingleOrder1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleOrder1.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleOrder1 SingleOrder1}</li>
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
	 * definition} = "Provides details about the two leg transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTwoLegTransactionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesFinancing.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleOrder1.mmObject();
			isDerived = false;
			xmlTag = "TwoLegTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionDetails";
			definition = "Provides details about the two leg transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancing1.mmObject();
		}
	};
	@XmlElement(name = "TradRgltryTmStmpsDtls")
	protected TradeRegulatoryTimeStampGroup tradeRegulatoryTimeStampsDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup
	 * TradeRegulatoryTimeStampGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleOrder1 SingleOrder1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRgltryTmStmpsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulatoryTimeStampsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the time the order was received and executed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeRegulatoryTimeStampsDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleOrder1.mmObject();
			isDerived = false;
			xmlTag = "TradRgltryTmStmpsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulatoryTimeStampsDetails";
			definition = "Provides details about the time the order was received and executed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleOrder1.mmManualOrderIndicator, com.tools20022.repository.msg.SingleOrder1.mmDirectedOrder,
						com.tools20022.repository.msg.SingleOrder1.mmReceivedDepartment, com.tools20022.repository.msg.SingleOrder1.mmCustomerHandlingInstruction, com.tools20022.repository.msg.SingleOrder1.mmOrderDetails,
						com.tools20022.repository.msg.SingleOrder1.mmSpreadAndBenchmarkCurveDetails, com.tools20022.repository.msg.SingleOrder1.mmYieldDetails, com.tools20022.repository.msg.SingleOrder1.mmTwoLegTransactionDetails,
						com.tools20022.repository.msg.SingleOrder1.mmTradeRegulatoryTimeStampsDetails);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SingleOrder1";
				definition = "Provides details about the single order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getManualOrderIndicator() {
		return manualOrderIndicator == null ? Optional.empty() : Optional.of(manualOrderIndicator);
	}

	public SingleOrder1 setManualOrderIndicator(YesNoIndicator manualOrderIndicator) {
		this.manualOrderIndicator = manualOrderIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getDirectedOrder() {
		return directedOrder == null ? Optional.empty() : Optional.of(directedOrder);
	}

	public SingleOrder1 setDirectedOrder(YesNoIndicator directedOrder) {
		this.directedOrder = directedOrder;
		return this;
	}

	public Optional<Max35Text> getReceivedDepartment() {
		return receivedDepartment == null ? Optional.empty() : Optional.of(receivedDepartment);
	}

	public SingleOrder1 setReceivedDepartment(Max35Text receivedDepartment) {
		this.receivedDepartment = receivedDepartment;
		return this;
	}

	public Optional<CustomerHandlingInstructionChoice> getCustomerHandlingInstruction() {
		return customerHandlingInstruction == null ? Optional.empty() : Optional.of(customerHandlingInstruction);
	}

	public SingleOrder1 setCustomerHandlingInstruction(CustomerHandlingInstructionChoice customerHandlingInstruction) {
		this.customerHandlingInstruction = customerHandlingInstruction;
		return this;
	}

	public Order3 getOrderDetails() {
		return orderDetails;
	}

	public SingleOrder1 setOrderDetails(com.tools20022.repository.msg.Order3 orderDetails) {
		this.orderDetails = Objects.requireNonNull(orderDetails);
		return this;
	}

	public Optional<BenchmarkCurve1> getSpreadAndBenchmarkCurveDetails() {
		return spreadAndBenchmarkCurveDetails == null ? Optional.empty() : Optional.of(spreadAndBenchmarkCurveDetails);
	}

	public SingleOrder1 setSpreadAndBenchmarkCurveDetails(com.tools20022.repository.msg.BenchmarkCurve1 spreadAndBenchmarkCurveDetails) {
		this.spreadAndBenchmarkCurveDetails = spreadAndBenchmarkCurveDetails;
		return this;
	}

	public Optional<YieldCalculation1> getYieldDetails() {
		return yieldDetails == null ? Optional.empty() : Optional.of(yieldDetails);
	}

	public SingleOrder1 setYieldDetails(com.tools20022.repository.msg.YieldCalculation1 yieldDetails) {
		this.yieldDetails = yieldDetails;
		return this;
	}

	public Optional<SecuritiesFinancing1> getTwoLegTransactionDetails() {
		return twoLegTransactionDetails == null ? Optional.empty() : Optional.of(twoLegTransactionDetails);
	}

	public SingleOrder1 setTwoLegTransactionDetails(com.tools20022.repository.msg.SecuritiesFinancing1 twoLegTransactionDetails) {
		this.twoLegTransactionDetails = twoLegTransactionDetails;
		return this;
	}

	public Optional<TradeRegulatoryTimeStampGroup> getTradeRegulatoryTimeStampsDetails() {
		return tradeRegulatoryTimeStampsDetails == null ? Optional.empty() : Optional.of(tradeRegulatoryTimeStampsDetails);
	}

	public SingleOrder1 setTradeRegulatoryTimeStampsDetails(com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup tradeRegulatoryTimeStampsDetails) {
		this.tradeRegulatoryTimeStampsDetails = tradeRegulatoryTimeStampsDetails;
		return this;
	}
}