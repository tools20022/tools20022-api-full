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
import com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice;
import com.tools20022.repository.datatype.RestrictedFINMax16Text;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.entity.SubscriptionExecution;
import com.tools20022.repository.entity.TradingMarket;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Execution of a subscription order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#mmMasterReference
 * SubscriptionMultipleExecution4.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#mmPlaceOfTrade
 * SubscriptionMultipleExecution4.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#mmInvestmentAccountDetails
 * SubscriptionMultipleExecution4.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#mmIndividualExecutionDetails
 * SubscriptionMultipleExecution4.mmIndividualExecutionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SubscriptionExecution
 * SubscriptionExecution}</li>
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
 * "SubscriptionMultipleExecution4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a subscription order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SubscriptionMultipleExecution4", propOrder = {"masterReference", "placeOfTrade", "investmentAccountDetails", "individualExecutionDetails"})
public class SubscriptionMultipleExecution4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RestrictedFINMax16Text masterReference;
	/**
	 * Unique and unambiguous identifier for a group of individual orders, as
	 * assigned by the instructing party. This identifier links the individual
	 * orders together.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINMax16Text
	 * RestrictedFINMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4
	 * SubscriptionMultipleExecution4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> SubscriptionMultipleExecution4.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINMax16Text.mmObject();
		}
	};
	protected PlaceOfTradeIdentification3Choice placeOfTrade;
	/**
	 * Market in which the advised trade transaction was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice
	 * PlaceOfTradeIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4
	 * SubscriptionMultipleExecution4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market in which the advised trade transaction was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfTrade = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			componentContext_lazy = () -> SubscriptionMultipleExecution4.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which the advised trade transaction was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PlaceOfTradeIdentification3Choice.mmObject();
		}
	};
	protected InvestmentAccount33 investmentAccountDetails;
	/**
	 * Account information impacted by an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount33
	 * InvestmentAccount33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4
	 * SubscriptionMultipleExecution4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account information impacted by an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> SubscriptionMultipleExecution4.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account information impacted by an investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount33.mmObject();
		}
	};
	protected SubscriptionExecution9 individualExecutionDetails;
	/**
	 * Execution of a subscription order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubscriptionExecution9
	 * SubscriptionExecution9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4
	 * SubscriptionMultipleExecution4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvExctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualExecutionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution of a subscription order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualExecutionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SubscriptionExecution.mmObject();
			componentContext_lazy = () -> SubscriptionMultipleExecution4.mmObject();
			isDerived = false;
			xmlTag = "IndvExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualExecutionDetails";
			definition = "Execution of a subscription order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SubscriptionMultipleExecution4.mmMasterReference, SubscriptionMultipleExecution4.mmPlaceOfTrade, SubscriptionMultipleExecution4.mmInvestmentAccountDetails,
						SubscriptionMultipleExecution4.mmIndividualExecutionDetails);
				trace_lazy = () -> SubscriptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionMultipleExecution4";
				definition = "Execution of a subscription order.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MstrRef")
	public RestrictedFINMax16Text getMasterReference() {
		return masterReference;
	}

	public void setMasterReference(RestrictedFINMax16Text masterReference) {
		this.masterReference = masterReference;
	}

	@XmlElement(name = "PlcOfTrad")
	public PlaceOfTradeIdentification3Choice getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(PlaceOfTradeIdentification3Choice placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	@XmlElement(name = "InvstmtAcctDtls", required = true)
	public InvestmentAccount33 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public void setInvestmentAccountDetails(com.tools20022.repository.msg.InvestmentAccount33 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
	}

	@XmlElement(name = "IndvExctnDtls", required = true)
	public SubscriptionExecution9 getIndividualExecutionDetails() {
		return individualExecutionDetails;
	}

	public void setIndividualExecutionDetails(com.tools20022.repository.msg.SubscriptionExecution9 individualExecutionDetails) {
		this.individualExecutionDetails = individualExecutionDetails;
	}
}