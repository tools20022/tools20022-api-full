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
import com.tools20022.repository.msg.RiskFactor1;
import com.tools20022.repository.msg.Strategy1;
import com.tools20022.repository.msg.StressedProduct1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the risk factor, financial instrument or set of financial
 * instruments that is stressed under a hypothetical stress scenario.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.StressItem1Choice#mmProduct
 * StressItem1Choice.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StressItem1Choice#mmStrategy
 * StressItem1Choice.mmStrategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StressItem1Choice#mmRiskFactor
 * StressItem1Choice.mmRiskFactor}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StressItem1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the risk factor, financial instrument or set of financial instruments that is stressed under a hypothetical stress scenario."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StressItem1Choice", propOrder = {"product", "strategy", "riskFactor"})
public class StressItem1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pdct", required = true)
	protected StressedProduct1 product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StressedProduct1
	 * StressedProduct1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StressItem1Choice
	 * StressItem1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification and stress size of the major representative product.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StressItem1Choice, StressedProduct1> mmProduct = new MMMessageAssociationEnd<StressItem1Choice, StressedProduct1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.StressItem1Choice.mmObject();
			isDerived = false;
			xmlTag = "Pdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Product";
			definition = "Identification and stress size of the major representative product.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> StressedProduct1.mmObject();
		}

		@Override
		public StressedProduct1 getValue(StressItem1Choice obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(StressItem1Choice obj, StressedProduct1 value) {
			obj.setProduct(value);
		}
	};
	@XmlElement(name = "Strtgy", required = true)
	protected Strategy1 strategy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Strategy1 Strategy1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StressItem1Choice
	 * StressItem1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Strtgy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Strategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assumed stress move for a set of financial instruments defined by a common trading strategy."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StressItem1Choice, Strategy1> mmStrategy = new MMMessageAssociationEnd<StressItem1Choice, Strategy1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.StressItem1Choice.mmObject();
			isDerived = false;
			xmlTag = "Strtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Strategy";
			definition = "Assumed stress move for a set of financial instruments defined by a common trading strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Strategy1.mmObject();
		}

		@Override
		public Strategy1 getValue(StressItem1Choice obj) {
			return obj.getStrategy();
		}

		@Override
		public void setValue(StressItem1Choice obj, Strategy1 value) {
			obj.setStrategy(value);
		}
	};
	@XmlElement(name = "RskFctr", required = true)
	protected RiskFactor1 riskFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RiskFactor1
	 * RiskFactor1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StressItem1Choice
	 * StressItem1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskFctr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Variable, index, benchmark or other price used in the valuation of a financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StressItem1Choice, RiskFactor1> mmRiskFactor = new MMMessageAssociationEnd<StressItem1Choice, RiskFactor1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.StressItem1Choice.mmObject();
			isDerived = false;
			xmlTag = "RskFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskFactor";
			definition = "Variable, index, benchmark or other price used in the valuation of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RiskFactor1.mmObject();
		}

		@Override
		public RiskFactor1 getValue(StressItem1Choice obj) {
			return obj.getRiskFactor();
		}

		@Override
		public void setValue(StressItem1Choice obj, RiskFactor1 value) {
			obj.setRiskFactor(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.StressItem1Choice.mmProduct, com.tools20022.repository.choice.StressItem1Choice.mmStrategy,
						com.tools20022.repository.choice.StressItem1Choice.mmRiskFactor);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StressItem1Choice";
				definition = "Specifies the risk factor, financial instrument or set of financial instruments that is stressed under a hypothetical stress scenario.";
			}
		});
		return mmObject_lazy.get();
	}

	public StressedProduct1 getProduct() {
		return product;
	}

	public StressItem1Choice setProduct(StressedProduct1 product) {
		this.product = Objects.requireNonNull(product);
		return this;
	}

	public Strategy1 getStrategy() {
		return strategy;
	}

	public StressItem1Choice setStrategy(Strategy1 strategy) {
		this.strategy = Objects.requireNonNull(strategy);
		return this;
	}

	public RiskFactor1 getRiskFactor() {
		return riskFactor;
	}

	public StressItem1Choice setRiskFactor(RiskFactor1 riskFactor) {
		this.riskFactor = Objects.requireNonNull(riskFactor);
		return this;
	}
}