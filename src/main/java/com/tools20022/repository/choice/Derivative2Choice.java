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
import com.tools20022.repository.codeset.EmissionAllowanceProductType1Code;
import com.tools20022.repository.entity.CreditDefaultSwap;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.Future;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Derivative2Choice", propOrder = {"commodity", "interestRate", "foreignExchange", "equity", "contractForDifference", "credit", "emissionAllowance"})
public class Derivative2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CommodityDerivate4 commodity;
	/**
	 * Details specific for commodity derivatives.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCommodity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> Derivative2Choice.mmObject();
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
	};
	protected InterestRateDerivative5 interestRate;
	/**
	 * Details specific for Interest rate.
	 * <p>
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
	public static final MMMessageAssociationEnd mmInterestRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> Derivative2Choice.mmObject();
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
	};
	protected ForeignExchangeDerivative2 foreignExchange;
	/**
	 * Details specific for Foreign exchange.
	 * <p>
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
	public static final MMMessageAssociationEnd mmForeignExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> Derivative2Choice.mmObject();
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
	};
	protected EquityDerivative2 equity;
	/**
	 * Details specific for Equity derivatives.
	 * <p>
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
	public static final MMMessageAssociationEnd mmEquity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> Derivative2Choice.mmObject();
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
	};
	protected ContractForDifference2 contractForDifference;
	/**
	 * Details specific for Contract for difference (CFDs).
	 * <p>
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
	public static final MMMessageAssociationEnd mmContractForDifference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Future.mmObject();
			componentContext_lazy = () -> Derivative2Choice.mmObject();
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
	};
	protected CreditDefaultSwapsDerivative3Choice credit;
	/**
	 * Details specific for a credit derivative.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCredit = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditDefaultSwap.mmObject();
			componentContext_lazy = () -> Derivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "Cdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			definition = "Details specific for a credit derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice.mmObject();
		}
	};
	protected EmissionAllowanceProductType1Code emissionAllowance;
	/**
	 * Details specific for emission allowance derivatives
	 * <p>
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
	 * definition} = "Details specific for emission allowance derivatives"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEmissionAllowance = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Derivative.mmObject();
			componentContext_lazy = () -> Derivative2Choice.mmObject();
			isDerived = false;
			xmlTag = "EmssnAllwnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowance";
			definition = "Details specific for emission allowance derivatives";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EmissionAllowanceProductType1Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Derivative2Choice.mmCommodity, Derivative2Choice.mmInterestRate, Derivative2Choice.mmForeignExchange, Derivative2Choice.mmEquity, Derivative2Choice.mmContractForDifference,
						Derivative2Choice.mmCredit, Derivative2Choice.mmEmissionAllowance);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Derivative2Choice";
				definition = "Choice element to define a derivative instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Cmmdty", required = true)
	public CommodityDerivate4 getCommodity() {
		return commodity;
	}

	public void setCommodity(CommodityDerivate4 commodity) {
		this.commodity = commodity;
	}

	@XmlElement(name = "IntrstRate", required = true)
	public InterestRateDerivative5 getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(InterestRateDerivative5 interestRate) {
		this.interestRate = interestRate;
	}

	@XmlElement(name = "FX", required = true)
	public ForeignExchangeDerivative2 getForeignExchange() {
		return foreignExchange;
	}

	public void setForeignExchange(ForeignExchangeDerivative2 foreignExchange) {
		this.foreignExchange = foreignExchange;
	}

	@XmlElement(name = "Eqty", required = true)
	public EquityDerivative2 getEquity() {
		return equity;
	}

	public void setEquity(EquityDerivative2 equity) {
		this.equity = equity;
	}

	@XmlElement(name = "CtrctForDiff", required = true)
	public ContractForDifference2 getContractForDifference() {
		return contractForDifference;
	}

	public void setContractForDifference(ContractForDifference2 contractForDifference) {
		this.contractForDifference = contractForDifference;
	}

	@XmlElement(name = "Cdt", required = true)
	public CreditDefaultSwapsDerivative3Choice getCredit() {
		return credit;
	}

	public void setCredit(com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice credit) {
		this.credit = credit;
	}

	@XmlElement(name = "EmssnAllwnc", required = true)
	public EmissionAllowanceProductType1Code getEmissionAllowance() {
		return emissionAllowance;
	}

	public void setEmissionAllowance(EmissionAllowanceProductType1Code emissionAllowance) {
		this.emissionAllowance = emissionAllowance;
	}
}