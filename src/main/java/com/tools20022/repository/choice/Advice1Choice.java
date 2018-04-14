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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvestmentFundOrderExecution3;
import com.tools20022.repository.msg.Statement9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of a cancellation advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Advice1Choice#mmOrderConfirmationAdviceDetails
 * Advice1Choice.mmOrderConfirmationAdviceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Advice1Choice#mmStatementAdviceDetails
 * Advice1Choice.mmStatementAdviceDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Advice1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of a cancellation advice."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Advice1Choice", propOrder = {"orderConfirmationAdviceDetails", "statementAdviceDetails"})
public class Advice1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrdrConfAdvcDtls", required = true)
	protected List<InvestmentFundOrderExecution3> orderConfirmationAdviceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3
	 * InvestmentFundOrderExecution3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Advice1Choice Advice1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrConfAdvcDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderConfirmationAdviceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference and transaction details of the order confirmation for which the cancellation is given."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Advice1Choice, List<InvestmentFundOrderExecution3>> mmOrderConfirmationAdviceDetails = new MMMessageAssociationEnd<Advice1Choice, List<InvestmentFundOrderExecution3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Advice1Choice.mmObject();
			isDerived = false;
			xmlTag = "OrdrConfAdvcDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderConfirmationAdviceDetails";
			definition = "Reference and transaction details of the order confirmation for which the cancellation is given.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentFundOrderExecution3.mmObject();
		}

		@Override
		public List<InvestmentFundOrderExecution3> getValue(Advice1Choice obj) {
			return obj.getOrderConfirmationAdviceDetails();
		}

		@Override
		public void setValue(Advice1Choice obj, List<InvestmentFundOrderExecution3> value) {
			obj.setOrderConfirmationAdviceDetails(value);
		}
	};
	@XmlElement(name = "StmtAdvcDtls", required = true)
	protected Statement9 statementAdviceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Statement9 Statement9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Advice1Choice Advice1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtAdvcDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementAdviceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference and transaction details of the statement for which the cancellation is given."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Advice1Choice, Statement9> mmStatementAdviceDetails = new MMMessageAssociationEnd<Advice1Choice, Statement9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Advice1Choice.mmObject();
			isDerived = false;
			xmlTag = "StmtAdvcDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementAdviceDetails";
			definition = "Reference and transaction details of the statement for which the cancellation is given.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Statement9.mmObject();
		}

		@Override
		public Statement9 getValue(Advice1Choice obj) {
			return obj.getStatementAdviceDetails();
		}

		@Override
		public void setValue(Advice1Choice obj, Statement9 value) {
			obj.setStatementAdviceDetails(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Advice1Choice.mmOrderConfirmationAdviceDetails, com.tools20022.repository.choice.Advice1Choice.mmStatementAdviceDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Advice1Choice";
				definition = "Choice of a cancellation advice.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<InvestmentFundOrderExecution3> getOrderConfirmationAdviceDetails() {
		return orderConfirmationAdviceDetails == null ? orderConfirmationAdviceDetails = new ArrayList<>() : orderConfirmationAdviceDetails;
	}

	public Advice1Choice setOrderConfirmationAdviceDetails(List<InvestmentFundOrderExecution3> orderConfirmationAdviceDetails) {
		this.orderConfirmationAdviceDetails = Objects.requireNonNull(orderConfirmationAdviceDetails);
		return this;
	}

	public Statement9 getStatementAdviceDetails() {
		return statementAdviceDetails;
	}

	public Advice1Choice setStatementAdviceDetails(Statement9 statementAdviceDetails) {
		this.statementAdviceDetails = Objects.requireNonNull(statementAdviceDetails);
		return this;
	}
}