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
import com.tools20022.repository.msg.Derivative3;
import com.tools20022.repository.msg.FinancialInstrument59;
import com.tools20022.repository.msg.RepurchaseAgreement3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the choice between the major categories of financial instruments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Product1Choice#mmDerivative
 * Product1Choice.mmDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Product1Choice#mmSecuritiesFinancingTransaction
 * Product1Choice.mmSecuritiesFinancingTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Product1Choice#mmSecurity
 * Product1Choice.mmSecurity}</li>
 * </ul>
 * </li>
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
 * "Product1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the choice between the major categories of financial instruments."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Product1Choice", propOrder = {"derivative", "securitiesFinancingTransaction", "security"})
public class Product1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Deriv", required = true)
	protected Derivative3 derivative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Derivative3
	 * Derivative3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Product1Choice
	 * Product1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Deriv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Derivative specific attributes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Product1Choice, Derivative3> mmDerivative = new MMMessageAssociationEnd<Product1Choice, Derivative3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Product1Choice.mmObject();
			isDerived = false;
			xmlTag = "Deriv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Derivative";
			definition = "Derivative specific attributes.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Derivative3.mmObject();
		}

		@Override
		public Derivative3 getValue(Product1Choice obj) {
			return obj.getDerivative();
		}

		@Override
		public void setValue(Product1Choice obj, Derivative3 value) {
			obj.setDerivative(value);
		}
	};
	@XmlElement(name = "SctiesFincgTx", required = true)
	protected RepurchaseAgreement3 securitiesFinancingTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RepurchaseAgreement3
	 * RepurchaseAgreement3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Product1Choice
	 * Product1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Attributes relating to repurchase agreement cleared by the CCP.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Product1Choice, RepurchaseAgreement3> mmSecuritiesFinancingTransaction = new MMMessageAssociationEnd<Product1Choice, RepurchaseAgreement3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Product1Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTransaction";
			definition = "Attributes relating to repurchase agreement cleared by the CCP.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepurchaseAgreement3.mmObject();
		}

		@Override
		public RepurchaseAgreement3 getValue(Product1Choice obj) {
			return obj.getSecuritiesFinancingTransaction();
		}

		@Override
		public void setValue(Product1Choice obj, RepurchaseAgreement3 value) {
			obj.setSecuritiesFinancingTransaction(value);
		}
	};
	@XmlElement(name = "Scty", required = true)
	protected FinancialInstrument59 security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument59
	 * FinancialInstrument59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Product1Choice
	 * Product1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attributes relating to cleared securities.\r\n\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Product1Choice, FinancialInstrument59> mmSecurity = new MMMessageAssociationEnd<Product1Choice, FinancialInstrument59>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Product1Choice.mmObject();
			isDerived = false;
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Attributes relating to cleared securities.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument59.mmObject();
		}

		@Override
		public FinancialInstrument59 getValue(Product1Choice obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(Product1Choice obj, FinancialInstrument59 value) {
			obj.setSecurity(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Product1Choice.mmDerivative, com.tools20022.repository.choice.Product1Choice.mmSecuritiesFinancingTransaction,
						com.tools20022.repository.choice.Product1Choice.mmSecurity);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Product1Choice";
				definition = "Specifies the choice between the major categories of financial instruments.";
			}
		});
		return mmObject_lazy.get();
	}

	public Derivative3 getDerivative() {
		return derivative;
	}

	public Product1Choice setDerivative(Derivative3 derivative) {
		this.derivative = Objects.requireNonNull(derivative);
		return this;
	}

	public RepurchaseAgreement3 getSecuritiesFinancingTransaction() {
		return securitiesFinancingTransaction;
	}

	public Product1Choice setSecuritiesFinancingTransaction(RepurchaseAgreement3 securitiesFinancingTransaction) {
		this.securitiesFinancingTransaction = Objects.requireNonNull(securitiesFinancingTransaction);
		return this;
	}

	public FinancialInstrument59 getSecurity() {
		return security;
	}

	public Product1Choice setSecurity(FinancialInstrument59 security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}
}