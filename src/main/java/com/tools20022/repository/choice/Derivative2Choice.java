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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice;
import com.tools20022.repository.codeset.EmissionAllowanceProductType1Code;
import com.tools20022.repository.entity.CreditDefaultSwap;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.Future;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice element to define a derivative instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmCommodity
 * Derivative2Choice.mmCommodity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmInterestRate
 * Derivative2Choice.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmForeignExchange
 * Derivative2Choice.mmForeignExchange}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Derivative2Choice#mmEquity
 * Derivative2Choice.mmEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmContractForDifference
 * Derivative2Choice.mmContractForDifference}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Derivative2Choice#mmCredit
 * Derivative2Choice.mmCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmEmissionAllowance
 * Derivative2Choice.mmEmissionAllowance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "Derivative2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice element to define a derivative instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Derivative2Choice", propOrder = {"commodity", "interestRate", "foreignExchange", "equity", "contractForDifference", "credit", "emissionAllowance"})
public class Derivative2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cmmdty", required = true)
	protected CommodityDerivate4 commodity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommodityDerivate4
	 * CommodityDerivate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice
	 * Derivative2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmmdty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details specific for commodity derivatives."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Derivative2Choice, CommodityDerivate4> mmCommodity = new MMMessageAssociationEnd<Derivative2Choice, CommodityDerivate4>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.choice.Derivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmmdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Details specific for commodity derivatives.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CommodityDerivate4.mmObject();
		}

		@Override
		public CommodityDerivate4 getValue(Derivative2Choice obj) {
			return obj.getCommodity();
		}

		@Override
		public void setValue(Derivative2Choice obj, CommodityDerivate4 value) {
			obj.setCommodity(value);
		}
	};
	@XmlElement(name = "IntrstRate", required = true)
	protected InterestRateDerivative5 interestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5
	 * InterestRateDerivative5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice
	 * Derivative2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details specific for Interest rate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Derivative2Choice, InterestRateDerivative5> mmInterestRate = new MMMessageAssociationEnd<Derivative2Choice, InterestRateDerivative5>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.choice.Derivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Details specific for Interest rate.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InterestRateDerivative5.mmObject();
		}

		@Override
		public InterestRateDerivative5 getValue(Derivative2Choice obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(Derivative2Choice obj, InterestRateDerivative5 value) {
			obj.setInterestRate(value);
		}
	};
	@XmlElement(name = "FX", required = true)
	protected ForeignExchangeDerivative2 foreignExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeDerivative2
	 * ForeignExchangeDerivative2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice
	 * Derivative2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details specific for Foreign exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Derivative2Choice, ForeignExchangeDerivative2> mmForeignExchange = new MMMessageAssociationEnd<Derivative2Choice, ForeignExchangeDerivative2>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.choice.Derivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "FX";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			definition = "Details specific for Foreign exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ForeignExchangeDerivative2.mmObject();
		}

		@Override
		public ForeignExchangeDerivative2 getValue(Derivative2Choice obj) {
			return obj.getForeignExchange();
		}

		@Override
		public void setValue(Derivative2Choice obj, ForeignExchangeDerivative2 value) {
			obj.setForeignExchange(value);
		}
	};
	@XmlElement(name = "Eqty", required = true)
	protected EquityDerivative2 equity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EquityDerivative2
	 * EquityDerivative2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice
	 * Derivative2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Eqty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details specific for Equity derivatives."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Derivative2Choice, EquityDerivative2> mmEquity = new MMMessageAssociationEnd<Derivative2Choice, EquityDerivative2>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.choice.Derivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "Eqty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Details specific for Equity derivatives.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EquityDerivative2.mmObject();
		}

		@Override
		public EquityDerivative2 getValue(Derivative2Choice obj) {
			return obj.getEquity();
		}

		@Override
		public void setValue(Derivative2Choice obj, EquityDerivative2 value) {
			obj.setEquity(value);
		}
	};
	@XmlElement(name = "CtrctForDiff", required = true)
	protected ContractForDifference2 contractForDifference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractForDifference2
	 * ContractForDifference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice
	 * Derivative2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctForDiff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractForDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details specific for Contract for difference (CFDs)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Derivative2Choice, ContractForDifference2> mmContractForDifference = new MMMessageAssociationEnd<Derivative2Choice, ContractForDifference2>() {
		{
			businessComponentTrace_lazy = () -> Future.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.Derivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "CtrctForDiff";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractForDifference";
			definition = "Details specific for Contract for difference (CFDs).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ContractForDifference2.mmObject();
		}

		@Override
		public ContractForDifference2 getValue(Derivative2Choice obj) {
			return obj.getContractForDifference();
		}

		@Override
		public void setValue(Derivative2Choice obj, ContractForDifference2 value) {
			obj.setContractForDifference(value);
		}
	};
	@XmlElement(name = "Cdt", required = true)
	protected CreditDefaultSwapsDerivative3Choice credit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice
	 * CreditDefaultSwapsDerivative3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice
	 * Derivative2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details specific for a credit derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Derivative2Choice, CreditDefaultSwapsDerivative3Choice> mmCredit = new MMMessageAssociationEnd<Derivative2Choice, CreditDefaultSwapsDerivative3Choice>() {
		{
			businessComponentTrace_lazy = () -> CreditDefaultSwap.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.Derivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "Cdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			definition = "Details specific for a credit derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditDefaultSwapsDerivative3Choice.mmObject();
		}

		@Override
		public CreditDefaultSwapsDerivative3Choice getValue(Derivative2Choice obj) {
			return obj.getCredit();
		}

		@Override
		public void setValue(Derivative2Choice obj, CreditDefaultSwapsDerivative3Choice value) {
			obj.setCredit(value);
		}
	};
	@XmlElement(name = "EmssnAllwnc", required = true)
	protected EmissionAllowanceProductType1Code emissionAllowance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code
	 * EmissionAllowanceProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice
	 * Derivative2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmssnAllwnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmissionAllowance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details specific for emission allowance derivatives."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Derivative2Choice, EmissionAllowanceProductType1Code> mmEmissionAllowance = new MMMessageAttribute<Derivative2Choice, EmissionAllowanceProductType1Code>() {
		{
			businessComponentTrace_lazy = () -> Derivative.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.Derivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "EmssnAllwnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowance";
			definition = "Details specific for emission allowance derivatives.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EmissionAllowanceProductType1Code.mmObject();
		}

		@Override
		public EmissionAllowanceProductType1Code getValue(Derivative2Choice obj) {
			return obj.getEmissionAllowance();
		}

		@Override
		public void setValue(Derivative2Choice obj, EmissionAllowanceProductType1Code value) {
			obj.setEmissionAllowance(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Derivative2Choice.mmCommodity, com.tools20022.repository.choice.Derivative2Choice.mmInterestRate,
						com.tools20022.repository.choice.Derivative2Choice.mmForeignExchange, com.tools20022.repository.choice.Derivative2Choice.mmEquity, com.tools20022.repository.choice.Derivative2Choice.mmContractForDifference,
						com.tools20022.repository.choice.Derivative2Choice.mmCredit, com.tools20022.repository.choice.Derivative2Choice.mmEmissionAllowance);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Derivative2Choice";
				definition = "Choice element to define a derivative instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public CommodityDerivate4 getCommodity() {
		return commodity;
	}

	public Derivative2Choice setCommodity(CommodityDerivate4 commodity) {
		this.commodity = Objects.requireNonNull(commodity);
		return this;
	}

	public InterestRateDerivative5 getInterestRate() {
		return interestRate;
	}

	public Derivative2Choice setInterestRate(InterestRateDerivative5 interestRate) {
		this.interestRate = Objects.requireNonNull(interestRate);
		return this;
	}

	public ForeignExchangeDerivative2 getForeignExchange() {
		return foreignExchange;
	}

	public Derivative2Choice setForeignExchange(ForeignExchangeDerivative2 foreignExchange) {
		this.foreignExchange = Objects.requireNonNull(foreignExchange);
		return this;
	}

	public EquityDerivative2 getEquity() {
		return equity;
	}

	public Derivative2Choice setEquity(EquityDerivative2 equity) {
		this.equity = Objects.requireNonNull(equity);
		return this;
	}

	public ContractForDifference2 getContractForDifference() {
		return contractForDifference;
	}

	public Derivative2Choice setContractForDifference(ContractForDifference2 contractForDifference) {
		this.contractForDifference = Objects.requireNonNull(contractForDifference);
		return this;
	}

	public CreditDefaultSwapsDerivative3Choice getCredit() {
		return credit;
	}

	public Derivative2Choice setCredit(CreditDefaultSwapsDerivative3Choice credit) {
		this.credit = Objects.requireNonNull(credit);
		return this;
	}

	public EmissionAllowanceProductType1Code getEmissionAllowance() {
		return emissionAllowance;
	}

	public Derivative2Choice setEmissionAllowance(EmissionAllowanceProductType1Code emissionAllowance) {
		this.emissionAllowance = Objects.requireNonNull(emissionAllowance);
		return this;
	}
}