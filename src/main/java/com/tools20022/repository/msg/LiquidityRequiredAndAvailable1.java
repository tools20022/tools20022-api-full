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
import com.tools20022.repository.codeset.SettlementDate6Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Obligations of a legal entity or other financial construct that must be met
 * in cash and the resources such legal entity of financial construct has
 * available to meet those obligations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityRequiredAndAvailable1#mmLiquidResources
 * LiquidityRequiredAndAvailable1.mmLiquidResources}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityRequiredAndAvailable1#mmLiquidityHorizon
 * LiquidityRequiredAndAvailable1.mmLiquidityHorizon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityRequiredAndAvailable1#mmStressLiquidResourceRequirementAmount
 * LiquidityRequiredAndAvailable1.mmStressLiquidResourceRequirementAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLiquidityHorizonRule#forLiquidityRequiredAndAvailable1
 * ConstraintLiquidityHorizonRule.forLiquidityRequiredAndAvailable1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityRequiredAndAvailable1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligations of a legal entity or other financial construct that must be met in cash and the resources such legal entity of financial construct has available to meet those obligations."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LiquidityRequiredAndAvailable1", propOrder = {"liquidResources", "liquidityHorizon", "stressLiquidResourceRequirementAmount"})
public class LiquidityRequiredAndAvailable1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LqdRsrcs", required = true)
	protected LiquidResources1 liquidResources;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LiquidResources1
	 * LiquidResources1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityRequiredAndAvailable1
	 * LiquidityRequiredAndAvailable1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdRsrcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidResources"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flows of resources that are estimated to be available to the CCP on each day of the reporting horizon. That is, balances as of close‐of‐business on day ‘T‐1’, then flows from day ‘T’ of the default to ‘T+5 onwards’.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLiquidResources = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityRequiredAndAvailable1.mmObject();
			isDerived = false;
			xmlTag = "LqdRsrcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidResources";
			definition = "Flows of resources that are estimated to be available to the CCP on each day of the reporting horizon. That is, balances as of close‐of‐business on day ‘T‐1’, then flows from day ‘T’ of the default to ‘T+5 onwards’.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LiquidResources1.mmObject();
		}
	};
	@XmlElement(name = "LqdtyHrzn", required = true)
	protected SettlementDate6Code liquidityHorizon;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate6Code
	 * SettlementDate6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityRequiredAndAvailable1
	 * LiquidityRequiredAndAvailable1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyHrzn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityHorizon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period of reporting of liquidity requirements and resources relative to a set date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLiquidityHorizon = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityRequiredAndAvailable1.mmObject();
			isDerived = false;
			xmlTag = "LqdtyHrzn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityHorizon";
			definition = "Period of reporting of liquidity requirements and resources relative to a set date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementDate6Code.mmObject();
		}
	};
	@XmlElement(name = "StrssLqdRsrcRqrmntAmt", required = true)
	protected StressLiquidResourceRequirementAmount1 stressLiquidResourceRequirementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1
	 * StressLiquidResourceRequirementAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityRequiredAndAvailable1
	 * LiquidityRequiredAndAvailable1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrssLqdRsrcRqrmntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StressLiquidResourceRequirementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total expected liquidity need under Scenario ID for the relevant currency over each day of the horizon from day T onwards.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStressLiquidResourceRequirementAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityRequiredAndAvailable1.mmObject();
			isDerived = false;
			xmlTag = "StrssLqdRsrcRqrmntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StressLiquidResourceRequirementAmount";
			definition = "Total expected liquidity need under Scenario ID for the relevant currency over each day of the horizon from day T onwards.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityRequiredAndAvailable1.mmLiquidResources, com.tools20022.repository.msg.LiquidityRequiredAndAvailable1.mmLiquidityHorizon,
						com.tools20022.repository.msg.LiquidityRequiredAndAvailable1.mmStressLiquidResourceRequirementAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLiquidityHorizonRule.forLiquidityRequiredAndAvailable1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidityRequiredAndAvailable1";
				definition = "Obligations of a legal entity or other financial construct that must be met in cash and the resources such legal entity of financial construct has available to meet those obligations.";
			}
		});
		return mmObject_lazy.get();
	}

	public LiquidResources1 getLiquidResources() {
		return liquidResources;
	}

	public LiquidityRequiredAndAvailable1 setLiquidResources(com.tools20022.repository.msg.LiquidResources1 liquidResources) {
		this.liquidResources = Objects.requireNonNull(liquidResources);
		return this;
	}

	public SettlementDate6Code getLiquidityHorizon() {
		return liquidityHorizon;
	}

	public LiquidityRequiredAndAvailable1 setLiquidityHorizon(SettlementDate6Code liquidityHorizon) {
		this.liquidityHorizon = Objects.requireNonNull(liquidityHorizon);
		return this;
	}

	public StressLiquidResourceRequirementAmount1 getStressLiquidResourceRequirementAmount() {
		return stressLiquidResourceRequirementAmount;
	}

	public LiquidityRequiredAndAvailable1 setStressLiquidResourceRequirementAmount(com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1 stressLiquidResourceRequirementAmount) {
		this.stressLiquidResourceRequirementAmount = Objects.requireNonNull(stressLiquidResourceRequirementAmount);
		return this;
	}
}