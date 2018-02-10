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
import com.tools20022.repository.area.auth.CCPLiquidityStressTestingResultReportV01;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
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
 * Results of a scenario used to test whether a legal entity or other financial
 * construct has sufficient liquid resources to meet its obligations as they
 * arise.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityStressTestResult1#mmIdentification
 * LiquidityStressTestResult1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityStressTestResult1#mmScenarioDefaulters
 * LiquidityStressTestResult1.mmScenarioDefaulters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityStressTestResult1#mmLiquidityRequiredAndAvailable
 * LiquidityStressTestResult1.mmLiquidityRequiredAndAvailable}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPLiquidityStressTestingResultReportV01#mmLiquidityStressTestResult
 * CCPLiquidityStressTestingResultReportV01.mmLiquidityStressTestResult}</li>
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
 * "LiquidityStressTestResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Results of a scenario used to test whether a legal entity or other financial construct has sufficient liquid resources to meet its obligations as they arise."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LiquidityStressTestResult1", propOrder = {"identification", "scenarioDefaulters", "liquidityRequiredAndAvailable"})
public class LiquidityStressTestResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityStressTestResult1
	 * LiquidityStressTestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CCP’s internal unique identifier of the stress scenario that generates the reported liquidity need.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityStressTestResult1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "CCP’s internal unique identifier of the stress scenario that generates the reported liquidity need.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ScnroDfltrs", required = true)
	protected CoverTwoDefaulters1 scenarioDefaulters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CoverTwoDefaulters1
	 * CoverTwoDefaulters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityStressTestResult1
	 * LiquidityStressTestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScnroDfltrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScenarioDefaulters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of assumed defaulters under the stress scenario."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmScenarioDefaulters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityStressTestResult1.mmObject();
			isDerived = false;
			xmlTag = "ScnroDfltrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScenarioDefaulters";
			definition = "Identification of assumed defaulters under the stress scenario.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CoverTwoDefaulters1.mmObject();
		}
	};
	@XmlElement(name = "LqdtyReqrdAndAvlbl", required = true)
	protected List<com.tools20022.repository.msg.LiquidityRequiredAndAvailable1> liquidityRequiredAndAvailable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityRequiredAndAvailable1
	 * LiquidityRequiredAndAvailable1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityStressTestResult1
	 * LiquidityStressTestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyReqrdAndAvlbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityRequiredAndAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the stressed resources and liquidity requirements under the liquidity stres test. The balance of resources are reported as of day ‘T‐1’. The requirements and any flows of resources are reported on their respective day from day ’ T’ to ‘T+5'."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLiquidityRequiredAndAvailable = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityStressTestResult1.mmObject();
			isDerived = false;
			xmlTag = "LqdtyReqrdAndAvlbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityRequiredAndAvailable";
			definition = "Indicates the stressed resources and liquidity requirements under the liquidity stres test. The balance of resources are reported as of day ‘T‐1’. The requirements and any flows of resources are reported on their respective day from day ’ T’ to ‘T+5'.";
			maxOccurs = 7;
			minOccurs = 7;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LiquidityRequiredAndAvailable1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityStressTestResult1.mmIdentification, com.tools20022.repository.msg.LiquidityStressTestResult1.mmScenarioDefaulters,
						com.tools20022.repository.msg.LiquidityStressTestResult1.mmLiquidityRequiredAndAvailable);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPLiquidityStressTestingResultReportV01.mmLiquidityStressTestResult);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidityStressTestResult1";
				definition = "Results of a scenario used to test whether a legal entity or other financial construct has sufficient liquid resources to meet its obligations as they arise.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public LiquidityStressTestResult1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CoverTwoDefaulters1 getScenarioDefaulters() {
		return scenarioDefaulters;
	}

	public LiquidityStressTestResult1 setScenarioDefaulters(com.tools20022.repository.msg.CoverTwoDefaulters1 scenarioDefaulters) {
		this.scenarioDefaulters = Objects.requireNonNull(scenarioDefaulters);
		return this;
	}

	public List<LiquidityRequiredAndAvailable1> getLiquidityRequiredAndAvailable() {
		return liquidityRequiredAndAvailable == null ? liquidityRequiredAndAvailable = new ArrayList<>() : liquidityRequiredAndAvailable;
	}

	public LiquidityStressTestResult1 setLiquidityRequiredAndAvailable(List<com.tools20022.repository.msg.LiquidityRequiredAndAvailable1> liquidityRequiredAndAvailable) {
		this.liquidityRequiredAndAvailable = Objects.requireNonNull(liquidityRequiredAndAvailable);
		return this;
	}
}