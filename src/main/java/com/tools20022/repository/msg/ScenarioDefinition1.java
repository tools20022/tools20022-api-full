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
import com.tools20022.repository.area.auth.CCPPortfolioStressTestingDefinitionReportV01;
import com.tools20022.repository.codeset.ScenarioType1Code;
import com.tools20022.repository.codeset.StrategyStressType1Code;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics used to describe a hypothetical scenario designed to test the
 * value of a portfolio of financial instruments under such hypothetical
 * scenario.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1#mmIdentification
 * ScenarioDefinition1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1#mmScenarioType
 * ScenarioDefinition1.mmScenarioType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1#mmStrategyStressType
 * ScenarioDefinition1.mmStrategyStressType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1#mmStressItem
 * ScenarioDefinition1.mmStressItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1#mmDescription
 * ScenarioDefinition1.mmDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPPortfolioStressTestingDefinitionReportV01#mmScenarioDefinition
 * CCPPortfolioStressTestingDefinitionReportV01.mmScenarioDefinition}</li>
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
 * "ScenarioDefinition1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics used to describe a hypothetical scenario designed to test the value of a portfolio of financial instruments under such hypothetical scenario."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ScenarioDefinition1", propOrder = {"identification", "scenarioType", "strategyStressType", "stressItem", "description"})
public class ScenarioDefinition1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected GenericIdentification166 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification166
	 * GenericIdentification166}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1
	 * ScenarioDefinition1}</li>
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
	 * definition} = "Identification of the stress scenario."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScenarioDefinition1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the stress scenario.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification166.mmObject();
		}
	};
	@XmlElement(name = "ScnroTp", required = true)
	protected ScenarioType1Code scenarioType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ScenarioType1Code
	 * ScenarioType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1
	 * ScenarioDefinition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScnroTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScenarioType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the scenario is based on a historical event or a hypothetical scenario."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmScenarioType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScenarioDefinition1.mmObject();
			isDerived = false;
			xmlTag = "ScnroTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScenarioType";
			definition = "Indicates whether the scenario is based on a historical event or a hypothetical scenario.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ScenarioType1Code.mmObject();
		}
	};
	@XmlElement(name = "StrtgyStrssTp", required = true)
	protected StrategyStressType1Code strategyStressType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StrategyStressType1Code
	 * StrategyStressType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1
	 * ScenarioDefinition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtgyStrssTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrategyStressType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates how the scenario stresses the curve."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStrategyStressType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScenarioDefinition1.mmObject();
			isDerived = false;
			xmlTag = "StrtgyStrssTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrategyStressType";
			definition = "Indicates how the scenario stresses the curve.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StrategyStressType1Code.mmObject();
		}
	};
	@XmlElement(name = "StrssItm", required = true)
	protected List<com.tools20022.repository.msg.StressItem1> stressItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StressItem1
	 * StressItem1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1
	 * ScenarioDefinition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrssItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StressItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information relating to the one / two major representative product(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStressItem = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScenarioDefinition1.mmObject();
			isDerived = false;
			xmlTag = "StrssItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StressItem";
			definition = "Information relating to the one / two major representative product(s).";
			maxOccurs = 2;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StressItem1.mmObject();
		}
	};
	@XmlElement(name = "Desc")
	protected Max2000Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScenarioDefinition1
	 * ScenarioDefinition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Long description of the scenario."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScenarioDefinition1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Long description of the scenario.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ScenarioDefinition1.mmIdentification, com.tools20022.repository.msg.ScenarioDefinition1.mmScenarioType,
						com.tools20022.repository.msg.ScenarioDefinition1.mmStrategyStressType, com.tools20022.repository.msg.ScenarioDefinition1.mmStressItem, com.tools20022.repository.msg.ScenarioDefinition1.mmDescription);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPPortfolioStressTestingDefinitionReportV01.mmScenarioDefinition);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ScenarioDefinition1";
				definition = "Characteristics used to describe a hypothetical scenario designed to test the value of a portfolio of financial instruments under such hypothetical scenario.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification166 getIdentification() {
		return identification;
	}

	public ScenarioDefinition1 setIdentification(com.tools20022.repository.msg.GenericIdentification166 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ScenarioType1Code getScenarioType() {
		return scenarioType;
	}

	public ScenarioDefinition1 setScenarioType(ScenarioType1Code scenarioType) {
		this.scenarioType = Objects.requireNonNull(scenarioType);
		return this;
	}

	public StrategyStressType1Code getStrategyStressType() {
		return strategyStressType;
	}

	public ScenarioDefinition1 setStrategyStressType(StrategyStressType1Code strategyStressType) {
		this.strategyStressType = Objects.requireNonNull(strategyStressType);
		return this;
	}

	public List<StressItem1> getStressItem() {
		return stressItem == null ? stressItem = new ArrayList<>() : stressItem;
	}

	public ScenarioDefinition1 setStressItem(List<com.tools20022.repository.msg.StressItem1> stressItem) {
		this.stressItem = Objects.requireNonNull(stressItem);
		return this;
	}

	public Optional<Max2000Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public ScenarioDefinition1 setDescription(Max2000Text description) {
		this.description = description;
		return this;
	}
}